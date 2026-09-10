package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15228e;

    static {
        String str = uu0.f20901a;
        f15224a = Integer.toString(0, 36);
        f15225b = Integer.toString(1, 36);
        f15226c = Integer.toString(2, 36);
        f15227d = Integer.toString(3, 36);
        f15228e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f15224a, spanned.getSpanStart(obj));
        bundle2.putInt(f15225b, spanned.getSpanEnd(obj));
        bundle2.putInt(f15226c, spanned.getSpanFlags(obj));
        bundle2.putInt(f15227d, i10);
        if (bundle != null) {
            bundle2.putBundle(f15228e, bundle);
        }
        return bundle2;
    }
}
