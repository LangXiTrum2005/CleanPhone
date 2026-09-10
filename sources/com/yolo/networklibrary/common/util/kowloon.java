package com.yolo.networklibrary.common.util;

/* JADX INFO: compiled from: Validate.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {
    public static void attabal(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
