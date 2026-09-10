package com.startapp.sdk.internal;

import A.C0880a0;
import android.content.Context;
import android.content.Intent;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u1 extends com.startapp.sdk.adsbase.c {
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f41529l;

    public u1(Context context, gb gbVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4) {
        super(context, gbVar, adPreferences, adEventListener, placement, lbVar, lbVar2, lbVar3, lbVar4);
        this.k = 0;
        this.f41529l = new HashSet();
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public abstract void a(Ad ad);

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z2) {
        super.b(z2);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f40632b.hashCode());
        intent.putExtra("adResult", z2);
        zb.a(this.f40631a).a(intent);
        if (z2) {
            a(this.f40632b);
            Context context = this.f40631a;
            AdEventListener adEventListener = this.d;
            this.d = null;
            a0.b(context, adEventListener, this.f40632b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        if (this.f41529l.size() == 0) {
            this.f41529l.add(this.f40631a.getPackageName());
        }
        int i2 = this.k;
        if (i2 > 0) {
            aVarC.L0 = false;
        }
        aVarC.H0 = this.f41529l;
        aVarC.L0 = i2 == 0;
        p8 p8Var = new p8((q8) this.g.a(), aVarC.a(i0.a(AdsConstants$AdApiType.JSON, this.f40634e)));
        p8Var.f41356e = new C0880a0(this, 29);
        a(p8Var);
        p8Var.d = ((HttpClientConfig) ((q8) this.g.a()).f.a()).a(aVarC.Z);
        t8 t8VarA = p8Var.a();
        if (t8VarA == null) {
            return null;
        }
        try {
            return JsonParser.fromJson(t8VarA.f41508b, GetAdResponse.class);
        } catch (Throwable th) {
            g9.a(th);
            return null;
        }
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f40636i.a();
        WeakHashMap weakHashMap = vi.f41589a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        int i2;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z2 = false;
        if (obj == null) {
            this.f = "Empty Response";
            return false;
        }
        if (!getAdResponse.b()) {
            this.f = getAdResponse.a();
            return false;
        }
        gb gbVar = (gb) this.f40632b;
        ArrayList arrayListA = u0.a(this.f40631a, getAdResponse.d(), this.k, this.f41529l, true);
        gbVar.a(arrayListA);
        gbVar.setAdInfoOverride(getAdResponse.c());
        if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
            z2 = true;
        }
        if (!z2) {
            this.f = "Empty Response";
            return z2;
        }
        if (arrayListA.size() != 0 || (i2 = this.k) != 0) {
            return z2;
        }
        this.k = i2 + 1;
        return b();
    }
}
