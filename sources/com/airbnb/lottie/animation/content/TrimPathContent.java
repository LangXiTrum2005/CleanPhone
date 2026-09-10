package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9640b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShapeTrimPath.Type f9641c;
    public final FloatKeyframeAnimation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FloatKeyframeAnimation f9642e;
    public final FloatKeyframeAnimation f;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f9639a = shapeTrimPath.f9817e;
        this.f9641c = shapeTrimPath.f9814a;
        BaseKeyframeAnimation baseKeyframeAnimationG = shapeTrimPath.f9815b.g();
        this.d = (FloatKeyframeAnimation) baseKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG2 = shapeTrimPath.f9816c.g();
        this.f9642e = (FloatKeyframeAnimation) baseKeyframeAnimationG2;
        BaseKeyframeAnimation baseKeyframeAnimationG3 = shapeTrimPath.d.g();
        this.f = (FloatKeyframeAnimation) baseKeyframeAnimationG3;
        baseLayer.g(baseKeyframeAnimationG);
        baseLayer.g(baseKeyframeAnimationG2);
        baseLayer.g(baseKeyframeAnimationG3);
        baseKeyframeAnimationG.a(this);
        baseKeyframeAnimationG2.a(this);
        baseKeyframeAnimationG3.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f9640b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i2)).a();
            i2++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
    }

    public final void d(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.f9640b.add(animationListener);
    }
}
