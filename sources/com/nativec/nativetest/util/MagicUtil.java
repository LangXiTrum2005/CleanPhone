package com.nativec.nativetest.util;

/* JADX INFO: loaded from: classes5.dex */
public class MagicUtil {
    public String TAG = "com.native.natived";

    static {
        System.loadLibrary("nativetest");
    }

    public native String logA(String str, String str2);

    public native String logB(String str, String str2, long j);
}
