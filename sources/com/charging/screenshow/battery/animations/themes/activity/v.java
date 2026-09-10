package com.charging.screenshow.battery.animations.themes.activity;

import android.view.View;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ImagePreviewAct f13061Y;

    public /* synthetic */ v(ImagePreviewAct imagePreviewAct, int i2) {
        this.X = i2;
        this.f13061Y = imagePreviewAct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        ImagePreviewAct imagePreviewAct = this.f13061Y;
        switch (this.X) {
            case 0:
                DownloadDialog DownloadDialog = (DownloadDialog) obj;
                int i2 = ImagePreviewAct.p0;
                Intrinsics.f(DownloadDialog, "$this$DownloadDialog");
                DownloadDialog.h0 = new u(imagePreviewAct, 2);
                DownloadDialog.i0 = new androidx.room.e(5);
                break;
            case 1:
                View it = (View) obj;
                int i3 = ImagePreviewAct.p0;
                Intrinsics.f(it, "it");
                imagePreviewAct.onBackPressed();
                break;
            case 2:
                View it2 = (View) obj;
                int i4 = ImagePreviewAct.p0;
                Intrinsics.f(it2, "it");
                imagePreviewAct.o0 = 0;
                if (!imagePreviewAct.u()) {
                    imagePreviewAct.x();
                } else {
                    imagePreviewAct.w();
                }
                break;
            default:
                View it3 = (View) obj;
                int i5 = ImagePreviewAct.p0;
                Intrinsics.f(it3, "it");
                imagePreviewAct.s();
                break;
        }
        return unit;
    }
}
