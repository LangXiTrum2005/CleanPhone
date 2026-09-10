package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f13527a;

    public bf(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.f13527a = new WeakReference(activity);
    }

    public final DisplayMetrics a() {
        Activity activity = (Activity) this.f13527a.get();
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Intrinsics.e(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    public final af b() {
        DisplayMetrics displayMetricsA = a();
        int i2 = displayMetricsA.widthPixels;
        int i3 = displayMetricsA.heightPixels;
        float f = displayMetricsA.density;
        WindowInsetsCompat windowInsetsCompatC = c();
        if (windowInsetsCompatC == null) {
            return new af(i2, i3, f, null, null, 24, null);
        }
        Insets insetsE = windowInsetsCompatC.e(7);
        Intrinsics.e(insetsE, "getInsets(...)");
        DisplayCutoutCompat displayCutoutCompatD = windowInsetsCompatC.d();
        Insets insetsB = displayCutoutCompatD != null ? Insets.b(displayCutoutCompatD.b(), displayCutoutCompatD.d(), displayCutoutCompatD.c(), displayCutoutCompatD.a()) : Insets.f4296e;
        Insets insetsB2 = Insets.b(Math.max(insetsE.f4297a, insetsB.f4297a), Math.max(insetsE.f4298b, insetsB.f4298b), Math.max(insetsE.f4299c, insetsB.f4299c), Math.max(insetsE.d, insetsB.d));
        int i4 = (i2 - insetsB2.f4297a) - insetsB2.f4299c;
        int i5 = (i3 - insetsB2.f4298b) - insetsB2.d;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i4, i5, "VAST rendering container computed: width=", ", height=", ", density=");
        sbP.append(f);
        za.c(sbP.toString(), null, 2, null);
        return new af(i4, i5, f, null, insetsB2, 8, null);
    }

    public final WindowInsetsCompat c() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.f13527a.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(decorView);
        za.a("Window insets retrieved: " + windowInsetsCompatN, (Throwable) null, 2, (Object) null);
        return windowInsetsCompatN;
    }
}
