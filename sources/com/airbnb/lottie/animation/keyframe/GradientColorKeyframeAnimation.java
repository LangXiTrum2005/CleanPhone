package com.airbnb.lottie.animation.keyframe;

import android.support.v4.media.a;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GradientColor f9658i;

    public GradientColorKeyframeAnimation(List list) {
        super(list);
        GradientColor gradientColor = (GradientColor) ((Keyframe) list.get(0)).f9951b;
        int length = gradientColor != null ? gradientColor.f9756b.length : 0;
        this.f9658i = new GradientColor(new float[length], new int[length]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        GradientColor gradientColor = (GradientColor) keyframe.f9951b;
        GradientColor gradientColor2 = (GradientColor) keyframe.f9952c;
        GradientColor gradientColor3 = this.f9658i;
        gradientColor3.getClass();
        int[] iArr = gradientColor.f9756b;
        int length = iArr.length;
        int[] iArr2 = gradientColor2.f9756b;
        if (length != iArr2.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(a.i(iArr2.length, ")", sb));
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            gradientColor3.f9755a[i2] = MiscUtils.d(gradientColor.f9755a[i2], gradientColor2.f9755a[i2], f);
            gradientColor3.f9756b[i2] = GammaEvaluator.c(f, iArr[i2], iArr2[i2]);
        }
        return gradientColor3;
    }
}
