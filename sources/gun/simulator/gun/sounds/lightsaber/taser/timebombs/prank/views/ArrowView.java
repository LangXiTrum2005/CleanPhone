package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.badlogic.gdx.math.MathUtils;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V5;

/* JADX INFO: loaded from: classes4.dex */
public final class ArrowView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f5355a;
    public final Path b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final float g;
    public final float h;
    public final Ma0 i;
    public final Ma0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2995aW.q(context, f.X);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FF4444"));
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.f5355a = paint;
        this.b = new Path();
        this.g = 12.0f;
        this.h = 24.0f;
        this.i = AbstractC2340Cl.I(new V5(this, 1));
        this.j = AbstractC2340Cl.I(new V5(this, 0));
    }

    private final float getHalfBase() {
        return ((Number) this.j.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getSideLength() {
        return ((Number) this.i.getValue()).floatValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.c;
        float f2 = this.e;
        if (f == f2 && this.d == this.f) {
            return;
        }
        float f3 = f2 - f;
        float f4 = this.f - this.d;
        float fAtan2 = MathUtils.atan2(f4, f3);
        float fHypot = (float) Math.hypot(f3, f4);
        float f5 = this.e;
        float f6 = this.h;
        float f7 = f5 - ((f3 * f6) / fHypot);
        float f8 = this.f - ((f6 * f4) / fHypot);
        Paint paint = this.f5355a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        canvas.drawCircle(this.c, this.d, this.g, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(this.c, this.d, f7, f8, paint);
        float f9 = fAtan2 + 1.5707964f;
        float fCos = MathUtils.cos(f9);
        float fSin = MathUtils.sin(f9);
        float halfBase = (getHalfBase() * fCos) + f7;
        float halfBase2 = (getHalfBase() * fSin) + f8;
        float halfBase3 = f7 - (getHalfBase() * fCos);
        float halfBase4 = f8 - (getHalfBase() * fSin);
        Path path = this.b;
        path.reset();
        path.moveTo(this.e, this.f);
        path.lineTo(halfBase, halfBase2);
        path.lineTo(halfBase3, halfBase4);
        path.close();
        paint.setStyle(style);
        canvas.drawPath(path, paint);
    }
}
