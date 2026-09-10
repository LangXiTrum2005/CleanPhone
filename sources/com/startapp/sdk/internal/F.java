package com.startapp.sdk.internal;

import android.app.WallpaperManager;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.view.dialog.SetAsDialog;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.io.File;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class F implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f40773Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Serializable e0;

    public /* synthetic */ F(Object obj, Object obj2, Serializable serializable, int i2) {
        this.X = i2;
        this.f40773Y = obj;
        this.Z = obj2;
        this.e0 = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.Z;
        Object obj3 = this.f40773Y;
        Serializable serializable = this.e0;
        switch (this.X) {
            case 0:
                return q7.b((Function1) obj3, (q7) obj2, (AdUnitConfig) serializable, ((Boolean) obj).booleanValue());
            case 1:
                return q7.a((Function1) obj3, (q7) obj2, (AdUnitConfig) serializable, ((Boolean) obj).booleanValue());
            default:
                SetAsDialog SetAsDialog = (SetAsDialog) obj;
                int i2 = ImagePreviewAct.p0;
                Intrinsics.f(SetAsDialog, "$this$SetAsDialog");
                File file = (File) serializable;
                ImagePreviewAct imagePreviewAct = (ImagePreviewAct) obj3;
                WallpaperManager wallpaperManager = (WallpaperManager) obj2;
                SetAsDialog.e0 = new com.charging.screenshow.battery.animations.themes.activity.r(0, wallpaperManager, imagePreviewAct, file);
                SetAsDialog.f0 = new com.charging.screenshow.battery.animations.themes.activity.r(1, wallpaperManager, imagePreviewAct, file);
                SetAsDialog.g0 = new com.charging.screenshow.battery.animations.themes.activity.r(2, wallpaperManager, imagePreviewAct, file);
                return Unit.f43263a;
        }
    }
}
