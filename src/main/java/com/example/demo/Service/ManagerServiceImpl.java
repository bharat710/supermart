package com.example.demo.Service;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Manager;
import com.example.demo.Repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService{
    
    @Autowired
    ManagerRepository managerRepo;
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Override
    public boolean saveManager(Manager manager) {
        List<Manager> list = managerRepo.findAll();
        for(Manager obj : list){
            if(obj.getEmail().equals(manager.getEmail())){
                return false;
            }
        }
        Pattern pattern = Pattern.compile("f20[0-9]{6}(@hyderabad.bits-pilani.ac.in)");
        Matcher m = pattern.matcher(manager.getEmail());
        if(m.matches()) {
            manager.setPassword(bCryptPasswordEncoder.encode(manager.getPassword()));
            managerRepo.save(manager);
            return true;
        }
        return false;
    }

    @Override
    public List<Manager> getAllManagers() {
        return managerRepo.findAll();
    }

    @Override
    public Manager getManager(int id) {
        return (Manager) managerRepo.findById(id).get();
    }

    @Override
    public void deleteManager(Manager manager) {
        managerRepo.deleteById(manager.getId());
        
    }

    @Override
    public void updateManager(Manager manager) {
       List<Manager> list = this.getAllManagers();
       for(Manager obj: list) {
           if(manager.getId()==obj.getId()) {
               if(manager.getName()!=null) {
                   obj.setName(manager.getName());
               }
               if(manager.getEmail()!=null) {
                   obj.setEmail(manager.getEmail());
               }
               if(manager.getPassword()!=null) {
                   obj.setPassword(manager.getPassword());
               }
               if(manager.getAddress()!=null) {
                   obj.setAddress(manager.getAddress());
               }
               if(manager.getMobileNumber()!=null) {
                   obj.setMobileNumber(manager.getMobileNumber());
               }
               this.saveManager(obj);
               return;
           }
       }
    }
}
