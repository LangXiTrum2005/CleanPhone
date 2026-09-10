package com.applovin.impl.sdk.ad;

import com.applovin.impl.j5;
import en.q;
import en.r;
import mi.s;
import x4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9383b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f9382a = i10;
        this.f9383b = obj;
    }

    @Override // l0.a
    public final void accept(Object obj) {
        int i10 = this.f9382a;
        Object obj2 = this.f9383b;
        switch (i10) {
            case 0:
                ((a) obj2).o((j5) obj);
                break;
            case 1:
                ((s) obj2).setWindowInfoListenerDisplayFeatures((i) obj);
                break;
            default:
                ((q) ((r) obj2)).i((i) obj);
                break;
        }
    }
}
