package com.blankj.utilcode.util;

import android.content.res.Resources;

/* JADX INFO: compiled from: SizeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class molybdenite {
    public static int attabal(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
