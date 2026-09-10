package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3357xk {
    public static int a(String str) {
        if (dovishness.starveling(str, "track_", false, 2, null)) {
            str = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
