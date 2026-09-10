package com.bytedance.sdk.openadsdk.core.co.lr.ri;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
class ri extends View {
    private ValueAnimator[] ac;
    private Matrix aw;
    private final RectF ay;
    private String[] bgr;
    private lr[] bnj;
    private boolean[] bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Camera f18116co;
    private float di;
    private final Path dw;
    private Paint dzy;
    private float fe;
    private float feb;
    private int fi;
    private final RectF fr;
    private final Path hcw;
    private int ig;
    private final RectF igq;
    private float[] ihz;
    private int ik;
    private com.bytedance.adsdk.ugeno.jbs.di.ri jbs;
    private int jc;
    private int ka;
    private float kt;
    private int lr;
    private Paint mj;
    private boolean[] nr;
    private final float[] oh;
    private final Path ory;
    private long pv;
    private int qd;
    private Handler qt;
    private int ri;
    private String[] sf;
    private C0247ri[] siy;
    private float[] slm;
    private int srn;
    private final RectF su;
    private float ta;
    private ValueAnimator[] tan;
    private float tnn;
    private float[] uq;
    private float[] vr;
    private final Runnable whw;
    private final AccelerateDecelerateInterpolator wjv;
    private final float[] xd;
    private com.bytedance.sdk.openadsdk.core.co.lr.ri.lr xha;
    private final Path zf;
    private float zyn;

