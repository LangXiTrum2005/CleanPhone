package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingCategoryDetailAct f13047Y;

    public /* synthetic */ h(ChargingCategoryDetailAct chargingCategoryDetailAct, int i2) {
        this.X = i2;
        this.f13047Y = chargingCategoryDetailAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ChargingCategoryDetailAct chargingCategoryDetailAct = this.f13047Y;
        switch (this.X) {
            case 0:
                int i2 = ChargingCategoryDetailAct.k0;
                chargingCategoryDetailAct.n().f13353e = true;
                break;
            case 1:
                int i3 = ChargingCategoryDetailAct.k0;
                chargingCategoryDetailAct.p(new h(chargingCategoryDetailAct, 2));
                break;
            default:
                int i4 = ChargingCategoryDetailAct.k0;
                chargingCategoryDetailAct.finish();
                break;
        }
        return unit;
    }
}
