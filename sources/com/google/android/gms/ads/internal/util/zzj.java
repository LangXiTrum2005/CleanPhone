package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.c00;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.li;
import com.google.android.gms.internal.ads.ym;
import com.google.android.gms.internal.ads.zm;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C0239a2;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11129b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListenableFuture f11131d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f11133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f11134g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11137j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11128a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11130c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public li f11132e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11135h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11138k = true;
    public String l = C0239a2.f28156f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11139m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c00 f11140n = new c00("", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11141o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f11142p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11143q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11144r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Set f11145s = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f11146t = new JSONObject();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11147u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11148v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11149w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11150x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11151y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11152z = "";
    public String A = JsonUtils.EMPTY_JSON;
    public int B = -1;
    public int C = -1;
    public long D = 0;
    public boolean E = false;
    public int F = 0;
    public int G = 0;

    public final void a() {
        ListenableFuture listenableFuture = this.f11131d;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.f11131d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException | ExecutionException | TimeoutException e11) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e11);
        }
    }

    public final void b() {
        l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f11125a.zzV();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(@NonNull String str) {
        a();
        synchronized (this.f11128a) {
            try {
                this.l = str;
                if (this.f11134g != null) {
                    if (str.equals(C0239a2.f28156f)) {
                        this.f11134g.remove(AndroidTcfDataSource.TCF_TCSTRING_KEY);
                    } else {
                        this.f11134g.putString(AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                    }
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzB() {
        a();
        return this.l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                this.f11139m = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzD() {
        a();
        return this.f11139m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.C == i10) {
                    return;
                }
                this.C = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzF() {
        long j10;
        a();
        synchronized (this.f11128a) {
            j10 = this.D;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(long j10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.D == j10) {
                    return;
                }
                this.D = j10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzH() {
        String str;
        a();
        synchronized (this.f11128a) {
            str = this.f11150x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12393va)).booleanValue()) {
            a();
            synchronized (this.f11128a) {
                try {
                    if (this.f11150x.equals(str)) {
                        return;
                    }
                    this.f11150x = str;
                    SharedPreferences.Editor editor = this.f11134g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f11134g.apply();
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzJ() {
        boolean z10;
        a();
        synchronized (this.f11128a) {
            z10 = this.f11151y;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue()) {
            a();
            synchronized (this.f11128a) {
                try {
                    if (this.f11151y == z10) {
                        return;
                    }
                    this.f11151y = z10;
                    SharedPreferences.Editor editor = this.f11134g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.f11134g.apply();
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzL() {
        String str;
        a();
        synchronized (this.f11128a) {
            str = this.f11152z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue()) {
            a();
            synchronized (this.f11128a) {
                try {
                    if (this.f11152z.equals(str)) {
                        return;
                    }
                    this.f11152z = str;
                    SharedPreferences.Editor editor = this.f11134g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f11134g.apply();
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzN() {
        String str;
        a();
        synchronized (this.f11128a) {
            str = this.A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ya)).booleanValue()) {
            a();
            synchronized (this.f11128a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f11134g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f11134g.apply();
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z10;
        a();
        synchronized (this.f11128a) {
            z10 = this.E;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzQ(boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.E) {
                    return;
                }
                this.E = true;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzR() {
        int i10;
        a();
        synchronized (this.f11128a) {
            i10 = this.F;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzS(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.F == i10) {
                    return;
                }
                this.F = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putInt("total_inflight_ad_limit", i10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzT() {
        int i10;
        a();
        synchronized (this.f11128a) {
            i10 = this.G;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzU(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.G == i10) {
                    return;
                }
                this.G = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putInt("default_queue_capacity", i10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final li zzV() {
        if (!this.f11129b || ((zzc() && zze()) || !((Boolean) ym.f22305b.o()).booleanValue())) {
            return null;
        }
        synchronized (this.f11128a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f11132e == null) {
                    this.f11132e = new li();
                }
                li liVar = this.f11132e;
                synchronized (liVar.f16997c) {
                    try {
                        if (liVar.f16995a) {
                            int i10 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                        } else {
                            liVar.f16995a = true;
                            liVar.start();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("start fetching content...");
                return this.f11132e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final Context context) {
        synchronized (this.f11128a) {
            try {
                if (this.f11133f != null) {
                    return;
                }
                this.f11131d = l00.f16608a.a(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj zzjVar = this.f11126a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        try {
                            synchronized (zzjVar.f11128a) {
                                try {
                                    zzjVar.f11133f = sharedPreferences;
                                    zzjVar.f11134g = editorEdit;
                                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                                    zzjVar.f11135h = zzjVar.f11133f.getBoolean("use_https", zzjVar.f11135h);
                                    zzjVar.f11147u = zzjVar.f11133f.getBoolean("content_url_opted_out", zzjVar.f11147u);
                                    zzjVar.f11136i = zzjVar.f11133f.getString("content_url_hashes", zzjVar.f11136i);
                                    zzjVar.f11138k = zzjVar.f11133f.getBoolean("gad_idless", zzjVar.f11138k);
                                    zzjVar.f11148v = zzjVar.f11133f.getBoolean("content_vertical_opted_out", zzjVar.f11148v);
                                    zzjVar.f11137j = zzjVar.f11133f.getString("content_vertical_hashes", zzjVar.f11137j);
                                    zzjVar.f11144r = zzjVar.f11133f.getInt("version_code", zzjVar.f11144r);
                                    if (((Boolean) zm.f22665g.o()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.zzc().f22299j) {
                                        zzjVar.f11140n = new c00("", 0L);
                                    } else {
                                        zzjVar.f11140n = new c00(zzjVar.f11133f.getString("app_settings_json", zzjVar.f11140n.f12961e), zzjVar.f11133f.getLong("app_settings_last_update_ms", zzjVar.f11140n.f12962f));
                                    }
                                    zzjVar.f11141o = zzjVar.f11133f.getLong("app_last_background_time_ms", zzjVar.f11141o);
                                    zzjVar.f11143q = zzjVar.f11133f.getInt("request_in_session_count", zzjVar.f11143q);
                                    zzjVar.f11142p = zzjVar.f11133f.getLong("first_ad_req_time_ms", zzjVar.f11142p);
                                    zzjVar.f11145s = zzjVar.f11133f.getStringSet("never_pool_slots", zzjVar.f11145s);
                                    zzjVar.f11149w = zzjVar.f11133f.getString("display_cutout", zzjVar.f11149w);
                                    zzjVar.B = zzjVar.f11133f.getInt("app_measurement_npa", zzjVar.B);
                                    zzjVar.C = zzjVar.f11133f.getInt("sd_app_measure_npa", zzjVar.C);
                                    zzjVar.D = zzjVar.f11133f.getLong("sd_app_measure_npa_ts", zzjVar.D);
                                    zzjVar.f11150x = zzjVar.f11133f.getString("inspector_info", zzjVar.f11150x);
                                    zzjVar.f11151y = zzjVar.f11133f.getBoolean("linked_device", zzjVar.f11151y);
                                    zzjVar.f11152z = zzjVar.f11133f.getString("linked_ad_unit", zzjVar.f11152z);
                                    zzjVar.A = zzjVar.f11133f.getString("inspector_ui_storage", zzjVar.A);
                                    zzjVar.l = zzjVar.f11133f.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, zzjVar.l);
                                    zzjVar.f11139m = zzjVar.f11133f.getInt("gad_has_consent_for_cookies", zzjVar.f11139m);
                                    zzjVar.E = zzjVar.f11133f.getBoolean("is_install_referrer_reported", zzjVar.E);
                                    zzjVar.F = zzjVar.f11133f.getInt("total_inflight_ad_limit", zzjVar.F);
                                    zzjVar.G = zzjVar.f11133f.getInt("default_queue_capacity", zzjVar.G);
                                    try {
                                        zzjVar.f11146t = new JSONObject(zzjVar.f11133f.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                                    } catch (JSONException e10) {
                                        int i10 = zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert native advanced settings to json object", e10);
                                    }
                                    zzjVar.b();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th3);
                            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th3);
                        }
                    }
                });
                this.f11129b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzb(boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11147u == z10) {
                    return;
                }
                this.f11147u = z10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzc() {
        boolean z10;
        a();
        synchronized (this.f11128a) {
            z10 = this.f11147u;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzd(boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11148v == z10) {
                    return;
                }
                this.f11148v = z10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zze() {
        boolean z10;
        a();
        synchronized (this.f11128a) {
            z10 = this.f11148v;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzf(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11144r == i10) {
                    return;
                }
                this.f11144r = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzg() {
        int i10;
        a();
        synchronized (this.f11128a) {
            i10 = this.f11144r;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzh(String str) {
        a();
        synchronized (this.f11128a) {
            try {
                ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str != null && !str.equals(this.f11140n.f12961e)) {
                    this.f11140n = new c00(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.f11134g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f11134g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f11134g.apply();
                    }
                    b();
                    Iterator it = this.f11130c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f11140n.f12962f = jCurrentTimeMillis;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final c00 zzi() {
        c00 c00Var;
        a();
        synchronized (this.f11128a) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12321qd)).booleanValue() && this.f11140n.a()) {
                    Iterator it = this.f11130c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c00Var = this.f11140n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c00Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final c00 zzj() {
        c00 c00Var;
        synchronized (this.f11128a) {
            c00Var = this.f11140n;
        }
        return c00Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(Runnable runnable) {
        this.f11130c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzl(long j10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11141o == j10) {
                    return;
                }
                this.f11141o = j10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzm() {
        long j10;
        a();
        synchronized (this.f11128a) {
            j10 = this.f11141o;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzn(int i10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11143q == i10) {
                    return;
                }
                this.f11143q = i10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzo() {
        int i10;
        a();
        synchronized (this.f11128a) {
            i10 = this.f11143q;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (this.f11142p == j10) {
                    return;
                }
                this.f11142p = j10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() {
        long j10;
        a();
        synchronized (this.f11128a) {
            j10 = this.f11142p;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(String str, String str2, boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f11146t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z10 || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i10;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z10);
                    ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f11146t.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e10) {
                    int i11 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not update native advanced settings", e10);
                }
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f11146t.toString());
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzs() {
        JSONObject jSONObject;
        a();
        synchronized (this.f11128a) {
            jSONObject = this.f11146t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        a();
        synchronized (this.f11128a) {
            try {
                this.f11146t = new JSONObject();
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzu() {
        String str;
        a();
        synchronized (this.f11128a) {
            str = this.f11149w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str) {
        a();
        synchronized (this.f11128a) {
            try {
                if (TextUtils.equals(this.f11149w, str)) {
                    return;
                }
                this.f11149w = str;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                if (z10 == this.f11138k) {
                    return;
                }
                this.f11138k = z10;
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzx() {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12249m1)).booleanValue()) {
            return false;
        }
        a();
        synchronized (this.f11128a) {
            z10 = this.f11138k;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z10) {
        a();
        synchronized (this.f11128a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12120dc)).longValue();
                SharedPreferences.Editor editor = this.f11134g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                    this.f11134g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f11134g.apply();
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzz() {
        a();
        synchronized (this.f11128a) {
            try {
                SharedPreferences sharedPreferences = this.f11133f;
                boolean z10 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f11133f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f11138k) {
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
