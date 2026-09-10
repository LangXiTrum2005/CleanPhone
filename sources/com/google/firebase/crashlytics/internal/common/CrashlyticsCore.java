package com.google.firebase.crashlytics.internal.common;

import A.C0880a0;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController.AnonymousClass1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f20332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnDemandCounter f20333c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CrashlyticsFileMarker f20334e;
    public CrashlyticsFileMarker f;
    public CrashlyticsController g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdManager f20335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FileStore f20336i;
    public final com.google.firebase.crashlytics.a j;
    public final com.google.firebase.crashlytics.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f20337l;
    public final CrashlyticsNativeComponentDeferredProxy m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RemoteConfigDeferredProxy f20338n;
    public final CrashlyticsWorkers o;

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.a aVar, com.google.firebase.crashlytics.a aVar2, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.f20332b = dataCollectionArbiter;
        firebaseApp.a();
        this.f20331a = firebaseApp.f20145a;
        this.f20335h = idManager;
        this.m = crashlyticsNativeComponentDeferredProxy;
        this.j = aVar;
        this.k = aVar2;
        this.f20336i = fileStore;
        this.f20337l = crashlyticsAppQualitySessionsSubscriber;
        this.f20338n = remoteConfigDeferredProxy;
        this.o = crashlyticsWorkers;
        this.d = System.currentTimeMillis();
        this.f20333c = new OnDemandCounter();
    }

    public final void a(SettingsController settingsController) {
        CrashlyticsWorkers.a();
        CrashlyticsWorkers.a();
        this.f20334e.a();
        Logger logger = Logger.f20289a;
        logger.e("Initialization marker file was created.");
        try {
            try {
                this.j.a(new BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.e
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void a(String str) {
                        CrashlyticsCore crashlyticsCore = this.f20371a;
                        crashlyticsCore.getClass();
                        crashlyticsCore.o.f20376a.a(new f(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.d, str, 1));
                    }
                });
                this.g.f();
                if (!settingsController.d().f20747b.f20750a) {
                    logger.b("Collection of crash reports disabled in Crashlytics settings.", null);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(settingsController)) {
                    logger.f(null, "Previous sessions could not be finalized.");
                }
                this.g.g(settingsController.c());
                c();
            } catch (Exception e2) {
                logger.c(e2, "Crashlytics encountered a problem during asynchronous initialization.");
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(SettingsController settingsController) {
        Future<?> futureSubmit = this.o.f20376a.X.submit(new c(1, this, settingsController));
        Logger logger = Logger.f20289a;
        logger.b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            logger.c(e2, "Crashlytics was interrupted during initialization.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            logger.c(e3, "Crashlytics encountered a problem during initialization.");
        } catch (TimeoutException e4) {
            logger.c(e4, "Crashlytics timed out during initialization.");
        }
    }

    public final void c() {
        Logger logger = Logger.f20289a;
        CrashlyticsWorkers.a();
        try {
            CrashlyticsFileMarker crashlyticsFileMarker = this.f20334e;
            String str = crashlyticsFileMarker.f20339a;
            FileStore fileStore = crashlyticsFileMarker.f20340b;
            fileStore.getClass();
            if (new File(fileStore.f20729c, str).delete()) {
                return;
            }
            logger.f(null, "Initialization marker file was not properly removed.");
        } catch (Exception e2) {
            logger.c(e2, "Problem encountered deleting Crashlytics initialization marker.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public final boolean d(AppData appData, SettingsController settingsController) {
        boolean z2;
        AppData appData2;
        boolean z3;
        CrashlyticsController crashlyticsController;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        CrashlyticsWorkers crashlyticsWorkers = this.o;
        FileStore fileStore = this.f20336i;
        Context context = this.f20331a;
        if (context == null || (resources = context.getResources()) == null) {
            z2 = true;
        } else {
            int iD = CommonUtils.d(context, "com.crashlytics.RequireBuildId", "bool");
            if (iD > 0) {
                z2 = resources.getBoolean(iD);
            } else {
                int iD2 = CommonUtils.d(context, "com.crashlytics.RequireBuildId", k.f38992h);
                if (iD2 > 0) {
                    z2 = Boolean.parseBoolean(context.getString(iD2));
                } else {
                    z2 = true;
                }
            }
        }
        Logger logger = Logger.f20289a;
        if (z2) {
            appData2 = appData;
            if (TextUtils.isEmpty(appData2.f20294b)) {
                Log.e("FirebaseCrashlytics", mo.ono);
                Log.e("FirebaseCrashlytics", ".     |  | ");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                Log.e("FirebaseCrashlytics", ".    \\    /");
                Log.e("FirebaseCrashlytics", ".     \\  /");
                Log.e("FirebaseCrashlytics", ".      \\/");
                Log.e("FirebaseCrashlytics", mo.ono);
                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e("FirebaseCrashlytics", mo.ono);
                Log.e("FirebaseCrashlytics", ".      /\\");
                Log.e("FirebaseCrashlytics", ".     /  \\");
                Log.e("FirebaseCrashlytics", ".    /    \\");
                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", mo.ono);
                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            }
        } else {
            logger.e("Configured not to require a build ID.");
            appData2 = appData;
        }
        String str = new CLSUUID().f20309a;
        try {
            this.f = new CrashlyticsFileMarker("crash_marker", fileStore);
            this.f20334e = new CrashlyticsFileMarker("initialization_marker", fileStore);
            UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
            LogFileManager logFileManager = new LogFileManager(fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(new RemoveRepeatsStrategy());
            RemoteConfigDeferredProxy remoteConfigDeferredProxy = this.f20338n;
            remoteConfigDeferredProxy.getClass();
            remoteConfigDeferredProxy.f20291a.a(new C0880a0(new CrashlyticsRemoteConfigListener(userMetadata), 19));
            Context context2 = this.f20331a;
            IdManager idManager = this.f20335h;
            z3 = false;
            try {
                SessionReportingCoordinator sessionReportingCoordinator = new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context2, idManager, appData2, middleOutFallbackStrategy, settingsController), new CrashlyticsReportPersistence(fileStore, settingsController, this.f20337l), DataTransportCrashlyticsReportSender.a(context2, settingsController, this.f20333c), logFileManager, userMetadata, idManager, this.o);
                crashlyticsController = null;
                try {
                    this.g = new CrashlyticsController(this.f20331a, this.f20335h, this.f20332b, this.f20336i, this.f, appData, userMetadata, logFileManager, sessionReportingCoordinator, this.m, this.k, this.f20337l, this.o);
                    CrashlyticsFileMarker crashlyticsFileMarker = this.f20334e;
                    String str2 = crashlyticsFileMarker.f20339a;
                    FileStore fileStore2 = crashlyticsFileMarker.f20340b;
                    fileStore2.getClass();
                    boolean zExists = new File(fileStore2.f20729c, str2).exists();
                    try {
                        Boolean.TRUE.equals((Boolean) crashlyticsWorkers.f20376a.X.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.d
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                CrashlyticsController crashlyticsController2 = this.X.g;
                                crashlyticsController2.getClass();
                                CrashlyticsWorkers.a();
                                CrashlyticsFileMarker crashlyticsFileMarker2 = crashlyticsController2.f20320c;
                                String str3 = crashlyticsFileMarker2.f20339a;
                                FileStore fileStore3 = crashlyticsFileMarker2.f20340b;
                                fileStore3.getClass();
                                boolean z4 = true;
                                if (new File(fileStore3.f20729c, str3).exists()) {
                                    Logger.f20289a.e("Found previous crash marker.");
                                    String str4 = crashlyticsFileMarker2.f20339a;
                                    fileStore3.getClass();
                                    new File(fileStore3.f20729c, str4).delete();
                                } else {
                                    NavigableSet navigableSetC = crashlyticsController2.m.f20365b.c();
                                    String str5 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
                                    if (str5 == null || !crashlyticsController2.j.d(str5)) {
                                        z4 = false;
                                    }
                                }
                                return Boolean.valueOf(z4);
                            }
                        }).get(3L, TimeUnit.SECONDS));
                    } catch (Exception unused) {
                    }
                    CrashlyticsController crashlyticsController2 = this.g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    crashlyticsController2.getClass();
                    crashlyticsController2.f20321e.f20376a.a(new c(2, crashlyticsController2, str));
                    CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(crashlyticsController2.new AnonymousClass1(), settingsController, defaultUncaughtExceptionHandler, crashlyticsController2.j);
                    crashlyticsController2.f20325n = crashlyticsUncaughtExceptionHandler;
                    Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
                    if (!zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                        logger.b("Successfully configured exception handler.", null);
                        return true;
                    }
                    logger.b("Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    b(settingsController);
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    logger.c(e, "Crashlytics was not started due to an exception during initialization");
                    this.g = crashlyticsController;
                    return z3;
                }
            } catch (Exception e3) {
                e = e3;
                crashlyticsController = null;
                logger.c(e, "Crashlytics was not started due to an exception during initialization");
                this.g = crashlyticsController;
                return z3;
            }
        } catch (Exception e4) {
            e = e4;
            z3 = false;
        }
    }
}
