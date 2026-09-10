package com.kochava.tracker.profile.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.BuildConfig;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.n.mo;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileMain extends a implements ProfileMainApi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ClassLoggerApi f28295i = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "ProfileMain");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28297c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28298e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28299h;

    public ProfileMain(StoragePrefs storagePrefs, long j) {
        super(storagePrefs);
        this.d = 0L;
        this.f28298e = false;
        this.f = null;
        this.g = "";
        this.f28299h = null;
        this.f28296b = j;
        this.f28297c = j;
    }

    public static String b() {
        return "KA" + (System.currentTimeMillis() / 1000) + RequestConfiguration.MAX_AD_CONTENT_RATING_T + "4.3.0".replace(mo.ono, "") + "V" + UUID.randomUUID().toString().replaceAll(TokenBuilder.TOKEN_DELIMITER, "");
    }

    public final synchronized void a() {
        try {
            long jLongValue = this.f28312a.d("main.first_start_time_millis", Long.valueOf(this.f28296b)).longValue();
            this.f28297c = jLongValue;
            if (jLongValue == this.f28296b) {
                this.f28312a.j("main.first_start_time_millis", jLongValue);
            }
            long jLongValue2 = this.f28312a.d("main.start_count", Long.valueOf(this.d)).longValue() + 1;
            this.d = jLongValue2;
            this.f28312a.j("main.start_count", jLongValue2);
            this.f28298e = this.f28312a.a("main.last_launch_instant_app", Boolean.valueOf(this.f28298e)).booleanValue();
            this.f = this.f28312a.e("main.app_guid_override", null);
            String strE = this.f28312a.e("main.device_id", null);
            if (TextUtil.b(strE)) {
                c();
            } else {
                this.g = strE;
            }
            this.f28312a.e("main.device_id_original", this.g);
            this.f28299h = this.f28312a.e("main.device_id_override", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        boolean zContains;
        try {
            f28295i.d("Creating a new Kochava Device ID");
            j(b());
            StoragePrefs storagePrefs = this.f28312a;
            synchronized (storagePrefs) {
                zContains = storagePrefs.f28060a.contains("main.device_id_original");
            }
            if (!zContains) {
                k(this.g);
            }
            l(null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String d() {
        return this.f;
    }

    public final synchronized String e() {
        return this.g;
    }

    public final synchronized String f() {
        if (TextUtil.b(this.f28299h)) {
            return null;
        }
        return this.f28299h;
    }

    public final synchronized long g() {
        return this.d;
    }

    public final synchronized boolean h() {
        return this.d <= 1;
    }

    public final synchronized void i(String str) {
        try {
            this.f = str;
            if (str != null) {
                this.f28312a.k("main.app_guid_override", str);
            } else {
                this.f28312a.f("main.app_guid_override");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(String str) {
        this.g = str;
        this.f28312a.k("main.device_id", str);
    }

    public final synchronized void k(String str) {
        this.f28312a.k("main.device_id_original", str);
    }

    public final synchronized void l(String str) {
        try {
            this.f28299h = str;
            if (str != null) {
                this.f28312a.k("main.device_id_override", str);
            } else {
                this.f28312a.f("main.device_id_override");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m(boolean z2) {
        this.f28298e = z2;
        this.f28312a.g("main.last_launch_instant_app", z2);
    }
}
