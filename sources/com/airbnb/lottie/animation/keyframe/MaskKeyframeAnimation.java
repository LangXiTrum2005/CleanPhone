package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaskKeyframeAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9661c;

    public MaskKeyframeAnimation(List list) {
        this.f9661c = list;
        this.f9659a = new ArrayList(list.size());
        this.f9660b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9659a.add(((Mask) list.get(i2)).f9771b.g());
            this.f9660b.add(((Mask) list.get(i2)).f9772c.g());
        }
    }
}
