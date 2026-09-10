package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class q3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41387b;

    public q3(com.startapp.sdk.components.a aVar, Context context) {
        this.f41387b = aVar;
        this.f41386a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f41386a;
        com.startapp.sdk.components.a aVar = this.f41387b;
        return new h6(context, aVar.G, aVar.f40738h);
    }
}
