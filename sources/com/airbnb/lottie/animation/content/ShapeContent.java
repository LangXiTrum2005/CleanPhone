package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ShapeContent implements PathContent, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f9636c;
    public final ShapeKeyframeAnimation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9637e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9634a = new Path();
    public final CompoundTrimPathContent f = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        shapePath.getClass();
        this.f9635b = shapePath.d;
        this.f9636c = lottieDrawable;
        ShapeKeyframeAnimation shapeKeyframeAnimationG = shapePath.f9805c.g();
        this.d = shapeKeyframeAnimationG;
        baseLayer.g(shapeKeyframeAnimationG);
        shapeKeyframeAnimationG.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9637e = false;
        this.f9636c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i2 >= arrayList2.size()) {
                this.d.k = arrayList;
                return;
            }
            Content content = (Content) arrayList2.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f9641c == ShapeTrimPath.Type.X) {
                    this.f.f9571a.add(trimPathContent);
                    trimPathContent.d(this);
                } else if (!(content instanceof ShapeModifierContent)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((ShapeModifierContent) content);
                }
            } else if (!(content instanceof ShapeModifierContent)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ShapeModifierContent) content);
            }
            i2++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        boolean z2 = this.f9637e;
        Path path = this.f9634a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.f9635b) {
            this.f9637e = true;
            return path;
        }
        Path path2 = (Path) this.d.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.f9637e = true;
        return path;
    }
}
