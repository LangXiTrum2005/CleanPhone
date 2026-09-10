package kinesic;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements redevelopment.attabal.saneness, apical, marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final redevelopment.attabal<?, Integer> f29164apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f29165arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f29167beachfront;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final redevelopment.attabal<?, Float> f29169cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final List<redevelopment.attabal<?, Float>> f29171formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final redevelopment.attabal<?, Float> f29172impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float[] f29173impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public redevelopment.attabal<Float, Float> f29174kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final LottieDrawable f29175marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final Paint f29177taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f29178triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final PathMeasure f29166attabal = new PathMeasure();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path f29176saneness = new Path();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Path f29170dern = new Path();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RectF f29179wireman = new RectF();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final List<saneness> f29168competently = new ArrayList();

    /* JADX INFO: compiled from: BaseStrokeContent.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<impassible> f29180attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final adultoid f29181saneness;

        public saneness(adultoid adultoidVar) {
            this.f29180attabal = new ArrayList();
            this.f29181saneness = adultoidVar;
        }
    }

    public attabal(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, Paint.Cap cap, Paint.Join join, float f, inswinger.wireman wiremanVar, inswinger.saneness sanenessVar, List<inswinger.saneness> list, inswinger.saneness sanenessVar2) {
        blighty.attabal attabalVar2 = new blighty.attabal(1);
        this.f29177taiyuan = attabalVar2;
        this.f29165arytenoidectomy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f29175marial = lottieDrawable;
        this.f29167beachfront = attabalVar;
        attabalVar2.setStyle(Paint.Style.STROKE);
        attabalVar2.setStrokeCap(cap);
        attabalVar2.setStrokeJoin(join);
        attabalVar2.setStrokeMiter(f);
        this.f29164apical = wiremanVar.attabal();
        this.f29169cutely = sanenessVar.attabal();
        if (sanenessVar2 == null) {
            this.f29172impassible = null;
        } else {
            this.f29172impassible = sanenessVar2.attabal();
        }
        this.f29171formularize = new ArrayList(list.size());
        this.f29173impromptu = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f29171formularize.add(list.get(i).attabal());
        }
        attabalVar.cutely(this.f29164apical);
        attabalVar.cutely(this.f29169cutely);
        for (int i2 = 0; i2 < this.f29171formularize.size(); i2++) {
            attabalVar.cutely(this.f29171formularize.get(i2));
        }
        redevelopment.attabal<?, Float> attabalVar3 = this.f29172impassible;
        if (attabalVar3 != null) {
            attabalVar.cutely(attabalVar3);
        }
        this.f29164apical.attabal(this);
        this.f29169cutely.attabal(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f29171formularize.get(i3).attabal(this);
        }
        redevelopment.attabal<?, Float> attabalVar4 = this.f29172impassible;
        if (attabalVar4 != null) {
            attabalVar4.attabal(this);
        }
        if (attabalVar.rotuma() != null) {
            redevelopment.wireman wiremanVarAttabal = attabalVar.rotuma().attabal().attabal();
            this.f29174kowloon = wiremanVarAttabal;
            wiremanVarAttabal.attabal(this);
            attabalVar.cutely(this.f29174kowloon);
        }
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29175marial.invalidateSelf();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        utwa.apical.apical(wiremanVar, i, list, wiremanVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    public final void cutely(Canvas canvas, saneness sanenessVar) {
        float f;
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("StrokeContent#applyTrimPath");
        }
        if (sanenessVar.f29181saneness == null) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f29176saneness.reset();
        for (int size = sanenessVar.f29180attabal.size() - 1; size >= 0; size--) {
            this.f29176saneness.addPath(((impassible) sanenessVar.f29180attabal.get(size)).getPath());
        }
        float fFloatValue = sanenessVar.f29181saneness.cutely().impromptu().floatValue() / 100.0f;
        float fFloatValue2 = sanenessVar.f29181saneness.competently().impromptu().floatValue() / 100.0f;
        float fFloatValue3 = sanenessVar.f29181saneness.taiyuan().impromptu().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f29176saneness, this.f29177taiyuan);
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f29166attabal.setPath(this.f29176saneness, false);
        float length = this.f29166attabal.getLength();
        while (this.f29166attabal.nextContour()) {
            length += this.f29166attabal.getLength();
        }
        float f2 = fFloatValue3 * length;
        float f3 = (fFloatValue * length) + f2;
        float fMin = Math.min((fFloatValue2 * length) + f2, (f3 + length) - 1.0f);
        float f4 = 0.0f;
        for (int size2 = sanenessVar.f29180attabal.size() - 1; size2 >= 0; size2--) {
            this.f29170dern.set(((impassible) sanenessVar.f29180attabal.get(size2)).getPath());
            this.f29166attabal.setPath(this.f29170dern, false);
            float length2 = this.f29166attabal.getLength();
            if (fMin > length) {
                float f5 = fMin - length;
                if (f5 >= f4 + length2 || f4 >= f5) {
                    f = f4 + length2;
                    if (f < f3 && f4 <= fMin) {
                        if (f > fMin || f3 >= f4) {
                            utwa.arytenoidectomy.attabal(this.f29170dern, f3 < f4 ? 0.0f : (f3 - f4) / length2, fMin > f ? 1.0f : (fMin - f4) / length2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            canvas.drawPath(this.f29170dern, this.f29177taiyuan);
                        } else {
                            canvas.drawPath(this.f29170dern, this.f29177taiyuan);
                        }
                    }
                } else {
                    utwa.arytenoidectomy.attabal(this.f29170dern, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    canvas.drawPath(this.f29170dern, this.f29177taiyuan);
                }
            } else {
                f = f4 + length2;
                if (f < f3) {
                }
            }
            f4 += length2;
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("StrokeContent#applyTrimPath");
        }
    }

    @Override // kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("StrokeContent#getBounds");
        }
        this.f29176saneness.reset();
        for (int i = 0; i < this.f29168competently.size(); i++) {
            saneness sanenessVar = this.f29168competently.get(i);
            for (int i2 = 0; i2 < sanenessVar.f29180attabal.size(); i2++) {
                this.f29176saneness.addPath(((impassible) sanenessVar.f29180attabal.get(i2)).getPath(), matrix);
            }
        }
        this.f29176saneness.computeBounds(this.f29179wireman, false);
        float fPolloi = ((redevelopment.wireman) this.f29169cutely).polloi();
        RectF rectF2 = this.f29179wireman;
        float f = fPolloi / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f29179wireman);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("StrokeContent#getBounds");
        }
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("StrokeContent#draw");
        }
        if (utwa.arytenoidectomy.impromptu(matrix)) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f29164apical.impromptu().intValue() / 100.0f;
        this.f29177taiyuan.setAlpha(utwa.apical.dern((int) (i * fIntValue), 0, 255));
        this.f29177taiyuan.setStrokeWidth(((redevelopment.wireman) this.f29169cutely).polloi());
        if (this.f29177taiyuan.getStrokeWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("StrokeContent#draw");
                return;
            }
            return;
        }
        taiyuan();
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar2 = this.f29178triweekly;
        if (attabalVar2 != null) {
            this.f29177taiyuan.setColorFilter(attabalVar2.impromptu());
        }
        redevelopment.attabal<Float, Float> attabalVar3 = this.f29174kowloon;
        if (attabalVar3 != null) {
            float fFloatValue = attabalVar3.impromptu().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f29177taiyuan.setMaskFilter(null);
            } else if (fFloatValue != this.f29165arytenoidectomy) {
                this.f29177taiyuan.setMaskFilter(this.f29167beachfront.preprohormone(fFloatValue));
            }
            this.f29165arytenoidectomy = fFloatValue;
        }
        if (attabalVar != null) {
            attabalVar.dern((int) (fIntValue * 255.0f), this.f29177taiyuan);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i2 = 0; i2 < this.f29168competently.size(); i2++) {
            saneness sanenessVar = this.f29168competently.get(i2);
            if (sanenessVar.f29181saneness != null) {
                cutely(canvas, sanenessVar);
            } else {
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.saneness("StrokeContent#buildPath");
                }
                this.f29176saneness.reset();
                for (int size = sanenessVar.f29180attabal.size() - 1; size >= 0; size--) {
                    this.f29176saneness.addPath(((impassible) sanenessVar.f29180attabal.get(size)).getPath());
                }
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.dern("StrokeContent#buildPath");
                    com.airbnb.lottie.wireman.saneness("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f29176saneness, this.f29177taiyuan);
                if (com.airbnb.lottie.wireman.impromptu()) {
                    com.airbnb.lottie.wireman.dern("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("StrokeContent#draw");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        adultoid adultoidVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            dern dernVar = list.get(size);
            if (dernVar instanceof adultoid) {
                adultoid adultoidVar2 = (adultoid) dernVar;
                if (adultoidVar2.apical() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    adultoidVar = adultoidVar2;
                }
            }
        }
        if (adultoidVar != null) {
            adultoidVar.wireman(this);
        }
        saneness sanenessVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            dern dernVar2 = list2.get(size2);
            if (dernVar2 instanceof adultoid) {
                adultoid adultoidVar3 = (adultoid) dernVar2;
                if (adultoidVar3.apical() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (sanenessVar != null) {
                        this.f29168competently.add(sanenessVar);
                    }
                    sanenessVar = new saneness(adultoidVar3);
                    adultoidVar3.wireman(this);
                } else if (!(dernVar2 instanceof impassible)) {
                    if (sanenessVar == null) {
                        sanenessVar = new saneness(adultoidVar);
                    }
                    sanenessVar.f29180attabal.add((impassible) dernVar2);
                }
            } else if (!(dernVar2 instanceof impassible)) {
                if (sanenessVar == null) {
                    sanenessVar = new saneness(adultoidVar);
                }
                sanenessVar.f29180attabal.add((impassible) dernVar2);
            }
        }
        if (sanenessVar != null) {
            this.f29168competently.add(sanenessVar);
        }
    }

    public final void taiyuan() {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("StrokeContent#applyDashPattern");
        }
        if (this.f29171formularize.isEmpty()) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i = 0; i < this.f29171formularize.size(); i++) {
            this.f29173impromptu[i] = this.f29171formularize.get(i).impromptu().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f29173impromptu;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f29173impromptu;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
        }
        redevelopment.attabal<?, Float> attabalVar = this.f29172impassible;
        this.f29177taiyuan.setPathEffect(new DashPathEffect(this.f29173impromptu, attabalVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : attabalVar.impromptu().floatValue()));
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("StrokeContent#applyDashPattern");
        }
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15954wireman) {
            this.f29164apical.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15922dovishness) {
            this.f29169cutely.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15944saran) {
            redevelopment.attabal<ColorFilter, ColorFilter> attabalVar = this.f29178triweekly;
            if (attabalVar != null) {
                this.f29167beachfront.supplicat(attabalVar);
            }
            if (dernVar == null) {
                this.f29178triweekly = null;
                return;
            }
            redevelopment.graveside gravesideVar = new redevelopment.graveside(dernVar);
            this.f29178triweekly = gravesideVar;
            gravesideVar.attabal(this);
            this.f29167beachfront.cutely(this.f29178triweekly);
            return;
        }
        if (t == creditor.f15920cutely) {
            redevelopment.attabal<Float, Float> attabalVar2 = this.f29174kowloon;
            if (attabalVar2 != null) {
                attabalVar2.kowloon(dernVar);
                return;
            }
            redevelopment.graveside gravesideVar2 = new redevelopment.graveside(dernVar);
            this.f29174kowloon = gravesideVar2;
            gravesideVar2.attabal(this);
            this.f29167beachfront.cutely(this.f29174kowloon);
        }
    }
}
