package com.cyclops.template.populators;

public interface Populator<SOURCE, TARGET> {

    void populate(SOURCE source, TARGET target);
}
