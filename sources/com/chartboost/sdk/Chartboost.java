package com.chartboost.sdk;

import A.RunnableC0907o;
import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.sdk.AppLovinEventTypes;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.a5;
import com.chartboost.sdk.impl.ja;
import com.chartboost.sdk.impl.s3;
import com.chartboost.sdk.impl.t6;
import com.chartboost.sdk.impl.w3;
import com.chartboost.sdk.impl.za;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.smartdigimkt.f3.b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/chartboost/sdk/Chartboost;", "", "()V", "INSTANCE_ID_KEY", "", "instanceId", "addDataUseConsent", "", "context", "Landroid/content/Context;", "dataUseConsent", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "clearDataUseConsent", "privacyStandard", "getBidderToken", "getDataUseConsent", "getInstanceId", "getInstanceId$ChartboostMonetization_9_10_2_productionRelease", "getSDKVersion", "initContainer", "isSdkStarted", "", "loadInstanceId", "setLoggingLevel", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/chartboost/sdk/LoggingLevel;", "startWithAppId", b.f35043u, "appSignature", "onStarted", "Lcom/chartboost/sdk/callbacks/StartCallback;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Chartboost {
    public static final Chartboost INSTANCE = new Chartboost();
    private static final String INSTANCE_ID_KEY = "ChartboostInstanceId";
    private static String instanceId;

    private Chartboost() {
    }

    @JvmStatic
    public static final void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(dataUseConsent, "dataUseConsent");
        INSTANCE.initContainer(context);
        w3 w3Var = w3.f15454b;
        if (w3Var.i()) {
            w3Var.k().a().a(dataUseConsent);
        }
    }

    @JvmStatic
    public static final void clearDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.f(context, "context");
        Intrinsics.f(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        w3 w3Var = w3.f15454b;
        if (w3Var.i()) {
            w3Var.k().a().b(privacyStandard);
        }
    }

    @JvmStatic
    public static final String getBidderToken() {
        if (isSdkStarted()) {
            return w3.f15454b.m().c().a();
        }
        za.b("Chartboost getBidderToken failed due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
        return null;
    }

    @JvmStatic
    public static final DataUseConsent getDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.f(context, "context");
        Intrinsics.f(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        w3 w3Var = w3.f15454b;
        if (w3Var.i()) {
            return w3Var.k().a().a(privacyStandard);
        }
        return null;
    }

    @JvmStatic
    public static final String getSDKVersion() {
        return "9.10.2";
    }

    private final void initContainer(Context context) {
        w3 w3Var = w3.f15454b;
        if (w3Var.i()) {
            return;
        }
        w3Var.a(context);
        w3Var.g().b().execute(new RunnableC0907o(context, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContainer$lambda$0(Context context) {
        Intrinsics.f(context, "$context");
        INSTANCE.loadInstanceId(context);
    }

    @JvmStatic
    public static final boolean isSdkStarted() {
        w3 w3Var = w3.f15454b;
        if (!w3Var.i() || !w3Var.n()) {
            return false;
        }
        try {
            return w3Var.m().b().e();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void loadInstanceId(Context context) {
        synchronized (this) {
            try {
                if (instanceId == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
                    String string = sharedPreferences.getString(INSTANCE_ID_KEY, null);
                    if (string == null || string.length() == 0) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(INSTANCE_ID_KEY, string);
                        editorEdit.apply();
                    }
                    instanceId = string;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void setLoggingLevel(LoggingLevel level) {
        Intrinsics.f(level, "level");
        za.f15713b = level;
    }

    @JvmStatic
    public static final synchronized void startWithAppId(Context context, String appId, String appSignature, StartCallback onStarted) {
        Intrinsics.f(context, "context");
        Intrinsics.f(appId, "appId");
        Intrinsics.f(appSignature, "appSignature");
        Intrinsics.f(onStarted, "onStarted");
        if (isSdkStarted()) {
            za.c("Chartboost startWithAppId skipped due to SDK already being initialized. This method only needs to be called once per app session.", null, 2, null);
            onStarted.onStartCompleted(null);
            return;
        }
        INSTANCE.initContainer(context);
        ja jaVar = new ja(context);
        Object objD = jaVar.d();
        jaVar.a();
        if (objD instanceof Result.Failure) {
            Throwable thA = Result.a(objD);
            ChartboostError unknown = thA instanceof ChartboostError ? (ChartboostError) thA : null;
            if (unknown == null) {
                unknown = new ChartboostError.Initialization.Unknown("Precondition check failed.", null);
            }
            za.b("Chartboost startWithAppId failed due to preconditions not being met. Check the logs for more information.", (Throwable) null, 2, (Object) null);
            w3.f15454b.m().c().a(appId, appSignature, onStarted, unknown);
            return;
        }
        a5.f13402a.a(context);
        w3 w3Var = w3.f15454b;
        if (w3Var.i()) {
            if (!isSdkStarted()) {
                w3Var.a(appId, appSignature);
                t6.f15176a.a(w3Var.d().g(), w3Var.d().j());
            }
            w3Var.b().a();
            s3.a(w3Var.m().c(), appId, appSignature, onStarted, null, 8, null);
        } else {
            w3Var.m().c().a(appId, appSignature, onStarted, new ChartboostError.Initialization.Internal("Dependency Injection container not initialized.", null));
        }
    }
}
