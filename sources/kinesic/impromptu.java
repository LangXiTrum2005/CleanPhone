package kinesic;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.gintrap;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.GradientType;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu implements marial, redevelopment.attabal.saneness, apical {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final redevelopment.attabal<Integer, Integer> f29210apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final LottieDrawable f29211arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f29212attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Paint f29213beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final RectF f29214competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final redevelopment.attabal<euhemerize.wireman, euhemerize.wireman> f29215cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final redevelopment.attabal<PointF, PointF> f29217formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final redevelopment.attabal<PointF, PointF> f29218impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final List<impassible> f29219impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public redevelopment.graveside f29220kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Path f29221marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f29222molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f29223monoploid;
    private final String name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public redevelopment.attabal<Float, Float> f29224polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f29225saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final GradientType f29226taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f29227triweekly;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final gintrap<LinearGradient> f29216dern = new gintrap<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final gintrap<RadialGradient> f29228wireman = new gintrap<>();

    public impromptu(LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.marial marialVar) {
        Path path = new Path();
        this.f29221marial = path;
        this.f29213beachfront = new blighty.attabal(1);
        this.f29214competently = new RectF();
        this.f29219impromptu = new ArrayList();
        this.f29222molybdenite = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f29225saneness = attabalVar;
        this.name = marialVar.beachfront();
        this.f29212attabal = marialVar.taiyuan();
        this.f29211arytenoidectomy = lottieDrawable;
        this.f29226taiyuan = marialVar.marial();
        path.setFillType(marialVar.dern());
        this.f29223monoploid = (int) (impromptuVar.wireman() / 32.0f);
        redevelopment.attabal<euhemerize.wireman, euhemerize.wireman> attabalVarAttabal = marialVar.wireman().attabal();
        this.f29215cutely = attabalVarAttabal;
        attabalVarAttabal.attabal(this);
        attabalVar.cutely(attabalVarAttabal);
        redevelopment.attabal<Integer, Integer> attabalVarAttabal2 = marialVar.competently().attabal();
        this.f29210apical = attabalVarAttabal2;
        attabalVarAttabal2.attabal(this);
        attabalVar.cutely(attabalVarAttabal2);
        redevelopment.attabal<PointF, PointF> attabalVarAttabal3 = marialVar.impromptu().attabal();
        this.f29217formularize = attabalVarAttabal3;
        attabalVarAttabal3.attabal(this);
        attabalVar.cutely(attabalVarAttabal3);
        redevelopment.attabal<PointF, PointF> attabalVarAttabal4 = marialVar.saneness().attabal();
        this.f29218impassible = attabalVarAttabal4;
        attabalVarAttabal4.attabal(this);
        attabalVar.cutely(attabalVarAttabal4);
        if (attabalVar.rotuma() != null) {
            redevelopment.wireman wiremanVarAttabal = attabalVar.rotuma().attabal().attabal();
            this.f29224polloi = wiremanVarAttabal;
            wiremanVarAttabal.attabal(this);
            attabalVar.cutely(this.f29224polloi);
        }
    }

    private LinearGradient apical() {
        float[] fArr;
        int[] iArr;
        long jCutely = cutely();
        LinearGradient linearGradientMarial = this.f29216dern.marial(jCutely);
        if (linearGradientMarial != null) {
            return linearGradientMarial;
        }
        PointF pointFImpromptu = this.f29217formularize.impromptu();
        PointF pointFImpromptu2 = this.f29218impassible.impromptu();
        euhemerize.wireman wiremanVarImpromptu = this.f29215cutely.impromptu();
        int[] iArrTaiyuan = taiyuan(wiremanVarImpromptu.wireman());
        float[] fArrMarial = wiremanVarImpromptu.marial();
        if (iArrTaiyuan.length < 2) {
            iArr = new int[]{iArrTaiyuan[0], iArrTaiyuan[0]};
            fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        } else {
            fArr = fArrMarial;
            iArr = iArrTaiyuan;
        }
        LinearGradient linearGradient = new LinearGradient(pointFImpromptu.x, pointFImpromptu.y, pointFImpromptu2.x, pointFImpromptu2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f29216dern.taiyuan(jCutely, linearGradient);
        return linearGradient;
    }

    private int cutely() {
        int iRound = Math.round(this.f29217formularize.beachfront() * this.f29223monoploid);
        int iRound2 = Math.round(this.f29218impassible.beachfront() * this.f29223monoploid);
        int iRound3 = Math.round(this.f29215cutely.beachfront() * this.f29223monoploid);
        int i = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private RadialGradient formularize() {
        float[] fArr;
        int[] iArr;
        long jCutely = cutely();
        RadialGradient radialGradientMarial = this.f29228wireman.marial(jCutely);
        if (radialGradientMarial != null) {
            return radialGradientMarial;
        }
        PointF pointFImpromptu = this.f29217formularize.impromptu();
        PointF pointFImpromptu2 = this.f29218impassible.impromptu();
        euhemerize.wireman wiremanVarImpromptu = this.f29215cutely.impromptu();
        int[] iArrTaiyuan = taiyuan(wiremanVarImpromptu.wireman());
        float[] fArrMarial = wiremanVarImpromptu.marial();
        if (iArrTaiyuan.length < 2) {
            iArr = new int[]{iArrTaiyuan[0], iArrTaiyuan[0]};
            fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        } else {
            fArr = fArrMarial;
            iArr = iArrTaiyuan;
        }
        float f = pointFImpromptu.x;
        float f2 = pointFImpromptu.y;
        float fHypot = (float) Math.hypot(pointFImpromptu2.x - f, pointFImpromptu2.y - f2);
        if (fHypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f29228wireman.taiyuan(jCutely, radialGradient);
        return radialGradient;
    }

    private int[] taiyuan(int[] iArr) {
        redevelopment.graveside gravesideVar = this.f29220kowloon;
        if (gravesideVar != null) {
            Integer[] numArr = (Integer[]) gravesideVar.impromptu();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29211arytenoidectomy.invalidateSelf();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        utwa.apical.apical(wiremanVar, i, list, wiremanVar2, this);
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        this.f29221marial.reset();
        for (int i = 0; i < this.f29219impromptu.size(); i++) {
            this.f29221marial.addPath(this.f29219impromptu.get(i).getPath(), matrix);
        }
        this.f29221marial.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f29212attabal) {
            return;
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("GradientFillContent#draw");
        }
        this.f29221marial.reset();
        for (int i2 = 0; i2 < this.f29219impromptu.size(); i2++) {
            this.f29221marial.addPath(this.f29219impromptu.get(i2).getPath(), matrix);
        }
        this.f29221marial.computeBounds(this.f29214competently, false);
        Shader shaderApical = this.f29226taiyuan == GradientType.LINEAR ? apical() : formularize();
        shaderApical.setLocalMatrix(matrix);
        this.f29213beachfront.setShader(shaderApical);
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar2 = this.f29227triweekly;
        if (attabalVar2 != null) {
            this.f29213beachfront.setColorFilter(attabalVar2.impromptu());
        }
        redevelopment.attabal<Float, Float> attabalVar3 = this.f29224polloi;
        if (attabalVar3 != null) {
            float fFloatValue = attabalVar3.impromptu().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f29213beachfront.setMaskFilter(null);
            } else if (fFloatValue != this.f29222molybdenite) {
                this.f29213beachfront.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f29222molybdenite = fFloatValue;
        }
        float fIntValue = this.f29210apical.impromptu().intValue() / 100.0f;
        this.f29213beachfront.setAlpha(utwa.apical.dern((int) (i * fIntValue), 0, 255));
        if (attabalVar != null) {
            attabalVar.dern((int) (fIntValue * 255.0f), this.f29213beachfront);
        }
        canvas.drawPath(this.f29221marial, this.f29213beachfront);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("GradientFillContent#draw");
        }
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        for (int i = 0; i < list2.size(); i++) {
            dern dernVar = list2.get(i);
            if (dernVar instanceof impassible) {
                this.f29219impromptu.add((impassible) dernVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15954wireman) {
            this.f29210apical.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15944saran) {
            redevelopment.attabal<ColorFilter, ColorFilter> attabalVar = this.f29227triweekly;
            if (attabalVar != null) {
                this.f29225saneness.supplicat(attabalVar);
            }
            if (dernVar == null) {
                this.f29227triweekly = null;
                return;
            }
            redevelopment.graveside gravesideVar = new redevelopment.graveside(dernVar);
            this.f29227triweekly = gravesideVar;
            gravesideVar.attabal(this);
            this.f29225saneness.cutely(this.f29227triweekly);
            return;
        }
        if (t != creditor.f15940privatdozent) {
            if (t == creditor.f15920cutely) {
                redevelopment.attabal<Float, Float> attabalVar2 = this.f29224polloi;
                if (attabalVar2 != null) {
                    attabalVar2.kowloon(dernVar);
                    return;
                }
                redevelopment.graveside gravesideVar2 = new redevelopment.graveside(dernVar);
                this.f29224polloi = gravesideVar2;
                gravesideVar2.attabal(this);
                this.f29225saneness.cutely(this.f29224polloi);
                return;
            }
            return;
        }
        redevelopment.graveside gravesideVar3 = this.f29220kowloon;
        if (gravesideVar3 != null) {
            this.f29225saneness.supplicat(gravesideVar3);
        }
        if (dernVar == null) {
            this.f29220kowloon = null;
            return;
        }
        this.f29216dern.attabal();
        this.f29228wireman.attabal();
        redevelopment.graveside gravesideVar4 = new redevelopment.graveside(dernVar);
        this.f29220kowloon = gravesideVar4;
        gravesideVar4.attabal(this);
        this.f29225saneness.cutely(this.f29220kowloon);
    }
}
