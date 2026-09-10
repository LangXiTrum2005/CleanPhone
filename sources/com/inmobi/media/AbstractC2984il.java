package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2984il {
    public static final saran a;
    public static final Regex b;
    public static final Set c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        a = privatdozent.attabal(preterite.dern(executorServiceNewSingleThreadExecutor).plus(sakeen.saneness(null, 1, null)));
        b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = CollectionsKt.prefect(arrayList);
    }

    public static final String a(Thread thread, Throwable error) {
        String string;
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = error.getStackTrace();
            Intrinsics.beachfront(stackTrace);
            boolean zB = b(stackTrace);
            if (!zB) {
                string = "";
            } else if (stackTrace.length >= P9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                string = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = error.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
                Intrinsics.checkNotNullParameter(stackTrace2, "<this>");
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            }
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", string);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            P9.a(jSONObject, zB, jCurrentTimeMillis);
            AbstractC2954hf.a(jSONObject, error instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e) {
            e.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], Hc.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.wireman(stackTraceElementArr[i].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.wireman(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = S4.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.overspeculate(className, name, false, 2, null)) {
                break;
            }
            String className2 = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String message, String trace) {
        Intrinsics.checkNotNullParameter("AppExitEvent", "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e) {
            e.toString();
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String a(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter("Blocked", "name");
        Intrinsics.checkNotNullParameter("MainThreadBlocked", PglCryptUtils.KEY_MESSAGE);
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            Intrinsics.checkNotNullParameter(stackTrace, "<this>");
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append('\n');
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jSONObject.put("stack", string);
        } catch (JSONException e) {
            e.toString();
        }
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final boolean a(Q9 q9) {
        Intrinsics.checkNotNullParameter(q9, "<this>");
        if (q9 instanceof T4) {
            StackTraceElement[] stackTraceElementArr = ((T4) q9).g;
            if (stackTraceElementArr == null) {
                Intrinsics.preprohormone("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (q9 instanceof C3388z1) {
            C3388z1 c3388z1 = (C3388z1) q9;
            if (c3388z1.g != 6) {
                return false;
            }
            return b.containsMatchIn(c3388z1.h);
        }
        if (q9 instanceof Wn) {
            return b(((Wn) q9).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return cls != null && Intrinsics.wireman(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        cutely.wireman(a, null, null, new C2883el(runnable, null), 3, null);
    }
}
