package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class j3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f41130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41131c;

    public j3(com.startapp.sdk.components.a aVar, Context context, b6 b6Var) {
        this.f41131c = aVar;
        this.f41129a = context;
        this.f41130b = b6Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f41129a;
        lb lbVar = new lb(new i3(this));
        com.startapp.sdk.components.a aVar = this.f41131c;
        return new ph(context, lbVar, aVar.f40726E, aVar.j, this.f41130b, new h3());
    }
}