    public ri(Context context) {
        super(context);
        this.qt = new Handler(Looper.getMainLooper());
        this.sf = new String[3];
        this.f18116co = new Camera();
        this.aw = new Matrix();
        this.bgr = new String[3];
        this.vr = new float[3];
        this.slm = new float[3];
        this.bu = new boolean[3];
        this.nr = new boolean[3];
        this.tan = new ValueAnimator[3];
        this.ac = new ValueAnimator[3];
        this.ihz = new float[3];
        this.uq = new float[3];
        this.wjv = new AccelerateDecelerateInterpolator();
        this.ay = new RectF();
        this.fr = new RectF();
        this.su = new RectF();
        this.igq = new RectF();
        this.zf = new Path();
        this.dw = new Path();
        this.ory = new Path();
        this.hcw = new Path();
        this.oh = new float[8];
        this.xd = new float[8];
        this.pv = 0L;
        this.whw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                ri.ri(ri.this);
                ri.this.invalidate();
                if (ri.this.ri > 0) {
                    ri.this.qt.postDelayed(this, 1000L);
                } else {
                    ri.this.qt.removeCallbacks(this);
                    ri.this.lr();
                }
            }
        };
        ka();
        fi();
        ik();
    }

    public static /* synthetic */ int ri(ri riVar) {
        int i = riVar.ri;
        riVar.ri = i - 1;
        return i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ka <= 0 || this.fi <= 0) {
            return;
        }
        this.ay.set((getWidth() - this.ka) / 2.0f, (getHeight() - this.fi) / 2.0f, (getWidth() + this.ka) / 2.0f, (getHeight() + this.fi) / 2.0f);
        RectF rectF = this.ay;
        float f = this.di;
        canvas.drawRoundRect(rectF, f, f, this.mj);
        int i = this.ri;
        this.ig = i / 3600;
        int i2 = i % 3600;
        this.qd = i2;
        this.srn = i2 / 60;
        this.jc = i2 % 60;
        this.kt = this.ka;
        this.feb = this.fi;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.zyn = width;
        float f2 = this.kt * 3.0f;
        this.tnn = f2;
        float f3 = width - f2;
        this.fe = f3;
        this.ta = f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f3 / 2.0f : 10.0f;
        ri(this.ig, this.srn, this.jc);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.ay.centerY();
        float f4 = this.feb;
        ri(canvas, paddingLeft, fCenterY - (f4 / 2.0f), this.kt, f4, String.format("%02d", Integer.valueOf(this.ig)), 0);
        float paddingLeft2 = this.ta + getPaddingLeft() + this.kt;
        float fCenterY2 = this.ay.centerY();
        float f5 = this.feb;
        ri(canvas, paddingLeft2, fCenterY2 - (f5 / 2.0f), this.kt, f5, String.format("%02d", Integer.valueOf(this.srn)), 1);
        float paddingLeft3 = ((this.kt + this.ta) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.ay.centerY();
        float f6 = this.feb;
        ri(canvas, paddingLeft3, fCenterY3 - (f6 / 2.0f), this.kt, f6, String.format("%02d", Integer.valueOf(this.jc)), 2);
        ri(canvas, getPaddingLeft() + this.kt + (this.ta / 2.0f), this.ay.centerY());
        ri(canvas, getPaddingLeft() + (this.kt * 2.0f) + ((this.ta * 3.0f) / 2.0f), this.ay.centerY());
        com.bytedance.sdk.openadsdk.core.co.lr.ri.lr lrVar = this.xha;
        if (lrVar != null) {
            lrVar.ri(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.co.lr.ri.lr lrVar = this.xha;
        if (lrVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrRi = lrVar.ri(i, i2);
        if (this.fi > 0) {
            int mode = View.MeasureSpec.getMode(iArrRi[1]);
            int size = View.MeasureSpec.getSize(iArrRi[1]);
            if (mode == 0 || size > this.fi) {
                iArrRi[1] = View.MeasureSpec.makeMeasureSpec(this.fi, 1073741824);
            }
        }
        super.onMeasure(iArrRi[0], iArrRi[1]);
    }

    private void fi() {
        if (this.jbs == null) {
            com.bytedance.adsdk.ugeno.jbs.di.ri riVar = new com.bytedance.adsdk.ugeno.jbs.di.ri(getContext());
            this.jbs = riVar;
            this.dzy = riVar.getPaint();
        }
    }

    private void ik() {
        this.bnj = new lr[3];
        this.siy = new C0247ri[3];
        for (int i = 0; i < 3; i++) {
            this.bnj[i] = new lr(this, i);
            this.siy[i] = new C0247ri(this, i);
        }
    }

    private void ka() {
        Paint paint = new Paint();
        this.mj = paint;
        paint.setColor(this.lr);
        this.mj.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lr(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.vr[i] = fFloatValue;
        this.ihz[i] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.pv >= 16) {
            invalidate();
            this.pv = jCurrentTimeMillis;
        }
    }

    public void ri(int i, int i2, int i3, int i4, int i5, float f) {
        int iMin = Math.min(i, 360060);
        this.lr = i2;
        this.ik = i3;
        this.ka = i4;
        this.fi = i5;
        this.di = f;
        this.ri = iMin;
        this.qt.post(this.whw);
        Paint paint = this.mj;
        if (paint != null) {
            paint.setColor(this.lr);
        }
        float[] fArr = this.oh;
        float f2 = this.di;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.xd;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f2;
        fArr2[6] = f2;
        fArr2[5] = f2;
        fArr2[4] = f2;
        invalidate();
    }

    public void lr() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.tan[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.tan[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.ac[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.ac[i].cancel();
            }
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.lr.ri.lr lrVar) {
        this.xha = lrVar;
    }

    private void ri(Canvas canvas, float f, float f2, float f3, float f4, String str, int i) {
        this.fr.set(f, f2, f3 + f, f4 + f2);
        float fCenterY = this.fr.centerY();
        float fCenterY2 = this.fr.centerY() - ((this.jbs.getPaint().descent() + this.jbs.getPaint().ascent()) / 2.0f);
        RectF rectF = this.su;
        RectF rectF2 = this.fr;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.zf.reset();
        Path path = this.zf;
        RectF rectF3 = this.su;
        float[] fArr = this.oh;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.mj.setColor(this.lr);
        canvas.drawPath(this.zf, this.mj);
        this.dzy.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.fr.centerX(), fCenterY2, this.dzy);
        RectF rectF4 = this.igq;
        RectF rectF5 = this.fr;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.dw.reset();
        this.dw.addRoundRect(this.igq, this.xd, direction);
        this.mj.setColor(this.ik);
        canvas.drawPath(this.dw, this.mj);
        canvas.drawText(str, this.fr.centerX(), fCenterY2, this.jbs.getPaint());
        boolean z = this.bu[i];
        if (z || this.nr[i]) {
            if (z) {
                canvas.save();
                this.aw.reset();
                this.f18116co.save();
                this.f18116co.rotateX(this.vr[i]);
                this.f18116co.getMatrix(this.aw);
                this.aw.preTranslate(-this.fr.centerX(), -fCenterY);
                this.aw.postTranslate(this.fr.centerX(), fCenterY);
                canvas.concat(this.aw);
                this.ory.reset();
                this.ory.addRoundRect(this.su, this.oh, direction);
                this.mj.setColor(this.lr);
                canvas.drawPath(this.ory, this.mj);
                int alpha = this.dzy.getAlpha();
                this.dzy.setAlpha((int) (this.ihz[i] * 255.0f));
                canvas.drawText(this.sf[i], this.fr.centerX(), fCenterY2, this.dzy);
                this.dzy.setAlpha(alpha);
                this.f18116co.restore();
                canvas.restore();
            }
            if (this.nr[i]) {
                canvas.save();
                this.aw.reset();
                this.f18116co.save();
                this.f18116co.rotateX(this.slm[i]);
                this.f18116co.getMatrix(this.aw);
                this.aw.preTranslate(-this.fr.centerX(), -fCenterY);
                this.aw.postTranslate(this.fr.centerX(), fCenterY);
                canvas.concat(this.aw);
                this.hcw.reset();
                this.hcw.addRoundRect(this.igq, this.xd, direction);
                this.mj.setColor(this.ik);
                canvas.drawPath(this.hcw, this.mj);
                int alpha2 = this.dzy.getAlpha();
                this.dzy.setAlpha((int) (this.uq[i] * 255.0f));
                canvas.drawText(this.bgr[i], this.fr.centerX(), fCenterY2, this.dzy);
                this.dzy.setAlpha(alpha2);
                this.f18116co.restore();
                canvas.restore();
            }
        }
    }

    public static class lr implements Animator.AnimatorListener {
        private final ri lr;
        private final int ri;

        public lr(ri riVar, int i) {
            this.lr = riVar;
            this.ri = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.lr.bu[this.ri] = false;
            this.lr.ac[this.ri].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri.ri$ri, reason: collision with other inner class name */
    public static class C0247ri implements Animator.AnimatorListener {
        private final ri lr;
        private final int ri;

        public C0247ri(ri riVar, int i) {
            this.lr = riVar;
            this.ri = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.lr.nr[this.ri] = false;
            this.lr.sf[this.ri] = this.lr.bgr[this.ri];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private void ri(Canvas canvas, float f, float f2) {
        canvas.drawText(":", f, f2 - ((this.dzy.descent() + this.dzy.ascent()) / 2.0f), this.dzy);
    }

    private void ri(int i, int i2, int i3) {
        String str = this.sf[0];
        String str2 = String.format("%02d", Integer.valueOf(i));
        if (!str2.equals(str) && !this.bu[0] && !this.nr[0] && str != null) {
            ri(0, str, str2);
        }
        String str3 = this.sf[1];
        String str4 = String.format("%02d", Integer.valueOf(i2));
        if (!str4.equals(str3) && !this.bu[1] && !this.nr[1] && str3 != null) {
            ri(1, str3, str4);
        }
        String str5 = this.sf[2];
        String str6 = String.format("%02d", Integer.valueOf(i3));
        if (!str6.equals(str5) && !this.bu[2] && !this.nr[2] && str5 != null) {
            ri(2, str5, str6);
        }
        String[] strArr = this.sf;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void ri(final int i, String str, String str2) {
        this.sf[i] = str;
        this.bgr[i] = str2;
        this.bu[i] = true;
        this.nr[i] = true;
        this.vr[i] = 0.0f;
        this.slm[i] = 90.0f;
        this.ihz[i] = 1.0f;
        this.uq[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.tan;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
            this.tan[i].setDuration(250L);
            this.tan[i].setInterpolator(this.wjv);
            this.tan[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.attabal
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f18114attabal.lr(i, valueAnimator2);
                }
            });
            this.tan[i].addListener(this.bnj[i]);
        } else {
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.ac;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.ac[i].setDuration(250L);
            this.ac[i].setInterpolator(this.wjv);
            this.ac[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ri.saneness
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f18117attabal.ri(i, valueAnimator3);
                }
            });
            this.ac[i].addListener(this.siy[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.tan[i].isRunning()) {
            this.tan[i].cancel();
        }
        if (this.ac[i].isRunning()) {
            this.ac[i].cancel();
        }
        this.tan[i].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ri(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.slm[i] = fFloatValue;
        this.uq[i] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.pv >= 16) {
            invalidate();
            this.pv = jCurrentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.jbs.di.ri ri() {
        return this.jbs;
    }

    public void ri(com.bytedance.adsdk.ugeno.jbs.di.ri riVar) {
        this.jbs = riVar;
    }
}
