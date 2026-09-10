package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ResultAct f13065Y;

    public /* synthetic */ z(ResultAct resultAct, int i2) {
        this.X = i2;
        this.f13065Y = resultAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        ResultAct resultAct = this.f13065Y;
        switch (this.X) {
            case 0:
                int i2 = ResultAct.i0;
                resultAct.n().f13353e = true;
                break;
            case 1:
                int i3 = ResultAct.i0;
                resultAct.p(new z(resultAct, 2));
                break;
            default:
                int i4 = ResultAct.i0;
                resultAct.finish();
                break;
        }
        return unit;
    }
}
