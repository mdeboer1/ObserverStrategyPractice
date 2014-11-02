/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazinesubscription;

/**
 *
 * @author mdeboer1
 */
public interface MagazinePublisherAsSubscriber {
    public abstract void changeSubscriberAddress(String address, int customerNumber);
    public abstract void changeSubscriberName(String name, int customerNumber);
}
