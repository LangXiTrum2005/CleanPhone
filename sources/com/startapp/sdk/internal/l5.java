package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class l5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41203b;

    public l5(com.startapp.sdk.components.a aVar, Context context) {
        this.f41203b = aVar;
        this.f41202a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new q(this.f41202a, this.f41203b.f40738h, new k5());
    }
}
