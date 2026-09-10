package sg.bigo.ads.common.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.smartdigimkt.u2.m;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0834a f47107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f47108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47109c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.ac.a$a, reason: collision with other inner class name */
    public static class C0834a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f47110a = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f47110a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(Context context) {
        this(context, new C0834a());
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.f47109c <= m.D0;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f47107a.f47110a = false;
            this.f47109c = System.currentTimeMillis();
            this.f47108b.f47308a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.f47108b.f47309b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    private a(Context context, C0834a c0834a) {
        super(context, c0834a);
        this.f47109c = -1L;
        this.f47108b = new i();
        this.f47107a = c0834a;
        setIsLongpressEnabled(false);
    }
}
