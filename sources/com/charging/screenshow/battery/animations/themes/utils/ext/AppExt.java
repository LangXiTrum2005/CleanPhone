package com.charging.screenshow.battery.animations.themes.utils.ext;

import android.os.Handler;
import android.os.Looper;
import com.charging.screenshow.battery.animations.themes.MyApp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/ext/AppExt;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppExt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MyApp f13318a;

    public static MyApp a() {
        MyApp myApp = f13318a;
        if (myApp != null) {
            return myApp;
        }
        Intrinsics.m("appContext");
        throw null;
    }

    public static void b(Function0 function0) {
        new Handler(Looper.getMainLooper()).post(new a(function0, 0));
    }
}
