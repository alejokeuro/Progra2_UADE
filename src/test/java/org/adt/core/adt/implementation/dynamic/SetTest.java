package org.adt.core.adt.implementation.dynamic;

import org.adt.core.adt.definition.ISet;
import org.adt.core.adt.implementation.BaseSetTest;

public class SetTest extends BaseSetTest {

    @Override
    public ISet getSet() {
        return new Set();
    }

}
