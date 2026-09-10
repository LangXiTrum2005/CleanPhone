package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingVideoPreviewAct f13054Y;

    public /* synthetic */ o(ChargingVideoPreviewAct chargingVideoPreviewAct, int i2) {
        this.X = i2;
        this.f13054Y = chargingVideoPreviewAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ChargingVideoPreviewAct chargingVideoPreviewAct = this.f13054Y;
        switch (this.X) {
            case 0:
                int i2 = ChargingVideoPreviewAct.o0;
                chargingVideoPreviewAct.n().f13353e = true;
                break;
            case 1:
                int i3 = ChargingVideoPreviewAct.o0;
                chargingVideoPreviewAct.p(new o(chargingVideoPreviewAct, 2));
                break;
            default:
                int i4 = ChargingVideoPreviewAct.o0;
                chargingVideoPreviewAct.finish();
                break;
        }
        return unit;
    }
}
