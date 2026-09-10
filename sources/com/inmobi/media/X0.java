package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class X0 implements I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f23335a;

    public X0(String filePath) throws IOException {
        Intrinsics.f(filePath, "filePath");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(filePath)));
        Intrinsics.d(drawableDecodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.f23335a = com.bumptech.glide.load.resource.bitmap.a.k(drawableDecodeDrawable);
    }

    @Override // com.inmobi.media.I4
    public final void a(K4 k4) {
    }

    @Override // com.inmobi.media.I4
    public final boolean b() {
        return this.f23335a.isRunning();
    }

    @Override // com.inmobi.media.I4
    public final int c() {
        return this.f23335a.getIntrinsicWidth();
    }

    @Override // com.inmobi.media.I4
    public final void d() {
    }

    public final void e() {
        this.f23335a.start();
    }

    @Override // com.inmobi.media.I4
    public final void start() {
        this.f23335a.registerAnimationCallback(new W0(this));
        this.f23335a.start();
    }

    @Override // com.inmobi.media.I4
    public final void a(boolean z2) {
    }

    @Override // com.inmobi.media.I4
    public final int a() {
        return this.f23335a.getIntrinsicHeight();
    }

    @Override // com.inmobi.media.I4
    public final void a(Canvas canvas, float f, float f2) {
        Intrinsics.c(canvas);
        canvas.translate(f, f2);
        this.f23335a.draw(canvas);
    }
}
