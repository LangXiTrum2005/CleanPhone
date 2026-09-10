package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9737a;

    public AnimatablePathValue(ArrayList arrayList) {
        this.f9737a = arrayList;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final boolean f() {
        ArrayList arrayList = this.f9737a;
        return arrayList.size() == 1 && ((Keyframe) arrayList.get(0)).c();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        ArrayList arrayList = this.f9737a;
        return ((Keyframe) arrayList.get(0)).c() ? new PointKeyframeAnimation(arrayList) : new PathKeyframeAnimation(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f9737a;
    }
}
