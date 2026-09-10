package kinesic;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class competently implements marial, redevelopment.attabal.saneness, apical {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f29189apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f29190attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final redevelopment.attabal<Integer, Integer> f29191beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final redevelopment.attabal<Integer, Integer> f29192competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public redevelopment.attabal<Float, Float> f29193cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f29194dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f29195impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<impassible> f29196marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Paint f29197saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final LottieDrawable f29198taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f29199wireman;

    public competently(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.cutely cutelyVar) {
        Path path = new Path();
        this.f29190attabal = path;
        this.f29197saneness = new blighty.attabal(1);
        this.f29196marial = new ArrayList();
        this.f29194dern = attabalVar;
        this.name = cutelyVar.wireman();
        this.f29199wireman = cutelyVar.beachfront();
        this.f29198taiyuan = lottieDrawable;
        if (attabalVar.rotuma() != null) {
            redevelopment.wireman wiremanVarAttabal = attabalVar.rotuma().attabal().attabal();
            this.f29193cutely = wiremanVarAttabal;
            wiremanVarAttabal.attabal(this);
            attabalVar.cutely(this.f29193cutely);
        }
        if (cutelyVar.saneness() == null || cutelyVar.marial() == null) {
            this.f29191beachfront = null;
            this.f29192competently = null;
            return;
        }
        path.setFillType(cutelyVar.dern());
        redevelopment.attabal<Integer, Integer> attabalVarAttabal = cutelyVar.saneness().attabal();
        this.f29191beachfront = attabalVarAttabal;
        attabalVarAttabal.attabal(this);
        attabalVar.cutely(attabalVarAttabal);
        redevelopment.attabal<Integer, Integer> attabalVarAttabal2 = cutelyVar.marial().attabal();
        this.f29192competently = attabalVarAttabal2;
        attabalVarAttabal2.attabal(this);
        attabalVar.cutely(attabalVarAttabal2);
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29198taiyuan.invalidateSelf();
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
        this.f29190attabal.reset();
        for (int i = 0; i < this.f29196marial.size(); i++) {
            this.f29190attabal.addPath(this.f29196marial.get(i).getPath(), matrix);
        }
        this.f29190attabal.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f29199wireman) {
            return;
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("FillContent#draw");
        }
        int iPolloi = ((redevelopment.saneness) this.f29191beachfront).polloi();
        float fIntValue = this.f29192competently.impromptu().intValue() / 100.0f;
        this.f29197saneness.setColor((utwa.apical.dern((int) (i * fIntValue), 0, 255) << 24) | (iPolloi & 16777215));
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar2 = this.f29195impromptu;
        if (attabalVar2 != null) {
            this.f29197saneness.setColorFilter(attabalVar2.impromptu());
        }
        redevelopment.attabal<Float, Float> attabalVar3 = this.f29193cutely;
        if (attabalVar3 != null) {
            float fFloatValue = attabalVar3.impromptu().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f29197saneness.setMaskFilter(null);
            } else if (fFloatValue != this.f29189apical) {
                this.f29197saneness.setMaskFilter(this.f29194dern.preprohormone(fFloatValue));
            }
            this.f29189apical = fFloatValue;
        }
        if (attabalVar != null) {
            attabalVar.dern((int) (fIntValue * 255.0f), this.f29197saneness);
        } else {
            this.f29197saneness.clearShadowLayer();
        }
        this.f29190attabal.reset();
        for (int i2 = 0; i2 < this.f29196marial.size(); i2++) {
            this.f29190attabal.addPath(this.f29196marial.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.f29190attabal, this.f29197saneness);
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("FillContent#draw");
        }
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        for (int i = 0; i < list2.size(); i++) {
            dern dernVar = list2.get(i);
            if (dernVar instanceof impassible) {
                this.f29196marial.add((impassible) dernVar);
            }
        }
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15914attabal) {
            this.f29191beachfront.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15954wireman) {
            this.f29192competently.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15944saran) {
            redevelopment.attabal<ColorFilter, ColorFilter> attabalVar = this.f29195impromptu;
            if (attabalVar != null) {
                this.f29194dern.supplicat(attabalVar);
            }
            if (dernVar == null) {
                this.f29195impromptu = null;
                return;
            }
            redevelopment.graveside gravesideVar = new redevelopment.graveside(dernVar);
            this.f29195impromptu = gravesideVar;
            gravesideVar.attabal(this);
            this.f29194dern.cutely(this.f29195impromptu);
            return;
        }
        if (t == creditor.f15920cutely) {
            redevelopment.attabal<Float, Float> attabalVar2 = this.f29193cutely;
            if (attabalVar2 != null) {
                attabalVar2.kowloon(dernVar);
                return;
            }
            redevelopment.graveside gravesideVar2 = new redevelopment.graveside(dernVar);
            this.f29193cutely = gravesideVar2;
            gravesideVar2.attabal(this);
            this.f29194dern.cutely(this.f29193cutely);
        }
    }
}
