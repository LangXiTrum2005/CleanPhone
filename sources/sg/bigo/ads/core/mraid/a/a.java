package sg.bigo.ads.core.mraid.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f48608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f48610c;
    private EnumC0873a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48611e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f48613i;
    private final Rect j;
    private final Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f48614l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f48615n;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a.a$a, reason: collision with other inner class name */
    public enum EnumC0873a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f48621h;

        EnumC0873a(int i2) {
            this.f48621h = i2;
        }
    }

    public interface b {
        void a();
    }

    public final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }

        public /* synthetic */ c(a aVar, byte b2) {
            this();
        }
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    private static void a(EnumC0873a enumC0873a, int i2, Rect rect, Rect rect2) {
        Gravity.apply(enumC0873a.f48621h, i2, i2, rect, rect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z2) {
        if (z2 == a()) {
            return;
        }
        this.f48608a.setState(z2 ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.j);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f48612h) {
            this.f48612h = false;
            this.f48613i.set(0, 0, getWidth(), getHeight());
            a(this.d, this.f48613i, this.j);
            this.f48614l.set(this.j);
            Rect rect = this.f48614l;
            int i2 = this.g;
            rect.inset(i2, i2);
            a(this.d, this.f, this.f48614l, this.k);
            this.f48608a.setBounds(this.k);
        }
        if (this.f48608a.isVisible()) {
            this.f48608a.draw(canvas);
        }
    }

    public final Rect getCloseBounds() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f48612h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b2 = 0;
        if (!a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f48609b) || (!this.m && !this.f48608a.isVisible())) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setClosePressed(true);
        } else if (action != 1) {
            if (action == 3) {
                setClosePressed(false);
            }
        } else if (a()) {
            if (this.f48615n == null) {
                this.f48615n = new c(this, b2);
            }
            postDelayed(this.f48615n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            b bVar = this.f48610c;
            if (bVar != null) {
                bVar.a();
            }
        }
        return true;
    }

    public final void setCloseAlwaysInteractable(boolean z2) {
        this.m = z2;
    }

    public final void setCloseBoundChanged(boolean z2) {
        this.f48612h = z2;
    }

    public final void setCloseBounds(Rect rect) {
        this.j.set(rect);
    }

    public final void setClosePosition(EnumC0873a enumC0873a) {
        this.d = enumC0873a;
        this.f48612h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z2) {
        if (this.f48608a.setVisible(z2, false)) {
            invalidate(this.j);
        }
    }

    public final void setOnCloseListener(b bVar) {
        this.f48610c = bVar;
    }

    private a(Context context, byte b2) {
        super(context, null, 0);
        this.f48613i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.f48614l = new Rect();
        Drawable drawableA = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.f48608a = drawableA;
        this.d = EnumC0873a.TOP_RIGHT;
        drawableA.setState(FrameLayout.EMPTY_STATE_SET);
        drawableA.setCallback(this);
        this.f48609b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f48611e = e.a(context, 50);
        this.f = e.a(context, 30);
        this.g = e.a(context, 8);
        setWillNotDraw(false);
        this.m = true;
    }

    public final void a(EnumC0873a enumC0873a, Rect rect, Rect rect2) {
        a(enumC0873a, this.f48611e, rect, rect2);
    }

    private boolean a() {
        return this.f48608a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    private boolean a(int i2, int i3, int i4) {
        Rect rect = this.j;
        return i2 >= rect.left - i4 && i3 >= rect.top - i4 && i2 < rect.right + i4 && i3 < rect.bottom + i4;
    }
}
