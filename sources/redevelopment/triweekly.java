package redevelopment;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly extends attabal<PointF, PointF> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final attabal<Float, Float> f36158apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final PointF f36159cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final attabal<Float, Float> f36160formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public com.airbnb.lottie.value.dern<Float> f36161impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final PointF f36162taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public com.airbnb.lottie.value.dern<Float> f36163triweekly;

    public triweekly(attabal<Float, Float> attabalVar, attabal<Float, Float> attabalVar2) {
        super(Collections.EMPTY_LIST);
        this.f36162taiyuan = new PointF();
        this.f36159cutely = new PointF();
        this.f36158apical = attabalVar;
        this.f36160formularize = attabalVar2;
        triweekly(beachfront());
    }

    public void adultoid(com.airbnb.lottie.value.dern<Float> dernVar) {
        com.airbnb.lottie.value.dern<Float> dernVar2 = this.f36163triweekly;
        if (dernVar2 != null) {
            dernVar2.dern(null);
        }
        this.f36163triweekly = dernVar;
        if (dernVar != null) {
            dernVar.dern(this);
        }
    }

    public void graveside(com.airbnb.lottie.value.dern<Float> dernVar) {
        com.airbnb.lottie.value.dern<Float> dernVar2 = this.f36161impassible;
        if (dernVar2 != null) {
            dernVar2.dern(null);
        }
        this.f36161impassible = dernVar;
        if (dernVar != null) {
            dernVar.dern(this);
        }
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public PointF taiyuan(com.airbnb.lottie.value.attabal<PointF> attabalVar, float f) {
        Float fSaneness;
        com.airbnb.lottie.value.attabal<Float> attabalVarSaneness;
        com.airbnb.lottie.value.attabal<Float> attabalVarSaneness2;
        Float fSaneness2 = null;
        if (this.f36161impassible == null || (attabalVarSaneness2 = this.f36158apical.saneness()) == null) {
            fSaneness = null;
        } else {
            Float f2 = attabalVarSaneness2.f16253impromptu;
            com.airbnb.lottie.value.dern<Float> dernVar = this.f36161impassible;
            float f3 = attabalVarSaneness2.f16248competently;
            fSaneness = dernVar.saneness(f3, f2 == null ? f3 : f2.floatValue(), attabalVarSaneness2.f16256saneness, attabalVarSaneness2.f16250dern, this.f36158apical.wireman(), this.f36158apical.marial(), this.f36158apical.beachfront());
        }
        if (this.f36163triweekly != null && (attabalVarSaneness = this.f36160formularize.saneness()) != null) {
            Float f4 = attabalVarSaneness.f16253impromptu;
            com.airbnb.lottie.value.dern<Float> dernVar2 = this.f36163triweekly;
            float f5 = attabalVarSaneness.f16248competently;
            fSaneness2 = dernVar2.saneness(f5, f4 == null ? f5 : f4.floatValue(), attabalVarSaneness.f16256saneness, attabalVarSaneness.f16250dern, this.f36160formularize.wireman(), this.f36160formularize.marial(), this.f36160formularize.beachfront());
        }
        if (fSaneness == null) {
            this.f36159cutely.set(this.f36162taiyuan.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.f36159cutely.set(fSaneness.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (fSaneness2 == null) {
            PointF pointF = this.f36159cutely;
            pointF.set(pointF.x, this.f36162taiyuan.y);
        } else {
            PointF pointF2 = this.f36159cutely;
            pointF2.set(pointF2.x, fSaneness2.floatValue());
        }
        return this.f36159cutely;
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public PointF impromptu() {
        return taiyuan(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // redevelopment.attabal
    public void triweekly(float f) {
        this.f36158apical.triweekly(f);
        this.f36160formularize.triweekly(f);
        this.f36162taiyuan.set(this.f36158apical.impromptu().floatValue(), this.f36160formularize.impromptu().floatValue());
        for (int i = 0; i < this.f36086attabal.size(); i++) {
            this.f36086attabal.get(i).attabal();
        }
    }
}
