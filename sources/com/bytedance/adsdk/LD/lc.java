package com.bytedance.adsdk.LD;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RawRes;
import com.google.android.material.color.utilities.Contrast;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class lc extends ImageView {
    private static final JVA<Throwable> LD = new JVA<Throwable>() { // from class: com.bytedance.adsdk.LD.lc.1
        @Override // com.bytedance.adsdk.LD.JVA
        public void Lxb(Throwable th) {
            com.bytedance.adsdk.LD.lc.lc.Lxb(th);
        }
    };
    private static final String Lxb = "lc";
    private int CSn;
    private Handler DY;
    private com.bytedance.adsdk.LD.lk.lk.lk HD;
    private final Set<Object> IeN;
    private final Runnable Ivz;
    private boolean JVA;
    private JVA<Throwable> JXs;
    private JSONArray KPU;
    private boolean NXR;
    private String OY;

    @RawRes
    private int QAg;
    private final Set<ZU> STP;
    private long Sfi;
    private NXR<ebl> VVE;
    private final JVA<Throwable> ZU;
    private int aH;
    private final Handler brP;
    private int eK;
    private final QAg ebl;
    private String foI;
    private int id;
    private ebl kqm;
    private int lc;
    private final JVA<ebl> lk;
    private com.bytedance.adsdk.ugeno.lk nBu;
    private LD nE;
    private boolean sLN;
    private int tD;
    private Lxb xan;

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.lc$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            Lxb = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface LD {
    }

    public interface Lxb {
    }

    public enum ZU {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class lk extends View.BaseSavedState {
        public static final Parcelable.Creator<lk> CREATOR = new Parcelable.Creator<lk>() { // from class: com.bytedance.adsdk.LD.lc.lk.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public lk createFromParcel(Parcel parcel) {
                return new lk(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public lk[] newArray(int i) {
                return new lk[i];
            }
        };
        String JXs;
        int LD;
        String Lxb;
        boolean ZU;
        int ebl;
        int lc;
        float lk;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.Lxb);
            parcel.writeFloat(this.lk);
            parcel.writeInt(this.ZU ? 1 : 0);
            parcel.writeString(this.JXs);
            parcel.writeInt(this.lc);
            parcel.writeInt(this.ebl);
        }

        public lk(Parcelable parcelable) {
            super(parcelable);
        }

        private lk(Parcel parcel) {
            super(parcel);
            this.Lxb = parcel.readString();
            this.lk = parcel.readFloat();
            this.ZU = parcel.readInt() == 1;
            this.JXs = parcel.readString();
            this.lc = parcel.readInt();
            this.ebl = parcel.readInt();
        }
    }

    public lc(Context context) {
        super(context);
        this.lk = new JVA<ebl>() { // from class: com.bytedance.adsdk.LD.lc.6
            @Override // com.bytedance.adsdk.LD.JVA
            public void Lxb(ebl eblVar) {
                lc.this.setComposition(eblVar);
            }
        };
        this.ZU = new JVA<Throwable>() { // from class: com.bytedance.adsdk.LD.lc.7
            @Override // com.bytedance.adsdk.LD.JVA
            public void Lxb(Throwable th) {
                if (lc.this.lc != 0) {
                    lc lcVar = lc.this;
                    lcVar.setImageResource(lcVar.lc);
                }
                (lc.this.JXs == null ? lc.LD : lc.this.JXs).Lxb(th);
            }
        };
        this.lc = 0;
        this.ebl = new QAg();
        this.JVA = false;
        this.sLN = false;
        this.NXR = true;
        this.STP = new HashSet();
        this.IeN = new HashSet();
        this.brP = new Handler(Looper.getMainLooper());
        this.tD = 0;
        this.Sfi = 0L;
        this.Ivz = new Runnable() { // from class: com.bytedance.adsdk.LD.lc.4
            @Override // java.lang.Runnable
            public void run() {
                int unused = lc.this.eK;
                int unused2 = lc.this.aH;
                if (lc.this.eK > lc.this.aH) {
                    lc.brP(lc.this);
                    com.bytedance.adsdk.LD.lk.lk.lk lkVar = lc.this.HD;
                    StringBuilder sb = new StringBuilder();
                    sb.append(lc.this.eK);
                    lkVar.Lxb(sb.toString());
                    lc.this.invalidate();
                    lc.this.IeN();
                    return;
                }
                if (lc.this.CSn < 0 || lc.this.id < 0) {
                    int unused3 = lc.this.CSn;
                    int unused4 = lc.this.id;
                } else {
                    int unused5 = lc.this.CSn;
                    lc.this.Lxb();
                    lc lcVar = lc.this;
                    lcVar.setFrame(lcVar.CSn);
                    lc.this.Lxb(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.lc.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (lc.this.getFrame() < lc.this.id - 1 || lc.this.getFrame() >= lc.this.id + 2) {
                                return;
                            }
                            int unused6 = lc.this.id;
                            lc.this.LD(this);
                            lc.this.lc();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(lc.this.foI) || (lc.this.KPU != null && lc.this.KPU.length() > 0)) && lc.this.nE != null) {
                    LD unused6 = lc.this.nE;
                    String unused7 = lc.this.foI;
                    JSONArray unused8 = lc.this.KPU;
                }
            }
        };
        OY();
    }

    public static /* synthetic */ int JXs(lc lcVar) {
        int i = lcVar.tD;
        lcVar.tD = i + 1;
        return i;
    }

    public static /* synthetic */ int brP(lc lcVar) {
        int i = lcVar.eK;
        lcVar.eK = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ebl.Lxb getGlobalConfig() {
        ebl eblVarId;
        QAg qAg = this.ebl;
        if (qAg == null || (eblVarId = qAg.id()) == null) {
            return null;
        }
        return eblVarId.JVA();
    }

    private ebl.LD getGlobalEvent() {
        ebl eblVarId;
        QAg qAg = this.ebl;
        if (qAg == null || (eblVarId = qAg.id()) == null) {
            return null;
        }
        return eblVarId.nBu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        ebl eblVarId;
        QAg qAg = this.ebl;
        if (qAg == null || (eblVarId = qAg.id()) == null) {
            return null;
        }
        return eblVarId.QAg();
    }

    private void setCompositionTask(NXR<ebl> nxr) {
        this.STP.add(ZU.SET_ANIMATION);
        kqm();
        NXR();
        this.VVE = nxr.Lxb(this.lk).lk(this.ZU);
    }

    public boolean getClipToCompositionBounds() {
        return this.ebl.lk();
    }

    public ebl getComposition() {
        return this.kqm;
    }

    public long getDuration() {
        ebl eblVar = this.kqm;
        if (eblVar != null) {
            return (long) eblVar.JXs();
        }
        return 0L;
    }

    public int getFrame() {
        return this.ebl.tD();
    }

    public String getImageAssetsFolder() {
        return this.ebl.ZU();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.ebl.JXs();
    }

    public float getMaxFrame() {
        return this.ebl.IeN();
    }

    public float getMinFrame() {
        return this.ebl.STP();
    }

    public brP getPerformanceTracker() {
        return this.ebl.OY();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getProgress() {
        return this.ebl.Ivz();
    }

    public tD getRenderMode() {
        return this.ebl.lc();
    }

    public int getRepeatCount() {
        return this.ebl.Sfi();
    }

    public int getRepeatMode() {
        return this.ebl.DY();
    }

    public float getSpeed() {
        return this.ebl.VVE();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof QAg) && ((QAg) drawable).lc() == tD.SOFTWARE) {
            this.ebl.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        QAg qAg = this.ebl;
        if (drawable2 == qAg) {
            super.invalidateDrawable(qAg);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.sLN) {
            this.ebl.JVA();
        }
        com.bytedance.adsdk.ugeno.lk lkVar = this.nBu;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VVE();
        Handler handler = this.DY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        lk();
        LD();
        com.bytedance.adsdk.ugeno.lk lkVar = this.nBu;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof lk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lk lkVar = (lk) parcelable;
        super.onRestoreInstanceState(lkVar.getSuperState());
        this.OY = lkVar.Lxb;
        Set<ZU> set = this.STP;
        ZU zu = ZU.SET_ANIMATION;
        if (!set.contains(zu) && !TextUtils.isEmpty(this.OY)) {
            setAnimation(this.OY);
        }
        this.QAg = lkVar.LD;
        if (!this.STP.contains(zu) && (i = this.QAg) != 0) {
            setAnimation(i);
        }
        if (!this.STP.contains(ZU.SET_PROGRESS)) {
            Lxb(lkVar.lk, false);
        }
        if (!this.STP.contains(ZU.PLAY_OPTION) && lkVar.ZU) {
            Lxb();
        }
        if (!this.STP.contains(ZU.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lkVar.JXs);
        }
        if (!this.STP.contains(ZU.SET_REPEAT_MODE)) {
            setRepeatMode(lkVar.lc);
        }
        if (this.STP.contains(ZU.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lkVar.ebl);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        lk lkVar = new lk(super.onSaveInstanceState());
        lkVar.Lxb = this.OY;
        lkVar.LD = this.QAg;
        lkVar.lk = this.ebl.Ivz();
        lkVar.ZU = this.ebl.eK();
        lkVar.JXs = this.ebl.ZU();
        lkVar.lc = this.ebl.DY();
        lkVar.ebl = this.ebl.Sfi();
        return lkVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.LD.lk.lk.Lxb Lxb2 = Lxb(motionEvent);
        if (Lxb2 == null) {
            if (getGlobalConfig() == null || getGlobalConfig().Lxb != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strQAg = Lxb2.QAg();
        if (Lxb2 instanceof com.bytedance.adsdk.LD.lk.lk.LD) {
            if (getGlobalConfig() == null || getGlobalConfig().Lxb != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strQAg != null && strQAg.startsWith("CSJCLOSE")) {
            VVE();
        }
        nBu nbuLxb = Lxb(Lxb2.JXs());
        if (nbuLxb != null && motionEvent.getAction() == 1) {
            Lxb(strQAg, nbuLxb.JXs(), nbuLxb.ebl());
            int[][] iArrLc = nbuLxb.lc();
            if (iArrLc != null) {
                Lxb(iArrLc);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().LD) != null) {
                Lxb(iArr);
            }
        }
        if (strQAg == null || !strQAg.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(@RawRes int i) {
        this.QAg = i;
        this.OY = null;
        setCompositionTask(Lxb(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        Lxb(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.NXR ? OY.Lxb(getContext(), str) : OY.Lxb(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.ebl.JXs(z);
    }

    public void setCacheComposition(boolean z) {
        this.NXR = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.ebl.Lxb(z);
    }

    public void setComposition(ebl eblVar) {
        if (JXs.Lxb) {
            "Set Composition \n".concat(String.valueOf(eblVar));
        }
        this.ebl.setCallback(this);
        this.kqm = eblVar;
        this.JVA = true;
        boolean zLxb = this.ebl.Lxb(eblVar, getContext().getApplicationContext());
        this.JVA = false;
        if (getDrawable() != this.ebl || zLxb) {
            if (!zLxb) {
                brP();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.IeN.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.ebl.ebl(str);
    }

    public void setFailureListener(JVA<Throwable> jva) {
        this.JXs = jva;
    }

    public void setFallbackResource(int i) {
        this.lc = i;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.LD.lk lkVar) {
        this.ebl.Lxb(lkVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.ebl.Lxb(map);
    }

    public void setFrame(int i) {
        this.ebl.lk(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.ebl.ebl(z);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.LD.ZU zu) {
        this.ebl.Lxb(zu);
    }

    public void setImageAssetsFolder(String str) {
        this.ebl.Lxb(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        NXR();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        NXR();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        NXR();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(Lxb lxb) {
        this.xan = lxb;
    }

    public void setLottieClicklistener(LD ld) {
        this.nE = ld;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.ebl.LD(z);
    }

    public void setMaxFrame(int i) {
        this.ebl.LD(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        this.ebl.LD(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.ebl.ZU(str);
    }

    public void setMinFrame(int i) {
        this.ebl.Lxb(i);
    }

    public void setMinProgress(float f) {
        this.ebl.Lxb(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.ebl.ZU(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.ebl.lk(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        Lxb(f, true);
    }

    public void setRenderMode(tD tDVar) {
        this.ebl.Lxb(tDVar);
    }

    public void setRepeatCount(int i) {
        this.STP.add(ZU.SET_REPEAT_COUNT);
        this.ebl.JXs(i);
    }

    public void setRepeatMode(int i) {
        this.STP.add(ZU.SET_REPEAT_MODE);
        this.ebl.ZU(i);
    }

    public void setSafeMode(boolean z) {
        this.ebl.lc(z);
    }

    public void setSpeed(float f) {
        this.ebl.lk(f);
    }

    public void setTextDelegate(DY dy) {
        this.ebl.Lxb(dy);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.ebl.OY(z);
    }

    public void setView(View view) {
        this.ebl.Lxb(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        QAg qAg;
        if (!this.JVA && drawable == (qAg = this.ebl) && qAg.HD()) {
            lc();
        } else if (!this.JVA && (drawable instanceof QAg)) {
            QAg qAg2 = (QAg) drawable;
            if (qAg2.HD()) {
                qAg2.KPU();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IeN() {
        this.brP.postDelayed(this.Ivz, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void JVA() {
        final ebl.Lxb globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.JXs <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.lc) && globalConfig.ebl == null) {
            return;
        }
        int maxFrame = globalConfig.JXs;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        Lxb(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.lc.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                lc.this.LD(this);
                if (lc.this.nE != null) {
                    LD unused = lc.this.nE;
                }
            }
        });
    }

    private void LD(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.ebl.getBounds().width();
        float fHeight = this.ebl.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.Lxb[getScaleType().ordinal()];
        if (i == 1) {
            Lxb(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            LD(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            lk(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            ZU(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void NXR() {
        NXR<ebl> nxr = this.VVE;
        if (nxr != null) {
            nxr.LD(this.lk);
            this.VVE.ZU(this.ZU);
        }
    }

    private void OY() {
        setSaveEnabled(false);
        this.NXR = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        Lxb(0.0f, false);
        Lxb(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.ebl.Lxb(Boolean.valueOf(com.bytedance.adsdk.LD.lc.lc.Lxb(getContext()) != 0.0f));
        QAg();
        nBu();
        sLN();
    }

    private void QAg() {
        Lxb(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.LD.lc.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                lc.this.LD(this);
                lc.this.STP();
                lc.this.JVA();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void STP() {
        QAg qAg;
        int i;
        int i2;
        final int i3;
        com.bytedance.adsdk.LD.lk.lk.lk lkVarLk;
        if (this.kqm == null || (qAg = this.ebl) == null) {
            return;
        }
        DY dyAH = qAg.aH();
        ebl.lk lkVarOY = this.kqm.OY();
        if (lkVarOY == null || dyAH == null) {
            return;
        }
        final int i4 = lkVarOY.Lxb;
        if (i4 < 0) {
            "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4));
            return;
        }
        int[] iArr = lkVarOY.JXs;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String strLxb = dyAH.Lxb(lkVarOY.lk);
        String strLxb2 = dyAH.Lxb(lkVarOY.ZU);
        try {
            i3 = Integer.parseInt(strLxb);
            try {
                i5 = Integer.parseInt(strLxb2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        if (TextUtils.isEmpty(lkVarOY.LD) || (lkVarLk = lk(lkVarOY.LD)) == null) {
            return;
        }
        this.foI = lkVarOY.lc;
        this.KPU = lkVarOY.ebl;
        this.HD = lkVarLk;
        this.eK = i3;
        this.aH = i3 - i5;
        this.CSn = i2;
        this.id = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.eK);
        lkVarLk.Lxb(sb.toString());
        Lxb(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.lc.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (lc.this.getFrame() < i4 - 1 || lc.this.getFrame() >= i4 + 2) {
                    return;
                }
                lc.this.getFrame();
                lc.this.LD(this);
                if (i3 >= 0 && i5 >= 0) {
                    lc.this.IeN();
                }
                lc.this.lc();
            }
        });
    }

    private void VVE() {
        this.brP.removeCallbacksAndMessages(null);
    }

    private void ZU(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    private void brP() {
        boolean zZU = ZU();
        setImageDrawable(null);
        setImageDrawable(this.ebl);
        if (zZU) {
            this.ebl.NXR();
        }
    }

    private void kqm() {
        this.kqm = null;
        this.ebl.nBu();
    }

    private void lk(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void nBu() {
        Lxb(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.lc.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                lc.JXs(lc.this);
                ebl.Lxb globalConfig = lc.this.getGlobalConfig();
                if (globalConfig != null && (i = globalConfig.ZU) > 0 && i > lc.this.tD) {
                    lc.this.STP();
                    lc.this.Lxb();
                    lc.this.setProgress(0.0f);
                } else {
                    lc.this.LD(this);
                    if (lc.this.xan != null) {
                        Lxb unused = lc.this.xan;
                    }
                }
            }
        });
    }

    private void sLN() {
        Lxb(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.LD.lc.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                DY dyAH;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - lc.this.Sfi;
                lc.this.LD(this);
                String playDelayedELExpressTimeS = lc.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (dyAH = lc.this.ebl.aH()) != null) {
                    try {
                        int i = Integer.parseInt(dyAH.Lxb(playDelayedELExpressTimeS)) * 1000;
                        if (lc.this.Sfi > 0) {
                            long jElapsedRealtime2 = (lc.this.Sfi + ((long) i)) - SystemClock.elapsedRealtime();
                            "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2));
                            if (jElapsedRealtime2 > 0) {
                                lc.this.lc();
                                lc.this.setVisibility(8);
                                if (lc.this.DY == null) {
                                    lc.this.DY = new Handler(Looper.getMainLooper());
                                }
                                lc.this.DY.removeCallbacksAndMessages(null);
                                lc.this.DY.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.LD.lc.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        lc.this.setVisibility(0);
                                        lc.this.Lxb();
                                        lc.this.Lxb(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                lc.this.Lxb(jElapsedRealtime);
            }
        });
    }

    @MainThread
    public void JXs() {
        this.STP.add(ZU.PLAY_OPTION);
        this.ebl.foI();
    }

    @MainThread
    public void lc() {
        this.sLN = false;
        this.ebl.KPU();
    }

    public void setMaxFrame(String str) {
        this.ebl.lk(str);
    }

    public void setMinFrame(String str) {
        this.ebl.LD(str);
    }

    private com.bytedance.adsdk.LD.lk.lk.lk lk(String str) {
        com.bytedance.adsdk.LD.lk.lk.LD LD2;
        QAg qAg = this.ebl;
        if (qAg == null || (LD2 = qAg.LD()) == null) {
            return null;
        }
        return Lxb(LD2, str);
    }

    public void Lxb(com.bytedance.adsdk.ugeno.lk lkVar) {
        this.nBu = lkVar;
    }

    public void setAnimation(String str) {
        this.OY = str;
        this.QAg = 0;
        setCompositionTask(LD(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(long j) {
        Map<String, Object> map;
        ebl.Lxb globalConfig = getGlobalConfig();
        if (this.xan != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.LD) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.LD);
        }
    }

    public void lk() {
        this.ebl.brP();
    }

    public boolean ZU() {
        return this.ebl.HD();
    }

    private nBu Lxb(String str) {
        QAg qAg;
        ebl eblVarId;
        Map<String, nBu> mapVVE;
        if (TextUtils.isEmpty(str) || (qAg = this.ebl) == null || (eblVarId = qAg.id()) == null || (mapVVE = eblVarId.VVE()) == null) {
            return null;
        }
        return mapVVE.get(str);
    }

    private void LD(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    private void Lxb(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i));
            VVE();
            Lxb();
            setFrame(i);
            Lxb(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.LD.lc.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (lc.this.getFrame() < i2 - 1 || lc.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    lc.this.getFrame();
                    lc.this.LD(this);
                    lc.this.lc();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private NXR<ebl> LD(final String str) {
        if (isInEditMode()) {
            return new NXR<>(new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.lc.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                public sLN<ebl> call() throws Exception {
                    return lc.this.NXR ? OY.lk(lc.this.getContext(), str) : OY.lk(lc.this.getContext(), str, null);
                }
            }, true);
        }
        return this.NXR ? OY.LD(getContext(), str) : OY.LD(getContext(), str, (String) null);
    }

    public void LD(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ebl.LD(animatorUpdateListener);
    }

    public void LD() {
        this.ebl.kqm();
    }

    private void Lxb(String str, String str2, JSONArray jSONArray) {
        ebl.LD globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.Lxb;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.lk;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void LD(Animator.AnimatorListener animatorListener) {
        this.ebl.LD(animatorListener);
    }

    private com.bytedance.adsdk.LD.lk.lk.Lxb Lxb(MotionEvent motionEvent) {
        com.bytedance.adsdk.LD.lk.lk.LD LD2;
        QAg qAg = this.ebl;
        if (qAg == null || (LD2 = qAg.LD()) == null) {
            return null;
        }
        return Lxb(LD2, motionEvent);
    }

    private com.bytedance.adsdk.LD.lk.lk.Lxb Lxb(com.bytedance.adsdk.LD.lk.lk.LD ld, MotionEvent motionEvent) {
        com.bytedance.adsdk.LD.lk.lk.Lxb Lxb2;
        for (com.bytedance.adsdk.LD.lk.lk.Lxb lxb : ld.sLN()) {
            if (lxb instanceof com.bytedance.adsdk.LD.lk.lk.LD) {
                if (lxb.OY() && lxb.lc() > 0.0f) {
                    RectF rectF = new RectF();
                    lxb.Lxb(rectF, lxb.ZU(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (Lxb2 = Lxb((com.bytedance.adsdk.LD.lk.lk.LD) lxb, motionEvent)) != null) {
                        return Lxb2;
                    }
                }
            } else if (lxb.OY() && lxb.lc() > 0.0f) {
                RectF rectF2 = new RectF();
                QAg qAg = this.ebl;
                if (qAg != null && qAg.ebl()) {
                    lxb.Lxb(rectF2, lxb.ZU(), true);
                    RectF rectFNE = this.ebl.nE();
                    if (rectFNE != null) {
                        Lxb(rectF2, rectFNE);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    lxb.Lxb(rectF3, lxb.ZU(), true);
                    LD(rectF2, rectF3);
                }
                if (Lxb(motionEvent, rectF2)) {
                    return lxb;
                }
            }
        }
        return null;
    }

    private boolean Lxb(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void Lxb(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.Lxb[getScaleType().ordinal()];
        if (i == 1) {
            Lxb(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            LD(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            lk(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            ZU(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void Lxb(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    public void Lxb(boolean z, Context context) {
        this.ebl.Lxb(z, context);
    }

    private NXR<ebl> Lxb(@RawRes final int i) {
        if (isInEditMode()) {
            return new NXR<>(new Callable<sLN<ebl>>() { // from class: com.bytedance.adsdk.LD.lc.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                public sLN<ebl> call() throws Exception {
                    return lc.this.NXR ? OY.LD(lc.this.getContext(), i) : OY.LD(lc.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.NXR ? OY.Lxb(getContext(), i) : OY.Lxb(getContext(), i, (String) null);
    }

    public void Lxb(String str, String str2) {
        Lxb(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void Lxb(InputStream inputStream, String str) {
        setCompositionTask(OY.Lxb(inputStream, str));
    }

    private com.bytedance.adsdk.LD.lk.lk.lk Lxb(com.bytedance.adsdk.LD.lk.lk.LD ld, String str) {
        for (com.bytedance.adsdk.LD.lk.lk.Lxb lxb : ld.sLN()) {
            if (lxb instanceof com.bytedance.adsdk.LD.lk.lk.LD) {
                com.bytedance.adsdk.LD.lk.lk.lk lkVarLxb = Lxb((com.bytedance.adsdk.LD.lk.lk.LD) lxb, str);
                if (lkVarLxb != null) {
                    return lkVarLxb;
                }
            } else if (TextUtils.equals(str, lxb.QAg()) && (lxb instanceof com.bytedance.adsdk.LD.lk.lk.lk)) {
                return (com.bytedance.adsdk.LD.lk.lk.lk) lxb;
            }
        }
        return null;
    }

    @MainThread
    public void Lxb() {
        if (this.Sfi == 0) {
            this.Sfi = SystemClock.elapsedRealtime();
        }
        this.STP.add(ZU.PLAY_OPTION);
        this.ebl.JVA();
    }

    public void Lxb(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ebl.Lxb(animatorUpdateListener);
    }

    public void Lxb(Animator.AnimatorListener animatorListener) {
        this.ebl.Lxb(animatorListener);
    }

    @Deprecated
    public void Lxb(boolean z) {
        this.ebl.JXs(z ? -1 : 0);
    }

    public Bitmap Lxb(String str, Bitmap bitmap) {
        return this.ebl.Lxb(str, bitmap);
    }

    private void Lxb(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f, boolean z) {
        if (z) {
            this.STP.add(ZU.SET_PROGRESS);
        }
        this.ebl.ZU(f);
    }
}
