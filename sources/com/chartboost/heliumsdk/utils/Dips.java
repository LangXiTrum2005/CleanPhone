package com.chartboost.heliumsdk.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/utils/Dips;", "", "()V", "dipsToPixelsInt", "", "length", "context", "Landroid/content/Context;", "getDensity", "", "pixelsToIntDips", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dips {
    public static final Dips INSTANCE = new Dips();

    private Dips() {
    }

    private final float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int dipsToPixelsInt(int length, Context context) {
        Intrinsics.f(context, "context");
        return MathKt.b(length * getDensity(context));
    }

    public final int pixelsToIntDips(int length, Context context) {
        Intrinsics.f(context, "context");
        float density = getDensity(context);
        if (density == 0.0f) {
            return 0;
        }
        return MathKt.b(length / density);
    }
}
