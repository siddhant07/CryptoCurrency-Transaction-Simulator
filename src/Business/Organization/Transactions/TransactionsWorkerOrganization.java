/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Transactions;

import Business.Organization.Organization;
import Business.Role.Transactions.TransactionsWorkerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransactionsWorkerOrganization extends Organization{
    
     public TransactionsWorkerOrganization() {
        super(Type.TransactionsWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransactionsWorkerRole());
        return roles;
    }
    
}
