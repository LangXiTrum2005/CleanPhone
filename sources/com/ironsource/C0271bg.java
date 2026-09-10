package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0271bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0271bg f28309a = new C0271bg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28310b = ",";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28311c = "[";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28312d = "]";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28313e = 118;

    private C0271bg() {
    }

    public final List<Object> a(Object... items) {
        kotlin.jvm.internal.n.f(items, "items");
        return xj.o.Q(Arrays.copyOf(items, items.length));
    }

    public final String b(List<? extends Object> methodArgs) {
        kotlin.jvm.internal.n.f(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f28309a.a((List<?>) obj) : f28309a.a(obj)))) + f28310b;
        }
        return an.h.F0(str, f28310b);
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f28309a.a(it.next()) + f28310b;
        }
        return ((Object) an.h.F0(str, f28310b)) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(levelPlayAdInfo, "<this>");
        return new AdInfo(new W8(levelPlayAdInfo), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.n.f(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, f28313e);
        return layoutParams;
    }

    private final int a(Context context, int i10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i10 * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density));
    }
}
