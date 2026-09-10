package com.blankj.utilcode.util;

import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: compiled from: ScreenUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class polloi {
    public static int attabal() {
        WindowManager windowManager = (WindowManager) adultoid.attabal().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }
}
