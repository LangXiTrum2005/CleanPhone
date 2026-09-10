package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class IdManager implements InstallIdProvider {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20356h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallerPackageNameProvider f20357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20359c;
    public final FirebaseInstallationsApi d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataCollectionArbiter f20360e;
    public InstallIdProvider.InstallIds f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f20358b = context;
        this.f20359c = str;
        this.d = firebaseInstallationsApi;
        this.f20360e = dataCollectionArbiter;
        this.f20357a = new InstallerPackageNameProvider();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Logger.f20289a.e("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final FirebaseInstallationId b(boolean z2) {
        String strA;
        CrashlyticsWorkers.c();
        Logger logger = Logger.f20289a;
        FirebaseInstallationsApi firebaseInstallationsApi = this.d;
        String str = null;
        if (z2) {
            try {
                strA = ((InstallationTokenResult) Tasks.await(firebaseInstallationsApi.getToken(), 10000L, TimeUnit.MILLISECONDS)).a();
            } catch (Exception e2) {
                logger.f(e2, "Error getting Firebase authentication token.");
                strA = null;
            }
        } else {
            strA = null;
        }
        try {
            str = (String) Tasks.await(firebaseInstallationsApi.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            logger.f(e3, "Error getting Firebase installation id.");
        }
        return new FirebaseInstallationId(str, strA);
    }

    public final synchronized InstallIdProvider.InstallIds c() {
        String str;
        InstallIdProvider.InstallIds installIds = this.f;
        if (installIds != null && (((AutoValue_InstallIdProvider_InstallIds) installIds).f20302b != null || !this.f20360e.a())) {
            return this.f;
        }
        Logger logger = Logger.f20289a;
        logger.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f20358b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        logger.e("Cached Firebase Installation ID: " + string);
        if (this.f20360e.a()) {
            FirebaseInstallationId firebaseInstallationIdB = b(false);
            logger.e("Fetched Firebase Installation ID: " + firebaseInstallationIdB.f20354a);
            if (firebaseInstallationIdB.f20354a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                firebaseInstallationIdB = new FirebaseInstallationId(str, null);
            }
            if (Objects.equals(firebaseInstallationIdB.f20354a, string)) {
                this.f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), firebaseInstallationIdB.f20354a, firebaseInstallationIdB.f20355b);
            } else {
                this.f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, firebaseInstallationIdB.f20354a), firebaseInstallationIdB.f20354a, firebaseInstallationIdB.f20355b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        logger.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        InstallerPackageNameProvider installerPackageNameProvider = this.f20357a;
        Context context = this.f20358b;
        synchronized (installerPackageNameProvider) {
            try {
                if (installerPackageNameProvider.f20361a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    installerPackageNameProvider.f20361a = installerPackageName;
                }
                str = "".equals(installerPackageNameProvider.f20361a) ? null : installerPackageNameProvider.f20361a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
