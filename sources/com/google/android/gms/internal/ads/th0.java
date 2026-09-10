package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class th0 implements sb0, zza, na0, ia0, fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tu0 f20384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yh0 f20385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ju0 f20386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final du0 f20387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ul0 f20388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20389g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f20391i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20390h = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f20393k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20392j = ((Boolean) zzba.zzc().a(am.S7)).booleanValue();

    public th0(Context context, tu0 tu0Var, yh0 yh0Var, ju0 ju0Var, du0 du0Var, ul0 ul0Var, String str) {
        this.f20383a = context;
        this.f20384b = tu0Var;
        this.f20385c = yh0Var;
        this.f20386d = ju0Var;
        this.f20387e = du0Var;
        this.f20388f = ul0Var;
        this.f20389g = str;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void C() {
        if (a()) {
            b("adapter_shown").m();
        }
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final void Z(fd0 fd0Var) {
        if (this.f20392j) {
            lj1 lj1VarB = b("ifts");
            lj1VarB.l("reason", "exception");
            if (!TextUtils.isEmpty(fd0Var.getMessage())) {
                lj1VarB.l(NotificationCompat.CATEGORY_MESSAGE, fd0Var.getMessage());
            }
            lj1VarB.m();
        }
    }

    public final boolean a() {
        String strZzr;
        if (this.f20391i == null) {
            synchronized (this) {
                if (this.f20391i == null) {
                    String str = (String) zzba.zzc().a(am.f12205j2);
                    zzt.zzc();
                    try {
                        strZzr = zzs.zzr(this.f20383a);
                    } catch (RemoteException unused) {
                        strZzr = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzr != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzr);
                        } catch (RuntimeException e10) {
                            zzt.zzh().d("CsiActionsListener.isPatternMatched", e10);
                        }
                    }
                    this.f20391i = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f20391i.booleanValue();
    }

    public final lj1 b(String str) {
        ju0 ju0Var = this.f20386d;
        uw uwVar = ju0Var.f16196b;
        lj1 lj1VarA = this.f20385c.a();
        lj1VarA.l("gqi", ((fu0) uwVar.f20920d).f14546b);
        du0 du0Var = this.f20387e;
        lj1VarA.k(du0Var);
        lj1VarA.l("action", str);
        lj1VarA.l("ad_format", this.f20389g.toUpperCase(Locale.ROOT));
        List list = du0Var.f13710t;
        if (!list.isEmpty()) {
            lj1VarA.l("ancn", (String) list.get(0));
        }
        if (du0Var.b()) {
            lj1VarA.l("device_connectivity", true != zzt.zzh().i(this.f20383a) ? "offline" : u.a.ONLINE_EXTRAS_KEY);
            ((p9.b) zzt.zzk()).getClass();
            lj1VarA.l("event_timestamp", String.valueOf(System.currentTimeMillis()));
            lj1VarA.l("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().a(am.Z7)).booleanValue()) {
            boolean zZza = zzv.zza(ju0Var);
            lj1VarA.l("scar", String.valueOf(zZza));
            if (zZza) {
                zzm zzmVar = ((ou0) ju0Var.f16195a.f20839b).f18363d;
                lj1VarA.l("ragent", zzmVar.zzp);
                lj1VarA.l("rtype", zzv.zzb(zzv.zzc(zzmVar)));
            }
        }
        return lj1VarA;
    }

    public final void e(lj1 lj1Var) {
        if (!this.f20387e.b()) {
            lj1Var.m();
            return;
        }
        ci0 ci0Var = ((yh0) lj1Var.f17037c).f22254a;
        String strGenerateUrl = ci0Var.f13174f.generateUrl((ConcurrentHashMap) lj1Var.f17036b);
        ((p9.b) zzt.zzk()).getClass();
        tb tbVar = new tb(((fu0) this.f20386d.f16196b.f20920d).f14546b, 2, strGenerateUrl, System.currentTimeMillis());
        ul0 ul0Var = this.f20388f;
        ul0Var.getClass();
        ul0Var.a(new md0(23, ul0Var, tbVar));
    }

    public final boolean f() {
        int i10 = this.f20387e.f13677b;
        return i10 == 2 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        boolean zA = a();
        du0 du0Var = this.f20387e;
        if (zA || du0Var.b()) {
            lj1 lj1VarB = b("impression");
            lj1VarB.l("imp_type", String.valueOf(du0Var.f13683e));
            if (this.f20390h > 0) {
                ((p9.b) zzt.zzk()).getClass();
                lj1VarB.l("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f20390h));
            }
            if (((Boolean) zzba.zzc().a(am.f12261mf)).booleanValue() && f()) {
                zzt.zzc();
                lj1VarB.l(DownloadService.KEY_FOREGROUND, true != zzs.zzJ(this.f20383a) ? "1" : "0");
                lj1VarB.l("fg_show", true == this.f20393k.get() ? "1" : "0");
            }
            e(lj1VarB);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f20387e.b()) {
            e(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void z() {
        if (a()) {
            lj1 lj1VarB = b("adapter_impression");
            lj1VarB.l("imp_type", String.valueOf(this.f20387e.f13683e));
            if (this.l.get()) {
                lj1VarB.l("po", "1");
                ((p9.b) zzt.zzk()).getClass();
                lj1VarB.l("pil", String.valueOf(System.currentTimeMillis() - this.f20390h));
            } else {
                lj1VarB.l("po", "0");
            }
            if (((Boolean) zzba.zzc().a(am.f12261mf)).booleanValue() && f()) {
                zzt.zzc();
                lj1VarB.l(DownloadService.KEY_FOREGROUND, true != zzs.zzJ(this.f20383a) ? "1" : "0");
                lj1VarB.l("fg_show", true != this.f20393k.get() ? "0" : "1");
            }
            if (((Boolean) zzba.zzc().a(am.f12276nf)).booleanValue() && f()) {
                lj1VarB.l("fg_al", true == zzt.zzg().e() ? "1" : "0");
            }
            lj1VarB.m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.ia0
    public final void zzc(zze zzeVar) {
        String strGroup;
        zze zzeVar2;
        if (this.f20392j) {
            lj1 lj1VarB = b("ifts");
            lj1VarB.l("reason", O6.G1);
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                lj1VarB.l("arec", String.valueOf(i10));
            }
            Pattern pattern = this.f20384b.f20515a;
            if (pattern == null || str == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                lj1VarB.l("areec", strGroup);
            }
            lj1VarB.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.ia0
    public final void zze() {
        if (this.f20392j) {
            lj1 lj1VarB = b("ifts");
            lj1VarB.l("reason", "blocked");
            lj1VarB.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void zzk() {
        if (a()) {
            this.l.set(true);
            ((p9.b) zzt.zzk()).getClass();
            this.f20390h = System.currentTimeMillis();
            lj1 lj1VarB = b("presentation");
            if (((Boolean) zzba.zzc().a(am.f12261mf)).booleanValue() && f()) {
                zzt.zzc();
                boolean z10 = !zzs.zzJ(this.f20383a);
                AtomicBoolean atomicBoolean = this.f20393k;
                atomicBoolean.set(z10);
                lj1VarB.l(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) zzba.zzc().a(am.f12276nf)).booleanValue() && f()) {
                lj1VarB.l("fg_al", true != zzt.zzg().e() ? "0" : "1");
            }
            lj1VarB.m();
        }
    }
}
