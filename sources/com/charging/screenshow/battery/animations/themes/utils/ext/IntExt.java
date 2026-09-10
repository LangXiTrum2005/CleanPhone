package com.charging.screenshow.battery.animations.themes.utils.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/ext/IntExt;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntExt {
    public static int a(int i2) {
        return (int) ((i2 * AppExt.a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(int i2) {
        return AppExt.a().getResources().getColor(i2);
    }

    public static String c(int i2) {
        String string = AppExt.a().getString(i2);
        Intrinsics.e(string, "getString(...)");
        return string;
    }
}
