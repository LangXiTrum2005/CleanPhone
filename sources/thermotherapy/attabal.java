package thermotherapy;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import picketboat.saneness;
import silty.dern;

/* JADX INFO: compiled from: DataCollectionConfigStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f38820attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f38821dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final SharedPreferences f38822saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f38823wireman;

    public attabal(Context context, String str, dern dernVar) {
        Context contextAttabal = attabal(context);
        this.f38820attabal = contextAttabal;
        this.f38822saneness = contextAttabal.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f38821dern = dernVar;
        this.f38823wireman = dern();
    }

    public static Context attabal(Context context) {
        return saneness.createDeviceProtectedStorageContext(context);
    }

    public final boolean dern() {
        return this.f38822saneness.contains("firebase_data_collection_default_enabled") ? this.f38822saneness.getBoolean("firebase_data_collection_default_enabled", true) : wireman();
    }

    public synchronized boolean saneness() {
        return this.f38823wireman;
    }

    public final boolean wireman() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f38820attabal.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f38820attabal.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
