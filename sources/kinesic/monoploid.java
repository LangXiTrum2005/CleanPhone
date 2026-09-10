package kinesic;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RoundedCornersContent.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid implements molybdenite, redevelopment.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final LottieDrawable f29239attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public euhemerize.taiyuan f29240dern;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final redevelopment.attabal<Float, Float> f29241saneness;

    public monoploid(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.impromptu impromptuVar) {
        this.f29239attabal = lottieDrawable;
        this.name = impromptuVar.dern();
        redevelopment.attabal<Float, Float> attabalVarAttabal = impromptuVar.saneness().attabal();
        this.f29241saneness = attabalVarAttabal;
        attabalVar.cutely(attabalVarAttabal);
        attabalVarAttabal.attabal(this);
    }

    public static int competently(int i, int i2) {
        return i - (wireman(i, i2) * i2);
    }

    public static int wireman(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29239attabal.invalidateSelf();
    }

    @Override // kinesic.molybdenite
    public void beachfront(redevelopment.attabal.saneness sanenessVar) {
        this.f29241saneness.attabal(sanenessVar);
    }

    public final euhemerize.taiyuan cutely(euhemerize.taiyuan taiyuanVar) {
        List<lamplit.attabal> listAttabal = taiyuanVar.attabal();
        boolean zWireman = taiyuanVar.wireman();
        int size = listAttabal.size() - 1;
        int i = 0;
        while (size >= 0) {
            lamplit.attabal attabalVar = listAttabal.get(size);
            lamplit.attabal attabalVar2 = listAttabal.get(competently(size - 1, listAttabal.size()));
            PointF pointFDern = (size != 0 || zWireman) ? attabalVar2.dern() : taiyuanVar.saneness();
            i = (((size != 0 || zWireman) ? attabalVar2.saneness() : pointFDern).equals(pointFDern) && attabalVar.attabal().equals(pointFDern) && !(!taiyuanVar.wireman() && (size == 0 || size == listAttabal.size() - 1))) ? i + 2 : i + 1;
            size--;
        }
        euhemerize.taiyuan taiyuanVar2 = this.f29240dern;
        if (taiyuanVar2 == null || taiyuanVar2.attabal().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new lamplit.attabal());
            }
            this.f29240dern = new euhemerize.taiyuan(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList);
        }
        this.f29240dern.marial(zWireman);
        return this.f29240dern;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // kinesic.molybdenite
    public euhemerize.taiyuan dern(euhemerize.taiyuan taiyuanVar) {
        boolean z;
        List<lamplit.attabal> listAttabal = taiyuanVar.attabal();
        if (listAttabal.size() > 2) {
            float fFloatValue = this.f29241saneness.impromptu().floatValue();
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                euhemerize.taiyuan taiyuanVarCutely = cutely(taiyuanVar);
                taiyuanVarCutely.beachfront(taiyuanVar.saneness().x, taiyuanVar.saneness().y);
                List<lamplit.attabal> listAttabal2 = taiyuanVarCutely.attabal();
                boolean zWireman = taiyuanVar.wireman();
                int i = 0;
                int i2 = 0;
                while (i < listAttabal.size()) {
                    lamplit.attabal attabalVar = listAttabal.get(i);
                    lamplit.attabal attabalVar2 = listAttabal.get(competently(i - 1, listAttabal.size()));
                    lamplit.attabal attabalVar3 = listAttabal.get(competently(i - 2, listAttabal.size()));
                    PointF pointFDern = (i != 0 || zWireman) ? attabalVar2.dern() : taiyuanVar.saneness();
                    PointF pointFSaneness = (i != 0 || zWireman) ? attabalVar2.saneness() : pointFDern;
                    PointF pointFAttabal = attabalVar.attabal();
                    PointF pointFDern2 = attabalVar3.dern();
                    PointF pointFDern3 = attabalVar.dern();
                    if (taiyuanVar.wireman()) {
                        z = false;
                    } else {
                        z = true;
                        if (i != 0 && i != listAttabal.size() - 1) {
                            z = false;
                        }
                    }
                    if (pointFSaneness.equals(pointFDern) && pointFAttabal.equals(pointFDern) && !z) {
                        float f = pointFDern.x;
                        float f2 = f - pointFDern2.x;
                        float f3 = pointFDern.y;
                        float f4 = f3 - pointFDern2.y;
                        float f5 = pointFDern3.x - f;
                        float f6 = pointFDern3.y - f3;
                        float fHypot = (float) Math.hypot(f2, f4);
                        float fHypot2 = (float) Math.hypot(f5, f6);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f7 = pointFDern.x;
                        float f8 = ((pointFDern2.x - f7) * fMin) + f7;
                        float f9 = pointFDern.y;
                        float f10 = ((pointFDern2.y - f9) * fMin) + f9;
                        float f11 = ((pointFDern3.x - f7) * fMin2) + f7;
                        float f12 = ((pointFDern3.y - f9) * fMin2) + f9;
                        float f13 = f8 - ((f8 - f7) * 0.5519f);
                        float f14 = f10 - ((f10 - f9) * 0.5519f);
                        float f15 = f11 - ((f11 - f7) * 0.5519f);
                        float f16 = f12 - ((f12 - f9) * 0.5519f);
                        lamplit.attabal attabalVar4 = listAttabal2.get(competently(i2 - 1, listAttabal2.size()));
                        lamplit.attabal attabalVar5 = listAttabal2.get(i2);
                        attabalVar4.marial(f8, f10);
                        attabalVar4.beachfront(f8, f10);
                        if (i == 0) {
                            taiyuanVarCutely.beachfront(f8, f10);
                        }
                        attabalVar5.wireman(f13, f14);
                        lamplit.attabal attabalVar6 = listAttabal2.get(i2 + 1);
                        attabalVar5.marial(f15, f16);
                        attabalVar5.beachfront(f11, f12);
                        attabalVar6.wireman(f11, f12);
                        i2 += 2;
                    } else {
                        lamplit.attabal attabalVar7 = listAttabal2.get(competently(i2 - 1, listAttabal2.size()));
                        lamplit.attabal attabalVar8 = listAttabal2.get(i2);
                        attabalVar7.marial(attabalVar2.saneness().x, attabalVar2.saneness().y);
                        attabalVar7.beachfront(attabalVar2.dern().x, attabalVar2.dern().y);
                        attabalVar8.wireman(attabalVar.attabal().x, attabalVar.attabal().y);
                        i2++;
                    }
                    i++;
                    listAttabal = listAttabal;
                }
                return taiyuanVarCutely;
            }
        }
        return taiyuanVar;
    }

    public redevelopment.attabal<Float, Float> taiyuan() {
        return this.f29241saneness;
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
    }
}
