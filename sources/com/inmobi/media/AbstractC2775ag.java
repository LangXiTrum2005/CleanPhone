package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2775ag {
    public static final boolean a(Xf xf) {
        Intrinsics.checkNotNullParameter(xf, "<this>");
        int i = xf.b;
        if ((400 <= i && i < 600) || i <= 0) {
            return false;
        }
        String str = xf.c;
        return str == null || str.length() == 0;
    }
}
