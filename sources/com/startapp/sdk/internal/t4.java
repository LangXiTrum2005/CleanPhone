package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class t4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u4 f41503a;

    public t4(u4 u4Var) {
        this.f41503a = u4Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f41503a.f41531a.getSharedPreferences("StartApp-f401d8c3ad3d3e9b", 0));
    }
}
