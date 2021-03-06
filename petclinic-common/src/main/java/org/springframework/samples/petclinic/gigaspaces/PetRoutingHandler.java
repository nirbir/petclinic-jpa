package org.springframework.samples.petclinic.gigaspaces;

import org.openspaces.remoting.RemoteRoutingHandler;
import org.openspaces.remoting.SpaceRemotingInvocation;
import org.springframework.samples.petclinic.Pet;

/**
 * Created by IntelliJ IDEA.
 * User: uri
 * Date: 2/6/11
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PetRoutingHandler implements RemoteRoutingHandler<Integer> {
    public Integer computeRouting(SpaceRemotingInvocation remotingEntry) {
        Pet pet = (Pet) remotingEntry.getArguments()[0];
        return pet.getOwner().getId();
    }
}
