package com.bytedance.adsdk.LD;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import com.bytedance.adsdk.LD.JXs.HD;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.IntRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.google.android.material.color.utilities.Contrast;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends Drawable implements Animatable, Drawable.Callback {
    private RectF BcA;
    private Rect CG;
    private tD CSn;
    private com.bytedance.adsdk.LD.lk.lk.LD DY;
    private boolean HD;
    private com.bytedance.adsdk.LD.LD.Lxb IeN;
    private Canvas Ivz;
    private final ValueAnimator.AnimatorUpdateListener JVA;
    private final com.bytedance.adsdk.LD.lc.lk JXs;
    private Bitmap KPU;
    lk LD;
    String Lxb;
    private boolean NDz;
    private String NXR;
    private boolean OY;
    private Matrix Pw;
    private LD QAg;
    private ZU STP;
    private int Sfi;
    private Map<String, Typeface> VVE;
    private ebl ZU;
    private boolean aH;
    private boolean brP;
    private View dR;
    private boolean eK;
    private boolean ebl;
    private final Matrix foI;
    private Paint hg;
    private boolean id;
    private boolean kqm;
    private boolean lc;
    private RectF le;
    DY lk;
    private final ArrayList<Lxb> nBu;
    private Rect nE;
    private Rect nJ;
    private Matrix rW;
    private com.bytedance.adsdk.LD.LD.LD sLN;
    private boolean tD;
    private RectF xan;

    public enum LD {
        NONE,
        PLAY,
        RESUME
    }

    public interface Lxb {
        void Lxb(ebl eblVar);
    }

    public QAg() {
        com.bytedance.adsdk.LD.lc.lk lkVar = new com.bytedance.adsdk.LD.lc.lk();
        this.JXs = lkVar;
        this.lc = true;
        this.ebl = false;
        this.OY = false;
        this.QAg = LD.NONE;
        this.nBu = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.QAg.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (QAg.this.DY != null) {
                    QAg.this.DY.Lxb(QAg.this.JXs.lc());
                }
            }
        };
        this.JVA = animatorUpdateListener;
        this.brP = false;
        this.tD = true;
        this.Sfi = 255;
        this.CSn = tD.AUTOMATIC;
        this.id = false;
        this.foI = new Matrix();
        this.NDz = false;
        lkVar.addUpdateListener(animatorUpdateListener);
    }

    private void BcA() {
        if (this.Ivz != null) {
            return;
        }
        this.Ivz = new Canvas();
        this.BcA = new RectF();
        this.rW = new Matrix();
        this.Pw = new Matrix();
        this.nE = new Rect();
        this.xan = new RectF();
        this.hg = new com.bytedance.adsdk.LD.Lxb.Lxb();
        this.CG = new Rect();
        this.nJ = new Rect();
        this.le = new RectF();
    }

    private com.bytedance.adsdk.LD.LD.LD CG() {
        com.bytedance.adsdk.LD.LD.LD ld = this.sLN;
        if (ld != null && !ld.Lxb(le())) {
            this.sLN = null;
        }
        if (this.sLN == null) {
            this.sLN = new com.bytedance.adsdk.LD.LD.LD(getCallback(), this.NXR, this.STP, this.ZU.VVE());
        }
        return this.sLN;
    }

    private boolean hg() {
        return this.lc || this.ebl;
    }

    private Context le() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.bytedance.adsdk.LD.LD.Lxb nJ() {
        if (getCallback() == null) {
            return null;
        }
        if (this.IeN == null) {
            com.bytedance.adsdk.LD.LD.Lxb lxb = new com.bytedance.adsdk.LD.LD.Lxb(getCallback(), this.LD);
            this.IeN = lxb;
            String str = this.Lxb;
            if (str != null) {
                lxb.Lxb(str);
            }
        }
        return this.IeN;
    }

    private boolean rW() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private void xan() {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            return;
        }
        this.id = this.CSn.Lxb(Build.VERSION.SDK_INT, eblVar.Lxb(), eblVar.LD());
    }

    public boolean CSn() {
        return this.VVE == null && this.lk == null && this.ZU.STP().size() > 0;
    }

    @SuppressLint({"WrongConstant"})
    public int DY() {
        return this.JXs.getRepeatMode();
    }

    public boolean HD() {
        com.bytedance.adsdk.LD.lc.lk lkVar = this.JXs;
        if (lkVar == null) {
            return false;
        }
        return lkVar.isRunning();
    }

    public float IeN() {
        return this.JXs.VVE();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float Ivz() {
        return this.JXs.lc();
    }

    @MainThread
    public void JVA() {
        if (this.DY == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.6
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.JVA();
                }
            });
            return;
        }
        xan();
        if (hg() || Sfi() == 0) {
            if (isVisible()) {
                this.JXs.JVA();
                this.QAg = LD.NONE;
            } else {
                this.QAg = LD.PLAY;
            }
        }
        if (hg()) {
            return;
        }
        lk((int) (VVE() < 0.0f ? STP() : IeN()));
        this.JXs.sLN();
        if (isVisible()) {
            return;
        }
        this.QAg = LD.NONE;
    }

    public boolean JXs() {
        return this.brP;
    }

    public void KPU() {
        this.nBu.clear();
        this.JXs.NXR();
        if (isVisible()) {
            return;
        }
        this.QAg = LD.NONE;
    }

    @MainThread
    public void NXR() {
        if (this.DY == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.7
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.NXR();
                }
            });
            return;
        }
        xan();
        if (hg() || Sfi() == 0) {
            if (isVisible()) {
                this.JXs.STP();
                this.QAg = LD.NONE;
            } else {
                this.QAg = LD.RESUME;
            }
        }
        if (hg()) {
            return;
        }
        lk((int) (VVE() < 0.0f ? STP() : IeN()));
        this.JXs.sLN();
        if (isVisible()) {
            return;
        }
        this.QAg = LD.NONE;
    }

    public brP OY() {
        ebl eblVar = this.ZU;
        if (eblVar != null) {
            return eblVar.lk();
        }
        return null;
    }

    public boolean QAg() {
        return this.aH;
    }

    public float STP() {
        return this.JXs.IeN();
    }

    public int Sfi() {
        return this.JXs.getRepeatCount();
    }

    public float VVE() {
        return this.JXs.nBu();
    }

    public String ZU() {
        return this.NXR;
    }

    public DY aH() {
        return this.lk;
    }

    public void brP() {
        this.JXs.removeAllListeners();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        JXs.Lxb("Drawable#draw");
        try {
            if (this.id) {
                Lxb(canvas, this.DY);
            } else {
                Lxb(canvas);
            }
        } catch (Throwable unused) {
        }
        this.NDz = false;
        JXs.LD("Drawable#draw");
    }

    public boolean eK() {
        if (isVisible()) {
            return this.JXs.isRunning();
        }
        LD ld = this.QAg;
        return ld == LD.PLAY || ld == LD.RESUME;
    }

    public boolean ebl() {
        return this.id;
    }

    public void foI() {
        this.nBu.clear();
        this.JXs.cancel();
        if (isVisible()) {
            return;
        }
        this.QAg = LD.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Sfi;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            return -1;
        }
        return eblVar.ZU().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            return -1;
        }
        return eblVar.ZU().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ebl id() {
        return this.ZU;
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
        if (this.NDz) {
            return;
        }
        this.NDz = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return HD();
    }

    public void kqm() {
        this.JXs.removeAllUpdateListeners();
        this.JXs.addUpdateListener(this.JVA);
    }

    public tD lc() {
        return this.id ? tD.SOFTWARE : tD.HARDWARE;
    }

    public boolean lk() {
        return this.tD;
    }

    public void nBu() {
        if (this.JXs.isRunning()) {
            this.JXs.cancel();
            if (!isVisible()) {
                this.QAg = LD.NONE;
            }
        }
        this.ZU = null;
        this.DY = null;
        this.sLN = null;
        this.JXs.OY();
        invalidateSelf();
    }

    public RectF nE() {
        return this.BcA;
    }

    @MainThread
    public void sLN() {
        this.nBu.clear();
        this.JXs.sLN();
        if (isVisible()) {
            return;
        }
        this.QAg = LD.NONE;
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
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.Sfi = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            LD ld = this.QAg;
            if (ld == LD.PLAY) {
                JVA();
            } else if (ld == LD.RESUME) {
                NXR();
            }
        } else if (this.JXs.isRunning()) {
            KPU();
            this.QAg = LD.RESUME;
        } else if (!z3) {
            this.QAg = LD.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        JVA();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        sLN();
    }

    public int tD() {
        return (int) this.JXs.ebl();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void JXs(boolean z) {
        this.aH = z;
    }

    public com.bytedance.adsdk.LD.lk.lk.LD LD() {
        return this.DY;
    }

    public void Lxb(View view) {
        this.dR = view;
    }

    public void ZU(boolean z) {
        if (this.eK == z) {
            return;
        }
        this.eK = z;
        com.bytedance.adsdk.LD.lk.lk.LD ld = this.DY;
        if (ld != null) {
            ld.Lxb(z);
        }
    }

    public void ebl(boolean z) {
        this.ebl = z;
    }

    public void lc(boolean z) {
        this.OY = z;
    }

    public void lk(boolean z) {
        this.HD = z;
        ebl eblVar = this.ZU;
        if (eblVar != null) {
            eblVar.LD(z);
        }
    }

    public void JXs(int i) {
        this.JXs.setRepeatCount(i);
    }

    public void LD(boolean z) {
        this.brP = z;
    }

    public View Lxb() {
        return this.dR;
    }

    public void OY(boolean z) {
        this.JXs.lk(z);
    }

    public void ebl(String str) {
        this.Lxb = str;
        com.bytedance.adsdk.LD.LD.Lxb lxbNJ = nJ();
        if (lxbNJ != null) {
            lxbNJ.Lxb(str);
        }
    }

    public nBu lc(String str) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            return null;
        }
        return eblVar.VVE().get(str);
    }

    public Bitmap JXs(String str) {
        com.bytedance.adsdk.LD.LD.LD ldCG = CG();
        if (ldCG != null) {
            return ldCG.Lxb(str);
        }
        return null;
    }

    public void LD(final int i) {
        if (this.ZU == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.10
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.LD(i);
                }
            });
        } else {
            this.JXs.LD(i + 0.99f);
        }
    }

    public void Lxb(boolean z, Context context) {
        if (this.kqm == z) {
            return;
        }
        this.kqm = z;
        if (this.ZU != null) {
            Lxb(context);
        }
    }

    public void lk(final String str) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.13
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar2) {
                    QAg.this.lk(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.LD.lk.lc lcVarLk = eblVar.lk(str);
        if (lcVarLk != null) {
            LD((int) (lcVarLk.Lxb + lcVarLk.LD));
            return;
        }
        throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
    }

    public void ZU(final String str) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.2
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar2) {
                    QAg.this.ZU(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.LD.lk.lc lcVarLk = eblVar.lk(str);
        if (lcVarLk != null) {
            int i = (int) lcVarLk.Lxb;
            Lxb(i, ((int) lcVarLk.LD) + i);
            return;
        }
        throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
    }

    public void LD(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) final float f) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.11
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar2) {
                    QAg.this.LD(f);
                }
            });
        } else {
            this.JXs.LD(com.bytedance.adsdk.LD.lc.JXs.Lxb(eblVar.lc(), this.ZU.ebl(), f));
        }
    }

    public void Lxb(boolean z) {
        if (z != this.tD) {
            this.tD = z;
            com.bytedance.adsdk.LD.lk.lk.LD ld = this.DY;
            if (ld != null) {
                ld.LD(z);
            }
            invalidateSelf();
        }
    }

    public void LD(final String str) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.12
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar2) {
                    QAg.this.LD(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.LD.lk.lc lcVarLk = eblVar.lk(str);
        if (lcVarLk != null) {
            Lxb((int) lcVarLk.Lxb);
            return;
        }
        throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
    }

    public void Lxb(String str) {
        this.NXR = str;
    }

    public boolean Lxb(ebl eblVar, Context context) {
        if (this.ZU == eblVar) {
            return false;
        }
        this.NDz = true;
        nBu();
        this.ZU = eblVar;
        Lxb(context);
        this.JXs.Lxb(eblVar);
        ZU(this.JXs.getAnimatedFraction());
        Iterator it = new ArrayList(this.nBu).iterator();
        while (it.hasNext()) {
            Lxb lxb = (Lxb) it.next();
            if (lxb != null) {
                lxb.Lxb(eblVar);
            }
            it.remove();
        }
        this.nBu.clear();
        eblVar.LD(this.HD);
        xan();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void lk(float f) {
        this.JXs.lk(f);
    }

    public void lk(final int i) {
        if (this.ZU == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.4
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.lk(i);
                }
            });
        } else {
            this.JXs.Lxb(i);
        }
    }

    public void ZU(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) final float f) {
        if (this.ZU == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.5
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.ZU(f);
                }
            });
            return;
        }
        JXs.Lxb("Drawable#setProgress");
        this.JXs.Lxb(this.ZU.Lxb(f));
        JXs.LD("Drawable#setProgress");
    }

    public void LD(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.JXs.removeUpdateListener(animatorUpdateListener);
    }

    public void LD(Animator.AnimatorListener animatorListener) {
        this.JXs.removeListener(animatorListener);
    }

    private void LD(int i, int i2) {
        Bitmap bitmap = this.KPU;
        if (bitmap != null && bitmap.getWidth() >= i && this.KPU.getHeight() >= i2) {
            if (this.KPU.getWidth() > i || this.KPU.getHeight() > i2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.KPU, 0, 0, i, i2);
                this.KPU = bitmapCreateBitmap;
                this.Ivz.setBitmap(bitmapCreateBitmap);
                this.NDz = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.KPU = bitmapCreateBitmap2;
        this.Ivz.setBitmap(bitmapCreateBitmap2);
        this.NDz = true;
    }

    public void ZU(int i) {
        this.JXs.setRepeatMode(i);
    }

    public void Lxb(tD tDVar) {
        this.CSn = tDVar;
        xan();
    }

    private void Lxb(Context context) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            return;
        }
        com.bytedance.adsdk.LD.lk.lk.LD ld = new com.bytedance.adsdk.LD.lk.lk.LD(this, HD.Lxb(eblVar), eblVar.NXR(), eblVar, context);
        this.DY = ld;
        if (this.eK) {
            ld.Lxb(true);
        }
        this.DY.LD(this.tD);
    }

    public void Lxb(final int i) {
        if (this.ZU == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.8
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.Lxb(i);
                }
            });
        } else {
            this.JXs.Lxb(i);
        }
    }

    public void Lxb(final float f) {
        ebl eblVar = this.ZU;
        if (eblVar == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.9
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar2) {
                    QAg.this.Lxb(f);
                }
            });
        } else {
            Lxb((int) com.bytedance.adsdk.LD.lc.JXs.Lxb(eblVar.lc(), this.ZU.ebl(), f));
        }
    }

    public void Lxb(final int i, final int i2) {
        if (this.ZU == null) {
            this.nBu.add(new Lxb() { // from class: com.bytedance.adsdk.LD.QAg.3
                @Override // com.bytedance.adsdk.LD.QAg.Lxb
                public void Lxb(ebl eblVar) {
                    QAg.this.Lxb(i, i2);
                }
            });
        } else {
            this.JXs.Lxb(i, i2 + 0.99f);
        }
    }

    public void Lxb(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.JXs.addUpdateListener(animatorUpdateListener);
    }

    public void Lxb(Animator.AnimatorListener animatorListener) {
        this.JXs.addListener(animatorListener);
    }

    public void Lxb(Boolean bool) {
        this.lc = bool.booleanValue();
    }

    public void Lxb(ZU zu) {
        this.STP = zu;
        com.bytedance.adsdk.LD.LD.LD ld = this.sLN;
        if (ld != null) {
            ld.Lxb(zu);
        }
    }

    public void Lxb(lk lkVar) {
        this.LD = lkVar;
        com.bytedance.adsdk.LD.LD.Lxb lxb = this.IeN;
        if (lxb != null) {
            lxb.Lxb(lkVar);
        }
    }

    public void Lxb(Map<String, Typeface> map) {
        if (map == this.VVE) {
            return;
        }
        this.VVE = map;
        invalidateSelf();
    }

    public void Lxb(DY dy) {
        this.lk = dy;
    }

    public Bitmap Lxb(String str, Bitmap bitmap) {
        com.bytedance.adsdk.LD.LD.LD ldCG = CG();
        if (ldCG == null) {
            return null;
        }
        Bitmap bitmapLxb = ldCG.Lxb(str, bitmap);
        invalidateSelf();
        return bitmapLxb;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface Lxb(com.bytedance.adsdk.LD.lk.lk lkVar) {
        Map<String, Typeface> map = this.VVE;
        if (map != null) {
            String strLxb = lkVar.Lxb();
            if (map.containsKey(strLxb)) {
                return map.get(strLxb);
            }
            String strLD = lkVar.LD();
            if (map.containsKey(strLD)) {
                return map.get(strLD);
            }
            String str = lkVar.Lxb() + "-" + lkVar.lk();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.LD.LD.Lxb lxbNJ = nJ();
        if (lxbNJ != null) {
            return lxbNJ.Lxb(lkVar);
        }
        return null;
    }

    private void Lxb(Canvas canvas) {
        com.bytedance.adsdk.LD.lk.lk.LD ld = this.DY;
        ebl eblVar = this.ZU;
        if (ld == null || eblVar == null) {
            return;
        }
        this.foI.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.foI.preScale(bounds.width() / eblVar.ZU().width(), bounds.height() / eblVar.ZU().height());
            this.foI.preTranslate(bounds.left, bounds.top);
        }
        ld.Lxb(canvas, this.foI, this.Sfi);
    }

    private void Lxb(Canvas canvas, com.bytedance.adsdk.LD.lk.lk.LD ld) {
        if (this.ZU == null || ld == null) {
            return;
        }
        BcA();
        canvas.getMatrix(this.rW);
        canvas.getClipBounds(this.nE);
        Lxb(this.nE, this.xan);
        this.rW.mapRect(this.xan);
        Lxb(this.xan, this.nE);
        if (this.tD) {
            this.BcA.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            ld.Lxb(this.BcA, (Matrix) null, false);
        }
        this.rW.mapRect(this.BcA);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        Lxb(this.BcA, fWidth, fHeight);
        if (!rW()) {
            RectF rectF = this.BcA;
            Rect rect = this.nE;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.BcA.width());
        int iCeil2 = (int) Math.ceil(this.BcA.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        LD(iCeil, iCeil2);
        if (this.NDz) {
            this.foI.set(this.rW);
            this.foI.preScale(fWidth, fHeight);
            Matrix matrix = this.foI;
            RectF rectF2 = this.BcA;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.KPU.eraseColor(0);
            ld.Lxb(this.Ivz, this.foI, this.Sfi);
            this.rW.invert(this.Pw);
            this.Pw.mapRect(this.le, this.BcA);
            Lxb(this.le, this.nJ);
        }
        this.CG.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.KPU, this.CG, this.nJ, this.hg);
    }

    private void Lxb(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void Lxb(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void Lxb(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }
}
