package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class r5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41425b;

    public r5(com.startapp.sdk.components.a aVar, Context context) {
        this.f41425b = aVar;
        this.f41424a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f41424a;
        com.startapp.sdk.components.a aVar = this.f41425b;
        return new gi(context, aVar.f40727F, aVar.D, new q5());
    }
}
