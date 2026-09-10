package kinesic;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon implements redevelopment.attabal.saneness, apical, impassible {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final redevelopment.attabal<?, PointF> f29230beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final redevelopment.attabal<?, Float> f29231competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f29232cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f29233dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final redevelopment.attabal<?, PointF> f29235marial;
    private final String name;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LottieDrawable f29238wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f29229attabal = new Path();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final RectF f29236saneness = new RectF();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final saneness f29234impromptu = new saneness();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public redevelopment.attabal<Float, Float> f29237taiyuan = null;

    public kowloon(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.beachfront beachfrontVar) {
        this.name = beachfrontVar.dern();
        this.f29233dern = beachfrontVar.beachfront();
        this.f29238wireman = lottieDrawable;
        redevelopment.attabal<PointF, PointF> attabalVarAttabal = beachfrontVar.wireman().attabal();
        this.f29235marial = attabalVarAttabal;
        redevelopment.attabal<PointF, PointF> attabalVarAttabal2 = beachfrontVar.marial().attabal();
        this.f29230beachfront = attabalVarAttabal2;
        redevelopment.wireman wiremanVarAttabal = beachfrontVar.saneness().attabal();
        this.f29231competently = wiremanVarAttabal;
        attabalVar.cutely(attabalVarAttabal);
        attabalVar.cutely(attabalVarAttabal2);
        attabalVar.cutely(wiremanVarAttabal);
        attabalVarAttabal.attabal(this);
        attabalVarAttabal2.attabal(this);
        wiremanVarAttabal.attabal(this);
    }

    private void taiyuan() {
        this.f29232cutely = false;
        this.f29238wireman.invalidateSelf();
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
        redevelopment.attabal<Float, Float> attabalVar;
        if (this.f29232cutely) {
            return this.f29229attabal;
        }
        this.f29229attabal.reset();
        if (this.f29233dern) {
            this.f29232cutely = true;
            return this.f29229attabal;
        }
        PointF pointFImpromptu = this.f29230beachfront.impromptu();
        float f = pointFImpromptu.x / 2.0f;
        float f2 = pointFImpromptu.y / 2.0f;
        redevelopment.attabal<?, Float> attabalVar2 = this.f29231competently;
        float fPolloi = attabalVar2 == null ? 0.0f : ((redevelopment.wireman) attabalVar2).polloi();
        if (fPolloi == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (attabalVar = this.f29237taiyuan) != null) {
            fPolloi = Math.min(attabalVar.impromptu().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fPolloi > fMin) {
            fPolloi = fMin;
        }
        PointF pointFImpromptu2 = this.f29235marial.impromptu();
        this.f29229attabal.moveTo(pointFImpromptu2.x + f, (pointFImpromptu2.y - f2) + fPolloi);
        this.f29229attabal.lineTo(pointFImpromptu2.x + f, (pointFImpromptu2.y + f2) - fPolloi);
        if (fPolloi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF = this.f29236saneness;
            float f3 = pointFImpromptu2.x;
            float f4 = fPolloi * 2.0f;
            float f5 = pointFImpromptu2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f29229attabal.arcTo(this.f29236saneness, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        }
        this.f29229attabal.lineTo((pointFImpromptu2.x - f) + fPolloi, pointFImpromptu2.y + f2);
        if (fPolloi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF2 = this.f29236saneness;
            float f6 = pointFImpromptu2.x;
            float f7 = pointFImpromptu2.y;
            float f8 = fPolloi * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f29229attabal.arcTo(this.f29236saneness, 90.0f, 90.0f, false);
        }
        this.f29229attabal.lineTo(pointFImpromptu2.x - f, (pointFImpromptu2.y - f2) + fPolloi);
        if (fPolloi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF3 = this.f29236saneness;
            float f9 = pointFImpromptu2.x;
            float f10 = pointFImpromptu2.y;
            float f11 = fPolloi * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f29229attabal.arcTo(this.f29236saneness, 180.0f, 90.0f, false);
        }
        this.f29229attabal.lineTo((pointFImpromptu2.x + f) - fPolloi, pointFImpromptu2.y - f2);
        if (fPolloi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF4 = this.f29236saneness;
            float f12 = pointFImpromptu2.x;
            float f13 = fPolloi * 2.0f;
            float f14 = pointFImpromptu2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f29229attabal.arcTo(this.f29236saneness, 270.0f, 90.0f, false);
        }
        this.f29229attabal.close();
        this.f29234impromptu.saneness(this.f29229attabal);
        this.f29232cutely = true;
        return this.f29229attabal;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        for (int i = 0; i < list.size(); i++) {
            dern dernVar = list.get(i);
            if (dernVar instanceof adultoid) {
                adultoid adultoidVar = (adultoid) dernVar;
                if (adultoidVar.apical() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f29234impromptu.attabal(adultoidVar);
                    adultoidVar.wireman(this);
                } else if (dernVar instanceof monoploid) {
                    this.f29237taiyuan = ((monoploid) dernVar).taiyuan();
                }
            } else if (dernVar instanceof monoploid) {
                this.f29237taiyuan = ((monoploid) dernVar).taiyuan();
            }
        }
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15923formularize) {
            this.f29230beachfront.kowloon(dernVar);
        } else if (t == creditor.f15951triweekly) {
            this.f29235marial.kowloon(dernVar);
        } else if (t == creditor.f15928impassible) {
            this.f29231competently.kowloon(dernVar);
        }
    }
}
