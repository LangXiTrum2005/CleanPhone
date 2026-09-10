package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, androidx.media3.exoplayer.video.spherical.attabal.InterfaceC0093attabal {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final GestureDetector f12988molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final attabal f12989monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final float f12990polloi;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final PointF f12987kowloon = new PointF();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PointF f12985arytenoidectomy = new PointF();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public volatile float f12986graveside = 3.1415927f;

    /* JADX INFO: compiled from: TouchTracker.java */
    public interface attabal {
        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        void saneness(PointF pointF);
    }

    public saneness(Context context, attabal attabalVar, float f) {
        this.f12989monoploid = attabalVar;
        this.f12990polloi = f;
        this.f12988molybdenite = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.attabal.InterfaceC0093attabal
    public void attabal(float[] fArr, float f) {
        this.f12986graveside = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f12987kowloon.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f12987kowloon.x) / this.f12990polloi;
        float y = motionEvent2.getY();
        PointF pointF = this.f12987kowloon;
        float f3 = (y - pointF.y) / this.f12990polloi;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f12986graveside;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f12985arytenoidectomy;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = pointF2.y + (fSin * x) + (fCos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f12989monoploid.saneness(this.f12985arytenoidectomy);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f12989monoploid.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f12988molybdenite.onTouchEvent(motionEvent);
    }
}
