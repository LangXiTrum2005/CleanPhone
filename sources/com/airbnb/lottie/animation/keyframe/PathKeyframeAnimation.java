package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f9662i;
    public final float[] j;
    public final PathMeasure k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PathKeyframe f9663l;

    public PathKeyframeAnimation(ArrayList arrayList) {
        super(arrayList);
        this.f9662i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        float f2;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.q;
        if (path == null) {
            return (PointF) keyframe.f9951b;
        }
        LottieValueCallback lottieValueCallback = this.f9646e;
        if (lottieValueCallback != null) {
            f2 = f;
            PointF pointF = (PointF) lottieValueCallback.b(pathKeyframe.g, pathKeyframe.f9954h.floatValue(), (PointF) pathKeyframe.f9951b, (PointF) pathKeyframe.f9952c, e(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        PathKeyframe pathKeyframe2 = this.f9663l;
        PathMeasure pathMeasure = this.k;
        if (pathKeyframe2 != pathKeyframe) {
            pathMeasure.setPath(path, false);
            this.f9663l = pathKeyframe;
        }
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.j;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.f9662i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
