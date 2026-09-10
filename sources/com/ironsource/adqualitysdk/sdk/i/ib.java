package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ib {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f2446;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<List<Field>> f2447;

    public ib() {
        ArrayList arrayList = new ArrayList();
        this.f2447 = arrayList;
        int i10 = (-1) + 1;
        this.f2446 = i10;
        arrayList.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<List<Field>> m2362() {
        return this.f2447;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2364(Field field) {
        this.f2447.get(this.f2446).add(field);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2365() {
        this.f2447.remove(this.f2446);
        this.f2446--;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2366(Field field) {
        this.f2447.get(this.f2446).remove(field);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2363() {
        int i10 = this.f2446 + 1;
        this.f2446 = i10;
        this.f2447.add(i10, new ArrayList());
    }
}
