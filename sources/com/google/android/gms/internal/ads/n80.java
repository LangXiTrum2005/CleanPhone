package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 implements o80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17712a;

    public n80(Map map) {
        this.f17712a = map;
    }

    @Override // com.google.android.gms.internal.ads.o80
    public final nm0 a(int i10, String str) {
        return (nm0) this.f17712a.get(str);
    }
}
