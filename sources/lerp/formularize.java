package lerp;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: StepCurve.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize extends dern {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public competently f32803wireman;

    public formularize(String str) {
        this.f32796attabal = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f32803wireman = wireman(Arrays.copyOf(dArr, i + 1));
    }

    public static competently wireman(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        competently competentlyVar = new competently(dArr3, dArr2);
        PrintStream printStream = System.out;
        competentlyVar.dern(0.0d, 0);
        printStream.getClass();
        PrintStream printStream2 = System.out;
        competentlyVar.dern(1.0d, 0);
        printStream2.getClass();
        return competentlyVar;
    }

    @Override // lerp.dern
    public double attabal(double d) {
        return this.f32803wireman.dern(d, 0);
    }

    @Override // lerp.dern
    public double saneness(double d) {
        return this.f32803wireman.beachfront(d, 0);
    }
}
