package com.smartdigimkt.s5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Paint f38195a = new Paint();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(-13750739);
        if (canvas.getHeight() <= 0 || canvas.getWidth() <= 0) {
            return;
        }
        float fMax = Math.max(canvas.getHeight(), canvas.getWidth()) / 2;
        this.f38195a.setShader(new RadialGradient(canvas.getWidth() / 2, canvas.getHeight() / 2, fMax, -1, 0, Shader.TileMode.CLAMP));
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, fMax, this.f38195a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
