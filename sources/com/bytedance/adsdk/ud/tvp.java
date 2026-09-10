package com.bytedance.adsdk.ud;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ud.mzz.oth;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends Drawable implements Animatable, Drawable.Callback {
    private com.bytedance.adsdk.ud.lnr.lnr.ud aaj;
    private View ag;
    private Matrix ax;
    private boolean bch;
    private com.bytedance.adsdk.ud.ud.qdl bjy;
    private final Matrix bqt;
    private Paint ekw;
    private boolean exc;
    private String exu;
    private RectF fco;
    private com.bytedance.adsdk.ud.ud.ud fs;
    private Matrix gy;
    private Rect hkc;
    private Rect hzv;
    private boolean jl;
    private boolean jpc;
    private Map<String, Typeface> jtx;
    private int jyq;
    private RectF kdv;
    private Bitmap koa;
    private boolean ljh;
    aaj lnr;
    private wd mml;
    private boolean mo;
    private RectF mrf;
    private final com.bytedance.adsdk.ud.mo.lnr mzz;
    private boolean oth;
    String qdl;
    private Rect rc;
    private mml rdp;
    private final ValueAnimator.AnimatorUpdateListener rq;
    private final ArrayList<qdl> to;
    private ud tvp;
    lnr ud;
    private exc uw;
    private Canvas vu;
    private boolean wc;
    private boolean wd;
    private boolean xmv;
    private boolean yt;

    public interface qdl {
        void qdl(wd wdVar);
    }

    public enum ud {
        NONE,
        PLAY,
        RESUME
    }

    public tvp() {
        com.bytedance.adsdk.ud.mo.lnr lnrVar = new com.bytedance.adsdk.ud.mo.lnr();
        this.mzz = lnrVar;
        this.mo = true;
        this.wd = false;
        this.jpc = false;
        this.tvp = ud.NONE;
        this.to = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.tvp.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (tvp.this.aaj != null) {
                    tvp.this.aaj.qdl(tvp.this.mzz.mo());
                }
            }
        };
        this.rq = animatorUpdateListener;
        this.jl = false;
        this.exc = true;
        this.jyq = 255;
        this.uw = exc.AUTOMATIC;
        this.xmv = false;
        this.bqt = new Matrix();
        this.wc = false;
        lnrVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean ekw() {
        return this.mo || this.wd;
    }

    private Context fco() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean gy() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private com.bytedance.adsdk.ud.ud.ud hkc() {
        com.bytedance.adsdk.ud.ud.ud udVar = this.fs;
        if (udVar != null && !udVar.qdl(fco())) {
            this.fs = null;
        }
        if (this.fs == null) {
            this.fs = new com.bytedance.adsdk.ud.ud.ud(getCallback(), this.exu, this.rdp, this.mml.jtx());
        }
        return this.fs;
    }

    private com.bytedance.adsdk.ud.ud.qdl hzv() {
        if (getCallback() == null) {
            return null;
        }
        if (this.bjy == null) {
            com.bytedance.adsdk.ud.ud.qdl qdlVar = new com.bytedance.adsdk.ud.ud.qdl(getCallback(), this.ud);
            this.bjy = qdlVar;
            String str = this.qdl;
            if (str != null) {
                qdlVar.qdl(str);
            }
        }
        return this.bjy;
    }

    private void kdv() {
        wd wdVar = this.mml;
        if (wdVar == null) {
            return;
        }
        this.xmv = this.uw.qdl(Build.VERSION.SDK_INT, wdVar.qdl(), wdVar.ud());
    }

    private void mrf() {
        if (this.vu != null) {
            return;
        }
        this.vu = new Canvas();
        this.mrf = new RectF();
        this.gy = new Matrix();
        this.ax = new Matrix();
        this.rc = new Rect();
        this.kdv = new RectF();
        this.ekw = new com.bytedance.adsdk.ud.qdl.qdl();
        this.hkc = new Rect();
        this.hzv = new Rect();
        this.fco = new RectF();
    }

    public int aaj() {
        return this.mzz.getRepeatMode();
    }

    public aaj bch() {
        return this.lnr;
    }

    public float bjy() {
        return this.mzz.jtx();
    }

    public void bqt() {
        this.to.clear();
        this.mzz.cancel();
        if (isVisible()) {
            return;
        }
        this.tvp = ud.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        mzz.qdl("Drawable#draw");
        try {
            if (this.xmv) {
                qdl(canvas, this.aaj);
            } else {
                qdl(canvas);
            }
        } catch (Throwable unused) {
        }
        this.wc = false;
        mzz.ud("Drawable#draw");
    }

    public int exc() {
        return (int) this.mzz.wd();
    }

    public void exu() {
        if (this.aaj == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.7
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.exu();
                }
            });
            return;
        }
        kdv();
        if (ekw() || jyq() == 0) {
            if (isVisible()) {
                this.mzz.rdp();
                this.tvp = ud.NONE;
            } else {
                this.tvp = ud.RESUME;
            }
        }
        if (ekw()) {
            return;
        }
        lnr((int) (jtx() < 0.0f ? rdp() : bjy()));
        this.mzz.fs();
        if (isVisible()) {
            return;
        }
        this.tvp = ud.NONE;
    }

    public void fs() {
        this.to.clear();
        this.mzz.fs();
        if (isVisible()) {
            return;
        }
        this.tvp = ud.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.jyq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        wd wdVar = this.mml;
        if (wdVar == null) {
            return -1;
        }
        return wdVar.mml().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        wd wdVar = this.mml;
        if (wdVar == null) {
            return -1;
        }
        return wdVar.mml().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.wc) {
            return;
        }
        this.wc = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return oth();
    }

    public void jl() {
        this.mzz.removeAllListeners();
    }

    public jl jpc() {
        wd wdVar = this.mml;
        if (wdVar != null) {
            return wdVar.lnr();
        }
        return null;
    }

    public float jtx() {
        return this.mzz.to();
    }

    public int jyq() {
        return this.mzz.getRepeatCount();
    }

    public void koa() {
        this.to.clear();
        this.mzz.exu();
        if (isVisible()) {
            return;
        }
        this.tvp = ud.NONE;
    }

    public boolean ljh() {
        if (isVisible()) {
            return this.mzz.isRunning();
        }
        ud udVar = this.tvp;
        return udVar == ud.PLAY || udVar == ud.RESUME;
    }

    public boolean lnr() {
        return this.exc;
    }

    public String mml() {
        return this.exu;
    }

    public exc mo() {
        return this.xmv ? exc.SOFTWARE : exc.HARDWARE;
    }

    public boolean mzz() {
        return this.jl;
    }

    public boolean oth() {
        com.bytedance.adsdk.ud.mo.lnr lnrVar = this.mzz;
        if (lnrVar == null) {
            return false;
        }
        return lnrVar.isRunning();
    }

    public RectF rc() {
        return this.mrf;
    }

    public float rdp() {
        return this.mzz.bjy();
    }

    public void rq() {
        if (this.aaj == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.6
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.rq();
                }
            });
            return;
        }
        kdv();
        if (ekw() || jyq() == 0) {
            if (isVisible()) {
                this.mzz.rq();
                this.tvp = ud.NONE;
            } else {
                this.tvp = ud.PLAY;
            }
        }
        if (ekw()) {
            return;
        }
        lnr((int) (jtx() < 0.0f ? rdp() : bjy()));
        this.mzz.fs();
        if (isVisible()) {
            return;
        }
        this.tvp = ud.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.jyq = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z3);
        if (z2) {
            ud udVar = this.tvp;
            if (udVar == ud.PLAY) {
                rq();
                return visible;
            }
            if (udVar == ud.RESUME) {
                exu();
                return visible;
            }
        } else {
            if (this.mzz.isRunning()) {
                koa();
                this.tvp = ud.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.tvp = ud.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        rq();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        fs();
    }

    public void to() {
        if (this.mzz.isRunning()) {
            this.mzz.cancel();
            if (!isVisible()) {
                this.tvp = ud.NONE;
            }
        }
        this.mml = null;
        this.aaj = null;
        this.fs = null;
        this.mzz.jpc();
        invalidateSelf();
    }

    public boolean tvp() {
        return this.bch;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean uw() {
        return this.jtx == null && this.lnr == null && this.mml.rdp().size() > 0;
    }

    public float vu() {
        return this.mzz.mo();
    }

    public boolean wd() {
        return this.xmv;
    }

    public wd xmv() {
        return this.mml;
    }

    public void yt() {
        this.mzz.removeAllUpdateListeners();
        this.mzz.addUpdateListener(this.rq);
    }

    public void lnr(boolean z2) {
        this.oth = z2;
        wd wdVar = this.mml;
        if (wdVar != null) {
            wdVar.ud(z2);
        }
    }

    public void mml(boolean z2) {
        if (this.ljh == z2) {
            return;
        }
        this.ljh = z2;
        com.bytedance.adsdk.ud.lnr.lnr.ud udVar = this.aaj;
        if (udVar != null) {
            udVar.qdl(z2);
        }
    }

    public void mo(boolean z2) {
        this.jpc = z2;
    }

    public void mzz(boolean z2) {
        this.bch = z2;
    }

    public void qdl(View view) {
        this.ag = view;
    }

    public com.bytedance.adsdk.ud.lnr.lnr.ud ud() {
        return this.aaj;
    }

    public void wd(boolean z2) {
        this.wd = z2;
    }

    public void jpc(boolean z2) {
        this.mzz.lnr(z2);
    }

    public to mo(String str) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            return null;
        }
        return wdVar.jtx().get(str);
    }

    public void mzz(int i2) {
        this.mzz.setRepeatCount(i2);
    }

    public View qdl() {
        return this.ag;
    }

    public void ud(boolean z2) {
        this.jl = z2;
    }

    public void wd(String str) {
        this.qdl = str;
        com.bytedance.adsdk.ud.ud.qdl qdlVarHzv = hzv();
        if (qdlVarHzv != null) {
            qdlVarHzv.qdl(str);
        }
    }

    public Bitmap mzz(String str) {
        com.bytedance.adsdk.ud.ud.ud udVarHkc = hkc();
        if (udVarHkc != null) {
            return udVarHkc.qdl(str);
        }
        return null;
    }

    public void qdl(boolean z2, Context context) {
        if (this.yt == z2) {
            return;
        }
        this.yt = z2;
        if (this.mml != null) {
            qdl(context);
        }
    }

    public void ud(final int i2) {
        if (this.mml == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.10
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.ud(i2);
                }
            });
        } else {
            this.mzz.ud(i2 + 0.99f);
        }
    }

    public void lnr(final String str) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.13
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar2) {
                    tvp.this.lnr(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ud.lnr.mo moVarLnr = wdVar.lnr(str);
        if (moVarLnr != null) {
            ud((int) (moVarLnr.qdl + moVarLnr.ud));
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, com.thinkup.core.common.n.mo.ono));
    }

    public void mml(final String str) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.2
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar2) {
                    tvp.this.mml(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ud.lnr.mo moVarLnr = wdVar.lnr(str);
        if (moVarLnr != null) {
            int i2 = (int) moVarLnr.qdl;
            qdl(i2, ((int) moVarLnr.ud) + i2);
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, com.thinkup.core.common.n.mo.ono));
    }

    public void ud(final float f) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.11
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar2) {
                    tvp.this.ud(f);
                }
            });
        } else {
            this.mzz.ud(com.bytedance.adsdk.ud.mo.mzz.qdl(wdVar.mo(), this.mml.wd(), f));
        }
    }

    public void qdl(boolean z2) {
        if (z2 != this.exc) {
            this.exc = z2;
            com.bytedance.adsdk.ud.lnr.lnr.ud udVar = this.aaj;
            if (udVar != null) {
                udVar.ud(z2);
            }
            invalidateSelf();
        }
    }

    public void ud(final String str) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.12
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar2) {
                    tvp.this.ud(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ud.lnr.mo moVarLnr = wdVar.lnr(str);
        if (moVarLnr != null) {
            qdl((int) moVarLnr.qdl);
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, com.thinkup.core.common.n.mo.ono));
    }

    public void qdl(String str) {
        this.exu = str;
    }

    public boolean qdl(wd wdVar, Context context) {
        if (this.mml == wdVar) {
            return false;
        }
        this.wc = true;
        to();
        this.mml = wdVar;
        qdl(context);
        this.mzz.qdl(wdVar);
        mml(this.mzz.getAnimatedFraction());
        Iterator it = new ArrayList(this.to).iterator();
        while (it.hasNext()) {
            qdl qdlVar = (qdl) it.next();
            if (qdlVar != null) {
                qdlVar.qdl(wdVar);
            }
            it.remove();
        }
        this.to.clear();
        wdVar.ud(this.oth);
        kdv();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void lnr(float f) {
        this.mzz.lnr(f);
    }

    public void lnr(final int i2) {
        if (this.mml == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.4
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.lnr(i2);
                }
            });
        } else {
            this.mzz.qdl(i2);
        }
    }

    public void mml(final float f) {
        if (this.mml == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.5
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.mml(f);
                }
            });
            return;
        }
        mzz.qdl("Drawable#setProgress");
        this.mzz.qdl(this.mml.qdl(f));
        mzz.ud("Drawable#setProgress");
    }

    public void ud(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mzz.removeUpdateListener(animatorUpdateListener);
    }

    public void ud(Animator.AnimatorListener animatorListener) {
        this.mzz.removeListener(animatorListener);
    }

    private void ud(int i2, int i3) {
        Bitmap bitmap = this.koa;
        if (bitmap != null && bitmap.getWidth() >= i2 && this.koa.getHeight() >= i3) {
            if (this.koa.getWidth() > i2 || this.koa.getHeight() > i3) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.koa, 0, 0, i2, i3);
                this.koa = bitmapCreateBitmap;
                this.vu.setBitmap(bitmapCreateBitmap);
                this.wc = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        this.koa = bitmapCreateBitmap2;
        this.vu.setBitmap(bitmapCreateBitmap2);
        this.wc = true;
    }

    public void mml(int i2) {
        this.mzz.setRepeatMode(i2);
    }

    public void qdl(exc excVar) {
        this.uw = excVar;
        kdv();
    }

    private void qdl(Context context) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            return;
        }
        com.bytedance.adsdk.ud.lnr.lnr.ud udVar = new com.bytedance.adsdk.ud.lnr.lnr.ud(this, oth.qdl(wdVar), wdVar.exu(), wdVar, context);
        this.aaj = udVar;
        if (this.ljh) {
            udVar.qdl(true);
        }
        this.aaj.ud(this.exc);
    }

    public void qdl(final int i2) {
        if (this.mml == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.8
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.qdl(i2);
                }
            });
        } else {
            this.mzz.qdl(i2);
        }
    }

    public void qdl(final float f) {
        wd wdVar = this.mml;
        if (wdVar == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.9
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar2) {
                    tvp.this.qdl(f);
                }
            });
        } else {
            qdl((int) com.bytedance.adsdk.ud.mo.mzz.qdl(wdVar.mo(), this.mml.wd(), f));
        }
    }

    public void qdl(final int i2, final int i3) {
        if (this.mml == null) {
            this.to.add(new qdl() { // from class: com.bytedance.adsdk.ud.tvp.3
                @Override // com.bytedance.adsdk.ud.tvp.qdl
                public void qdl(wd wdVar) {
                    tvp.this.qdl(i2, i3);
                }
            });
        } else {
            this.mzz.qdl(i2, i3 + 0.99f);
        }
    }

    public void qdl(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mzz.addUpdateListener(animatorUpdateListener);
    }

    public void qdl(Animator.AnimatorListener animatorListener) {
        this.mzz.addListener(animatorListener);
    }

    public void qdl(Boolean bool) {
        this.mo = bool.booleanValue();
    }

    public void qdl(mml mmlVar) {
        this.rdp = mmlVar;
        com.bytedance.adsdk.ud.ud.ud udVar = this.fs;
        if (udVar != null) {
            udVar.qdl(mmlVar);
        }
    }

    public void qdl(lnr lnrVar) {
        this.ud = lnrVar;
        com.bytedance.adsdk.ud.ud.qdl qdlVar = this.bjy;
        if (qdlVar != null) {
            qdlVar.qdl(lnrVar);
        }
    }

    public void qdl(Map<String, Typeface> map) {
        if (map == this.jtx) {
            return;
        }
        this.jtx = map;
        invalidateSelf();
    }

    public void qdl(aaj aajVar) {
        this.lnr = aajVar;
    }

    public Bitmap qdl(String str, Bitmap bitmap) {
        com.bytedance.adsdk.ud.ud.ud udVarHkc = hkc();
        if (udVarHkc == null) {
            return null;
        }
        Bitmap bitmapQdl = udVarHkc.qdl(str, bitmap);
        invalidateSelf();
        return bitmapQdl;
    }

    public Typeface qdl(com.bytedance.adsdk.ud.lnr.lnr lnrVar) {
        Map<String, Typeface> map = this.jtx;
        if (map != null) {
            String strQdl = lnrVar.qdl();
            if (map.containsKey(strQdl)) {
                return map.get(strQdl);
            }
            String strUd = lnrVar.ud();
            if (map.containsKey(strUd)) {
                return map.get(strUd);
            }
            String str = lnrVar.qdl() + TokenBuilder.TOKEN_DELIMITER + lnrVar.lnr();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.ud.ud.qdl qdlVarHzv = hzv();
        if (qdlVarHzv != null) {
            return qdlVarHzv.qdl(lnrVar);
        }
        return null;
    }

    private void qdl(Canvas canvas) {
        com.bytedance.adsdk.ud.lnr.lnr.ud udVar = this.aaj;
        wd wdVar = this.mml;
        if (udVar == null || wdVar == null) {
            return;
        }
        this.bqt.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.bqt.preScale(bounds.width() / wdVar.mml().width(), bounds.height() / wdVar.mml().height());
            this.bqt.preTranslate(bounds.left, bounds.top);
        }
        udVar.qdl(canvas, this.bqt, this.jyq);
    }

    private void qdl(Canvas canvas, com.bytedance.adsdk.ud.lnr.lnr.ud udVar) {
        if (this.mml == null || udVar == null) {
            return;
        }
        mrf();
        canvas.getMatrix(this.gy);
        canvas.getClipBounds(this.rc);
        qdl(this.rc, this.kdv);
        this.gy.mapRect(this.kdv);
        qdl(this.kdv, this.rc);
        if (this.exc) {
            this.mrf.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            udVar.qdl(this.mrf, (Matrix) null, false);
        }
        this.gy.mapRect(this.mrf);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        qdl(this.mrf, fWidth, fHeight);
        if (!gy()) {
            RectF rectF = this.mrf;
            Rect rect = this.rc;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.mrf.width());
        int iCeil2 = (int) Math.ceil(this.mrf.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        ud(iCeil, iCeil2);
        if (this.wc) {
            this.bqt.set(this.gy);
            this.bqt.preScale(fWidth, fHeight);
            Matrix matrix = this.bqt;
            RectF rectF2 = this.mrf;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.koa.eraseColor(0);
            udVar.qdl(this.vu, this.bqt, this.jyq);
            this.gy.invert(this.ax);
            this.ax.mapRect(this.fco, this.mrf);
            qdl(this.fco, this.hzv);
        }
        this.hkc.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.koa, this.hkc, this.hzv, this.ekw);
    }

    private void qdl(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void qdl(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void qdl(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }
}
