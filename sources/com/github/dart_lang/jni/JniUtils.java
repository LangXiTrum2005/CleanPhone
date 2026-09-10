package com.github.dart_lang.jni;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class JniUtils {
    static {
        System.loadLibrary("dartjni");
    }

    public static native Object fromReferenceAddress(long j10);
}
