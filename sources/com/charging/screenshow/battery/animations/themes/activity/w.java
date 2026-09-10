package com.charging.screenshow.battery.animations.themes.activity;

import android.view.View;
import com.charging.screenshow.battery.animations.themes.view.dialog.RateDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MainAct f13062Y;

    public /* synthetic */ w(MainAct mainAct, int i2) {
        this.X = i2;
        this.f13062Y = mainAct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2 = 0;
        Unit unit = Unit.f43263a;
        MainAct mainAct = this.f13062Y;
        switch (this.X) {
            case 0:
                RateDialog RateDialog = (RateDialog) obj;
                boolean z2 = MainAct.q0;
                Intrinsics.f(RateDialog, "$this$RateDialog");
                RateDialog.e0 = new x(i2, RateDialog, mainAct);
                break;
            case 1:
                View it = (View) obj;
                boolean z3 = MainAct.q0;
                Intrinsics.f(it, "it");
                mainAct.s(0);
                mainAct.t(0);
                break;
            case 2:
                View it2 = (View) obj;
                boolean z4 = MainAct.q0;
                Intrinsics.f(it2, "it");
                mainAct.s(1);
                mainAct.t(1);
                break;
            default:
                View it3 = (View) obj;
                boolean z5 = MainAct.q0;
                Intrinsics.f(it3, "it");
                mainAct.s(2);
                mainAct.t(2);
                break;
        }
        return unit;
    }
}
