package com.bytedance.sdk.component.di.ri;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static void ri(Object obj, String str) {
        if (obj == null) {
            ri(str);
        }
    }

    public static void ri(String str) {
        throw new IllegalArgumentException(str);
    }
}
