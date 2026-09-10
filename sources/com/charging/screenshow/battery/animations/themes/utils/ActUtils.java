package com.charging.screenshow.battery.animations.themes.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/ActUtils;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActUtils {
    public static Intent a(Context context, Class cls) {
        Intrinsics.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static void b(Context context, Class cls) {
        Intrinsics.f(context, "context");
        context.startActivity(a(context, cls));
    }
}
