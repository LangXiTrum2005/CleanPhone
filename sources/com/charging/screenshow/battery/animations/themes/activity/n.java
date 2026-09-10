package com.charging.screenshow.battery.animations.themes.activity;

import android.view.View;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingVideoPreviewAct f13053Y;

    public /* synthetic */ n(ChargingVideoPreviewAct chargingVideoPreviewAct, int i2) {
        this.X = i2;
        this.f13053Y = chargingVideoPreviewAct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        ChargingVideoPreviewAct chargingVideoPreviewAct = this.f13053Y;
        switch (this.X) {
            case 0:
                int i2 = ChargingVideoPreviewAct.o0;
                AppExt.b(new f(3, chargingVideoPreviewAct, (Float) obj));
                break;
            case 1:
                int i3 = ChargingVideoPreviewAct.o0;
                AppExt.b(new f(4, (Boolean) obj, chargingVideoPreviewAct));
                break;
            default:
                View it = (View) obj;
                int i4 = ChargingVideoPreviewAct.o0;
                Intrinsics.f(it, "it");
                chargingVideoPreviewAct.onBackPressed();
                break;
        }
        return unit;
    }
}
