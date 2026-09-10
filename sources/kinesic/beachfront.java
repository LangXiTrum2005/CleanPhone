package kinesic;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront implements impassible, redevelopment.attabal.saneness, apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f29182attabal = new Path();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final saneness f29183beachfront = new saneness();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f29184competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final redevelopment.attabal<?, PointF> f29185dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final euhemerize.saneness f29186marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LottieDrawable f29187saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final redevelopment.attabal<?, PointF> f29188wireman;

    public beachfront(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.saneness sanenessVar) {
        this.name = sanenessVar.saneness();
        this.f29187saneness = lottieDrawable;
        redevelopment.attabal<PointF, PointF> attabalVarAttabal = sanenessVar.wireman().attabal();
        this.f29185dern = attabalVarAttabal;
        redevelopment.attabal<PointF, PointF> attabalVarAttabal2 = sanenessVar.dern().attabal();
        this.f29188wireman = attabalVarAttabal2;
        this.f29186marial = sanenessVar;
        attabalVar.cutely(attabalVarAttabal);
        attabalVar.cutely(attabalVarAttabal2);
        attabalVarAttabal.attabal(this);
        attabalVarAttabal2.attabal(this);
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        taiyuan();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        utwa.apical.apical(wiremanVar, i, list, wiremanVar2, this);
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.impassible
    public Path getPath() {
        if (this.f29184competently) {
            return this.f29182attabal;
        }
        this.f29182attabal.reset();
        if (this.f29186marial.marial()) {
            this.f29184competently = true;
            return this.f29182attabal;
        }
        PointF pointFImpromptu = this.f29185dern.impromptu();
        float f = pointFImpromptu.x / 2.0f;
        float f2 = pointFImpromptu.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f29182attabal.reset();
        if (this.f29186marial.beachfront()) {
            float f5 = -f2;
            this.f29182attabal.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            Path path = this.f29182attabal;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f7 = -f;
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path.cubicTo(f6, f5, f7, f8, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path2 = this.f29182attabal;
            float f9 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path2.cubicTo(f7, f9, f6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path3 = this.f29182attabal;
            float f10 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path3.cubicTo(f10, f2, f, f9, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f29182attabal.cubicTo(f, f8, f10, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
        } else {
            float f11 = -f2;
            this.f29182attabal.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            Path path4 = this.f29182attabal;
            float f12 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path4.cubicTo(f12, f11, f, f13, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path5 = this.f29182attabal;
            float f14 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path5.cubicTo(f, f14, f12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path6 = this.f29182attabal;
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f16 = -f;
            path6.cubicTo(f15, f2, f16, f14, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f29182attabal.cubicTo(f16, f13, f15, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        }
        PointF pointFImpromptu2 = this.f29188wireman.impromptu();
        this.f29182attabal.offset(pointFImpromptu2.x, pointFImpromptu2.y);
        this.f29182attabal.close();
        this.f29183beachfront.saneness(this.f29182attabal);
        this.f29184competently = true;
        return this.f29182attabal;
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        for (int i = 0; i < list.size(); i++) {
            dern dernVar = list.get(i);
            if (dernVar instanceof adultoid) {
                adultoid adultoidVar = (adultoid) dernVar;
                if (adultoidVar.apical() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f29183beachfront.attabal(adultoidVar);
                    adultoidVar.wireman(this);
                }
            }
        }
    }

    public final void taiyuan() {
        this.f29184competently = false;
        this.f29187saneness.invalidateSelf();
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15912apical) {
            this.f29185dern.kowloon(dernVar);
        } else if (t == creditor.f15951triweekly) {
            this.f29188wireman.kowloon(dernVar);
        }
    }
}
