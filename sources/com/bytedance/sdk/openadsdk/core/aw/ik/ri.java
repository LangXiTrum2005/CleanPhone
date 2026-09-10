package com.bytedance.sdk.openadsdk.core.aw.ik;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static final Set<String> ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ri.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> lr = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ri.2
        {
            add("application/x-javascript");
        }
    };

    public enum lr {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ri$ri, reason: collision with other inner class name */
    public enum EnumC0228ri {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public static Point ri(Context context, int i, int i2, lr lrVar) {
        if (context == null) {
            context = nr.ri();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iLr = qd.lr(context, i);
        int iLr2 = qd.lr(context, i2);
        if (iLr > width || iLr2 > height) {
            Point point2 = new Point();
            if (lr.HTML_RESOURCE == lrVar) {
                point2.x = Math.min(width, iLr);
                point2.y = Math.min(height, iLr2);
            } else {
                float f = iLr;
                float f2 = f / width;
                float f3 = iLr2;
                float f4 = f3 / height;
                if (f2 >= f4) {
                    point2.x = width;
                    point2.y = (int) (f3 / f2);
                } else {
                    point2.x = (int) (f / f4);
                    point2.y = height;
                }
            }
            int i3 = point2.x;
            if (i3 >= 0 && point2.y >= 0) {
                point2.x = qd.ik(context, i3);
                point2.y = qd.ik(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
