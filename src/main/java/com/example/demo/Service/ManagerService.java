package com.example.demo.Service;
import java.util.List;
import com.example.demo.Model.Manager;

public interface ManagerService {
    public boolean saveManager(Manager Manager);
    public List<Manager> getAllManagers();
    public Manager getManager(int id);
    public void deleteManager(Manager Manager);
    public void updateManager(Manager Manager);
}
