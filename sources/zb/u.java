package zb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f54763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.g f54764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f54766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f54769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource f54770h;

    public u(mb.g gVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f54765c = obj;
        this.f54766d = new TaskCompletionSource();
        this.f54767e = false;
        this.f54768f = false;
        this.f54770h = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.f45928a;
        this.f54764b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f54763a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f54768f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            if (boolValueOf2 == null) {
                this.f54768f = false;
                boolValueOf = null;
            } else {
                this.f54768f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f54769g = boolValueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.f54766d.trySetResult(null);
                    this.f54767e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zK;
        String str;
        Boolean bool = this.f54769g;
        if (bool != null) {
            zK = bool.booleanValue();
        } else {
            try {
                zK = this.f54764b.k();
            } catch (IllegalStateException unused) {
                zK = false;
            }
        }
        String str2 = zK ? "ENABLED" : "DISABLED";
        if (this.f54769g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f54768f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strH = l1.d.h("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        return zK;
    }
}
