package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9749a;

    public BaseAnimatableValue(List list) {
        this.f9749a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean f() {
        List list = this.f9749a;
        return list.isEmpty() || (list.size() == 1 && ((Keyframe) list.get(0)).c());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List h() {
        return this.f9749a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f9749a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
