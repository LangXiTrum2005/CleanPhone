package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements q7, k9.c, yd1, z30, o00, p00, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, zb0, y30, al0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20010c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static so0 f20011d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20013b;

    public /* synthetic */ so0(Object obj, int i10) {
        this.f20012a = i10;
        this.f20013b = obj;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public /* synthetic */ ListenableFuture a(mx mxVar) {
        return ((hl0) ((dx1) ((vu0) this.f20013b).f21276d).zzb()).z1(mxVar.f17573h);
    }

    @Override // com.google.android.gms.internal.ads.q7
    public void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        l80 l80VarA;
        np0 np0Var = (np0) this.f20013b;
        np0Var.z(i11 + i10, bArr);
        np0Var.E(i10);
        ArrayList arrayList = new ArrayList();
        while (np0Var.B() > 0) {
            ps1.C("Incomplete Mp4Webvtt Top Level box header found.", np0Var.B() >= 8);
            int iB = np0Var.b() - 8;
            if (np0Var.b() == 1987343459) {
                CharSequence charSequenceA = null;
                z70 z70VarB = null;
                while (iB > 0) {
                    ps1.C("Incomplete vtt cue box header found.", iB >= 8);
                    int iB2 = np0Var.b();
                    int iB3 = np0Var.b();
                    int i12 = iB - 8;
                    int i13 = iB2 - 8;
                    byte[] bArr2 = np0Var.f17880a;
                    int i14 = np0Var.f17881b;
                    String str = uu0.f20901a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    np0Var.G(i13);
                    if (iB3 == 1937011815) {
                        z8 z8Var = new z8();
                        a9.c(str2, z8Var);
                        z70VarB = z8Var.b();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = a9.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i12 - i13;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (z70VarB != null) {
                    z70VarB.f22533a = charSequenceA;
                    z70VarB.f22534b = null;
                    l80VarA = z70VarB.a();
                } else {
                    Pattern pattern = a9.f11936a;
                    z8 z8Var2 = new z8();
                    z8Var2.f22550c = charSequenceA;
                    l80VarA = z8Var2.b().a();
                }
                arrayList.add(l80VarA);
            } else {
                np0Var.G(iB);
            }
        }
        d0Var.mo161zza(new m7(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    public void c(int i10) {
        int i11;
        so0 so0VarJ;
        ak0 ak0Var = (ak0) this.f20013b;
        try {
            tw0 tw0VarZ = uw0.z();
            if (i10 == 0) {
                i11 = 3;
            } else if (i10 == 1) {
                i11 = 4;
            } else if (i10 != 2) {
                i11 = i10 != 3 ? 7 : 6;
            } else {
                i11 = 5;
            }
            tw0VarZ.b();
            ((uw0) tw0VarZ.f19193b).H(i11);
            if (i10 == 0) {
                zj0 zj0Var = ak0Var.f12048b;
                zj0Var.getClass();
                try {
                    qa qaVar = zj0Var.f22640b;
                    so0VarJ = (qaVar == null || !qaVar.I()) ? null : qaVar.J();
                } catch (RemoteException unused) {
                }
                if (so0VarJ != null) {
                    long j10 = ((Bundle) so0VarJ.f20013b).getLong("referrer_click_timestamp_seconds");
                    tw0VarZ.b();
                    ((uw0) tw0VarZ.f19193b).B(j10);
                    long j11 = ((Bundle) so0VarJ.f20013b).getLong("install_begin_timestamp_seconds");
                    tw0VarZ.b();
                    ((uw0) tw0VarZ.f19193b).C(j11);
                    boolean z10 = ((Bundle) so0VarJ.f20013b).getBoolean("google_play_instant");
                    tw0VarZ.b();
                    ((uw0) tw0VarZ.f19193b).D(z10);
                    long j12 = ((Bundle) so0VarJ.f20013b).getLong("referrer_click_timestamp_server_seconds");
                    tw0VarZ.b();
                    ((uw0) tw0VarZ.f19193b).E(j12);
                    long j13 = ((Bundle) so0VarJ.f20013b).getLong("install_begin_timestamp_server_seconds");
                    tw0VarZ.b();
                    ((uw0) tw0VarZ.f19193b).F(j13);
                    if (!TextUtils.isEmpty(((Bundle) so0VarJ.f20013b).getString(Constants.INSTALL_REFERRER))) {
                        String string = ((Bundle) so0VarJ.f20013b).getString(Constants.INSTALL_REFERRER);
                        tw0VarZ.b();
                        ((uw0) tw0VarZ.f19193b).A(string);
                    }
                    if (!TextUtils.isEmpty(((Bundle) so0VarJ.f20013b).getString("install_version"))) {
                        String string2 = ((Bundle) so0VarJ.f20013b).getString("install_version");
                        tw0VarZ.b();
                        ((uw0) tw0VarZ.f19193b).G(string2);
                    }
                }
            }
            qa qaVar2 = ak0Var.f12048b.f22640b;
            qaVar2.f19007q = 3;
            if (qaVar2.f19011u != null) {
                v71.k("Unbinding from service.");
                qaVar2.f19008r.unbindService(qaVar2.f19011u);
                qaVar2.f19011u = null;
            }
            qaVar2.f19010t = null;
            yh0 yh0Var = ak0Var.f12049c;
            String strEncodeToString = Base64.encodeToString(((uw0) tw0VarZ.e()).b(), 1);
            if (((Boolean) zzba.zzc().a(am.Y5)).booleanValue()) {
                lj1 lj1VarA = yh0Var.a();
                lj1VarA.l("action", "irda");
                lj1VarA.l("irdd", strEncodeToString);
                lj1VarA.r();
            }
            ak0Var.f12050d.zzQ(true);
        } catch (Exception e10) {
            if (((Boolean) zzba.zzc().a(am.Z5)).booleanValue()) {
                if (ak0Var.f12052f == null) {
                    ak0Var.f12052f = zw.e(ak0Var.f12047a);
                }
                ak0Var.f12052f.a("InstallReferrerUnsampled.onInstallReferrerSetupFinished", e10);
            } else {
                if (ak0Var.f12051e == null) {
                    ak0Var.f12051e = zw.c(ak0Var.f12047a);
                }
                ak0Var.f12051e.a("InstallReferrer.onInstallReferrerSetupFinished", e10);
            }
        }
    }

    public void d(long j10, long j11, long j12) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        xc xcVar = new xc(j10, j11, j12);
        ArrayDeque arrayDeque = (ArrayDeque) this.f20013b;
        if (arrayDeque.size() >= (com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16) ^ (i17 % 452867621))) {
            throw new yc();
        }
        arrayDeque.push(xcVar);
    }

    public void e(g2 g2Var) {
        long[] jArr = g2Var.f14663e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f20013b;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), g2Var);
        }
    }

    public g2 h() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (g2 g2Var : ((LinkedHashMap) this.f20013b).values()) {
            arrayList.add(g2Var.f14660b);
            arrayList2.add(g2Var.f14661c);
            arrayList3.add(g2Var.f14662d);
            arrayList4.add(g2Var.f14663e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i10 = (int) length;
        ps1.R(length, length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int");
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i11, length2);
            i11 += length2;
        }
        return new g2(iArr3, ic1.e((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), ic1.e((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), ic1.e((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public xc i() {
        return (xc) Optional.ofNullable((xc) ((ArrayDeque) this.f20013b).peek()).orElseThrow(wc.f21485b);
    }

    public String j(Context context) {
        String string;
        gd1 gd1Var;
        f21 f21Var = (f21) this.f20013b;
        t21 t21Var = f21Var.f14183e;
        a71 a71Var = f21Var.f14182d;
        long j10 = f21Var.f14187i;
        boolean z10 = false;
        if (f21Var.f14188j && System.currentTimeMillis() - j10 <= f21Var.f14189k) {
            z10 = true;
        }
        y61 y61VarA = a71Var.a(3);
        try {
            try {
                try {
                    try {
                        y61VarA.a();
                        c31 c31Var = f21Var.f14179a;
                        synchronized (c31Var) {
                            gd1Var = c31Var.f13011e;
                            if (gd1Var == null) {
                                throw null;
                            }
                        }
                        string = (String) zw1.x(gd1Var, new ht(14, f21Var, context), td1.f20333a).get(z10 ? f21Var.f14186h : f21Var.f14184f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        y61VarA.b(e10);
                        string = "";
                    } catch (TimeoutException unused) {
                        if (z10) {
                            string = ((w41) f21Var.f14185g.zzb()).a(j10);
                        } else {
                            a71Var.b(56);
                            string = Integer.toString(17);
                        }
                    }
                } catch (Throwable th2) {
                    y61VarA.b(th2);
                    throw th2;
                }
            } catch (ExecutionException e11) {
                e = e11;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                y61VarA.b(e);
                string = Integer.toString(3);
            }
            y61VarA.c();
            t21Var.zzb();
            return string;
        } catch (Throwable th3) {
            y61VarA.c();
            t21Var.zzb();
            throw th3;
        }
    }

    public void k(long j10) {
        v90 v90Var = new v90("creation");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "nativeObjectNotCreated";
        n(v90Var);
    }

    public String l(Context context, String str, View view) {
        String string;
        gd1 gd1Var;
        f21 f21Var = (f21) this.f20013b;
        t21 t21Var = f21Var.f14183e;
        a71 a71Var = f21Var.f14182d;
        y61 y61VarA = a71Var.a(5);
        try {
            try {
                try {
                    y61VarA.a();
                    c31 c31Var = f21Var.f14179a;
                    synchronized (c31Var) {
                        gd1Var = c31Var.f13011e;
                        if (gd1Var == null) {
                            throw null;
                        }
                    }
                    string = (String) zw1.x(gd1Var, new ft(7, f21Var, context, view, str), td1.f20333a).get(f21Var.f14184f, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e10) {
                    Throwable th2 = e10;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    y61VarA.b(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    a71Var.b(58);
                    string = Integer.toString(17);
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                y61VarA.b(e11);
                string = "";
            } catch (Throwable th3) {
                y61VarA.b(th3);
                throw th3;
            }
            y61VarA.c();
            t21Var.zzb();
            return string;
        } catch (Throwable th4) {
            y61VarA.c();
            t21Var.zzb();
            throw th4;
        }
    }

    public void m(MotionEvent motionEvent) {
        q31 q31Var = ((f21) this.f20013b).f14180b;
        m31 m31Var = (m31) q31Var.f18916f.get();
        if (m31Var == null) {
            q31Var.f18915e.b(54);
        } else {
            m31Var.d(motionEvent);
        }
    }

    public void n(v90 v90Var) {
        String strA = v90Var.a();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strA);
        int i10 = zze.zza;
        zzo.zzh(strConcat);
        ((dr) this.f20013b).b(strA);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        try {
            ((xt) this.f20013b).zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        try {
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(code).length() + 59 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append("Mediated ad failed to show: Error Code = ");
            sb2.append(code);
            sb2.append(". Error Message = ");
            sb2.append(message);
            sb2.append(" Error Domain = ");
            sb2.append(domain);
            zzo.zzi(sb2.toString());
            ((xt) this.f20013b).B(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onAdLeftApplication() {
        try {
            ((xt) this.f20013b).zzh();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        try {
            ((xt) this.f20013b).zzi();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward() {
        try {
            ((xt) this.f20013b).zzz();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        try {
            ((xt) this.f20013b).p();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPause() {
        try {
            ((xt) this.f20013b).zzq();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPlay() {
        try {
            ((xt) this.f20013b).zzu();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoStart() {
        try {
            ((xt) this.f20013b).zzo();
        } catch (RemoteException unused) {
        }
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
        ej ejVar = (ej) this.f20013b;
        synchronized (ejVar.f13990c) {
            try {
                ejVar.f13993f = null;
                if (ejVar.f13991d != null) {
                    ejVar.f13991d = null;
                }
                ejVar.f13990c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        try {
            ((xt) this.f20013b).zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        try {
            ((xt) this.f20013b).zzk();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza */
    public void mo163zza() {
        switch (this.f20012a) {
            case 10:
                ts tsVar = (ts) this.f20013b;
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = tsVar.f20474a;
                ArrayList arrayList = (ArrayList) tsVar.f20476c;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j10));
                String strValueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb2.append(strValueOf);
                sb2.append(" ms.");
                zze.zza(sb2.toString());
                zzs.zza.postDelayed(new rs((ws) tsVar.f20475b, (vs) tsVar.f20477d, (ms) tsVar.f20478e, arrayList, j10, 1), ((Integer) zzba.zzc().a(am.f12108d)).intValue());
                break;
            default:
                ((us) this.f20013b).f20879d.u();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public /* synthetic */ void mo164zzb(Object obj) {
        switch (this.f20012a) {
            case 9:
                String str = (String) obj;
                b30 b30Var = (b30) this.f20013b;
                new zzbt(b30Var.getContext(), b30Var.zzs().afmaVersion, str, null, b30Var.zzC() != null ? b30Var.zzC().f13718x0 : null).zzb();
                break;
            case 14:
                zy.l.remove((ListenableFuture) this.f20013b);
                break;
            case 16:
                ((v80) this.f20013b).f21107f.Y(true);
                break;
            case 23:
                ((b30) obj).e("sendMessageToNativeJs", (Map) this.f20013b);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((wk0) this.f20013b).f21530c.z((ju0) obj);
                break;
            default:
                try {
                    ((qv0) this.f20013b).zza((SQLiteDatabase) obj);
                } catch (Exception e10) {
                    String strValueOf = String.valueOf(e10.getMessage());
                    int i10 = zze.zza;
                    zzo.zzf("Error executing function on offline buffered ping database: ".concat(strValueOf));
                }
                break;
        }
    }

    public so0(int i10) {
        this.f20012a = i10;
        switch (i10) {
            case 4:
                this.f20013b = new np0();
                break;
            case 6:
                this.f20013b = new ArrayDeque();
                break;
            case 15:
                this.f20013b = new AtomicBoolean(false);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                break;
            default:
                this.f20013b = new LinkedHashMap();
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        try {
            ((xt) this.f20013b).L0(new wy(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    public so0(Context context, Executor executor) {
        this.f20012a = 7;
        this.f20013b = zw1.o(executor, new sf(context, 0));
    }

    public so0(us usVar) {
        this.f20012a = 11;
        Objects.requireNonNull(usVar);
        this.f20013b = usVar;
    }

    public so0(zy zyVar, ListenableFuture listenableFuture) {
        this.f20012a = 14;
        this.f20013b = listenableFuture;
        Objects.requireNonNull(zyVar);
    }

    public so0(ng0 ng0Var, Map map) {
        this.f20012a = 23;
        this.f20013b = map;
        Objects.requireNonNull(ng0Var);
    }

    public so0(ak0 ak0Var) {
        this.f20012a = 25;
        Objects.requireNonNull(ak0Var);
        this.f20013b = ak0Var;
    }

    public so0(ul0 ul0Var, qv0 qv0Var) {
        this.f20012a = 28;
        this.f20013b = qv0Var;
    }

    public so0(Context context, k00 k00Var, h21 h21Var) {
        this.f20012a = 1;
        context.getClass();
        k00Var.getClass();
        this.f20013b = (f21) ((fx1) new ac0(k00Var, context, h21Var).f11988m).zzb();
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        switch (this.f20012a) {
            case 12:
                ((m00) this.f20013b).zzc((xs) obj);
                break;
            case 17:
                ((va0) obj).J((m80) this.f20013b);
                break;
            case 18:
                ((mb0) obj).q0((mx) this.f20013b);
                break;
            case 19:
                ((wb0) obj).e((tk) this.f20013b);
                break;
            default:
                ((zq) obj).n0((dy) this.f20013b);
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoUnmute() {
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f20012a) {
            case 9:
                zzt.zzh().d("DefaultGmsgHandlers.attributionReportingManager", th2);
                break;
            case 14:
                zy.l.remove((ListenableFuture) this.f20013b);
                break;
            case 16:
                ((v80) this.f20013b).f21107f.Y(false);
                break;
            case 23:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                break;
            default:
                String strValueOf = String.valueOf(th2.getMessage());
                int i10 = zze.zza;
                zzo.zzf("Failed to get offline buffered ping database: ".concat(strValueOf));
                break;
        }
    }

    private final void f(Throwable th2) {
    }

    private final void g(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.y30
    public /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
        ((kj) this.f20013b).a();
    }
}
