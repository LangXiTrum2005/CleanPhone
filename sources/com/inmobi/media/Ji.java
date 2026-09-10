package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import com.inmobi.media.Ji;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ji {
    public static Context a = null;
    public static String b = "";
    public static String c;
    public static final AtomicBoolean d;
    public static final taiyuan e;
    public static boolean f;
    public static final ExecutorService g;
    public static final saran h;
    public static int i;

    static {
        String name = Ji.class.getSimpleName();
        d = new AtomicBoolean();
        e = saneness.saneness(new Function0() { // from class: adsuki.technofreak
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ji.a();
            }
        });
        Intrinsics.checkNotNullExpressionValue(name, "TAG");
        Intrinsics.checkNotNullParameter(name, "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new B9(name, false));
        g = COMPONENT_SERVICE;
        Intrinsics.checkNotNullExpressionValue(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        h = privatdozent.attabal(preterite.dern(COMPONENT_SERVICE));
    }

    public static final C3349xc a() {
        return new C3349xc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e2) {
                try {
                    throw new Zk(e2.getMessage());
                } catch (Zk e3) {
                    Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    e3.getMessage();
                    taiyuan taiyuanVar = P9.a;
                    P9.a(new L2(e3));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    } catch (Exception e4) {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                        e4.getMessage();
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                        taiyuan taiyuanVar2 = P9.a;
                        AbstractC2973i9.a(e4);
                    }
                    return str;
                } catch (Exception e5) {
                    Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    e5.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        Intrinsics.beachfront(defaultUserAgent);
        return defaultUserAgent;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return i == 2;
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            T6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
            e2.getMessage();
        }
    }

    public static final String c() {
        if (b.length() == 0) {
            b = b(a);
        }
        return b;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "coppa_store");
        Intrinsics.checkNotNullParameter("im_accid", com.ironsource.X3.i.W);
        return eaA.a.getString("im_accid", null);
    }
}
