package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
    public AnimatablePointValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        return new PointKeyframeAnimation(this.f9749a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f9749a;
    }
}
