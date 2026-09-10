package com.applovin.impl.mediation;

import com.applovin.impl.a3;
import com.applovin.impl.u4;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements u4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f8762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8764d;

    public /* synthetic */ m(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i10) {
        this.f8761a = i10;
        this.f8762b = mediationServiceImpl;
        this.f8763c = obj;
        this.f8764d = obj2;
    }

    @Override // com.applovin.impl.u4.a
    public final void a(Object obj) {
        switch (this.f8761a) {
            case 0:
                this.f8762b.a((h) this.f8763c, (u4) this.f8764d, (String) obj);
                break;
            default:
                this.f8762b.a((a3) this.f8763c, (com.applovin.impl.mediation.ads.a.InterfaceC0010a) this.f8764d, (String) obj);
                break;
        }
    }
}
