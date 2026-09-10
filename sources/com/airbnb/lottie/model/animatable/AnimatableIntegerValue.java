package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableIntegerValue(List list) {
        super(list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        return new IntegerKeyframeAnimation(this.f9749a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f9749a;
    }
}
