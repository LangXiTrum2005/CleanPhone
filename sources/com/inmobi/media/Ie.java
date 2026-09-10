package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f22893a = Executors.newSingleThreadScheduledExecutor();

    public static final String a(Thread thread, Throwable error) {
        Intrinsics.f(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(error));
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StackTraceElement[] stackTrace = error.getStackTrace();
            Intrinsics.e(stackTrace, "getStackTrace(...)");
            boolean zB = b(stackTrace);
            S5.a(jSONObject, zB, jCurrentTimeMillis);
            CrashConfig crashConfig = AbstractC3003ea.f23565a;
            AbstractC3003ea.a(jSONObject, error instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        } catch (JSONException e2) {
            e2.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.f(stackTraceElementArr, "<this>");
        Regex regex = new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length && !a(stackTraceElementArr[i2], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i2], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i2], InMobiNative.NativeCallbacks.class) && !a(stackTraceElementArr[i2], InMobiBanner.a.class) && !a(stackTraceElementArr[i2], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.a(stackTraceElementArr[i2].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.a(stackTraceElementArr[i2].getMethodName(), InMobiSdk.class.getDeclaredMethod("a", SdkInitializationListener.class, String.class).getName())); i2++) {
            String className = stackTraceElementArr[i2].getClassName();
            Intrinsics.e(className, "getClassName(...)");
            if (StringsKt.l(className, "com.inmobi.media.l3", false)) {
                break;
            }
            String className2 = stackTraceElementArr[i2].getClassName();
            Intrinsics.e(className2, "getClassName(...)");
            if (regex.X.matcher(className2).find()) {
                return true;
            }
        }
        return false;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.f(stackTraceElementArr, "<this>");
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static final boolean a(T5 t5) {
        Intrinsics.f(t5, "<this>");
        if (t5 instanceof C3124m3) {
            StackTraceElement[] stackTraceElementArr = ((C3124m3) t5).g;
            if (stackTraceElementArr != null) {
                return b(stackTraceElementArr);
            }
            Intrinsics.m("stackTrace");
            throw null;
        }
        if (t5 instanceof C2977d1) {
            C2977d1 c2977d1 = (C2977d1) t5;
            if (c2977d1.g != 6) {
                return false;
            }
            String input = c2977d1.f23506h;
            Regex regex = new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
            Intrinsics.f(input, "input");
            return regex.X.matcher(input).find();
        }
        if (t5 instanceof mf) {
            return b(((mf) t5).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.f(stackTraceElement, "<this>");
        if (cls != null && Intrinsics.a(stackTraceElement.getClassName(), cls.getName())) {
            Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
            Intrinsics.e(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.a(stackTraceElement.getMethodName(), method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
