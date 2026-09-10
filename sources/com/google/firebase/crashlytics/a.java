package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.c;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.smartdigimkt.v0.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Deferred.DeferredHandler, BreadcrumbSource, AnalyticsEventLogger, ComponentFactory {
    public final /* synthetic */ Object X;

    public /* synthetic */ a(Object obj) {
        this.X = obj;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.X;
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.f20275c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.f20275c.a(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        long j;
        String str;
        IOException iOException;
        FirebaseCrashlytics firebaseCrashlytics;
        int i2 = CrashlyticsRegistrar.d;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.X;
        crashlyticsRegistrar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class);
        Deferred deferredI = componentContainer.i(CrashlyticsNativeComponent.class);
        Deferred deferredI2 = componentContainer.i(AnalyticsConnector.class);
        Deferred deferredI3 = componentContainer.i(FirebaseRemoteConfigInterop.class);
        ExecutorService executorService = (ExecutorService) componentContainer.e(crashlyticsRegistrar.f20278a);
        ExecutorService executorService2 = (ExecutorService) componentContainer.e(crashlyticsRegistrar.f20279b);
        ExecutorService executorService3 = (ExecutorService) componentContainer.e(crashlyticsRegistrar.f20280c);
        firebaseApp.a();
        Context context = firebaseApp.f20145a;
        String packageName = context.getPackageName();
        Logger logger = Logger.f20289a;
        logger.d("Initializing Firebase Crashlytics 20.0.3 for " + packageName);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(context);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(context, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferredI);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferredI2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, new a(analyticsDeferredProxy), new a(analyticsDeferredProxy), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferredI3), crashlyticsWorkers);
        firebaseApp.a();
        String str2 = firebaseApp.f20147c.f20155b;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", k.f38992h);
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", k.f38992h);
        }
        String string = iD != 0 ? context.getResources().getString(iD) : null;
        ArrayList<BuildIdInfo> arrayList = new ArrayList();
        int iD2 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD3 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD4 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
            j = jCurrentTimeMillis;
            str = str2;
            iOException = null;
            logger.b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4)), null);
        } else {
            String[] stringArray = context.getResources().getStringArray(iD2);
            String[] stringArray2 = context.getResources().getStringArray(iD3);
            String[] stringArray3 = context.getResources().getStringArray(iD4);
            j = jCurrentTimeMillis;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i3 = 0;
                while (i3 < stringArray3.length) {
                    int i4 = i3;
                    arrayList.add(new BuildIdInfo(stringArray[i3], stringArray2[i4], stringArray3[i4]));
                    i3 = i4 + 1;
                    str2 = str2;
                }
                str = str2;
                iOException = null;
            } else {
                str = str2;
                iOException = null;
                logger.b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)), null);
            }
        }
        logger.b("Mapping file ID is: " + string, iOException);
        for (BuildIdInfo buildIdInfo : arrayList) {
            StringBuilder sbY = android.support.v4.media.a.y("Build id for ", buildIdInfo.f20304a, " on ");
            sbY.append(buildIdInfo.f20305b);
            sbY.append(": ");
            sbY.append(buildIdInfo.f20306c);
            logger.b(sbY.toString(), null);
        }
        DevelopmentPlatformProvider developmentPlatformProvider = new DevelopmentPlatformProvider(context);
        try {
            String packageName2 = context.getPackageName();
            String strD = idManager.d();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string2 = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
            String str3 = packageInfo.versionName;
            if (str3 == null) {
                str3 = "0.0";
            }
            String str4 = str3;
            AppData appData = new AppData(str, string, arrayList, strD, packageName2, string2, str4, developmentPlatformProvider);
            logger.e("Installer package name is: " + strD);
            SettingsController settingsControllerA = SettingsController.a(context, str, idManager, new HttpRequestFactory(), string2, str4, fileStore, dataCollectionArbiter);
            settingsControllerA.e(crashlyticsWorkers).addOnFailureListener(executorService3, new com.google.common.net.a(7));
            if (crashlyticsCore.d(appData, settingsControllerA)) {
                crashlyticsCore.o.f20376a.a(new c(0, crashlyticsCore, settingsControllerA));
            }
            firebaseCrashlytics = new FirebaseCrashlytics();
        } catch (PackageManager.NameNotFoundException e2) {
            logger.c(e2, "Error retrieving app package info.");
            firebaseCrashlytics = null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis2 > 16) {
            logger.b(androidx.media3.extractor.text.ttml.a.j(jCurrentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms"), null);
        }
        return firebaseCrashlytics;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void c(Provider provider) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.X;
        analyticsDeferredProxy.getClass();
        Logger logger = Logger.f20289a;
        logger.b("AnalyticsConnector now available.", null);
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleG = analyticsConnector.g("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleG == null) {
            logger.b("Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            analyticsConnectorHandleG = analyticsConnector.g(AppMeasurement.CRASH_ORIGIN, crashlyticsAnalyticsListener);
            if (analyticsConnectorHandleG != null) {
                logger.f(null, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (analyticsConnectorHandleG == null) {
            logger.f(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        logger.b("Registered Firebase Analytics listener.", null);
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator it = analyticsDeferredProxy.d.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.a((BreadcrumbHandler) it.next());
                }
                crashlyticsAnalyticsListener.f20277b = breadcrumbAnalyticsEventReceiver;
                crashlyticsAnalyticsListener.f20276a = blockingAnalyticsEventLogger;
                analyticsDeferredProxy.f20275c = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.f20274b = blockingAnalyticsEventLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void d(Bundle bundle) {
        ((AnalyticsDeferredProxy) this.X).f20274b.d(bundle);
    }
}
