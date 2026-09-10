package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes4.dex */
public class DataCollectionArbiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20349a;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f20352e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20350b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f20351c = new TaskCompletionSource();
    public final TaskCompletionSource f = new TaskCompletionSource();

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.d = false;
        firebaseApp.a();
        Context context = firebaseApp.f20145a;
        this.f20349a = firebaseApp;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.d = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.f20289a.c(e2, "Could not read data collection permission from manifest");
            }
            if (boolValueOf2 == null) {
                this.d = false;
                boolValueOf = null;
            } else {
                this.d = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f20352e = boolValueOf;
        synchronized (this.f20350b) {
            try {
                if (a()) {
                    this.f20351c.trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zBooleanValue;
        boolean z2;
        String str;
        Boolean bool = this.f20352e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            try {
                FirebaseApp firebaseApp = this.f20349a;
                firebaseApp.a();
                DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) firebaseApp.g.get();
                synchronized (dataCollectionConfigStorage) {
                    z2 = dataCollectionConfigStorage.f20900c;
                }
                zBooleanValue = z2;
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
        }
        String str2 = zBooleanValue ? "ENABLED" : "DISABLED";
        if (this.f20352e == null) {
            str = "global Firebase setting";
        } else {
            str = this.d ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.f20289a.b(androidx.datastore.preferences.protobuf.a.n("Crashlytics automatic data collection ", str2, " by ", str, mo.ono), null);
        return zBooleanValue;
    }
}
