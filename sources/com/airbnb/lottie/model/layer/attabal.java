package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.unity3d.services.UnityAdsConstants;
import euhemerize.taiyuan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kinesic.marial;
import pact.beachfront;
import pact.dern;
import redevelopment.impromptu;
import redevelopment.molybdenite;
import redevelopment.wireman;
import rotissomat.cutely;
import utwa.arytenoidectomy;

/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements marial, redevelopment.attabal.saneness, lamplit.marial {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public attabal f16097adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final RectF f16098apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final LottieDrawable f16099arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Paint f16101beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Paint f16102competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f16103cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public Paint f16104cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final RectF f16105cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public List<attabal> f16107dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final RectF f16108formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final List<redevelopment.attabal<?, ?>> f16109gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public attabal f16110graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final RectF f16111impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Paint f16112impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Matrix f16113kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Paint f16114marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public wireman f16115molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Layer f16116monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public blighty.attabal f16117oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public impromptu f16118polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f16119preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final molybdenite f16120rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float f16122stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final RectF f16123taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final String f16124triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public BlurMaskFilter f16125trm;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f16100attabal = new Path();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Matrix f16121saneness = new Matrix();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Matrix f16106dern = new Matrix();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Paint f16126wireman = new blighty.attabal(1);

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseLayer.java */
    public static /* synthetic */ class C0147attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f16127attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f16128saneness;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f16128saneness = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16128saneness[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16128saneness[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16128saneness[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f16127attabal = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16127attabal[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16127attabal[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16127attabal[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16127attabal[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16127attabal[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16127attabal[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public attabal(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f16114marial = new blighty.attabal(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f16101beachfront = new blighty.attabal(1, mode2);
        blighty.attabal attabalVar = new blighty.attabal(1);
        this.f16102competently = attabalVar;
        this.f16112impromptu = new blighty.attabal(PorterDuff.Mode.CLEAR);
        this.f16123taiyuan = new RectF();
        this.f16105cutely = new RectF();
        this.f16098apical = new RectF();
        this.f16108formularize = new RectF();
        this.f16111impassible = new RectF();
        this.f16113kowloon = new Matrix();
        this.f16109gintrap = new ArrayList();
        this.f16119preprohormone = true;
        this.f16122stratoscope = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16099arytenoidectomy = lottieDrawable;
        this.f16116monoploid = layer;
        this.f16124triweekly = layer.cutely() + "#draw";
        if (layer.taiyuan() == Layer.MatteType.INVERT) {
            attabalVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            attabalVar.setXfermode(new PorterDuffXfermode(mode));
        }
        molybdenite molybdeniteVarSaneness = layer.rotuma().saneness();
        this.f16120rotuma = molybdeniteVarSaneness;
        molybdeniteVarSaneness.marial(this);
        if (layer.impromptu() != null && !layer.impromptu().isEmpty()) {
            impromptu impromptuVar = new impromptu(layer.impromptu());
            this.f16118polloi = impromptuVar;
            Iterator<redevelopment.attabal<taiyuan, Path>> it = impromptuVar.attabal().iterator();
            while (it.hasNext()) {
                it.next().attabal(this);
            }
            for (redevelopment.attabal<Integer, Integer> attabalVar2 : this.f16118polloi.dern()) {
                cutely(attabalVar2);
                attabalVar2.attabal(this);
            }
        }
        privatdozent();
    }

    public static attabal dovishness(saneness sanenessVar, Layer layer, LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar) {
        switch (C0147attabal.f16127attabal[layer.competently().ordinal()]) {
            case 1:
                return new pact.wireman(lottieDrawable, layer, sanenessVar, impromptuVar);
            case 2:
                return new saneness(lottieDrawable, layer, impromptuVar.kowloon(layer.triweekly()), impromptuVar);
            case 3:
                return new pact.marial(lottieDrawable, layer);
            case 4:
                return new pact.saneness(lottieDrawable, layer);
            case 5:
                return new dern(lottieDrawable, layer);
            case 6:
                return new beachfront(lottieDrawable, layer);
            default:
                utwa.beachfront.dern("Unknown layer type " + layer.competently());
                return null;
        }
    }

    public abstract void adultoid(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar);

    public final void apical(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar, redevelopment.attabal<Integer, Integer> attabalVar2) {
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        this.f16126wireman.setAlpha((int) (attabalVar2.impromptu().intValue() * 2.55f));
        canvas.drawPath(this.f16100attabal, this.f16126wireman);
    }

    public final void arytenoidectomy(Canvas canvas, Matrix matrix) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Layer#saveLayer");
        }
        arytenoidectomy.kowloon(canvas, this.f16123taiyuan, this.f16114marial, 19);
        if (Build.VERSION.SDK_INT < 28) {
            graveside(canvas);
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Layer#saveLayer");
        }
        for (int i = 0; i < this.f16118polloi.saneness().size(); i++) {
            Mask mask = this.f16118polloi.saneness().get(i);
            redevelopment.attabal<taiyuan, Path> attabalVar = this.f16118polloi.attabal().get(i);
            redevelopment.attabal<Integer, Integer> attabalVar2 = this.f16118polloi.dern().get(i);
            int i2 = C0147attabal.f16128saneness[mask.attabal().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f16126wireman.setColor(-16777216);
                        this.f16126wireman.setAlpha(255);
                        canvas.drawRect(this.f16123taiyuan, this.f16126wireman);
                    }
                    if (mask.wireman()) {
                        kowloon(canvas, matrix, attabalVar, attabalVar2);
                    } else {
                        monoploid(canvas, matrix, attabalVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.wireman()) {
                            impassible(canvas, matrix, attabalVar, attabalVar2);
                        } else {
                            apical(canvas, matrix, attabalVar, attabalVar2);
                        }
                    }
                } else if (mask.wireman()) {
                    triweekly(canvas, matrix, attabalVar, attabalVar2);
                } else {
                    formularize(canvas, matrix, attabalVar, attabalVar2);
                }
            } else if (polloi()) {
                this.f16126wireman.setAlpha(255);
                canvas.drawRect(this.f16123taiyuan, this.f16126wireman);
            }
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Layer#restoreLayer");
        }
        canvas.restore();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Layer#restoreLayer");
        }
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        sealless();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        attabal attabalVar = this.f16110graveside;
        if (attabalVar != null) {
            lamplit.wireman wiremanVarAttabal = wiremanVar2.attabal(attabalVar.getName());
            if (wiremanVar.dern(this.f16110graveside.getName(), i)) {
                list.add(wiremanVarAttabal.taiyuan(this.f16110graveside));
            }
            if (wiremanVar.competently(this.f16110graveside.getName(), i) && wiremanVar.impromptu(getName(), i)) {
                this.f16110graveside.restrictive(wiremanVar, wiremanVar.marial(this.f16110graveside.getName(), i) + i, list, wiremanVarAttabal);
            }
        }
        if (wiremanVar.competently(getName(), i)) {
            if (!"__container".equals(getName())) {
                wiremanVar2 = wiremanVar2.attabal(getName());
                if (wiremanVar.dern(getName(), i)) {
                    list.add(wiremanVar2.taiyuan(this));
                }
            }
            if (wiremanVar.impromptu(getName(), i)) {
                restrictive(wiremanVar, i + wiremanVar.marial(getName(), i), list, wiremanVar2);
            }
        }
    }

    public cutely cord() {
        return this.f16116monoploid.wireman();
    }

    public Layer cuirassed() {
        return this.f16116monoploid;
    }

    public void cutely(redevelopment.attabal<?, ?> attabalVar) {
        if (attabalVar == null) {
            return;
        }
        this.f16109gintrap.add(attabalVar);
    }

    public final void formularize(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar, redevelopment.attabal<Integer, Integer> attabalVar2) {
        arytenoidectomy.triweekly(canvas, this.f16123taiyuan, this.f16114marial);
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        this.f16126wireman.setAlpha((int) (attabalVar2.impromptu().intValue() * 2.55f));
        canvas.drawPath(this.f16100attabal, this.f16126wireman);
        canvas.restore();
    }

    @Override // kinesic.dern
    public String getName() {
        return this.f16116monoploid.cutely();
    }

    public LBlendMode gintrap() {
        return this.f16116monoploid.attabal();
    }

    public final void graveside(Canvas canvas) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Layer#clearLayer");
        }
        RectF rectF = this.f16123taiyuan;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f16112impromptu);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Layer#clearLayer");
        }
    }

    public void grimness(float f) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress");
            com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress.transform");
        }
        this.f16120rotuma.impassible(f);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("BaseLayer#setProgress.transform");
        }
        if (this.f16118polloi != null) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress.mask");
            }
            for (int i = 0; i < this.f16118polloi.attabal().size(); i++) {
                this.f16118polloi.attabal().get(i).triweekly(f);
            }
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseLayer#setProgress.mask");
            }
        }
        if (this.f16115molybdenite != null) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress.inout");
            }
            this.f16115molybdenite.triweekly(f);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseLayer#setProgress.inout");
            }
        }
        if (this.f16110graveside != null) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress.matte");
            }
            this.f16110graveside.grimness(f);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseLayer#setProgress.matte");
            }
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("BaseLayer#setProgress.animations." + this.f16109gintrap.size());
        }
        for (int i2 = 0; i2 < this.f16109gintrap.size(); i2++) {
            this.f16109gintrap.get(i2).triweekly(f);
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("BaseLayer#setProgress.animations." + this.f16109gintrap.size());
            com.airbnb.lottie.wireman.dern("BaseLayer#setProgress");
        }
    }

    public final void impassible(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar, redevelopment.attabal<Integer, Integer> attabalVar2) {
        arytenoidectomy.triweekly(canvas, this.f16123taiyuan, this.f16126wireman);
        canvas.drawRect(this.f16123taiyuan, this.f16126wireman);
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        this.f16126wireman.setAlpha((int) (attabalVar2.impromptu().intValue() * 2.55f));
        canvas.drawPath(this.f16100attabal, this.f16101beachfront);
        canvas.restore();
    }

    @Override // kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        this.f16123taiyuan.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        molybdenite();
        this.f16113kowloon.set(matrix);
        if (z) {
            List<attabal> list = this.f16107dovishness;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16113kowloon.preConcat(this.f16107dovishness.get(size).f16120rotuma.taiyuan());
                }
            } else {
                attabal attabalVar = this.f16097adultoid;
                if (attabalVar != null) {
                    this.f16113kowloon.preConcat(attabalVar.f16120rotuma.taiyuan());
                }
            }
        }
        this.f16113kowloon.preConcat(this.f16120rotuma.taiyuan());
    }

    public final void kattegat(float f) {
        this.f16099arytenoidectomy.privatdozent().triweekly().attabal(this.f16116monoploid.cutely(), f);
    }

    public final void kowloon(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar, redevelopment.attabal<Integer, Integer> attabalVar2) {
        arytenoidectomy.triweekly(canvas, this.f16123taiyuan, this.f16101beachfront);
        canvas.drawRect(this.f16123taiyuan, this.f16126wireman);
        this.f16101beachfront.setAlpha((int) (attabalVar2.impromptu().intValue() * 2.55f));
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        canvas.drawPath(this.f16100attabal, this.f16101beachfront);
        canvas.restore();
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        Paint paint;
        Integer numImpromptu;
        com.airbnb.lottie.wireman.saneness(this.f16124triweekly);
        if (!this.f16119preprohormone || this.f16116monoploid.preprohormone()) {
            com.airbnb.lottie.wireman.dern(this.f16124triweekly);
            return;
        }
        molybdenite();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Layer#parentMatrix");
        }
        this.f16121saneness.reset();
        this.f16121saneness.set(matrix);
        for (int size = this.f16107dovishness.size() - 1; size >= 0; size--) {
            this.f16121saneness.preConcat(this.f16107dovishness.get(size).f16120rotuma.taiyuan());
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Layer#parentMatrix");
        }
        redevelopment.attabal<?, Integer> attabalVarApical = this.f16120rotuma.apical();
        int iIntValue = (int) ((((i / 255.0f) * ((attabalVarApical == null || (numImpromptu = attabalVarApical.impromptu()) == null) ? 100 : numImpromptu.intValue())) / 100.0f) * 255.0f);
        if (!trm() && !stratoscope() && gintrap() == LBlendMode.NORMAL) {
            this.f16121saneness.preConcat(this.f16120rotuma.taiyuan());
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("Layer#drawLayer");
            }
            adultoid(canvas, this.f16121saneness, iIntValue, attabalVar);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("Layer#drawLayer");
            }
            kattegat(com.airbnb.lottie.wireman.dern(this.f16124triweekly));
            return;
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("Layer#computeBounds");
        }
        impromptu(this.f16123taiyuan, this.f16121saneness, false);
        yemenite(this.f16123taiyuan, matrix);
        this.f16121saneness.preConcat(this.f16120rotuma.taiyuan());
        oilcan(this.f16123taiyuan, this.f16121saneness);
        this.f16105cutely.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f16106dern);
        if (!this.f16106dern.isIdentity()) {
            Matrix matrix2 = this.f16106dern;
            matrix2.invert(matrix2);
            this.f16106dern.mapRect(this.f16105cutely);
        }
        if (!this.f16123taiyuan.intersect(this.f16105cutely)) {
            this.f16123taiyuan.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("Layer#computeBounds");
        }
        if (this.f16123taiyuan.width() >= 1.0f && this.f16123taiyuan.height() >= 1.0f) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("Layer#saveLayer");
            }
            this.f16126wireman.setAlpha(255);
            monroe.marial.saneness(this.f16126wireman, gintrap().toNativeBlendMode());
            arytenoidectomy.triweekly(canvas, this.f16123taiyuan, this.f16126wireman);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("Layer#saveLayer");
            }
            if (gintrap() != LBlendMode.MULTIPLY) {
                graveside(canvas);
            } else if (Build.VERSION.SDK_INT < 29) {
                if (this.f16117oilcan == null) {
                    blighty.attabal attabalVar2 = new blighty.attabal();
                    this.f16117oilcan = attabalVar2;
                    attabalVar2.setColor(-1);
                }
                RectF rectF = this.f16123taiyuan;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f16117oilcan);
            }
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("Layer#drawLayer");
            }
            adultoid(canvas, this.f16121saneness, iIntValue, attabalVar);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("Layer#drawLayer");
            }
            if (stratoscope()) {
                arytenoidectomy(canvas, this.f16121saneness);
            }
            if (trm()) {
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.saneness("Layer#drawMatte");
                    com.airbnb.lottie.wireman.saneness("Layer#saveLayer");
                }
                arytenoidectomy.kowloon(canvas, this.f16123taiyuan, this.f16102competently, 19);
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.dern("Layer#saveLayer");
                }
                graveside(canvas);
                this.f16110graveside.marial(canvas, matrix, i, null);
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.saneness("Layer#restoreLayer");
                }
                canvas.restore();
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.dern("Layer#restoreLayer");
                    com.airbnb.lottie.wireman.dern("Layer#drawMatte");
                }
            }
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.saneness("Layer#restoreLayer");
            }
            canvas.restore();
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("Layer#restoreLayer");
            }
        }
        if (this.f16103cord && (paint = this.f16104cuirassed) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f16104cuirassed.setColor(-251901);
            this.f16104cuirassed.setStrokeWidth(4.0f);
            canvas.drawRect(this.f16123taiyuan, this.f16104cuirassed);
            this.f16104cuirassed.setStyle(Paint.Style.FILL);
            this.f16104cuirassed.setColor(1357638635);
            canvas.drawRect(this.f16123taiyuan, this.f16104cuirassed);
        }
        kattegat(com.airbnb.lottie.wireman.dern(this.f16124triweekly));
    }

    public void merc(attabal attabalVar) {
        this.f16110graveside = attabalVar;
    }

    public final void molybdenite() {
        if (this.f16107dovishness != null) {
            return;
        }
        if (this.f16097adultoid == null) {
            this.f16107dovishness = Collections.EMPTY_LIST;
            return;
        }
        this.f16107dovishness = new ArrayList();
        for (attabal attabalVar = this.f16097adultoid; attabalVar != null; attabalVar = attabalVar.f16097adultoid) {
            this.f16107dovishness.add(attabalVar);
        }
    }

    public final void monoploid(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar) {
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        canvas.drawPath(this.f16100attabal, this.f16101beachfront);
    }

    public final void oilcan(RectF rectF, Matrix matrix) {
        this.f16098apical.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (stratoscope()) {
            int size = this.f16118polloi.saneness().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.f16118polloi.saneness().get(i);
                Path pathImpromptu = this.f16118polloi.attabal().get(i).impromptu();
                if (pathImpromptu != null) {
                    this.f16100attabal.set(pathImpromptu);
                    this.f16100attabal.transform(matrix);
                    int i2 = C0147attabal.f16128saneness[mask.attabal().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.wireman()) {
                        return;
                    }
                    this.f16100attabal.computeBounds(this.f16111impassible, false);
                    if (i == 0) {
                        this.f16098apical.set(this.f16111impassible);
                    } else {
                        RectF rectF2 = this.f16098apical;
                        rectF2.set(Math.min(rectF2.left, this.f16111impassible.left), Math.min(this.f16098apical.top, this.f16111impassible.top), Math.max(this.f16098apical.right, this.f16111impassible.right), Math.max(this.f16098apical.bottom, this.f16111impassible.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f16098apical)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void polder(boolean z) {
        if (z && this.f16104cuirassed == null) {
            this.f16104cuirassed = new blighty.attabal();
        }
        this.f16103cord = z;
    }

    public final boolean polloi() {
        if (this.f16118polloi.attabal().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f16118polloi.saneness().size(); i++) {
            if (this.f16118polloi.saneness().get(i).attabal() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public BlurMaskFilter preprohormone(float f) {
        if (this.f16122stratoscope == f) {
            return this.f16125trm;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f16125trm = blurMaskFilter;
        this.f16122stratoscope = f;
        return blurMaskFilter;
    }

    public final void privatdozent() {
        if (this.f16116monoploid.beachfront().isEmpty()) {
            saran(true);
            return;
        }
        wireman wiremanVar = new wireman(this.f16116monoploid.beachfront());
        this.f16115molybdenite = wiremanVar;
        wiremanVar.impassible();
        this.f16115molybdenite.attabal(new redevelopment.attabal.saneness() { // from class: pact.attabal
            @Override // redevelopment.attabal.saneness
            public final void attabal() {
                com.airbnb.lottie.model.layer.attabal attabalVar = this.f34933attabal;
                attabalVar.saran(attabalVar.f16115molybdenite.polloi() == 1.0f);
            }
        });
        saran(this.f16115molybdenite.impromptu().floatValue() == 1.0f);
        cutely(this.f16115molybdenite);
    }

    public euhemerize.attabal rotuma() {
        return this.f16116monoploid.saneness();
    }

    public final void saran(boolean z) {
        if (z != this.f16119preprohormone) {
            this.f16119preprohormone = z;
            sealless();
        }
    }

    public final void sealless() {
        this.f16099arytenoidectomy.invalidateSelf();
    }

    public void seminary(attabal attabalVar) {
        this.f16097adultoid = attabalVar;
    }

    public boolean stratoscope() {
        impromptu impromptuVar = this.f16118polloi;
        return (impromptuVar == null || impromptuVar.attabal().isEmpty()) ? false : true;
    }

    public void supplicat(redevelopment.attabal<?, ?> attabalVar) {
        this.f16109gintrap.remove(attabalVar);
    }

    public final void triweekly(Canvas canvas, Matrix matrix, redevelopment.attabal<taiyuan, Path> attabalVar, redevelopment.attabal<Integer, Integer> attabalVar2) {
        arytenoidectomy.triweekly(canvas, this.f16123taiyuan, this.f16114marial);
        canvas.drawRect(this.f16123taiyuan, this.f16126wireman);
        this.f16101beachfront.setAlpha((int) (attabalVar2.impromptu().intValue() * 2.55f));
        this.f16100attabal.set(attabalVar.impromptu());
        this.f16100attabal.transform(matrix);
        canvas.drawPath(this.f16100attabal, this.f16101beachfront);
        canvas.restore();
    }

    public boolean trm() {
        return this.f16110graveside != null;
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        this.f16120rotuma.beachfront(t, dernVar);
    }

    public final void yemenite(RectF rectF, Matrix matrix) {
        if (trm() && this.f16116monoploid.taiyuan() != Layer.MatteType.INVERT) {
            this.f16108formularize.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f16110graveside.impromptu(this.f16108formularize, matrix, true);
            if (rectF.intersect(this.f16108formularize)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // kinesic.dern
    public void saneness(List<kinesic.dern> list, List<kinesic.dern> list2) {
    }

    public void restrictive(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
    }
}
