package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.startapp.sdk.internal.g3;
import com.startapp.sdk.internal.l2;

/* JADX INFO: loaded from: classes6.dex */
public class CloseableLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g3 f40441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f40442c;
    private ClosePosition d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40443e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f40445i;
    private final Rect j;
    private final Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f40446l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f40447n;

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f40444h) {
            this.f40444h = false;
            this.f40445i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.d;
            Rect rect = this.f40445i;
            Rect rect2 = this.j;
            int i2 = this.f40443e;
            Gravity.apply(closePosition.a(), i2, i2, rect, rect2);
            this.f40446l.set(this.j);
            Rect rect3 = this.f40446l;
            int i3 = this.g;
            rect3.inset(i3, i3);
            ClosePosition closePosition2 = this.d;
            Rect rect4 = this.f40446l;
            Rect rect5 = this.k;
            int i4 = this.f;
            Gravity.apply(closePosition2.a(), i4, i4, rect4, rect5);
            this.f40442c.setBounds(this.k);
        }
        if (this.f40442c.isVisible()) {
            this.f40442c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.j;
        return x >= rect.left && y >= rect.top && x < rect.right && y < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f40444h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i2 = this.f40440a;
        Rect rect = this.j;
        if (x < rect.left - i2 || y < rect.top - i2 || x >= rect.right + i2 || y >= rect.bottom + i2 || !(this.m || this.f40442c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                a(false);
                return true;
            }
        } else if (this.f40442c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.f40447n == null) {
                this.f40447n = new f(this);
            }
            postDelayed(this.f40447n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            g3 g3Var = this.f40441b;
            if (g3Var != null) {
                g3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z2) {
        this.m = z2;
    }

    public void setCloseBoundChanged(boolean z2) {
        this.f40444h = z2;
    }

    public void setCloseBounds(Rect rect) {
        this.j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.d = closePosition;
        this.f40444h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z2) {
        if (this.f40442c.setVisible(z2, false)) {
            invalidate(this.j);
        }
    }

    public void setOnCloseListener(g3 g3Var) {
        this.f40441b = g3Var;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i2 = this.f40443e;
        Gravity.apply(closePosition.a(), i2, i2, rect, rect2);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40445i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.f40446l = new Rect();
        BitmapDrawable bitmapDrawableA = l2.a(context.getResources());
        this.f40442c = bitmapDrawableA;
        this.d = ClosePosition.TOP_RIGHT;
        bitmapDrawableA.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawableA.setCallback(this);
        this.f40440a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f40443e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        int[] state = this.f40442c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z2 == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f40442c;
        if (!z2) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.j);
    }

    public final boolean a() {
        return this.f40442c.isVisible();
    }

    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i2) {
            this.mGravity = i2;
        }

        public static ClosePosition a(String str) {
            ClosePosition closePosition = TOP_RIGHT;
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(d9.e.f24671c)) {
                    return TOP_LEFT;
                }
                if (!str.equals(d9.e.f24670b)) {
                    if (str.equals(TtmlNode.CENTER)) {
                        return CENTER;
                    }
                    if (str.equals(d9.e.f24672e)) {
                        return BOTTOM_LEFT;
                    }
                    if (str.equals(d9.e.d)) {
                        return BOTTOM_RIGHT;
                    }
                    if (str.equals("top-center")) {
                        return TOP_CENTER;
                    }
                    if (str.equals("bottom-center")) {
                        return BOTTOM_CENTER;
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            return closePosition;
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
