package com.charging.screenshow.battery.animations.themes.activity;

import com.charging.screenshow.battery.animations.themes.adapter.ImagePagerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ImagePreviewAct f13060Y;

    public /* synthetic */ u(ImagePreviewAct imagePreviewAct, int i2) {
        this.X = i2;
        this.f13060Y = imagePreviewAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ImagePreviewAct imagePreviewAct = this.f13060Y;
        switch (this.X) {
            case 0:
                int i2 = ImagePreviewAct.p0;
                imagePreviewAct.p(new u(imagePreviewAct, 3));
                break;
            case 1:
                int i3 = ImagePreviewAct.p0;
                imagePreviewAct.n().f13353e = true;
                break;
            case 2:
                ImagePagerAdapter imagePagerAdapter = imagePreviewAct.l0;
                if (imagePagerAdapter != null) {
                    imagePagerAdapter.notifyItemChanged(imagePreviewAct.k0);
                }
                if (imagePreviewAct.o0 != 0) {
                    imagePreviewAct.v();
                } else {
                    imagePreviewAct.w();
                }
                break;
            default:
                int i4 = ImagePreviewAct.p0;
                imagePreviewAct.finish();
                break;
        }
        return unit;
    }
}
