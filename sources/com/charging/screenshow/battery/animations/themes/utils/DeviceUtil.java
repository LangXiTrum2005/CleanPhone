package com.charging.screenshow.battery.animations.themes.utils;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/DeviceUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUtil {
    public static int a(FragmentActivity context) {
        Intrinsics.f(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context) {
        Intrinsics.f(context, "context");
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
