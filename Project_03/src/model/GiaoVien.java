
package model;

/**
 *
 * @author PC MSI
 */
public class GiaoVien {
    private String idGV, nameGV, phoneNumberGV, addressGV;

    public GiaoVien(String idGV, String nameGV, String phoneNumberGV, String addressGV) {
        this.idGV = idGV;
        this.nameGV = nameGV;
        this.phoneNumberGV = phoneNumberGV;
        this.addressGV = addressGV;
    }

    public String getIdGV() {
        return idGV;
    }

    public void setIdGV(String idGV) {
        this.idGV = idGV;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }

    public String getPhoneNumberGV() {
        return phoneNumberGV;
    }

    public void setPhoneNumberGV(String phoneNumberGV) {
        this.phoneNumberGV = phoneNumberGV;
    }

    public String getAddressGV() {
        return addressGV;
    }

    public void setAddressGV(String addressGV) {
        this.addressGV = addressGV;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "idGV=" + idGV + ", nameGV=" + nameGV + ", phoneNumberGV=" + phoneNumberGV + ", addressGV=" + addressGV + '}';
    }
    
}