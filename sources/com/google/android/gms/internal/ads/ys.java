package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ys implements js, xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs f22359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f22360b = new HashSet();

    public ys(ms msVar) {
        this.f22359a = msVar;
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void k(String str, oq oqVar) {
        this.f22359a.k(str, oqVar);
        this.f22360b.remove(new AbstractMap.SimpleEntry(str, oqVar));
    }

    @Override // com.google.android.gms.internal.ads.xs
    public final void z(String str, oq oqVar) {
        this.f22359a.z(str, oqVar);
        this.f22360b.add(new AbstractMap.SimpleEntry(str, oqVar));
    }

    @Override // com.google.android.gms.internal.ads.js, com.google.android.gms.internal.ads.ns
    public final void zza(String str) {
        this.f22359a.zza(str);
    }
}
