package com.google.common.net;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.mbridge.msdk.config.component.log.LogCpt;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.startapp.sdk.internal.f3;
import com.startapp.sdk.internal.qg;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function, LibraryVersionComponent.VersionExtractor, ComponentRegistrarProcessor, Deferred.DeferredHandler, OnFailureListener, Transformer, ComponentFactory, SuccessContinuation, FirebaseAppLifecycleListener, f, f3, OnSuccessListener, INativeTokenGeneratorListener, IInvocationCallbackInvoker, OnApplyWindowInsetsListener, FileUtility.ObjectInputStreamProvider {
    public final /* synthetic */ int X;

    public /* synthetic */ a(int i2) {
        this.X = i2;
    }

    @Override // com.startapp.sdk.internal.f3
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.X) {
            case 0:
                return ImmutableMultiset.p((Collection) obj);
            default:
                DataTransportCrashlyticsReportSender.f20731b.getClass();
                return CrashlyticsReportJsonTransform.f20714a.b((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        switch (this.X) {
            case 9:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            case 13:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
            case 22:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 23:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 24:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            default:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void c(Provider provider) {
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
        return AdActivity.m3258onCreate$lambda9(view, windowInsetsCompat);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String e(Context context) {
        switch (this.X) {
            case 1:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 2:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 3:
                int i2 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Logger.f20289a.c(exc, "Error fetching settings.");
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        qg.f41408a = ((AppSetIdInfo) obj).getId();
    }

    @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return FileUtility.m3273objectInputStreamProvider$lambda0(inputStream);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        switch (this.X) {
            case 14:
                return com.mbridge.msdk.config.component.common.metrics.a.a(eVar);
            default:
                return LogCpt.a(eVar);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
