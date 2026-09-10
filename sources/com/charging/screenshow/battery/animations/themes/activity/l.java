package com.charging.screenshow.battery.animations.themes.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingBinding;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.utils.PermissionUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingVideoAct f13051Y;

    public /* synthetic */ l(ChargingVideoAct chargingVideoAct, int i2) {
        this.X = i2;
        this.f13051Y = chargingVideoAct;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        ChargingVideoAct chargingVideoAct = this.f13051Y;
        switch (this.X) {
            case 0:
                int i2 = ChargingVideoAct.n0;
                AppExt.b(new f(1, (Boolean) obj, chargingVideoAct));
                return unit;
            case 1:
                View it = (View) obj;
                int i3 = ChargingVideoAct.n0;
                Intrinsics.f(it, "it");
                chargingVideoAct.onBackPressed();
                return unit;
            case 2:
                View it2 = (View) obj;
                int i4 = ChargingVideoAct.n0;
                Intrinsics.f(it2, "it");
                int i5 = ChargingSettingAct.m0;
                ChargingSettingAct.Companion.a(chargingVideoAct);
                return unit;
            case 3:
                View it3 = (View) obj;
                int i6 = ChargingVideoAct.n0;
                Intrinsics.f(it3, "it");
                chargingVideoAct.getClass();
                if (PermissionUtil.a(chargingVideoAct) && PermissionUtil.b(chargingVideoAct)) {
                    BaseMedia baseMediaB = AppPreferences.b();
                    if (baseMediaB != null) {
                        String name = baseMediaB.getName();
                        ChargingVideo chargingVideo = chargingVideoAct.j0;
                        Intrinsics.c(chargingVideo);
                        if (TextUtils.equals(name, chargingVideo.getName())) {
                            AppPreferences.d(null);
                            chargingVideoAct.u();
                        } else {
                            AppPreferences.d(chargingVideoAct.j0);
                            chargingVideoAct.u();
                            int i7 = ResultAct.i0;
                            ResultAct.Companion.a(chargingVideoAct, 4);
                            chargingVideoAct.finish();
                        }
                    } else {
                        AppPreferences.d(chargingVideoAct.j0);
                        chargingVideoAct.u();
                        int i8 = ResultAct.i0;
                        ResultAct.Companion.a(chargingVideoAct, 4);
                        chargingVideoAct.finish();
                    }
                } else {
                    ActChargingBinding actChargingBinding = chargingVideoAct.h0;
                    if (actChargingBinding == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(actChargingBinding.k);
                    ReturnAppManager.e0 = true;
                }
                return unit;
            case 4:
                View it4 = (View) obj;
                int i9 = ChargingVideoAct.n0;
                Intrinsics.f(it4, "it");
                if (!chargingVideoAct.isFinishing()) {
                    ChargingVideo chargingVideo2 = chargingVideoAct.j0;
                    Intrinsics.c(chargingVideo2);
                    Intent intent = new Intent(chargingVideoAct, (Class<?>) ChargingVideoPreviewAct.class);
                    intent.putExtra("key_bean", chargingVideo2);
                    chargingVideoAct.startActivity(intent);
                }
                return unit;
            case 5:
                View it5 = (View) obj;
                int i10 = ChargingVideoAct.n0;
                Intrinsics.f(it5, "it");
                ReturnAppManager.e0 = true;
                PermissionUtil.c(chargingVideoAct);
                chargingVideoAct.v();
                return unit;
            case 6:
                View it6 = (View) obj;
                int i11 = ChargingVideoAct.n0;
                Intrinsics.f(it6, "it");
                PermissionUtil.d(chargingVideoAct);
                chargingVideoAct.v();
                return unit;
            case 7:
                View it7 = (View) obj;
                int i12 = ChargingVideoAct.n0;
                Intrinsics.f(it7, "it");
                chargingVideoAct.s();
                return unit;
            default:
                int i13 = ChargingVideoAct.n0;
                AppExt.b(new f(2, chargingVideoAct, (Float) obj));
                return unit;
        }
    }
}
