package com.p004ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hu {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<List<Field>> f2293;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int f2294;

    public hu() {
        ArrayList arrayList = new ArrayList();
        this.f2293 = arrayList;
        int i2 = (-1) + 1;
        this.f2294 = i2;
        arrayList.add(i2, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2262() {
        this.f2293.remove(this.f2294);
        this.f2294--;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<List<Field>> m2263() {
        return this.f2293;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2265(Field field) {
        this.f2293.get(this.f2294).add(field);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2266(Field field) {
        this.f2293.get(this.f2294).remove(field);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2264() {
        int i2 = this.f2294 + 1;
        this.f2294 = i2;
        this.f2293.add(i2, new ArrayList());
    }
}
