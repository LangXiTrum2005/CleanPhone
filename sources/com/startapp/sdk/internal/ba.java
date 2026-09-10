package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class ba extends z9 {
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f40834e;

    public ba(lb lbVar, lb lbVar2, g9 g9Var, j9 j9Var, q9 q9Var) {
        super(g9Var, j9Var, q9Var);
        this.d = lbVar;
        this.f40834e = lbVar2;
    }

    @Override // com.startapp.sdk.internal.z9
    public final int a() {
        String str = this.f41764a.f41002e;
        if (str == null) {
            return 3;
        }
        hf hfVar = (hf) this.f40834e.a();
        q8 q8Var = (q8) this.d.a();
        ki kiVar = new ki();
        kiVar.f41733J = hfVar.a(kiVar);
        p8 p8Var = new p8(q8Var, kiVar.a(str));
        p8Var.f41356e = null;
        p8Var.d = ((HttpClientConfig) q8Var.f.a()).a(kiVar.Z);
        return p8Var.a() != null ? 1 : 0;
    }
}
