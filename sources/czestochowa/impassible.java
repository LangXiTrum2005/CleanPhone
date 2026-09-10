package czestochowa;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionController.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public String[] f24934adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public lerp.saneness[] f24935apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f24936arytenoidectomy;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f24943dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int[] f24944dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public lerp.saneness f24945formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public double[] f24947graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f24950kattegat;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f24952marial;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public float f24953merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public double[] f24954molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f24955monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public HashMap<String, coi.dern> f24956oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public Interpolator f24957polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int[] f24958polloi;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f24960restrictive;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public View f24962saneness;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f24963sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public boolean f24964seminary;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public HashMap<String, coi.beachfront> f24965stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public View f24966supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public HashMap<String, coi.wireman> f24969trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public apical[] f24971yemenite;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Rect f24937attabal = new Rect();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f24970wireman = false;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f24938beachfront = -1;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public kowloon f24939competently = new kowloon();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public kowloon f24949impromptu = new kowloon();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public formularize f24967taiyuan = new formularize();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public formularize f24942cutely = new formularize();

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f24948impassible = Float.NaN;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f24968triweekly = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f24951kowloon = 1.0f;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f24946gintrap = 4;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float[] f24961rotuma = new float[4];

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public ArrayList<kowloon> f24959preprohormone = new ArrayList<>();

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public float[] f24940cord = new float[1];

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public ArrayList<wireman> f24941cuirassed = new ArrayList<>();

    /* JADX INFO: compiled from: MotionController.java */
    public class attabal implements Interpolator {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ lerp.dern f24972attabal;

        public attabal(lerp.dern dernVar) {
            this.f24972attabal = dernVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f24972attabal.attabal(f);
        }
    }

    public impassible(View view) {
        int i = wireman.f25032beachfront;
        this.f24963sealless = i;
        this.f24950kattegat = i;
        this.f24966supplicat = null;
        this.f24960restrictive = i;
        this.f24953merc = Float.NaN;
        this.f24957polder = null;
        this.f24964seminary = false;
        supplicat(view);
    }

    public static Interpolator arytenoidectomy(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new attabal(lerp.dern.dern(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public float adultoid() {
        return this.f24939competently.f24993graveside;
    }

    public float apical() {
        return this.f24955monoploid;
    }

    public void attabal(wireman wiremanVar) {
        this.f24941cuirassed.add(wiremanVar);
    }

    public void beachfront(boolean z) {
        if (!"button".equals(czestochowa.attabal.wireman(this.f24962saneness)) || this.f24971yemenite == null) {
            return;
        }
        int i = 0;
        while (true) {
            apical[] apicalVarArr = this.f24971yemenite;
            if (i >= apicalVarArr.length) {
                return;
            }
            apicalVarArr[i].preprohormone(z ? -100.0f : 100.0f, this.f24962saneness);
            i++;
        }
    }

    public final float competently(float f, float[] fArr) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f24951kowloon;
            if (f3 != 1.0d) {
                float f4 = this.f24968triweekly;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        lerp.dern dernVar = this.f24939competently.f24995kowloon;
        float f5 = Float.NaN;
        for (kowloon kowloonVar : this.f24959preprohormone) {
            lerp.dern dernVar2 = kowloonVar.f24995kowloon;
            if (dernVar2 != null) {
                float f6 = kowloonVar.f24997monoploid;
                if (f6 < f) {
                    dernVar = dernVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = kowloonVar.f24997monoploid;
                }
            }
        }
        if (dernVar != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) dernVar.attabal(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) dernVar.saneness(d);
            }
        }
        return f;
    }

    public void cord() {
        this.f24970wireman = true;
    }

    public void cuirassed(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public float cutely() {
        return this.f24936arytenoidectomy;
    }

    public int dern(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrImpromptu = this.f24935apical[0].impromptu();
        if (iArr != null) {
            Iterator<kowloon> it = this.f24959preprohormone.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f24998oilcan;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dArrImpromptu.length; i3++) {
            this.f24935apical[0].wireman(dArrImpromptu[i3], this.f24954molybdenite);
            this.f24939competently.cutely(dArrImpromptu[i3], this.f24958polloi, this.f24954molybdenite, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public View dovishness() {
        return this.f24962saneness;
    }

    public void formularize(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fCompetently = competently(f, this.f24940cord);
        lerp.saneness[] sanenessVarArr = this.f24935apical;
        int i = 0;
        if (sanenessVarArr == null) {
            kowloon kowloonVar = this.f24949impromptu;
            float f4 = kowloonVar.f24996molybdenite;
            kowloon kowloonVar2 = this.f24939competently;
            float f5 = f4 - kowloonVar2.f24996molybdenite;
            float f6 = kowloonVar.f24993graveside - kowloonVar2.f24993graveside;
            float f7 = (kowloonVar.f24987adultoid - kowloonVar2.f24987adultoid) + f5;
            float f8 = (kowloonVar.f24991dovishness - kowloonVar2.f24991dovishness) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = fCompetently;
        sanenessVarArr[0].competently(d, this.f24947graveside);
        this.f24935apical[0].wireman(d, this.f24954molybdenite);
        float f9 = this.f24940cord[0];
        while (true) {
            dArr = this.f24947graveside;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        lerp.saneness sanenessVar = this.f24945formularize;
        if (sanenessVar == null) {
            this.f24939competently.dovishness(f2, f3, fArr, this.f24958polloi, dArr, this.f24954molybdenite);
            return;
        }
        double[] dArr2 = this.f24954molybdenite;
        if (dArr2.length > 0) {
            sanenessVar.wireman(d, dArr2);
            this.f24945formularize.competently(d, this.f24947graveside);
            this.f24939competently.dovishness(f2, f3, fArr, this.f24958polloi, this.f24947graveside, this.f24954molybdenite);
        }
    }

    public final void gintrap(kowloon kowloonVar) {
        int iBinarySearch = Collections.binarySearch(this.f24959preprohormone, kowloonVar);
        if (iBinarySearch == 0) {
            float f = kowloonVar.f24999polloi;
        }
        this.f24959preprohormone.add((-iBinarySearch) - 1, kowloonVar);
    }

    public float graveside() {
        return this.f24939competently.f24996molybdenite;
    }

    public int impassible() {
        int iMax = this.f24939competently.f24988arytenoidectomy;
        Iterator<kowloon> it = this.f24959preprohormone.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f24988arytenoidectomy);
        }
        return Math.max(iMax, this.f24949impromptu.f24988arytenoidectomy);
    }

    public int impromptu() {
        return this.f24939competently.f24989cord;
    }

    public void kattegat(coi.marial marialVar, View view, int i, int i2, int i3) {
        kowloon kowloonVar = this.f24939competently;
        kowloonVar.f24997monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kowloonVar.f24999polloi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = marialVar.f15775saneness + marialVar.f15776wireman;
            rect.left = ((marialVar.f15773dern + marialVar.f15774marial) - marialVar.saneness()) / 2;
            rect.top = i2 - ((i4 + marialVar.attabal()) / 2);
            rect.right = rect.left + marialVar.saneness();
            rect.bottom = rect.top + marialVar.attabal();
        } else if (i == 2) {
            int i5 = marialVar.f15775saneness + marialVar.f15776wireman;
            rect.left = i3 - (((marialVar.f15773dern + marialVar.f15774marial) + marialVar.saneness()) / 2);
            rect.top = (i5 - marialVar.attabal()) / 2;
            rect.right = rect.left + marialVar.saneness();
            rect.bottom = rect.top + marialVar.attabal();
        }
        this.f24939competently.adultoid(rect.left, rect.top, rect.width(), rect.height());
        this.f24967taiyuan.formularize(rect, view, i, marialVar.f15772attabal);
    }

    public float kowloon() {
        return this.f24949impromptu.f24993graveside;
    }

    public void marial(float f, float[] fArr, int i) {
        this.f24935apical[0].wireman(competently(f, null), this.f24954molybdenite);
        this.f24939competently.triweekly(this.f24958polloi, this.f24954molybdenite, fArr, i);
    }

    public void merc(impassible impassibleVar) {
        this.f24939competently.rotuma(impassibleVar, impassibleVar.f24939competently);
        this.f24949impromptu.rotuma(impassibleVar, impassibleVar.f24949impromptu);
    }

    public final float molybdenite() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i < 100) {
            float f2 = i * f;
            double dAttabal = f2;
            lerp.dern dernVar = this.f24939competently.f24995kowloon;
            float f3 = Float.NaN;
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (kowloon kowloonVar : this.f24959preprohormone) {
                lerp.dern dernVar2 = kowloonVar.f24995kowloon;
                if (dernVar2 != null) {
                    float f5 = kowloonVar.f24997monoploid;
                    if (f5 < f2) {
                        dernVar = dernVar2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = kowloonVar.f24997monoploid;
                    }
                }
            }
            if (dernVar != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f6 = f3 - f4;
                dAttabal = (((float) dernVar.attabal((f2 - f4) / f6)) * f6) + f4;
            }
            double d3 = dAttabal;
            this.f24935apical[0].wireman(d3, this.f24954molybdenite);
            int i2 = i;
            this.f24939competently.cutely(d3, this.f24958polloi, this.f24954molybdenite, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    public kowloon monoploid(int i) {
        return this.f24959preprohormone.get(i);
    }

    public String name() {
        return this.f24962saneness.getContext().getResources().getResourceEntryName(this.f24962saneness.getId());
    }

    public void oilcan(int i) {
        this.f24963sealless = i;
    }

    public void polloi(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float fCompetently = competently(f, this.f24940cord);
        HashMap<String, coi.wireman> map = this.f24969trm;
        coi.wireman wiremanVar = map == null ? null : map.get("translationX");
        HashMap<String, coi.wireman> map2 = this.f24969trm;
        coi.wireman wiremanVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, coi.wireman> map3 = this.f24969trm;
        coi.wireman wiremanVar3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, coi.wireman> map4 = this.f24969trm;
        coi.wireman wiremanVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, coi.wireman> map5 = this.f24969trm;
        coi.wireman wiremanVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, coi.dern> map6 = this.f24956oilcan;
        coi.dern dernVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, coi.dern> map7 = this.f24956oilcan;
        coi.dern dernVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, coi.dern> map8 = this.f24956oilcan;
        coi.dern dernVar3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, coi.dern> map9 = this.f24956oilcan;
        coi.dern dernVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, coi.dern> map10 = this.f24956oilcan;
        coi.dern dernVar5 = map10 != null ? map10.get("scaleY") : null;
        lerp.arytenoidectomy arytenoidectomyVar = new lerp.arytenoidectomy();
        arytenoidectomyVar.saneness();
        arytenoidectomyVar.wireman(wiremanVar3, fCompetently);
        arytenoidectomyVar.impromptu(wiremanVar, wiremanVar2, fCompetently);
        arytenoidectomyVar.beachfront(wiremanVar4, wiremanVar5, fCompetently);
        arytenoidectomyVar.dern(dernVar3, fCompetently);
        arytenoidectomyVar.competently(dernVar, dernVar2, fCompetently);
        arytenoidectomyVar.marial(dernVar4, dernVar5, fCompetently);
        lerp.saneness sanenessVar = this.f24945formularize;
        if (sanenessVar != null) {
            double[] dArr = this.f24954molybdenite;
            if (dArr.length > 0) {
                double d = fCompetently;
                sanenessVar.wireman(d, dArr);
                this.f24945formularize.competently(d, this.f24947graveside);
                this.f24939competently.dovishness(f2, f3, fArr, this.f24958polloi, this.f24947graveside, this.f24954molybdenite);
            }
            arytenoidectomyVar.attabal(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f24935apical == null) {
            kowloon kowloonVar = this.f24949impromptu;
            float f4 = kowloonVar.f24996molybdenite;
            kowloon kowloonVar2 = this.f24939competently;
            float f5 = f4 - kowloonVar2.f24996molybdenite;
            float f6 = kowloonVar.f24993graveside - kowloonVar2.f24993graveside;
            float f7 = (kowloonVar.f24987adultoid - kowloonVar2.f24987adultoid) + f5;
            float f8 = f6 + (kowloonVar.f24991dovishness - kowloonVar2.f24991dovishness);
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            arytenoidectomyVar.saneness();
            arytenoidectomyVar.wireman(wiremanVar3, fCompetently);
            arytenoidectomyVar.impromptu(wiremanVar, wiremanVar2, fCompetently);
            arytenoidectomyVar.beachfront(wiremanVar4, wiremanVar5, fCompetently);
            arytenoidectomyVar.dern(dernVar3, fCompetently);
            arytenoidectomyVar.competently(dernVar, dernVar2, fCompetently);
            arytenoidectomyVar.marial(dernVar4, dernVar5, fCompetently);
            arytenoidectomyVar.attabal(f2, f3, i, i2, fArr);
            return;
        }
        double dCompetently = competently(fCompetently, this.f24940cord);
        this.f24935apical[0].competently(dCompetently, this.f24947graveside);
        this.f24935apical[0].wireman(dCompetently, this.f24954molybdenite);
        float f9 = this.f24940cord[0];
        while (true) {
            double[] dArr2 = this.f24947graveside;
            if (i3 >= dArr2.length) {
                this.f24939competently.dovishness(f2, f3, fArr, this.f24958polloi, dArr2, this.f24954molybdenite);
                arytenoidectomyVar.attabal(f2, f3, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * ((double) f9);
                i3++;
            }
        }
    }

    public final void preprohormone(kowloon kowloonVar) {
        kowloonVar.adultoid((int) this.f24962saneness.getX(), (int) this.f24962saneness.getY(), this.f24962saneness.getWidth(), this.f24962saneness.getHeight());
    }

    public void restrictive(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        coi.beachfront beachfrontVarImpromptu;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        coi.wireman wiremanVarCompetently;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.f24963sealless;
        if (i3 != wireman.f25032beachfront) {
            this.f24939competently.f25000preprohormone = i3;
        }
        this.f24967taiyuan.cutely(this.f24942cutely, hashSet2);
        ArrayList<wireman> arrayList2 = this.f24941cuirassed;
        if (arrayList2 != null) {
            arrayList = null;
            for (wireman wiremanVar : arrayList2) {
                if (wiremanVar instanceof impromptu) {
                    impromptu impromptuVar = (impromptu) wiremanVar;
                    gintrap(new kowloon(i, i2, impromptuVar, this.f24939competently, this.f24949impromptu));
                    int i4 = impromptuVar.f25031competently;
                    if (i4 != wireman.f25032beachfront) {
                        this.f24938beachfront = i4;
                    }
                } else if (wiremanVar instanceof beachfront) {
                    wiremanVar.wireman(hashSet3);
                } else if (wiremanVar instanceof cutely) {
                    wiremanVar.wireman(hashSet);
                } else if (wiremanVar instanceof apical) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((apical) wiremanVar);
                } else {
                    wiremanVar.impromptu(map);
                    wiremanVar.wireman(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i5 = 0;
        if (arrayList != null) {
            this.f24971yemenite = (apical[]) arrayList.toArray(new apical[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f24969trm = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (wireman wiremanVar2 : this.f24941cuirassed) {
                        HashMap<String, ConstraintAttribute> map2 = wiremanVar2.f25035marial;
                        if (map2 != null && (constraintAttribute3 = map2.get(str2)) != null) {
                            sparseArray.append(wiremanVar2.f25033attabal, constraintAttribute3);
                        }
                    }
                    wiremanVarCompetently = coi.wireman.beachfront(str, sparseArray);
                } else {
                    wiremanVarCompetently = coi.wireman.competently(str);
                }
                if (wiremanVarCompetently != null) {
                    wiremanVarCompetently.wireman(str);
                    this.f24969trm.put(str, wiremanVarCompetently);
                }
            }
            ArrayList<wireman> arrayList3 = this.f24941cuirassed;
            if (arrayList3 != null) {
                for (wireman wiremanVar3 : arrayList3) {
                    if (wiremanVar3 instanceof marial) {
                        wiremanVar3.attabal(this.f24969trm);
                    }
                }
            }
            this.f24967taiyuan.attabal(this.f24969trm, 0);
            this.f24942cutely.attabal(this.f24969trm, 100);
            for (String str3 : this.f24969trm.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                coi.wireman wiremanVar4 = this.f24969trm.get(str3);
                if (wiremanVar4 != null) {
                    wiremanVar4.marial(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f24965stratoscope == null) {
                this.f24965stratoscope = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f24965stratoscope.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (wireman wiremanVar5 : this.f24941cuirassed) {
                            HashMap<String, ConstraintAttribute> map3 = wiremanVar5.f25035marial;
                            if (map3 != null && (constraintAttribute2 = map3.get(str5)) != null) {
                                sparseArray2.append(wiremanVar5.f25033attabal, constraintAttribute2);
                            }
                        }
                        beachfrontVarImpromptu = coi.beachfront.competently(str4, sparseArray2);
                    } else {
                        beachfrontVarImpromptu = coi.beachfront.impromptu(str4, j);
                    }
                    if (beachfrontVarImpromptu != null) {
                        beachfrontVarImpromptu.wireman(str4);
                        this.f24965stratoscope.put(str4, beachfrontVarImpromptu);
                    }
                }
            }
            ArrayList<wireman> arrayList4 = this.f24941cuirassed;
            if (arrayList4 != null) {
                for (wireman wiremanVar6 : arrayList4) {
                    if (wiremanVar6 instanceof cutely) {
                        ((cutely) wiremanVar6).mathsort(this.f24965stratoscope);
                    }
                }
            }
            for (String str6 : this.f24965stratoscope.keySet()) {
                this.f24965stratoscope.get(str6).marial(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f24959preprohormone.size();
        int i6 = size + 2;
        kowloon[] kowloonVarArr = new kowloon[i6];
        kowloonVarArr[0] = this.f24939competently;
        kowloonVarArr[size + 1] = this.f24949impromptu;
        if (this.f24959preprohormone.size() > 0 && this.f24938beachfront == -1) {
            this.f24938beachfront = 0;
        }
        Iterator<kowloon> it = this.f24959preprohormone.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            kowloonVarArr[i7] = it.next();
            i7++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f24949impromptu.f25004trm.keySet()) {
            if (this.f24939competently.f25004trm.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f24934adultoid = strArr2;
        this.f24944dovishness = new int[strArr2.length];
        int i8 = 0;
        while (true) {
            strArr = this.f24934adultoid;
            if (i8 >= strArr.length) {
                break;
            }
            String str8 = strArr[i8];
            this.f24944dovishness[i8] = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (kowloonVarArr[i9].f25004trm.containsKey(str8) && (constraintAttribute = kowloonVarArr[i9].f25004trm.get(str8)) != null) {
                    int[] iArr = this.f24944dovishness;
                    iArr[i8] = iArr[i8] + constraintAttribute.impromptu();
                    break;
                }
            }
            i8++;
        }
        boolean z = kowloonVarArr[0].f25000preprohormone != wireman.f25032beachfront;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < i6; i10++) {
            kowloonVarArr[i10].marial(kowloonVarArr[i10 - 1], zArr, this.f24934adultoid, z);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        this.f24958polloi = new int[i11];
        int i13 = 2;
        int iMax = Math.max(2, i11);
        this.f24954molybdenite = new double[iMax];
        this.f24947graveside = new double[iMax];
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                this.f24958polloi[i14] = i15;
                i14++;
            }
        }
        int[] iArr2 = {i6, this.f24958polloi.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i6];
        for (int i16 = 0; i16 < i6; i16++) {
            kowloonVarArr[i16].taiyuan(dArr[i16], this.f24958polloi);
            dArr2[i16] = kowloonVarArr[i16].f24997monoploid;
        }
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.f24958polloi;
            if (i17 >= iArr3.length) {
                break;
            }
            if (iArr3[i17] < kowloon.f24986supplicat.length) {
                String str9 = kowloon.f24986supplicat[this.f24958polloi[i17]] + " [";
                for (int i18 = 0; i18 < i6; i18++) {
                    str9 = str9 + dArr[i18][i17];
                }
            }
            i17++;
        }
        this.f24935apical = new lerp.saneness[this.f24934adultoid.length + 1];
        int i19 = 0;
        while (true) {
            String[] strArr3 = this.f24934adultoid;
            if (i19 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i19];
            int i20 = i5;
            int i21 = i20;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i20 < i6) {
                char c2 = c;
                if (kowloonVarArr[i20].kowloon(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i6];
                        int[] iArr4 = new int[i13];
                        iArr4[c2] = kowloonVarArr[i20].impassible(str10);
                        iArr4[i5] = i6;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    kowloon kowloonVar = kowloonVarArr[i20];
                    dArr3[i21] = kowloonVar.f24997monoploid;
                    kowloonVar.formularize(str10, dArr4[i21], 0);
                    i21++;
                }
                i20++;
                c = c2;
                kowloonVarArr = kowloonVarArr;
                i13 = 2;
                i5 = 0;
            }
            i19++;
            this.f24935apical[i19] = lerp.saneness.attabal(this.f24938beachfront, Arrays.copyOf(dArr3, i21), (double[][]) Arrays.copyOf(dArr4, i21));
            c = c;
            kowloonVarArr = kowloonVarArr;
            i13 = 2;
            i5 = 0;
        }
        kowloon[] kowloonVarArr2 = kowloonVarArr;
        char c3 = c;
        this.f24935apical[0] = lerp.saneness.attabal(this.f24938beachfront, dArr2, dArr);
        if (kowloonVarArr2[0].f25000preprohormone != wireman.f25032beachfront) {
            int[] iArr5 = new int[i6];
            double[] dArr5 = new double[i6];
            int[] iArr6 = new int[2];
            iArr6[c3] = 2;
            iArr6[0] = i6;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i22 = 0; i22 < i6; i22++) {
                kowloon kowloonVar2 = kowloonVarArr2[i22];
                iArr5[i22] = kowloonVar2.f25000preprohormone;
                dArr5[i22] = kowloonVar2.f24997monoploid;
                double[] dArr7 = dArr6[i22];
                dArr7[0] = kowloonVar2.f24996molybdenite;
                dArr7[c3] = kowloonVar2.f24993graveside;
            }
            this.f24945formularize = lerp.saneness.saneness(iArr5, dArr5, dArr6);
        }
        this.f24956oilcan = new HashMap<>();
        if (this.f24941cuirassed != null) {
            float fMolybdenite = Float.NaN;
            for (String str11 : hashSet3) {
                coi.dern dernVarTaiyuan = coi.dern.taiyuan(str11);
                if (dernVarTaiyuan != null) {
                    if (dernVarTaiyuan.impromptu() && Float.isNaN(fMolybdenite)) {
                        fMolybdenite = molybdenite();
                    }
                    dernVarTaiyuan.beachfront(str11);
                    this.f24956oilcan.put(str11, dernVarTaiyuan);
                }
            }
            for (wireman wiremanVar7 : this.f24941cuirassed) {
                if (wiremanVar7 instanceof beachfront) {
                    ((beachfront) wiremanVar7).dent(this.f24956oilcan);
                }
            }
            Iterator<coi.dern> it2 = this.f24956oilcan.values().iterator();
            while (it2.hasNext()) {
                it2.next().competently(fMolybdenite);
            }
        }
    }

    public boolean rotuma(View view, float f, long j, lerp.wireman wiremanVar) {
        coi.beachfront.wireman wiremanVar2;
        boolean zCutely;
        View view2;
        View view3;
        float f2;
        double d;
        View view4 = view;
        float fCompetently = competently(f, null);
        int i = this.f24960restrictive;
        if (i != wireman.f25032beachfront) {
            float f3 = 1.0f / i;
            float fFloor = ((float) Math.floor(fCompetently / f3)) * f3;
            float f4 = (fCompetently % f3) / f3;
            if (!Float.isNaN(this.f24953merc)) {
                f4 = (f4 + this.f24953merc) % 1.0f;
            }
            Interpolator interpolator = this.f24957polder;
            fCompetently = ((interpolator != null ? interpolator.getInterpolation(f4) : ((double) f4) > 0.5d ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f3) + fFloor;
        }
        HashMap<String, coi.wireman> map = this.f24969trm;
        if (map != null) {
            Iterator<coi.wireman> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().impromptu(view4, fCompetently);
            }
        }
        HashMap<String, coi.beachfront> map2 = this.f24965stratoscope;
        if (map2 != null) {
            coi.beachfront.wireman wiremanVar3 = null;
            boolean zTaiyuan = false;
            for (coi.beachfront beachfrontVar : map2.values()) {
                if (beachfrontVar instanceof coi.beachfront.wireman) {
                    wiremanVar3 = (coi.beachfront.wireman) beachfrontVar;
                } else {
                    zTaiyuan |= beachfrontVar.taiyuan(view4, fCompetently, j, wiremanVar);
                    view4 = view;
                }
            }
            zCutely = zTaiyuan;
            wiremanVar2 = wiremanVar3;
        } else {
            wiremanVar2 = null;
            zCutely = false;
        }
        lerp.saneness[] sanenessVarArr = this.f24935apical;
        if (sanenessVarArr != null) {
            double d2 = fCompetently;
            sanenessVarArr[0].wireman(d2, this.f24954molybdenite);
            this.f24935apical[0].competently(d2, this.f24947graveside);
            lerp.saneness sanenessVar = this.f24945formularize;
            if (sanenessVar != null) {
                double[] dArr = this.f24954molybdenite;
                if (dArr.length > 0) {
                    sanenessVar.wireman(d2, dArr);
                    this.f24945formularize.competently(d2, this.f24947graveside);
                }
            }
            if (this.f24964seminary) {
                view3 = view;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                d = d2;
            } else {
                kowloon kowloonVar = this.f24939competently;
                int[] iArr = this.f24958polloi;
                double[] dArr2 = this.f24954molybdenite;
                double[] dArr3 = this.f24947graveside;
                boolean z = this.f24970wireman;
                float f5 = fCompetently;
                d = d2;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                kowloonVar.gintrap(f5, view, iArr, dArr2, dArr3, null, z);
                fCompetently = f5;
                view3 = view;
                this.f24970wireman = false;
            }
            if (this.f24950kattegat != wireman.f25032beachfront) {
                if (this.f24966supplicat == null) {
                    this.f24966supplicat = ((View) view3.getParent()).findViewById(this.f24950kattegat);
                }
                View view5 = this.f24966supplicat;
                if (view5 != null) {
                    float top = (view5.getTop() + this.f24966supplicat.getBottom()) / 2.0f;
                    float left = (this.f24966supplicat.getLeft() + this.f24966supplicat.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        float left2 = left - view3.getLeft();
                        float top2 = top - view3.getTop();
                        view3.setPivotX(left2);
                        view3.setPivotY(top2);
                    }
                }
            }
            HashMap<String, coi.wireman> map3 = this.f24969trm;
            if (map3 != null) {
                for (coi.wireman wiremanVar4 : map3.values()) {
                    if (wiremanVar4 instanceof coi.wireman.C0146wireman) {
                        double[] dArr4 = this.f24947graveside;
                        if (dArr4.length > 1) {
                            ((coi.wireman.C0146wireman) wiremanVar4).taiyuan(view3, fCompetently, dArr4[0], dArr4[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (wiremanVar2 != null) {
                double[] dArr5 = this.f24947graveside;
                view2 = view;
                float f6 = fCompetently;
                fCompetently = f6;
                zCutely |= wiremanVar2.cutely(view2, wiremanVar, f6, j, dArr5[0], dArr5[1]);
            } else {
                view2 = view;
            }
            int i2 = 1;
            while (true) {
                lerp.saneness[] sanenessVarArr2 = this.f24935apical;
                if (i2 >= sanenessVarArr2.length) {
                    break;
                }
                sanenessVarArr2[i2].marial(d, this.f24961rotuma);
                coi.attabal.saneness(this.f24939competently.f25004trm.get(this.f24934adultoid[i2 - 1]), view2, this.f24961rotuma);
                i2++;
            }
            formularize formularizeVar = this.f24967taiyuan;
            if (formularizeVar.f24906arytenoidectomy == 0) {
                if (fCompetently <= f2) {
                    view2.setVisibility(formularizeVar.f24918monoploid);
                } else if (fCompetently >= 1065353216) {
                    view2.setVisibility(this.f24942cutely.f24918monoploid);
                } else if (this.f24942cutely.f24918monoploid != formularizeVar.f24918monoploid) {
                    view2.setVisibility(0);
                }
            }
            if (this.f24971yemenite != null) {
                int i3 = 0;
                while (true) {
                    apical[] apicalVarArr = this.f24971yemenite;
                    if (i3 >= apicalVarArr.length) {
                        break;
                    }
                    apicalVarArr[i3].preprohormone(fCompetently, view2);
                    i3++;
                }
            }
        } else {
            view2 = view;
            kowloon kowloonVar2 = this.f24939competently;
            float f7 = kowloonVar2.f24996molybdenite;
            kowloon kowloonVar3 = this.f24949impromptu;
            float f8 = f7 + ((kowloonVar3.f24996molybdenite - f7) * fCompetently);
            float f9 = kowloonVar2.f24993graveside;
            float f10 = f9 + ((kowloonVar3.f24993graveside - f9) * fCompetently);
            float f11 = kowloonVar2.f24987adultoid;
            float f12 = kowloonVar3.f24987adultoid;
            float f13 = kowloonVar2.f24991dovishness;
            float f14 = kowloonVar3.f24991dovishness;
            float f15 = f8 + 0.5f;
            int i4 = (int) f15;
            float f16 = f10 + 0.5f;
            int i5 = (int) f16;
            int i6 = (int) (f15 + ((f12 - f11) * fCompetently) + f11);
            int i7 = (int) (f16 + ((f14 - f13) * fCompetently) + f13);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f12 != f11 || f14 != f13 || this.f24970wireman) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.f24970wireman = false;
            }
            view2.layout(i4, i5, i6, i7);
        }
        HashMap<String, coi.dern> map4 = this.f24956oilcan;
        if (map4 != null) {
            for (coi.dern dernVar : map4.values()) {
                if (dernVar instanceof coi.dern.wireman) {
                    double[] dArr6 = this.f24947graveside;
                    ((coi.dern.wireman) dernVar).apical(view2, fCompetently, dArr6[0], dArr6[1]);
                } else {
                    dernVar.cutely(view2, fCompetently);
                }
            }
        }
        return zCutely;
    }

    public void saneness(ArrayList<wireman> arrayList) {
        this.f24941cuirassed.addAll(arrayList);
    }

    public void sealless(Rect rect, androidx.constraintlayout.widget.attabal attabalVar, int i, int i2) {
        impassible impassibleVar;
        Rect rect2;
        int i3 = attabalVar.f8929marial;
        if (i3 != 0) {
            impassibleVar = this;
            rect2 = rect;
            impassibleVar.cuirassed(rect2, this.f24937attabal, i3, i, i2);
        } else {
            impassibleVar = this;
            rect2 = rect;
        }
        kowloon kowloonVar = impassibleVar.f24939competently;
        kowloonVar.f24997monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kowloonVar.f24999polloi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        preprohormone(kowloonVar);
        impassibleVar.f24939competently.adultoid(rect2.left, rect2.top, rect2.width(), rect2.height());
        androidx.constraintlayout.widget.attabal.C0056attabal c0056attabalPreprohormone = attabalVar.preprohormone(impassibleVar.f24943dern);
        impassibleVar.f24939competently.attabal(c0056attabalPreprohormone);
        impassibleVar.f24948impassible = c0056attabalPreprohormone.f8939wireman.f8956competently;
        impassibleVar.f24967taiyuan.impassible(rect2, attabalVar, i3, impassibleVar.f24943dern);
        impassibleVar.f24950kattegat = c0056attabalPreprohormone.f8933beachfront.f8979taiyuan;
        androidx.constraintlayout.widget.attabal.dern dernVar = c0056attabalPreprohormone.f8939wireman;
        impassibleVar.f24960restrictive = dernVar.f8953apical;
        impassibleVar.f24953merc = dernVar.f8957cutely;
        Context context = impassibleVar.f24962saneness.getContext();
        androidx.constraintlayout.widget.attabal.dern dernVar2 = c0056attabalPreprohormone.f8939wireman;
        impassibleVar.f24957polder = arytenoidectomy(context, dernVar2.f8960impassible, dernVar2.f8959formularize, dernVar2.f8965triweekly);
    }

    public void stratoscope(View view) {
        kowloon kowloonVar = this.f24939competently;
        kowloonVar.f24997monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kowloonVar.f24999polloi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f24964seminary = true;
        kowloonVar.adultoid(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f24949impromptu.adultoid(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f24967taiyuan.triweekly(view);
        this.f24942cutely.triweekly(view);
    }

    public void supplicat(View view) {
        this.f24962saneness = view;
        this.f24943dern = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f24952marial = ((ConstraintLayout.LayoutParams) layoutParams).attabal();
        }
    }

    public void taiyuan(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f24935apical[0].wireman(d, dArr);
        this.f24935apical[0].competently(d, dArr2);
        Arrays.fill(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f24939competently.apical(d, this.f24958polloi, dArr, fArr, dArr2, fArr2);
    }

    public String toString() {
        return " start: x: " + this.f24939competently.f24996molybdenite + " y: " + this.f24939competently.f24993graveside + " end: x: " + this.f24949impromptu.f24996molybdenite + " y: " + this.f24949impromptu.f24993graveside;
    }

    public float triweekly() {
        return this.f24949impromptu.f24996molybdenite;
    }

    public void trm(Rect rect, androidx.constraintlayout.widget.attabal attabalVar, int i, int i2) {
        impassible impassibleVar;
        int i3 = attabalVar.f8929marial;
        if (i3 != 0) {
            impassibleVar = this;
            impassibleVar.cuirassed(rect, this.f24937attabal, i3, i, i2);
            rect = impassibleVar.f24937attabal;
        } else {
            impassibleVar = this;
        }
        kowloon kowloonVar = impassibleVar.f24949impromptu;
        kowloonVar.f24997monoploid = 1.0f;
        kowloonVar.f24999polloi = 1.0f;
        preprohormone(kowloonVar);
        impassibleVar.f24949impromptu.adultoid(rect.left, rect.top, rect.width(), rect.height());
        impassibleVar.f24949impromptu.attabal(attabalVar.preprohormone(impassibleVar.f24943dern));
        impassibleVar.f24942cutely.impassible(rect, attabalVar, i3, impassibleVar.f24943dern);
    }

    public void wireman(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, coi.wireman> map = this.f24969trm;
        coi.wireman wiremanVar = map == null ? null : map.get("translationX");
        HashMap<String, coi.wireman> map2 = this.f24969trm;
        coi.wireman wiremanVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, coi.dern> map3 = this.f24956oilcan;
        coi.dern dernVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, coi.dern> map4 = this.f24956oilcan;
        coi.dern dernVar2 = map4 != null ? map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float fMin = i3 * f2;
            float f3 = this.f24951kowloon;
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f3 != f) {
                float f5 = this.f24968triweekly;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            double dAttabal = fMin;
            lerp.dern dernVar3 = this.f24939competently.f24995kowloon;
            float f6 = Float.NaN;
            for (kowloon kowloonVar : this.f24959preprohormone) {
                lerp.dern dernVar4 = kowloonVar.f24995kowloon;
                if (dernVar4 != null) {
                    float f7 = kowloonVar.f24997monoploid;
                    if (f7 < fMin) {
                        f4 = f7;
                        dernVar3 = dernVar4;
                    } else if (Float.isNaN(f6)) {
                        f6 = kowloonVar.f24997monoploid;
                    }
                }
            }
            if (dernVar3 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                dAttabal = (((float) dernVar3.attabal((fMin - f4) / f8)) * f8) + f4;
            }
            this.f24935apical[0].wireman(dAttabal, this.f24954molybdenite);
            lerp.saneness sanenessVar = this.f24945formularize;
            if (sanenessVar != null) {
                double[] dArr = this.f24954molybdenite;
                if (dArr.length > 0) {
                    sanenessVar.wireman(dAttabal, dArr);
                }
            }
            int i4 = i3 * 2;
            this.f24939competently.cutely(dAttabal, this.f24958polloi, this.f24954molybdenite, fArr, i4);
            if (dernVar != null) {
                fArr[i4] = fArr[i4] + dernVar.attabal(fMin);
            } else if (wiremanVar != null) {
                fArr[i4] = fArr[i4] + wiremanVar.attabal(fMin);
            }
            if (dernVar2 != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + dernVar2.attabal(fMin);
            } else if (wiremanVar2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + wiremanVar2.attabal(fMin);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    public void yemenite(View view) {
        kowloon kowloonVar = this.f24939competently;
        kowloonVar.f24997monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kowloonVar.f24999polloi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kowloonVar.adultoid(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f24967taiyuan.triweekly(view);
    }
}
