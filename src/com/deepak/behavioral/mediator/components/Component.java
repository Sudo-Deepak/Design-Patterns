package com.deepak.behavioral.mediator.components;

import com.deepak.behavioral.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
