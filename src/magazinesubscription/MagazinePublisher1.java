/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazinesubscription;

import java.util.*;

/**
 *
 * @author mdeboer1
 */
public class MagazinePublisher1 implements MagazinePublisherAsSubscriber {
    private List<PrivateIndividualMagazineSubscriber> subscribers;
    
    public MagazinePublisher1(){
        subscribers = new ArrayList<>();
    }
    
    public final void addSubscriber(PrivateIndividualMagazineSubscriber subscriber){
        subscribers.add(subscriber);
        Set<PrivateIndividualMagazineSubscriber> set = new HashSet<>(subscribers);
//        subscribers.clear();
//        for (PrivateIndividualMagazineSubscriber s : set){
//            subscribers.add(subscriber);
//        }
        subscribers = new ArrayList<>(set);
    }
    
    public final void publishNewEdition(){
        for(PrivateIndividualMagazineSubscriber subscriber : subscribers){
            subscriber.receiveNextEdition();
        }
    }
    
    @Override
    public final void changeSubscriberAddress(String address, int customerNumber){
        for(PrivateIndividualMagazineSubscriber subscriber : subscribers){
            if (subscriber.getSubscriberNumber() == customerNumber){
                subscriber.setAddress(address);
            }
        }    
        alertSubscriberOfSuccessfulAddressChange();
    }
    
    @Override
    public final void changeSubscriberName(String name, int customerNumber){
        for(PrivateIndividualMagazineSubscriber subscriber : subscribers){
            if (subscriber.getSubscriberNumber() == customerNumber){
                subscriber.setName(name);
            }
        } 
        alertSubscriberOfSuccessfulNameChange();
    }
    
    private void alertSubscriberOfSuccessfulNameChange(){
        System.out.println("Name has been changed.");
    }
    
    private void alertSubscriberOfSuccessfulAddressChange(){
        System.out.println("Address has been updated!");
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.subscribers);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MagazinePublisher1 other = (MagazinePublisher1) obj;
        return Objects.equals(this.subscribers, other.subscribers);
    }

    @Override
    public final String toString() {
        return "MagazinePublisher{" + "subscribers=" + subscribers + '}';
    }
    
    public final List getSubscriberList(){
        return subscribers;
    }
}
