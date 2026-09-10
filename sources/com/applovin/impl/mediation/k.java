package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.c3;
import com.applovin.impl.y2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int X = 1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f11302Y;
    public final /* synthetic */ h Z;
    public final /* synthetic */ Activity e0;
    public final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0034a f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0034a interfaceC0034a) {
        this.f11302Y = mediationServiceImpl;
        this.g0 = c3Var;
        this.Z = hVar;
        this.h0 = viewGroup;
        this.i0 = lifecycle;
        this.e0 = activity;
        this.f0 = interfaceC0034a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f11302Y.a(this.Z, (String) this.g0, (MaxAdapterParametersImpl) this.h0, (y2) this.i0, this.e0, this.f0);
                break;
            default:
                Activity activity = this.e0;
                this.f11302Y.a((c3) this.g0, this.Z, (ViewGroup) this.h0, (Lifecycle) this.i0, activity, this.f0);
                break;
        }
    }

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0034a interfaceC0034a) {
        this.f11302Y = mediationServiceImpl;
        this.Z = hVar;
        this.g0 = str;
        this.h0 = maxAdapterParametersImpl;
        this.i0 = y2Var;
        this.e0 = activity;
        this.f0 = interfaceC0034a;
    }
}
