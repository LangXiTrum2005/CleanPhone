package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class a9 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageResourceConfig f40795a;

    public a9(ImageResourceConfig imageResourceConfig) {
        this.f40795a = imageResourceConfig;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i2) {
        ImageResourceConfig imageResourceConfig = this.f40795a;
        imageResourceConfig.f40604a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f40606c = bitmap;
        }
    }
}
