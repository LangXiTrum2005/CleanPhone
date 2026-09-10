package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class k4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41176b;

    public k4(com.startapp.sdk.components.a aVar, Context context) {
        this.f41176b = aVar;
        this.f41175a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f41175a;
        lb lbVar = new lb(new j4(this));
        com.startapp.sdk.components.a aVar = this.f41176b;
        return new mg(context, lbVar, aVar.j, aVar.f40726E, new i4());
    }
}
