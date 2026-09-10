package com.bytedance.adsdk.ud;

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
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
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
public class mo extends ImageView {
    private static final String qdl = "mo";
    private static final rq<Throwable> ud = new rq<Throwable>() { // from class: com.bytedance.adsdk.ud.mo.1
        @Override // com.bytedance.adsdk.ud.rq
        public void qdl(Throwable th) {
            com.bytedance.adsdk.ud.mo.mo.qdl(th);
        }
    };
    private long aaj;
    private int bch;
    private exu<wd> bjy;
    private JSONArray bqt;
    private Handler exc;
    private final Set<mml> exu;
    private boolean fs;
    private int jl;
    private String jpc;
    private wd jtx;
    private com.bytedance.adsdk.ud.lnr.lnr.lnr jyq;
    private final Runnable koa;
    private int ljh;
    private final rq<wd> lnr;
    private final rq<Throwable> mml;
    private int mo;
    private rq<Throwable> mzz;
    private int oth;
    private qdl rc;
    private final Set<Object> rdp;
    private boolean rq;
    private boolean to;
    private int tvp;
    private int uw;
    private ud vu;
    private final tvp wd;
    private String xmv;
    private final Handler yt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.mo$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class lnr extends View.BaseSavedState {
        public static final Parcelable.Creator<lnr> CREATOR = new Parcelable.Creator<lnr>() { // from class: com.bytedance.adsdk.ud.mo.lnr.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public lnr createFromParcel(Parcel parcel) {
                return new lnr(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public lnr[] newArray(int i2) {
                return new lnr[i2];
            }
        };
        float lnr;
        boolean mml;
        int mo;
        String mzz;
        String qdl;
        int ud;
        int wd;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.qdl);
            parcel.writeFloat(this.lnr);
            parcel.writeInt(this.mml ? 1 : 0);
            parcel.writeString(this.mzz);
            parcel.writeInt(this.mo);
            parcel.writeInt(this.wd);
        }

        public lnr(Parcelable parcelable) {
            super(parcelable);
        }

