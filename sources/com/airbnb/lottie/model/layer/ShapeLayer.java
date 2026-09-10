package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.parser.DropShadowEffect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ShapeLayer extends BaseLayer {
    public final ContentGroup C;
    public final CompositionLayer D;

    public ShapeLayer(LottieDrawable lottieDrawable, Layer layer, CompositionLayer compositionLayer) {
        super(lottieDrawable, layer);
        this.D = compositionLayer;
        ContentGroup contentGroup = new ContentGroup(lottieDrawable, this, new ShapeGroup("__container", layer.f9840a, false));
        this.C = contentGroup;
        List list = Collections.EMPTY_LIST;
        contentGroup.b(list, list);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        super.f(rectF, matrix, z2);
        this.C.f(rectF, this.f9828n, z2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void k(Canvas canvas, Matrix matrix, int i2) {
        this.C.h(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final BlurEffect l() {
        BlurEffect blurEffect = this.f9829p.f9850w;
        return blurEffect != null ? blurEffect : this.D.f9829p.f9850w;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final DropShadowEffect m() {
        DropShadowEffect dropShadowEffect = this.f9829p.x;
        return dropShadowEffect != null ? dropShadowEffect : this.D.f9829p.x;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void q(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        this.C.e(keyPath, i2, arrayList, keyPath2);
    }
}
