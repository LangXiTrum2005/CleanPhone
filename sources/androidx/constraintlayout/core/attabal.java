package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: ArrayLinkedVariables.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements saneness.attabal {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static float f8015formularize = 0.001f;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final coffeecake.attabal f8021dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f8024saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f8017attabal = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f8026wireman = 8;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public SolverVariable f8023marial = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int[] f8018beachfront = new int[8];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int[] f8019competently = new int[8];

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float[] f8022impromptu = new float[8];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f8025taiyuan = -1;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f8020cutely = -1;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f8016apical = false;

    public attabal(saneness sanenessVar, coffeecake.attabal attabalVar) {
        this.f8024saneness = sanenessVar;
        this.f8021dern = attabalVar;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void apical(float f) {
        int i = this.f8025taiyuan;
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            float[] fArr = this.f8022impromptu;
            fArr[i] = fArr[i] / f;
            i = this.f8019competently[i];
        }
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public boolean attabal(SolverVariable solverVariable) {
        int i = this.f8025taiyuan;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            if (this.f8018beachfront[i] == solverVariable.f8006monoploid) {
                return true;
            }
            i = this.f8019competently[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public int beachfront() {
        return this.f8017attabal;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public final void clear() {
        int i = this.f8025taiyuan;
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            SolverVariable solverVariable = this.f8021dern.f15760wireman[this.f8018beachfront[i]];
            if (solverVariable != null) {
                solverVariable.marial(this.f8024saneness);
            }
            i = this.f8019competently[i];
        }
        this.f8025taiyuan = -1;
        this.f8020cutely = -1;
        this.f8016apical = false;
        this.f8017attabal = 0;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float competently(saneness sanenessVar, boolean z) {
        float fCutely = cutely(sanenessVar.f8066attabal);
        marial(sanenessVar.f8066attabal, z);
        saneness.attabal attabalVar = sanenessVar.f8069marial;
        int iBeachfront = attabalVar.beachfront();
        for (int i = 0; i < iBeachfront; i++) {
            SolverVariable solverVariableSaneness = attabalVar.saneness(i);
            dern(solverVariableSaneness, attabalVar.cutely(solverVariableSaneness) * fCutely, z);
        }
        return fCutely;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public final float cutely(SolverVariable solverVariable) {
        int i = this.f8025taiyuan;
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            if (this.f8018beachfront[i] == solverVariable.f8006monoploid) {
                return this.f8022impromptu[i];
            }
            i = this.f8019competently[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void dern(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f8015formularize;
        if (f <= (-f2) || f >= f2) {
            int i = this.f8025taiyuan;
            if (i == -1) {
                this.f8025taiyuan = 0;
                this.f8022impromptu[0] = f;
                this.f8018beachfront[0] = solverVariable.f8006monoploid;
                this.f8019competently[0] = -1;
                solverVariable.f8000cuirassed++;
                solverVariable.attabal(this.f8024saneness);
                this.f8017attabal++;
                if (this.f8016apical) {
                    return;
                }
                int i2 = this.f8020cutely + 1;
                this.f8020cutely = i2;
                int[] iArr = this.f8018beachfront;
                if (i2 >= iArr.length) {
                    this.f8016apical = true;
                    this.f8020cutely = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f8017attabal; i4++) {
                int i5 = this.f8018beachfront[i];
                int i6 = solverVariable.f8006monoploid;
                if (i5 == i6) {
                    float[] fArr = this.f8022impromptu;
                    float f3 = fArr[i] + f;
                    float f4 = f8015formularize;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i == this.f8025taiyuan) {
                            this.f8025taiyuan = this.f8019competently[i];
                        } else {
                            int[] iArr2 = this.f8019competently;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.marial(this.f8024saneness);
                        }
                        if (this.f8016apical) {
                            this.f8020cutely = i;
                        }
                        solverVariable.f8000cuirassed--;
                        this.f8017attabal--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f8019competently[i];
            }
            int length = this.f8020cutely;
            int i7 = length + 1;
            if (this.f8016apical) {
                int[] iArr3 = this.f8018beachfront;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f8018beachfront;
            if (length >= iArr4.length && this.f8017attabal < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f8018beachfront;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f8018beachfront;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f8026wireman * 2;
                this.f8026wireman = i9;
                this.f8016apical = false;
                this.f8020cutely = length - 1;
                this.f8022impromptu = Arrays.copyOf(this.f8022impromptu, i9);
                this.f8018beachfront = Arrays.copyOf(this.f8018beachfront, this.f8026wireman);
                this.f8019competently = Arrays.copyOf(this.f8019competently, this.f8026wireman);
            }
            this.f8018beachfront[length] = solverVariable.f8006monoploid;
            this.f8022impromptu[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f8019competently;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f8019competently[length] = this.f8025taiyuan;
                this.f8025taiyuan = length;
            }
            solverVariable.f8000cuirassed++;
            solverVariable.attabal(this.f8024saneness);
            this.f8017attabal++;
            if (!this.f8016apical) {
                this.f8020cutely++;
            }
            int i10 = this.f8020cutely;
            int[] iArr8 = this.f8018beachfront;
            if (i10 >= iArr8.length) {
                this.f8016apical = true;
                this.f8020cutely = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public final void impromptu(SolverVariable solverVariable, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            marial(solverVariable, true);
            return;
        }
        int i = this.f8025taiyuan;
        if (i == -1) {
            this.f8025taiyuan = 0;
            this.f8022impromptu[0] = f;
            this.f8018beachfront[0] = solverVariable.f8006monoploid;
            this.f8019competently[0] = -1;
            solverVariable.f8000cuirassed++;
            solverVariable.attabal(this.f8024saneness);
            this.f8017attabal++;
            if (this.f8016apical) {
                return;
            }
            int i2 = this.f8020cutely + 1;
            this.f8020cutely = i2;
            int[] iArr = this.f8018beachfront;
            if (i2 >= iArr.length) {
                this.f8016apical = true;
                this.f8020cutely = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f8017attabal; i4++) {
            int i5 = this.f8018beachfront[i];
            int i6 = solverVariable.f8006monoploid;
            if (i5 == i6) {
                this.f8022impromptu[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f8019competently[i];
        }
        int length = this.f8020cutely;
        int i7 = length + 1;
        if (this.f8016apical) {
            int[] iArr2 = this.f8018beachfront;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f8018beachfront;
        if (length >= iArr3.length && this.f8017attabal < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f8018beachfront;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f8018beachfront;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f8026wireman * 2;
            this.f8026wireman = i9;
            this.f8016apical = false;
            this.f8020cutely = length - 1;
            this.f8022impromptu = Arrays.copyOf(this.f8022impromptu, i9);
            this.f8018beachfront = Arrays.copyOf(this.f8018beachfront, this.f8026wireman);
            this.f8019competently = Arrays.copyOf(this.f8019competently, this.f8026wireman);
        }
        this.f8018beachfront[length] = solverVariable.f8006monoploid;
        this.f8022impromptu[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f8019competently;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f8019competently[length] = this.f8025taiyuan;
            this.f8025taiyuan = length;
        }
        solverVariable.f8000cuirassed++;
        solverVariable.attabal(this.f8024saneness);
        int i10 = this.f8017attabal + 1;
        this.f8017attabal = i10;
        if (!this.f8016apical) {
            this.f8020cutely++;
        }
        int[] iArr7 = this.f8018beachfront;
        if (i10 >= iArr7.length) {
            this.f8016apical = true;
        }
        if (this.f8020cutely >= iArr7.length) {
            this.f8016apical = true;
            this.f8020cutely = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public final float marial(SolverVariable solverVariable, boolean z) {
        if (this.f8023marial == solverVariable) {
            this.f8023marial = null;
        }
        int i = this.f8025taiyuan;
        if (i == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f8017attabal) {
            if (this.f8018beachfront[i] == solverVariable.f8006monoploid) {
                if (i == this.f8025taiyuan) {
                    this.f8025taiyuan = this.f8019competently[i];
                } else {
                    int[] iArr = this.f8019competently;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.marial(this.f8024saneness);
                }
                solverVariable.f8000cuirassed--;
                this.f8017attabal--;
                this.f8018beachfront[i] = -1;
                if (this.f8016apical) {
                    this.f8020cutely = i;
                }
                return this.f8022impromptu[i];
            }
            i2++;
            i3 = i;
            i = this.f8019competently[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public SolverVariable saneness(int i) {
        int i2 = this.f8025taiyuan;
        for (int i3 = 0; i2 != -1 && i3 < this.f8017attabal; i3++) {
            if (i3 == i) {
                return this.f8021dern.f15760wireman[this.f8018beachfront[i2]];
            }
            i2 = this.f8019competently[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public float taiyuan(int i) {
        int i2 = this.f8025taiyuan;
        for (int i3 = 0; i2 != -1 && i3 < this.f8017attabal; i3++) {
            if (i3 == i) {
                return this.f8022impromptu[i2];
            }
            i2 = this.f8019competently[i2];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public String toString() {
        int i = this.f8025taiyuan;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            str = ((str + " -> ") + this.f8022impromptu[i] + " : ") + this.f8021dern.f15760wireman[this.f8018beachfront[i]];
            i = this.f8019competently[i];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.saneness.attabal
    public void wireman() {
        int i = this.f8025taiyuan;
        for (int i2 = 0; i != -1 && i2 < this.f8017attabal; i2++) {
            float[] fArr = this.f8022impromptu;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f8019competently[i];
        }
    }
}
