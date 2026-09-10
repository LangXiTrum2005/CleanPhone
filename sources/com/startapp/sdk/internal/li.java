package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class li {
    public static int a(Context context, int i2) {
        return Math.round(TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics()));
    }

    public static int b(Context context, int i2) {
        return Math.round(i2 / context.getResources().getDisplayMetrics().density);
    }

    public static void a(TextView textView, Set set) {
        int i2;
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        if (set.contains("BOLD") && set.contains("ITALIC")) {
            i2 = 3;
        } else if (set.contains("BOLD")) {
            i2 = 1;
        } else {
            i2 = set.contains("ITALIC") ? 2 : 0;
        }
        textView.setTypeface(null, i2);
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] iArr, int[] iArr2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int i2 : iArr2) {
            layoutParams.addRule(i2);
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            iArr[i3] = i4 == 0 ? 0 : a(context, i4);
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        windowManager.getDefaultDisplay().getSize(point);
        point.x = Math.round(point.x / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(point.y / context.getResources().getDisplayMetrics().density);
    }
}
