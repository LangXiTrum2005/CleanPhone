package com.github.dart_lang.jni;

import androidx.annotation.NonNull;
import ti.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class JniPlugin implements b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // ti.b
    public void onAttachedToEngine(@NonNull ti.a aVar) {
    }

    @Override // ti.b
    public void onDetachedFromEngine(@NonNull ti.a aVar) {
    }
}
