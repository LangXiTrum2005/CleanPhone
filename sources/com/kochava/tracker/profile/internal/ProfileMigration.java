package com.kochava.tracker.profile.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.install.internal.LastInstall;
import com.thinkup.core.common.om.n;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileMigration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassLoggerApi f28300a = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "ProfileMigration");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f28302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f28303c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f28304e;
        public JsonObject f = null;
        public Boolean g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f28305h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f28306i = null;
        public Boolean j = null;

        public a(String str, long j, long j2, long j3, long j4) {
            this.f28301a = str;
            this.f28302b = j;
            this.f28303c = j2;
            this.d = j3;
            this.f28304e = j4;
        }
    }

    public static void a(a aVar, ProfileMain profileMain, ProfileInstall profileInstall, ProfileEngagement profileEngagement) {
        profileMain.j(aVar.f28301a);
        profileMain.k(aVar.f28301a);
        long j = aVar.f28302b;
        synchronized (profileMain) {
            profileMain.f28297c = j;
            profileMain.f28312a.j("main.first_start_time_millis", j);
        }
        long j2 = aVar.f28303c;
        synchronized (profileMain) {
            profileMain.d = j2;
            profileMain.f28312a.j("main.start_count", j2);
        }
        long j3 = aVar.d;
        profileInstall.w(j3);
        profileInstall.x(aVar.f28304e);
        if (!TextUtil.b(aVar.f28305h)) {
            profileMain.i(aVar.f28305h);
        }
        Boolean bool = aVar.g;
        if (bool != null) {
            profileInstall.n(bool.booleanValue());
        }
        JsonObject jsonObject = aVar.f;
        if (jsonObject == null || jsonObject.length() <= 0) {
            JsonObject jsonObjectW = JsonObject.w();
            jsonObjectW.B(j3, "count");
            profileInstall.t(LastInstall.a(jsonObjectW));
        } else {
            profileInstall.t(LastInstall.a(aVar.f));
        }
        if (!TextUtil.b(aVar.f28306i)) {
            String str = aVar.f28306i;
            synchronized (profileEngagement) {
                try {
                    profileEngagement.d = str;
                    if (str == null) {
                        profileEngagement.f28312a.f("engagement.push_token");
                    } else {
                        profileEngagement.f28312a.k("engagement.push_token", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Boolean bool2 = aVar.j;
        if (bool2 != null) {
            boolean zBooleanValue = bool2.booleanValue();
            synchronized (profileEngagement) {
                profileEngagement.f28283e = zBooleanValue;
                profileEngagement.f28312a.g("engagement.push_enabled", zBooleanValue);
            }
        }
    }

    public static void b(Context context, long j, ProfileMain profileMain, ProfileInstall profileInstall, ProfileEngagement profileEngagement) {
        long j2;
        boolean z2;
        a aVar;
        a aVar2;
        Boolean boolValueOf;
        ClassLoggerApi classLoggerApi = f28300a;
        classLoggerApi.d("Checking if this install is a migration from a previous SDK version");
        long j3 = j - n.m;
        try {
            int i2 = (int) (j3 / 1000);
            SharedPreferences sharedPreferences = context.getSharedPreferences("kosp", 0);
            String strReplace = sharedPreferences.getString("kochava_device_id", "").replace("STR::", "");
            long j4 = ((long) sharedPreferences.getInt("first_launch_time", i2)) * 1000;
            boolean z3 = true;
            try {
                long j5 = sharedPreferences.getInt("launch_count", 1);
                z3 = true;
                boolean z4 = sharedPreferences.getBoolean("initial_needs_sent", true);
                long j6 = sharedPreferences.getInt("install_count", !z4 ? 1 : 0);
                long j7 = ((long) sharedPreferences.getInt("initial_sent_time", !z4 ? i2 : 0)) * 1000;
                String strReplace2 = sharedPreferences.getString("kochava_app_id_override", "").replace("STR::", "");
                Boolean boolValueOf2 = sharedPreferences.contains("app_limit_tracking") ? Boolean.valueOf(sharedPreferences.getBoolean("app_limit_tracking", false)) : null;
                try {
                    JsonObject jsonObjectX = JsonObject.x(sharedPreferences.getString("last_install", "").replace("JSO::", ""), true);
                    String strReplace3 = sharedPreferences.getString("push_token", "").replace("STR::", "");
                    if (sharedPreferences.contains("push_token_enable")) {
                        j2 = j3;
                        z2 = true;
                        try {
                            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("push_token_enable", true));
                        } catch (Exception e2) {
                            e = e2;
                            classLoggerApi.d("Unable to migrate data from V3 SDK: " + e.getMessage());
                        }
                    } else {
                        j2 = j3;
                        z2 = true;
                        boolValueOf = null;
                    }
                    if (TextUtil.b(strReplace)) {
                        aVar = null;
                    } else {
                        aVar = new a(strReplace, j4, j5, j6, j7);
                        aVar.f28305h = strReplace2;
                        aVar.g = boolValueOf2;
                        aVar.f = jsonObjectX;
                        aVar.f28306i = strReplace3;
                        aVar.j = boolValueOf;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j2 = j3;
                    z2 = true;
                }
            } catch (Exception e4) {
                e = e4;
                j2 = j3;
                z2 = z3;
            }
        } catch (Exception e5) {
            e = e5;
            j2 = j3;
            z2 = true;
        }
        if (aVar != null) {
            classLoggerApi.d("Data migrated from V3 SDK");
            a(aVar, profileMain, profileInstall, profileEngagement);
            return;
        }
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("ko.tr", 0);
            String strReplace4 = context.getSharedPreferences("ko.dt.pt", 0).getString("kochava_device_id", "").replace("STR::", "");
            boolean z5 = (!sharedPreferences2.getBoolean("initial_sent", false) || sharedPreferences2.contains("initial")) ? false : z2;
            aVar2 = !TextUtil.b(strReplace4) ? new a(strReplace4, j2, 1L, z5 ? 1L : 0L, z5 ? j2 : 0L) : null;
        } catch (Exception e6) {
            classLoggerApi.d("Unable to migrate data from V2 SDK: " + e6.getMessage());
        }
        if (aVar2 == null) {
            classLoggerApi.d("No previous SDK data was found to migrate");
        } else {
            classLoggerApi.d("Data migrated from V2 SDK");
            a(aVar2, profileMain, profileInstall, profileEngagement);
        }
    }
}
