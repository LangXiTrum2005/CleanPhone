package com.startapp.sdk.ads.list3d;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.u6;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class List3DView extends AdapterView<Adapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Adapter f40489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f40490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f40491c;
    protected int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f40492e;
    protected int f;
    protected int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f40493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f40494i;
    protected int j;
    private VelocityTracker k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected u6 f40495l;
    private c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedList f40496n;
    private d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f40497p;
    private Camera q;
    private Matrix r;
    private Paint s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f40498u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40499w;
    private boolean x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f40490b = 0;
        this.f40496n = new LinkedList();
        this.t = Integer.MIN_VALUE;
        this.f40498u = false;
        this.v = false;
        this.f40499w = false;
        this.x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i2, int i3, int i4, int i5, float f, float f2) {
        if (this.q == null) {
            this.q = new Camera();
        }
        this.q.save();
        this.q.translate(0.0f, 0.0f, i5);
        this.q.rotateX(f2);
        float f3 = -i5;
        this.q.translate(0.0f, 0.0f, f3);
        if (this.r == null) {
            this.r = new Matrix();
        }
        this.q.getMatrix(this.r);
        this.q.restore();
        this.r.preTranslate(-i4, f3);
        this.r.postScale(f, f);
        this.r.postTranslate(i3 + i4, i2 + i5);
        if (this.s == null) {
            Paint paint = new Paint();
            this.s = paint;
            paint.setAntiAlias(true);
            this.s.setFilterBitmap(true);
        }
        Paint paint2 = this.s;
        double dCos = Math.cos((((double) f2) * 3.141592653589793d) / 180.0d);
        int i6 = ((int) (dCos * 200.0d)) + 55;
        int iPow = (int) (Math.pow(dCos, 200.0d) * 70.0d);
        if (i6 > 255) {
            i6 = 255;
        }
        if (iPow > 255) {
            iPow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i6, i6, i6), Color.rgb(iPow, iPow, iPow)));
        canvas.drawBitmap(bitmap, this.r, this.s);
    }

    public final void b(int i2) {
        int height;
        int i3 = this.f40492e + i2;
        this.f = i3;
        int height2 = (-(i3 * 270)) / getHeight();
        this.f40493h = height2;
        int i4 = height2 % 90;
        if (i4 < 45) {
            height = (getHeight() * (-(height2 - i4))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i4))) / 270;
        }
        if (this.t == Integer.MIN_VALUE && this.j == this.f40489a.getCount() - 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i5 = this.t;
            if (height < i5) {
                height = i5;
            }
        }
        u6 u6Var = this.f40495l;
        float f = height;
        u6Var.f41535c = f;
        u6Var.d = f;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j);
        }
        int top2 = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f = ((top2 + height) - height2) / height2;
        float fCos = (float) (1.0d - ((1.0d - Math.cos(f)) * 0.15000000596046448d));
        float f2 = (this.f40493h - (f * 20.0f)) % 90.0f;
        if (f2 < 0.0f) {
            f2 += 90.0f;
        }
        if (f2 < 45.0f) {
            a(canvas, drawingCache, top2, left, width, height, fCos, f2 - 90.0f);
            a(canvas, drawingCache, top2, left, width, height, fCos, f2);
            return false;
        }
        float f3 = f2;
        a(canvas, drawingCache, top2, left, width, height, fCos, f3);
        a(canvas, drawingCache, top2, left, width, height, fCos, f3 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f40489a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        if (!this.f40498u || this.f40489a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f40499w) {
                this.f = getHeight() / 3;
            }
            this.j = -1;
            int measuredHeight = this.f;
            while (measuredHeight < getHeight() && this.j < this.f40489a.getCount() - 1) {
                int i7 = this.j + 1;
                this.j = i7;
                View view = this.f40489a.getView(i7, this.f40496n.size() != 0 ? (View) this.f40496n.removeFirst() : null, this);
                a(view, 0);
                measuredHeight += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int iA = (this.f + this.g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.j != this.f40489a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + iA < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.f40496n.addLast(childAt);
                    this.f40494i++;
                    this.g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f40494i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + iA > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i8 = childCount - 1;
                    this.f40496n.addLast(childAt2);
                    this.j--;
                    childAt2 = i8 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i8;
                }
            }
            View childAt3 = getChildAt(getChildCount() - 1);
            int bottom = childAt3.getBottom();
            int measuredHeight2 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight2;
                if (bottom + iA >= getHeight() || this.j >= this.f40489a.getCount() - 1) {
                    break;
                }
                int i9 = this.j + 1;
                this.j = i9;
                View view2 = this.f40489a.getView(i9, this.f40496n.size() != 0 ? (View) this.f40496n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight2 = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int iA2 = a(getChildAt(0));
            while (iA2 + iA > 0 && (i6 = this.f40494i) > 0) {
                int i10 = i6 - 1;
                this.f40494i = i10;
                View view3 = this.f40489a.getView(i10, this.f40496n.size() != 0 ? (View) this.f40496n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight3 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                iA2 -= measuredHeight3;
                this.g -= measuredHeight3;
            }
        }
        int i11 = this.f + this.g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt4 = getChildAt(i12);
            int iSin = (int) (Math.sin(((double) height) * 6.283185307179586d * ((double) i11)) * ((double) width));
            int measuredWidth = childAt4.getMeasuredWidth();
            int measuredHeight4 = childAt4.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + iSin;
            int measuredHeight5 = (int) ((childAt4.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i13 = i11 + measuredHeight5;
            childAt4.layout(width2, i13, measuredWidth + width2, i13 + measuredHeight4);
            i11 += (measuredHeight5 * 2) + measuredHeight4;
        }
        if (this.f40499w && !this.x) {
            this.x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new qb(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float yVelocity = 0.0f;
            if (action == 1) {
                int i2 = this.f40490b;
                if (i2 == 1) {
                    int iA = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (iA != -1) {
                        View childAt = getChildAt(iA);
                        int i3 = this.f40494i + iA;
                        performItemClick(childAt, i3, this.f40489a.getItemId(i3));
                    }
                } else if (i2 == 2) {
                    this.k.addMovement(motionEvent);
                    this.k.computeCurrentVelocity(1000);
                    yVelocity = this.k.getYVelocity();
                }
                a(yVelocity);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.f40490b == 1) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i4 = this.f40491c;
                    if (x < i4 - 10 || x > i4 + 10) {
                        removeCallbacks(this.o);
                        this.f40490b = 2;
                    } else {
                        int i5 = this.d;
                        if (y < i5 - 10 || y > i5 + 10) {
                            removeCallbacks(this.o);
                            this.f40490b = 2;
                        }
                    }
                }
                if (this.f40490b == 2) {
                    this.k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.d);
                }
            }
        } else {
            q0.a(this);
            removeCallbacks(this.m);
            this.f40491c = (int) motionEvent.getX();
            this.d = (int) motionEvent.getY();
            this.f40492e = a(getChildAt(0)) - this.g;
            if (this.o == null) {
                this.o = new d(this);
            }
            postDelayed(this.o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.k = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            this.f40490b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.v) {
            setAlpha(0.0f);
        }
        this.f40489a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(u6 u6Var) {
        u6 u6Var2 = this.f40495l;
        if (u6Var2 != null) {
            float f = u6Var2.f41533a;
            float f2 = u6Var2.f41534b;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u6Var.f41534b = f2;
            u6Var.f41533a = f;
            u6Var.f41536e = jCurrentAnimationTimeMillis;
        }
        this.f40495l = u6Var;
    }

    public void setFade(boolean z2) {
        this.v = z2;
    }

    public void setHint(boolean z2) {
        this.f40499w = z2;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i2) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f40498u = true;
    }

    private void a(float f) {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.k = null;
        removeCallbacks(this.o);
        if (this.m == null) {
            this.m = new c(this);
        }
        u6 u6Var = this.f40495l;
        if (u6Var != null) {
            float f2 = this.f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u6Var.f41534b = f;
            u6Var.f41533a = f2;
            u6Var.f41536e = jCurrentAnimationTimeMillis;
            post(this.m);
        }
        this.f40490b = 0;
    }

    public final int a(int i2, int i3) {
        if (this.f40497p == null) {
            this.f40497p = new Rect();
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).getHitRect(this.f40497p);
            if (this.f40497p.contains(i2, i3)) {
                return i4;
            }
        }
        return -1;
    }

    public final void a(int i2) {
        View childAt = getChildAt(i2);
        int i3 = this.f40494i + i2;
        long itemId = this.f40489a.getItemId(i3);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i3, itemId);
        }
    }

    private void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i3 = i2 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i3, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    public static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
