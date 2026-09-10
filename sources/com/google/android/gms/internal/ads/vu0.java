package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vu0 implements j, n7, ba, k9.b, MediationAdLoadCallback, MediationBannerListener, MediationInterstitialListener, MediationNativeListener, zb0, qv0, gd0, lt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static vu0 f21270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f21271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f21272g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21276d;

    static {
        long j10 = C.TIME_UNSET;
        f21271f = new a0(j10, 2, false);
        f21272g = new a0(j10, 3, false);
    }

    public /* synthetic */ vu0(int i10, Object obj, Object obj2) {
        this.f21273a = i10;
        this.f21274b = obj;
        this.f21275c = obj2;
    }

    public static vu0 h(Context context) {
        synchronized (vu0.class) {
            try {
                vu0 vu0Var = f21270e;
                if (vu0Var != null) {
                    return vu0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) gn.f14903b.o()).longValue();
                zzcv zzcvVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254730000) {
                    try {
                        zzcvVarAsInterface = zzcu.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                        int i10 = zze.zza;
                        zzo.zzg("Failed to retrieve lite SDK info.", e10);
                    }
                }
                vu0 vu0Var2 = new vu0(applicationContext, zzcvVarAsInterface);
                f21270e = vu0Var2;
                return vu0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final boolean p(String str) {
        if (((Boolean) zzba.zzc().a(am.Bb)).booleanValue()) {
            k9.c0.h(str);
            if (str.length() > ((Integer) zzba.zzc().a(am.Db)).intValue()) {
                zzo.zzd("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void a(st0 st0Var, o2 o2Var, ga gaVar) {
        this.f21275c = st0Var;
        gaVar.c();
        gaVar.d();
        h3 h3VarE = o2Var.e(gaVar.f14805d, 5);
        this.f21276d = h3VarE;
        h3VarE.f((g22) this.f21274b);
    }

    @Override // com.google.android.gms.internal.ads.n7
    public ArrayList b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list = (List) this.f21274b;
            if (i11 >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.f21275c;
            int i12 = i11 + i11;
            if (jArr[i12] <= j10 && j10 < jArr[i12 + 1]) {
                v8 v8Var = (v8) list.get(i11);
                l80 l80Var = v8Var.f21099a;
                if (l80Var.f16801e == -3.4028235E38f) {
                    arrayList2.add(v8Var);
                } else {
                    arrayList.add(l80Var);
                }
            }
            i11++;
        }
        Collections.sort(arrayList2, b.f12568n);
        while (i10 < arrayList2.size()) {
            l80 l80Var2 = ((v8) arrayList2.get(i10)).f21099a;
            arrayList.add(new l80(l80Var2.f16797a, l80Var2.f16798b, l80Var2.f16799c, l80Var2.f16800d, (-1) - i10, 1, l80Var2.f16803g, l80Var2.f16804h, l80Var2.f16805i, l80Var2.l, l80Var2.f16808m, l80Var2.f16806j, l80Var2.f16807k, l80Var2.f16809n, l80Var2.f16810o, l80Var2.f16811p));
            i10++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) throws fd0 {
        switch (this.f21273a) {
            case 23:
                try {
                    zzt.zzb();
                    zzn.zza(context, (AdOverlayInfoParcel) ((m00) this.f21274b).get(), true, (yh0) ((in0) this.f21276d).f15808f);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    wu0 wu0Var = (wu0) ((qm0) this.f21274b).f19127b;
                    wu0Var.b(z10);
                    ut utVar = wu0Var.f21609a;
                    if (((VersionInfoParcel) ((gn0) this.f21276d).f14908d).clientJarVersion < ((Integer) zzba.zzc().a(am.f12415x1)).intValue()) {
                        try {
                            utVar.zzh();
                            return;
                        } catch (Throwable th2) {
                            throw new qu0(th2);
                        }
                    } else {
                        try {
                            utVar.l1(new s9.b(context));
                            return;
                        } catch (Throwable th3) {
                            throw new qu0(th3);
                        }
                    }
                } catch (qu0 e10) {
                    int i10 = zze.zza;
                    zzo.zzh("Cannot show interstitial.");
                    throw new fd0(e10.getCause());
                }
                int i11 = zze.zza;
                zzo.zzh("Cannot show interstitial.");
                throw new fd0(e10.getCause());
        }
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        t6.l lVar = (t6.l) this.f21276d;
        synchronized (lVar.f50551d) {
            try {
                if (lVar.f50549b) {
                    return;
                }
                lVar.f50549b = true;
                hj hjVar = (hj) lVar.f50550c;
                if (hjVar == null) {
                    return;
                }
                k00 k00Var = l00.f16608a;
                ij ijVar = (ij) this.f21274b;
                kj kjVar = (kj) this.f21275c;
                kjVar.addListener(new zd1(6, kjVar, k00Var.a(new hz1(this, hjVar, ijVar, kjVar, 2))), l00.f16615h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* bridge */ /* synthetic */ ListenableFuture e(lj1 lj1Var, kt0 kt0Var) {
        return i(null);
    }

    @Override // com.google.android.gms.internal.ads.j
    public ya1 f(int i10, ni niVar, int[] iArr) {
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < niVar.f17829a) {
            int i13 = i10;
            ni niVar2 = niVar;
            i iVar = new i(i13, niVar2, i11, (h) this.f21274b, iArr[i11], (String) this.f21275c, (String) this.f21276d);
            int length = objArrCopyOf.length;
            int i14 = i12 + 1;
            int iD = x91.d(length, i14);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = iVar;
            i11++;
            i12 = i14;
            i10 = i13;
            niVar = niVar2;
        }
        return ca1.A(i12, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void g(np0 np0Var) {
        long jA;
        long j10;
        ((st0) this.f21275c).getClass();
        String str = uu0.f20901a;
        st0 st0Var = (st0) this.f21275c;
        synchronized (st0Var) {
            try {
                long j11 = st0Var.f20050c;
                jA = j11 != C.TIME_UNSET ? j11 + st0Var.f20049b : st0Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        st0 st0Var2 = (st0) this.f21275c;
        synchronized (st0Var2) {
            j10 = st0Var2.f20049b;
        }
        if (jA == C.TIME_UNSET || j10 == C.TIME_UNSET) {
            return;
        }
        g22 g22Var = (g22) this.f21274b;
        if (j10 != g22Var.f14683t) {
            i12 i12Var = new i12(g22Var);
            i12Var.f15516s = j10;
            g22 g22Var2 = new g22(i12Var);
            this.f21274b = g22Var2;
            ((h3) this.f21276d).f(g22Var2);
        }
        int iB = np0Var.B();
        ((h3) this.f21276d).b(iB, np0Var);
        ((h3) this.f21276d).c(jA, 1, iB, 0, null);
    }

    public vd1 i(u90 u90Var) {
        ListenableFuture listenableFutureD;
        ListenableFuture listenableFutureT;
        vu0 vu0Var = (vu0) this.f21274b;
        Executor executor = (Executor) this.f21275c;
        hz hzVar = new hz(vu0Var, u90Var, executor);
        gt0 gt0Var = (gt0) hzVar.f15436e;
        if (gt0Var == null) {
            if (((Boolean) nn.f17865a.o()).booleanValue()) {
                v80 v80VarZza = u90Var.zza();
                ev0 ev0Var = (ev0) vu0Var.f21275c;
                s90 s90Var = v80VarZza.f21110i;
                uv0 uv0VarM = v80VarZza.f21104c.a(s90Var.b(), vv0.GET_CACHE_KEY).g(new ht(3, v80VarZza, ev0Var)).m();
                so0 so0Var = new so0(v80VarZza, 16);
                uv0VarM.addListener(new zd1(0, uv0VarM, so0Var), v80VarZza.f21111j);
                listenableFutureT = zw1.t(zw1.z(vd1.r(uv0VarM), new ft0(hzVar, 1), executor), yk0.class, new ft0(hzVar, 0), executor);
            } else {
                gt0 gt0Var2 = new gt0(null, hzVar.m());
                hzVar.f15436e = gt0Var2;
                listenableFutureT = zw1.d(gt0Var2);
            }
            listenableFutureD = zw1.z(listenableFutureT, i6.f15616q, executor);
        } else {
            listenableFutureD = zw1.d(gt0Var);
        }
        return zw1.t(zw1.x(vd1.r(listenableFutureD), new ht(13, this, u90Var), executor), Exception.class, new i6(16), executor);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    public void j(fu0 fu0Var, du0 du0Var, int i10, rm0 rm0Var, long j10) {
        String strGroup;
        lj1 lj1VarA = ((yh0) this.f21276d).a();
        lj1VarA.l("gqi", fu0Var.f14546b);
        lj1VarA.k(du0Var);
        lj1VarA.l("action", "adapter_status");
        lj1VarA.l("adapter_l", String.valueOf(j10));
        lj1VarA.l("sc", Integer.toString(i10));
        lh0 lh0Var = null;
        if (rm0Var != null) {
            lj1VarA.l("arec", Integer.toString(rm0Var.f19620b.zza));
            tu0 tu0Var = (tu0) this.f21274b;
            String message = rm0Var.getMessage();
            Pattern pattern = tu0Var.f20515a;
            if (pattern == null || message == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                lj1VarA.l("areec", strGroup);
            }
        }
        mh0 mh0Var = (mh0) this.f21275c;
        Iterator it = du0Var.f13710t.iterator();
        while (it.hasNext()) {
            lh0 lh0VarB = mh0Var.b((String) it.next());
            if (lh0VarB != null) {
                lh0Var = lh0VarB;
                break;
            }
        }
        if (lh0Var != null) {
            lj1VarA.l("ancn", lh0Var.f16988a);
            fv fvVar = lh0Var.f16989b;
            if (fvVar != null) {
                lj1VarA.l("adapter_v", fvVar.toString());
            }
            fv fvVar2 = lh0Var.f16990c;
            if (fvVar2 != null) {
                lj1VarA.l("adapter_sv", fvVar2.toString());
            }
        }
        lj1VarA.m();
    }

    public jl0 k(il0 il0Var) throws ck0 {
        HttpURLConnection httpURLConnection;
        jl0 jl0Var;
        long j10;
        InputStreamReader inputStreamReader;
        vu0 vu0Var = this;
        String str = il0Var.f15777a;
        int i10 = il0Var.f15778b;
        HashMap map = il0Var.f15779c;
        byte[] bArr = il0Var.f15780d;
        String str2 = il0Var.f15781e;
        ((p9.b) zzt.zzk()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str3 = "Received error HTTP response code: ";
        try {
            jl0 jl0Var2 = new jl0();
            jl0Var2.f16110a = 0;
            jl0Var2.f16111b = new HashMap();
            jl0Var2.f16112c = "";
            jl0Var2.f16113d = -1L;
            if (((Boolean) zzba.zzc().a(am.n3)).booleanValue() && zzay.zze()) {
                jl0Var2.f16110a = InterfaceC0435l1.a.b.f29090j;
                return jl0Var2;
            }
            String str4 = (String) vu0Var.f21275c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 13);
            sb2.append("SDK version: ");
            sb2.append(str4);
            String string = sb2.toString();
            int i11 = zze.zza;
            zzo.zzh(string);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            zzo.zzd(sb3.toString());
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i12 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                String str5 = (String) vu0Var.f21276d;
                if (str5 != null) {
                    httpURLConnection.setRequestMethod(str5);
                }
                jl0 jl0Var3 = jl0Var2;
                String str6 = str4;
                try {
                    try {
                        zzs zzsVarZzc = zzt.zzc();
                        Context context = (Context) vu0Var.f21274b;
                        HashMap map3 = map;
                        jl0Var = jl0Var3;
                        String str7 = str3;
                        j10 = jElapsedRealtime;
                        try {
                            zzsVarZzc.zzb(context, str6, false, httpURLConnection, false, i10);
                            for (Map.Entry entry : map3.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            BufferedOutputStream bufferedOutputStream = null;
                            zzl zzlVar = new zzl(null);
                            try {
                                zzlVar.zza(httpURLConnection, bArr);
                            } catch (Throwable th2) {
                                zzo.zzg("Network request logging failed.", th2);
                                zzt.zzh().e("HttpRequestFunction.logAdRequest", th2);
                            }
                            int length = bArr.length;
                            int i13 = 1;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream2.write(bArr);
                                        p9.c.d(bufferedOutputStream2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        p9.c.d(bufferedOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (map2.containsKey(key)) {
                                    ((List) map2.get(key)).addAll(value);
                                } else {
                                    map2.put(key, new ArrayList(value));
                                    i13 = i13;
                                }
                            }
                            int i14 = i13;
                            zzlVar.zzc(httpURLConnection, responseCode);
                            jl0Var.f16110a = responseCode;
                            jl0Var.f16111b = map2;
                            jl0Var.f16112c = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        zzt.zzc();
                                        StringBuilder sb4 = new StringBuilder(Segment.SIZE);
                                        char[] cArr = new char[com.ironsource.mediationsdk.metadata.a.f29616n];
                                        while (true) {
                                            int i15 = inputStreamReader2.read(cArr);
                                            if (i15 == -1) {
                                                break;
                                            }
                                            sb4.append(cArr, 0, i15);
                                        }
                                        String string2 = sb4.toString();
                                        p9.c.d(inputStreamReader2);
                                        zzlVar.zze(string2);
                                        jl0Var.f16112c = string2;
                                        if (TextUtils.isEmpty(string2)) {
                                            if (!((Boolean) zzba.zzc().a(am.G6)).booleanValue()) {
                                                throw new ck0(3);
                                            }
                                        }
                                        ((p9.b) zzt.zzk()).getClass();
                                        jl0Var.f16113d = SystemClock.elapsedRealtime() - j10;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStreamReader = inputStreamReader2;
                                        p9.c.d(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                    sb5.append(str7);
                                    sb5.append(responseCode);
                                    zzo.zzi(sb5.toString());
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                    sb6.append(str7);
                                    sb6.append(responseCode);
                                    throw new ck0(1, sb6.toString());
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    zzo.zzi("No location header to follow redirect.");
                                    throw new ck0(1, "No location header to follow redirect");
                                }
                                if (((Boolean) zzba.zzc().a(am.f12100c9)).booleanValue()) {
                                    try {
                                        url = new URI(headerField).toURL();
                                    } catch (URISyntaxException e10) {
                                        throw new ck0(e10.getMessage(), e10);
                                    }
                                } else {
                                    url = new URL(headerField);
                                }
                                int i16 = i12 + 1;
                                if (i16 > ((Integer) zzba.zzc().a(am.f12299p6)).intValue()) {
                                    zzo.zzi("Too many redirects.");
                                    throw new ck0(i14, "Too many redirects");
                                }
                                httpURLConnection.disconnect();
                                str3 = str7;
                                i12 = i16;
                                str4 = str6;
                                jl0Var2 = jl0Var;
                                map = map3;
                                jElapsedRealtime = j10;
                                vu0Var = this;
                            }
                        } catch (ck0 e11) {
                            e = e11;
                            if (!((Boolean) zzba.zzc().a(am.I9)).booleanValue()) {
                                throw e;
                            }
                            ((p9.b) zzt.zzk()).getClass();
                            jl0Var.f16113d = SystemClock.elapsedRealtime() - j10;
                        }
                    } catch (ck0 e12) {
                        e = e12;
                        jl0Var = jl0Var3;
                        j10 = jElapsedRealtime;
                    }
                } catch (Throwable th7) {
                    httpURLConnection.disconnect();
                    throw th7;
                }
            }
            httpURLConnection.disconnect();
            return jl0Var;
        } catch (IOException e13) {
            String strValueOf = String.valueOf(e13.getMessage());
            int i17 = zze.zza;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            zzo.zzi(strConcat);
            throw new ck0(strConcat, e13);
        }
    }

    public synchronized void l(zzm zzmVar, int i10) {
        this.f21276d = null;
        op0 op0Var = new op0(i10);
        x11 x11Var = new x11(this);
        ((v90) this.f21274b).c(zzmVar, (String) this.f21275c, op0Var, x11Var);
    }

    public synchronized void m(gv0 gv0Var, fv0 fv0Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f21274b;
            av0 av0Var = (av0) concurrentHashMap.get(gv0Var);
            ((p9.b) zzt.zzk()).getClass();
            fv0Var.f14570d = System.currentTimeMillis();
            if (av0Var == null) {
                ev0 ev0Var = (ev0) this.f21275c;
                av0 av0Var2 = new av0(ev0Var.f14095e, ev0Var.f14096f * 1000);
                if (concurrentHashMap.size() == ev0Var.f14094d) {
                    int i10 = ev0Var.f14100j;
                    int i11 = i10 - 1;
                    gv0 gv0Var2 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((av0) entry.getValue()).f12530d.f18001c < j10) {
                                j10 = ((av0) entry.getValue()).f12530d.f18001c;
                                gv0Var2 = (gv0) entry.getKey();
                            }
                        }
                        if (gv0Var2 != null) {
                            concurrentHashMap.remove(gv0Var2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((av0) entry2.getValue()).f12530d.f18002d < j10) {
                                j10 = ((av0) entry2.getValue()).f12530d.f18002d;
                                gv0Var2 = (gv0) entry2.getKey();
                            }
                        }
                        if (gv0Var2 != null) {
                            concurrentHashMap.remove(gv0Var2);
                        }
                    } else if (i11 == 2) {
                        int i12 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((av0) entry3.getValue()).f12530d.f17999a < i12) {
                                i12 = ((av0) entry3.getValue()).f12530d.f17999a;
                                gv0Var2 = (gv0) entry3.getKey();
                            }
                        }
                        if (gv0Var2 != null) {
                            concurrentHashMap.remove(gv0Var2);
                        }
                    }
                    ma maVar = (ma) this.f21276d;
                    maVar.f17361b++;
                    ((bv0) maVar.f17365f).f12896b = true;
                }
                concurrentHashMap.put(gv0Var, av0Var2);
                ma maVar2 = (ma) this.f21276d;
                maVar2.f17360a++;
                ((bv0) maVar2.f17365f).f12895a = true;
                av0Var = av0Var2;
            }
            nv0 nv0Var = av0Var.f12530d;
            nv0Var.getClass();
            ((p9.b) zzt.zzk()).getClass();
            nv0Var.f18002d = System.currentTimeMillis();
            nv0Var.f17999a++;
            av0Var.a();
            LinkedList linkedList = av0Var.f12527a;
            if (linkedList.size() != av0Var.f12528b) {
                linkedList.add(fv0Var);
            }
            ma maVar3 = (ma) this.f21276d;
            maVar3.f17364e++;
            bv0 bv0Var = (bv0) maVar3.f17365f;
            bv0 bv0VarClone = bv0Var.clone();
            bv0Var.f12895a = false;
            bv0Var.f12896b = false;
            mv0 mv0Var = (mv0) av0Var.f12530d.f18004f;
            mv0 mv0VarClone = mv0Var.clone();
            mv0Var.f17552a = false;
            mv0Var.f17553b = 0;
            ok okVarZ = tk.z();
            mk mkVarA = nk.A();
            mkVarA.b();
            ((nk) mkVarA.f19193b).B();
            rk rkVarA = sk.A();
            boolean z10 = bv0VarClone.f12895a;
            rkVarA.b();
            ((sk) rkVarA.f19193b).B(z10);
            boolean z11 = bv0VarClone.f12896b;
            rkVarA.b();
            ((sk) rkVarA.f19193b).C(z11);
            int i13 = mv0VarClone.f17553b;
            rkVarA.b();
            ((sk) rkVarA.f19193b).z(i13);
            mkVarA.b();
            ((nk) mkVarA.f19193b).z((sk) rkVarA.e());
            okVarZ.b();
            ((tk) okVarZ.f19193b).A((nk) mkVarA.e());
            fv0Var.f14567a.zza().f21107f.v0((tk) okVarZ.e());
            s();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public fu0 n() {
        return (fu0) ((ju0) this.f21274b).f16196b.f20920d;
    }

    public void o(st stVar) {
        st adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.f21276d;
        if (!((Boolean) gn.f14902a.o()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, stVar) && atomicReference.get() == null) {
            }
            return;
        }
        zzcv zzcvVar = (zzcv) this.f21275c;
        if (zzcvVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = stVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClicked.");
        try {
            ((xt) this.f21274b).zze();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClosed.");
        try {
            ((xt) this.f21274b).zzf();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error. ");
        sb2.append(i10);
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).g(i10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f21275c;
        if (((bp) this.f21276d) == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzo.zzd("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzo.zzd("Adapter called onAdImpression.");
        try {
            ((xt) this.f21274b).zzk();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLeftApplication.");
        try {
            ((xt) this.f21274b).zzh();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLoaded.");
        try {
            ((xt) this.f21274b).zzj();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdOpened.");
        try {
            ((xt) this.f21274b).zzi();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        switch (this.f21273a) {
            case 8:
                try {
                    String canonicalName = ((Adapter) this.f21275c).getClass().getCanonicalName();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    String domain = adError.getDomain();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(code);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(message);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(domain);
                    zzo.zzd(sb2.toString());
                    xt xtVar = (xt) this.f21274b;
                    xtVar.v(adError.zza());
                    xtVar.t1(adError.getCode(), adError.getMessage());
                    xtVar.g(adError.getCode());
                } catch (RemoteException e10) {
                    zzo.zzg("", e10);
                }
                break;
            case 9:
            default:
                try {
                    ((yu) this.f21274b).a(adError.zza());
                } catch (RemoteException e11) {
                    zzo.zzg("", e11);
                    return;
                }
                break;
            case 10:
                try {
                    ((uu) this.f21274b).a(adError.zza());
                } catch (RemoteException e12) {
                    zzo.zzg("", e12);
                    return;
                }
                break;
            case 11:
                try {
                    ((qu) this.f21274b).a(adError.zza());
                } catch (RemoteException e13) {
                    zzo.zzg("", e13);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f21273a) {
            case 8:
                xt xtVar = (xt) this.f21274b;
                try {
                    ((ju) this.f21276d).f16193j = (MediationInterscrollerAd) obj;
                    xtVar.zzj();
                    break;
                } catch (RemoteException e10) {
                    zzo.zzg("", e10);
                }
                return new x11(xtVar, 9);
            case 9:
            default:
                yu yuVar = (yu) this.f21274b;
                MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
                if (mediationRewardedAd == null) {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        yuVar.zzf("Adapter returned null.");
                        return null;
                    } catch (RemoteException e11) {
                        zzo.zzg("", e11);
                        return null;
                    }
                }
                try {
                    ((ev) this.f21276d).f14088c = mediationRewardedAd;
                    yuVar.zze();
                    break;
                } catch (RemoteException e12) {
                    zzo.zzg("", e12);
                }
                return new so0((xt) this.f21275c, 13);
            case 10:
                uu uuVar = (uu) this.f21274b;
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                if (mediationInterstitialAd == null) {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        uuVar.zzf("Adapter returned null.");
                        return null;
                    } catch (RemoteException e13) {
                        zzo.zzg("", e13);
                        return null;
                    }
                }
                try {
                    ((ev) this.f21276d).f14087b = mediationInterstitialAd;
                    uuVar.zze();
                    break;
                } catch (RemoteException e14) {
                    zzo.zzg("", e14);
                }
                return new so0((xt) this.f21275c, 13);
            case 11:
                qu quVar = (qu) this.f21274b;
                MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
                if (mediationAppOpenAd == null) {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        quVar.zzf("Adapter returned null.");
                        return null;
                    } catch (RemoteException e15) {
                        zzo.zzg("", e15);
                        return null;
                    }
                }
                try {
                    ((ev) this.f21276d).f14089d = mediationAppOpenAd;
                    quVar.zze();
                    break;
                } catch (RemoteException e16) {
                    zzo.zzg("", e16);
                }
                return new so0((xt) this.f21275c, 13);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoEnd.");
        try {
            ((xt) this.f21274b).p();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public void r() {
        try {
            ((hl0) ((dx1) this.f21274b).zzb()).zzi(((VersionInfoParcel) this.f21275c).afmaVersion);
            if (((Boolean) zzba.zzc().a(am.Of)).booleanValue()) {
                lj1 lj1VarA = ((yh0) this.f21276d).a();
                lj1VarA.l("action", "ptard");
                lj1VarA.l("ptard", "l");
                lj1VarA.m();
            }
        } catch (RemoteException | NullPointerException e10) {
            if (((Boolean) zzba.zzc().a(am.Pf)).booleanValue()) {
                zzt.zzh().d("Preconnect Local", e10);
            }
        }
    }

    public void s() {
        if (((Boolean) zzba.zzc().a(am.f12360t7)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            ev0 ev0Var = (ev0) this.f21275c;
            sb2.append(ev0Var.f14093c);
            sb2.append(" PoolCollection");
            ma maVar = (ma) this.f21276d;
            sb2.append("\n\tPool does not exist: " + maVar.f17362c + "\n\tNew pools created: " + maVar.f17360a + "\n\tPools removed: " + maVar.f17361b + "\n\tEntries added: " + maVar.f17364e + "\n\tNo entries retrieved: " + maVar.f17363d + "\n");
            int i10 = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f21274b).entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((gv0) entry.getKey()).hashCode());
                sb2.append("    ");
                int i11 = 0;
                while (true) {
                    av0 av0Var = (av0) entry.getValue();
                    av0Var.a();
                    if (i11 >= av0Var.f12527a.size()) {
                        break;
                    }
                    sb2.append("[O]");
                    i11++;
                }
                av0 av0Var2 = (av0) entry.getValue();
                av0Var2.a();
                for (int size = av0Var2.f12527a.size(); size < ev0Var.f14095e; size++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                nv0 nv0Var = ((av0) entry.getValue()).f12530d;
                sb2.append("Created: " + nv0Var.f18001c + " Last accessed: " + nv0Var.f18002d + " Accesses: " + nv0Var.f17999a + "\nEntries retrieved: Valid: " + nv0Var.f18000b + " Stale: " + nv0Var.f18003e);
                sb2.append("\n");
            }
            while (i10 < ev0Var.f14094d) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i12 = zze.zza;
            zzo.zzd(string);
        }
    }

    public vd1 t(mx mxVar, al0 al0Var, al0 al0Var2, od1 od1Var) {
        fe1 fe1Var = (fe1) this.f21274b;
        String str = mxVar.f17569d;
        zzt.zzc();
        return zw1.u(zw1.x(zw1.x(vd1.r(zzs.zzF(str) ? zw1.l(new yk0(1)) : zw1.u(al0Var.a(mxVar), ExecutionException.class, c60.f13062g, fe1Var)), c60.f13060e, fe1Var), od1Var, fe1Var), yk0.class, new ft(this, al0Var2, mxVar, od1Var, 3), fe1Var);
    }

    @Override // com.google.android.gms.internal.ads.n7
    public int zza() {
        return ((long[]) this.f21276d).length;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        switch (this.f21273a) {
            case 23:
                break;
        }
        return (du0) this.f21275c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void zzc(MediationNativeAdapter mediationNativeAdapter, bp bpVar) {
        String strZzh;
        k9.c0.d("#008 Must be called on the main UI thread.");
        bpVar.getClass();
        try {
            strZzh = bpVar.f12836a.zzh();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            strZzh = null;
        }
        zzo.zzd("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZzh)));
        this.f21276d = bpVar;
        try {
            ((xt) this.f21274b).zzj();
        } catch (RemoteException e11) {
            zzo.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }

    public vu0(Context context, VersionInfoParcel versionInfoParcel, pj pjVar, lj1 lj1Var) {
        this.f21273a = 21;
        this.f21274b = context;
        this.f21276d = versionInfoParcel;
        this.f21275c = pjVar;
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        switch (this.f21273a) {
            case 20:
                return k((il0) obj);
            default:
                ul0 ul0Var = (ul0) this.f21274b;
                zzu zzuVar = (zzu) this.f21275c;
                String str = (String) this.f21276d;
                ul0Var.getClass();
                ul0Var.f20818b.execute(new o1((SQLiteDatabase) obj, str, zzuVar, 8));
                return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void zzd(MediationNativeAdapter mediationNativeAdapter, bp bpVar, String str) {
        try {
            ((xt) this.f21274b).D(bpVar.f12836a, str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public vu0(Context context, fe1 fe1Var, fe1 fe1Var2, dx1 dx1Var, VersionInfoParcel versionInfoParcel, x11 x11Var, yh0 yh0Var) {
        this.f21273a = 19;
        this.f21274b = dx1Var;
        this.f21275c = versionInfoParcel;
        this.f21276d = yh0Var;
    }

    @Override // com.google.android.gms.internal.ads.n7
    public long zzb(int i10) {
        ps1.v(i10 >= 0);
        long[] jArr = (long[]) this.f21276d;
        ps1.v(i10 < jArr.length);
        return jArr[i10];
    }

    public vu0(xt xtVar) {
        this.f21273a = 9;
        this.f21274b = xtVar;
    }

    public vu0(a50 a50Var, Context context, k00 k00Var) {
        this.f21273a = 18;
        this.f21275c = a50Var;
        this.f21274b = context;
        this.f21276d = k00Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClicked.");
        try {
            ((xt) this.f21274b).zze();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClosed.");
        try {
            ((xt) this.f21274b).zzf();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(message).length() + 15 + String.valueOf(domain).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(code);
        sb2.append(". ErrorMessage: ");
        sb2.append(message);
        sb2.append(". ErrorDomain: ");
        sb2.append(domain);
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).v(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLeftApplication.");
        try {
            ((xt) this.f21274b).zzh();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLoaded.");
        try {
            ((xt) this.f21274b).zzj();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdOpened.");
        try {
            ((xt) this.f21274b).zzi();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAppEvent.");
        try {
            ((xt) this.f21274b).k0(str, str2);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public vu0(ju0 ju0Var, du0 du0Var, String str) {
        this.f21273a = 13;
        this.f21274b = ju0Var;
        this.f21275c = du0Var;
        this.f21276d = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ vu0(Object obj, Object obj2, Object obj3, int i10) {
        this.f21273a = i10;
        this.f21274b = obj;
        this.f21275c = obj2;
        this.f21276d = obj3;
    }

    public /* synthetic */ vu0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f21273a = i10;
        this.f21274b = obj2;
        this.f21275c = obj3;
        this.f21276d = obj;
    }

    public vu0() {
        this.f21273a = 1;
        String str = uu0.f20901a;
        this.f21274b = new g0(Executors.newSingleThreadExecutor(new lu0("ExoPlayer:Loader:ProgressiveMediaPeriod")), 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f21275c;
        if (((bp) this.f21276d) == null) {
            if (unifiedNativeAdMapper == null) {
                zzo.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzo.zzd("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzo.zzd("Adapter called onAdClicked.");
        try {
            ((xt) this.f21274b).zze();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClosed.");
        try {
            ((xt) this.f21274b).zzf();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLeftApplication.");
        try {
            ((xt) this.f21274b).zzh();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLoaded.");
        this.f21275c = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new fu());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
        }
        try {
            ((xt) this.f21274b).zzj();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdOpened.");
        try {
            ((xt) this.f21274b).zzi();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((da0) obj).f((sx) this.f21274b, (String) this.f21275c, (String) this.f21276d);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i10);
        sb2.append(".");
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).g(i10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public vu0(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f21273a = 7;
        k9.c0.h(context);
        k9.c0.h(onH5AdsEventListener);
        this.f21274b = context;
        this.f21275c = onH5AdsEventListener;
        am.a(context);
    }

    public vu0(Context context, zzcv zzcvVar) {
        this.f21273a = 0;
        this.f21276d = new AtomicReference();
        this.f21274b = context;
        this.f21275c = zzcvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(message).length() + 15 + String.valueOf(domain).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(code);
        sb2.append(". ErrorMessage: ");
        sb2.append(message);
        sb2.append(". ErrorDomain: ");
        sb2.append(domain);
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).v(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public vu0(ne0 ne0Var, yh0 yh0Var) {
        this.f21273a = 27;
        this.f21274b = ne0Var;
        hp0 hp0Var = new hp0(yh0Var);
        this.f21275c = hp0Var;
        this.f21276d = new lp0(hp0Var, ne0Var.f17785e);
    }

    public vu0(vu0 vu0Var, k00 k00Var) {
        this.f21273a = 28;
        this.f21276d = new tc0(25);
        this.f21274b = vu0Var;
        this.f21275c = k00Var;
    }

    public vu0(ev0 ev0Var) {
        this.f21273a = 29;
        this.f21274b = new ConcurrentHashMap(ev0Var.f14095e);
        this.f21275c = ev0Var;
        this.f21276d = new ma();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i10);
        sb2.append(".");
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).g(i10);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public vu0(String str) {
        this.f21273a = 4;
        i12 i12Var = new i12();
        i12Var.d("video/mp2t");
        i12Var.e(str);
        this.f21274b = new g22(i12Var);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(message).length() + 15 + String.valueOf(domain).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(code);
        sb2.append(". ErrorMessage: ");
        sb2.append(message);
        sb2.append(". ErrorDomain: ");
        sb2.append(domain);
        zzo.zzd(sb2.toString());
        try {
            ((xt) this.f21274b).v(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // k9.b
    public void q(int i10) {
    }

    public vu0(ArrayList arrayList) {
        this.f21273a = 3;
        this.f21274b = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f21275c = new long[size + size];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v8 v8Var = (v8) arrayList.get(i10);
            long[] jArr = (long[]) this.f21275c;
            int i11 = i10 + i10;
            jArr[i11] = v8Var.f21100b;
            jArr[i11 + 1] = v8Var.f21101c;
        }
        long[] jArr2 = (long[]) this.f21275c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f21276d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
