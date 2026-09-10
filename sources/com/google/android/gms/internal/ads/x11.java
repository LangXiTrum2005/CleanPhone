package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 implements ra, OnH5AdsEventListener, p00, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, yd1, zb0, zzn, al0, zzg, mp0, lt0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x11 f21700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wp1 f21701d = new wp1(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21703b;

    public x11(a50 a50Var) {
        this.f21702a = 10;
        this.f21703b = new d80((kx1) a50Var.f11864g, (kx1) a50Var.W, (gx1) new v50(a50Var.X, 22), (kx1) a50Var.Y, (kx1) a50Var.f11892w, 8);
    }

    public static final x11 v(Context context) {
        x11 x11Var;
        synchronized (x11.class) {
            try {
                if (f21700c == null) {
                    f21700c = new x11(context);
                }
                x11Var = f21700c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x11Var;
    }

    public ListenableFuture C(lj1 lj1Var, kt0 kt0Var, u90 u90Var) {
        c50 c50VarB = kt0Var.b((jt0) lj1Var.f17037c);
        nt0 nt0Var = new nt0();
        switch (c50VarB.f13042a) {
            case 0:
                c50VarB.f13044c = nt0Var;
                break;
            default:
                c50VarB.f13044c = nt0Var;
                break;
        }
        u90 u90Var2 = (u90) c50VarB.c();
        this.f21703b = u90Var2;
        v80 v80VarZza = u90Var2.zza();
        fv0 fv0Var = new fv0();
        vd1 vd1VarR = vd1.r(v80VarZza.b());
        ht htVar = new ht(12, fv0Var, v80VarZza);
        td1 td1Var = td1.f20333a;
        return zw1.z(zw1.x(vd1VarR, htVar, td1Var), new lx(fv0Var, 7), td1Var);
    }

    public void J(RemoteException remoteException) {
        ((vu0) this.f21703b).r();
        if (((Boolean) zzba.zzc().a(am.Pf)).booleanValue()) {
            zzt.zzh().d("Preconnect Remote", remoteException);
        }
    }

    public void O(boolean z10) {
        synchronized (x11.class) {
            try {
                iw0 iw0Var = (iw0) this.f21703b;
                iw0Var.o(Boolean.valueOf(z10), "paidv2_publisher_option");
                if (!z10) {
                    iw0Var.w("paidv2_creation_time");
                    iw0Var.w("paidv2_id");
                    iw0Var.w("vendor_scoped_gpid_v2_id");
                    iw0Var.w("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int Q() {
        int iOptInt = ((JSONObject) this.f21703b).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public ListenableFuture a(mx mxVar) {
        uk0 uk0Var = (uk0) this.f21703b;
        synchronized (uk0Var.f19987b) {
            try {
                int i10 = uk0Var.f20811h;
                if (i10 != 1 && i10 != 2) {
                    return zw1.l(new yk0(2));
                }
                if (uk0Var.f19988c) {
                    return uk0Var.f19986a;
                }
                uk0Var.f20811h = 2;
                uk0Var.f19988c = true;
                uk0Var.f19990e = mxVar;
                uk0Var.f19991f.checkAvailabilityAndConnect();
                m00 m00Var = uk0Var.f19986a;
                m00Var.addListener(new tk0(uk0Var, 1), l00.f16615h);
                return m00Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ra
    public void b(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f21703b;
        synchronized (byteBuffer) {
            int i11 = (int) j10;
            byteBuffer.position(i11);
            byteBuffer.limit(i11 + i10);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* bridge */ /* synthetic */ ListenableFuture e(lj1 lj1Var, kt0 kt0Var) {
        return C(lj1Var, kt0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public void f(m80 m80Var) {
        switch (this.f21702a) {
            case 22:
                vu0 vu0Var = (vu0) this.f21703b;
                synchronized (vu0Var) {
                    vu0Var.f21276d = m80Var.f17339f;
                    m80Var.a();
                    break;
                }
                return;
            default:
                au0 au0Var = (au0) this.f21703b;
                ug0 ug0Var = (ug0) m80Var;
                synchronized (au0Var) {
                    try {
                        au0Var.f12519i = ug0Var;
                        if (((Boolean) zzba.zzc().a(am.C4)).booleanValue()) {
                            ug0Var.f20784u.f17548a = au0Var.f12514d;
                        }
                        au0Var.f12519i.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    public s8 k(n2 n2Var, s6 s6Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        he0 he0Var;
        int i13;
        int i14;
        boolean z12;
        int iC;
        x4 x4VarV;
        np0 np0Var = (np0) this.f21703b;
        int i15 = 0;
        s8 s8Var = null;
        while (true) {
            int i16 = 0;
            while (true) {
                int i17 = i16 % 10;
                if (i17 == 0) {
                    if (i16 != 0) {
                        byte[] bArr = np0Var.f17880a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i11 = 0;
                } else {
                    i11 = i17;
                }
                z10 = true;
                int i18 = i16 == 0 ? 10 : 1;
                try {
                    int i19 = i17 + 10;
                    n2Var.v(np0Var.f17880a, i19 - i18, i18);
                    np0Var.E(i11);
                    np0Var.C(i19);
                    if (np0Var.B() < 3) {
                        int i20 = np0Var.f17881b;
                        int i21 = np0Var.f17882c;
                        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i20).length() + 17 + String.valueOf(i21).length()), i20, "position=", i21, ", limit="));
                    }
                    int iO = np0Var.O();
                    i12 = np0Var.f17881b - 3;
                    np0Var.f17881b = i12;
                    if (iO == 4801587) {
                        break;
                    }
                    if (pi1.a(np0Var.J()) == -1) {
                        if (i16 == 0) {
                            np0Var.A(20);
                        }
                        i16++;
                        if (i16 > i10) {
                        }
                    }
                    n2Var.zzl();
                    n2Var.b(i15);
                    return s8Var;
                } catch (EOFException unused) {
                }
            }
            np0Var.G(6);
            int iG = np0Var.g();
            int i22 = iG + 10;
            if (s8Var == null) {
                byte[] bArr2 = new byte[i22];
                System.arraycopy(np0Var.f17880a, i12, bArr2, 0, 10);
                n2Var.v(bArr2, 10, iG);
                ArrayList arrayList = new ArrayList();
                np0 np0Var2 = new np0(bArr2, i22);
                if (np0Var2.B() < 10) {
                    v71.y("Id3Decoder", "Data too short to be an ID3 tag");
                } else {
                    int iO2 = np0Var2.O();
                    if (iO2 != 4801587) {
                        v71.y("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iO2))));
                    } else {
                        int iK = np0Var2.K();
                        np0Var2.G(1);
                        int iK2 = np0Var2.K();
                        int iG2 = np0Var2.g();
                        if (iK != 2) {
                            if (iK == 3) {
                                if ((iK2 & 64) != 0) {
                                    int iB = np0Var2.b();
                                    np0Var2.G(iB);
                                    iG2 -= iB + 4;
                                }
                            } else if (iK == 4) {
                                if ((iK2 & 64) != 0) {
                                    int iG3 = np0Var2.g();
                                    np0Var2.G(iG3 - 4);
                                    iG2 -= iG3;
                                }
                                if ((iK2 & 16) != 0) {
                                    iG2 -= 10;
                                }
                            } else {
                                com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iK).length() + 46), "Skipped ID3 tag with unsupported majorVersion=", iK, "Id3Decoder");
                            }
                            int i23 = iG2;
                            if (iK < 4) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            he0Var = new he0(iK, z11, i23);
                        } else if ((iK2 & 64) != 0) {
                            v71.y("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        } else {
                            int i24 = iG2;
                            if (iK < 4 || (iK2 & 128) == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            he0Var = new he0(iK, z11, i24);
                        }
                        if (he0Var == null) {
                            s8Var = null;
                        } else {
                            i13 = he0Var.f15267a;
                            int i25 = np0Var2.f17881b;
                            i14 = i13 == 2 ? 6 : 10;
                            z12 = he0Var.f15268b;
                            iC = he0Var.f15269c;
                            if (z12) {
                                iC = v71.C(iC, np0Var2);
                            }
                            np0Var2.C(i25 + iC);
                            if (v71.s(np0Var2, i13, i14, false)) {
                                z10 = false;
                            } else if (i13 == 4 || !v71.s(np0Var2, 4, i14, true)) {
                                com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i13).length() + 45), "Failed to validate ID3 tag with majorVersion=", i13, "Id3Decoder");
                                s8Var = null;
                            }
                            while (np0Var2.B() >= i14) {
                                x4VarV = v71.v(i13, np0Var2, z10, s6Var);
                                if (x4VarV != null) {
                                    arrayList.add(x4VarV);
                                }
                            }
                            s8Var = new s8(arrayList);
                        }
                    }
                }
                he0Var = null;
                if (he0Var == null) {
                    s8Var = null;
                } else {
                    i13 = he0Var.f15267a;
                    int i26 = np0Var2.f17881b;
                    if (i13 == 2) {
                    }
                    z12 = he0Var.f15268b;
                    iC = he0Var.f15269c;
                    if (z12) {
                        iC = v71.C(iC, np0Var2);
                    }
                    np0Var2.C(i26 + iC);
                    if (v71.s(np0Var2, i13, i14, false)) {
                        if (i13 == 4) {
                        }
                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i13).length() + 45), "Failed to validate ID3 tag with majorVersion=", i13, "Id3Decoder");
                        s8Var = null;
                    } else {
                        z10 = false;
                    }
                    while (np0Var2.B() >= i14) {
                        x4VarV = v71.v(i13, np0Var2, z10, s6Var);
                        if (x4VarV != null) {
                            arrayList.add(x4VarV);
                        }
                    }
                    s8Var = new s8(arrayList);
                }
            } else {
                n2Var.b(iG);
            }
            i15 += i22;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdClosed.");
        try {
            ((xt) this.f21703b).zzf();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb2 = new StringBuilder(length + 60 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
        sb2.append("Mediation ad failed to show: Error Code = ");
        sb2.append(code);
        sb2.append(". Error Message = ");
        sb2.append(message);
        sb2.append(" Error Domain = ");
        sb2.append(domain);
        zzo.zzi(sb2.toString());
        try {
            ((xt) this.f21703b).B(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onAdLeftApplication() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdLeftApplication.");
        try {
            ((xt) this.f21703b).zzh();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onAdOpened.");
        try {
            ((xt) this.f21703b).zzi();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public /* synthetic */ void onH5AdsEvent(String str) {
        int i10 = lr.f17109d;
        ((WebView) this.f21703b).evaluateJavascript(str, null);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoComplete.");
        try {
            ((xt) this.f21703b).zzt();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPause() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoPause.");
        try {
            ((xt) this.f21703b).zzq();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPlay() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called onVideoPlay.");
        try {
            ((xt) this.f21703b).zzu();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called reportAdClicked.");
        try {
            ((xt) this.f21703b).zze();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        zzo.zzd("Adapter called reportAdImpression.");
        try {
            ((xt) this.f21703b).zzk();
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public JSONObject z(View view) {
        if (view == null) {
            return hz0.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.f21703b;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return hz0.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        ((ba0) ((h50) this.f21703b).f15155e0.zzb()).onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zzc */
    public void mo169zzc() {
        h50 h50Var = (h50) this.f21703b;
        h50Var.V().zza();
        rc0 rc0Var = (rc0) h50Var.g0.zzb();
        synchronized (rc0Var) {
            rc0Var.S0(xa0.D);
        }
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* synthetic */ Object zzd() {
        return (u90) this.f21703b;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdk() {
        jb0 jb0Var = ((eh0) this.f21703b).f13974g;
        synchronized (jb0Var) {
            try {
                if (jb0Var.f16042j) {
                    return;
                }
                ScheduledFuture scheduledFuture = jb0Var.f16043k;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    jb0Var.f16040h = -1L;
                } else {
                    jb0Var.f16043k.cancel(false);
                    long j10 = jb0Var.f16038f;
                    ((p9.b) jb0Var.f16036d).getClass();
                    jb0Var.f16040h = j10 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = jb0Var.l;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    jb0Var.f16041i = -1L;
                } else {
                    jb0Var.l.cancel(false);
                    long j11 = jb0Var.f16039g;
                    ((p9.b) jb0Var.f16036d).getClass();
                    jb0Var.f16041i = j11 - SystemClock.elapsedRealtime();
                }
                jb0Var.f16042j = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdl() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        jb0 jb0Var = ((eh0) this.f21703b).f13974g;
        synchronized (jb0Var) {
            try {
                if (jb0Var.f16042j) {
                    if (jb0Var.f16040h > 0 && (scheduledFuture2 = jb0Var.f16043k) != null && scheduledFuture2.isCancelled()) {
                        jb0Var.Z0(jb0Var.f16040h);
                    }
                    if (jb0Var.f16041i > 0 && (scheduledFuture = jb0Var.l) != null && scheduledFuture.isCancelled()) {
                        jb0Var.a1(jb0Var.f16041i);
                    }
                    jb0Var.f16042j = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ra
    public long zza() {
        return ((ByteBuffer) this.f21703b).capacity();
    }

    @Override // com.google.android.gms.internal.ads.mp0
    /* JADX INFO: renamed from: zza */
    public void mo168zza() {
        switch (this.f21702a) {
            case 20:
                if (((Boolean) zzba.zzc().a(am.Of)).booleanValue()) {
                    lj1 lj1VarA = ((yh0) ((vu0) this.f21703b).f21276d).a();
                    lj1VarA.l("action", "ptard");
                    lj1VarA.l("ptard", "r");
                    lj1VarA.m();
                    return;
                }
                return;
            case 21:
            default:
                au0 au0Var = (au0) this.f21703b;
                synchronized (au0Var) {
                    au0Var.f12519i = null;
                    break;
                }
                return;
            case 22:
                synchronized (((vu0) this.f21703b)) {
                    break;
                }
                return;
        }
    }

    public /* synthetic */ x11(Object obj, int i10) {
        this.f21702a = i10;
        this.f21703b = obj;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        Object obj2;
        switch (this.f21702a) {
            case 11:
                ((v80) this.f21703b).f21107f.b0(true);
                return;
            case 15:
                try {
                    b30 b30Var = (b30) ((List) obj).get(0);
                    if (b30Var != null) {
                        ff0 ff0Var = (ff0) this.f21703b;
                        ff0Var.getClass();
                        ff0Var.f14385c.execute(new m30(b30Var, 5));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e10) {
                    if (((Boolean) zzba.zzc().a(am.f12436y6)).booleanValue()) {
                        zzt.zzh().d("omid native display exp", e10);
                        return;
                    }
                    return;
                }
            case 17:
                String str = (String) obj;
                synchronized (this) {
                    yi0 yi0Var = (yi0) this.f21703b;
                    yi0Var.f22263c = true;
                    ((p9.b) zzt.zzk()).getClass();
                    yi0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - yi0Var.f22264d), "", true);
                    yi0Var.f22269i.execute(new zd1(26, this, str));
                    break;
                }
                return;
            case 18:
                ju0 ju0Var = (ju0) obj;
                if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue()) {
                    lk0 lk0Var = (lk0) this.f21703b;
                    fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
                    pl0 pl0Var = lk0Var.f17043e;
                    int i10 = fu0Var.f14550f;
                    synchronized (pl0Var.f18712g) {
                        pl0Var.f18707b = i10;
                        break;
                    }
                    pl0 pl0Var2 = lk0Var.f17043e;
                    long j10 = fu0Var.f14551g;
                    synchronized (pl0Var2.f18713h) {
                        pl0Var2.f18708c = j10;
                        break;
                    }
                    return;
                }
                return;
            default:
                ux0 ux0Var = (ux0) this.f21703b;
                if (obj != null) {
                    ux0Var.f20932k.a();
                    zzdx zzdxVarJ = ux0Var.j(obj);
                    double d10 = !(zzdxVarJ instanceof aa0) ? 0.0d : ((aa0) zzdxVarJ).f11963j;
                    zzdx zzdxVarJ2 = ux0Var.j(obj);
                    obj2 = obj;
                    cy0 cy0Var = new cy0(obj2, ux0Var.f20938r, d10, zzdxVarJ2 instanceof aa0 ? ((aa0) zzdxVarJ2).f11964k : 2);
                    Queue queue = ux0Var.f20931j;
                    synchronized (queue) {
                        queue.add(cy0Var);
                        break;
                    }
                    zzdx zzdxVarJ3 = ux0Var.j(obj2);
                    ((p9.b) ux0Var.f20938r).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (ux0Var.f20936p.get()) {
                        zzs.zza.post(new gm0(ux0Var, zzdxVarJ3));
                    }
                    ScheduledExecutorService scheduledExecutorService = ux0Var.f20934n;
                    scheduledExecutorService.execute(new q1(ux0Var, jCurrentTimeMillis, zzdxVarJ3));
                    if (ux0Var.f20927f != null) {
                        if (((Boolean) zzba.zzc().a(am.I)).booleanValue()) {
                            sv0 sv0Var = ux0Var.f20935o;
                            dy0 dy0Var = new dy0(ux0Var, 4);
                            long jA = cy0Var.a();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            sv0Var.a(dy0Var, jA);
                        } else {
                            scheduledExecutorService.schedule(new dy0(ux0Var, 3), cy0Var.a(), TimeUnit.MILLISECONDS);
                        }
                    } else {
                        if (((Boolean) zzba.zzc().a(am.I)).booleanValue()) {
                            sv0 sv0Var2 = ux0Var.f20935o;
                            dy0 dy0Var2 = new dy0(ux0Var);
                            long jA2 = cy0Var.a();
                            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                            sv0Var2.a(dy0Var2, jA2);
                        } else {
                            scheduledExecutorService.schedule(new dy0(ux0Var), cy0Var.a(), TimeUnit.MILLISECONDS);
                        }
                    }
                } else {
                    obj2 = obj;
                }
                ux0Var.f20933m.set(false);
                if (obj2 == null || ux0Var.f20927f == null) {
                    ux0Var.d(obj2 == null);
                    return;
                }
                return;
        }
    }

    public x11(int i10) {
        this.f21702a = i10;
        switch (i10) {
            case 2:
                this.f21703b = new np0(10);
                break;
            case 23:
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                this.f21703b = new int[2];
                break;
            default:
                int i11 = tr1.f20473a;
                this.f21703b = new at0(new nt1[]{s6.f19865i, f21701d}, 11);
                break;
        }
    }

    public x11(Context context) {
        this.f21702a = 0;
        if (iw0.f15862d == null) {
            iw0.f15862d = new iw0(context);
        }
        this.f21703b = iw0.f15862d;
    }

    public x11(vs vsVar, us usVar) {
        this.f21702a = 8;
        this.f21703b = usVar;
        Objects.requireNonNull(vsVar);
    }

    public x11(yi0 yi0Var) {
        this.f21702a = 17;
        Objects.requireNonNull(yi0Var);
        this.f21703b = yi0Var;
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        switch (this.f21702a) {
            case 8:
                ms msVar = (ms) obj;
                zze.zza("Getting a new session for JS Engine.");
                msVar.getClass();
                ((m00) ((us) this.f21703b).f18847a).zzc(new ys(msVar));
                break;
            case 12:
                la0 la0Var = (la0) obj;
                String message = ((fd0) this.f21703b).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                la0Var.e(pi1.C(12, message, null));
                break;
            case 13:
                ((db0) obj).b((com.google.android.gms.ads.internal.client.zzt) this.f21703b);
                break;
            default:
                uv0 uv0Var = (uv0) this.f21703b;
                ((zv0) obj).v(uv0Var.f20914b);
                break;
        }
    }

    public x11(vu0 vu0Var) {
        this.f21702a = 22;
        Objects.requireNonNull(vu0Var);
        this.f21703b = vu0Var;
    }

    public x11(b21 b21Var, h50 h50Var) {
        this.f21702a = 21;
        this.f21703b = h50Var;
    }

    public x11(ByteBuffer byteBuffer) {
        this.f21702a = 4;
        this.f21703b = byteBuffer.slice();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoUnmute() {
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f21702a) {
            case 11:
                ((v80) this.f21703b).f21107f.b0(false);
                return;
            case 15:
                if (((Boolean) zzba.zzc().a(am.f12436y6)).booleanValue()) {
                    zzt.zzh().d("omid native display exp", th2);
                    return;
                }
                return;
            case 17:
                synchronized (this) {
                    yi0 yi0Var = (yi0) this.f21703b;
                    yi0Var.f22263c = true;
                    ((p9.b) zzt.zzk()).getClass();
                    yi0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - yi0Var.f22264d), "Internal Error.", false);
                    yi0Var.f22265e.zzd(new Exception());
                    break;
                }
                return;
            case 18:
                if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue()) {
                    Matcher matcher = lk0.f17038h.matcher(th2.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        lk0 lk0Var = (lk0) this.f21703b;
                        int i10 = Integer.parseInt(strGroup);
                        pl0 pl0Var = lk0Var.f17043e;
                        synchronized (pl0Var.f18712g) {
                            pl0Var.f18707b = i10;
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ux0 ux0Var = (ux0) this.f21703b;
                ux0Var.f20933m.set(false);
                if ((th2 instanceof rx0) && ((rx0) th2).f19695a == 0) {
                    throw null;
                }
                ux0Var.d(true);
                return;
        }
    }
}
