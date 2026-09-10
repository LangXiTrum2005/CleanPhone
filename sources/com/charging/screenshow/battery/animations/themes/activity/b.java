package com.charging.screenshow.battery.animations.themes.activity;

import android.view.View;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.utils.PermissionUtil;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Charging3DAct f13041Y;

    public /* synthetic */ b(Charging3DAct charging3DAct, int i2) {
        this.X = i2;
        this.f13041Y = charging3DAct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        Charging3DAct charging3DAct = this.f13041Y;
        switch (this.X) {
            case 0:
                DownloadDialog DownloadDialog = (DownloadDialog) obj;
                int i2 = Charging3DAct.o0;
                Intrinsics.f(DownloadDialog, "$this$DownloadDialog");
                DownloadDialog.h0 = new c(charging3DAct, 2);
                DownloadDialog.i0 = new androidx.room.e(4);
                break;
            case 1:
                View it = (View) obj;
                int i3 = Charging3DAct.o0;
                Intrinsics.f(it, "it");
                charging3DAct.onBackPressed();
                break;
            case 2:
                View it2 = (View) obj;
                int i4 = Charging3DAct.o0;
                Intrinsics.f(it2, "it");
                int i5 = ChargingSettingAct.m0;
                ChargingSettingAct.Companion.a(charging3DAct);
                break;
            case 3:
                View it3 = (View) obj;
                int i6 = Charging3DAct.o0;
                Intrinsics.f(it3, "it");
                charging3DAct.n0 = 1;
                charging3DAct.s();
                break;
            case 4:
                View it4 = (View) obj;
                int i7 = Charging3DAct.o0;
                Intrinsics.f(it4, "it");
                charging3DAct.n0 = 2;
                charging3DAct.s();
                break;
            case 5:
                View it5 = (View) obj;
                int i8 = Charging3DAct.o0;
                Intrinsics.f(it5, "it");
                ReturnAppManager.e0 = true;
                PermissionUtil.c(charging3DAct);
                charging3DAct.w();
                break;
            case 6:
                View it6 = (View) obj;
                int i9 = Charging3DAct.o0;
                Intrinsics.f(it6, "it");
                PermissionUtil.d(charging3DAct);
                charging3DAct.w();
                break;
            default:
                View it7 = (View) obj;
                int i10 = Charging3DAct.o0;
                Intrinsics.f(it7, "it");
                charging3DAct.t();
                break;
        }
        return unit;
    }
}
