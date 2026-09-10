package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f640a;

    static {
        int[] iArr = new int[bc.values().length];
        f640a = iArr;
        iArr[bc.STRING_IN_UTF8.ordinal()] = 1;
        iArr[bc.LOAD_CLASS.ordinal()] = 2;
        iArr[bc.ROOT_UNKNOWN.ordinal()] = 3;
        iArr[bc.ROOT_JNI_GLOBAL.ordinal()] = 4;
        iArr[bc.ROOT_JNI_LOCAL.ordinal()] = 5;
        iArr[bc.ROOT_JAVA_FRAME.ordinal()] = 6;
        iArr[bc.ROOT_NATIVE_STACK.ordinal()] = 7;
        iArr[bc.ROOT_STICKY_CLASS.ordinal()] = 8;
        iArr[bc.ROOT_THREAD_BLOCK.ordinal()] = 9;
        iArr[bc.ROOT_MONITOR_USED.ordinal()] = 10;
        iArr[bc.ROOT_THREAD_OBJECT.ordinal()] = 11;
        iArr[bc.ROOT_INTERNED_STRING.ordinal()] = 12;
        iArr[bc.ROOT_FINALIZING.ordinal()] = 13;
        iArr[bc.ROOT_DEBUGGER.ordinal()] = 14;
        iArr[bc.ROOT_REFERENCE_CLEANUP.ordinal()] = 15;
        iArr[bc.ROOT_VM_INTERNAL.ordinal()] = 16;
        iArr[bc.ROOT_JNI_MONITOR.ordinal()] = 17;
        iArr[bc.ROOT_UNREACHABLE.ordinal()] = 18;
        iArr[bc.CLASS_DUMP.ordinal()] = 19;
        iArr[bc.INSTANCE_DUMP.ordinal()] = 20;
        iArr[bc.OBJECT_ARRAY_DUMP.ordinal()] = 21;
        iArr[bc.PRIMITIVE_ARRAY_DUMP.ordinal()] = 22;
    }
}
