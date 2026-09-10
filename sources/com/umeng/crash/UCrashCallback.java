package com.umeng.crash;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface UCrashCallback {
    public static final String TYPE_ANR = "anr";
    public static final String TYPE_EXCEPTION = "exception";
    public static final String TYPE_JAVA = "java";
    public static final String TYPE_NATIVE = "jni";

    Map<String, String> getExtras(String str);
}
