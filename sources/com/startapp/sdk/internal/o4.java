package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class o4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41293b;

    public o4(com.startapp.sdk.components.a aVar, Context context) {
        this.f41293b = aVar;
        this.f41292a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new sf(this.f41292a, this.f41293b.D, new n4());
    }
}
