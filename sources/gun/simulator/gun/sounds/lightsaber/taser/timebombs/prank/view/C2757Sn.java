package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2757Sn extends View implements InterfaceC4499rc0 {
    public static final /* synthetic */ int N = 0;
    public int A;
    public long B;
    public int C;
    public Rect D;
    public float E;
    public boolean F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public long[] L;
    public boolean[] M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3736a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final RunnableC2928Zc w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    public C2757Sn(Context context, AttributeSet attributeSet) {
        ?? r2;
        Paint paint;
        super(context, null, 0);
        this.f3736a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint2 = new Paint();
        this.e = paint2;
        Paint paint3 = new Paint();
        this.f = paint3;
        Paint paint4 = new Paint();
        this.g = paint4;
        Paint paint5 = new Paint();
        this.h = paint5;
        Paint paint6 = new Paint();
        this.i = paint6;
        Paint paint7 = new Paint();
        this.j = paint7;
        paint7.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, UW.b, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.k = drawable;
                if (drawable != null) {
                    int i = Ug0.f3833a;
                    if (i >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                } else {
                    paint = paint5;
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i5 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i2);
                paint7.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint.setColor(i6);
                paint6.setColor(i7);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.l = iA;
            this.m = iA2;
            this.n = 0;
            this.o = iA3;
            this.p = iA4;
            this.q = iA5;
            this.r = iA6;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new RunnableC2928Zc(this, 13);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            r2 = 1;
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            r2 = 1;
            this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        }
        this.E = 1.0f;
        new ValueAnimator().addUpdateListener(new VJ(this, r2));
        this.H = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.A = 20;
        setFocusable((boolean) r2);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r2);
        }
    }

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return j;
        }
        long j2 = this.H;
        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.A);
    }

    private String getProgressText() {
        return Ug0.C(this.u, this.v, this.I);
    }

    private long getScrubberPosition() {
        Rect rect = this.b;
        if (rect.width() <= 0 || this.H == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.d.width()) * this.H) / ((long) rect.width());
    }

    public final boolean b(long j) {
        long j2 = this.H;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.F ? this.G : this.I;
        long jK = Ug0.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.F) {
            f(jK);
        } else {
            c(jK);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.G = j;
        this.F = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            RU ru = ((OU) it.next()).f3505a;
            ru.K = true;
            TextView textView = ru.m;
            if (textView != null) {
                textView.setText(Ug0.C(ru.o, ru.p, j));
            }
        }
    }

    public final void d(boolean z) {
        LU lu;
        int iP;
        removeCallbacks(this.w);
        this.F = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (OU ou : this.x) {
            long j = this.G;
            RU ru = ou.f3505a;
            ru.K = false;
            if (!z && (lu = ru.G) != null) {
                C2736Rs c2736Rs = (C2736Rs) lu;
                Gc0 gc0T = c2736Rs.t();
                if (ru.J && !gc0T.q()) {
                    int iP2 = gc0T.p();
                    iP = 0;
                    while (true) {
                        long jW = Ug0.W(gc0T.n(iP, ru.r, 0L).n);
                        if (j < jW) {
                            break;
                        }
                        if (iP == iP2 - 1) {
                            j = jW;
                            break;
                        } else {
                            j -= jW;
                            iP++;
                        }
                    }
                } else {
                    iP = c2736Rs.p();
                }
                c2736Rs.e(iP, j, false);
                ru.j();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.F ? this.G : this.I;
        if (this.H > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.J) / this.H)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.H)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f3736a);
    }

    public final void f(long j) {
        if (this.G == j) {
            return;
        }
        this.G = j;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            RU ru = ((OU) it.next()).f3505a;
            TextView textView = ru.m;
            if (textView != null) {
                textView.setText(Ug0.C(ru.o, ru.p, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.z);
        if (iWidth != 0) {
            long j = this.H;
            if (j != 0 && j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return j / ((long) iWidth);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.H;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.e);
            }
            if (this.K != 0) {
                long[] jArr = this.L;
                jArr.getClass();
                boolean[] zArr = this.M;
                zArr.getClass();
                int i6 = this.o;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.K) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * Ug0.k(jArr[i9], 0L, this.H)) / this.H)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.i : this.h);
                    i9++;
                    i6 = i6;
                    i8 = 0;
                }
            }
        }
        if (this.H > 0) {
            int iJ = Ug0.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                if (this.F || isFocused()) {
                    i = this.r;
                } else {
                    i = isEnabled() ? this.p : this.q;
                }
                canvas.drawCircle(iJ, iCenterY2, (int) ((i * this.E) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.E)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.E)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.F || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.H <= 0) {
            return;
        }
        if (Ug0.f3833a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            RunnableC2928Zc runnableC2928Zc = this.w;
                            removeCallbacks(runnableC2928Zc);
                            postDelayed(runnableC2928Zc, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            RunnableC2928Zc runnableC2928Zc2 = this.w;
                            removeCallbacks(runnableC2928Zc2);
                            postDelayed(runnableC2928Zc2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.F) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.F) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.n;
        int i8 = this.l;
        int i9 = this.m;
        int i10 = this.s;
        if (i7 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i8) - Math.max(i10 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            paddingBottom2 = (i6 - i8) / 2;
        }
        Rect rect2 = this.f3736a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.b.set(rect2.left + i10, paddingBottom2, rect2.right - i10, i8 + paddingBottom2);
        if (Ug0.f3833a >= 29 && ((rect = this.D) == null || rect.width() != i5 || this.D.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || Ug0.f3833a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.H > 0) {
            Point point = this.y;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.d;
            Rect rect2 = this.b;
            if (action == 0) {
                int i3 = i;
                if (this.f3736a.contains(i3, i2)) {
                    rect.right = Ug0.j(i3, rect2.left, rect2.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.F) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.F) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.F) {
                if (i2 < this.t) {
                    int i4 = this.C;
                    rect.right = Ug0.j(((i - i4) / 3) + i4, rect2.left, rect2.right);
                } else {
                    this.C = i;
                    rect.right = Ug0.j(i, rect2.left, rect2.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.H <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.h.setColor(i);
        invalidate(this.f3736a);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f.setColor(i);
        invalidate(this.f3736a);
    }

    public void setBufferedPosition(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        e();
    }

    public void setDuration(long j) {
        if (this.H == j) {
            return;
        }
        this.H = j;
        if (this.F && j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.F || z) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i) {
        FW.h(i > 0);
        this.A = i;
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j) {
        FW.h(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.i.setColor(i);
        invalidate(this.f3736a);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.e.setColor(i);
        invalidate(this.f3736a);
    }

    public void setPosition(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.j.setColor(i);
        invalidate(this.f3736a);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.g.setColor(i);
        invalidate(this.f3736a);
    }
}
