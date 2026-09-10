package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
class LoginLogger {
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InternalAppEventsLogger f16484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16486c;

    public LoginLogger(Context context, String str) {
        PackageInfo packageInfo;
        this.f16485b = str;
        this.f16484a = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.f16486c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Bundle b(String str) {
        if (CrashShieldHandler.b(LoginLogger.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.a(LoginLogger.class, th);
            return null;
        }
    }

    public final void a(String str, String str2) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Bundle bundleB = b("");
            bundleB.putString("2_result", "error");
            bundleB.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleB.putString("3_method", str2);
            this.f16484a.d(bundleB, str);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
