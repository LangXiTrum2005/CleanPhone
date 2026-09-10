package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj0 f17012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj0 f17013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bj0 f17014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj0 f17015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final aj0 f17016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vj0 f17017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lz f17018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lz f17019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f17021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17022k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public JSONObject f17026p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17031u;
    public final HashMap l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f17023m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f17024n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17025o = JsonUtils.EMPTY_JSON;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17027q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ij0 f17028r = ij0.f15768a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public kj0 f17032v = kj0.f16457a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17033w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f17034x = "";

    public lj0(oj0 oj0Var, yj0 yj0Var, bj0 bj0Var, Context context, VersionInfoParcel versionInfoParcel, hj0 hj0Var, vj0 vj0Var, lz lzVar, lz lzVar2, String str) {
        this.f17012a = oj0Var;
        this.f17013b = yj0Var;
        this.f17014c = bj0Var;
        this.f17016e = new aj0(context, 0);
        this.f17020i = versionInfoParcel.afmaVersion;
        this.f17022k = str;
        this.f17015d = hj0Var;
        this.f17017f = vj0Var;
        this.f17018g = lzVar;
        this.f17019h = lzVar2;
        this.f17021j = context;
        zzt.zzo().zza(this);
    }

    public final void a() {
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Ka)).booleanValue() && zzt.zzh().g().zzJ()) {
                j();
                return;
            }
            String strZzH = zzt.zzh().g().zzH();
            if (TextUtils.isEmpty(strZzH)) {
                return;
            }
            try {
                if (new JSONObject(strZzH).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z10) {
        if (!this.f17031u && z10) {
            j();
        }
        g(z10, true);
    }

    public final synchronized void c(String str, dj0 dj0Var) {
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && f()) {
            if (this.f17030t >= ((Integer) zzba.zzc().a(am.f12424xa)).intValue()) {
                int i10 = zze.zza;
                zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f17030t++;
            ((List) map.get(str)).add(dj0Var);
            if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
                String str2 = dj0Var.f13558c;
                this.f17023m.put(str2, dj0Var);
                HashMap map2 = this.f17024n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((m00) it.next()).zzc(dj0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized m00 d(String str) {
        m00 m00Var;
        try {
            m00Var = new m00();
            HashMap map = this.f17023m;
            if (map.containsKey(str)) {
                m00Var.zzc((dj0) map.get(str));
            } else {
                HashMap map2 = this.f17024n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(m00Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m00Var;
    }

    public final synchronized void e(zzdk zzdkVar, kj0 kj0Var) {
        if (!f()) {
            try {
                zzdkVar.zze(pi1.C(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i10 = zze.zza;
                zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        int i11 = 1;
        if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue()) {
            this.f17032v = kj0Var;
            this.f17012a.a(zzdkVar, new pq(this, i11), new wq(this.f17017f), new pq(this, 0));
            return;
        } else {
            try {
                zzdkVar.zze(pi1.C(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i12 = zze.zza;
                zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized boolean f() {
        if (((Boolean) zzba.zzc().a(am.Ka)).booleanValue()) {
            return this.f17029s || zzt.zzo().zzk();
        }
        return this.f17029s;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    public final synchronized void g(boolean z10, boolean z11) {
        try {
            if (this.f17029s != z10) {
                this.f17029s = z10;
                if (z10) {
                    if (!((Boolean) zzba.zzc().a(am.Ka)).booleanValue() || !zzt.zzo().zzk()) {
                        k();
                    } else if (!f()) {
                        l();
                    }
                } else if (!f()) {
                    l();
                }
                if (z11) {
                    m();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void h(ij0 ij0Var, boolean z10) {
        try {
            if (this.f17028r != ij0Var) {
                if (f()) {
                    l();
                }
                this.f17028r = ij0Var;
                if (f()) {
                    k();
                }
                if (z10) {
                    m();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (dj0 dj0Var : (List) entry.getValue()) {
                    if (dj0Var.f13560e != cj0.f13191a) {
                        jSONArray.put(dj0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final void j() {
        this.f17031u = true;
        hj0 hj0Var = this.f17015d;
        hj0Var.getClass();
        fj0 fj0Var = new fj0(hj0Var);
        yi0 yi0Var = hj0Var.f15309a;
        yi0Var.getClass();
        yi0Var.f22265e.addListener(new zd1(28, yi0Var, fj0Var), yi0Var.f22270j);
        this.f17012a.f18283c = this;
        this.f17013b.f22282f = this;
        this.f17014c.f12806i = this;
        this.f17017f.f21188f = this;
        ul ulVar = am.Za;
        if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(ulVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f17021j);
            List listAsList = Arrays.asList(((String) zzba.zzc().a(ulVar)).split(","));
            lz lzVar = this.f17018g;
            lzVar.f17162c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(lzVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                lzVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        ul ulVar2 = am.f12069ab;
        if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(ulVar2))) {
            SharedPreferences sharedPreferences = this.f17021j.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
            List listAsList2 = Arrays.asList(((String) zzba.zzc().a(ulVar2)).split(","));
            lz lzVar2 = this.f17019h;
            lzVar2.f17162c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(lzVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                lzVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzH = zzt.zzh().g().zzH();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzH)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzH);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((ij0) Enum.valueOf(ij0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f17025o = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                    this.f17027q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f17034x = zzt.zzh().g().zzN();
    }

    public final synchronized void k() {
        int iOrdinal = this.f17028r.ordinal();
        if (iOrdinal == 1) {
            this.f17013b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f17014c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.f17028r.ordinal();
            if (iOrdinal == 1) {
                yj0 yj0Var = this.f17013b;
                synchronized (yj0Var) {
                    try {
                        if (yj0Var.f22283g) {
                            SensorManager sensorManager2 = yj0Var.f22278b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(yj0Var, yj0Var.f22279c);
                                zze.zza("Stopped listening for shake gestures.");
                            }
                            yj0Var.f22283g = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            bj0 bj0Var = this.f17014c;
            synchronized (bj0Var) {
                try {
                    if (bj0Var.f12807j && (sensorManager = bj0Var.f12798a) != null && (sensor = bj0Var.f12799b) != null) {
                        sensorManager.unregisterListener(bj0Var, sensor);
                        bj0Var.f12807j = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        } catch (Throwable th4) {
            throw th4;
        }
        throw th4;
    }

    public final void m() {
        String string;
        zzj zzjVarG = zzt.zzh().g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f17029s);
                jSONObject.put("gesture", this.f17028r);
                long j10 = this.f17027q;
                ((p9.b) zzt.zzk()).getClass();
                if (j10 > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f17025o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f17027q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarG.zzI(string);
    }
}
