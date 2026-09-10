package com.charging.screenshow.battery.animations.themes.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Charging3DPreviewAct f13043Y;

    public /* synthetic */ d(Charging3DPreviewAct charging3DPreviewAct, int i2) {
        this.X = i2;
        this.f13043Y = charging3DPreviewAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit = Unit.f43263a;
        Charging3DPreviewAct charging3DPreviewAct = this.f13043Y;
        switch (this.X) {
            case 0:
                int i2 = Charging3DPreviewAct.l0;
                charging3DPreviewAct.p(new d(charging3DPreviewAct, 2));
                break;
            case 1:
                int i3 = Charging3DPreviewAct.l0;
                charging3DPreviewAct.n().f13353e = true;
                break;
            default:
                int i4 = Charging3DPreviewAct.l0;
                charging3DPreviewAct.finish();
                break;
        }
        return unit;
    }
}
