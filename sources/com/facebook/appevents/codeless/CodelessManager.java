package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import cj.h;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppEventUtility;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.f0;
import l7.m0;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.b;
import q7.f;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/facebook/appevents/codeless/CodelessManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lwj/r;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityDestroyed", a.f29613j, "disable", "", "applicationId", "checkCodelessSession", "(Ljava/lang/String;)V", "", "isDebugOnEmulator", "()Z", "getCurrentDeviceSessionID$facebook_core_release", "()Ljava/lang/String;", "getCurrentDeviceSessionID", "getIsAppIndexingEnabled$facebook_core_release", "getIsAppIndexingEnabled", "appIndexingEnabled", "updateAppIndexing$facebook_core_release", "(Z)V", "updateAppIndexing", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "viewIndexingTrigger", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "Lcom/facebook/appevents/codeless/ViewIndexer;", "viewIndexer", "Lcom/facebook/appevents/codeless/ViewIndexer;", "deviceSessionID", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAppIndexingEnabled", "isCheckingSession", "Z", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CodelessManager {
    private static String deviceSessionID;
    private static volatile boolean isCheckingSession;
    private static SensorManager sensorManager;
    private static ViewIndexer viewIndexer;
    public static final CodelessManager INSTANCE = new CodelessManager();
    private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();
    private static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);
    private static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    private CodelessManager() {
    }

    private final void checkCodelessSession(String applicationId) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            s.d().execute(new com.facebook.appevents.a(applicationId, 1));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkCodelessSession$lambda$1(String str) {
        Locale locale;
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            b bVarB = f.b(s.b());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((bVarB != null ? bVarB.a() : null) != null) {
                jSONArray.put(bVarB.a());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(AppEventUtility.isEmulator() ? "1" : "0");
            try {
                locale = s.b().getResources().getConfiguration().locale;
            } catch (Exception unused) {
                locale = null;
            }
            if (locale == null) {
                locale = Locale.getDefault();
                n.e(locale, "getDefault()");
            }
            jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
            String string = jSONArray.toString();
            n.e(string, "extInfoArray.toString()");
            bundle.putString(Constants.DEVICE_SESSION_ID, getCurrentDeviceSessionID$facebook_core_release());
            bundle.putString(Constants.EXTINFO, string);
            String str3 = b0.f45085j;
            boolean z10 = true;
            JSONObject jSONObject = new b0(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, f0.f45121b, null).c().f45110b;
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (jSONObject == null || !jSONObject.optBoolean(Constants.APP_INDEXING_ENABLED, false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.schedule();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    public static final void disable() {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    public static final String getCurrentDeviceSessionID$facebook_core_release() {
        if (v7.a.b(CodelessManager.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            n.d(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
            return null;
        }
    }

    public static final boolean getIsAppIndexingEnabled$facebook_core_release() {
        if (v7.a.b(CodelessManager.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
            return false;
        }
    }

    private final boolean isDebugOnEmulator() {
        v7.a.b(this);
        return false;
    }

    public static final void onActivityDestroyed(Activity activity) {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            n.f(activity, "activity");
            CodelessMatcher.INSTANCE.getInstance().destroy(activity);
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    public static final void onActivityPaused(Activity activity) {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            n.f(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().remove(activity);
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.unschedule();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    public static final void onActivityResumed(Activity activity) {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            n.f(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.INSTANCE.getInstance().add(activity);
                Context applicationContext = activity.getApplicationContext();
                String strC = s.c();
                r rVarB = u.b(strC);
                if ((rVarB != null && rVarB.f48763g) || INSTANCE.isDebugOnEmulator()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    ViewIndexer viewIndexer2 = new ViewIndexer(activity);
                    viewIndexer = viewIndexer2;
                    ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                    viewIndexingTrigger2.setOnShakeListener(new h(14, rVarB, strC));
                    sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                    if (rVarB != null && rVarB.f48763g) {
                        viewIndexer2.schedule();
                    }
                }
                CodelessManager codelessManager = INSTANCE;
                if (!codelessManager.isDebugOnEmulator() || isAppIndexingEnabled.get()) {
                    return;
                }
                codelessManager.checkCodelessSession(strC);
            }
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$0(r rVar, String appId) {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            n.f(appId, "$appId");
            boolean zA = false;
            boolean z10 = rVar != null && rVar.f48763g;
            s sVar = s.f45212a;
            m0 m0Var = m0.f45190a;
            if (!v7.a.b(m0.class)) {
                try {
                    m0.f45190a.e();
                    zA = m0.f45196g.a();
                } catch (Throwable th2) {
                    v7.a.a(m0.class, th2);
                }
            }
            if (z10 && zA) {
                INSTANCE.checkCodelessSession(appId);
            }
        } catch (Throwable th3) {
            v7.a.a(CodelessManager.class, th3);
        }
    }

    public static final void updateAppIndexing$facebook_core_release(boolean appIndexingEnabled) {
        if (v7.a.b(CodelessManager.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th2) {
            v7.a.a(CodelessManager.class, th2);
        }
    }
}
