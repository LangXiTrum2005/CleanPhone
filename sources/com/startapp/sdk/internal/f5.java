package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class f5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f40955b;

    public f5(com.startapp.sdk.components.a aVar, Context context) {
        this.f40955b = aVar;
        this.f40954a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f40954a;
        com.startapp.sdk.components.a aVar = this.f40955b;
        return new ij(context, aVar.f40725B, aVar.M);
    }
}
