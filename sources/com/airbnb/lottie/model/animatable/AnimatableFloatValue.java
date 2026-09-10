package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableFloatValue extends BaseAnimatableValue<Float, Float> {
    public AnimatableFloatValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        return new FloatKeyframeAnimation(this.f9749a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f9749a;
    }
}
