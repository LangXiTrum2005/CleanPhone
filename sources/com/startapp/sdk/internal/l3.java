package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class l3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f41200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f41201c;

    public l3(com.startapp.sdk.components.a aVar, Context context, b6 b6Var) {
        this.f41201c = aVar;
        this.f41199a = context;
        this.f41200b = b6Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new yh(this.f41199a, this.f41201c.f40726E, new lb(new k3(this)), this.f41201c.j, this.f41200b);
    }
}
