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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f8930a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8931b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f8932c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f8933d = new HashMap(2);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8937d;

        public a(int i10, int i11, int i12, int i13) {
            this.f8934a = i10;
            this.f8935b = i11;
            this.f8936c = i12;
            this.f8937d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f8934a;
        }

        public int c() {
            return this.f8936c;
        }

        public int d() {
            return this.f8935b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f8934a));
            map.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, Integer.valueOf(this.f8935b));
            map.put(TtmlNode.RIGHT, Integer.valueOf(this.f8936c));
            map.put("bottom", Integer.valueOf(this.f8937d));
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
            return this.f8937d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8941d;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f8942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f8943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f8944c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f8945d;

            public a a(int i10) {
                this.f8944c = i10;
                return this;
            }

            public a b(int i10) {
                this.f8945d = i10;
                return this;
            }

            public a c(int i10) {
                this.f8942a = i10;
                return this;
            }

            public a d(int i10) {
                this.f8943b = i10;
                return this;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb2.append(this.f8942a);
                sb2.append(", topRight=");
                sb2.append(this.f8943b);
                sb2.append(", bottomLeft=");
                sb2.append(this.f8944c);
                sb2.append(", bottomRight=");
                return l1.d.i(sb2, this.f8945d, ")");
            }

            public b a() {
                return new b(this.f8942a, this.f8943b, this.f8944c, this.f8945d);
            }
        }

        public b(int i10, int i11, int i12, int i13) {
            this.f8938a = i10;
            this.f8939b = i11;
            this.f8940c = i12;
            this.f8941d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f8941d;
        }

        public int c() {
            return this.f8938a;
        }

        public int d() {
            return this.f8939b;
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
            return this.f8940c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return true;
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
        return true;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        boolean z10 = lVar == null || ((Boolean) lVar.a(z4.I6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f8933d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        WindowManager windowManagerF = q7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f8933d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = q7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f8931b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8931b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f8930a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8930a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.l lVar) {
        WindowManager windowManagerF;
        if (((Boolean) lVar.a(z4.f10135e4)).booleanValue() && i() && (windowManagerF = q7.f(context)) != null) {
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
        return (Map) f8932c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f8932c.put(str, aVar.e());
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
