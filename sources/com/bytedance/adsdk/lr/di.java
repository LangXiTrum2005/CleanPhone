package com.bytedance.adsdk.lr;

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
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ImageView {
    private static final sf<Throwable> lr = new sf<Throwable>() { // from class: com.bytedance.adsdk.lr.di.1
        @Override // com.bytedance.adsdk.lr.sf
        public void ri(Throwable th) {
            com.bytedance.adsdk.lr.di.di.ri(th);
        }
    };
    private static final String ri = "di";
    private long ac;
    private final Set<ka> aw;
    private int ay;
    private final Set<Object> bgr;
    private final Handler bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f17987co;
    private int di;
    private lr dw;
    private sf<Throwable> fi;
    private int fr;
    private JSONArray igq;
    private com.bytedance.adsdk.lr.ik.ik.ik ihz;
    private final sf<xha> ik;
    private int jbs;
    private final sf<Throwable> ka;
    private String mj;
    private int nr;
    private ri ory;
    private boolean qt;
    private boolean sf;
    private xha slm;
    private String su;
    private Handler tan;
    private int uq;
    private aw<xha> vr;
    private int wjv;
    private final jbs xha;
    private final Runnable zf;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ri = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ik extends View.BaseSavedState {
        public static final Parcelable.Creator<ik> CREATOR = new Parcelable.Creator<ik>() { // from class: com.bytedance.adsdk.lr.di.ik.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ik createFromParcel(Parcel parcel) {
                return new ik(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ik[] newArray(int i) {
                return new ik[i];
            }
        };
        int di;
        String fi;
        float ik;
        boolean ka;
        int lr;
        String ri;
        int xha;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.ri);
            parcel.writeFloat(this.ik);
            parcel.writeInt(this.ka ? 1 : 0);
            parcel.writeString(this.fi);
            parcel.writeInt(this.di);
            parcel.writeInt(this.xha);
        }

        public ik(Parcelable parcelable) {
            super(parcelable);
        }

        private ik(Parcel parcel) {
            super(parcel);
            this.ri = parcel.readString();
            this.ik = parcel.readFloat();
            this.ka = parcel.readInt() == 1;
            this.fi = parcel.readString();
            this.di = parcel.readInt();
            this.xha = parcel.readInt();
        }
    }

    public enum ka {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface lr {
    }

    public interface ri {
    }

    public di(Context context) {
        super(context);
        this.ik = new sf<xha>() { // from class: com.bytedance.adsdk.lr.di.6
            @Override // com.bytedance.adsdk.lr.sf
            public void ri(xha xhaVar) {
                di.this.setComposition(xhaVar);
            }
        };
        this.ka = new sf<Throwable>() { // from class: com.bytedance.adsdk.lr.di.7
            @Override // com.bytedance.adsdk.lr.sf
            public void ri(Throwable th) {
                if (di.this.di != 0) {
                    di diVar = di.this;
                    diVar.setImageResource(diVar.di);
                }
                (di.this.fi == null ? di.lr : di.this.fi).ri(th);
            }
        };
        this.di = 0;
        this.xha = new jbs();
        this.qt = false;
        this.sf = false;
        this.f17987co = true;
        this.aw = new HashSet();
        this.bgr = new HashSet();
        this.bu = new Handler(Looper.getMainLooper());
        this.nr = 0;
        this.ac = 0L;
        this.zf = new Runnable() { // from class: com.bytedance.adsdk.lr.di.4
            @Override // java.lang.Runnable
            public void run() {
                int unused = di.this.uq;
                int unused2 = di.this.wjv;
                if (di.this.uq > di.this.wjv) {
                    di.nr(di.this);
                    com.bytedance.adsdk.lr.ik.ik.ik ikVar = di.this.ihz;
                    StringBuilder sb = new StringBuilder();
                    sb.append(di.this.uq);
                    ikVar.ri(sb.toString());
                    di.this.invalidate();
                    di.this.vr();
                    return;
                }
                if (di.this.ay < 0 || di.this.fr < 0) {
                    int unused3 = di.this.ay;
                    int unused4 = di.this.fr;
                } else {
                    int unused5 = di.this.ay;
                    di.this.ri();
                    di diVar = di.this;
                    diVar.setFrame(diVar.ay);
                    di.this.ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (di.this.getFrame() < di.this.fr - 1 || di.this.getFrame() >= di.this.fr + 2) {
                                return;
                            }
                            int unused6 = di.this.fr;
                            di.this.lr(this);
                            di.this.di();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(di.this.su) || (di.this.igq != null && di.this.igq.length() > 0)) && di.this.dw != null) {
                    lr unused6 = di.this.dw;
                    String unused7 = di.this.su;
                    JSONArray unused8 = di.this.igq;
                }
            }
        };
        mj();
    }

    public static /* synthetic */ int fi(di diVar) {
        int i = diVar.nr;
        diVar.nr = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xha.ri getGlobalConfig() {
        xha xhaVarSu;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarSu = jbsVar.su()) == null) {
            return null;
        }
        return xhaVarSu.sf();
    }

    private xha.lr getGlobalEvent() {
        xha xhaVarSu;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarSu = jbsVar.su()) == null) {
            return null;
        }
        return xhaVarSu.qt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        xha xhaVarSu;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarSu = jbsVar.su()) == null) {
            return null;
        }
        return xhaVarSu.jbs();
    }

    public static /* synthetic */ int nr(di diVar) {
        int i = diVar.uq;
        diVar.uq = i - 1;
        return i;
    }

    private void setCompositionTask(aw<xha> awVar) {
        this.aw.add(ka.SET_ANIMATION);
        bu();
        aw();
        this.vr = awVar.ri(this.ik).ik(this.ka);
    }

    public boolean getClipToCompositionBounds() {
        return this.xha.ik();
    }

    public xha getComposition() {
        return this.slm;
    }

    public long getDuration() {
        xha xhaVar = this.slm;
        if (xhaVar != null) {
            return (long) xhaVar.fi();
        }
        return 0L;
    }

    public int getFrame() {
        return this.xha.tan();
    }

    public String getImageAssetsFolder() {
        return this.xha.ka();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.xha.fi();
    }

    public float getMaxFrame() {
        return this.xha.vr();
    }

    public float getMinFrame() {
        return this.xha.bgr();
    }

    public nr getPerformanceTracker() {
        return this.xha.mj();
    }

    public float getProgress() {
        return this.xha.dw();
    }

    public tan getRenderMode() {
        return this.xha.di();
    }

    public int getRepeatCount() {
        return this.xha.ihz();
    }

    public int getRepeatMode() {
        return this.xha.ac();
    }

    public float getSpeed() {
        return this.xha.slm();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof jbs) && ((jbs) drawable).di() == tan.SOFTWARE) {
            this.xha.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        jbs jbsVar = this.xha;
        if (drawable2 == jbsVar) {
            super.invalidateDrawable(jbsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.sf) {
            return;
        }
        this.xha.sf();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        slm();
        Handler handler = this.tan;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ik();
        lr();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof ik)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ik ikVar = (ik) parcelable;
        super.onRestoreInstanceState(ikVar.getSuperState());
        this.mj = ikVar.ri;
        Set<ka> set = this.aw;
        ka kaVar = ka.SET_ANIMATION;
        if (!set.contains(kaVar) && !TextUtils.isEmpty(this.mj)) {
            setAnimation(this.mj);
        }
        this.jbs = ikVar.lr;
        if (!this.aw.contains(kaVar) && (i = this.jbs) != 0) {
            setAnimation(i);
        }
        if (!this.aw.contains(ka.SET_PROGRESS)) {
            ri(ikVar.ik, false);
        }
        if (!this.aw.contains(ka.PLAY_OPTION) && ikVar.ka) {
            ri();
        }
        if (!this.aw.contains(ka.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(ikVar.fi);
        }
        if (!this.aw.contains(ka.SET_REPEAT_MODE)) {
            setRepeatMode(ikVar.di);
        }
        if (this.aw.contains(ka.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(ikVar.xha);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ik ikVar = new ik(super.onSaveInstanceState());
        ikVar.ri = this.mj;
        ikVar.lr = this.jbs;
        ikVar.ik = this.xha.dw();
        ikVar.ka = this.xha.wjv();
        ikVar.fi = this.xha.ka();
        ikVar.di = this.xha.ac();
        ikVar.xha = this.xha.ihz();
        return ikVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.lr.ik.ik.ri riVarRi = ri(motionEvent);
        if (riVarRi == null) {
            if (getGlobalConfig() == null || getGlobalConfig().ri != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strJbs = riVarRi.jbs();
        if (riVarRi instanceof com.bytedance.adsdk.lr.ik.ik.lr) {
            if (getGlobalConfig() == null || getGlobalConfig().ri != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strJbs != null && strJbs.startsWith("CSJCLOSE")) {
            slm();
        }
        qt qtVarRi = ri(riVarRi.fi());
        if (qtVarRi != null && motionEvent.getAction() == 1) {
            ri(strJbs, qtVarRi.fi(), qtVarRi.xha());
            int[][] iArrDi = qtVarRi.di();
            if (iArrDi != null) {
                ri(iArrDi);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().lr) != null) {
                ri(iArr);
            }
        }
        if (strJbs == null || !strJbs.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i) {
        this.jbs = i;
        this.mj = null;
        setCompositionTask(ri(i));
    }

    public void setAnimationFromJson(String str) {
        ri(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f17987co ? mj.ri(getContext(), str) : mj.ri(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.xha.fi(z);
    }

    public void setCacheComposition(boolean z) {
        this.f17987co = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.xha.ri(z);
    }

    public void setComposition(xha xhaVar) {
        if (fi.ri) {
            "Set Composition \n".concat(String.valueOf(xhaVar));
        }
        this.xha.setCallback(this);
        this.slm = xhaVar;
        this.qt = true;
        boolean zRi = this.xha.ri(xhaVar, getContext().getApplicationContext());
        this.qt = false;
        if (getDrawable() != this.xha || zRi) {
            if (!zRi) {
                nr();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.bgr.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.xha.xha(str);
    }

    public void setFailureListener(sf<Throwable> sfVar) {
        this.fi = sfVar;
    }

    public void setFallbackResource(int i) {
        this.di = i;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.lr.ik ikVar) {
        this.xha.ri(ikVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.xha.ri(map);
    }

    public void setFrame(int i) {
        this.xha.ik(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.xha.xha(z);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.lr.ka kaVar) {
        this.xha.ri(kaVar);
    }

    public void setImageAssetsFolder(String str) {
        this.xha.ri(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        aw();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        aw();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        aw();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(ri riVar) {
        this.ory = riVar;
    }

    public void setLottieClicklistener(lr lrVar) {
        this.dw = lrVar;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.xha.lr(z);
    }

    public void setMaxFrame(int i) {
        this.xha.lr(i);
    }

    public void setMaxProgress(float f) {
        this.xha.lr(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.xha.ka(str);
    }

    public void setMinFrame(int i) {
        this.xha.ri(i);
    }

    public void setMinProgress(float f) {
        this.xha.ri(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.xha.ka(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.xha.ik(z);
    }

    public void setProgress(float f) {
        ri(f, true);
    }

    public void setRenderMode(tan tanVar) {
        this.xha.ri(tanVar);
    }

    public void setRepeatCount(int i) {
        this.aw.add(ka.SET_REPEAT_COUNT);
        this.xha.fi(i);
    }

    public void setRepeatMode(int i) {
        this.aw.add(ka.SET_REPEAT_MODE);
        this.xha.ka(i);
    }

    public void setSafeMode(boolean z) {
        this.xha.di(z);
    }

    public void setSpeed(float f) {
        this.xha.ik(f);
    }

    public void setTextDelegate(ac acVar) {
        this.xha.ri(acVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.xha.mj(z);
    }

    public void setView(View view) {
        this.xha.ri(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        jbs jbsVar;
        if (!this.qt && drawable == (jbsVar = this.xha) && jbsVar.uq()) {
            di();
        } else if (!this.qt && (drawable instanceof jbs)) {
            jbs jbsVar2 = (jbs) drawable;
            if (jbsVar2.uq()) {
                jbsVar2.zf();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void aw() {
        aw<xha> awVar = this.vr;
        if (awVar != null) {
            awVar.lr(this.ik);
            this.vr.ka(this.ka);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        jbs jbsVar;
        int i;
        int i2;
        final int i3;
        com.bytedance.adsdk.lr.ik.ik.ik ikVarIk;
        if (this.slm == null || (jbsVar = this.xha) == null) {
            return;
        }
        ac acVarAy = jbsVar.ay();
        xha.ik ikVarMj = this.slm.mj();
        if (ikVarMj == null || acVarAy == null) {
            return;
        }
        final int i4 = ikVarMj.ri;
        if (i4 < 0) {
            "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4));
            return;
        }
        int[] iArr = ikVarMj.fi;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String strRi = acVarAy.ri(ikVarMj.ik);
        String strRi2 = acVarAy.ri(ikVarMj.ka);
        try {
            i3 = Integer.parseInt(strRi);
            try {
                i5 = Integer.parseInt(strRi2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        if (TextUtils.isEmpty(ikVarMj.lr) || (ikVarIk = ik(ikVarMj.lr)) == null) {
            return;
        }
        this.su = ikVarMj.di;
        this.igq = ikVarMj.xha;
        this.ihz = ikVarIk;
        this.uq = i3;
        this.wjv = i3 - i5;
        this.ay = i2;
        this.fr = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.uq);
        ikVarIk.ri(sb.toString());
        ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (di.this.getFrame() < i4 - 1 || di.this.getFrame() >= i4 + 2) {
                    return;
                }
                di.this.getFrame();
                di.this.lr(this);
                if (i3 >= 0 && i5 >= 0) {
                    di.this.vr();
                }
                di.this.di();
            }
        });
    }

    private void bu() {
        this.slm = null;
        this.xha.qt();
    }

    private void co() {
        ri(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.lr.di.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ac acVarAy;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - di.this.ac;
                di.this.lr(this);
                String playDelayedELExpressTimeS = di.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (acVarAy = di.this.xha.ay()) != null) {
                    try {
                        int i = Integer.parseInt(acVarAy.ri(playDelayedELExpressTimeS)) * 1000;
                        if (di.this.ac > 0) {
                            long jElapsedRealtime2 = (di.this.ac + ((long) i)) - SystemClock.elapsedRealtime();
                            "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2));
                            if (jElapsedRealtime2 > 0) {
                                di.this.di();
                                di.this.setVisibility(8);
                                if (di.this.tan == null) {
                                    di.this.tan = new Handler(Looper.getMainLooper());
                                }
                                di.this.tan.removeCallbacksAndMessages(null);
                                di.this.tan.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.lr.di.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        di.this.setVisibility(0);
                                        di.this.ri();
                                        di.this.ri(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                di.this.ri(jElapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void ik(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void jbs() {
        ri(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.lr.di.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                di.this.lr(this);
                di.this.bgr();
                di.this.sf();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void ka(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void lr(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.xha.getBounds().width();
        float fHeight = this.xha.getBounds().height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.ri[getScaleType().ordinal()];
        if (i == 1) {
            ri(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            lr(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            ik(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            ka(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void mj() {
        setSaveEnabled(false);
        this.f17987co = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        ri(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.xha.ri(Boolean.valueOf(com.bytedance.adsdk.lr.di.di.ri(getContext()) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        jbs();
        qt();
        co();
    }

    private void nr() {
        boolean zKa = ka();
        setImageDrawable(null);
        setImageDrawable(this.xha);
        if (zKa) {
            this.xha.aw();
        }
    }

    private void qt() {
        ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                di.fi(di.this);
                xha.ri globalConfig = di.this.getGlobalConfig();
                if (globalConfig != null && (i = globalConfig.ka) > 0 && i > di.this.nr) {
                    di.this.bgr();
                    di.this.ri();
                    di.this.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    di.this.lr(this);
                    if (di.this.ory != null) {
                        ri unused = di.this.ory;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        final xha.ri globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.fi <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.di) && globalConfig.xha == null) {
            return;
        }
        int maxFrame = globalConfig.fi;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                di.this.lr(this);
                if (di.this.dw != null) {
                    lr unused = di.this.dw;
                }
            }
        });
    }

    private void slm() {
        this.bu.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vr() {
        this.bu.postDelayed(this.zf, 1000L);
    }

    public void di() {
        this.sf = false;
        this.xha.zf();
    }

    public void fi() {
        this.aw.add(ka.PLAY_OPTION);
        this.xha.igq();
    }

    public void setMaxFrame(String str) {
        this.xha.ik(str);
    }

    public void setMinFrame(String str) {
        this.xha.lr(str);
    }

    private com.bytedance.adsdk.lr.ik.ik.ik ik(String str) {
        com.bytedance.adsdk.lr.ik.ik.lr lrVarLr;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (lrVarLr = jbsVar.lr()) == null) {
            return null;
        }
        return ri(lrVarLr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(long j) {
        Map<String, Object> map;
        xha.ri globalConfig = getGlobalConfig();
        if (this.ory != null) {
            HashMap map2 = new HashMap();
            map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.lr) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.lr);
        }
    }

    public void setAnimation(String str) {
        this.mj = str;
        this.jbs = 0;
        setCompositionTask(lr(str));
    }

    public void ik() {
        this.xha.nr();
    }

    private qt ri(String str) {
        jbs jbsVar;
        xha xhaVarSu;
        Map<String, qt> mapSlm;
        if (TextUtils.isEmpty(str) || (jbsVar = this.xha) == null || (xhaVarSu = jbsVar.su()) == null || (mapSlm = xhaVarSu.slm()) == null) {
            return null;
        }
        return mapSlm.get(str);
    }

    public boolean ka() {
        return this.xha.uq();
    }

    private void lr(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void ri(int[][] iArr) {
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
            slm();
            ri();
            setFrame(i);
            ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (di.this.getFrame() < i2 - 1 || di.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    di.this.getFrame();
                    di.this.lr(this);
                    di.this.di();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private aw<xha> lr(final String str) {
        if (isInEditMode()) {
            return new aw<>(new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.di.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public co<xha> call() throws Exception {
                    return di.this.f17987co ? mj.ik(di.this.getContext(), str) : mj.ik(di.this.getContext(), str, null);
                }
            }, true);
        }
        return this.f17987co ? mj.lr(getContext(), str) : mj.lr(getContext(), str, (String) null);
    }

    public void lr(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xha.lr(animatorUpdateListener);
    }

    private void ri(String str, String str2, JSONArray jSONArray) {
        xha.lr globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.ri;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.ik;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void lr() {
        this.xha.bu();
    }

    public void lr(Animator.AnimatorListener animatorListener) {
        this.xha.lr(animatorListener);
    }

    private com.bytedance.adsdk.lr.ik.ik.ri ri(MotionEvent motionEvent) {
        com.bytedance.adsdk.lr.ik.ik.lr lrVarLr;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (lrVarLr = jbsVar.lr()) == null) {
            return null;
        }
        return ri(lrVarLr, motionEvent);
    }

    private com.bytedance.adsdk.lr.ik.ik.ri ri(com.bytedance.adsdk.lr.ik.ik.lr lrVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.lr.ik.ik.ri riVarRi;
        for (com.bytedance.adsdk.lr.ik.ik.ri riVar : lrVar.co()) {
            if (riVar instanceof com.bytedance.adsdk.lr.ik.ik.lr) {
                if (riVar.mj() && riVar.di() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF = new RectF();
                    riVar.ri(rectF, riVar.ka(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (riVarRi = ri((com.bytedance.adsdk.lr.ik.ik.lr) riVar, motionEvent)) != null) {
                        return riVarRi;
                    }
                }
            } else if (riVar.mj() && riVar.di() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RectF rectF2 = new RectF();
                jbs jbsVar = this.xha;
                if (jbsVar != null && jbsVar.xha()) {
                    riVar.ri(rectF2, riVar.ka(), true);
                    RectF rectFOry = this.xha.ory();
                    if (rectFOry != null) {
                        ri(rectF2, rectFOry);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    riVar.ri(rectF3, riVar.ka(), true);
                    lr(rectF2, rectF3);
                }
                if (ri(motionEvent, rectF2)) {
                    return riVar;
                }
            }
        }
        return null;
    }

    private boolean ri(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void ri(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.ri[getScaleType().ordinal()];
        if (i == 1) {
            ri(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            lr(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            ik(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            ka(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void ri(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    public void ri(boolean z, Context context) {
        this.xha.ri(z, context);
    }

    private aw<xha> ri(final int i) {
        if (isInEditMode()) {
            return new aw<>(new Callable<co<xha>>() { // from class: com.bytedance.adsdk.lr.di.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public co<xha> call() throws Exception {
                    return di.this.f17987co ? mj.lr(di.this.getContext(), i) : mj.lr(di.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.f17987co ? mj.ri(getContext(), i) : mj.ri(getContext(), i, (String) null);
    }

    public void ri(String str, String str2) {
        ri(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void ri(InputStream inputStream, String str) {
        setCompositionTask(mj.ri(inputStream, str));
    }

    private com.bytedance.adsdk.lr.ik.ik.ik ri(com.bytedance.adsdk.lr.ik.ik.lr lrVar, String str) {
        for (com.bytedance.adsdk.lr.ik.ik.ri riVar : lrVar.co()) {
            if (riVar instanceof com.bytedance.adsdk.lr.ik.ik.lr) {
                com.bytedance.adsdk.lr.ik.ik.ik ikVarRi = ri((com.bytedance.adsdk.lr.ik.ik.lr) riVar, str);
                if (ikVarRi != null) {
                    return ikVarRi;
                }
            } else if (TextUtils.equals(str, riVar.jbs()) && (riVar instanceof com.bytedance.adsdk.lr.ik.ik.ik)) {
                return (com.bytedance.adsdk.lr.ik.ik.ik) riVar;
            }
        }
        return null;
    }

    public void ri() {
        if (this.ac == 0) {
            this.ac = SystemClock.elapsedRealtime();
        }
        this.aw.add(ka.PLAY_OPTION);
        this.xha.sf();
    }

    public void ri(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xha.ri(animatorUpdateListener);
    }

    public void ri(Animator.AnimatorListener animatorListener) {
        this.xha.ri(animatorListener);
    }

    public void ri(boolean z) {
        this.xha.fi(z ? -1 : 0);
    }

    public Bitmap ri(String str, Bitmap bitmap) {
        return this.xha.ri(str, bitmap);
    }

    private void ri(float f, boolean z) {
        if (z) {
            this.aw.add(ka.SET_PROGRESS);
        }
        this.xha.ka(f);
    }
}
