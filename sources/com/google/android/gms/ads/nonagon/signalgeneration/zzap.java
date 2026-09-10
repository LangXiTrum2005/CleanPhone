package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ae1;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.be1;
import com.google.android.gms.internal.ads.ca1;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.d81;
import com.google.android.gms.internal.ads.fd1;
import com.google.android.gms.internal.ads.fe1;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.n50;
import com.google.android.gms.internal.ads.nd1;
import com.google.android.gms.internal.ads.ng0;
import com.google.android.gms.internal.ads.nu0;
import com.google.android.gms.internal.ads.od1;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.ads.pd1;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.pu0;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.w90;
import com.google.android.gms.internal.ads.xu0;
import com.google.android.gms.internal.ads.xw;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zw1;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import d5.o;
import d5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import s9.a;
import s9.b;
import u.g;
import u.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzap extends sz {
    public static final ArrayList G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    public final AtomicBoolean A;
    public final AtomicBoolean B;
    public final AtomicInteger C;
    public final qm D;
    public final zzj E;
    public final zza F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50 f11396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf f11398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu0 f11399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xu0 f11400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fe1 f11401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f11402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public xw f11403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Point f11404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Point f11405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ci0 f11406k;
    public final mx0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicInteger f11413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f11414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f11417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f11418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f11419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f11420z;

    public zzap(a50 a50Var, Context context, qf qfVar, xu0 xu0Var, fe1 fe1Var, ScheduledExecutorService scheduledExecutorService, ci0 ci0Var, mx0 mx0Var, VersionInfoParcel versionInfoParcel, qm qmVar, pu0 pu0Var, zzj zzjVar, zza zzaVar) {
        ArrayList arrayListF1;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f11404i = new Point();
        this.f11405j = new Point();
        this.f11413s = new AtomicInteger(0);
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
        this.C = new AtomicInteger(0);
        this.f11396a = a50Var;
        this.f11397b = context;
        this.f11398c = qfVar;
        this.f11399d = pu0Var;
        this.f11400e = xu0Var;
        this.f11401f = fe1Var;
        this.f11402g = scheduledExecutorService;
        this.f11406k = ci0Var;
        this.l = mx0Var;
        this.f11414t = versionInfoParcel;
        this.D = qmVar;
        this.f11407m = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12316q8)).booleanValue();
        this.f11408n = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12301p8)).booleanValue();
        this.f11409o = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12345s8)).booleanValue();
        this.f11410p = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12376u8)).booleanValue();
        this.f11411q = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12361t8);
        this.f11412r = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.v8);
        this.f11416v = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12405w8);
        this.E = zzjVar;
        this.F = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12422x8)).booleanValue()) {
            this.f11417w = F1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12438y8));
            this.f11418x = F1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12454z8));
            this.f11419y = F1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.A8));
            arrayListF1 = F1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.B8));
        } else {
            this.f11417w = G;
            this.f11418x = H;
            this.f11419y = I;
            arrayListF1 = J;
        }
        this.f11420z = arrayListF1;
    }

    public static boolean B1(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri E1(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
        u.r(sb2, str, X3.j.f27830b, str2, X3.j.f27832c);
        sb2.append(string.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static final ArrayList F1(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!pi1.l(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ jw0 G1(ListenableFuture listenableFuture, xz xzVar) {
        if (kw0.a() && ((Boolean) an.f12468e.o()).booleanValue()) {
            try {
                jw0 jw0VarZzb = ((zzx) zw1.G(listenableFuture)).zzb();
                jw0VarZzb.b(new ArrayList(Collections.singletonList(xzVar.f22047b)));
                com.google.android.gms.ads.internal.client.zzm zzmVar = xzVar.f22049d;
                jw0VarZzb.c(zzmVar == null ? "" : zzmVar.zzp);
                jw0VarZzb.d(zzmVar.zzm);
                return jw0VarZzb;
            } catch (ExecutionException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e10);
            }
        }
        return null;
    }

    public final void A1() {
        zzap zzapVar;
        ListenableFuture listenableFutureL;
        if (((Boolean) ln.f17066e.o()).booleanValue()) {
            this.E.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Jc)).booleanValue()) {
            listenableFutureL = zw1.r(new nd1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.nd1
                /* JADX INFO: renamed from: zza */
                public final /* synthetic */ ListenableFuture mo162zza() {
                    zzap zzapVar2 = this.f11384a;
                    try {
                        return zzapVar2.C1(zzapVar2.f11397b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                    } catch (NullPointerException e10) {
                        return zw1.l(e10);
                    }
                }
            }, l00.f16608a);
            zzapVar = this;
        } else {
            try {
                zzapVar = this;
                try {
                    listenableFutureL = zzapVar.C1(this.f11397b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                } catch (NullPointerException e10) {
                    e = e10;
                    listenableFutureL = zw1.l(e);
                }
            } catch (NullPointerException e11) {
                e = e11;
                zzapVar = this;
            }
        }
        zzab zzabVar = new zzab(zzapVar);
        listenableFutureL.addListener(new zd1(0, listenableFutureL, zzabVar), zzapVar.f11396a.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    public final n50 C1(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        nu0 nu0Var = new nu0();
        boolean zEquals = "REWARDED".equals(str2);
        o oVar = nu0Var.f17970o;
        if (zEquals) {
            oVar.f38703b = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            oVar.f38703b = 3;
        }
        a50 a50Var = this.f11396a.f11854b;
        v90 v90Var = new v90();
        v90Var.f21135a = context;
        if (str == null) {
            str = "adUnitId";
        }
        nu0Var.f17959c = str;
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        nu0Var.f17957a = zzmVar;
        if (zzrVar == null) {
            switch (str2) {
                case "NATIVE":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
                    break;
                case "APP_OPEN_AD":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzd();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzc();
                    break;
                case "BANNER":
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
                    break;
                default:
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
            }
        }
        nu0Var.f17958b = zzrVar;
        nu0Var.f17974s = true;
        nu0Var.f17975t = bundle;
        v90Var.f21136b = nu0Var.a();
        w90 w90Var = new w90(v90Var);
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzat zzatVar = new zzat(zzasVar);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return new n50(a50Var, zzatVar, w90Var);
    }

    public final vd1 D1(final String str) {
        final ng0[] ng0VarArr = new ng0[1];
        ListenableFuture listenableFutureB = this.f11400e.b();
        od1 od1Var = new od1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.od1
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                ng0 ng0Var = (ng0) obj;
                zzap zzapVar = this.f11390a;
                zzapVar.getClass();
                ng0VarArr[0] = ng0Var;
                Context context = zzapVar.f11397b;
                xw xwVar = zzapVar.f11403h;
                Map map = xwVar.f22010b;
                JSONObject jSONObjectZze = zzbs.zze(context, map, map, xwVar.f22009a, null);
                JSONObject jSONObjectZzb = zzbs.zzb(zzapVar.f11397b, zzapVar.f11403h.f22009a);
                JSONObject jSONObjectZzc = zzbs.zzc(zzapVar.f11403h.f22009a);
                JSONObject jSONObjectZzd = zzbs.zzd(zzapVar.f11397b, zzapVar.f11403h.f22009a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectZze);
                jSONObject.put("ad_view_signal", jSONObjectZzb);
                jSONObject.put("scroll_view_signal", jSONObjectZzc);
                jSONObject.put("lock_screen_signal", jSONObjectZzd);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbs.zzf(null, zzapVar.f11397b, zzapVar.f11405j, zzapVar.f11404i));
                }
                return ng0Var.a(str2, jSONObject);
            }
        };
        fe1 fe1Var = this.f11401f;
        fd1 fd1VarX = zw1.x(listenableFutureB, od1Var, fe1Var);
        fd1VarX.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final void run() {
                zzap zzapVar = this.f11377a;
                ng0 ng0Var = ng0VarArr[0];
                if (ng0Var != null) {
                    xu0 xu0Var = zzapVar.f11400e;
                    be1 be1VarD = zw1.d(ng0Var);
                    synchronized (xu0Var) {
                        xu0Var.f22005a.addFirst(be1VarD);
                    }
                }
            }
        }, fe1Var);
        return zw1.t(zw1.z((vd1) zw1.v(vd1.r(fd1VarX), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.H8)).intValue(), TimeUnit.MILLISECONDS, this.f11402g), zzal.f11388a, fe1Var), Exception.class, zzam.f11389a, fe1Var);
    }

    public final void x1(final List list, final a aVar, sw swVar, boolean z10) {
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.G8)).booleanValue()) {
            try {
                qw qwVar = (qw) swVar;
                Parcel parcelQ = qwVar.q();
                parcelQ.writeString("The updating URL feature is not enabled.");
                qwVar.m0(parcelQ, 2);
                return;
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzap zzapVar = this.f11374a;
                of ofVar = zzapVar.f11398c.f19044b;
                String strZzj = ofVar != null ? ofVar.zzj(zzapVar.f11397b, (View) b.y1(aVar), null) : "";
                if (TextUtils.isEmpty(strZzj)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (zzap.B1(uri, zzapVar.f11419y, zzapVar.f11420z)) {
                        arrayList.add(zzap.E1(uri, "ms", strZzj));
                    } else {
                        String strValueOf = String.valueOf(uri);
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            }
        };
        k00 k00Var = (k00) this.f11401f;
        ListenableFuture listenableFutureB = k00Var.b(callable);
        xw xwVar = this.f11403h;
        if (xwVar == null || (map = xwVar.f22010b) == null || map.isEmpty()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        } else {
            listenableFutureB = zw1.x(listenableFutureB, new od1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.od1
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    final ArrayList arrayList = (ArrayList) obj;
                    final zzap zzapVar = this.f11379a;
                    return zw1.z(zzapVar.D1("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new d81() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                        @Override // com.google.android.gms.internal.ads.d81
                        public final Object apply(Object obj2) {
                            String str = (String) obj2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : arrayList) {
                                zzap zzapVar2 = zzapVar;
                                if (!zzap.B1(uri, zzapVar2.f11419y, zzapVar2.f11420z) || TextUtils.isEmpty(str)) {
                                    arrayList2.add(uri);
                                } else {
                                    arrayList2.add(zzap.E1(uri, "nas", str));
                                }
                            }
                            return arrayList2;
                        }
                    }, zzapVar.f11401f);
                }
            }, k00Var);
        }
        listenableFutureB.addListener(new zd1(0, listenableFutureB, new zzz(this, swVar, z10)), this.f11396a.b());
    }

    public final void y1(List list, final a aVar, sw swVar, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ListenableFuture listenableFutureX;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.G8)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                qw qwVar = (qw) swVar;
                Parcel parcelQ = qwVar.q();
                parcelQ.writeString("The updating URL feature is not enabled.");
                qwVar.m0(parcelQ, 2);
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f11418x;
            arrayList2 = this.f11417w;
            if (!zHasNext) {
                break;
            } else if (B1((Uri) it.next(), arrayList2, arrayList)) {
                i12++;
            }
        }
        if (i12 > 1) {
            String strValueOf = String.valueOf(list);
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (B1(uri, arrayList2, arrayList)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() throws Exception {
                        pu0 pu0Var;
                        Uri uriB = uri;
                        try {
                            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Hd)).booleanValue();
                            zzap zzapVar = this.f11380a;
                            a aVar2 = aVar;
                            uriB = (!zBooleanValue || (pu0Var = zzapVar.f11399d) == null) ? zzapVar.f11398c.b(uriB, zzapVar.f11397b, (View) b.y1(aVar2), null) : pu0Var.a(uriB, zzapVar.f11397b, (View) b.y1(aVar2), null);
                        } catch (rf e11) {
                            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e11);
                        }
                        if (uriB.getQueryParameter("ms") != null) {
                            return uriB;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                k00 k00Var = (k00) this.f11401f;
                ListenableFuture listenableFutureB = k00Var.b(callable);
                xw xwVar = this.f11403h;
                if (xwVar == null || (map = xwVar.f22010b) == null || map.isEmpty()) {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                    listenableFutureX = listenableFutureB;
                } else {
                    listenableFutureX = zw1.x(listenableFutureB, new od1() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.od1
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            final Uri uri2 = (Uri) obj;
                            zzap zzapVar = this.f11383a;
                            return zw1.z(zzapVar.D1("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new d81() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                                @Override // com.google.android.gms.internal.ads.d81
                                public final /* synthetic */ Object apply(Object obj2) {
                                    String str = (String) obj2;
                                    ArrayList arrayList4 = zzap.G;
                                    boolean zIsEmpty = TextUtils.isEmpty(str);
                                    Uri uri3 = uri2;
                                    return !zIsEmpty ? zzap.E1(uri3, "nas", str) : uri3;
                                }
                            }, zzapVar.f11401f);
                        }
                    }, k00Var);
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                listenableFutureX = zw1.d(uri);
            }
            arrayList3.add(listenableFutureX);
        }
        pd1 pd1Var = new pd1(ca1.y(arrayList3), true);
        pd1Var.addListener(new zd1(i11, pd1Var, new zzaa(this, swVar, z10)), this.f11396a.b());
    }

    public final void z1() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12199ib)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12244lb)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12304pb)).booleanValue() && this.A.getAndSet(true)) {
                return;
            }
            A1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
    @Override // com.google.android.gms.internal.ads.tz
    public final void zze(a aVar, final xz xzVar, @Nullable qz qzVar) {
        ListenableFuture listenableFutureL;
        ListenableFuture listenableFuture;
        zzap zzapVar;
        ListenableFuture listenableFutureL2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.S2)).booleanValue()) {
            bundle.putLong("api-call", xzVar.f22049d.zzz);
            ((p9.b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f11397b = (Context) b.y1(aVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        fw0 fw0VarF = fw0.f(this.f11397b, 22);
        fw0VarF.zza();
        if ("UNKNOWN".equals(xzVar.f22047b)) {
            List arrayList = new ArrayList();
            ul ulVar = am.F8;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(ulVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(ulVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(xzVar.f22049d))) {
                ae1 ae1VarL = zw1.l(new IllegalArgumentException("Unknown format is no longer supported."));
                zzapVar = this;
                listenableFuture = ae1VarL;
                listenableFutureL = zw1.l(new IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Jc)).booleanValue()) {
                    k00 k00Var = l00.f16608a;
                    ListenableFuture listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            zzap zzapVar2 = this.f11393a;
                            Context context = zzapVar2.f11397b;
                            xz xzVar2 = xzVar;
                            return zzapVar2.C1(context, xzVar2.f22046a, xzVar2.f22047b, xzVar2.f22048c, xzVar2.f22049d, bundle);
                        }
                    });
                    try {
                        listenableFutureL2 = zw1.x(listenableFutureB, zzac.f11373a, k00Var);
                    } catch (NullPointerException e10) {
                        listenableFutureL2 = zw1.l(e10);
                    }
                    zzapVar = this;
                    listenableFutureL = listenableFutureL2;
                    listenableFuture = listenableFutureB;
                } else {
                    n50 n50VarC1 = C1(this.f11397b, xzVar.f22046a, xzVar.f22047b, xzVar.f22048c, xzVar.f22049d, bundle);
                    be1 be1VarD = zw1.d(n50VarC1);
                    try {
                        listenableFutureL = n50VarC1.zza();
                    } catch (NullPointerException e11) {
                        listenableFutureL = zw1.l(e11);
                    }
                    listenableFuture = be1VarD;
                    zzapVar = this;
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Jc)).booleanValue()) {
                k00 k00Var2 = l00.f16608a;
                ListenableFuture listenableFutureB2 = k00Var2.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        zzap zzapVar2 = this.f11393a;
                        Context context = zzapVar2.f11397b;
                        xz xzVar2 = xzVar;
                        return zzapVar2.C1(context, xzVar2.f22046a, xzVar2.f22047b, xzVar2.f22048c, xzVar2.f22049d, bundle);
                    }
                });
                listenableFutureL2 = zw1.x(listenableFutureB2, zzac.f11373a, k00Var2);
                zzapVar = this;
                listenableFutureL = listenableFutureL2;
                listenableFuture = listenableFutureB2;
            } else {
                n50 n50VarC2 = C1(this.f11397b, xzVar.f22046a, xzVar.f22047b, xzVar.f22048c, xzVar.f22049d, bundle);
                be1 be1VarD2 = zw1.d(n50VarC2);
                listenableFutureL = n50VarC2.zza();
                listenableFuture = be1VarD2;
                zzapVar = this;
            }
        }
        zzy zzyVar = new zzy(zzapVar, listenableFuture, xzVar, qzVar, fw0VarF);
        listenableFutureL.addListener(new zd1(0, listenableFutureL, zzyVar), zzapVar.f11396a.b());
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzf(a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.G8)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.y1(aVar);
            xw xwVar = this.f11403h;
            this.f11404i = zzbs.zzh(motionEvent, xwVar == null ? null : xwVar.f22009a);
            if (motionEvent.getAction() == 0) {
                this.f11405j = this.f11404i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f11404i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f11398c.f19044b.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzg(List list, a aVar, sw swVar) {
        x1(list, aVar, swVar, false);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzh(List list, a aVar, sw swVar) {
        y1(list, aVar, swVar, false);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzi(xw xwVar) {
        this.f11403h = xwVar;
        this.f11400e.a(1);
    }

    @Override // com.google.android.gms.internal.ads.tz
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12182hb)).booleanValue()) {
            ul ulVar = am.E8;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(ulVar)).booleanValue()) {
                z1();
            }
            WebView webView = (WebView) b.y1(aVar);
            if (webView == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            k00 k00Var = l00.f16613f;
            zza zzaVar = this.F;
            zze zzeVar = new zze(webView, zzaVar, k00Var);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f11398c, this.f11406k, this.l, this.f11399d, this.E, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12332rb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().l.incrementAndGet();
            }
            if (((Boolean) ln.f17064c.o()).booleanValue()) {
                zzaVar.zza(webView);
                if (((Boolean) ln.f17065d.o()).booleanValue()) {
                    zzeVar.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(ulVar)).booleanValue()) {
                z1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzk(List list, a aVar, sw swVar) {
        x1(list, aVar, swVar, true);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzl(List list, a aVar, sw swVar) {
        y1(list, aVar, swVar, true);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final a zzm(a aVar, a aVar2, String str, a aVar3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12394vb)).booleanValue()) {
            return new b(null);
        }
        Context context = (Context) b.y1(aVar);
        g gVar = (g) b.y1(aVar2);
        u.a aVar4 = (u.a) b.y1(aVar3);
        qm qmVar = this.D;
        qmVar.getClass();
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        qmVar.l = context;
        qmVar.f19122h = str;
        ci0 ci0Var = qmVar.f19118d;
        om omVar = new om(qmVar, aVar4, ci0Var);
        qmVar.f19120f = omVar;
        l lVarC = gVar.c(omVar);
        qmVar.f19121g = lVarC;
        if (lVarC == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        zzv.zze(ci0Var, null, "pact_action", new Pair("pe", "pact_init"));
        if (((Boolean) ln.f17066e.o()).booleanValue()) {
            this.E.zza();
        }
        if (((Boolean) ln.f17064c.o()).booleanValue()) {
            this.F.zza(null);
        }
        return new b(qmVar.f19121g);
    }
}
