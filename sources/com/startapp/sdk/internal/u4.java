package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class u4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41532b;

    public u4(com.startapp.sdk.components.a aVar, Context context) {
        this.f41532b = aVar;
        this.f41531a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new lg(this.f41532b.f40738h, new lb(new t4(this)), new s4(), this.f41531a);
    }
}
