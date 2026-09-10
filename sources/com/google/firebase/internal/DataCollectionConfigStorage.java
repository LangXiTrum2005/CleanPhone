package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.firebase.events.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public class DataCollectionConfigStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher f20899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20900c;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
        this.f20898a = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f20899b = publisher;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f20900c = z2;
    }
}
