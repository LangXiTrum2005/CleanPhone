package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ PrivacyAct f13064Y;

    public /* synthetic */ y(PrivacyAct privacyAct, int i2) {
        this.X = i2;
        this.f13064Y = privacyAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        PrivacyAct privacyAct = this.f13064Y;
        switch (this.X) {
            case 0:
                int i2 = PrivacyAct.j0;
                privacyAct.p(new y(privacyAct, 1));
                break;
            default:
                int i3 = PrivacyAct.j0;
                privacyAct.finish();
                break;
        }
        return unit;
    }
}
