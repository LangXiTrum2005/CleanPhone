package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.e3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8798e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8794a = i10;
        this.f8795b = obj;
        this.f8796c = obj2;
        this.f8797d = obj3;
        this.f8798e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8794a) {
            case 0:
                ((h.b) this.f8795b).a((e3) this.f8796c, (MaxReward) this.f8797d, (Bundle) this.f8798e);
                break;
            case 1:
                ((h.b) this.f8795b).a((Runnable) this.f8796c, (MaxAdListener) this.f8797d, (String) this.f8798e);
                break;
            case 2:
                ((MediationServiceImpl) this.f8795b).a((e3) this.f8796c, (Long) this.f8797d, (MaxAdListener) this.f8798e);
                break;
            case 3:
                ((h) this.f8795b).a((MaxAdapter.OnCompletionListener) this.f8796c, (MaxAdapterInitializationParameters) this.f8797d, (Activity) this.f8798e);
                break;
            default:
                ((h) this.f8795b).a((MaxAdapterResponseParameters) this.f8796c, (MaxAdFormat) this.f8797d, (Activity) this.f8798e);
                break;
        }
    }
}
