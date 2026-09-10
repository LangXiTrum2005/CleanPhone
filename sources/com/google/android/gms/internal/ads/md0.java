package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class md0 implements e2, cb, k9.c, o00, MediationAdLoadCallback, jk1, yd1, y30, NativeAd.OnNativeAdLoadedListener, qv0, tv0, lt0, zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17400c;

    public /* synthetic */ md0(int i10) {
        this.f17398a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    @Override // com.google.android.gms.internal.ads.e2
    public d2 a(n2 n2Var, long j10) {
        int iG;
        long jZzn = n2Var.zzn();
        int iMin = (int) Math.min(20000L, n2Var.zzo() - jZzn);
        np0 np0Var = (np0) this.f17400c;
        np0Var.y(iMin);
        n2Var.v(np0Var.f17880a, 0, iMin);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (np0Var.B() >= 4) {
            if (z3.g(np0Var.f17881b, np0Var.f17880a) != 442) {
                np0Var.G(1);
            } else {
                np0Var.G(4);
                long jA = y9.a(np0Var);
                if (jA != C.TIME_UNSET) {
                    long jC = ((st0) this.f17399b).c(jA);
                    if (jC > j10) {
                        return j11 == C.TIME_UNSET ? new d2(-1, jC, jZzn) : new d2(0, C.TIME_UNSET, jZzn + ((long) i11));
                    }
                    j11 = jC;
                    if (100000 + j11 > j10) {
                        return new d2(0, C.TIME_UNSET, jZzn + ((long) np0Var.f17881b));
                    }
                    i11 = np0Var.f17881b;
                }
                int i12 = np0Var.f17882c;
                if (np0Var.B() >= 10) {
                    np0Var.G(9);
                    int iK = np0Var.K() & 7;
                    if (np0Var.B() >= iK) {
                        np0Var.G(iK);
                        if (np0Var.B() >= 4) {
                            if (z3.g(np0Var.f17881b, np0Var.f17880a) == 443) {
                                np0Var.G(4);
                                int iL = np0Var.L();
                                if (np0Var.B() >= iL) {
                                    np0Var.G(iL);
                                    while (np0Var.B() >= 4) {
                                        iG = z3.g(np0Var.f17881b, np0Var.f17880a);
                                        if (iG == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                np0Var.E(i12);
                            } else {
                                while (np0Var.B() >= 4) {
                                    iG = z3.g(np0Var.f17881b, np0Var.f17880a);
                                    if (iG == 442 || iG == 441 || (iG >>> 8) != 1) {
                                        break;
                                    }
                                    np0Var.G(4);
                                    if (np0Var.B() < 2) {
                                        np0Var.E(i12);
                                        break;
                                    }
                                    np0Var.E(Math.min(np0Var.f17882c, np0Var.f17881b + np0Var.L()));
                                }
                            }
                        } else {
                            np0Var.E(i12);
                        }
                    } else {
                        np0Var.E(i12);
                    }
                } else {
                    np0Var.E(i12);
                }
                i10 = np0Var.f17881b;
            }
        }
        return j11 != C.TIME_UNSET ? new d2(-2, j11, jZzn + ((long) i10)) : d2.f13361d;
    }

    public synchronized ListenableFuture d(lj1 lj1Var, kt0 kt0Var, u90 u90Var) {
        mx mxVar;
        this.f17400c = u90Var;
        if (u90Var == null || (mxVar = (mx) lj1Var.f17036b) == null) {
            return ((vf) this.f17399b).k(lj1Var, kt0Var, u90Var);
        }
        v80 v80VarZza = u90Var.zza();
        return v80VarZza.c(v80VarZza.a(zw1.d(mxVar)));
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public /* bridge */ /* synthetic */ ListenableFuture e(lj1 lj1Var, kt0 kt0Var) {
        return d(lj1Var, kt0Var, null);
    }

    public void f(boolean z10, boolean z11) {
        synchronized (this) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) this.f17400c) == null) {
                    Context context = (Context) this.f17399b;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        v71.y("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        v71.y("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f17400c = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f17400c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void g(ArrayList arrayList) {
        b91 b91Var;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((n81) arrayList.get(i10)).f17713a == 1) {
                try {
                    b91Var = new b91((n81) arrayList.get(i10));
                } catch (x71 unused) {
                    b91Var = null;
                }
                this.f17400c = b91Var;
            }
        }
    }

    public void h(lt ltVar) {
        Handler handler = (Handler) this.f17399b;
        if (handler != null) {
            handler.post(new zd1(1, this, ltVar));
        }
    }

    public void i(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", (String) this.f17400c);
            b30 b30Var = (b30) this.f17399b;
            if (b30Var != null) {
                b30Var.f("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Error occurred while dispatching error event.", e10);
        }
    }

    public void j(int i10, int i11, int i12, int i13) {
        try {
            ((b30) this.f17399b).f("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = zze.zza;
            zzo.zzg("Error occurred while dispatching size change.", e10);
        }
    }

    public void k(String str) {
        try {
            ((b30) this.f17399b).f("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Error occurred while dispatching state change.", e10);
        }
    }

    public void l(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            ((b30) this.f17399b).f("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            int i15 = zze.zza;
            zzo.zzg("Error occurred while obtaining screen information.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((wu) this.f17399b).a(adError.zza());
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((vj0) this.f17399b).x1(nativeAd, (String) this.f17400c);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        wu wuVar = (wu) this.f17399b;
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        if (nativeAdMapper != null) {
            try {
                wuVar.w0(new mu(nativeAdMapper));
            } catch (RemoteException e10) {
                zzo.zzg("", e10);
            }
            return new so0((xt) this.f17400c, 13);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            wuVar.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
            return null;
        }
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
        synchronized (((t6.l) this.f17400c).f50551d) {
            ((kj) this.f17399b).zzd(new RuntimeException("Connection failed."));
        }
    }

    public fb zza(hb hbVar) throws Throwable {
        k3 k3Var;
        byte[] bArr;
        Throwable ebVar;
        String str;
        Map map;
        byte[] byteArray;
        byte[] bArrF;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                wa waVarZzk = hbVar.zzk();
                if (waVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = waVarZzk.f21470b;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j10 = waVarZzk.f21472d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    map = map2;
                }
                ((s6) this.f17399b).getClass();
                k3 k3VarL = s6.l(hbVar, map);
                try {
                    int i10 = k3VarL.f16293a;
                    List listUnmodifiableList = Collections.unmodifiableList((ArrayList) k3VarL.f16295c);
                    if (i10 == 304) {
                        SystemClock.elapsedRealtime();
                        wa waVarZzk2 = hbVar.zzk();
                        if (waVarZzk2 == null) {
                            return new fb(304, null, true, listUnmodifiableList);
                        }
                        TreeSet treeSet = new TreeSet(comparator);
                        if (!listUnmodifiableList.isEmpty()) {
                            Iterator it = listUnmodifiableList.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((bb) it.next()).f12707a);
                            }
                        }
                        ArrayList arrayList = new ArrayList(listUnmodifiableList);
                        List list = waVarZzk2.f21476h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (bb bbVar : waVarZzk2.f21476h) {
                                    if (!treeSet.contains(bbVar.f12707a)) {
                                        arrayList.add(bbVar);
                                    }
                                }
                            }
                        } else if (!waVarZzk2.f21475g.isEmpty()) {
                            for (Map.Entry entry : waVarZzk2.f21475g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new bb((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new fb(304, waVarZzk2.f21469a, true, arrayList);
                    }
                    InputStream inputStream = (InputStream) k3VarL.f16296d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        int i11 = k3VarL.f16294b;
                        pb pbVar = (pb) this.f17400c;
                        c6.e eVar = new c6.e(pbVar, i11);
                        try {
                            bArrF = pbVar.f(1024);
                            while (true) {
                                try {
                                    int i12 = inputStream.read(bArrF);
                                    if (i12 == -1) {
                                        break;
                                    }
                                    eVar.write(bArrF, 0, i12);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused) {
                                        ob.a("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    pbVar.l(bArrF);
                                    eVar.close();
                                    throw th;
                                }
                                e = e;
                                k3Var = k3VarL;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                    ebVar = new eb();
                                    str = "socket";
                                } else {
                                    if (e instanceof MalformedURLException) {
                                        throw new RuntimeException("Bad URL ".concat(String.valueOf(hbVar.zzh())), e);
                                    }
                                    if (k3Var == null) {
                                        throw new gb(e);
                                    }
                                    int i13 = k3Var.f16293a;
                                    ob.c("Unexpected response code %d for %s", Integer.valueOf(i13), hbVar.zzh());
                                    if (bArr != null) {
                                        List<bb> listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) k3Var.f16295c);
                                        SystemClock.elapsedRealtime();
                                        if (listUnmodifiableList2 != null) {
                                            if (listUnmodifiableList2.isEmpty()) {
                                                Map map3 = Collections.EMPTY_MAP;
                                            } else {
                                                TreeMap treeMap = new TreeMap(comparator);
                                                for (bb bbVar2 : listUnmodifiableList2) {
                                                    treeMap.put(bbVar2.f12707a, bbVar2.f12708b);
                                                }
                                            }
                                        }
                                        if (listUnmodifiableList2 != null) {
                                            Collections.unmodifiableList(listUnmodifiableList2);
                                        }
                                        if (i13 != 401 && i13 != 403) {
                                            if (i13 < 400 || i13 > 499) {
                                                throw new eb();
                                            }
                                            throw new ya();
                                        }
                                        ebVar = new va();
                                        str = "auth";
                                    } else {
                                        ebVar = new eb();
                                        str = "network";
                                    }
                                }
                                za zaVarZzy = hbVar.zzy();
                                int iZzo = hbVar.zzo();
                                try {
                                    int i14 = zaVarZzy.f22574b + 1;
                                    zaVarZzy.f22574b = i14;
                                    int i15 = zaVarZzy.f22573a;
                                    zaVarZzy.f22573a = i15 + i15;
                                    if (i14 > 1) {
                                        throw ebVar;
                                    }
                                    hbVar.zzc(str + "-retry [timeout=" + iZzo + X3.j.f27836e);
                                } catch (lb e10) {
                                    hbVar.zzc(str + "-timeout-giveup [timeout=" + iZzo + X3.j.f27836e);
                                    throw e10;
                                }
                            }
                            byteArray = eVar.toByteArray();
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                ob.a("Error occurred when closing InputStream", new Object[0]);
                            }
                            pbVar.l(bArrF);
                            eVar.close();
                        } catch (Throwable th3) {
                            th = th3;
                            bArrF = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    try {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (ob.f18214a || jElapsedRealtime2 > Xa.C) {
                            ob.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", hbVar, Long.valueOf(jElapsedRealtime2), byteArray != null ? Integer.valueOf(byteArray.length) : "null", Integer.valueOf(i10), Integer.valueOf(hbVar.zzy().f22574b));
                        }
                        if (i10 < 200 || i10 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new fb(i10, byteArray, false, listUnmodifiableList);
                    } catch (IOException e11) {
                        e = e11;
                        bArr = byteArray;
                        k3Var = k3VarL;
                    }
                } catch (IOException e12) {
                    e = e12;
                    k3Var = k3VarL;
                }
            } catch (IOException e13) {
                e = e13;
                k3Var = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e2
    public void zzb() {
        byte[] bArr = uu0.f20902b;
        int length = bArr.length;
        ((np0) this.f17400c).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.lt0
    public Object zzd() {
        u90 u90Var;
        synchronized (this) {
            u90Var = (u90) this.f17400c;
        }
        return u90Var;
    }

    public /* synthetic */ md0(int i10, Object obj, Object obj2) {
        this.f17398a = i10;
        this.f17399b = obj;
        this.f17400c = obj2;
    }

    public md0(ay0 ay0Var) {
        this.f17398a = 29;
        this.f17400c = ay0Var;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        Bundle bundle;
        switch (this.f17398a) {
            case 14:
                u60 u60Var = (u60) this.f17400c;
                u60Var.f20655h.a(u60Var.f20654g.b(u60Var.f20652e, u60Var.f20653f, false, (String) this.f17399b, (String) obj, u60Var.a(), u60Var.f20661o, u60Var.f20665s), u60Var.f20660n);
                return;
            case 15:
            case 18:
            case 20:
            case 21:
            default:
                s sVar = (s) this.f17400c;
                synchronized (sVar) {
                    try {
                        sVar.f19746e = null;
                        ((ArrayDeque) sVar.f19745d).addFirst((bt0) this.f17399b);
                        if (sVar.f19742a == 1) {
                            sVar.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 16:
                s80 s80Var = (s80) this.f17400c;
                s80Var.getClass();
                l00.f16613f.execute(new x60(s80Var, 2));
                ((o8) this.f17399b).mo164zzb((m80) obj);
                return;
            case 17:
                ((ee0) this.f17400c).m((View) this.f17399b, (km0) obj);
                return;
            case 19:
                ((b30) obj).D((String) this.f17399b, (oq) this.f17400c);
                return;
            case 22:
                jx jxVar = (jx) this.f17400c;
                mx mxVar = (mx) this.f17399b;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(am.T2)).booleanValue() && (bundle = mxVar.f17577m) != null) {
                            ((p9.b) zzt.zzk()).getClass();
                            bundle.putLong("binder-call-start", System.currentTimeMillis());
                        }
                        jxVar.q0(parcelFileDescriptor, mxVar);
                        return;
                    }
                    jxVar.f1(parcelFileDescriptor);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
        }
    }

    public /* synthetic */ md0(Object obj, int i10) {
        this.f17398a = i10;
        this.f17399b = obj;
    }

    public /* synthetic */ md0(Object obj, Object obj2, Object obj3, int i10) {
        this.f17398a = i10;
        this.f17399b = obj2;
        this.f17400c = obj3;
    }

    public /* synthetic */ md0(Object obj, boolean z10, Object obj2, int i10) {
        this.f17398a = i10;
        this.f17399b = obj2;
        this.f17400c = obj;
    }

    public md0() {
        this.f17398a = 1;
        this.f17399b = ByteBuffer.allocateDirect(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    public md0(Handler handler, jy1 jy1Var) {
        this.f17398a = 2;
        if (jy1Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f17399b = handler;
        this.f17400c = jy1Var;
    }

    public md0(s6 s6Var) {
        this.f17398a = 6;
        pb pbVar = new pb(0, false);
        this.f17399b = s6Var;
        this.f17400c = pbVar;
    }

    public md0(a50 a50Var, Context context, String str) {
        this.f17398a = 13;
        hx1 hx1VarA = hx1.a(context);
        fx1 fx1Var = a50Var.J0;
        mt0 mt0Var = new mt0(hx1VarA, fx1Var, a50Var.K0, 1);
        fx1 fx1VarA = fx1.a(new er0(fx1Var, 11));
        fx1 fx1VarA2 = fx1.a(pi1.J);
        fx1 fx1VarA3 = fx1.a(new n60(hx1VarA, a50Var.f11856c, a50Var.I, mt0Var, fx1VarA, fx1VarA2));
        this.f17399b = fx1.a(new fz(fx1VarA3, fx1VarA, fx1VarA2, 27));
        this.f17400c = fx1.a(new te0(hx1.b(str), fx1VarA3, hx1VarA, fx1VarA, fx1VarA2, a50Var.f11865h, a50Var.J, a50Var.f11874m));
    }

    public md0(s80 s80Var, o8 o8Var) {
        this.f17398a = 16;
        this.f17399b = o8Var;
        Objects.requireNonNull(s80Var);
        this.f17400c = s80Var;
    }

    public /* synthetic */ md0(st0 st0Var) {
        this.f17398a = 5;
        this.f17399b = st0Var;
        this.f17400c = new np0();
    }

    private final void c(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ wk1 mo166zza() {
        r20 r20Var = (r20) this.f17399b;
        wk1 wk1VarMo166zza = ((jk1) this.f17400c).mo166zza();
        vf vfVar = new vf(r20Var, 13);
        return new m20(r20Var.f19283a, wk1VarMo166zza, r20Var.f19295n, r20Var.f19296o, r20Var, vfVar);
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        ul0 ul0Var = (ul0) this.f17399b;
        tb tbVar = (tb) this.f17400c;
        ul0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(tbVar.f20279a));
        contentValues.put("gws_query_id", (String) tbVar.f20281c);
        contentValues.put("url", (String) tbVar.f20282d);
        contentValues.put("event_state", Integer.valueOf(tbVar.f20280b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        zzt.zzc();
        Context context = ul0Var.f20817a;
        zzbo zzboVarZzC = zzs.zzC(context);
        if (zzboVarZzC != null) {
            try {
                zzboVarZzC.zzf(new s9.b(context));
            } catch (RemoteException e10) {
                zze.zzb("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o00, com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza */
    public void mo163zza() {
        switch (this.f17398a) {
            case 8:
                zze.zza("callJs > getEngine: Promise rejected");
                ((m00) this.f17399b).zzd(new zs("Unable to obtain a JavascriptEngine.", 0));
                ((us) this.f17400c).t();
                break;
            default:
                in0 in0Var = (in0) this.f17399b;
                hm hmVar = (hm) this.f17400c;
                im imVar = (im) ((jm) in0Var.f15806d);
                Parcel parcelQ = imVar.q();
                rh.e(parcelQ, hmVar);
                imVar.m0(parcelQ, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        uv0 uv0Var = (uv0) this.f17399b;
        ((zv0) obj).e((vv0) uv0Var.f20913a, uv0Var.f20914b, (Throwable) this.f17400c);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f17398a) {
            case 14:
                u60 u60Var = (u60) this.f17400c;
                u60Var.f20655h.a(u60Var.f20654g.b(u60Var.f20652e, u60Var.f20653f, false, (String) this.f17399b, null, u60Var.a(), u60Var.f20661o, u60Var.f20665s), null);
                return;
            case 15:
            case 18:
            case 20:
            case 21:
            default:
                s sVar = (s) this.f17400c;
                synchronized (sVar) {
                    sVar.f19746e = null;
                    break;
                }
                return;
            case 16:
                s80 s80Var = (s80) this.f17400c;
                s80Var.getClass();
                l00.f16613f.execute(new x60(s80Var, 2));
                ((o8) this.f17399b).zza(th2);
                return;
            case 17:
                if (((Boolean) zzba.zzc().a(am.f12436y6)).booleanValue()) {
                    zzt.zzh().e("omid native display exp", th2);
                    return;
                }
                return;
            case 19:
                return;
            case 22:
                try {
                    ((jx) this.f17400c).G0(com.google.android.gms.ads.internal.util.zzba.zza(th2));
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.y30
    public void zza(boolean z10, int i10, String str, String str2) {
        switch (this.f17398a) {
            case 18:
                ze0 ze0Var = (ze0) this.f17399b;
                Map map = (Map) this.f17400c;
                HashMap mapN = com.applovin.impl.ca.n("messageType", "htmlLoaded");
                mapN.put("id", (String) map.get("id"));
                ze0Var.f22589b.d(mapN);
                break;
            default:
                m00 m00Var = (m00) this.f17400c;
                if (z10) {
                    if (((Boolean) zzba.zzc().a(am.V2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) this.f17399b, "rendering-webview-load-html-end");
                    }
                    m00Var.zzc(null);
                } else {
                    int length = String.valueOf(i10).length();
                    StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Ad Web View failed to load. Error code: ");
                    sb2.append(i10);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    m00Var.zzd(new Exception(defpackage.e.q(", Failing URL: ", str2, sb2)));
                }
                break;
        }
    }
}
