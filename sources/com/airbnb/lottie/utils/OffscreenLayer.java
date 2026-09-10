package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import com.unity3d.services.UnityAdsConstants;
import monroe.marial;
import polder.dern;
import utwa.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public class OffscreenLayer {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final Matrix f16205stratoscope = new Matrix();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Canvas f16206adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public Paint f16207apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Matrix f16208arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Canvas f16209attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Rect f16210beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public RectF f16211competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public RenderNode f16212cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public com.airbnb.lottie.utils.attabal f16213cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public RectF f16214cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public RenderStrategy f16215dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public blighty.attabal f16216dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Bitmap f16217formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public BlurMaskFilter f16218gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Canvas f16219graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public Canvas f16220impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public RectF f16221impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public blighty.attabal f16222kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public RectF f16223marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Bitmap f16224molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float[] f16225monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public Bitmap f16226polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public RenderNode f16227preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f16228rotuma = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public saneness f16229saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Rect f16230taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public Rect f16231triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public RectF f16232wireman;

    public enum RenderStrategy {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f16234attabal;

        static {
            int[] iArr = new int[RenderStrategy.values().length];
            f16234attabal = iArr;
            try {
                iArr[RenderStrategy.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16234attabal[RenderStrategy.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16234attabal[RenderStrategy.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16234attabal[RenderStrategy.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f16235attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ColorFilter f16236dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public BlendModeCompat f16237saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public com.airbnb.lottie.utils.attabal f16238wireman;

        public saneness() {
            beachfront();
        }

        public boolean attabal() {
            BlendModeCompat blendModeCompat = this.f16237saneness;
            return (blendModeCompat == null || blendModeCompat == BlendModeCompat.SRC_OVER) ? false : true;
        }

        public void beachfront() {
            this.f16235attabal = 255;
            this.f16237saneness = null;
            this.f16236dern = null;
            this.f16238wireman = null;
        }

        public boolean dern() {
            return this.f16238wireman != null;
        }

        public boolean marial() {
            return this.f16235attabal < 255;
        }

        public boolean saneness() {
            return this.f16236dern != null;
        }

        public boolean wireman() {
            return (marial() || attabal() || dern() || saneness()) ? false : true;
        }
    }

    public final Bitmap attabal(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public boolean beachfront() {
        return this.f16215dern == RenderStrategy.RENDER_NODE;
    }

    public final boolean competently(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public Canvas cutely(Canvas canvas, RectF rectF, saneness sanenessVar) {
        if (this.f16209attabal != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f16225monoploid == null) {
            this.f16225monoploid = new float[9];
        }
        if (this.f16208arytenoidectomy == null) {
            this.f16208arytenoidectomy = new Matrix();
        }
        canvas.getMatrix(this.f16208arytenoidectomy);
        this.f16208arytenoidectomy.getValues(this.f16225monoploid);
        float[] fArr = this.f16225monoploid;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.f16214cutely == null) {
            this.f16214cutely = new RectF();
        }
        this.f16214cutely.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.f16209attabal = canvas;
        this.f16229saneness = sanenessVar;
        this.f16215dern = dern(canvas, sanenessVar);
        if (this.f16232wireman == null) {
            this.f16232wireman = new RectF();
        }
        this.f16232wireman.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f16207apical == null) {
            this.f16207apical = new blighty.attabal();
        }
        this.f16207apical.reset();
        int i = attabal.f16234attabal[this.f16215dern.ordinal()];
        if (i == 1) {
            canvas.save();
            return canvas;
        }
        if (i == 2) {
            this.f16207apical.setAlpha(sanenessVar.f16235attabal);
            this.f16207apical.setColorFilter(sanenessVar.f16236dern);
            if (sanenessVar.attabal()) {
                marial.saneness(this.f16207apical, sanenessVar.f16237saneness);
            }
            arytenoidectomy.triweekly(canvas, rectF, this.f16207apical);
            return canvas;
        }
        if (i == 3) {
            if (this.f16222kowloon == null) {
                blighty.attabal attabalVar = new blighty.attabal();
                this.f16222kowloon = attabalVar;
                attabalVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (competently(this.f16217formularize, this.f16214cutely)) {
                Bitmap bitmap = this.f16217formularize;
                if (bitmap != null) {
                    wireman(bitmap);
                }
                this.f16217formularize = attabal(this.f16214cutely, Bitmap.Config.ARGB_8888);
                this.f16220impassible = new Canvas(this.f16217formularize);
            } else {
                Canvas canvas2 = this.f16220impassible;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f16205stratoscope);
                this.f16220impassible.drawRect(-1.0f, -1.0f, this.f16214cutely.width() + 1.0f, this.f16214cutely.height() + 1.0f, this.f16222kowloon);
            }
            marial.saneness(this.f16207apical, sanenessVar.f16237saneness);
            this.f16207apical.setColorFilter(sanenessVar.f16236dern);
            this.f16207apical.setAlpha(sanenessVar.f16235attabal);
            Canvas canvas3 = this.f16220impassible;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f16227preprohormone == null) {
            this.f16227preprohormone = dern.attabal("OffscreenLayer.main");
        }
        if (sanenessVar.dern() && this.f16212cord == null) {
            this.f16212cord = dern.attabal("OffscreenLayer.shadow");
            this.f16213cuirassed = null;
        }
        if (sanenessVar.attabal() || sanenessVar.saneness()) {
            if (this.f16207apical == null) {
                this.f16207apical = new blighty.attabal();
            }
            this.f16207apical.reset();
            marial.saneness(this.f16207apical, sanenessVar.f16237saneness);
            this.f16207apical.setColorFilter(sanenessVar.f16236dern);
            this.f16227preprohormone.setUseCompositingLayer(true, this.f16207apical);
            if (sanenessVar.dern()) {
                RenderNode renderNode = this.f16212cord;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f16207apical);
            }
        }
        this.f16227preprohormone.setAlpha(sanenessVar.f16235attabal / 255.0f);
        if (sanenessVar.dern()) {
            RenderNode renderNode2 = this.f16212cord;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(sanenessVar.f16235attabal / 255.0f);
        }
        this.f16227preprohormone.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f16227preprohormone;
        RectF rectF2 = this.f16214cutely;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f16227preprohormone.beginRecording((int) this.f16214cutely.width(), (int) this.f16214cutely.height());
        recordingCanvasBeginRecording.setMatrix(f16205stratoscope);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }

    public final RenderStrategy dern(Canvas canvas, saneness sanenessVar) {
        if (sanenessVar.wireman()) {
            return RenderStrategy.DIRECT;
        }
        if (!sanenessVar.dern()) {
            return RenderStrategy.SAVE_LAYER;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || !canvas.isHardwareAccelerated()) {
            return RenderStrategy.BITMAP;
        }
        return i <= 31 ? RenderStrategy.BITMAP : RenderStrategy.RENDER_NODE;
    }

    public final void impromptu(Canvas canvas, com.airbnb.lottie.utils.attabal attabalVar) {
        blighty.attabal attabalVar2;
        RectF rectF = this.f16232wireman;
        if (rectF == null || this.f16217formularize == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFSaneness = saneness(rectF, attabalVar);
        if (this.f16210beachfront == null) {
            this.f16210beachfront = new Rect();
        }
        this.f16210beachfront.set((int) Math.floor(rectFSaneness.left), (int) Math.floor(rectFSaneness.top), (int) Math.ceil(rectFSaneness.right), (int) Math.ceil(rectFSaneness.bottom));
        float[] fArr = this.f16225monoploid;
        float f = fArr != null ? fArr[0] : 1.0f;
        float f2 = fArr != null ? fArr[4] : 1.0f;
        if (this.f16221impromptu == null) {
            this.f16221impromptu = new RectF();
        }
        this.f16221impromptu.set(rectFSaneness.left * f, rectFSaneness.top * f2, rectFSaneness.right * f, rectFSaneness.bottom * f2);
        if (this.f16230taiyuan == null) {
            this.f16230taiyuan = new Rect();
        }
        this.f16230taiyuan.set(0, 0, Math.round(this.f16221impromptu.width()), Math.round(this.f16221impromptu.height()));
        if (competently(this.f16226polloi, this.f16221impromptu)) {
            Bitmap bitmap = this.f16226polloi;
            if (bitmap != null) {
                wireman(bitmap);
            }
            Bitmap bitmap2 = this.f16224molybdenite;
            if (bitmap2 != null) {
                wireman(bitmap2);
            }
            this.f16226polloi = attabal(this.f16221impromptu, Bitmap.Config.ARGB_8888);
            this.f16224molybdenite = attabal(this.f16221impromptu, Bitmap.Config.ALPHA_8);
            this.f16219graveside = new Canvas(this.f16226polloi);
            this.f16206adultoid = new Canvas(this.f16224molybdenite);
        } else {
            Canvas canvas2 = this.f16219graveside;
            if (canvas2 == null || this.f16206adultoid == null || (attabalVar2 = this.f16222kowloon) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f16230taiyuan, attabalVar2);
            this.f16206adultoid.drawRect(this.f16230taiyuan, this.f16222kowloon);
        }
        if (this.f16224molybdenite == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f16216dovishness == null) {
            this.f16216dovishness = new blighty.attabal(1);
        }
        RectF rectF2 = this.f16232wireman;
        this.f16206adultoid.drawBitmap(this.f16217formularize, Math.round((rectF2.left - rectFSaneness.left) * f), Math.round((rectF2.top - rectFSaneness.top) * f2), (Paint) null);
        if (this.f16218gintrap == null || this.f16228rotuma != attabalVar.impromptu()) {
            float fImpromptu = (attabalVar.impromptu() * (f + f2)) / 2.0f;
            if (fImpromptu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f16218gintrap = new BlurMaskFilter(fImpromptu, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f16218gintrap = null;
            }
            this.f16228rotuma = attabalVar.impromptu();
        }
        this.f16216dovishness.setColor(attabalVar.marial());
        if (attabalVar.impromptu() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f16216dovishness.setMaskFilter(this.f16218gintrap);
        } else {
            this.f16216dovishness.setMaskFilter(null);
        }
        this.f16216dovishness.setFilterBitmap(true);
        this.f16219graveside.drawBitmap(this.f16224molybdenite, Math.round(attabalVar.beachfront() * f), Math.round(attabalVar.competently() * f2), this.f16216dovishness);
        canvas.drawBitmap(this.f16226polloi, this.f16230taiyuan, this.f16210beachfront, this.f16207apical);
    }

    public void marial() {
        if (this.f16209attabal == null || this.f16229saneness == null || this.f16225monoploid == null || this.f16232wireman == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i = attabal.f16234attabal[this.f16215dern.ordinal()];
        if (i == 1 || i == 2) {
            this.f16209attabal.restore();
        } else if (i != 3) {
            if (i == 4) {
                if (this.f16227preprohormone == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f16209attabal.save();
                Canvas canvas = this.f16209attabal;
                float[] fArr = this.f16225monoploid;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f16227preprohormone.endRecording();
                if (this.f16229saneness.dern()) {
                    taiyuan(this.f16209attabal, this.f16229saneness.f16238wireman);
                }
                this.f16209attabal.drawRenderNode(this.f16227preprohormone);
                this.f16209attabal.restore();
            }
        } else {
            if (this.f16217formularize == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f16229saneness.dern()) {
                impromptu(this.f16209attabal, this.f16229saneness.f16238wireman);
            }
            if (this.f16231triweekly == null) {
                this.f16231triweekly = new Rect();
            }
            this.f16231triweekly.set(0, 0, (int) (this.f16232wireman.width() * this.f16225monoploid[0]), (int) (this.f16232wireman.height() * this.f16225monoploid[4]));
            this.f16209attabal.drawBitmap(this.f16217formularize, this.f16231triweekly, this.f16232wireman, this.f16207apical);
        }
        this.f16209attabal = null;
    }

    public final RectF saneness(RectF rectF, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f16223marial == null) {
            this.f16223marial = new RectF();
        }
        if (this.f16211competently == null) {
            this.f16211competently = new RectF();
        }
        this.f16223marial.set(rectF);
        this.f16223marial.offsetTo(rectF.left + attabalVar.beachfront(), rectF.top + attabalVar.competently());
        this.f16223marial.inset(-attabalVar.impromptu(), -attabalVar.impromptu());
        this.f16211competently.set(rectF);
        this.f16223marial.union(this.f16211competently);
        return this.f16223marial;
    }

    public final void taiyuan(Canvas canvas, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f16227preprohormone == null || this.f16212cord == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f16225monoploid;
        float f = fArr != null ? fArr[0] : 1.0f;
        float f2 = fArr != null ? fArr[4] : 1.0f;
        com.airbnb.lottie.utils.attabal attabalVar2 = this.f16213cuirassed;
        if (attabalVar2 == null || !attabalVar.cutely(attabalVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(attabalVar.marial(), PorterDuff.Mode.SRC_IN));
            if (attabalVar.impromptu() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float fImpromptu = (attabalVar.impromptu() * (f + f2)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fImpromptu, fImpromptu, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f16212cord.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f16213cuirassed = attabalVar;
        }
        RectF rectFSaneness = saneness(this.f16232wireman, attabalVar);
        RectF rectF = new RectF(rectFSaneness.left * f, rectFSaneness.top * f2, rectFSaneness.right * f, rectFSaneness.bottom * f2);
        this.f16212cord.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f16212cord.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (attabalVar.beachfront() * f), (-rectF.top) + (attabalVar.competently() * f2));
        recordingCanvasBeginRecording.drawRenderNode(this.f16227preprohormone);
        this.f16212cord.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f16212cord);
        canvas.restore();
    }

    public final void wireman(Bitmap bitmap) {
        bitmap.recycle();
    }
}
