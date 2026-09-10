package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import bubbles.dern;
import bubbles.impassible;
import bubbles.marial;
import com.google.android.material.internal.rotuma;
import pyrope.attabal;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadingIndicatorSpec {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f20543attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f20544beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f20545dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int[] f20546marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f20547saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f20548wireman;

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dern.loadingIndicatorStyle);
    }

    public final void attabal(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(impassible.LoadingIndicator_indicatorColor)) {
            this.f20546marial = new int[]{attabal.saneness(context, beachfront.attabal.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(impassible.LoadingIndicator_indicatorColor).type != 1) {
            this.f20546marial = new int[]{typedArray.getColor(impassible.LoadingIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(impassible.LoadingIndicator_indicatorColor, -1));
        this.f20546marial = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LoadingIndicator.f20540monoploid);
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f20543attabal = false;
        this.f20546marial = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(marial.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(marial.m3_loading_indicator_container_size);
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(context, attributeSet, impassible.LoadingIndicator, i, i2, new int[0]);
        this.f20547saneness = typedArrayTaiyuan.getDimensionPixelSize(impassible.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.f20545dern = typedArrayTaiyuan.getDimensionPixelSize(impassible.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.f20548wireman = typedArrayTaiyuan.getDimensionPixelSize(impassible.LoadingIndicator_containerHeight, dimensionPixelSize2);
        attabal(context, typedArrayTaiyuan);
        this.f20544beachfront = typedArrayTaiyuan.getColor(impassible.LoadingIndicator_containerColor, 0);
        typedArrayTaiyuan.recycle();
    }
}
