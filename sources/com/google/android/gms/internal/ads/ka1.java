package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ka1 extends l91 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient db1 f16399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f16400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient ja1 f16401f;

    public ka1(db1 db1Var, int i10) {
        this.f16399d = db1Var;
        this.f16400e = i10;
        Object[] objArr = eb1.f13922i;
    }

    @Override // com.google.android.gms.internal.ads.k91
    public final /* synthetic */ Collection d() {
        return new ga1(this);
    }

    @Override // com.google.android.gms.internal.ads.k91
    public final Map g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.k91
    public final boolean h(Object obj) {
        return obj != null && super.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.k91
    public /* synthetic */ Map i() {
        return this.f16399d;
    }
}
