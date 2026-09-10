package com.bytedance.adsdk.lr;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.lr.fi.uq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends Drawable implements Animatable, Drawable.Callback {
    private com.bytedance.adsdk.lr.ik.ik.lr ac;
    private String aw;
    private boolean ay;
    private ka bgr;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.adsdk.lr.lr.lr f17998co;
    private boolean di;
    private Canvas dw;
    private Rect dzy;
    private final com.bytedance.adsdk.lr.di.ik fi;
    private tan fr;
    private RectF hcw;
    private RectF ig;
    private final Matrix igq;
    private int ihz;
    ac ik;
    private lr jbs;
    private View jc;
    private xha ka;
    private boolean kt;
    ik lr;
    private boolean mj;
    private boolean nr;
    private Paint oh;
    private Rect ory;
    private RectF pv;
    private Matrix qd;
    private final ArrayList<ri> qt;
    String ri;
    private final ValueAnimator.AnimatorUpdateListener sf;
    private Map<String, Typeface> slm;
    private Matrix srn;
    private boolean su;
    private boolean tan;
    private boolean uq;
    private com.bytedance.adsdk.lr.lr.ri vr;
    private boolean wjv;
    private Rect xd;
    private boolean xha;
    private Bitmap zf;

    public enum lr {
        NONE,
        PLAY,
        RESUME
    }

    public interface ri {
        void ri(xha xhaVar);
    }

    public jbs() {
        com.bytedance.adsdk.lr.di.ik ikVar = new com.bytedance.adsdk.lr.di.ik();
        this.fi = ikVar;
        this.di = true;
        this.xha = false;
        this.mj = false;
        this.jbs = lr.NONE;
        this.qt = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.jbs.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (jbs.this.ac != null) {
                    jbs.this.ac.ri(jbs.this.fi.di());
                }
            }
        };
        this.sf = animatorUpdateListener;
        this.nr = false;
        this.tan = true;
        this.ihz = 255;
        this.fr = tan.AUTOMATIC;
        this.su = false;
        this.igq = new Matrix();
        this.kt = false;
        ikVar.addUpdateListener(animatorUpdateListener);
    }

    private com.bytedance.adsdk.lr.lr.ri dzy() {
        if (getCallback() == null) {
            return null;
        }
        if (this.vr == null) {
            com.bytedance.adsdk.lr.lr.ri riVar = new com.bytedance.adsdk.lr.lr.ri(getCallback(), this.lr);
            this.vr = riVar;
            String str = this.ri;
            if (str != null) {
                riVar.ri(str);
            }
        }
        return this.vr;
    }

    private void hcw() {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            return;
        }
        this.su = this.fr.ri(Build.VERSION.SDK_INT, xhaVar.ri(), xhaVar.lr());
    }

    private void ig() {
        if (this.dw != null) {
            return;
        }
        this.dw = new Canvas();
        this.ig = new RectF();
        this.qd = new Matrix();
        this.srn = new Matrix();
        this.ory = new Rect();
        this.hcw = new RectF();
        this.oh = new com.bytedance.adsdk.lr.ri.ri();
        this.xd = new Rect();
        this.dzy = new Rect();
        this.pv = new RectF();
    }

    private boolean oh() {
        return this.di || this.xha;
    }

    private Context pv() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean qd() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private com.bytedance.adsdk.lr.lr.lr xd() {
        com.bytedance.adsdk.lr.lr.lr lrVar = this.f17998co;
        if (lrVar != null && !lrVar.ri(pv())) {
            this.f17998co = null;
        }
        if (this.f17998co == null) {
            this.f17998co = new com.bytedance.adsdk.lr.lr.lr(getCallback(), this.aw, this.bgr, this.ka.slm());
        }
        return this.f17998co;
    }

    public int ac() {
        return this.fi.getRepeatMode();
    }

    public void aw() {
        if (this.ac == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.7
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.aw();
                }
            });
            return;
        }
        hcw();
        if (oh() || ihz() == 0) {
            if (isVisible()) {
                this.fi.bgr();
                this.jbs = lr.NONE;
            } else {
                this.jbs = lr.RESUME;
            }
        }
        if (oh()) {
            return;
        }
        ik((int) (slm() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? bgr() : vr()));
        this.fi.co();
        if (isVisible()) {
            return;
        }
        this.jbs = lr.NONE;
    }

    public ac ay() {
        return this.ik;
    }

    public float bgr() {
        return this.fi.vr();
    }

    public void bu() {
        this.fi.removeAllUpdateListeners();
        this.fi.addUpdateListener(this.sf);
    }

    public void co() {
        this.qt.clear();
        this.fi.co();
        if (isVisible()) {
            return;
        }
        this.jbs = lr.NONE;
    }

    public tan di() {
        return this.su ? tan.SOFTWARE : tan.HARDWARE;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        fi.ri("Drawable#draw");
        try {
            if (this.su) {
                ri(canvas, this.ac);
            } else {
                ri(canvas);
            }
        } catch (Throwable unused) {
        }
        this.kt = false;
        fi.lr("Drawable#draw");
    }

    public float dw() {
        return this.fi.di();
    }

    public boolean fi() {
        return this.nr;
    }

    public boolean fr() {
        return this.slm == null && this.ik == null && this.ka.bgr().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ihz;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            return -1;
        }
        return xhaVar.ka().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            return -1;
        }
        return xhaVar.ka().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void igq() {
        this.qt.clear();
        this.fi.cancel();
        if (isVisible()) {
            return;
        }
        this.jbs = lr.NONE;
    }

    public int ihz() {
        return this.fi.getRepeatCount();
    }

    public boolean ik() {
        return this.tan;
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
        if (this.kt) {
            return;
        }
        this.kt = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return uq();
    }

    public boolean jbs() {
        return this.ay;
    }

    public String ka() {
        return this.aw;
    }

    public nr mj() {
        xha xhaVar = this.ka;
        if (xhaVar != null) {
            return xhaVar.ik();
        }
        return null;
    }

    public void nr() {
        this.fi.removeAllListeners();
    }

    public RectF ory() {
        return this.ig;
    }

    public void qt() {
        if (this.fi.isRunning()) {
            this.fi.cancel();
            if (!isVisible()) {
                this.jbs = lr.NONE;
            }
        }
        this.ka = null;
        this.ac = null;
        this.f17998co = null;
        this.fi.mj();
        invalidateSelf();
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
    public void setAlpha(int i) {
        this.ihz = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            lr lrVar = this.jbs;
            if (lrVar == lr.PLAY) {
                sf();
                return visible;
            }
            if (lrVar == lr.RESUME) {
                aw();
                return visible;
            }
        } else {
            if (this.fi.isRunning()) {
                zf();
                this.jbs = lr.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.jbs = lr.NONE;
            }
        }
        return visible;
    }

    public void sf() {
        if (this.ac == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.6
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.sf();
                }
            });
            return;
        }
        hcw();
        if (oh() || ihz() == 0) {
            if (isVisible()) {
                this.fi.sf();
                this.jbs = lr.NONE;
            } else {
                this.jbs = lr.PLAY;
            }
        }
        if (oh()) {
            return;
        }
        ik((int) (slm() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? bgr() : vr()));
        this.fi.co();
        if (isVisible()) {
            return;
        }
        this.jbs = lr.NONE;
    }

    public float slm() {
        return this.fi.qt();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        sf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        co();
    }

    public xha su() {
        return this.ka;
    }

    public int tan() {
        return (int) this.fi.xha();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean uq() {
        com.bytedance.adsdk.lr.di.ik ikVar = this.fi;
        if (ikVar == null) {
            return false;
        }
        return ikVar.isRunning();
    }

    public float vr() {
        return this.fi.slm();
    }

    public boolean wjv() {
        if (isVisible()) {
            return this.fi.isRunning();
        }
        lr lrVar = this.jbs;
        return lrVar == lr.PLAY || lrVar == lr.RESUME;
    }

    public boolean xha() {
        return this.su;
    }

    public void zf() {
        this.qt.clear();
        this.fi.aw();
        if (isVisible()) {
            return;
        }
        this.jbs = lr.NONE;
    }

    public void di(boolean z) {
        this.mj = z;
    }

    public void fi(boolean z) {
        this.ay = z;
    }

    public void ik(boolean z) {
        this.uq = z;
        xha xhaVar = this.ka;
        if (xhaVar != null) {
            xhaVar.lr(z);
        }
    }

    public void ka(boolean z) {
        if (this.wjv == z) {
            return;
        }
        this.wjv = z;
        com.bytedance.adsdk.lr.ik.ik.lr lrVar = this.ac;
        if (lrVar != null) {
            lrVar.ri(z);
        }
    }

    public com.bytedance.adsdk.lr.ik.ik.lr lr() {
        return this.ac;
    }

    public void ri(View view) {
        this.jc = view;
    }

    public void xha(boolean z) {
        this.xha = z;
    }

    public qt di(String str) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            return null;
        }
        return xhaVar.slm().get(str);
    }

    public void fi(int i) {
        this.fi.setRepeatCount(i);
    }

    public void lr(boolean z) {
        this.nr = z;
    }

    public void mj(boolean z) {
        this.fi.ik(z);
    }

    public View ri() {
        return this.jc;
    }

    public void xha(String str) {
        this.ri = str;
        com.bytedance.adsdk.lr.lr.ri riVarDzy = dzy();
        if (riVarDzy != null) {
            riVarDzy.ri(str);
        }
    }

    public Bitmap fi(String str) {
        com.bytedance.adsdk.lr.lr.lr lrVarXd = xd();
        if (lrVarXd != null) {
            return lrVarXd.ri(str);
        }
        return null;
    }

    public void lr(final int i) {
        if (this.ka == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.10
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.lr(i);
                }
            });
        } else {
            this.fi.lr(i + 0.99f);
        }
    }

    public void ri(boolean z, Context context) {
        if (this.bu == z) {
            return;
        }
        this.bu = z;
        if (this.ka != null) {
            ri(context);
        }
    }

    public void ik(final String str) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.13
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar2) {
                    jbs.this.ik(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lr.ik.di diVarIk = xhaVar.ik(str);
        if (diVarIk != null) {
            lr((int) (diVarIk.ri + diVarIk.lr));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void ka(final String str) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.2
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar2) {
                    jbs.this.ka(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lr.ik.di diVarIk = xhaVar.ik(str);
        if (diVarIk != null) {
            int i = (int) diVarIk.ri;
            ri(i, ((int) diVarIk.lr) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void lr(final float f) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.11
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar2) {
                    jbs.this.lr(f);
                }
            });
        } else {
            this.fi.lr(com.bytedance.adsdk.lr.di.fi.ri(xhaVar.di(), this.ka.xha(), f));
        }
    }

    public void ri(boolean z) {
        if (z != this.tan) {
            this.tan = z;
            com.bytedance.adsdk.lr.ik.ik.lr lrVar = this.ac;
            if (lrVar != null) {
                lrVar.lr(z);
            }
            invalidateSelf();
        }
    }

    public void ik(float f) {
        this.fi.ik(f);
    }

    public void lr(final String str) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.12
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar2) {
                    jbs.this.lr(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lr.ik.di diVarIk = xhaVar.ik(str);
        if (diVarIk != null) {
            ri((int) diVarIk.ri);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void ik(final int i) {
        if (this.ka == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.4
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.ik(i);
                }
            });
        } else {
            this.fi.ri(i);
        }
    }

    public void ka(final float f) {
        if (this.ka == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.5
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.ka(f);
                }
            });
            return;
        }
        fi.ri("Drawable#setProgress");
        this.fi.ri(this.ka.ri(f));
        fi.lr("Drawable#setProgress");
    }

    public void ri(String str) {
        this.aw = str;
    }

    public boolean ri(xha xhaVar, Context context) {
        if (this.ka == xhaVar) {
            return false;
        }
        this.kt = true;
        qt();
        this.ka = xhaVar;
        ri(context);
        this.fi.ri(xhaVar);
        ka(this.fi.getAnimatedFraction());
        Iterator it = new ArrayList(this.qt).iterator();
        while (it.hasNext()) {
            ri riVar = (ri) it.next();
            if (riVar != null) {
                riVar.ri(xhaVar);
            }
            it.remove();
        }
        this.qt.clear();
        xhaVar.lr(this.uq);
        hcw();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void lr(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.fi.removeUpdateListener(animatorUpdateListener);
    }

    public void lr(Animator.AnimatorListener animatorListener) {
        this.fi.removeListener(animatorListener);
    }

    private void lr(int i, int i2) {
        Bitmap bitmap = this.zf;
        if (bitmap != null && bitmap.getWidth() >= i && this.zf.getHeight() >= i2) {
            if (this.zf.getWidth() > i || this.zf.getHeight() > i2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zf, 0, 0, i, i2);
                this.zf = bitmapCreateBitmap;
                this.dw.setBitmap(bitmapCreateBitmap);
                this.kt = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.zf = bitmapCreateBitmap2;
        this.dw.setBitmap(bitmapCreateBitmap2);
        this.kt = true;
    }

    public void ka(int i) {
        this.fi.setRepeatMode(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void ri(tan tanVar) {
        this.fr = tanVar;
        hcw();
    }

    private void ri(Context context) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            return;
        }
        com.bytedance.adsdk.lr.ik.ik.lr lrVar = new com.bytedance.adsdk.lr.ik.ik.lr(this, uq.ri(xhaVar), xhaVar.aw(), xhaVar, context);
        this.ac = lrVar;
        if (this.wjv) {
            lrVar.ri(true);
        }
        this.ac.lr(this.tan);
    }

    public void ri(final int i) {
        if (this.ka == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.8
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.ri(i);
                }
            });
        } else {
            this.fi.ri(i);
        }
    }

    public void ri(final float f) {
        xha xhaVar = this.ka;
        if (xhaVar == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.9
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar2) {
                    jbs.this.ri(f);
                }
            });
        } else {
            ri((int) com.bytedance.adsdk.lr.di.fi.ri(xhaVar.di(), this.ka.xha(), f));
        }
    }

    public void ri(final int i, final int i2) {
        if (this.ka == null) {
            this.qt.add(new ri() { // from class: com.bytedance.adsdk.lr.jbs.3
                @Override // com.bytedance.adsdk.lr.jbs.ri
                public void ri(xha xhaVar) {
                    jbs.this.ri(i, i2);
                }
            });
        } else {
            this.fi.ri(i, i2 + 0.99f);
        }
    }

    public void ri(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.fi.addUpdateListener(animatorUpdateListener);
    }

    public void ri(Animator.AnimatorListener animatorListener) {
        this.fi.addListener(animatorListener);
    }

    public void ri(Boolean bool) {
        this.di = bool.booleanValue();
    }

    public void ri(ka kaVar) {
        this.bgr = kaVar;
        com.bytedance.adsdk.lr.lr.lr lrVar = this.f17998co;
        if (lrVar != null) {
            lrVar.ri(kaVar);
        }
    }

    public void ri(ik ikVar) {
        this.lr = ikVar;
        com.bytedance.adsdk.lr.lr.ri riVar = this.vr;
        if (riVar != null) {
            riVar.ri(ikVar);
        }
    }

    public void ri(Map<String, Typeface> map) {
        if (map == this.slm) {
            return;
        }
        this.slm = map;
        invalidateSelf();
    }

    public void ri(ac acVar) {
        this.ik = acVar;
    }

    public Bitmap ri(String str, Bitmap bitmap) {
        com.bytedance.adsdk.lr.lr.lr lrVarXd = xd();
        if (lrVarXd == null) {
            return null;
        }
        Bitmap bitmapRi = lrVarXd.ri(str, bitmap);
        invalidateSelf();
        return bitmapRi;
    }

    public Typeface ri(com.bytedance.adsdk.lr.ik.ik ikVar) {
        Map<String, Typeface> map = this.slm;
        if (map != null) {
            String strRi = ikVar.ri();
            if (map.containsKey(strRi)) {
                return map.get(strRi);
            }
            String strLr = ikVar.lr();
            if (map.containsKey(strLr)) {
                return map.get(strLr);
            }
            String str = ikVar.ri() + "-" + ikVar.ik();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.lr.lr.ri riVarDzy = dzy();
        if (riVarDzy != null) {
            return riVarDzy.ri(ikVar);
        }
        return null;
    }

    private void ri(Canvas canvas) {
        com.bytedance.adsdk.lr.ik.ik.lr lrVar = this.ac;
        xha xhaVar = this.ka;
        if (lrVar == null || xhaVar == null) {
            return;
        }
        this.igq.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.igq.preScale(bounds.width() / xhaVar.ka().width(), bounds.height() / xhaVar.ka().height());
            this.igq.preTranslate(bounds.left, bounds.top);
        }
        lrVar.ri(canvas, this.igq, this.ihz);
    }

    private void ri(Canvas canvas, com.bytedance.adsdk.lr.ik.ik.lr lrVar) {
        if (this.ka == null || lrVar == null) {
            return;
        }
        ig();
        canvas.getMatrix(this.qd);
        canvas.getClipBounds(this.ory);
        ri(this.ory, this.hcw);
        this.qd.mapRect(this.hcw);
        ri(this.hcw, this.ory);
        if (this.tan) {
            this.ig.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            lrVar.ri(this.ig, (Matrix) null, false);
        }
        this.qd.mapRect(this.ig);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        ri(this.ig, fWidth, fHeight);
        if (!qd()) {
            RectF rectF = this.ig;
            Rect rect = this.ory;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.ig.width());
        int iCeil2 = (int) Math.ceil(this.ig.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        lr(iCeil, iCeil2);
        if (this.kt) {
            this.igq.set(this.qd);
            this.igq.preScale(fWidth, fHeight);
            Matrix matrix = this.igq;
            RectF rectF2 = this.ig;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.zf.eraseColor(0);
            lrVar.ri(this.dw, this.igq, this.ihz);
            this.qd.invert(this.srn);
            this.srn.mapRect(this.pv, this.ig);
            ri(this.pv, this.dzy);
        }
        this.xd.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.zf, this.xd, this.dzy, this.oh);
    }

    private void ri(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void ri(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void ri(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }
}
