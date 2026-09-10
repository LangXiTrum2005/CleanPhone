package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41032b;

    public h4(com.startapp.sdk.components.a aVar, Context context) {
        this.f41032b = aVar;
        this.f41031a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f41031a;
        lb lbVar = this.f41032b.G;
        lb lbVar2 = new lb(new g4(this));
        com.startapp.sdk.components.a aVar = this.f41032b;
        return new m2(context, lbVar, lbVar2, aVar.j, aVar.f40726E, new f4());
    }
}
