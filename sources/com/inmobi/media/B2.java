package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public abstract class B2 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f) {
        try {
            return MathKt.b(f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f) {
        try {
            return (int) (f / U3.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final boolean a(JSONArray jSONArray) {
        Intrinsics.f(jSONArray, "<this>");
        return jSONArray.length() == 0;
    }

    public static final int a(int i2) {
        try {
            return (int) (i2 / U3.b());
        } catch (Exception unused) {
            return i2;
        }
    }

    public static final float a(float f) {
        return MathKt.b(f * 10.0f) / 10.0f;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        Intrinsics.f(context, "<this>");
        Intrinsics.f(filter, "filter");
        if (L3.f22938a.B()) {
            return context.registerReceiver(broadcastReceiver, filter, 2);
        }
        return context.registerReceiver(broadcastReceiver, filter);
    }

    public static final boolean a(Context context) {
        int i2;
        Intrinsics.f(context, "<this>");
        if (!L3.f22938a.D()) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.e(packageInfo, "getPackageInfo(...)");
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i2 = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        } catch (Exception unused) {
        }
        return i2 >= 35;
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        Intrinsics.f(inputStream, "<this>");
        Intrinsics.f(mimeType, "mimeType");
        Map mapI = MapsKt.i(new Pair("Access-Control-Allow-Origin", "*"));
        if (L3.G()) {
            return new WebResourceResponse(mimeType, "UTF-8", 200, "OK", mapI, inputStream);
        }
        return new WebResourceResponse(mimeType, "UTF-8", inputStream);
    }

    public static final void a(Cf cf, RelativeLayout.LayoutParams layoutParams, EnumC3179pa orientation) {
        Intrinsics.f(cf, "<this>");
        Intrinsics.f(layoutParams, "layoutParams");
        Intrinsics.f(orientation, "orientation");
        Bf bf = (Bf) cf.f22753a.get(orientation);
        int i2 = bf != null ? bf.f22728a : 0;
        Bf bf2 = (Bf) cf.f22753a.get(orientation);
        int i3 = bf2 != null ? bf2.f22730c : 0;
        Bf bf3 = (Bf) cf.f22753a.get(orientation);
        layoutParams.setMargins(i2, 0, i3, bf3 != null ? bf3.d : 0);
    }
}
