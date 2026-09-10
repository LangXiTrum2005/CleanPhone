package com.bytedance.sdk.openadsdk.core.sLN.lk;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static final Set<String> Lxb = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> LD = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.2
        {
            add("application/x-javascript");
        }
    };

    public enum LD {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb$Lxb, reason: collision with other inner class name */
    public enum EnumC0111Lxb {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point Lxb(Context context, int i, int i2, LD ld) {
        if (context == null) {
            context = kqm.Lxb();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iLk = le.lk(context, i);
        int iLk2 = le.lk(context, i2);
        if (iLk <= width && iLk2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (LD.HTML_RESOURCE == ld) {
            point2.x = Math.min(width, iLk);
            point2.y = Math.min(height, iLk2);
        } else {
            float f = iLk;
            float f2 = f / width;
            float f3 = iLk2;
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
        if (i3 < 0 || point2.y < 0) {
            return point;
        }
        point2.x = le.ZU(context, i3);
        point2.y = le.ZU(context, point2.y);
        return point2;
    }
}
