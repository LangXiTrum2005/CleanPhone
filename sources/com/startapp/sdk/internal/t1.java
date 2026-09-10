package com.startapp.sdk.internal;

import A.C0880a0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t1 extends com.startapp.sdk.adsbase.c {
    public final HashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f41498l;
    public com.startapp.sdk.adsbase.model.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41499n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f41500p;

    public t1(Context context, o8 o8Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, boolean z2) {
        super(context, o8Var, adPreferences, adEventListener, placement, lbVar, lbVar2, lbVar3, lbVar4);
        this.k = new HashSet();
        this.f41498l = new HashSet();
        this.f41499n = 0;
        this.f41500p = lbVar5;
        this.o = z2;
    }

    public final /* synthetic */ Void a(Throwable th) {
        this.f = th != null ? th.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        this.m = aVarC;
        if (!b(aVarC)) {
            return null;
        }
        if (this.k.size() == 0) {
            this.k.add(this.f40631a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.m;
        aVar.H0 = this.k;
        aVar.J0 = this.f41498l;
        if (this.f41499n > 0) {
            aVar.L0 = false;
            if (MetaData.E().W().a(this.f40631a)) {
                com.startapp.sdk.adsbase.g.e(this.f40631a);
            }
        }
        p8 p8Var = new p8((q8) this.g.a(), this.m.a(i0.a(AdsConstants$AdApiType.HTML, this.f40634e)));
        p8Var.f41356e = new C0880a0(this, 28);
        a(p8Var);
        q8 q8Var = (q8) this.g.a();
        p8Var.d = ((HttpClientConfig) q8Var.f.a()).a(this.m.Z);
        return p8Var.a();
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f40636i.a();
        WeakHashMap weakHashMap = vi.f41589a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public boolean a(Object obj) {
        Ad.AdType adType;
        if (obj == null) {
            if (this.f == null) {
                this.f = "No response";
            }
            return false;
        }
        if (!(obj instanceof t8)) {
            if (this.f == null) {
                this.f = "Unknown error";
            }
            return false;
        }
        t8 t8Var = (t8) obj;
        String str = t8Var.f41508b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.m;
                    if (aVar != null && ((adType = aVar.U0) == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO)) {
                        this.f = "Video isn't available";
                    } else {
                        this.f = "Empty Ad";
                    }
                }
                return false;
            }
            boolean z2 = AdsCommonMetaData.k().G() && u0.a(this.f40631a, u0.a(str, this.f41499n), this.f41499n, this.k, arrayList).booleanValue();
            if (z2) {
                Context context = this.f40631a;
                ((Executor) com.startapp.sdk.components.a.a(context).f40724A.a()).execute(new t0(context, arrayList).f41497c);
            } else {
                o8 o8Var = (o8) this.f40632b;
                o8Var.getClass();
                o8Var.setRequestUrl(t8Var.f41507a);
                o8Var.d(str);
            }
            if (!z2) {
                return true;
            }
            this.f41499n++;
            return b();
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public final void e(boolean z2) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f40632b.hashCode());
        intent.putExtra("adResult", z2);
        zb.a(this.f40631a).a(intent);
        if (z2) {
            if (this.o) {
                ((z6) ((y6) this.f40636i.a())).c(this, ii.f41113u);
                ((rk) this.f41500p.a()).a(((o8) this.f40632b).a(), new s1(this, this));
                return;
            }
            Context context = this.f40631a;
            AdEventListener adEventListener = this.d;
            this.d = null;
            a0.b(context, adEventListener, this.f40632b, false);
            return;
        }
        Context context2 = this.f40631a;
        AdEventListener adEventListener2 = this.d;
        this.d = null;
        a0.a(context2, adEventListener2, this.f40632b, false);
    }
}
