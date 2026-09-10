package com.smartdigimkt.a6;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    private static final String g = "TouchEventClickTrigger";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f33704h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f33705i = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33708c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.y5.a f33709e;
    private boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33706a = -1;
    private boolean d = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View X;

        /* JADX INFO: renamed from: com.smartdigimkt.a6.e$a$a, reason: collision with other inner class name */
        public class ViewOnTouchListenerC0438a implements View.OnTouchListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int[] f33711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean[] f33712b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f33713c;
            final /* synthetic */ int d;

            public ViewOnTouchListenerC0438a(int[] iArr, boolean[] zArr, int i2, int i3) {
                this.f33711a = iArr;
                this.f33712b = zArr;
                this.f33713c = i2;
                this.d = i3;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int[] iArr = this.f33711a;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f33712b[0] = false;
                } else if (action != 1) {
                    if (action == 2 && rawX > i2 && rawX < i2 + this.f33713c && rawY > i3 && rawY < i3 + this.d) {
                        this.f33712b[0] = true;
                    }
                } else if (this.f33712b[0]) {
                    e.this.a(12);
                }
                return false;
            }
        }

        public a(View view) {
            this.X = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                this.X.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view = this.X;
                while (view.getParent() != null) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    } else {
                        view = (View) parent;
                    }
                }
                View view2 = this.X;
                if (view == view2) {
                    return;
                }
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                view.setOnTouchListener(new ViewOnTouchListenerC0438a(iArr, new boolean[]{false}, this.X.getWidth(), this.X.getHeight()));
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public boolean b(View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f33707b = (int) motionEvent.getY();
            this.f33708c = (int) motionEvent.getX();
            this.f33706a = motionEvent.getPointerId(0);
            this.d = false;
        } else if (action == 1) {
            if (this.d) {
                a(13);
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f33706a);
            this.f33708c = (int) motionEvent.getX(iFindPointerIndex2);
            this.f33707b = (int) motionEvent.getY(iFindPointerIndex2);
            this.d = false;
            this.f33706a = -1;
        } else if (action == 2 && (iFindPointerIndex = motionEvent.findPointerIndex(this.f33706a)) != -1) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iAbs = Math.abs(x - this.f33708c);
            if (Math.abs(y - this.f33707b) > 10 || iAbs > 10) {
                this.d = true;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return true;
    }

    public e a(boolean z2) {
        this.f = z2;
        return this;
    }

    public e a(com.smartdigimkt.y5.a aVar) {
        this.f33709e = aVar;
        return this;
    }

    public void a(View view) {
        if (this.f) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        com.smartdigimkt.y5.a aVar = this.f33709e;
        if (aVar != null) {
            aVar.a(i2, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public boolean a(View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f33707b = (int) motionEvent.getY();
            this.f33708c = (int) motionEvent.getX();
            this.f33706a = motionEvent.getPointerId(0);
            this.d = false;
        } else if (action == 1) {
            if (this.d) {
                a(13);
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f33706a);
            this.f33708c = (int) motionEvent.getX(iFindPointerIndex2);
            this.f33707b = (int) motionEvent.getY(iFindPointerIndex2);
            this.d = false;
            this.f33706a = -1;
        } else if (action == 2) {
            int i2 = this.f33706a;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int x = (int) motionEvent.getX(iFindPointerIndex);
                int iAbs = Math.abs(y - this.f33707b);
                int iAbs2 = Math.abs(x - this.f33708c);
                if (iAbs > 10 || iAbs2 > 10) {
                    this.d = true;
                }
            }
        } else if (action == 3) {
            if (this.d) {
                a(13);
            }
            int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f33706a);
            this.f33708c = (int) motionEvent.getX(iFindPointerIndex3);
            this.f33707b = (int) motionEvent.getY(iFindPointerIndex3);
            this.d = false;
            this.f33706a = -1;
        }
        return this.d;
    }
}
