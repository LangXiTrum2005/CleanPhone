package kinesic;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.gintrap;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.GradientType;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan extends attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final GradientType f29249adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public redevelopment.graveside f29250cord;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final int f29251dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final redevelopment.attabal<euhemerize.wireman, euhemerize.wireman> f29252gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final RectF f29253graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final gintrap<RadialGradient> f29254molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final boolean f29255monoploid;
    private final String name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final gintrap<LinearGradient> f29256polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final redevelopment.attabal<PointF, PointF> f29257preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final redevelopment.attabal<PointF, PointF> f29258rotuma;

    public taiyuan(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, com.airbnb.lottie.model.content.attabal attabalVar2) {
        super(lottieDrawable, attabalVar, attabalVar2.saneness().toPaintCap(), attabalVar2.competently().toPaintJoin(), attabalVar2.taiyuan(), attabalVar2.apical(), attabalVar2.impassible(), attabalVar2.impromptu(), attabalVar2.dern());
        this.f29256polloi = new gintrap<>();
        this.f29254molybdenite = new gintrap<>();
        this.f29253graveside = new RectF();
        this.name = attabalVar2.cutely();
        this.f29249adultoid = attabalVar2.beachfront();
        this.f29255monoploid = attabalVar2.triweekly();
        this.f29251dovishness = (int) (lottieDrawable.privatdozent().wireman() / 32.0f);
        redevelopment.attabal<euhemerize.wireman, euhemerize.wireman> attabalVarAttabal = attabalVar2.marial().attabal();
        this.f29252gintrap = attabalVarAttabal;
        attabalVarAttabal.attabal(this);
        attabalVar.cutely(attabalVarAttabal);
        redevelopment.attabal<PointF, PointF> attabalVarAttabal2 = attabalVar2.formularize().attabal();
        this.f29258rotuma = attabalVarAttabal2;
        attabalVarAttabal2.attabal(this);
        attabalVar.cutely(attabalVarAttabal2);
        redevelopment.attabal<PointF, PointF> attabalVarAttabal3 = attabalVar2.wireman().attabal();
        this.f29257preprohormone = attabalVarAttabal3;
        attabalVarAttabal3.attabal(this);
        attabalVar.cutely(attabalVarAttabal3);
    }

    public final int[] apical(int[] iArr) {
        redevelopment.graveside gravesideVar = this.f29250cord;
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

    public final int formularize() {
        int iRound = Math.round(this.f29258rotuma.beachfront() * this.f29251dovishness);
        int iRound2 = Math.round(this.f29257preprohormone.beachfront() * this.f29251dovishness);
        int iRound3 = Math.round(this.f29252gintrap.beachfront() * this.f29251dovishness);
        int i = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    public final LinearGradient impassible() {
        long jFormularize = formularize();
        LinearGradient linearGradientMarial = this.f29256polloi.marial(jFormularize);
        if (linearGradientMarial != null) {
            return linearGradientMarial;
        }
        PointF pointFImpromptu = this.f29258rotuma.impromptu();
        PointF pointFImpromptu2 = this.f29257preprohormone.impromptu();
        euhemerize.wireman wiremanVarImpromptu = this.f29252gintrap.impromptu();
        LinearGradient linearGradient = new LinearGradient(pointFImpromptu.x, pointFImpromptu.y, pointFImpromptu2.x, pointFImpromptu2.y, apical(wiremanVarImpromptu.wireman()), wiremanVarImpromptu.marial(), Shader.TileMode.CLAMP);
        this.f29256polloi.taiyuan(jFormularize, linearGradient);
        return linearGradient;
    }

    @Override // kinesic.attabal, kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f29255monoploid) {
            return;
        }
        impromptu(this.f29253graveside, matrix, false);
        this.f29177taiyuan.setShader(this.f29249adultoid == GradientType.LINEAR ? impassible() : triweekly());
        super.marial(canvas, matrix, i, attabalVar);
    }

    public final RadialGradient triweekly() {
        long jFormularize = formularize();
        RadialGradient radialGradientMarial = this.f29254molybdenite.marial(jFormularize);
        if (radialGradientMarial != null) {
            return radialGradientMarial;
        }
        PointF pointFImpromptu = this.f29258rotuma.impromptu();
        PointF pointFImpromptu2 = this.f29257preprohormone.impromptu();
        euhemerize.wireman wiremanVarImpromptu = this.f29252gintrap.impromptu();
        int[] iArrApical = apical(wiremanVarImpromptu.wireman());
        float[] fArrMarial = wiremanVarImpromptu.marial();
        float f = pointFImpromptu.x;
        float f2 = pointFImpromptu.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointFImpromptu2.x - f, pointFImpromptu2.y - f2), iArrApical, fArrMarial, Shader.TileMode.CLAMP);
        this.f29254molybdenite.taiyuan(jFormularize, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kinesic.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        super.wireman(t, dernVar);
        if (t == creditor.f15940privatdozent) {
            redevelopment.graveside gravesideVar = this.f29250cord;
            if (gravesideVar != null) {
                this.f29167beachfront.supplicat(gravesideVar);
            }
            if (dernVar == null) {
                this.f29250cord = null;
                return;
            }
            redevelopment.graveside gravesideVar2 = new redevelopment.graveside(dernVar);
            this.f29250cord = gravesideVar2;
            gravesideVar2.attabal(this);
            this.f29167beachfront.cutely(this.f29250cord);
        }
    }
}
