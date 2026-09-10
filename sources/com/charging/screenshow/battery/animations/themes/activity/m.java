package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingVideoAct f13052Y;

    public /* synthetic */ m(ChargingVideoAct chargingVideoAct, int i2) {
        this.X = i2;
        this.f13052Y = chargingVideoAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i2 = 1;
        Unit unit = Unit.f43263a;
        ChargingVideoAct chargingVideoAct = this.f13052Y;
        switch (this.X) {
            case 0:
                int i3 = ChargingVideoAct.n0;
                chargingVideoAct.p(new m(chargingVideoAct, i2));
                break;
            case 1:
                int i4 = ChargingVideoAct.n0;
                chargingVideoAct.finish();
                break;
            default:
                int i5 = ChargingVideoAct.n0;
                chargingVideoAct.n().f13353e = true;
                break;
        }
        return unit;
    }
}
