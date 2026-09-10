package com.charging.screenshow.battery.animations.themes.utils.ext;

import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function0 f13320Y;

    public /* synthetic */ a(Function0 function0, int i2) {
        this.X = i2;
        this.f13320Y = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.f13320Y.invoke();
                break;
            case 1:
                ThreadUtil.m3276runOnUiThread$lambda0(this.f13320Y);
                break;
            default:
                ThreadUtil.m3277runOnUiThread$lambda1(this.f13320Y);
                break;
        }
    }
}
