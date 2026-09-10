package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ImageCategoryDetailAct f13056Y;

    public /* synthetic */ q(ImageCategoryDetailAct imageCategoryDetailAct, int i2) {
        this.X = i2;
        this.f13056Y = imageCategoryDetailAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ImageCategoryDetailAct imageCategoryDetailAct = this.f13056Y;
        switch (this.X) {
            case 0:
                int i2 = ImageCategoryDetailAct.k0;
                imageCategoryDetailAct.n().f13353e = true;
                break;
            case 1:
                int i3 = ImageCategoryDetailAct.k0;
                imageCategoryDetailAct.p(new q(imageCategoryDetailAct, 2));
                break;
            default:
                int i4 = ImageCategoryDetailAct.k0;
                imageCategoryDetailAct.finish();
                break;
        }
        return unit;
    }
}
