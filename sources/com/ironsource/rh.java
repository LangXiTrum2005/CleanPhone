package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0627ve f30185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0591te f30186d;

    public /* synthetic */ rh(Context context, C0627ve c0627ve, InterfaceC0591te interfaceC0591te, int i10) {
        this.f30183a = i10;
        this.f30184b = context;
        this.f30185c = c0627ve;
        this.f30186d = interfaceC0591te;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30183a) {
            case 0:
                Ce.b(this.f30184b, this.f30185c, this.f30186d);
                break;
            default:
                Ce.d(this.f30184b, this.f30185c, this.f30186d);
                break;
        }
    }
}
