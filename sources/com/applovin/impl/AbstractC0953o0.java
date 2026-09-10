package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0953o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f11355a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11356b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f11357c = Collections.synchronizedMap(new HashMap(4));
    private static final Map d = new HashMap(2);

    /* JADX INFO: renamed from: com.applovin.impl.o0$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11360c;
        private int d;

        public a(int i2, int i3, int i4, int i5) {
            this.f11358a = i2;
            this.f11359b = i3;
            this.f11360c = i4;
            this.d = i5;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f11358a;
        }

        public int c() {
            return this.f11360c;
        }

        public int d() {
            return this.f11359b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put(TtmlNode.LEFT, Integer.valueOf(this.f11358a));
            map.put("top", Integer.valueOf(this.f11359b));
            map.put(TtmlNode.RIGHT, Integer.valueOf(this.f11360c));
            map.put("bottom", Integer.valueOf(this.d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return a() + ((c() + ((d() + ((b() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.o0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11363c;
        private int d;

        /* JADX INFO: renamed from: com.applovin.impl.o0$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f11364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f11365b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f11366c;
            private int d;

            public a a(int i2) {
                this.f11366c = i2;
                return this;
            }

            public a b(int i2) {
                this.d = i2;
                return this;
            }

            public a c(int i2) {
                this.f11364a = i2;
                return this;
            }

            public a d(int i2) {
                this.f11365b = i2;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb.append(this.f11364a);
                sb.append(", topRight=");
                sb.append(this.f11365b);
                sb.append(", bottomLeft=");
                sb.append(this.f11366c);
                sb.append(", bottomRight=");
                return android.support.v4.media.a.i(this.d, ")", sb);
            }

            public b a() {
                return new b(this.f11364a, this.f11365b, this.f11366c, this.d);
            }
        }

        public b(int i2, int i3, int i4, int i5) {
            this.f11361a = i2;
            this.f11362b = i3;
            this.f11363c = i4;
            this.d = i5;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.f11361a;
        }

        public int d() {
            return this.f11362b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f11363c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        boolean z2 = kVar == null || ((Boolean) kVar.a(x4.E6)).booleanValue();
        if (!c(context) || z2) {
            Map map = d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerF = n7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = n7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f11356b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f11356b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f11355a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f11355a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager windowManagerF;
        if (((Boolean) kVar.a(x4.Y3)).booleanValue() && k() && (windowManagerF = n7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f11357c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f11357c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i2, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i2);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
