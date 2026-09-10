package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class hz implements yd1, oj, gd0, qv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static hz f15431f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15436e;

    public /* synthetic */ hz(int i10) {
        this.f15432a = i10;
        switch (i10) {
            case 16:
                this.f15433b = null;
                this.f15434c = null;
                this.f15435d = null;
                this.f15436e = af1.f12015h;
                break;
            case 17:
                this.f15433b = null;
                this.f15434c = null;
                this.f15435d = null;
                this.f15436e = ak1.f12056e;
                break;
            default:
                this.f15433b = null;
                this.f15434c = null;
                this.f15435d = null;
                this.f15436e = null;
                break;
        }
    }

    public static synchronized hz f(Context context) {
        try {
            hz hzVar = f15431f;
            if (hzVar != null) {
                return hzVar;
            }
            Context applicationContext = context.getApplicationContext();
            am.a(applicationContext);
            zzj zzjVarG = zzt.zzh().g();
            zzjVarG.zza(applicationContext);
            applicationContext.getClass();
            p9.a aVarZzk = zzt.zzk();
            aVarZzk.getClass();
            kz kzVarZzD = zzt.zzD();
            ic1.j(kzVarZzD, kz.class);
            hz hzVar2 = new hz(applicationContext, aVarZzk, zzjVarG, kzVarZzD);
            f15431f = hzVar2;
            cz czVar = (cz) ((fx1) hzVar2.f15434c).zzb();
            SharedPreferences sharedPreferences = czVar.f13313b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(czVar);
            czVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            if (((Boolean) zzba.zzc().a(am.f12310q1)).booleanValue()) {
                czVar.onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
            } else {
                czVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            nz nzVar = (nz) ((fx1) f15431f.f15436e).zzb();
            if (((Boolean) zzba.zzc().a(am.f12220k1)).booleanValue()) {
                zzt.zzc();
                Map mapZzx = zzs.zzx((String) zzba.zzc().a(am.f12234l1));
                Iterator it = mapZzx.keySet().iterator();
                while (it.hasNext()) {
                    nzVar.a((String) it.next());
                }
                mz mzVar = new mz(nzVar, mapZzx);
                synchronized (nzVar) {
                    nzVar.f18030b.add(mzVar);
                }
            }
            return f15431f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.oj
    public void a(ml mlVar) {
        rj rjVar = (rj) ((nl) mlVar.f19193b).B().r();
        qj qjVar = (qj) this.f15433b;
        rjVar.b();
        ((sj) rjVar.f19193b).A(qjVar);
        mlVar.b();
        ((nl) mlVar.f19193b).G((sj) rjVar.e());
        il ilVar = (il) ((nl) mlVar.f19193b).z().r();
        String str = (String) this.f15434c;
        ilVar.b();
        ((jl) ilVar.f19193b).A(str);
        hk hkVar = (hk) this.f15435d;
        ilVar.b();
        ((jl) ilVar.f19193b).B(hkVar);
        mlVar.b();
        ((nl) mlVar.f19193b).F((jl) ilVar.e());
        String str2 = (String) this.f15436e;
        mlVar.b();
        ((nl) mlVar.f19193b).A(str2);
    }

    public sd1 b(Bundle bundle, Object obj) {
        fw0 fw0VarF = fw0.f((Context) this.f15433b, 8);
        fw0VarF.zza();
        Set<bs0> set = (Set) this.f15434c;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        ul ulVar = am.f12366td;
        if (!((String) zzba.zzc().a(ulVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzba.zzc().a(ulVar)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && bundle != null) {
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (bs0 bs0Var : set) {
            if (!arrayList2.contains(String.valueOf(bs0Var.zzb()))) {
                ((p9.b) zzt.zzk()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ListenableFuture listenableFutureZza = bs0Var.zza();
                Bundle bundle3 = bundle2;
                bundle2 = bundle3;
                listenableFutureZza.addListener(new com.adjust.sdk.i0(this, jElapsedRealtime, bs0Var, bundle3), l00.f16615h);
                arrayList.add(listenableFutureZza);
            }
        }
        ca1 ca1VarY = ca1.y(arrayList);
        of0 of0Var = new of0(arrayList, obj, bundle, bundle2, 2);
        Executor executor = (Executor) this.f15435d;
        sd1 sd1Var = new sd1(ca1VarY, true, false);
        sd1Var.f19937p = new rd1(sd1Var, of0Var, executor);
        sd1Var.v();
        if (kw0.a()) {
            ps1.a0(sd1Var, (jw0) this.f15436e, fw0VarF, false);
        }
        return sd1Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) throws fd0 {
        boolean zK;
        av avVar = (av) this.f15434c;
        try {
            int iOrdinal = ((AdFormat) this.f15435d).ordinal();
            if (iOrdinal == 1) {
                zK = avVar.K(new s9.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zK = avVar.o(new s9.b(context));
                    }
                    throw new fd0("Adapter failed to show.");
                }
                zK = avVar.x(new s9.b(context));
            }
            if (zK) {
                ma0 ma0Var = (ma0) this.f15436e;
                if (ma0Var == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().a(am.f12250m2)).booleanValue() || ((du0) this.f15433b).Y != 2) {
                    return;
                }
                ma0Var.zza();
                return;
            }
            throw new fd0("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new fd0(th2);
        }
    }

    public void d(int i10) throws InvalidAlgorithmParameterException {
        switch (this.f15432a) {
            case 16:
                if (i10 != 16 && i10 != 24 && i10 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
                }
                this.f15433b = Integer.valueOf(i10);
                return;
            default:
                this.f15433b = Integer.valueOf(i10);
                return;
        }
    }

    public void g() {
        this.f15434c = 12;
    }

    public void h(int i10) {
        this.f15434c = Integer.valueOf(i10);
    }

    public synchronized void i(hb hbVar) {
        try {
            HashMap map = (HashMap) this.f15433b;
            String strZzi = hbVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (ob.f18214a) {
                ob.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            hb hbVar2 = (hb) list.remove(0);
            map.put(strZzi, list);
            synchronized (hbVar2.f15236e) {
                hbVar2.f15242k = this;
            }
            try {
                ((BlockingQueue) this.f15435d).put(hbVar2);
            } catch (InterruptedException e10) {
                ob.c("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                xa xaVar = (xa) this.f15434c;
                xaVar.f21805d = true;
                xaVar.interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void j() {
        this.f15435d = 16;
    }

    public synchronized boolean k(hb hbVar) {
        try {
            HashMap map = (HashMap) this.f15433b;
            String strZzi = hbVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                synchronized (hbVar.f15236e) {
                    hbVar.f15242k = this;
                }
                if (ob.f18214a) {
                    ob.b("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            hbVar.zzc("waiting-for-response");
            arrayList.add(hbVar);
            map.put(strZzi, arrayList);
            if (ob.f18214a) {
                ob.b("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public sa0 l(Set set) {
        return new sa0(set);
    }

    public hv0 m() {
        ou0 ou0VarZzb = ((u90) this.f15434c).zzb();
        zzm zzmVar = ou0VarZzb.f18363d;
        String str = ou0VarZzb.f18366g;
        zzx zzxVar = ou0VarZzb.f18370k;
        ev0 ev0Var = (ev0) ((vu0) this.f15433b).f21275c;
        return new hv0(zzmVar, str, new ox(ev0Var.f14091a).a().f18828j, ev0Var.f14097g, zzxVar);
    }

    public of1 n() throws GeneralSecurityException {
        uo0 uo0Var;
        zq1 zq1VarB;
        uf1 uf1Var = (uf1) this.f15433b;
        if (uf1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        uo0 uo0Var2 = (uo0) this.f15434c;
        if (uo0Var2 == null || (uo0Var = (uo0) this.f15435d) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (uf1Var.f20764a != ((zq1) uo0Var2.f20839b).f22697a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (uf1Var.f20765b != ((zq1) uo0Var.f20839b).f22697a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (uf1Var.a() && ((Integer) this.f15436e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((uf1) this.f15433b).a() && ((Integer) this.f15436e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        tf1 tf1Var = ((uf1) this.f15433b).f20768e;
        if (tf1Var == tf1.f20364e) {
            zq1VarB = wi1.f21526a;
        } else if (tf1Var == tf1.f20363d) {
            zq1VarB = wi1.a(((Integer) this.f15436e).intValue());
        } else {
            if (tf1Var != tf1.f20362c) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((uf1) this.f15433b).f20768e)));
            }
            zq1VarB = wi1.b(((Integer) this.f15436e).intValue());
        }
        return new of1((uf1) this.f15433b, (uo0) this.f15434c, (uo0) this.f15435d, zq1VarB, (Integer) this.f15436e);
    }

    public bg1 o() throws GeneralSecurityException {
        Integer num = (Integer) this.f15433b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f15434c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f15435d) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f15434c).getClass();
        ((Integer) this.f15435d).getClass();
        return new bg1(iIntValue, (af1) this.f15436e);
    }

    public bk1 p() throws GeneralSecurityException {
        Integer num = (Integer) this.f15433b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f15434c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((zj1) this.f15435d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f15433b));
        }
        Integer num2 = (Integer) this.f15434c;
        int iIntValue = num2.intValue();
        zj1 zj1Var = (zj1) this.f15435d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zj1Var == zj1.f22641b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zj1Var == zj1.f22642c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zj1Var == zj1.f22643d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zj1Var == zj1.f22644e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zj1Var != zj1.f22645f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new bk1(((Integer) this.f15433b).intValue(), ((Integer) this.f15434c).intValue(), (ak1) this.f15436e, (zj1) this.f15435d);
    }

    public void q(int i10, ListenableFuture listenableFuture) {
        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
            b2.w wVar = new b2.w(i10, 5, this);
            listenableFuture.addListener(new zd1(0, listenableFuture, wVar), (fe1) this.f15433b);
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public /* synthetic */ Object zza(Object obj) {
        po0 po0Var = (po0) this.f15433b;
        return ((tm0) po0Var.f18748e).a((ju0) this.f15434c, (du0) this.f15435d, (qm0) this.f15436e);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        return (du0) this.f15433b;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x04b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        boolean zB;
        vq vqVar;
        boolean z10;
        q90 q90Var;
        m60 m60Var;
        Intent uri = null;
        boolean zA = false;
        b = 0;
        byte b10 = 0;
        zA = false;
        switch (this.f15432a) {
            case 3:
                String str = (String) obj;
                if (((Boolean) zzba.zzc().a(am.Ib)).booleanValue()) {
                    ((Map) this.f15433b).put("u", str);
                }
                vq vqVar2 = (vq) this.f15436e;
                zza zzaVar = (zza) this.f15434c;
                Map map = (Map) this.f15433b;
                String str2 = (String) this.f15435d;
                vqVar2.getClass();
                b30 b30Var = (b30) zzaVar;
                du0 du0VarZzC = b30Var.zzC();
                fu0 fu0VarR = b30Var.r();
                String str3 = "";
                if (du0VarZzC == null || fu0VarR == null) {
                    zB = false;
                } else {
                    str3 = fu0VarR.f14546b;
                    zB = du0VarZzC.b();
                }
                String str4 = str3;
                boolean z11 = (((Boolean) zzba.zzc().a(am.f12320qc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
                boolean z12 = ((Boolean) zzba.zzc().a(am.ve)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals(com.ironsource.mediationsdk.metadata.a.f29610g);
                if ("expand".equalsIgnoreCase(str2)) {
                    if (b30Var.i()) {
                        int i10 = zze.zza;
                        zzo.zzi("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        vqVar2.h(false);
                        b30Var.y(vq.a(map), "1".equals(map.get("custom_close")), z11);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str2)) {
                    vqVar2.h(false);
                    boolean z13 = ((Boolean) zzba.zzc().a(am.Dd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (str != null) {
                        b30Var.k0("1".equals(map.get("custom_close")), vq.a(map), str, z11, z13);
                        return;
                    } else {
                        b30Var.S("1".equals(map.get("custom_close")), vq.a(map), (String) map.get("html"), (String) map.get("baseurl"), z11);
                        return;
                    }
                }
                if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                    Context context = b30Var.getContext();
                    if (((Boolean) zzba.zzc().a(am.P5)).booleanValue()) {
                        zze.zza("User opt out chrome custom tab.");
                        vqVar2.i(10);
                    } else {
                        if (((Boolean) zzba.zzc().a(am.I5)).booleanValue()) {
                            String strB = u.g.b(context, null, false);
                            if (strB != null && !context.getPackageName().equals(strB)) {
                                zA = true;
                            }
                        } else {
                            zA = nm.a(context);
                        }
                        if (zA) {
                            boolean z14 = zB;
                            vqVar2.h(true);
                            if (TextUtils.isEmpty(str)) {
                                int i11 = zze.zza;
                                zzo.zzi("Cannot open browser with null or empty url");
                                vqVar2.i(7);
                                return;
                            }
                            Uri uriD = vq.d(vq.c(b30Var.getContext(), b30Var.m0(), Uri.parse(str), b30Var.zzE(), b30Var.zzj(), b30Var.zzT()));
                            if (z14 && vqVar2.f21246e != null && vqVar2.e(zzaVar, b30Var.getContext(), uriD.toString(), str4)) {
                                return;
                            }
                            vqVar2.f21249h = new tq(vqVar2);
                            String string = uriD.toString();
                            zzaa zzaaVar = vqVar2.f21249h;
                            Bundle bundle = new Bundle();
                            if (((Boolean) zzba.zzc().a(am.O5)).booleanValue()) {
                                if (map.containsKey("cct_init_h")) {
                                    try {
                                        bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                                    } catch (NumberFormatException e10) {
                                        zze.zzb("Invalid cct initial height parameter.", e10);
                                        zzt.zzh().d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e10);
                                    }
                                }
                                if (map.containsKey("cct_bp")) {
                                    try {
                                        bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                                    } catch (NumberFormatException e11) {
                                        zze.zzb("Invalid cct close button position parameter.", e11);
                                        zzt.zzh().d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e11);
                                    }
                                }
                                break;
                            }
                            b30Var.i0(new zzc(null, string, null, null, null, null, null, null, new s9.b(zzaaVar), true, bundle), z11, z12, str4);
                            return;
                        }
                        vqVar2.i(4);
                    }
                    map.put("use_first_package", com.ironsource.mediationsdk.metadata.a.f29610g);
                    map.put("use_running_process", com.ironsource.mediationsdk.metadata.a.f29610g);
                    vqVar2.g(zzaVar, map, zB, str4, z11, z12);
                    return;
                }
                boolean z15 = zB;
                if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && com.ironsource.mediationsdk.metadata.a.f29610g.equalsIgnoreCase((String) map.get("system_browser"))) {
                    vqVar2.g(zzaVar, map, z15, str4, z11, z12);
                    return;
                }
                boolean z16 = z12;
                if ("open_app".equalsIgnoreCase(str2)) {
                    if (((Boolean) zzba.zzc().a(am.E9)).booleanValue()) {
                        vqVar2.h(true);
                        String str5 = (String) map.get(TtmlNode.TAG_P);
                        if (str5 == null) {
                            int i12 = zze.zza;
                            zzo.zzi("Package name missing from open app action.");
                            return;
                        }
                        if (z15 && vqVar2.f21246e != null && vqVar2.e(zzaVar, b30Var.getContext(), str5, str4)) {
                            return;
                        }
                        PackageManager packageManager = b30Var.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i13 = zze.zza;
                            zzo.zzi("Cannot get package manager from open app action.");
                            return;
                        } else {
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                            if (launchIntentForPackage != null) {
                                b30Var.i0(new zzc(launchIntentForPackage, vqVar2.f21249h), z11, z16, str4);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                vqVar2.h(true);
                String str6 = (String) map.get("intent_url");
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        uri = Intent.parseUri(str6, 0);
                    } catch (URISyntaxException e12) {
                        String strValueOf = String.valueOf(str6);
                        int i14 = zze.zza;
                        zzo.zzg("Error parsing the url: ".concat(strValueOf), e12);
                    }
                    break;
                }
                if (uri != null && uri.getData() != null) {
                    Uri data = uri.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri uriD2 = vq.d(vq.c(b30Var.getContext(), b30Var.m0(), data, b30Var.zzE(), b30Var.zzj(), b30Var.zzT()));
                        if (TextUtils.isEmpty(uri.getType())) {
                            uri.setData(uriD2);
                        } else if (((Boolean) zzba.zzc().a(am.F9)).booleanValue()) {
                            uri.setDataAndType(uriD2, uri.getType());
                        } else {
                            uri.setData(uriD2);
                        }
                    }
                }
                byte b11 = ((Boolean) zzba.zzc().a(am.f12068aa)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
                if (((Boolean) zzba.zzc().a(am.Ae)).booleanValue() && (q90Var = vqVar2.f21248g) != null) {
                    synchronized (q90Var.f18995a) {
                        int i15 = q90Var.f18997c.E0;
                        if (i15 > 0 && !q90Var.f19002h) {
                            zw0 zw0Var = q90Var.f19001g;
                            ((p9.b) q90Var.f18998d).getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            zw0Var.b();
                            ((ax0) zw0Var.f19193b).B(jCurrentTimeMillis);
                            q90Var.f19002h = true;
                            q90Var.f19000f.schedule(new x60(q90Var, 5), i15, TimeUnit.MILLISECONDS);
                        }
                    }
                    break;
                } else {
                    str = str;
                    vqVar2 = vqVar2;
                }
                HashMap map2 = new HashMap();
                if (b11 == true) {
                    vq vqVar3 = vqVar2;
                    vqVar = vqVar3;
                    vqVar.f21249h = new uq(vqVar3, z11, zzaVar, map2, map);
                    z10 = false;
                } else {
                    vqVar = vqVar2;
                    z10 = z11;
                }
                if (uri != null) {
                    if (!z15 || vqVar.f21246e == null || !vqVar.e(zzaVar, b30Var.getContext(), uri.getData().toString(), str4)) {
                        b30Var.i0(new zzc(uri, vqVar.f21249h), z10, z16, str4);
                        return;
                    } else {
                        if (b11 == true) {
                            map2.put((String) map.get("event_id"), Boolean.TRUE);
                            ((is) zzaVar).e("openIntentAsync", map2);
                            return;
                        }
                        return;
                    }
                }
                String string2 = !TextUtils.isEmpty(str) ? vq.d(vq.c(b30Var.getContext(), b30Var.m0(), Uri.parse(str), b30Var.zzE(), b30Var.zzj(), b30Var.zzT())).toString() : str;
                if (z15) {
                    zzaVar = zzaVar;
                    map = map;
                    if (vqVar.f21246e != null && vqVar.e(zzaVar, b30Var.getContext(), string2, str4)) {
                        if (b11 == true) {
                            map2.put((String) map.get("event_id"), Boolean.TRUE);
                            ((is) zzaVar).e("openIntentAsync", map2);
                            return;
                        }
                        return;
                    }
                }
                zzaVar = zzaVar;
                map = map;
                zzaVar = zzaVar;
                map = map;
                zzaVar = zzaVar;
                map = map;
                zzaVar = zzaVar;
                map = map;
                b30Var.i0(new zzc((String) map.get("i"), string2, (String) map.get("m"), (String) map.get(TtmlNode.TAG_P), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), vqVar.f21249h), z10, z16, str4);
                return;
            case 4:
                ((g30) this.f15436e).b0((Map) obj, (List) this.f15433b, (String) this.f15434c);
                return;
            default:
                String str7 = (String) obj;
                b30 b30Var2 = (b30) this.f15433b;
                du0 du0VarZzC2 = b30Var2.zzC();
                if (du0VarZzC2 != null && !du0VarZzC2.f13691i0) {
                    zzv zzvVar = du0VarZzC2.f13718x0;
                    if (!((Boolean) zzba.zzc().a(am.Hb)).booleanValue() || (m60Var = (m60) this.f15434c) == null || !m60.b(str7)) {
                        ((mx0) this.f15435d).b(str7, zzvVar, null, null);
                        return;
                    }
                    mx0 mx0Var = (mx0) this.f15435d;
                    Random randomZzh = zzay.zzh();
                    if (TextUtils.isEmpty(str7)) {
                        return;
                    }
                    ListenableFuture listenableFutureV = zw1.v(m60Var.c(str7, m60Var.f17308d.f15292a, randomZzh), ((Integer) zzba.zzc().a(am.Ub)).intValue(), TimeUnit.MILLISECONDS, m60Var.f17311g);
                    listenableFutureV.addListener(new zd1(zA ? 1 : 0, listenableFutureV, new uw(m60Var, mx0Var, str7, zzvVar)), m60Var.f17309e);
                    return;
                }
                fu0 fu0VarR2 = b30Var2.r();
                if (fu0VarR2 == null) {
                    zzt.zzh().d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                boolean zI = zzt.zzh().i(b30Var2.getContext());
                byte b12 = ((Boolean) zzba.zzc().a(am.f12300p7)).booleanValue() && du0VarZzC2 != null && du0VarZzC2.S;
                if (du0VarZzC2 != null && du0VarZzC2.f13682d0 != null) {
                    b10 = 1;
                }
                tb tbVar = new tb(fu0VarR2.f14546b, (zI || b12 == true || b10 != 0) ? 2 : 1, str7, jCurrentTimeMillis2);
                ul0 ul0Var = (ul0) this.f15436e;
                ul0Var.getClass();
                ul0Var.a(new md0(23, ul0Var, tbVar));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f15432a) {
            case 3:
                zzt.zzh().d("OpenGmsgHandler.attributionReportingManager", th2);
                break;
            case 4:
                String strValueOf = String.valueOf((Uri) this.f15435d);
                int i10 = zze.zza;
                zzo.zzi("Failed to parse gmsg params for: ".concat(strValueOf));
                break;
        }
    }

    public hz(Context context, k00 k00Var, Set set, jw0 jw0Var) {
        this.f15432a = 10;
        this.f15433b = context;
        this.f15435d = k00Var;
        this.f15434c = set;
        this.f15436e = jw0Var;
    }

    public hz(Context context, Executor executor, qz0 qz0Var, wz0 wz0Var) {
        this.f15432a = 13;
        this.f15433b = context;
        this.f15434c = executor;
        this.f15435d = qz0Var;
    }

    public hz(Context context, p9.a aVar, zzj zzjVar, kz kzVar) {
        this.f15432a = 0;
        this.f15433b = aVar;
        hx1 hx1VarA = hx1.a(context);
        hx1 hx1VarA2 = hx1.a(zzjVar);
        int i10 = 0;
        this.f15434c = fx1.a(new dz(hx1VarA, hx1VarA2, i10));
        hx1 hx1VarA3 = hx1.a(aVar);
        fx1 fx1VarA = fx1.a(new fz(hx1VarA3, hx1VarA2, hx1.a(kzVar), i10));
        this.f15435d = fx1VarA;
        this.f15436e = fx1.a(new oz(hx1VarA, new gz(hx1VarA3, fx1VarA), 0));
    }

    public hz(View view, b30 b30Var, j80 j80Var, eu0 eu0Var) {
        this.f15432a = 5;
        this.f15434c = view;
        this.f15436e = b30Var;
        this.f15433b = j80Var;
        this.f15435d = eu0Var;
    }

    public hz(du0 du0Var, av avVar, AdFormat adFormat) {
        this.f15432a = 8;
        this.f15436e = null;
        this.f15433b = du0Var;
        this.f15434c = avVar;
        this.f15435d = adFormat;
    }

    public hz(vu0 vu0Var, u90 u90Var, Executor executor) {
        this.f15432a = 11;
        this.f15433b = vu0Var;
        this.f15434c = u90Var;
        this.f15435d = executor;
    }

    public hz(v42 v42Var, boolean[] zArr) {
        this.f15432a = 19;
        this.f15433b = v42Var;
        this.f15434c = zArr;
        int i10 = v42Var.f21028a;
        this.f15435d = new boolean[i10];
        this.f15436e = new boolean[i10];
    }

    public /* synthetic */ hz(Object obj, Object obj2, Object obj3, Comparable comparable, int i10) {
        this.f15432a = i10;
        this.f15433b = obj2;
        this.f15434c = obj3;
        this.f15435d = comparable;
        this.f15436e = obj;
    }

    public /* synthetic */ hz(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15432a = i10;
        this.f15433b = obj;
        this.f15434c = obj2;
        this.f15435d = obj3;
        this.f15436e = obj4;
    }

    public hz(xa xaVar, BlockingQueue blockingQueue, b21 b21Var) {
        this.f15432a = 2;
        this.f15433b = new HashMap();
        this.f15436e = b21Var;
        this.f15434c = xaVar;
        this.f15435d = blockingQueue;
    }

    public hz(ac0 ac0Var) {
        this.f15432a = 14;
        this.f15436e = this;
        this.f15433b = ac0Var;
        fx1 fx1VarA = fx1.a(new j90((hx1) ac0Var.f11978b, (hx1) ac0Var.f11980d, (fx1) ac0Var.l, fx1.a(x10.f21694u), (fx1) ac0Var.f11989n, (fx1) ac0Var.f11985i, (hx1) ac0Var.f11981e));
        this.f15434c = fx1VarA;
        this.f15435d = fx1.a(new j90((hx1) ac0Var.f11980d, fx1VarA, (fx1) ac0Var.l, (fx1) ac0Var.f11987k, fx1.a(rb0.f19509m), new i21(this, 3), (hx1) ac0Var.f11981e));
    }

    private final void e(Throwable th2) {
    }

    public hz(g22 g22Var) {
        this.f15432a = 18;
        this.f15433b = g22Var;
        this.f15434c = null;
        this.f15435d = ci.f13168a;
        this.f15436e = null;
    }
}
