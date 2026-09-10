package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f3612Y;
    public final int Z;
    public final View e0;
    public Runnable f0;
    public Runnable g0;
    public boolean h0;
    public int i0;
    public final int[] j0 = new int[2];

    public class DisallowIntercept implements Runnable {
        public DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ForwardingListener.this.e0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class TriggerLongPress implements Runnable {
        public TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.a();
            View view = forwardingListener.e0;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                forwardingListener.h0 = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.e0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.X = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3612Y = tapTimeout;
        this.Z = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.g0;
        View view = this.e0;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f0;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract ShowableListMenu b();

    public boolean c() {
        ShowableListMenu showableListMenuB = b();
        if (showableListMenuB == null || showableListMenuB.a()) {
            return true;
        }
        showableListMenuB.show();
        return true;
    }

    public boolean d() {
        ShowableListMenu showableListMenuB = b();
        if (showableListMenuB == null || !showableListMenuB.a()) {
            return true;
        }
        showableListMenuB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        DropDownListView dropDownListView;
        boolean z3 = this.h0;
        View view2 = this.e0;
        if (z3) {
            ShowableListMenu showableListMenuB = b();
            if (showableListMenuB != null && showableListMenuB.a() && (dropDownListView = (DropDownListView) showableListMenuB.m()) != null && dropDownListView.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.j0;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                dropDownListView.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = dropDownListView.b(motionEventObtainNoHistory, this.i0);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z4) {
                    z2 = true;
                } else if (d()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else if (d()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.i0 = motionEvent.getPointerId(0);
                    if (this.f0 == null) {
                        this.f0 = new DisallowIntercept();
                    }
                    view2.postDelayed(this.f0, this.f3612Y);
                    if (this.g0 == null) {
                        this.g0 = new TriggerLongPress();
                    }
                    view2.postDelayed(this.g0, this.Z);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i0);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.X;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z2 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.h0 = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h0 = false;
        this.i0 = -1;
        Runnable runnable = this.f0;
        if (runnable != null) {
            this.e0.removeCallbacks(runnable);
        }
    }
}
