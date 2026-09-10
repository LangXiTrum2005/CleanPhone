package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: loaded from: classes.dex */
public class PathKeyframe extends Keyframe<PointF> {
    public Path q;
    public final Keyframe r;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe keyframe) {
        super(lottieComposition, (PointF) keyframe.f9951b, (PointF) keyframe.f9952c, keyframe.d, keyframe.f9953e, keyframe.f, keyframe.g, keyframe.f9954h);
        this.r = keyframe;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f9952c;
        Object obj3 = this.f9951b;
        boolean z2 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f9952c) == null || z2) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        Keyframe keyframe = this.r;
        PointF pointF3 = keyframe.o;
        PointF pointF4 = keyframe.f9958p;
        ThreadLocal threadLocal = Utils.f9946a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
