
package com.mycompany.mycart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aavip
 */
@Entity
public class User {

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", UserName=" + UserName + ", Email=" + Email + ", Phone=" + Phone + ", Password=" + Password + ", Pic=" + Pic + ", Address=" + Address + ", UserType=" + UserType + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String Pic) {
        this.Pic = Pic;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public User() {
    }

    public User(String UserName, String Email, String Phone, String Password, String Pic, String Address, String UserType) {
        this.UserName = UserName;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;
        this.Pic = Pic;
        this.Address = Address;
        this.UserType = UserType;
    }

    public User(int id, String UserName, String Email, String Phone, String Password, String Pic, String Address, String UserType) {
        this.id = id;
        this.UserName = UserName;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;
        this.Pic = Pic;
        this.Address = Address;
        this.UserType = UserType;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length=100, name= "user_Id")
    private int id;
    
        @Column(length=100, name= "user_name")
         private String UserName;
    
   
     @Column(length=100, name= "user_Email")
    private String Email;
   
    
     @Column(length=100, name= "user_Phone")
    private String Phone;
   
    
    @Column(length=100, name= "user_Password")
    private String Password;
     
     @Column(length=100, name= "user_Pic")
    private String Pic;
    
     @Column(length=100, name= "user_Address")
    private String Address;
     
     @Column(length=100, name = "user_Type")
     private String UserType;
    
     
     
    
//    public User(String UserName, String userEmail, String userPhone, String userPassword, String UserType) {
//    }
//
//    public User(int id, String UserName, String Email, String Phone, String Password, String Pic, String Address ,String UserType) {
//        this.id = id;
//        this.UserName = UserName;
//        this.Email = Email;
//        this.Phone = Phone;
//        this.Password = Password;
//        this.Pic = Pic;
//        this.Address = Address;
//        this.UserType = UserType;
//    }
//    
//
//    public User(String UserName, String Email, String Phone, String Password, String Pic, String Address,String UserType) {
//        this.UserName = UserName;
//        this.Email = Email;
//        this.Phone = Phone;
//        this.Password = Password;
//        this.Pic = Pic;
//        this.Address = Address;
//        this.UserType = UserType;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return UserName;
//    }
//
//    public void setName(String UserName) {
//        this.UserName = UserName;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String Email) {
//        this.Email = Email;
//    }
//
//    public String getPhone() {
//        return Phone;
//    }
//
//    public void setPhone(String Phone) {
//        this.Phone = Phone;
//    }
//
//    public String getPassword() {
//        return Password;
//    }
//
//    public void setPassword(String Password) {
//        this.Password = Password;
//    }
//
//    public String getPic() {
//        return Pic;
//    }
//
//    public void setPic(String Pic) {
//        this.Pic = Pic;
//    }
//
//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String Address) {
//        this.Address = Address;
//    }
//
//    public String getUserType() {
//        return UserType;
//    }
//
//    public void setUserType(String UserType) {
//        this.UserType = UserType;
//    }
//
//   
//    

 }

