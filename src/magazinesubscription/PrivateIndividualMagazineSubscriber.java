/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazinesubscription;

import java.util.Objects;

/**
 *
 * @author mdeboer1
 */
public class PrivateIndividualMagazineSubscriber implements MagazineSubscriber {
    private String name;
    private String address;
    private int subscriberNumber;

    public PrivateIndividualMagazineSubscriber(String name, String address, int subscriberNumber){
        setName(name);
        setAddress(address);
        setSubscriberNumber(subscriberNumber);
    }

    public final int getSubscriberNumber() {
        return subscriberNumber;
    }

    private void setSubscriberNumber(int subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }
    
    @Override
    public final void setName(String name) {
        this.name = name;
    }
    
    public final String getName() {
        return name;
    }

    @Override
    public final void setAddress(String address) {
        this.address = address;
    }
    
    public final String getAddress() {
        return address;
    }

    @Override
    public final void receiveNextEdition() {
        subscriberResponse();
    }
    
    private void subscriberResponse(){
        System.out.println("Thanks, I'll start reading today!");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.subscriberNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PrivateIndividualMagazineSubscriber other = (PrivateIndividualMagazineSubscriber) obj;
        if (this.subscriberNumber != other.subscriberNumber) {
            return false;
        }
        return true;
    }

    

    @Override
    public final String toString() {
        return "Subscriber{" + "name=" + name + ", address=" + address + '}';
    }
}
