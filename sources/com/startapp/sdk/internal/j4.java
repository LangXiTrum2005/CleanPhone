package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class j4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4 f41132a;

    public j4(k4 k4Var) {
        this.f41132a = k4Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f41132a.f41175a.getSharedPreferences("StartApp-6cd3cac226013e8e", 0));
    }
}
