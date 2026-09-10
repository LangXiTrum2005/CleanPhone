package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f34232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f34234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f34236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f34237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f34238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f34239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f34240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34242k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f34243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f34244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f34246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f34247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f34248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f34249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f34251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f34252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f34254x;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f34232a = new a();
        this.f34238g = 25L;
        this.f34239h = new Handler(Looper.getMainLooper());
        this.f34242k = false;
        this.f34244n = 0.95f;
        this.f34245o = false;
        this.f34247q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f34250t) {
            return this.l ? 1.0f : 0.4f;
        }
        if (this.f34254x < 2000) {
            if (this.f34252v == 1) {
                return this.l ? 1.0f : 0.4f;
            }
            if (this.f34251u == 1) {
                return this.l ? 0.4f : 0.2f;
            }
            if (this.l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f34242k) {
            this.f34242k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f34245o ? 0L : jCurrentTimeMillis - this.f34243m;
        this.f34235d = Math.abs(j10 / 1000.0f);
        this.f34243m = jCurrentTimeMillis;
        this.f34254x += j10;
        float velocity = getVelocity();
        this.f34234c = velocity;
        float f10 = (velocity * this.f34235d) + this.f34233b;
        this.f34233b = f10;
        if (!this.f34250t) {
            float f11 = this.f34244n;
            if (f10 > f11) {
                this.f34233b = f11;
            }
        }
        this.f34247q.right = (int) (this.f34233b * this.f34249s);
        this.f34239h.removeCallbacksAndMessages(null);
        this.f34239h.postDelayed(this.f34232a, this.f34238g);
        super.draw(canvas);
        a(canvas, this.f34235d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f34233b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f34240i == null && this.f34246p == null && this.f34248r == null && this.f34236e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f34240i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f34240i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f34246p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f34246p.getIntrinsicHeight());
            }
            this.f34248r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f34236e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f34249s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f34242k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f34240i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f34246p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f34245o = z10;
        if (z10) {
            return;
        }
        this.f34243m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f34251u = 1;
            this.f34252v = 0;
            this.f34253w = 0;
            this.f34254x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f34252v = 1;
            if (this.f34253w == 1) {
                startEndAnimation();
            }
            this.f34254x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f34253w = 1;
            if (this.f34252v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.l = true;
        this.f34243m = System.currentTimeMillis();
        this.f34235d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34254x = 0L;
        this.f34250t = false;
        this.f34237f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34233b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34249s = getMeasuredWidth();
        this.f34245o = false;
        this.f34251u = 0;
        this.f34252v = 0;
        this.f34253w = 0;
        Drawable drawable = this.f34240i;
        if (drawable != null) {
            this.f34241j = -drawable.getIntrinsicWidth();
        } else {
            this.f34241j = 0;
        }
        Drawable drawable2 = this.f34248r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f34236e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f34246p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f34250t) {
            return;
        }
        this.f34250t = true;
        this.f34237f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f34250t) {
            float f11 = this.f34237f;
            float f12 = this.f34249s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f34248r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f34236e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f34246p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f34237f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f34248r != null && this.f34246p != null) {
            int iWidth = (int) (this.f34247q.width() - (this.f34246p.getIntrinsicWidth() * 0.05f));
            Drawable drawable6 = this.f34248r;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f34248r.draw(canvas);
        }
        if (this.f34250t && (drawable2 = this.f34236e) != null && this.f34246p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f34236e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f34236e.draw(canvas);
            canvas.restore();
        }
        if (this.f34246p != null) {
            canvas.save();
            canvas.translate(this.f34247q.width() - getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f34246p.draw(canvas);
            canvas.restore();
        }
        if (!this.f34250t && Math.abs(this.f34233b - this.f34244n) < 1.0E-5f && (drawable = this.f34240i) != null) {
            int i11 = (int) ((f10 * 0.2f * this.f34249s) + this.f34241j);
            this.f34241j = i11;
            if (drawable.getIntrinsicWidth() + i11 >= this.f34247q.width()) {
                this.f34241j = -this.f34240i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f34241j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f34240i.draw(canvas);
            canvas.restore();
        }
        if (this.f34250t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34232a = new a();
        this.f34238g = 25L;
        this.f34239h = new Handler(Looper.getMainLooper());
        this.f34242k = false;
        this.f34244n = 0.95f;
        this.f34245o = false;
        this.f34247q = new Rect();
        a(context);
    }

    public void setProgressBarListener(c cVar) {
    }
}
