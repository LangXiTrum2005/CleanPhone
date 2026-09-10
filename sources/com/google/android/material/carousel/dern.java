package com.google.android.material.carousel;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: KeylineStateList.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f19880attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final float f19881beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f19882competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<saneness> f19883dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final float[] f19884marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<saneness> f19885saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float[] f19886wireman;

    /* JADX INFO: compiled from: KeylineStateList.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f19887attabal;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            f19887attabal = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public dern(saneness sanenessVar, List<saneness> list, List<saneness> list2) {
        this.f19880attabal = sanenessVar;
        this.f19885saneness = Collections.unmodifiableList(list);
        this.f19883dern = Collections.unmodifiableList(list2);
        float f = list.get(list.size() - 1).wireman().f19894attabal - sanenessVar.wireman().f19894attabal;
        this.f19881beachfront = f;
        float f2 = sanenessVar.apical().f19894attabal - list2.get(list2.size() - 1).apical().f19894attabal;
        this.f19882competently = f2;
        this.f19886wireman = impassible(f, list, true);
        this.f19884marial = impassible(f2, list2, false);
    }

    public static saneness adultoid(saneness sanenessVar, float f, int i, boolean z, float f2, CarouselStrategy.StrategyType strategyType) {
        return attabal.f19887attabal[strategyType.ordinal()] != 1 ? gintrap(sanenessVar, f, i, z) : dovishness(sanenessVar, f, i, z, f2);
    }

    public static List<saneness> arytenoidectomy(aesthesia.saneness sanenessVar, saneness sanenessVar2, float f, float f2, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sanenessVar2);
        int iDern = dern(sanenessVar2);
        int iAttabal = sanenessVar.wireman() ? sanenessVar.attabal() : sanenessVar.saneness();
        if (!monoploid(sanenessVar2) && iDern != -1) {
            int iDern2 = sanenessVar2.dern() - iDern;
            float f3 = sanenessVar2.wireman().f19900saneness - (sanenessVar2.wireman().f19901wireman / 2.0f);
            if (iDern2 <= 0 && sanenessVar2.saneness().f19895beachfront > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList.add(rotuma(sanenessVar2, f3 + sanenessVar2.saneness().f19895beachfront + f2, iAttabal));
                return arrayList;
            }
            float f4 = 0.0f;
            for (int i = 0; i < iDern2; i++) {
                saneness sanenessVar3 = (saneness) arrayList.get(arrayList.size() - 1);
                int i2 = iDern + i;
                int size = sanenessVar2.impromptu().size() - 1;
                f4 += sanenessVar2.impromptu().get(i2).f19895beachfront;
                int i3 = i2 - 1;
                if (i3 >= 0) {
                    size = saneness(sanenessVar3, sanenessVar2.impromptu().get(i3).f19897dern) - 1;
                }
                int i4 = iAttabal;
                saneness sanenessVarGraveside = graveside(sanenessVar3, iDern, size, f3 + f4, (sanenessVar2.dern() - i) - 1, (sanenessVar2.cutely() - i) - 1, i4);
                iAttabal = i4;
                if (i == iDern2 - 1 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    sanenessVarGraveside = adultoid(sanenessVarGraveside, f2, iAttabal, true, f, strategyType);
                }
                arrayList.add(sanenessVarGraveside);
            }
        } else if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList.add(adultoid(sanenessVar2, f2, iAttabal, true, f, strategyType));
        }
        return arrayList;
    }

    public static dern beachfront(aesthesia.saneness sanenessVar, saneness sanenessVar2, float f, float f2, float f3, CarouselStrategy.StrategyType strategyType) {
        return new dern(sanenessVar2, arytenoidectomy(sanenessVar, sanenessVar2, f, f2, strategyType), triweekly(sanenessVar, sanenessVar2, f, f3, strategyType));
    }

    public static int dern(saneness sanenessVar) {
        for (int i = 0; i < sanenessVar.impromptu().size(); i++) {
            if (!sanenessVar.impromptu().get(i).f19899marial) {
                return i;
            }
        }
        return -1;
    }

    public static saneness dovishness(saneness sanenessVar, float f, int i, boolean z, float f2) {
        ArrayList arrayList = new ArrayList(sanenessVar.impromptu());
        saneness.C0297saneness c0297saneness = new saneness.C0297saneness(sanenessVar.competently(), i);
        float fImpassible = f / sanenessVar.impassible();
        float f3 = z ? f : 0.0f;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            saneness.dern dernVar = (saneness.dern) arrayList.get(i2);
            if (dernVar.f19899marial) {
                c0297saneness.marial(dernVar.f19900saneness, dernVar.f19897dern, dernVar.f19901wireman, false, true, dernVar.f19895beachfront);
            } else {
                boolean z2 = i2 >= sanenessVar.dern() && i2 <= sanenessVar.cutely();
                float f4 = dernVar.f19901wireman - fImpassible;
                float fSaneness = CarouselStrategy.saneness(f4, sanenessVar.competently(), f2);
                float f5 = (f4 / 2.0f) + f3;
                float fAbs = Math.abs(f5 - dernVar.f19900saneness);
                c0297saneness.beachfront(f5, fSaneness, f4, z2, false, dernVar.f19895beachfront, z ? fAbs : 0.0f, z ? 0.0f : fAbs);
                f3 += f4;
            }
            i2++;
        }
        return c0297saneness.taiyuan();
    }

    public static saneness gintrap(saneness sanenessVar, float f, int i, boolean z) {
        ArrayList arrayList = new ArrayList(sanenessVar.impromptu());
        saneness.C0297saneness c0297saneness = new saneness.C0297saneness(sanenessVar.competently(), i);
        boolean z2 = true;
        int size = z ? 0 : arrayList.size() - 1;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            saneness.dern dernVar = (saneness.dern) arrayList.get(i2);
            if (dernVar.f19899marial && i2 == size) {
                c0297saneness.marial(dernVar.f19900saneness, dernVar.f19897dern, dernVar.f19901wireman, false, true, dernVar.f19895beachfront);
            } else {
                float f2 = dernVar.f19900saneness;
                float f3 = z ? f2 + f : f2 - f;
                float f4 = z ? f : 0.0f;
                float f5 = z ? 0.0f : f;
                boolean z3 = (i2 < sanenessVar.dern() || i2 > sanenessVar.cutely()) ? false : z2;
                float f6 = f3;
                float f7 = dernVar.f19897dern;
                float f8 = dernVar.f19901wireman;
                c0297saneness.beachfront(f6, f7, f8, z3, dernVar.f19899marial, Math.abs(z ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((f8 / 2.0f) + f6) - i) : Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6 - (f8 / 2.0f))), f4, f5);
            }
            i2++;
            z2 = true;
        }
        return c0297saneness.taiyuan();
    }

    public static saneness graveside(saneness sanenessVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(sanenessVar.impromptu());
        arrayList.add(i2, (saneness.dern) arrayList.remove(i));
        saneness.C0297saneness c0297saneness = new saneness.C0297saneness(sanenessVar.competently(), i5);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            saneness.dern dernVar = (saneness.dern) arrayList.get(i6);
            float f2 = dernVar.f19901wireman;
            c0297saneness.marial(f + (f2 / 2.0f), dernVar.f19897dern, f2, i6 >= i3 && i6 <= i4, dernVar.f19899marial, dernVar.f19895beachfront);
            f += dernVar.f19901wireman;
            i6++;
        }
        return c0297saneness.taiyuan();
    }

    public static float[] impassible(float f, List<saneness> list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            saneness sanenessVar = list.get(i2);
            saneness sanenessVar2 = list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? sanenessVar2.wireman().f19894attabal - sanenessVar.wireman().f19894attabal : sanenessVar.apical().f19894attabal - sanenessVar2.apical().f19894attabal) / f);
            i++;
        }
        return fArr;
    }

    public static float[] kowloon(List<saneness> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{phrasemonger.saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    }

    public static int marial(saneness sanenessVar) {
        for (int size = sanenessVar.impromptu().size() - 1; size >= 0; size--) {
            if (!sanenessVar.impromptu().get(size).f19899marial) {
                return size;
            }
        }
        return -1;
    }

    public static saneness molybdenite(List<saneness> list, float f, float[] fArr) {
        float[] fArrKowloon = kowloon(list, f, fArr);
        return saneness.kowloon(list.get((int) fArrKowloon[1]), list.get((int) fArrKowloon[2]), fArrKowloon[0]);
    }

    public static boolean monoploid(saneness sanenessVar) {
        return sanenessVar.saneness().f19900saneness - (sanenessVar.saneness().f19901wireman / 2.0f) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && sanenessVar.saneness() == sanenessVar.marial();
    }

    public static boolean polloi(aesthesia.saneness sanenessVar, saneness sanenessVar2) {
        int iSaneness = sanenessVar.saneness();
        if (sanenessVar.wireman()) {
            iSaneness = sanenessVar.attabal();
        }
        return sanenessVar2.taiyuan().f19900saneness + (sanenessVar2.taiyuan().f19901wireman / 2.0f) <= ((float) iSaneness) && sanenessVar2.taiyuan() == sanenessVar2.formularize();
    }

    public static saneness rotuma(saneness sanenessVar, float f, int i) {
        return graveside(sanenessVar, 0, 0, f, sanenessVar.dern(), sanenessVar.cutely(), i);
    }

    public static int saneness(saneness sanenessVar, float f) {
        for (int iCutely = sanenessVar.cutely(); iCutely < sanenessVar.impromptu().size(); iCutely++) {
            if (f == sanenessVar.impromptu().get(iCutely).f19897dern) {
                return iCutely;
            }
        }
        return sanenessVar.impromptu().size() - 1;
    }

    public static List<saneness> triweekly(aesthesia.saneness sanenessVar, saneness sanenessVar2, float f, float f2, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sanenessVar2);
        int iMarial = marial(sanenessVar2);
        int iAttabal = sanenessVar.wireman() ? sanenessVar.attabal() : sanenessVar.saneness();
        if (!polloi(sanenessVar, sanenessVar2) && iMarial != -1) {
            int iCutely = iMarial - sanenessVar2.cutely();
            float f3 = sanenessVar2.wireman().f19900saneness - (sanenessVar2.wireman().f19901wireman / 2.0f);
            if (iCutely <= 0 && sanenessVar2.taiyuan().f19895beachfront > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList.add(rotuma(sanenessVar2, (f3 - sanenessVar2.taiyuan().f19895beachfront) - f2, iAttabal));
                return arrayList;
            }
            float f4 = 0.0f;
            int i = 0;
            while (i < iCutely) {
                saneness sanenessVar3 = (saneness) arrayList.get(arrayList.size() - 1);
                int i2 = iMarial - i;
                float f5 = f4 + sanenessVar2.impromptu().get(i2).f19895beachfront;
                int i3 = i2 + 1;
                int i4 = iAttabal;
                saneness sanenessVarGraveside = graveside(sanenessVar3, iMarial, i3 < sanenessVar2.impromptu().size() ? wireman(sanenessVar3, sanenessVar2.impromptu().get(i3).f19897dern) + 1 : 0, f3 - f5, sanenessVar2.dern() + i + 1, sanenessVar2.cutely() + i + 1, i4);
                if (i == iCutely - 1 && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    sanenessVarGraveside = adultoid(sanenessVarGraveside, f2, i4, false, f, strategyType);
                    i4 = i4;
                }
                arrayList.add(sanenessVarGraveside);
                i++;
                iAttabal = i4;
                f4 = f5;
            }
        } else if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList.add(adultoid(sanenessVar2, f2, iAttabal, false, f, strategyType));
        }
        return arrayList;
    }

    public static int wireman(saneness sanenessVar, float f) {
        for (int iDern = sanenessVar.dern() - 1; iDern >= 0; iDern--) {
            if (f == sanenessVar.impromptu().get(iDern).f19897dern) {
                return iDern;
            }
        }
        return 0;
    }

    public saneness apical(float f, float f2, float f3, boolean z) {
        float fSaneness;
        List<saneness> list;
        float[] fArr;
        float f4 = this.f19881beachfront + f2;
        float f5 = f3 - this.f19882competently;
        float f6 = formularize().saneness().f19896competently;
        float f7 = impromptu().saneness().f19898impromptu;
        if (this.f19881beachfront == f6) {
            f4 += f6;
        }
        if (this.f19882competently == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            fSaneness = phrasemonger.saneness.saneness(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f4, f);
            list = this.f19885saneness;
            fArr = this.f19886wireman;
        } else {
            if (f <= f5) {
                return this.f19880attabal;
            }
            fSaneness = phrasemonger.saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f5, f3, f);
            list = this.f19883dern;
            fArr = this.f19884marial;
        }
        return z ? attabal(list, fSaneness, fArr) : molybdenite(list, fSaneness, fArr);
    }

    public final saneness attabal(List<saneness> list, float f, float[] fArr) {
        float[] fArrKowloon = kowloon(list, f, fArr);
        return fArrKowloon[0] >= 0.5f ? list.get((int) fArrKowloon[2]) : list.get((int) fArrKowloon[1]);
    }

    public saneness competently() {
        return this.f19880attabal;
    }

    public saneness cutely(float f, float f2, float f3) {
        return apical(f, f2, f3, false);
    }

    public saneness formularize() {
        List<saneness> list = this.f19885saneness;
        return list.get(list.size() - 1);
    }

    public saneness impromptu() {
        List<saneness> list = this.f19883dern;
        return list.get(list.size() - 1);
    }

    public Map<Integer, saneness> taiyuan(int i, int i2, int i3, boolean z) {
        float fCompetently = this.f19880attabal.competently();
        HashMap map = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * fCompetently * (z ? -1 : 1) > i3 - this.f19882competently || i4 >= i - this.f19883dern.size()) {
                Integer numValueOf = Integer.valueOf(i6);
                List<saneness> list = this.f19883dern;
                map.put(numValueOf, list.get(achondroplasia.attabal.saneness(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * fCompetently * (z ? -1 : 1) < i2 + this.f19881beachfront || i8 < this.f19885saneness.size()) {
                Integer numValueOf2 = Integer.valueOf(i9);
                List<saneness> list2 = this.f19885saneness;
                map.put(numValueOf2, list2.get(achondroplasia.attabal.saneness(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return map;
    }
}
