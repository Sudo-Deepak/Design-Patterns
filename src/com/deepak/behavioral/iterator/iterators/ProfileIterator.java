package com.deepak.behavioral.iterator.iterators;

import com.deepak.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
