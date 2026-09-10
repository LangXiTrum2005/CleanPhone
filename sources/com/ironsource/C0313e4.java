package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0313e4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28504b = "iads/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28505c = "CONTROLLER_FROM_BUNDLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28506d = "controllerVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28507e = "controller_html_loaded_from_bundle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f28509g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0313e4 f28503a = new C0313e4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f28508f = xj.o.Q(X3.f27647f, X3.f27648g, "mobileController.min.css", "index.html", "index.css", "index.js");

    private C0313e4() {
    }

    public static final List<String> a() {
        return f28508f;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        f28509g = z10;
        if (context != null) {
            IronSourceUtils.b(context, f28507e, z10);
        }
    }

    public static final boolean b(Context context) {
        if (context != null) {
            f28509g = IronSourceUtils.a(context, f28507e, false);
        }
        return f28509g;
    }

    public static final byte[] a(Context context, String fileName) {
        kotlin.jvm.internal.n.f(fileName, "fileName");
        byte[] bArrE = null;
        if (context != null) {
            try {
                InputStream inputStream = context.getAssets().open(f28504b.concat(fileName));
                try {
                    kotlin.jvm.internal.n.e(inputStream, "inputStream");
                    bArrE = no.b.E(inputStream);
                    inputStream.close();
                    return bArrE;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        qk.i0.j(inputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/".concat(fileName));
                e10.printStackTrace();
            }
        }
        return bArrE;
    }

    public static final String a(Context context) {
        if (context != null) {
            try {
                byte[] bArrA = a(context, f28506d);
                String string = bArrA != null ? an.h.T0(new String(bArrA, an.a.f3768a)).toString() : null;
                if (string != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: ".concat(string));
                    return string;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e10) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e10.getMessage());
                e10.printStackTrace();
            }
        }
        return null;
    }
}
