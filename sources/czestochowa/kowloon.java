package czestochowa;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon implements Comparable<kowloon> {

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static String[] f24986supplicat = {X3.i.L, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f24987adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f24989cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public float f24990cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f24991dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f24993graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public double[] f24994kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public lerp.dern f24995kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f24996molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f24997monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f24998oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f24999polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f25000preprohormone;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public double[] f25002sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public impassible f25003stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f25004trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f25005yemenite;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f24988arytenoidectomy = 0;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f24992gintrap = Float.NaN;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f25001rotuma = Float.NaN;

    public kowloon() {
        int i = wireman.f25032beachfront;
        this.f25000preprohormone = i;
        this.f24989cord = i;
        this.f24990cuirassed = Float.NaN;
        this.f25003stratoscope = null;
        this.f25004trm = new LinkedHashMap<>();
        this.f24998oilcan = 0;
        this.f25002sealless = new double[18];
        this.f24994kattegat = new double[18];
    }

    public void adultoid(float f, float f2, float f3, float f4) {
        this.f24996molybdenite = f;
        this.f24993graveside = f2;
        this.f24987adultoid = f3;
        this.f24991dovishness = f4;
    }

    public void apical(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float fSin = this.f24996molybdenite;
        float fCos = this.f24993graveside;
        float f2 = this.f24987adultoid;
        float f3 = this.f24991dovishness;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < iArr.length; i++) {
            float f8 = (float) dArr[i];
            float f9 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                fSin = f8;
                f4 = f9;
            } else if (i2 == 2) {
                fCos = f8;
                f6 = f9;
            } else if (i2 == 3) {
                f2 = f8;
                f5 = f9;
            } else if (i2 == 4) {
                f3 = f8;
                f7 = f9;
            }
        }
        float f10 = (f5 / 2.0f) + f4;
        float fCos2 = (f7 / 2.0f) + f6;
        impassible impassibleVar = this.f25003stratoscope;
        if (impassibleVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            impassibleVar.taiyuan(d, fArr3, fArr4);
            float f11 = fArr3[0];
            float f12 = fArr3[1];
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            f = 2.0f;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            double d4 = f4;
            double dSin = ((double) f13) + (Math.sin(d3) * d4);
            double d5 = f6;
            float fCos3 = (float) (dSin + (Math.cos(d3) * d5));
            fCos2 = (float) ((((double) f14) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f10 = fCos3;
        } else {
            f = 2.0f;
        }
        fArr[0] = fSin + (f2 / f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[1] = fCos + (f3 / f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr2[0] = f10;
        fArr2[1] = fCos2;
    }

    public void arytenoidectomy(impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        float f = impromptuVar.f25033attabal / 100.0f;
        this.f24997monoploid = f;
        this.f24988arytenoidectomy = impromptuVar.f24975cutely;
        float f2 = Float.isNaN(impromptuVar.f24973apical) ? f : impromptuVar.f24973apical;
        float f3 = Float.isNaN(impromptuVar.f24976formularize) ? f : impromptuVar.f24976formularize;
        float f4 = kowloonVar2.f24987adultoid;
        float f5 = kowloonVar.f24987adultoid;
        float f6 = f4 - f5;
        float f7 = kowloonVar2.f24991dovishness;
        float f8 = kowloonVar.f24991dovishness;
        float f9 = f7 - f8;
        this.f24999polloi = this.f24997monoploid;
        float f10 = kowloonVar.f24996molybdenite;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = kowloonVar.f24993graveside;
        float f13 = f12 + (f8 / 2.0f);
        float f14 = f;
        float f15 = kowloonVar2.f24996molybdenite + (f4 / 2.0f);
        float f16 = kowloonVar2.f24993graveside + (f7 / 2.0f);
        if (f11 > f15) {
            f11 = f15;
            f15 = f11;
        }
        if (f13 <= f16) {
            f13 = f16;
            f16 = f13;
        }
        float f17 = f15 - f11;
        float f18 = f13 - f16;
        float f19 = f6 * f2;
        float f20 = f19 / 2.0f;
        this.f24996molybdenite = (int) ((f10 + (f17 * f14)) - f20);
        float f21 = f9 * f3;
        float f22 = f21 / 2.0f;
        this.f24993graveside = (int) ((f12 + (f18 * f14)) - f22);
        this.f24987adultoid = (int) (f5 + f19);
        this.f24991dovishness = (int) (f8 + f21);
        float f23 = Float.isNaN(impromptuVar.f24977impassible) ? f14 : impromptuVar.f24977impassible;
        boolean zIsNaN = Float.isNaN(impromptuVar.f24974arytenoidectomy);
        float f24 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f25 = zIsNaN ? 0.0f : impromptuVar.f24974arytenoidectomy;
        if (!Float.isNaN(impromptuVar.f24984triweekly)) {
            f14 = impromptuVar.f24984triweekly;
        }
        if (!Float.isNaN(impromptuVar.f24979kowloon)) {
            f24 = impromptuVar.f24979kowloon;
        }
        this.f24998oilcan = 0;
        this.f24996molybdenite = (int) (((kowloonVar.f24996molybdenite + (f23 * f17)) + (f24 * f18)) - f20);
        this.f24993graveside = (int) (((kowloonVar.f24993graveside + (f17 * f25)) + (f18 * f14)) - f22);
        this.f24995kowloon = lerp.dern.dern(impromptuVar.f24978impromptu);
        this.f25000preprohormone = impromptuVar.f24983taiyuan;
    }

    public void attabal(androidx.constraintlayout.widget.attabal.C0056attabal c0056attabal) {
        this.f24995kowloon = lerp.dern.dern(c0056attabal.f8939wireman.f8966wireman);
        androidx.constraintlayout.widget.attabal.dern dernVar = c0056attabal.f8939wireman;
        this.f25000preprohormone = dernVar.f8962marial;
        this.f24989cord = dernVar.f8963saneness;
        this.f24992gintrap = dernVar.f8964taiyuan;
        this.f24988arytenoidectomy = dernVar.f8955beachfront;
        this.f25005yemenite = dernVar.f8958dern;
        this.f25001rotuma = c0056attabal.f8935dern.f9054marial;
        this.f24990cuirassed = c0056attabal.f8937marial.f9021oilcan;
        for (String str : c0056attabal.f8934competently.keySet()) {
            ConstraintAttribute constraintAttribute = c0056attabal.f8934competently.get(str);
            if (constraintAttribute != null && constraintAttribute.competently()) {
                this.f25004trm.put(str, constraintAttribute);
            }
        }
    }

    public void cutely(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f24996molybdenite;
        float fCos = this.f24993graveside;
        float f = this.f24987adultoid;
        float f2 = this.f24991dovishness;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        impassible impassibleVar = this.f25003stratoscope;
        if (impassibleVar != null) {
            float[] fArr2 = new float[2];
            impassibleVar.taiyuan(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d3 * Math.cos(d4))) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = fSin + (f / 2.0f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[i + 1] = fCos + (f2 / 2.0f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public int compareTo(kowloon kowloonVar) {
        return Float.compare(this.f24999polloi, kowloonVar.f24999polloi);
    }

    public void dovishness(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f4) / 2.0f);
        float f9 = f5 - ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public int formularize(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.f25004trm.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.impromptu() == 1) {
            dArr[i] = constraintAttribute.marial();
            return 1;
        }
        int iImpromptu = constraintAttribute.impromptu();
        float[] fArr = new float[iImpromptu];
        constraintAttribute.beachfront(fArr);
        while (i2 < iImpromptu) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return iImpromptu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void gintrap(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float fSin = this.f24996molybdenite;
        float fCos = this.f24993graveside;
        float f3 = this.f24987adultoid;
        float f4 = this.f24991dovishness;
        if (iArr.length != 0 && this.f25002sealless.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f25002sealless = new double[i];
            this.f24994kattegat = new double[i];
        }
        Arrays.fill(this.f25002sealless, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f25002sealless;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f24994kattegat[i3] = dArr2[i2];
        }
        float f5 = Float.NaN;
        int i4 = 0;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (true) {
            double[] dArr5 = this.f25002sealless;
            if (i4 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f5;
            } else {
                double d = dArr3 != null ? dArr3[i4] : 0.0d;
                if (!Double.isNaN(this.f25002sealless[i4])) {
                    d = this.f25002sealless[i4] + d;
                }
                f2 = f5;
                float f10 = (float) d;
                float f11 = (float) this.f24994kattegat[i4];
                if (i4 == 1) {
                    f5 = f2;
                    f6 = f11;
                    fSin = f10;
                } else if (i4 == 2) {
                    f5 = f2;
                    f7 = f11;
                    fCos = f10;
                } else if (i4 == 3) {
                    f5 = f2;
                    f8 = f11;
                    f3 = f10;
                } else if (i4 == 4) {
                    f5 = f2;
                    f9 = f11;
                    f4 = f10;
                } else if (i4 == 5) {
                    f5 = f10;
                }
                i4++;
            }
            f5 = f2;
            i4++;
        }
        float f12 = f5;
        impassible impassibleVar = this.f25003stratoscope;
        if (impassibleVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            impassibleVar.taiyuan(f, fArr, fArr2);
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d2 = f13;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d4) * d3)) - ((double) (f4 / 2.0f)));
            double d5 = f15;
            double d6 = f6;
            double dSin = d5 + (Math.sin(d4) * d6);
            double dCos = Math.cos(d4) * d3;
            double d7 = f7;
            float f17 = (float) (dSin + (dCos * d7));
            float fCos2 = (float) ((((double) f16) - (d6 * Math.cos(d4))) + (Math.sin(d4) * d3 * d7));
            if (dArr2.length >= 2) {
                dArr2[0] = f17;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f12)) {
                view.setRotation((float) (((double) f12) + Math.toDegrees(Math.atan2(fCos2, f17))));
            }
        } else if (!Float.isNaN(f12)) {
            view.setRotation(f12 + ((float) Math.toDegrees(Math.atan2(f7 + (f9 / 2.0f), f6 + (f8 / 2.0f)))) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (view instanceof dern) {
            ((dern) view).attabal(fSin, fCos, f3 + fSin, f4 + fCos);
            return;
        }
        float f18 = fSin + 0.5f;
        int i5 = (int) f18;
        float f19 = fCos + 0.5f;
        int i6 = (int) f19;
        int i7 = (int) (f18 + f3);
        int i8 = (int) (f19 + f4);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public void graveside(int i, int i2, impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        float f = impromptuVar.f25033attabal / 100.0f;
        this.f24997monoploid = f;
        this.f24988arytenoidectomy = impromptuVar.f24975cutely;
        float f2 = Float.isNaN(impromptuVar.f24973apical) ? f : impromptuVar.f24973apical;
        float f3 = Float.isNaN(impromptuVar.f24976formularize) ? f : impromptuVar.f24976formularize;
        float f4 = kowloonVar2.f24987adultoid;
        float f5 = kowloonVar.f24987adultoid;
        float f6 = kowloonVar2.f24991dovishness;
        float f7 = kowloonVar.f24991dovishness;
        this.f24999polloi = this.f24997monoploid;
        float f8 = kowloonVar.f24996molybdenite;
        float f9 = kowloonVar.f24993graveside;
        float f10 = kowloonVar2.f24996molybdenite + (f4 / 2.0f);
        float f11 = kowloonVar2.f24993graveside + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f24996molybdenite = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f24993graveside = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.f24987adultoid = (int) (f5 + f12);
        this.f24991dovishness = (int) (f7 + f13);
        this.f24998oilcan = 2;
        if (!Float.isNaN(impromptuVar.f24977impassible)) {
            this.f24996molybdenite = (int) (impromptuVar.f24977impassible * (i - ((int) this.f24987adultoid)));
        }
        if (!Float.isNaN(impromptuVar.f24984triweekly)) {
            this.f24993graveside = (int) (impromptuVar.f24984triweekly * (i2 - ((int) this.f24991dovishness)));
        }
        this.f24989cord = this.f24989cord;
        this.f24995kowloon = lerp.dern.dern(impromptuVar.f24978impromptu);
        this.f25000preprohormone = impromptuVar.f24983taiyuan;
    }

    public int impassible(String str) {
        ConstraintAttribute constraintAttribute = this.f25004trm.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.impromptu();
    }

    public boolean kowloon(String str) {
        return this.f25004trm.containsKey(str);
    }

    public void marial(kowloon kowloonVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean zWireman = wireman(this.f24996molybdenite, kowloonVar.f24996molybdenite);
        boolean zWireman2 = wireman(this.f24993graveside, kowloonVar.f24993graveside);
        zArr[0] = zArr[0] | wireman(this.f24999polloi, kowloonVar.f24999polloi);
        boolean z2 = zWireman | zWireman2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | wireman(this.f24987adultoid, kowloonVar.f24987adultoid);
        zArr[4] = wireman(this.f24991dovishness, kowloonVar.f24991dovishness) | zArr[4];
    }

    public void molybdenite(int i, int i2, impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        float fMin;
        float f;
        float f2 = impromptuVar.f25033attabal / 100.0f;
        this.f24997monoploid = f2;
        this.f24988arytenoidectomy = impromptuVar.f24975cutely;
        this.f24998oilcan = impromptuVar.f24981monoploid;
        float f3 = Float.isNaN(impromptuVar.f24973apical) ? f2 : impromptuVar.f24973apical;
        float f4 = Float.isNaN(impromptuVar.f24976formularize) ? f2 : impromptuVar.f24976formularize;
        float f5 = kowloonVar2.f24987adultoid;
        float f6 = kowloonVar.f24987adultoid;
        float f7 = kowloonVar2.f24991dovishness;
        float f8 = kowloonVar.f24991dovishness;
        this.f24999polloi = this.f24997monoploid;
        this.f24987adultoid = (int) (f6 + ((f5 - f6) * f3));
        this.f24991dovishness = (int) (f8 + ((f7 - f8) * f4));
        if (impromptuVar.f24981monoploid != 2) {
            float f9 = Float.isNaN(impromptuVar.f24977impassible) ? f2 : impromptuVar.f24977impassible;
            float f10 = kowloonVar2.f24996molybdenite;
            float f11 = kowloonVar.f24996molybdenite;
            this.f24996molybdenite = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(impromptuVar.f24984triweekly)) {
                f2 = impromptuVar.f24984triweekly;
            }
            float f12 = kowloonVar2.f24993graveside;
            float f13 = kowloonVar.f24993graveside;
            this.f24993graveside = (f2 * (f12 - f13)) + f13;
        } else {
            if (Float.isNaN(impromptuVar.f24977impassible)) {
                float f14 = kowloonVar2.f24996molybdenite;
                float f15 = kowloonVar.f24996molybdenite;
                fMin = ((f14 - f15) * f2) + f15;
            } else {
                fMin = Math.min(f4, f3) * impromptuVar.f24977impassible;
            }
            this.f24996molybdenite = fMin;
            if (Float.isNaN(impromptuVar.f24984triweekly)) {
                float f16 = kowloonVar2.f24993graveside;
                float f17 = kowloonVar.f24993graveside;
                f = (f2 * (f16 - f17)) + f17;
            } else {
                f = impromptuVar.f24984triweekly;
            }
            this.f24993graveside = f;
        }
        this.f24989cord = kowloonVar.f24989cord;
        this.f24995kowloon = lerp.dern.dern(impromptuVar.f24978impromptu);
        this.f25000preprohormone = impromptuVar.f24983taiyuan;
    }

    public void monoploid(impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        float f = impromptuVar.f25033attabal / 100.0f;
        this.f24997monoploid = f;
        this.f24988arytenoidectomy = impromptuVar.f24975cutely;
        float f2 = Float.isNaN(impromptuVar.f24973apical) ? f : impromptuVar.f24973apical;
        float f3 = Float.isNaN(impromptuVar.f24976formularize) ? f : impromptuVar.f24976formularize;
        float f4 = kowloonVar2.f24987adultoid;
        float f5 = kowloonVar.f24987adultoid;
        float f6 = kowloonVar2.f24991dovishness;
        float f7 = kowloonVar.f24991dovishness;
        this.f24999polloi = this.f24997monoploid;
        float f8 = kowloonVar.f24996molybdenite;
        float f9 = kowloonVar.f24993graveside;
        float f10 = f;
        float f11 = (kowloonVar2.f24996molybdenite + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f12 = (kowloonVar2.f24993graveside + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f13 = (f4 - f5) * f2;
        float f14 = f13 / 2.0f;
        this.f24996molybdenite = (int) ((f8 + (f11 * f10)) - f14);
        float f15 = (f6 - f7) * f3;
        float f16 = f15 / 2.0f;
        this.f24993graveside = (int) ((f9 + (f12 * f10)) - f16);
        this.f24987adultoid = (int) (f5 + f13);
        this.f24991dovishness = (int) (f7 + f15);
        float f17 = Float.isNaN(impromptuVar.f24977impassible) ? f10 : impromptuVar.f24977impassible;
        boolean zIsNaN = Float.isNaN(impromptuVar.f24974arytenoidectomy);
        float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f19 = zIsNaN ? 0.0f : impromptuVar.f24974arytenoidectomy;
        if (!Float.isNaN(impromptuVar.f24984triweekly)) {
            f10 = impromptuVar.f24984triweekly;
        }
        if (!Float.isNaN(impromptuVar.f24979kowloon)) {
            f18 = impromptuVar.f24979kowloon;
        }
        this.f24998oilcan = 0;
        this.f24996molybdenite = (int) (((kowloonVar.f24996molybdenite + (f17 * f11)) + (f18 * f12)) - f14);
        this.f24993graveside = (int) (((kowloonVar.f24993graveside + (f11 * f19)) + (f12 * f10)) - f16);
        this.f24995kowloon = lerp.dern.dern(impromptuVar.f24978impromptu);
        this.f25000preprohormone = impromptuVar.f24983taiyuan;
    }

    public void polloi(impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        float f = impromptuVar.f25033attabal / 100.0f;
        this.f24997monoploid = f;
        this.f24988arytenoidectomy = impromptuVar.f24975cutely;
        float f2 = Float.isNaN(impromptuVar.f24973apical) ? f : impromptuVar.f24973apical;
        float f3 = Float.isNaN(impromptuVar.f24976formularize) ? f : impromptuVar.f24976formularize;
        float f4 = kowloonVar2.f24987adultoid - kowloonVar.f24987adultoid;
        float f5 = kowloonVar2.f24991dovishness - kowloonVar.f24991dovishness;
        this.f24999polloi = this.f24997monoploid;
        if (!Float.isNaN(impromptuVar.f24977impassible)) {
            f = impromptuVar.f24977impassible;
        }
        float f6 = kowloonVar.f24996molybdenite;
        float f7 = kowloonVar.f24987adultoid;
        float f8 = kowloonVar.f24993graveside;
        float f9 = kowloonVar.f24991dovishness;
        float f10 = f;
        float f11 = (kowloonVar2.f24996molybdenite + (kowloonVar2.f24987adultoid / 2.0f)) - ((f7 / 2.0f) + f6);
        float f12 = (kowloonVar2.f24993graveside + (kowloonVar2.f24991dovishness / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = f11 * f10;
        float f14 = f4 * f2;
        float f15 = f14 / 2.0f;
        this.f24996molybdenite = (int) ((f6 + f13) - f15);
        float f16 = f12 * f10;
        float f17 = f5 * f3;
        float f18 = f17 / 2.0f;
        this.f24993graveside = (int) ((f8 + f16) - f18);
        this.f24987adultoid = (int) (f7 + f14);
        this.f24991dovishness = (int) (f9 + f17);
        float f19 = Float.isNaN(impromptuVar.f24984triweekly) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : impromptuVar.f24984triweekly;
        this.f24998oilcan = 1;
        float f20 = (int) ((kowloonVar.f24996molybdenite + f13) - f15);
        float f21 = (int) ((kowloonVar.f24993graveside + f16) - f18);
        this.f24996molybdenite = f20 + ((-f12) * f19);
        this.f24993graveside = f21 + (f11 * f19);
        this.f24989cord = this.f24989cord;
        this.f24995kowloon = lerp.dern.dern(impromptuVar.f24978impromptu);
        this.f25000preprohormone = impromptuVar.f24983taiyuan;
    }

    public void rotuma(impassible impassibleVar, kowloon kowloonVar) {
        double d = ((this.f24996molybdenite + (this.f24987adultoid / 2.0f)) - kowloonVar.f24996molybdenite) - (kowloonVar.f24987adultoid / 2.0f);
        double d2 = ((this.f24993graveside + (this.f24991dovishness / 2.0f)) - kowloonVar.f24993graveside) - (kowloonVar.f24991dovishness / 2.0f);
        this.f25003stratoscope = impassibleVar;
        this.f24996molybdenite = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f24990cuirassed)) {
            this.f24993graveside = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f24993graveside = (float) Math.toRadians(this.f24990cuirassed);
        }
    }

    public void taiyuan(double[] dArr, int[] iArr) {
        float[] fArr = {this.f24999polloi, this.f24996molybdenite, this.f24993graveside, this.f24987adultoid, this.f24991dovishness, this.f24992gintrap};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void triweekly(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f24996molybdenite;
        float fCos = this.f24993graveside;
        float f2 = this.f24987adultoid;
        float f3 = this.f24991dovishness;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        impassible impassibleVar = this.f25003stratoscope;
        if (impassibleVar != null) {
            float fCutely = impassibleVar.cutely();
            float fApical = this.f25003stratoscope.apical();
            double d = f;
            double d2 = fCos;
            float fSin = (float) ((((double) fCutely) + (Math.sin(d2) * d)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) fApical) - (d * Math.cos(d2))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        float f5 = f2 + f;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f7 = f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f8 = fCos + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f9 = f5 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f10 = fCos + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f11 = f5 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f12 = f6 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f14 = f6 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fArr[i] = f7;
        fArr[i + 1] = f8;
        fArr[i + 2] = f9;
        fArr[i + 3] = f10;
        fArr[i + 4] = f11;
        fArr[i + 5] = f12;
        fArr[i + 6] = f13;
        fArr[i + 7] = f14;
    }

    public final boolean wireman(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public kowloon(int i, int i2, impromptu impromptuVar, kowloon kowloonVar, kowloon kowloonVar2) {
        int i3 = wireman.f25032beachfront;
        this.f25000preprohormone = i3;
        this.f24989cord = i3;
        this.f24990cuirassed = Float.NaN;
        this.f25003stratoscope = null;
        this.f25004trm = new LinkedHashMap<>();
        this.f24998oilcan = 0;
        this.f25002sealless = new double[18];
        this.f24994kattegat = new double[18];
        if (kowloonVar.f24989cord != wireman.f25032beachfront) {
            molybdenite(i, i2, impromptuVar, kowloonVar, kowloonVar2);
            return;
        }
        int i4 = impromptuVar.f24981monoploid;
        if (i4 == 1) {
            polloi(impromptuVar, kowloonVar, kowloonVar2);
            return;
        }
        if (i4 == 2) {
            graveside(i, i2, impromptuVar, kowloonVar, kowloonVar2);
        } else if (i4 != 3) {
            monoploid(impromptuVar, kowloonVar, kowloonVar2);
        } else {
            arytenoidectomy(impromptuVar, kowloonVar, kowloonVar2);
        }
    }
}
