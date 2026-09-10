package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.applovin.shadow.okio.Segment;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTimeBar extends View implements TimeBar {
    public static final /* synthetic */ int T0 = 0;
    public final a A0;
    public final CopyOnWriteArraySet B0;
    public final Point C0;
    public final float D0;
    public int E0;
    public long F0;
    public int G0;
    public Rect H0;
    public final ValueAnimator I0;
    public float J0;
    public boolean K0;
    public boolean L0;
    public long M0;
    public long N0;
    public long O0;
    public long P0;
    public int Q0;
    public long[] R0;
    public boolean[] S0;
    public final Rect e0;
    public final Rect f0;
    public final Rect g0;
    public final Rect h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final Paint m0;
    public final Paint n0;
    public final Drawable o0;
    public final int p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final StringBuilder y0;
    public final Formatter z0;

    public DefaultTimeBar(Context context) {
        super(context, null, 0);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new Rect();
        this.h0 = new Rect();
        Paint paint = new Paint();
        this.i0 = paint;
        Paint paint2 = new Paint();
        this.j0 = paint2;
        Paint paint3 = new Paint();
        this.k0 = paint3;
        Paint paint4 = new Paint();
        this.l0 = paint4;
        Paint paint5 = new Paint();
        this.m0 = paint5;
        Paint paint6 = new Paint();
        this.n0 = paint6;
        paint6.setAntiAlias(true);
        this.B0 = new CopyOnWriteArraySet();
        this.C0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.D0 = f;
        this.x0 = c(f, -50);
        int iC = c(f, 4);
        int iC2 = c(f, 26);
        int iC3 = c(f, 4);
        int iC4 = c(f, 12);
        int iC5 = c(f, 0);
        int iC6 = c(f, 16);
        this.p0 = iC;
        this.q0 = iC2;
        this.r0 = 0;
        this.s0 = iC3;
        this.t0 = iC4;
        this.u0 = iC5;
        this.v0 = iC6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.o0 = null;
        StringBuilder sb = new StringBuilder();
        this.y0 = sb;
        this.z0 = new Formatter(sb, Locale.getDefault());
        this.A0 = new a(this, 0);
        this.w0 = (Math.max(iC5, Math.max(iC4, iC6)) + 1) / 2;
        this.J0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.I0 = valueAnimator;
        valueAnimator.addUpdateListener(new f(this, 4));
        this.N0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.E0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i2) {
        return (int) ((i2 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.F0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.N0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.E0);
    }

    private String getProgressText() {
        return Util.y(this.y0, this.z0, this.O0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f0;
        if (rect.width() <= 0 || this.N0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.h0.width()) * this.N0) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.TimeBar
    public final void a(TimeBar.OnScrubListener onScrubListener) {
        this.B0.add(onScrubListener);
    }

    @Override // androidx.media3.ui.TimeBar
    public final void b(long[] jArr, boolean[] zArr, int i2) {
        Assertions.b(i2 == 0 || !(jArr == null || zArr == null));
        this.Q0 = i2;
        this.R0 = jArr;
        this.S0 = zArr;
        g();
    }

    public final boolean d(long j) {
        long j2 = this.N0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.L0 ? this.M0 : this.O0;
        long jK = Util.k(j3 + j, 0L, j2);
        if (jK == j3) {
            return false;
        }
        if (this.L0) {
            h(jK);
        } else {
            e(jK);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.M0 = j;
        this.L0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).m(j);
        }
    }

    public final void f(boolean z2) {
        removeCallbacks(this.A0);
        this.L0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).s(this.M0, z2);
        }
    }

    public final void g() {
        Rect rect = this.g0;
        Rect rect2 = this.f0;
        rect.set(rect2);
        Rect rect3 = this.h0;
        rect3.set(rect2);
        long j = this.L0 ? this.M0 : this.O0;
        if (this.N0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.P0) / this.N0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.N0)), rect2.right);
        } else {
            int i2 = rect2.left;
            rect.right = i2;
            rect3.right = i2;
        }
        invalidate(this.e0);
    }

    @Override // androidx.media3.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f0.width() / this.D0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.N0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    public final void h(long j) {
        if (this.M0 == j) {
            return;
        }
        this.M0 = j;
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).r(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.o0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i2;
        canvas.save();
        Rect rect = this.f0;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i3 = iCenterY + iHeight;
        long j = this.N0;
        Paint paint = this.k0;
        Rect rect2 = this.h0;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i3, paint);
        } else {
            Rect rect3 = this.g0;
            int i4 = rect3.left;
            int i5 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i5), rect2.right);
            int i6 = rect.right;
            if (iMax < i6) {
                canvas.drawRect(iMax, iCenterY, i6, i3, paint);
            }
            int iMax2 = Math.max(i4, rect2.right);
            if (i5 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i5, i3, this.j0);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i3, this.i0);
            }
            if (this.Q0 != 0) {
                long[] jArr = this.R0;
                jArr.getClass();
                boolean[] zArr = this.S0;
                zArr.getClass();
                int i7 = this.s0;
                int i8 = i7 / 2;
                int i9 = 0;
                int i10 = 0;
                while (i10 < this.Q0) {
                    int iMin = Math.min(rect.width() - i7, Math.max(i9, ((int) ((((long) rect.width()) * Util.k(jArr[i10], 0L, this.N0)) / this.N0)) - i8)) + rect.left;
                    int i11 = i10;
                    canvas.drawRect(iMin, iCenterY, iMin + i7, i3, zArr[i10] ? this.m0 : this.l0);
                    i10 = i11 + 1;
                    i9 = i9;
                }
            }
            canvas2 = canvas;
        }
        if (this.N0 > 0) {
            int iJ = Util.j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.o0;
            if (drawable == null) {
                if (this.L0 || isFocused()) {
                    i2 = this.v0;
                } else {
                    i2 = isEnabled() ? this.t0 : this.u0;
                }
                canvas2.drawCircle(iJ, iCenterY2, (int) ((i2 * this.J0) / 2.0f), this.n0);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.J0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.J0)) / 2;
                drawable.setBounds(iJ - intrinsicWidth, iCenterY2 - intrinsicHeight, iJ + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!this.L0 || z2) {
            return;
        }
        f(false);
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
        if (this.N0 <= 0) {
            return;
        }
        if (Util.f5683a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i2 != 66) {
                switch (i2) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (d(positionIncrement)) {
                            a aVar = this.A0;
                            removeCallbacks(aVar);
                            postDelayed(aVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                            a aVar2 = this.A0;
                            removeCallbacks(aVar2);
                            postDelayed(aVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.L0) {
                            f(false);
                            return true;
                        }
                        break;
                }
            } else if (this.L0) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int i8 = this.K0 ? 0 : this.w0;
        int i9 = this.r0;
        int i10 = this.p0;
        int i11 = this.q0;
        if (i9 == 1) {
            paddingBottom = (i7 - getPaddingBottom()) - i11;
            paddingBottom2 = ((i7 - getPaddingBottom()) - i10) - Math.max(i8 - (i10 / 2), 0);
        } else {
            paddingBottom = (i7 - i11) / 2;
            paddingBottom2 = (i7 - i10) / 2;
        }
        Rect rect2 = this.e0;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i11 + paddingBottom);
        this.f0.set(rect2.left + i8, paddingBottom2, rect2.right - i8, i10 + paddingBottom2);
        if (Util.f5683a >= 29 && ((rect = this.H0) == null || rect.width() != i6 || this.H0.height() != i7)) {
            Rect rect3 = new Rect(0, 0, i6, i7);
            this.H0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int i4 = this.q0;
        if (mode == 0) {
            size = i4;
        } else if (mode != 1073741824) {
            size = Math.min(i4, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        Drawable drawable = this.o0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.o0;
        if (drawable == null || Util.f5683a < 23 || !drawable.setLayoutDirection(i2)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.N0 > 0) {
            Point point = this.C0;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i2 = point.x;
            int i3 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.h0;
            Rect rect2 = this.f0;
            if (action == 0) {
                int i4 = i2;
                if (this.e0.contains(i4, i3)) {
                    rect.right = Util.j(i4, rect2.left, rect2.right);
                    e(getScrubberPosition());
                    g();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.L0) {
                    f(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.L0) {
                        f(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.L0) {
                if (i3 < this.x0) {
                    int i5 = this.G0;
                    rect.right = Util.j(((i2 - i5) / 3) + i5, rect2.left, rect2.right);
                } else {
                    this.G0 = i2;
                    rect.right = Util.j(i2, rect2.left, rect2.right);
                }
                h(getScrubberPosition());
                g();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.N0 <= 0) {
            return false;
        }
        if (i2 == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i2 != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i2) {
        this.l0.setColor(i2);
        invalidate(this.e0);
    }

    public void setBufferedColor(int i2) {
        this.j0.setColor(i2);
        invalidate(this.e0);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setBufferedPosition(long j) {
        if (this.P0 == j) {
            return;
        }
        this.P0 = j;
        g();
    }

    @Override // androidx.media3.ui.TimeBar
    public void setDuration(long j) {
        if (this.N0 == j) {
            return;
        }
        this.N0 = j;
        if (this.L0 && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.TimeBar
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!this.L0 || z2) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i2) {
        Assertions.b(i2 > 0);
        this.E0 = i2;
        this.F0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Assertions.b(j > 0);
        this.E0 = -1;
        this.F0 = j;
    }

    public void setPlayedAdMarkerColor(int i2) {
        this.m0.setColor(i2);
        invalidate(this.e0);
    }

    public void setPlayedColor(int i2) {
        this.i0.setColor(i2);
        invalidate(this.e0);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setPosition(long j) {
        if (this.O0 == j) {
            return;
        }
        this.O0 = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i2) {
        this.n0.setColor(i2);
        invalidate(this.e0);
    }

    public void setUnplayedColor(int i2) {
        this.k0.setColor(i2);
        invalidate(this.e0);
    }
}
