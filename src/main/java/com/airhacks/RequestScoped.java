/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.inject.Named;

/**
 *
 * @author pedantic
 */
@Named
@javax.enterprise.context.RequestScoped
public class RequestScoped {
    
    
    public int getHashCode() {
        return this.hashCode();
    }
}
