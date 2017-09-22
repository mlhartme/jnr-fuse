package ru.serce.jnrfuse.struct;

import jnr.ffi.BaseStruct;
import jnr.ffi.Runtime;

public class FuseArgs extends BaseStruct {
    public final int64_t argc = new int64_t();
    public final Pointer argv = new Pointer();
    public final int64_t allocated = new int64_t();

    public FuseArgs(Runtime runtime) {
        super(runtime);
    }

    public static FuseArgs of(jnr.ffi.Pointer pointer) {
        FuseArgs fa = new FuseArgs(jnr.ffi.Runtime.getSystemRuntime());
        fa.useMemory(pointer);
        return fa;
    }
}