        private lnr(Parcel parcel) {
            super(parcel);
            this.qdl = parcel.readString();
            this.lnr = parcel.readFloat();
            this.mml = parcel.readInt() == 1;
            this.mzz = parcel.readString();
            this.mo = parcel.readInt();
            this.wd = parcel.readInt();
        }
    }

    public enum mml {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface qdl {
    }

    public interface ud {
    }

    public mo(Context context) {
        super(context);
        this.lnr = new rq<wd>() { // from class: com.bytedance.adsdk.ud.mo.6
            @Override // com.bytedance.adsdk.ud.rq
            public void qdl(wd wdVar) {
                mo.this.setComposition(wdVar);
            }
        };
        this.mml = new rq<Throwable>() { // from class: com.bytedance.adsdk.ud.mo.7
            @Override // com.bytedance.adsdk.ud.rq
            public void qdl(Throwable th) {
                if (mo.this.mo != 0) {
                    mo moVar = mo.this;
                    moVar.setImageResource(moVar.mo);
                }
                (mo.this.mzz == null ? mo.ud : mo.this.mzz).qdl(th);
            }
        };
        this.mo = 0;
        this.wd = new tvp();
        this.to = false;
        this.rq = false;
        this.fs = true;
        this.exu = new HashSet();
        this.rdp = new HashSet();
        this.yt = new Handler(Looper.getMainLooper());
        this.jl = 0;
        this.aaj = 0L;
        this.koa = new Runnable() { // from class: com.bytedance.adsdk.ud.mo.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + mo.this.oth + ", " + mo.this.ljh);
                if (mo.this.oth > mo.this.ljh) {
                    mo.jl(mo.this);
                    com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVar = mo.this.jyq;
                    StringBuilder sb = new StringBuilder();
                    sb.append(mo.this.oth);
                    lnrVar.qdl(sb.toString());
                    mo.this.invalidate();
                    mo.this.bjy();
                    return;
                }
                if (mo.this.bch < 0 || mo.this.uw < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + mo.this.bch + "," + mo.this.uw);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + mo.this.bch);
                    mo.this.qdl();
                    mo moVar = mo.this;
                    moVar.setFrame(moVar.bch);
                    mo.this.qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (mo.this.getFrame() < mo.this.uw - 1 || mo.this.getFrame() >= mo.this.uw + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + mo.this.uw);
                            mo.this.ud(this);
                            mo.this.mo();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(mo.this.xmv) || (mo.this.bqt != null && mo.this.bqt.length() > 0)) && mo.this.vu != null) {
                    ud unused = mo.this.vu;
                    String unused2 = mo.this.xmv;
                    JSONArray unused3 = mo.this.bqt;
                }
            }
        };
        jpc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wd.qdl getGlobalConfig() {
        wd wdVarXmv;
        tvp tvpVar = this.wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.rq();
    }

    private wd.ud getGlobalEvent() {
        wd wdVarXmv;
        tvp tvpVar = this.wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        wd wdVarXmv;
        tvp tvpVar = this.wd;
        if (tvpVar == null || (wdVarXmv = tvpVar.xmv()) == null) {
            return null;
        }
        return wdVarXmv.tvp();
    }

    public static /* synthetic */ int jl(mo moVar) {
        int i2 = moVar.oth;
        moVar.oth = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int mzz(mo moVar) {
        int i2 = moVar.jl;
        moVar.jl = i2 + 1;
        return i2;
    }

    private void setCompositionTask(exu<wd> exuVar) {
        this.exu.add(mml.SET_ANIMATION);
        yt();
        exu();
        this.bjy = exuVar.qdl(this.lnr).lnr(this.mml);
    }

    public boolean getClipToCompositionBounds() {
        return this.wd.lnr();
    }

    public wd getComposition() {
        return this.jtx;
    }

    public long getDuration() {
        wd wdVar = this.jtx;
        if (wdVar != null) {
            return (long) wdVar.mzz();
        }
        return 0L;
    }

    public int getFrame() {
        return this.wd.exc();
    }

    public String getImageAssetsFolder() {
        return this.wd.mml();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.wd.mzz();
    }

    public float getMaxFrame() {
        return this.wd.bjy();
    }

    public float getMinFrame() {
        return this.wd.rdp();
    }

    public jl getPerformanceTracker() {
        return this.wd.jpc();
    }

    public float getProgress() {
        return this.wd.vu();
    }

    public exc getRenderMode() {
        return this.wd.mo();
    }

    public int getRepeatCount() {
        return this.wd.jyq();
    }

    public int getRepeatMode() {
        return this.wd.aaj();
    }

    public float getSpeed() {
        return this.wd.jtx();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof tvp) && ((tvp) drawable).mo() == exc.SOFTWARE) {
            this.wd.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        tvp tvpVar = this.wd;
        if (drawable2 == tvpVar) {
            super.invalidateDrawable(tvpVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.rq) {
            return;
        }
        this.wd.rq();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jtx();
        Handler handler = this.exc;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        lnr();
        ud();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof lnr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lnr lnrVar = (lnr) parcelable;
        super.onRestoreInstanceState(lnrVar.getSuperState());
        this.jpc = lnrVar.qdl;
        Set<mml> set = this.exu;
        mml mmlVar = mml.SET_ANIMATION;
        if (!set.contains(mmlVar) && !TextUtils.isEmpty(this.jpc)) {
            setAnimation(this.jpc);
        }
        this.tvp = lnrVar.ud;
        if (!this.exu.contains(mmlVar) && (i2 = this.tvp) != 0) {
            setAnimation(i2);
        }
        if (!this.exu.contains(mml.SET_PROGRESS)) {
            qdl(lnrVar.lnr, false);
        }
        if (!this.exu.contains(mml.PLAY_OPTION) && lnrVar.mml) {
            qdl();
        }
        if (!this.exu.contains(mml.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lnrVar.mzz);
        }
        if (!this.exu.contains(mml.SET_REPEAT_MODE)) {
            setRepeatMode(lnrVar.mo);
        }
        if (this.exu.contains(mml.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lnrVar.wd);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        lnr lnrVar = new lnr(super.onSaveInstanceState());
        lnrVar.qdl = this.jpc;
        lnrVar.ud = this.tvp;
        lnrVar.lnr = this.wd.vu();
        lnrVar.mml = this.wd.ljh();
        lnrVar.mzz = this.wd.mml();
        lnrVar.mo = this.wd.aaj();
        lnrVar.wd = this.wd.jyq();
        return lnrVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVarQdl = qdl(motionEvent);
        if (qdlVarQdl == null) {
            if (getGlobalConfig() == null || getGlobalConfig().qdl != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strTvp = qdlVarQdl.tvp();
        if (qdlVarQdl instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
            if (getGlobalConfig() == null || getGlobalConfig().qdl != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strTvp != null && strTvp.startsWith("CSJCLOSE")) {
            jtx();
        }
        to toVarQdl = qdl(qdlVarQdl.mzz());
        if (toVarQdl != null && motionEvent.getAction() == 1) {
            qdl(strTvp, toVarQdl.mzz(), toVarQdl.wd());
            int[][] iArrMo = toVarQdl.mo();
            if (iArrMo != null) {
                qdl(iArrMo);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().ud) != null) {
                qdl(iArr);
            }
        }
        if (strTvp == null || !strTvp.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i2) {
        this.tvp = i2;
        this.jpc = null;
        setCompositionTask(qdl(i2));
    }

    public void setAnimationFromJson(String str) {
        qdl(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.fs ? jpc.qdl(getContext(), str) : jpc.qdl(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.wd.mzz(z2);
    }

    public void setCacheComposition(boolean z2) {
        this.fs = z2;
    }

    public void setClipToCompositionBounds(boolean z2) {
        this.wd.qdl(z2);
    }

    public void setComposition(wd wdVar) {
        if (mzz.qdl) {
            Log.v(qdl, "Set Composition \n".concat(String.valueOf(wdVar)));
        }
        this.wd.setCallback(this);
        this.jtx = wdVar;
        this.to = true;
        boolean zQdl = this.wd.qdl(wdVar, getContext().getApplicationContext());
        this.to = false;
        if (getDrawable() != this.wd || zQdl) {
            if (!zQdl) {
                jl();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.rdp.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.wd.wd(str);
    }

    public void setFailureListener(rq<Throwable> rqVar) {
        this.mzz = rqVar;
    }

    public void setFallbackResource(int i2) {
        this.mo = i2;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.ud.lnr lnrVar) {
        this.wd.qdl(lnrVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.wd.qdl(map);
    }

    public void setFrame(int i2) {
        this.wd.lnr(i2);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.wd.wd(z2);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.ud.mml mmlVar) {
        this.wd.qdl(mmlVar);
    }

    public void setImageAssetsFolder(String str) {
        this.wd.qdl(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        exu();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        exu();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        exu();
        super.setImageResource(i2);
    }

    public void setLottieAnimListener(qdl qdlVar) {
        this.rc = qdlVar;
    }

    public void setLottieClicklistener(ud udVar) {
        this.vu = udVar;
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.wd.ud(z2);
    }

    public void setMaxFrame(int i2) {
        this.wd.ud(i2);
    }

    public void setMaxProgress(float f) {
        this.wd.ud(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.wd.mml(str);
    }

    public void setMinFrame(int i2) {
        this.wd.qdl(i2);
    }

    public void setMinProgress(float f) {
        this.wd.qdl(f);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.wd.mml(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.wd.lnr(z2);
    }

    public void setProgress(float f) {
        qdl(f, true);
    }

    public void setRenderMode(exc excVar) {
        this.wd.qdl(excVar);
    }

    public void setRepeatCount(int i2) {
        this.exu.add(mml.SET_REPEAT_COUNT);
        this.wd.mzz(i2);
    }

    public void setRepeatMode(int i2) {
        this.exu.add(mml.SET_REPEAT_MODE);
        this.wd.mml(i2);
    }

    public void setSafeMode(boolean z2) {
        this.wd.mo(z2);
    }

    public void setSpeed(float f) {
        this.wd.lnr(f);
    }

    public void setTextDelegate(aaj aajVar) {
        this.wd.qdl(aajVar);
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.wd.jpc(z2);
    }

    public void setView(View view) {
        this.wd.qdl(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        tvp tvpVar;
        if (!this.to && drawable == (tvpVar = this.wd) && tvpVar.oth()) {
            mo();
        } else if (!this.to && (drawable instanceof tvp)) {
            tvp tvpVar2 = (tvp) drawable;
            if (tvpVar2.oth()) {
                tvpVar2.koa();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjy() {
        this.yt.postDelayed(this.koa, 1000L);
    }

    private void exu() {
        exu<wd> exuVar = this.bjy;
        if (exuVar != null) {
            exuVar.ud(this.lnr);
            this.bjy.mml(this.mml);
        }
    }

    private void fs() {
        qdl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ud.mo.11
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
                aaj aajVarBch;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - mo.this.aaj;
                mo.this.ud(this);
                String playDelayedELExpressTimeS = mo.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (aajVarBch = mo.this.wd.bch()) != null) {
                    try {
                        int i2 = Integer.parseInt(aajVarBch.qdl(playDelayedELExpressTimeS)) * 1000;
                        if (mo.this.aaj > 0) {
                            long jElapsedRealtime2 = (mo.this.aaj + ((long) i2)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                mo.this.mo();
                                mo.this.setVisibility(8);
                                if (mo.this.exc == null) {
                                    mo.this.exc = new Handler(Looper.getMainLooper());
                                }
                                mo.this.exc.removeCallbacksAndMessages(null);
                                mo.this.exc.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ud.mo.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        mo.this.setVisibility(0);
                                        mo.this.qdl();
                                        mo.this.qdl(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                mo.this.qdl(jElapsedRealtime);
            }
        });
    }

    private void jl() {
        boolean zMml = mml();
        setImageDrawable(null);
        setImageDrawable(this.wd);
        if (zMml) {
            this.wd.exu();
        }
    }

    private void jpc() {
        setSaveEnabled(false);
        this.fs = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        qdl(0.0f, false);
        qdl(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.wd.qdl(Boolean.valueOf(com.bytedance.adsdk.ud.mo.mo.qdl(getContext()) != 0.0f));
        tvp();
        to();
        fs();
    }

    private void jtx() {
        this.yt.removeCallbacksAndMessages(null);
    }

    private void lnr(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void mml(Matrix matrix, float f, float f2, float f3, float f4) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        tvp tvpVar;
        int i2;
        int i3;
        final int i4;
        if (this.jtx == null || (tvpVar = this.wd) == null) {
            return;
        }
        aaj aajVarBch = tvpVar.bch();
        wd.lnr lnrVarJpc = this.jtx.jpc();
        if (lnrVarJpc == null || aajVarBch == null) {
            return;
        }
        final int i5 = lnrVarJpc.qdl;
        if (i5 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i5)));
            return;
        }
        int[] iArr = lnrVarJpc.mzz;
        final int i6 = -1;
        if (iArr == null || iArr.length < 2) {
            i2 = -1;
            i3 = -1;
        } else {
            i3 = iArr[0];
            i2 = iArr[1];
        }
        String strQdl = aajVarBch.qdl(lnrVarJpc.lnr);
        String strQdl2 = aajVarBch.qdl(lnrVarJpc.mml);
        try {
            i4 = Integer.parseInt(strQdl);
            try {
                i6 = Integer.parseInt(strQdl2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i4 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i4 + ", lenS: " + i6);
        if (TextUtils.isEmpty(lnrVarJpc.ud)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + lnrVarJpc.ud);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + lnrVarJpc.ud);
        com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVarLnr = lnr(lnrVarJpc.ud);
        if (lnrVarLnr != null) {
            Log.i("TMe", "--==--- timer success");
            this.xmv = lnrVarJpc.mo;
            this.bqt = lnrVarJpc.wd;
            this.jyq = lnrVarLnr;
            this.oth = i4;
            this.ljh = i4 - i6;
            this.bch = i3;
            this.uw = i2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.oth);
            lnrVarLnr.qdl(sb.toString());
            qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (mo.this.getFrame() < i5 - 1 || mo.this.getFrame() >= i5 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + mo.this.getFrame());
                    mo.this.ud(this);
                    if (i4 < 0 || i6 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        mo.this.bjy();
                    }
                    mo.this.mo();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq() {
        final wd.qdl globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.mzz <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.mo) && globalConfig.wd == null) {
            return;
        }
        int maxFrame = globalConfig.mzz;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                mo.this.ud(this);
                if (mo.this.vu != null) {
                    ud unused = mo.this.vu;
                }
            }
        });
    }

    private void to() {
        qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                mo.mzz(mo.this);
                wd.qdl globalConfig = mo.this.getGlobalConfig();
                if (globalConfig != null && (i2 = globalConfig.mml) > 0 && i2 > mo.this.jl) {
                    mo.this.rdp();
                    mo.this.qdl();
                    mo.this.setProgress(0.0f);
                } else {
                    mo.this.ud(this);
                    if (mo.this.rc != null) {
                        qdl unused = mo.this.rc;
                    }
                }
            }
        });
    }

    private void tvp() {
        qdl(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ud.mo.8
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
                mo.this.ud(this);
                mo.this.rdp();
                mo.this.rq();
            }
        });
    }

    private void ud(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.wd.getBounds().width();
        float fHeight = this.wd.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i2 = AnonymousClass5.qdl[getScaleType().ordinal()];
        if (i2 == 1) {
            qdl(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 2) {
            ud(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 3) {
            lnr(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 4) {
            mml(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void yt() {
        this.jtx = null;
        this.wd.to();
    }

    public void mo() {
        this.rq = false;
        this.wd.koa();
    }

    public void mzz() {
        this.exu.add(mml.PLAY_OPTION);
        this.wd.bqt();
    }

    public void setMaxFrame(String str) {
        this.wd.lnr(str);
    }

    public void setMinFrame(String str) {
        this.wd.ud(str);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.lnr lnr(String str) {
        com.bytedance.adsdk.ud.lnr.lnr.ud udVarUd;
        tvp tvpVar = this.wd;
        if (tvpVar == null || (udVarUd = tvpVar.ud()) == null) {
            return null;
        }
        return qdl(udVarUd, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(long j) {
        Map<String, Object> map;
        wd.qdl globalConfig = getGlobalConfig();
        if (this.rc != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.ud) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.ud);
        }
    }

    public void setAnimation(String str) {
        this.jpc = str;
        this.tvp = 0;
        setCompositionTask(ud(str));
    }

    public void lnr() {
        this.wd.jl();
    }

    private to qdl(String str) {
        tvp tvpVar;
        wd wdVarXmv;
        Map<String, to> mapJtx;
        if (TextUtils.isEmpty(str) || (tvpVar = this.wd) == null || (wdVarXmv = tvpVar.xmv()) == null || (mapJtx = wdVarXmv.jtx()) == null) {
            return null;
        }
        return mapJtx.get(str);
    }

    public boolean mml() {
        return this.wd.oth();
    }

    private void ud(Matrix matrix, float f, float f2, float f3, float f4) {
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

    private void qdl(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i2 = iArr2[0];
            final int i3 = iArr2[1];
            if (i2 < 0 || i3 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i2)));
            jtx();
            qdl();
            setFrame(i2);
            qdl(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ud.mo.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (mo.this.getFrame() < i3 - 1 || mo.this.getFrame() >= i3 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i3 + ", realFrame: " + mo.this.getFrame());
                    mo.this.ud(this);
                    mo.this.mo();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private exu<wd> ud(final String str) {
        if (isInEditMode()) {
            return new exu<>(new Callable<fs<wd>>() { // from class: com.bytedance.adsdk.ud.mo.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                public fs<wd> call() throws Exception {
                    return mo.this.fs ? jpc.lnr(mo.this.getContext(), str) : jpc.lnr(mo.this.getContext(), str, null);
                }
            }, true);
        }
        return this.fs ? jpc.ud(getContext(), str) : jpc.ud(getContext(), str, (String) null);
    }

    public void ud(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.wd.ud(animatorUpdateListener);
    }

    private void qdl(String str, String str2, JSONArray jSONArray) {
        wd.ud globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.qdl;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.lnr;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void ud() {
        this.wd.yt();
    }

    public void ud(Animator.AnimatorListener animatorListener) {
        this.wd.ud(animatorListener);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.qdl qdl(MotionEvent motionEvent) {
        com.bytedance.adsdk.ud.lnr.lnr.ud udVarUd;
        tvp tvpVar = this.wd;
        if (tvpVar == null || (udVarUd = tvpVar.ud()) == null) {
            return null;
        }
        return qdl(udVarUd, motionEvent);
    }

    private com.bytedance.adsdk.ud.lnr.lnr.qdl qdl(com.bytedance.adsdk.ud.lnr.lnr.ud udVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVarQdl;
        for (com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar : udVar.fs()) {
            if (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
                if (qdlVar.jpc() && qdlVar.mo() > 0.0f) {
                    RectF rectF = new RectF();
                    qdlVar.qdl(rectF, qdlVar.mml(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (qdlVarQdl = qdl((com.bytedance.adsdk.ud.lnr.lnr.ud) qdlVar, motionEvent)) != null) {
                        return qdlVarQdl;
                    }
                }
            } else if (qdlVar.jpc() && qdlVar.mo() > 0.0f) {
                RectF rectF2 = new RectF();
                tvp tvpVar = this.wd;
                if (tvpVar != null && tvpVar.wd()) {
                    qdlVar.qdl(rectF2, qdlVar.mml(), true);
                    RectF rectFRc = this.wd.rc();
                    if (rectFRc != null) {
                        qdl(rectF2, rectFRc);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    qdlVar.qdl(rectF3, qdlVar.mml(), true);
                    ud(rectF2, rectF3);
                }
                if (qdl(motionEvent, rectF2)) {
                    return qdlVar;
                }
            }
        }
        return null;
    }

    private boolean qdl(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void qdl(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i2 = AnonymousClass5.qdl[getScaleType().ordinal()];
        if (i2 == 1) {
            qdl(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 2) {
            ud(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 3) {
            lnr(matrix, width, height, fWidth, fHeight);
        } else if (i2 == 4) {
            mml(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void qdl(Matrix matrix, float f, float f2, float f3, float f4) {
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

    public void qdl(boolean z2, Context context) {
        this.wd.qdl(z2, context);
    }

    private exu<wd> qdl(final int i2) {
        if (isInEditMode()) {
            return new exu<>(new Callable<fs<wd>>() { // from class: com.bytedance.adsdk.ud.mo.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                public fs<wd> call() throws Exception {
                    return mo.this.fs ? jpc.ud(mo.this.getContext(), i2) : jpc.ud(mo.this.getContext(), i2, (String) null);
                }
            }, true);
        }
        return this.fs ? jpc.qdl(getContext(), i2) : jpc.qdl(getContext(), i2, (String) null);
    }

    public void qdl(String str, String str2) {
        qdl(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void qdl(InputStream inputStream, String str) {
        setCompositionTask(jpc.qdl(inputStream, str));
    }

    private com.bytedance.adsdk.ud.lnr.lnr.lnr qdl(com.bytedance.adsdk.ud.lnr.lnr.ud udVar, String str) {
        for (com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar : udVar.fs()) {
            if (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.ud) {
                com.bytedance.adsdk.ud.lnr.lnr.lnr lnrVarQdl = qdl((com.bytedance.adsdk.ud.lnr.lnr.ud) qdlVar, str);
                if (lnrVarQdl != null) {
                    return lnrVarQdl;
                }
            } else if (TextUtils.equals(str, qdlVar.tvp()) && (qdlVar instanceof com.bytedance.adsdk.ud.lnr.lnr.lnr)) {
                return (com.bytedance.adsdk.ud.lnr.lnr.lnr) qdlVar;
            }
        }
        return null;
    }

    public void qdl() {
        if (this.aaj == 0) {
            this.aaj = SystemClock.elapsedRealtime();
        }
        this.exu.add(mml.PLAY_OPTION);
        this.wd.rq();
    }

    public void qdl(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.wd.qdl(animatorUpdateListener);
    }

    public void qdl(Animator.AnimatorListener animatorListener) {
        this.wd.qdl(animatorListener);
    }

    public void qdl(boolean z2) {
        this.wd.mzz(z2 ? -1 : 0);
    }

    public Bitmap qdl(String str, Bitmap bitmap) {
        return this.wd.qdl(str, bitmap);
    }

    private void qdl(float f, boolean z2) {
        if (z2) {
            this.exu.add(mml.SET_PROGRESS);
        }
        this.wd.mml(f);
    }
}
