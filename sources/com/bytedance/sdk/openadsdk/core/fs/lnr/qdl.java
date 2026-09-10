package com.bytedance.sdk.openadsdk.core.fs.lnr;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static final Set<String> qdl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> ud = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.lnr.qdl$qdl, reason: collision with other inner class name */
    public enum EnumC0113qdl {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum ud {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point qdl(Context context, int i2, int i3, ud udVar) {
        if (context == null) {
            context = yt.qdl();
        }
        Point point = new Point(i2, i3);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iUd = ax.ud(context, i2);
        int iUd2 = ax.ud(context, i3);
        if (iUd > width || iUd2 > height) {
            Point point2 = new Point();
            if (ud.HTML_RESOURCE == udVar) {
                point2.x = Math.min(width, iUd);
                point2.y = Math.min(height, iUd2);
            } else {
                float f = iUd;
                float f2 = f / width;
                float f3 = iUd2;
                float f4 = f3 / height;
                if (f2 >= f4) {
                    point2.x = width;
                    point2.y = (int) (f3 / f2);
                } else {
                    point2.x = (int) (f / f4);
                    point2.y = height;
                }
            }
            int i4 = point2.x;
            if (i4 >= 0 && point2.y >= 0) {
                point2.x = ax.lnr(context, i4);
                point2.y = ax.lnr(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
