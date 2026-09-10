package com.facebook.appevents.internal;

import an.h;
import an.p;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/internal/AppEventUtility;", "", "<init>", "()V", "Lwj/r;", "assertIsNotMainThread", "assertIsMainThread", "", X3.i.X, "", "normalizePrice", "(Ljava/lang/String;)D", "", "bytes", "bytesToHex", "([B)Ljava/lang/String;", "", "isEmulator", "()Z", "getAppVersion", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/view/View;", "getRootView", "(Landroid/app/Activity;)Landroid/view/View;", "PRICE_REGEX", "Ljava/lang/String;", "isMainThread", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventUtility {
    public static final AppEventUtility INSTANCE = new AppEventUtility();
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    public static final String bytesToHex(byte[] bytes) {
        n.f(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bytes) {
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        String string = stringBuffer.toString();
        n.e(string, "sb.toString()");
        return string;
    }

    public static final String getAppVersion() {
        Context contextB = s.b();
        try {
            String str = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0).versionName;
            n.e(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View getRootView(Activity activity) {
        if (v7.a.b(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            v7.a.a(AppEventUtility.class, th2);
            return null;
        }
    }

    public static final boolean isEmulator() {
        String FINGERPRINT = Build.FINGERPRINT;
        n.e(FINGERPRINT, "FINGERPRINT");
        if (p.p0(FINGERPRINT, "generic", false) || p.p0(FINGERPRINT, "unknown", false)) {
            return true;
        }
        String MODEL = Build.MODEL;
        n.e(MODEL, "MODEL");
        if (h.q0(MODEL, "google_sdk", false) || h.q0(MODEL, "Emulator", false) || h.q0(MODEL, "Android SDK built for x86", false)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        n.e(MANUFACTURER, "MANUFACTURER");
        if (h.q0(MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        String BRAND = Build.BRAND;
        n.e(BRAND, "BRAND");
        if (p.p0(BRAND, "generic", false)) {
            String DEVICE = Build.DEVICE;
            n.e(DEVICE, "DEVICE");
            if (p.p0(DEVICE, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    private static final boolean isMainThread() {
        return n.a(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final double normalizePrice(String value) {
        Locale locale;
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(value);
            if (!matcher.find()) {
                return 0.0d;
            }
            String strGroup = matcher.group(0);
            try {
                locale = s.b().getResources().getConfiguration().locale;
            } catch (Exception unused) {
                locale = null;
            }
            if (locale == null) {
                locale = Locale.getDefault();
                n.e(locale, "getDefault()");
            }
            return NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
        } catch (ParseException unused2) {
            return 0.0d;
        }
    }

    public static final void assertIsMainThread() {
    }

    public static final void assertIsNotMainThread() {
    }
}
