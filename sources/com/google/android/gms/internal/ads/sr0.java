package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr0 implements nd1, cz1, p1.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20042f;

    public /* synthetic */ sr0(ur0 ur0Var, String str, List list, Bundle bundle, boolean z10, boolean z11) {
        this.f20039c = ur0Var;
        this.f20040d = str;
        this.f20041e = list;
        this.f20042f = bundle;
        this.f20037a = z10;
        this.f20038b = z11;
    }

    @Override // p1.l0
    public void a(i1.g0 g0Var) {
        p1.l0 l0Var = (p1.l0) this.f20042f;
        if (l0Var != null) {
            l0Var.a(g0Var);
            g0Var = ((p1.l0) this.f20042f).getPlaybackParameters();
        }
        ((ea.z0) this.f20039c).a(g0Var);
    }

    @Override // p1.l0
    public boolean b() {
        if (this.f20037a) {
            ((ea.z0) this.f20039c).getClass();
            return false;
        }
        p1.l0 l0Var = (p1.l0) this.f20042f;
        l0Var.getClass();
        return l0Var.b();
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public void c(cc ccVar) {
        cz1 cz1Var = (cz1) this.f20042f;
        if (cz1Var != null) {
            cz1Var.c(ccVar);
            ccVar = ((cz1) this.f20042f).zzj();
        }
        ((yz1) this.f20039c).c(ccVar);
    }

    public void d(p1.a aVar) {
        p1.l0 l0Var;
        p1.l0 l0VarG = aVar.g();
        if (l0VarG == null || l0VarG == (l0Var = (p1.l0) this.f20042f)) {
            return;
        }
        if (l0Var != null) {
            throw new p1.h(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f20042f = l0VarG;
        this.f20041e = aVar;
        ((r1.c0) l0VarG).a((i1.g0) ((ea.z0) this.f20039c).f39935e);
    }

    public void e(ux1 ux1Var) {
        cz1 cz1Var;
        cz1 cz1VarY = ux1Var.y();
        if (cz1VarY == null || cz1VarY == (cz1Var = (cz1) this.f20042f)) {
            return;
        }
        if (cz1Var != null) {
            throw new dy1(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f20042f = cz1VarY;
        this.f20041e = ux1Var;
        ((w12) cz1VarY).c((cc) ((yz1) this.f20039c).f22420e);
    }

    @Override // p1.l0
    public i1.g0 getPlaybackParameters() {
        p1.l0 l0Var = (p1.l0) this.f20042f;
        return l0Var != null ? l0Var.getPlaybackParameters() : (i1.g0) ((ea.z0) this.f20039c).f39935e;
    }

    @Override // p1.l0
    public long getPositionUs() {
        if (this.f20037a) {
            return ((ea.z0) this.f20039c).getPositionUs();
        }
        p1.l0 l0Var = (p1.l0) this.f20042f;
        l0Var.getClass();
        return l0Var.getPositionUs();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.nd1
    /* JADX INFO: renamed from: zza */
    public ListenableFuture mo162zza() {
        av avVar;
        av avVarB;
        final ur0 ur0Var = (ur0) this.f20039c;
        String str = (String) this.f20040d;
        final List list = (List) this.f20041e;
        final Bundle bundle = (Bundle) this.f20042f;
        boolean z10 = this.f20037a;
        boolean z11 = this.f20038b;
        final m00 m00Var = new m00();
        if (z11) {
            if (((Boolean) zzba.zzc().a(am.f12371u2)).booleanValue()) {
                try {
                    avVarB = ur0Var.f20871g.b(str);
                } catch (RemoteException e10) {
                    zze.zzb("Couldn't create RTB adapter : ", e10);
                    avVar = null;
                }
            } else {
                vo0 vo0Var = ur0Var.f20870f;
                vo0Var.getClass();
                try {
                    vo0Var.f21220a.put(str, vo0Var.f21221b.b(str));
                } catch (RemoteException e11) {
                    zze.zzb("Couldn't create RTB adapter : ", e11);
                }
                ConcurrentHashMap concurrentHashMap = vo0Var.f21220a;
                avVarB = concurrentHashMap.containsKey(str) ? (av) concurrentHashMap.get(str) : null;
            }
            avVar = avVarB;
        } else {
            avVarB = ur0Var.f20871g.b(str);
            avVar = avVarB;
        }
        if (avVar == null) {
            if (!((Boolean) zzba.zzc().a(am.f12221k2)).booleanValue()) {
                throw null;
            }
            int i10 = ap0.f12475e;
            synchronized (ap0.class) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", str);
                        jSONObject.put("signal_error", "Adapter failed to instantiate");
                        if (((Boolean) zzba.zzc().a(am.f12311q2)).booleanValue()) {
                            jSONObject.put("signal_error_code", 1);
                        }
                        m00Var.zzc(jSONObject);
                    } catch (JSONException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m00Var;
        }
        ((p9.b) zzt.zzk()).getClass();
        final ap0 ap0Var = new ap0(str, avVar, m00Var, SystemClock.elapsedRealtime());
        if (((Boolean) zzba.zzc().a(am.f12295p2)).booleanValue()) {
            ur0Var.f20866b.schedule(new x60(ap0Var, 20), ((Long) zzba.zzc().a(am.f12190i2)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (z10) {
            if (!((Boolean) zzba.zzc().a(am.f12401w2)).booleanValue()) {
                avVar.W(new s9.b(ur0Var.f20868d), ur0Var.f20873i, bundle, (Bundle) list.get(0), ur0Var.f20869e.f18365f, ap0Var);
                return m00Var;
            }
            final av avVar2 = avVar;
            ((k00) ur0Var.f20865a).a(new Runnable() { // from class: com.google.android.gms.internal.ads.tr0
                @Override // java.lang.Runnable
                public final void run() {
                    ur0 ur0Var2 = ur0Var;
                    av avVar3 = avVar2;
                    Bundle bundle2 = bundle;
                    List list2 = list;
                    ap0 ap0Var2 = ap0Var;
                    try {
                        avVar3.W(new s9.b(ur0Var2.f20868d), ur0Var2.f20873i, bundle2, (Bundle) list2.get(0), ur0Var2.f20869e.f18365f, ap0Var2);
                    } catch (RemoteException e12) {
                        m00Var.zzd(e12);
                    }
                }
            });
            return m00Var;
        }
        synchronized (ap0Var) {
            if (ap0Var.f12479d) {
                return m00Var;
            }
            try {
                if (((Boolean) zzba.zzc().a(am.f12311q2)).booleanValue()) {
                    ap0Var.f12477b.put("signal_error_code", 0);
                }
            } catch (JSONException unused2) {
            }
            ap0Var.f12476a.zzc(ap0Var.f12477b);
            ap0Var.f12479d = true;
            return m00Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public long zzg() {
        if (this.f20037a) {
            return ((yz1) this.f20039c).zzg();
        }
        cz1 cz1Var = (cz1) this.f20042f;
        cz1Var.getClass();
        return cz1Var.zzg();
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public boolean zzh() {
        if (this.f20037a) {
            return false;
        }
        cz1 cz1Var = (cz1) this.f20042f;
        cz1Var.getClass();
        return cz1Var.zzh();
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public cc zzj() {
        cz1 cz1Var = (cz1) this.f20042f;
        return cz1Var != null ? cz1Var.zzj() : (cc) ((yz1) this.f20039c).f22420e;
    }

    public sr0(wy1 wy1Var) {
        this.f20040d = wy1Var;
        yz1 yz1Var = new yz1();
        yz1Var.f22420e = cc.f13129d;
        this.f20039c = yz1Var;
        this.f20037a = true;
    }

    public sr0(p1.h0 h0Var, l1.u uVar) {
        this.f20040d = h0Var;
        this.f20039c = new ea.z0(uVar);
        this.f20037a = true;
    }

    public sr0(Context context) {
        this.f20037a = true;
        this.f20038b = false;
        this.f20039c = context;
    }
}
