package com.applovin.impl.sdk;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f9415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f9416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f9417d;

    public /* synthetic */ d0(n nVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i10) {
        this.f9414a = i10;
        this.f9415b = nVar;
        this.f9416c = bVar;
        this.f9417d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9414a) {
            case 0:
                this.f9415b.a(this.f9416c, this.f9417d);
                break;
            default:
                this.f9415b.b(this.f9416c, this.f9417d);
                break;
        }
    }
}
