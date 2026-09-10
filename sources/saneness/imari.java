package saneness;

import ads_mobile_sdk.kn0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class imari {
    public static int attabal(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) TypedValue.applyDimension(1, i, dern(context));
    }

    public static Display beachfront(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (Exception e) {
                com.google.common.base.triweekly triweeklyVar = kn0.a;
                kn0.a("Unable to get display: " + e.getMessage(), null, null, 6);
            }
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static Pair competently(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        View view = viewFindViewById != null ? viewFindViewById : null;
        Pair pair = view != null ? new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight())) : new Pair(0, 0);
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Integer numValueOf = Integer.valueOf(pastie.dern.wireman(iIntValue / displayMetrics.density));
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return new Pair(numValueOf, Integer.valueOf(pastie.dern.wireman(iIntValue2 / displayMetrics2.density)));
    }

    public static DisplayMetrics dern(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        return displayMetrics;
    }

    public static int marial(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return pastie.dern.wireman(i / dern(context).density);
    }

    public static Rect saneness(Context context, Rect rect) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i = rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int iWireman = pastie.dern.wireman(i / dern(context).density);
        int i2 = rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int iWireman2 = pastie.dern.wireman(i2 / displayMetrics.density);
        int i3 = rect.right;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int iWireman3 = pastie.dern.wireman(i3 / displayMetrics2.density);
        int i4 = rect.bottom;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        return new Rect(iWireman, iWireman2, iWireman3, pastie.dern.wireman(i4 / displayMetrics3.density));
    }

    public static Pair wireman(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        View view = viewFindViewById != null ? viewFindViewById : null;
        Pair pair = view != null ? new Pair(Integer.valueOf(view.getTop()), Integer.valueOf(view.getBottom())) : new Pair(0, 0);
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Integer numValueOf = Integer.valueOf(pastie.dern.wireman(iIntValue / displayMetrics.density));
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return new Pair(numValueOf, Integer.valueOf(pastie.dern.wireman(iIntValue2 / displayMetrics2.density)));
    }
}
