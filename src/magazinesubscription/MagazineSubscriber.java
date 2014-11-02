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
public interface MagazineSubscriber {
    public abstract void setName(String name);
    public abstract void setAddress(String address);
    public abstract void receiveNextEdition();
}
