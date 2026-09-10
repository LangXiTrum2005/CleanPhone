package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v90 implements zzg, lt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f21140f;

    public /* synthetic */ v90() {
        this.f21135a = null;
        this.f21136b = null;
        this.f21137c = null;
        this.f21138d = null;
        this.f21139e = null;
        this.f21140f = tf1.f20364e;
    }

    public static r32 p(mu1 mu1Var, ca1 ca1Var, r32 r32Var, ug ugVar) {
        ci ciVarO0 = mu1Var.O0();
        int iQ0 = mu1Var.Q0();
        Object objF = ciVarO0.g() ? null : ciVarO0.f(iQ0);
        if (!mu1Var.V0() && !ciVarO0.g()) {
            ug ugVarD = ciVarO0.d(iQ0, ugVar, false);
            mu1Var.T0();
            String str = uu0.f20901a;
            ugVarD.getClass();
        }
        for (int i10 = 0; i10 < ca1Var.size(); i10++) {
            r32 r32Var2 = (r32) ca1Var.get(i10);
            if (q(r32Var2, objF, mu1Var.V0(), mu1Var.c(), mu1Var.W0())) {
                return r32Var2;
            }
        }
        if (ca1Var.isEmpty() && r32Var != null && q(r32Var, objF, mu1Var.V0(), mu1Var.c(), mu1Var.W0())) {
            return r32Var;
        }
        return null;
    }

    public static boolean q(r32 r32Var, Object obj, boolean z10, int i10, int i11) {
        Object obj2 = r32Var.f19359a;
        int i12 = r32Var.f19360b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10) {
            return i12 == i10 && r32Var.f19361c == i11;
        }
        return i12 == -1 && r32Var.f19363e == -1;
    }

    public /* synthetic */ String a() {
        String str = (String) zzba.zzc().a(am.Eb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f21135a);
            jSONObject.put("eventCategory", (String) this.f21136b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, (String) this.f21137c);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, (Integer) this.f21138d);
            jSONObject.putOpt("rewardType", (String) this.f21139e);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, (Integer) this.f21140f);
        } catch (JSONException unused) {
            int i10 = zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return d5.u.h(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void b(int i10) {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f21135a = Integer.valueOf(i10);
    }

    public boolean c(zzm zzmVar, String str, ps1 ps1Var, mp0 mp0Var) {
        jw0 jw0Var;
        vu0 vu0Var = (vu0) this.f21138d;
        hp0 hp0Var = (hp0) vu0Var.f21275c;
        a50 a50Var = (a50) this.f21137c;
        if (((Boolean) zzba.zzc().a(am.n3)).booleanValue()) {
            zzay.zzc();
        }
        zzt.zzc();
        Context context = (Context) this.f21135a;
        final int i10 = 0;
        final int i11 = 1;
        if (zzs.zzK(context) && zzmVar.zzs == null) {
            int i12 = zze.zza;
            zzo.zzf("Failed to load the ad because app ID is missing.");
            a50Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pp0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v90 f18756b;

                {
                    this.f18756b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i11;
                    v90 v90Var = this.f18756b;
                    switch (i13) {
                        case 0:
                            ((lp0) ((vu0) v90Var.f21138d).f21276d).j0(pi1.C(6, null, null));
                            break;
                        default:
                            ((lp0) ((vu0) v90Var.f21138d).f21276d).j0(pi1.C(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i13 = zze.zza;
            zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            a50Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pp0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v90 f18756b;

                {
                    this.f18756b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i10;
                    v90 v90Var = this.f18756b;
                    switch (i14) {
                        case 0:
                            ((lp0) ((vu0) v90Var.f21138d).f21276d).j0(pi1.C(6, null, null));
                            break;
                        default:
                            ((lp0) ((vu0) v90Var.f21138d).f21276d).j0(pi1.C(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z10 = zzmVar.zzf;
        v71.p(context, z10);
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && z10) {
            ((lj0) a50Var.C.zzb()).b(true);
        }
        int i14 = ((op0) ps1Var).f18318u;
        ((p9.b) zzt.zzk()).getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleC = rb0.c(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        nu0 nu0Var = (nu0) this.f21136b;
        nu0Var.f17957a = zzmVar;
        nu0Var.f17975t = bundleC;
        nu0Var.f17968m = i14;
        ou0 ou0VarA = nu0Var.a();
        fw0 fw0VarD = fw0.d(context, ps1.X(ou0VarA), 8, zzmVar);
        zzcl zzclVar = ou0VarA.f18373o;
        if (zzclVar != null) {
            hp0Var.v(zzclVar);
        }
        a50 a50Var2 = a50Var.f11854b;
        v90 v90Var = new v90();
        v90Var.f21135a = context;
        v90Var.f21136b = ou0VarA;
        w90 w90Var = new w90(v90Var);
        ac0 ac0Var = new ac0();
        ac0Var.b(hp0Var, a50Var.b());
        bc0 bc0Var = new bc0(ac0Var);
        y40 y40Var = new y40(a50Var2, new vf(null, 15), new md0(i10, (ne0) vu0Var.f21274b, hp0Var.a()), new tc0(9), bc0Var, w90Var, new so0(29), null, null);
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            jw0 jw0Var2 = (jw0) y40Var.f22106e.zzb();
            jw0Var2.i(8);
            jw0Var2.c(zzmVar.zzp);
            jw0Var2.d(zzmVar.zzm);
            jw0Var = jw0Var2;
        } else {
            jw0Var = null;
        }
        ((xu0) a50Var.Q.zzb()).a(1);
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a50Var.f11858d.zzb();
        v80 v80Var = (v80) y40Var.f22116p.zzb();
        uv0 uv0VarC = v80Var.c(v80Var.b());
        s80 s80Var = new s80(k00Var, scheduledExecutorService, uv0VarC);
        this.f21140f = s80Var;
        uv0VarC.addListener(new zd1(i10, uv0VarC, new lj1(15, s80Var, new o8(this, (x11) mp0Var, jw0Var, fw0VarD, y40Var, 3))), k00Var);
        return true;
    }

    public v90 d(qv0 qv0Var) {
        return g(new rr(qv0Var, 13));
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public ListenableFuture e(lj1 lj1Var, kt0 kt0Var) {
        synchronized (this) {
            c50 c50VarB = kt0Var.b((jt0) lj1Var.f17037c);
            ct0 ct0Var = new ct0((String) this.f21138d);
            switch (c50VarB.f13042a) {
                case 0:
                    c50VarB.f13045d = ct0Var;
                    break;
                default:
                    c50VarB.f13045d = ct0Var;
                    break;
            }
            u90 u90Var = (u90) c50VarB.c();
            u90Var.zzb();
            u90Var.zzb();
            zzm zzmVar = u90Var.zzb().f18363d;
            if (zzmVar.zzs != null || zzmVar.zzx != null) {
                this.f21139e = u90Var;
                return ((md0) this.f21135a).d(lj1Var, kt0Var, u90Var);
            }
            ou0 ou0VarZzb = u90Var.zzb();
            zzm zzmVar2 = ou0VarZzb.f18363d;
            String str = ou0VarZzb.f18366g;
            zzx zzxVar = ou0VarZzb.f18370k;
            Executor executor = (Executor) this.f21140f;
            return zw1.x(vd1.r(((vu0) this.f21136b).i(u90Var)), new hn0(this, lj1Var, new bt0(kt0Var, lj1Var, zzmVar2, str, executor, zzxVar, null), kt0Var, u90Var, 1), executor);
        }
    }

    public void f(int i10) {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f21136b = Integer.valueOf(i10);
    }

    public v90 g(od1 od1Var) {
        yv0 yv0Var = (yv0) this.f21140f;
        fe1 fe1Var = yv0Var.f22378a;
        return new v90(yv0Var, this.f21135a, (String) this.f21136b, (ListenableFuture) this.f21137c, (List) this.f21138d, zw1.x((ListenableFuture) this.f21139e, od1Var, fe1Var));
    }

    public void h(int i10) {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f21137c = Integer.valueOf(i10);
    }

    public void i(int i10) {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f21138d = Integer.valueOf(i10);
    }

    public uf1 j() throws GeneralSecurityException {
        if (((Integer) this.f21135a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f21136b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f21137c) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f21138d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((sf1) this.f21139e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        sf1 sf1Var = (sf1) this.f21139e;
        if (sf1Var == sf1.f19953c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (sf1Var == sf1.f19954d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (sf1Var == sf1.f19955e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (sf1Var == sf1.f19956f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (sf1Var != sf1.f19957g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new uf1(((Integer) this.f21135a).intValue(), ((Integer) this.f21136b).intValue(), ((Integer) this.f21137c).intValue(), ((Integer) this.f21138d).intValue(), (tf1) this.f21140f, (sf1) this.f21139e);
    }

    public ListenableFuture k(fv0 fv0Var, lj1 lj1Var) {
        u90 u90Var = fv0Var.f14567a;
        this.f21139e = u90Var;
        if (fv0Var.f14569c != null) {
            if (u90Var.zzc() != null) {
                fv0Var.f14569c.f17338e.a(fv0Var.f14567a.zzc());
            }
            return zw1.d(fv0Var.f14569c);
        }
        u90Var.zza().f21108g = fv0Var.f14568b;
        return ((md0) this.f21135a).d(lj1Var, null, fv0Var.f14567a);
    }

    public v90 l(long j10) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        yv0 yv0Var = (yv0) this.f21140f;
        ScheduledExecutorService scheduledExecutorService = yv0Var.f22379b;
        return new v90(yv0Var, this.f21135a, (String) this.f21136b, (ListenableFuture) this.f21137c, (List) this.f21138d, zw1.v((ListenableFuture) this.f21139e, j10, timeUnit, scheduledExecutorService));
    }

    public uv0 m() {
        yv0 yv0Var = (yv0) this.f21140f;
        Object obj = this.f21135a;
        String str = (String) this.f21136b;
        if (str == null) {
            yv0Var.getClass();
            str = ((vv0) obj).f21302a;
        }
        uv0 uv0Var = new uv0((ListenableFuture) this.f21139e, obj, str);
        yv0Var.f22380c.S0(new x11(uv0Var, 26));
        ListenableFuture listenableFuture = (ListenableFuture) this.f21137c;
        gm0 gm0Var = new gm0(11, this, uv0Var);
        k00 k00Var = l00.f16615h;
        listenableFuture.addListener(gm0Var, k00Var);
        uv0Var.addListener(new zd1(0, uv0Var, new lj1(29, this, uv0Var)), k00Var);
        return uv0Var;
    }

    public void n(ci ciVar) {
        pb pbVar = new pb(4);
        if (((ca1) this.f21136b).isEmpty()) {
            o(pbVar, (r32) this.f21139e, ciVar);
            if (!Objects.equals((r32) this.f21140f, (r32) this.f21139e)) {
                o(pbVar, (r32) this.f21140f, ciVar);
            }
            if (!Objects.equals((r32) this.f21138d, (r32) this.f21139e) && !Objects.equals((r32) this.f21138d, (r32) this.f21140f)) {
                o(pbVar, (r32) this.f21138d, ciVar);
            }
        } else {
            for (int i10 = 0; i10 < ((ca1) this.f21136b).size(); i10++) {
                o(pbVar, (r32) ((ca1) this.f21136b).get(i10), ciVar);
            }
            if (!((ca1) this.f21136b).contains((r32) this.f21138d)) {
                o(pbVar, (r32) this.f21138d, ciVar);
            }
        }
        this.f21137c = pbVar.p(true);
    }

    public void o(pb pbVar, r32 r32Var, ci ciVar) {
        if (r32Var == null) {
            return;
        }
        if (ciVar.e(r32Var.f19359a) != -1) {
            pbVar.e(r32Var, ciVar);
            return;
        }
        ci ciVar2 = (ci) ((db1) this.f21137c).get(r32Var);
        if (ciVar2 != null) {
            pbVar.e(r32Var, ciVar2);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zza(View view) {
        if (((AtomicBoolean) this.f21140f).compareAndSet(false, true)) {
            ((d70) this.f21139e).k();
            ((oc0) this.f21138d).X0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        if (((AtomicBoolean) this.f21140f).get()) {
            ((ba0) this.f21135a).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zzc */
    public void mo169zzc() {
        if (((AtomicBoolean) this.f21140f).get()) {
            ((ma0) this.f21136b).zza();
            rc0 rc0Var = (rc0) this.f21137c;
            synchronized (rc0Var) {
                rc0Var.S0(xa0.D);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public Object zzd() {
        u90 u90Var;
        synchronized (this) {
            u90Var = (u90) this.f21139e;
        }
        return u90Var;
    }

    public v90(md0 md0Var, vu0 vu0Var, s sVar, String str, k00 k00Var) {
        this.f21135a = md0Var;
        this.f21136b = vu0Var;
        this.f21137c = sVar;
        this.f21138d = str;
        this.f21140f = k00Var;
    }

    public /* synthetic */ v90(String str) {
        this.f21136b = str;
    }

    public v90(yv0 yv0Var, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(yv0Var);
        this.f21140f = yv0Var;
        this.f21135a = obj;
        this.f21136b = str;
        this.f21137c = listenableFuture;
        this.f21138d = list;
        this.f21139e = listenableFuture2;
    }
}
