package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3287dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4287a;
    public final boolean b;

    public C3287dl(Context context, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        context = Build.VERSION.SDK_INT >= 24 ? ContextCompat.createDeviceProtectedStorageContext(context) : context;
        this.f4287a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.b = z;
    }
}
