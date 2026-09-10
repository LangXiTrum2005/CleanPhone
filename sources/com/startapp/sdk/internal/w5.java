package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class w5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41605b;

    public w5(com.startapp.sdk.components.a aVar, Context context) {
        this.f41605b = aVar;
        this.f41604a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new rk(this.f41604a, this.f41605b.f40735b);
    }
}
