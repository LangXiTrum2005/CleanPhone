package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3488e4 {
    private static final String b = "iads/";
    private static final String c = "CONTROLLER_FROM_BUNDLE";
    private static final String d = "controllerVersion";
    private static final String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;
    public static final C3488e4 a = new C3488e4();
    private static final List<String> f = p002kotlin.collections.adultoid.kowloon(X3.f, X3.g, "mobileController.min.css", "index.html", "index.css", "index.js");

    private C3488e4() {
    }

    public static final List<String> a() {
        return f;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            IronSourceUtils.b(context, e, z);
        }
    }

    public static final boolean b(Context context) {
        if (context != null) {
            g = IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    public static final byte[] a(Context context, String fileName) {
        byte[] bArrDern;
        Throwable th;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr = null;
        if (context != null) {
            try {
                try {
                    InputStream inputStream = context.getAssets().open(b + fileName);
                    try {
                        Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                        bArrDern = interaction.attabal.dern(inputStream);
                        try {
                            Unit unit = Unit.f29295attabal;
                            interaction.saneness.attabal(inputStream, null);
                            return bArrDern;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                interaction.saneness.attabal(inputStream, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        bArrDern = null;
                        th = th4;
                    }
                } catch (Exception e2) {
                    e = e2;
                    IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                    e.printStackTrace();
                    return bArr;
                }
            } catch (Exception e3) {
                e = e3;
                bArr = bArrDern;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                e.printStackTrace();
                return bArr;
            }
        }
        return bArr;
    }

    public static final String a(Context context) {
        if (context != null) {
            try {
                byte[] bArrA = a(context, d);
                String string = bArrA != null ? StringsKt.stupefactive(new String(bArrA, Charsets.UTF_8)).toString() : null;
                if (string != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + string);
                    return string;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e2) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return null;
    }
}
