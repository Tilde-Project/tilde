package org.tildeproject;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Starter;

/**
 * Created by admiral0 on 10/4/15.
 */
public class Boot extends AbstractVerticle {
    public static void main(String[] args){
        Starter.main(new String[] {"run", Boot.class.getCanonicalName()});
    }
}
