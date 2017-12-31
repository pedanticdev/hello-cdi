/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author pedantic
 */
@Named
@Dependent
public class DependentScoped {

    public int getHashCode() {
        return this.hashCode();
    }

}
