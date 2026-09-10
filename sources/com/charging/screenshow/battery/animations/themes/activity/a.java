package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BatteryHealthAct f13040Y;

    public /* synthetic */ a(BatteryHealthAct batteryHealthAct, int i2) {
        this.X = i2;
        this.f13040Y = batteryHealthAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        BatteryHealthAct batteryHealthAct = this.f13040Y;
        switch (this.X) {
            case 0:
                int i2 = BatteryHealthAct.i0;
                batteryHealthAct.n().f13353e = true;
                break;
            case 1:
                int i3 = BatteryHealthAct.i0;
                batteryHealthAct.p(new a(batteryHealthAct, 2));
                break;
            default:
                int i4 = BatteryHealthAct.i0;
                batteryHealthAct.finish();
                break;
        }
        return unit;
    }
}
