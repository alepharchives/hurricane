package org.hurricane.driver.datatypes;

import java.util.ArrayList;
import org.hurricane.driver.datatypes.Base;
import org.hurricane.driver.datatypes.Pid;

public class Export extends Base {
    public Object mModule;
    public Object mFunction;
    public Byte mArity;

    public Export(Object module, Object function, Byte arity) {
        mModule = module;
        mFunction = function;
        mArity = arity;
    }
    
    public String toString() {
        return mModule + ":" + mFunction + "/" + mArity;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Export) {
            Export oe = (Export) other;
            Boolean equal = true;
            equal = equal && mModule.equals(oe.mModule);
            equal = equal && mFunction.equals(oe.mFunction);
            equal = equal && mArity.equals(oe.mArity);
            return equal;
        }
        return false;
    }
}