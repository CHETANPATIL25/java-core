package com.learning.core.day5;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Vehicle 
{
    private String VehicleId;
    private String VehicleName;

    public Vehicle(String VehicleId, String VehicleName) 
    {
        this.VehicleId = VehicleId;
        this.VehicleName = VehicleName;
    }

    public String getVehicleId() 
    {
        return VehicleId;
    }

    public void setVechileId(String VehicleId) 
    {
        this.VehicleId = VehicleId;
    }

    public String getVehicleName() 
    {
        return VehicleName;
    }

    public void setVechileName(String VechileName) 
    {
        this.VehicleName = VechileName;
    }

    @Override
    public String toString() 
    {
        return VehicleId + " " + VehicleName;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(VehicleId);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle Vechile = (Vehicle) obj;
        return Objects.equals(VehicleId, Vechile.VehicleId);
    }
}

public class D05P05 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Vehicle> Vehicles = new LinkedHashSet<>();
        Vehicles.add(new Vehicle("P001", "Maruti 800"));
        Vehicles.add(new Vehicle("P002", "Maruti Swift"));
        Vehicles.add(new Vehicle("P003", "Maruti Dezire"));
        Vehicles.add(new Vehicle("P004", "Maruti Alto"));
        Scanner sc= new Scanner(System.in);

        String VehicleIdToRemove = sc.next();

        
        Vehicles.removeIf(Vechile -> Vechile.getVehicleId().equals(VehicleIdToRemove));

        
        for (Vehicle Vechile : Vehicles) 
        {
            System.out.println(Vechile);
        }
    }
}