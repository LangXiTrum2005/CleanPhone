package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Intent;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Charging3DAct f13042Y;

    public /* synthetic */ c(Charging3DAct charging3DAct, int i2) {
        this.X = i2;
        this.f13042Y = charging3DAct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DownloadDialog downloadDialog;
        Charging3D charging3D;
        int i2 = 1;
        Unit unit = Unit.f43263a;
        Charging3DAct charging3DAct = this.f13042Y;
        switch (this.X) {
            case 0:
                int i3 = Charging3DAct.o0;
                if (!charging3DAct.isFinishing() && (downloadDialog = charging3DAct.m0) != null) {
                    downloadDialog.show();
                }
                break;
            case 1:
                int i4 = Charging3DAct.o0;
                charging3DAct.finish();
                break;
            case 2:
                if (charging3DAct.n0 == 1) {
                    charging3DAct.u();
                } else if (!charging3DAct.isFinishing() && (charging3D = charging3DAct.j0) != null) {
                    Intent intent = new Intent(charging3DAct, (Class<?>) Charging3DPreviewAct.class);
                    intent.putExtra("key_bean", charging3D);
                    charging3DAct.startActivity(intent);
                }
                break;
            case 3:
                int i5 = Charging3DAct.o0;
                charging3DAct.n().f13353e = true;
                break;
            default:
                int i6 = Charging3DAct.o0;
                charging3DAct.p(new c(charging3DAct, i2));
                break;
        }
        return unit;
    }
}
