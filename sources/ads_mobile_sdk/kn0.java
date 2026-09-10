package ads_mobile_sdk;

import android.util.Log;
import com.google.common.base.triweekly;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kn0 {
    public static final triweekly a = triweekly.marial(4000);

    public static void a(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a("GoogleMobileAds", 6)) {
            for (String str : a.taiyuan(msg)) {
                Thread.currentThread().getName();
            }
            if (th != null) {
                Intrinsics.checkNotNullExpressionValue(Log.getStackTraceString(th), "getStackTraceString(...)");
            }
        }
    }

    public static void b(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a("GoogleMobileAds", 2)) {
            for (String str : a.taiyuan(msg)) {
                Thread.currentThread().getName();
            }
            if (th != null) {
                Intrinsics.checkNotNullExpressionValue(Log.getStackTraceString(th), "getStackTraceString(...)");
            }
        }
    }

    public static void c(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (a("GoogleMobileAds", 5)) {
            for (String str : a.taiyuan(msg)) {
                Thread.currentThread().getName();
            }
            if (th != null) {
                Intrinsics.checkNotNullExpressionValue(Log.getStackTraceString(th), "getStackTraceString(...)");
            }
        }
    }

    public static void a(String msg, Throwable th, String tag) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (a(tag, 4)) {
            for (String str : a.taiyuan(msg)) {
                Thread.currentThread().getName();
            }
            if (th != null) {
                Intrinsics.checkNotNullExpressionValue(Log.getStackTraceString(th), "getStackTraceString(...)");
            }
        }
    }

    public static /* synthetic */ void a(String str, RuntimeException runtimeException, String str2, int i) {
        if ((i & 2) != 0) {
            runtimeException = null;
        }
        if ((i & 4) != 0) {
            str2 = "GoogleMobileAds";
        }
        a(str, runtimeException, str2);
    }

    public static boolean a(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return i >= ym.b || Log.isLoggable(tag, i);
    }

    public static void a(Function0 msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (ym.a() == zm.PRODUCTION || !a("GoogleMobileAds", 2)) {
            return;
        }
        for (String str : a.taiyuan((CharSequence) msg.invoke())) {
            Thread.currentThread().getName();
        }
    }

    public static triweekly a() {
        return a;
    }
}
