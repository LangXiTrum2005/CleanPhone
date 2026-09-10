package com.google.firebase.components;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
