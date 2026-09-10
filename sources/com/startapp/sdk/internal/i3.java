package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class i3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j3 f41082a;

    public i3(j3 j3Var) {
        this.f41082a = j3Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f41082a.f41129a.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0));
    }
}
