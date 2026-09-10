package umbriferous;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: DataCollectionArbiter.java */
/* JADX INFO: loaded from: classes3.dex */
public class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f39212attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f39213beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Boolean f39214competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f39215dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final TaskCompletionSource<Void> f39216impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f39217marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final iiion.beachfront f39218saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public TaskCompletionSource<Void> f39219wireman;

    public trm(iiion.beachfront beachfrontVar) {
        Object obj = new Object();
        this.f39215dern = obj;
        this.f39219wireman = new TaskCompletionSource<>();
        this.f39217marial = false;
        this.f39213beachfront = false;
        this.f39216impromptu = new TaskCompletionSource<>();
        Context contextApical = beachfrontVar.apical();
        this.f39218saneness = beachfrontVar;
        this.f39212attabal = CommonUtils.monoploid(contextApical);
        Boolean boolSaneness = saneness();
        this.f39214competently = boolSaneness == null ? attabal(contextApical) : boolSaneness;
        synchronized (obj) {
            try {
                if (wireman()) {
                    this.f39219wireman.trySetResult(null);
                    this.f39217marial = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean competently(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            gelandelaufer.competently.beachfront().marial("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    public static void taiyuan(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public Task<Void> apical() {
        return chinaman.saneness.saneness(this.f39216impromptu.getTask(), cutely());
    }

    public final Boolean attabal(Context context) {
        Boolean boolCompetently = competently(context);
        if (boolCompetently == null) {
            this.f39213beachfront = false;
            return null;
        }
        this.f39213beachfront = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolCompetently));
    }

    public final void beachfront(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f39214competently == null) {
            str = "global Firebase setting";
        } else {
            str = this.f39213beachfront ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        gelandelaufer.competently.beachfront().saneness(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    public Task<Void> cutely() {
        Task<Void> task;
        synchronized (this.f39215dern) {
            task = this.f39219wireman.getTask();
        }
        return task;
    }

    public void dern(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f39216impromptu.trySetResult(null);
    }

    public synchronized void impromptu(Boolean bool) {
        if (bool != null) {
            try {
                this.f39213beachfront = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f39214competently = bool != null ? bool : attabal(this.f39218saneness.apical());
        taiyuan(this.f39212attabal, bool);
        synchronized (this.f39215dern) {
            try {
                if (wireman()) {
                    if (!this.f39217marial) {
                        this.f39219wireman.trySetResult(null);
                        this.f39217marial = true;
                    }
                } else if (this.f39217marial) {
                    this.f39219wireman = new TaskCompletionSource<>();
                    this.f39217marial = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean marial() {
        try {
            return this.f39218saneness.adultoid();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final Boolean saneness() {
        if (!this.f39212attabal.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f39213beachfront = false;
        return Boolean.valueOf(this.f39212attabal.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public synchronized boolean wireman() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f39214competently;
            zBooleanValue = bool != null ? bool.booleanValue() : marial();
            beachfront(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }
}
