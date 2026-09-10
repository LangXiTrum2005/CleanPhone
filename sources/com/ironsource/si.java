package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class si implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30708c;

    public /* synthetic */ si(int i10, Object obj, Object obj2) {
        this.f30706a = i10;
        this.f30708c = obj;
        this.f30707b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30706a) {
            case 0:
                C0640w9.a((C0640w9) this.f30708c, (IronSourceError) this.f30707b);
                break;
            case 1:
                C0676y9.a((C0676y9) this.f30708c, (IronSourceError) this.f30707b);
                break;
            default:
                C0676y9.a((C0676y9) this.f30708c, (K9) this.f30707b);
                break;
        }
    }
}
