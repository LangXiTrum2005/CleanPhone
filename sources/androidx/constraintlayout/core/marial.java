package androidx.constraintlayout.core;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: SolverVariableValues.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements saneness.attabal {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static float f8052triweekly = 0.001f;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final saneness f8059formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final coffeecake.attabal f8060impassible;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f8054attabal = -1;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f8063saneness = 16;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f8058dern = 16;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int[] f8065wireman = new int[16];

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int[] f8062marial = new int[16];

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int[] f8055beachfront = new int[16];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float[] f8056competently = new float[16];

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int[] f8061impromptu = new int[16];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int[] f8064taiyuan = new int[16];

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f8057cutely = 0;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f8053apical = -1;

    public marial(saneness sanenessVar, coffeecake.attabal attabalVar) {
        this.f8059formularize = sanenessVar;
        this.f8060impassible = attabalVar;
        clear();
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void apical(float f) {
        int i = this.f8057cutely;
        int i2 = this.f8053apical;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8056competently;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f8064taiyuan[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public int arytenoidectomy(SolverVariable solverVariable) {
        if (this.f8057cutely != 0 && solverVariable != null) {
            int i = solverVariable.f8006monoploid;
            int i2 = this.f8065wireman[i % this.f8058dern];
            if (i2 == -1) {
                return -1;
            }
            if (this.f8055beachfront[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f8062marial[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f8055beachfront[i2] != i);
            if (i2 != -1 && this.f8055beachfront[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public boolean attabal(SolverVariable solverVariable) {
        return arytenoidectomy(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public int beachfront() {
        return this.f8057cutely;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void clear() {
        int i = this.f8057cutely;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableSaneness = saneness(i2);
            if (solverVariableSaneness != null) {
                solverVariableSaneness.marial(this.f8059formularize);
            }
        }
        for (int i3 = 0; i3 < this.f8063saneness; i3++) {
            this.f8055beachfront[i3] = -1;
            this.f8062marial[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f8058dern; i4++) {
            this.f8065wireman[i4] = -1;
        }
        this.f8057cutely = 0;
        this.f8053apical = -1;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float competently(saneness sanenessVar, boolean z) {
        float fCutely = cutely(sanenessVar.f8066attabal);
        marial(sanenessVar.f8066attabal, z);
        marial marialVar = (marial) sanenessVar.f8069marial;
        int iBeachfront = marialVar.beachfront();
        int i = 0;
        int i2 = 0;
        while (i < iBeachfront) {
            int i3 = marialVar.f8055beachfront[i2];
            if (i3 != -1) {
                dern(this.f8060impassible.f15760wireman[i3], marialVar.f8056competently[i2] * fCutely, z);
                i++;
            }
            i2++;
        }
        return fCutely;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float cutely(SolverVariable solverVariable) {
        int iArytenoidectomy = arytenoidectomy(solverVariable);
        return iArytenoidectomy != -1 ? this.f8056competently[iArytenoidectomy] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void dern(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f8052triweekly;
        if (f <= (-f2) || f >= f2) {
            int iArytenoidectomy = arytenoidectomy(solverVariable);
            if (iArytenoidectomy == -1) {
                impromptu(solverVariable, f);
                return;
            }
            float[] fArr = this.f8056competently;
            float f3 = fArr[iArytenoidectomy] + f;
            fArr[iArytenoidectomy] = f3;
            float f4 = f8052triweekly;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iArytenoidectomy] = 0.0f;
            marial(solverVariable, z);
        }
    }

    public final void formularize(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f8006monoploid % this.f8058dern;
        int[] iArr2 = this.f8065wireman;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f8062marial;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f8062marial[i] = -1;
    }

    public final void impassible(int i, SolverVariable solverVariable, float f) {
        this.f8055beachfront[i] = solverVariable.f8006monoploid;
        this.f8056competently[i] = f;
        this.f8061impromptu[i] = -1;
        this.f8064taiyuan[i] = -1;
        solverVariable.attabal(this.f8059formularize);
        solverVariable.f8000cuirassed++;
        this.f8057cutely++;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void impromptu(SolverVariable solverVariable, float f) {
        float f2 = f8052triweekly;
        if (f > (-f2) && f < f2) {
            marial(solverVariable, true);
            return;
        }
        if (this.f8057cutely == 0) {
            impassible(0, solverVariable, f);
            formularize(solverVariable, 0);
            this.f8053apical = 0;
            return;
        }
        int iArytenoidectomy = arytenoidectomy(solverVariable);
        if (iArytenoidectomy != -1) {
            this.f8056competently[iArytenoidectomy] = f;
            return;
        }
        if (this.f8057cutely + 1 >= this.f8063saneness) {
            kowloon();
        }
        int i = this.f8057cutely;
        int i2 = this.f8053apical;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f8055beachfront[i2];
            int i6 = solverVariable.f8006monoploid;
            if (i5 == i6) {
                this.f8056competently[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f8064taiyuan[i2];
            if (i2 == -1) {
                break;
            }
        }
        monoploid(i3, solverVariable, f);
    }

    public final void kowloon() {
        int i = this.f8063saneness * 2;
        this.f8055beachfront = Arrays.copyOf(this.f8055beachfront, i);
        this.f8056competently = Arrays.copyOf(this.f8056competently, i);
        this.f8061impromptu = Arrays.copyOf(this.f8061impromptu, i);
        this.f8064taiyuan = Arrays.copyOf(this.f8064taiyuan, i);
        this.f8062marial = Arrays.copyOf(this.f8062marial, i);
        for (int i2 = this.f8063saneness; i2 < i; i2++) {
            this.f8055beachfront[i2] = -1;
            this.f8062marial[i2] = -1;
        }
        this.f8063saneness = i;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float marial(SolverVariable solverVariable, boolean z) {
        int iArytenoidectomy = arytenoidectomy(solverVariable);
        if (iArytenoidectomy == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        polloi(solverVariable);
        float f = this.f8056competently[iArytenoidectomy];
        if (this.f8053apical == iArytenoidectomy) {
            this.f8053apical = this.f8064taiyuan[iArytenoidectomy];
        }
        this.f8055beachfront[iArytenoidectomy] = -1;
        int[] iArr = this.f8061impromptu;
        int i = iArr[iArytenoidectomy];
        if (i != -1) {
            int[] iArr2 = this.f8064taiyuan;
            iArr2[i] = iArr2[iArytenoidectomy];
        }
        int i2 = this.f8064taiyuan[iArytenoidectomy];
        if (i2 != -1) {
            iArr[i2] = iArr[iArytenoidectomy];
        }
        this.f8057cutely--;
        solverVariable.f8000cuirassed--;
        if (z) {
            solverVariable.marial(this.f8059formularize);
        }
        return f;
    }

    public final void monoploid(int i, SolverVariable solverVariable, float f) {
        int iTriweekly = triweekly();
        impassible(iTriweekly, solverVariable, f);
        if (i != -1) {
            this.f8061impromptu[iTriweekly] = i;
            int[] iArr = this.f8064taiyuan;
            iArr[iTriweekly] = iArr[i];
            iArr[i] = iTriweekly;
        } else {
            this.f8061impromptu[iTriweekly] = -1;
            if (this.f8057cutely > 0) {
                this.f8064taiyuan[iTriweekly] = this.f8053apical;
                this.f8053apical = iTriweekly;
            } else {
                this.f8064taiyuan[iTriweekly] = -1;
            }
        }
        int i2 = this.f8064taiyuan[iTriweekly];
        if (i2 != -1) {
            this.f8061impromptu[i2] = iTriweekly;
        }
        formularize(solverVariable, iTriweekly);
    }

    public final void polloi(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i2 = solverVariable.f8006monoploid;
        int i3 = i2 % this.f8058dern;
        int[] iArr2 = this.f8065wireman;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f8055beachfront[i4] == i2) {
            int[] iArr3 = this.f8062marial;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f8062marial;
            i = iArr[i4];
            if (i == -1 || this.f8055beachfront[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f8055beachfront[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public SolverVariable saneness(int i) {
        int i2 = this.f8057cutely;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f8053apical;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f8060impassible.f15760wireman[this.f8055beachfront[i3]];
            }
            i3 = this.f8064taiyuan[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float taiyuan(int i) {
        int i2 = this.f8057cutely;
        int i3 = this.f8053apical;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f8056competently[i3];
            }
            i3 = this.f8064taiyuan[i3];
            if (i3 == -1) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f8057cutely;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableSaneness = saneness(i2);
            if (solverVariableSaneness != null) {
                String str2 = str + solverVariableSaneness + " = " + taiyuan(i2) + " ";
                int iArytenoidectomy = arytenoidectomy(solverVariableSaneness);
                String str3 = str2 + "[p: ";
                String str4 = (this.f8061impromptu[iArytenoidectomy] != -1 ? str3 + this.f8060impassible.f15760wireman[this.f8055beachfront[this.f8061impromptu[iArytenoidectomy]]] : str3 + "none") + ", n: ";
                str = (this.f8064taiyuan[iArytenoidectomy] != -1 ? str4 + this.f8060impassible.f15760wireman[this.f8055beachfront[this.f8064taiyuan[iArytenoidectomy]]] : str4 + "none") + X3.j.e;
            }
        }
        return str + " }";
    }

    public final int triweekly() {
        for (int i = 0; i < this.f8063saneness; i++) {
            if (this.f8055beachfront[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void wireman() {
        int i = this.f8057cutely;
        int i2 = this.f8053apical;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8056competently;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f8064taiyuan[i2];
            if (i2 == -1) {
                return;
            }
        }
    }
}
