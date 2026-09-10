package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC3183cd0 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC3081bT {
    public final C5169z80 c;
    public final GestureDetector e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f4232a = new PointF();
    public final PointF b = new PointF();
    public final float d = 25.0f;
    public volatile float f = 3.1415927f;

    public ViewOnTouchListenerC3183cd0(Context context, C5169z80 c5169z80) {
        this.c = c5169z80;
        this.e = new GestureDetector(context, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3081bT
    public final void a(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f4232a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f4232a.x) / this.d;
        float y = motionEvent2.getY();
        PointF pointF = this.f4232a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float fD = AbstractC5044xl.d(fCos, f3, fSin * x, pointF2.y);
        pointF2.y = fD;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, fD));
        C5169z80 c5169z80 = this.c;
        PointF pointF3 = this.b;
        synchronized (c5169z80) {
            float f4 = pointF3.y;
            c5169z80.g = f4;
            Matrix.setRotateM(c5169z80.e, 0, -f4, (float) Math.cos(c5169z80.h), (float) Math.sin(c5169z80.h), 0.0f);
            Matrix.setRotateM(c5169z80.f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
