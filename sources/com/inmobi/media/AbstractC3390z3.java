package com.inmobi.media;

import android.graphics.Color;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3390z3 {
    public static final int a(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 4) {
            return -16777216;
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
