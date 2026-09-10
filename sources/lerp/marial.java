package lerp;

import com.ironsource.X3;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: KeyCycleOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public lerp.saneness f32823attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f32826dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public saneness f32828saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f32829wireman = 0;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f32827marial = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f32824beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ArrayList<dern> f32825competently = new ArrayList<>();

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public class attabal implements Comparator<dern> {
        public attabal() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(dern dernVar, dern dernVar2) {
            return Integer.compare(dernVar.f32831attabal, dernVar2.f32831attabal);
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f32831attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f32832dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f32833marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f32834saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f32835wireman;

        public dern(int i, float f, float f2, float f3, float f4) {
            this.f32831attabal = i;
            this.f32834saneness = f4;
            this.f32832dern = f2;
            this.f32835wireman = f;
            this.f32833marial = f3;
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float[] f32836apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public float f32837arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f32838attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public float[] f32839beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public double[] f32840competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float[] f32841cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f32842dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f32843formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public lerp.saneness f32844impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float[] f32845impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public double[] f32846kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f32847marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public impromptu f32848saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float[] f32849taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public double[] f32850triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f32851wireman;

        public saneness(int i, String str, int i2, int i3) {
            impromptu impromptuVar = new impromptu();
            this.f32848saneness = impromptuVar;
            this.f32842dern = 0;
            this.f32851wireman = 1;
            this.f32847marial = 2;
            this.f32843formularize = i;
            this.f32838attabal = i2;
            impromptuVar.competently(i, str);
            this.f32839beachfront = new float[i3];
            this.f32840competently = new double[i3];
            this.f32845impromptu = new float[i3];
            this.f32849taiyuan = new float[i3];
            this.f32841cutely = new float[i3];
            this.f32836apical = new float[i3];
        }

        public double attabal(float f) {
            lerp.saneness sanenessVar = this.f32844impassible;
            if (sanenessVar != null) {
                double d = f;
                sanenessVar.competently(d, this.f32846kowloon);
                this.f32844impassible.wireman(d, this.f32850triweekly);
            } else {
                double[] dArr = this.f32846kowloon;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double dMarial = this.f32848saneness.marial(d2, this.f32850triweekly[1]);
            double dWireman = this.f32848saneness.wireman(d2, this.f32850triweekly[1], this.f32846kowloon[1]);
            double[] dArr2 = this.f32846kowloon;
            return dArr2[0] + (dMarial * dArr2[2]) + (dWireman * this.f32850triweekly[2]);
        }

        public void dern(int i, int i2, float f, float f2, float f3, float f4) {
            this.f32840competently[i] = ((double) i2) / 100.0d;
            this.f32845impromptu[i] = f;
            this.f32849taiyuan[i] = f2;
            this.f32841cutely[i] = f3;
            this.f32839beachfront[i] = f4;
        }

        public double saneness(float f) {
            lerp.saneness sanenessVar = this.f32844impassible;
            if (sanenessVar != null) {
                sanenessVar.wireman(f, this.f32850triweekly);
            } else {
                double[] dArr = this.f32850triweekly;
                dArr[0] = this.f32849taiyuan[0];
                dArr[1] = this.f32841cutely[0];
                dArr[2] = this.f32839beachfront[0];
            }
            double[] dArr2 = this.f32850triweekly;
            return dArr2[0] + (this.f32848saneness.marial(f, dArr2[1]) * this.f32850triweekly[2]);
        }

        public void wireman(float f) {
            this.f32837arytenoidectomy = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f32840competently.length, 3);
            float[] fArr = this.f32839beachfront;
            this.f32850triweekly = new double[fArr.length + 2];
            this.f32846kowloon = new double[fArr.length + 2];
            if (this.f32840competently[0] > 0.0d) {
                this.f32848saneness.attabal(0.0d, this.f32845impromptu[0]);
            }
            double[] dArr2 = this.f32840competently;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f32848saneness.attabal(1.0d, this.f32845impromptu[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.f32849taiyuan[i];
                dArr3[1] = this.f32841cutely[i];
                dArr3[2] = this.f32839beachfront[i];
                this.f32848saneness.attabal(this.f32840competently[i], this.f32845impromptu[i]);
            }
            this.f32848saneness.beachfront();
            double[] dArr4 = this.f32840competently;
            if (dArr4.length > 1) {
                this.f32844impassible = lerp.saneness.attabal(0, dArr4, dArr);
            } else {
                this.f32844impassible = null;
            }
        }
    }

    public float attabal(float f) {
        return (float) this.f32828saneness.saneness(f);
    }

    public void beachfront(String str) {
        this.f32826dern = str;
    }

    public void competently(float f) {
        int size = this.f32825competently.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f32825competently, new attabal());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f32828saneness = new saneness(this.f32829wireman, this.f32827marial, this.f32824beachfront, size);
        int i = 0;
        for (dern dernVar : this.f32825competently) {
            float f2 = dernVar.f32835wireman;
            dArr[i] = ((double) f2) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = dernVar.f32834saneness;
            dArr3[0] = f3;
            float f4 = dernVar.f32832dern;
            dArr3[1] = f4;
            float f5 = dernVar.f32833marial;
            dArr3[2] = f5;
            this.f32828saneness.dern(i, dernVar.f32831attabal, f2, f4, f5, f3);
            i++;
        }
        this.f32828saneness.wireman(f);
        this.f32823attabal = lerp.saneness.attabal(0, dArr, dArr2);
    }

    public boolean impromptu() {
        return this.f32824beachfront == 1;
    }

    public void marial(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f32825competently.add(new dern(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f32824beachfront = i3;
        }
        this.f32829wireman = i2;
        dern(obj);
        this.f32827marial = str;
    }

    public float saneness(float f) {
        return (float) this.f32828saneness.attabal(f);
    }

    public String toString() {
        String str = this.f32826dern;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (dern dernVar : this.f32825competently) {
            str = str + X3.j.d + dernVar.f32831attabal + " , " + decimalFormat.format(dernVar.f32834saneness) + "] ";
        }
        return str;
    }

    public void wireman(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f32825competently.add(new dern(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f32824beachfront = i3;
        }
        this.f32829wireman = i2;
        this.f32827marial = str;
    }

    public void dern(Object obj) {
    }
}
