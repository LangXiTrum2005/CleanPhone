package com.charging.screenshow.battery.animations.themes.activity;

import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingSettingAct f13048Y;

    public /* synthetic */ i(ChargingSettingAct chargingSettingAct, int i2) {
        this.X = i2;
        this.f13048Y = chargingSettingAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ChargingSettingAct chargingSettingAct = this.f13048Y;
        switch (this.X) {
            case 0:
                int i2 = ChargingSettingAct.m0;
                chargingSettingAct.p(new i(chargingSettingAct, 1));
                break;
            default:
                int i3 = ChargingSettingAct.m0;
                if (!MainAct.q0) {
                    ActUtils.b(chargingSettingAct, SplashAct.class);
                }
                chargingSettingAct.finish();
                break;
        }
        return unit;
    }
}
