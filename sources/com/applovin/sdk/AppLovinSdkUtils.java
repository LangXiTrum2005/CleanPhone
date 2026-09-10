package com.applovin.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f10442a = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10444b;

        public Size(int i10, int i11) {
            this.f10443a = i10;
            this.f10444b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.f10443a == size.getWidth() && this.f10444b == size.getHeight();
        }

        public int getHeight() {
            return this.f10444b;
        }

        public int getWidth() {
            return this.f10443a;
        }

        public int hashCode() {
            int i10 = this.f10444b;
            int i11 = this.f10443a;
            return ((i11 >>> 16) | (i11 << 16)) ^ i10;
        }

        public String toString() {
            return this.f10443a + "x" + this.f10444b;
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static int dpToPx(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(String str, @Nullable String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int iG = q7.g(str);
        if (str2 == null || iG >= q7.g(str2)) {
            return str3 == null || iG <= q7.g(str3);
        }
        return false;
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= q7.g(str);
    }

    public static boolean isTablet(Context context) {
        Point pointB = p0.b(context);
        return Math.min(pointB.x, pointB.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i10) {
        return (int) Math.ceil(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10) {
        runOnUiThreadDelayed(runnable, j10, f10442a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z10, Runnable runnable) {
        if (z10 || !q7.i()) {
            f10442a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10, Handler handler) {
        if (j10 > 0) {
            handler.postDelayed(runnable, j10);
        } else if (q7.i()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
