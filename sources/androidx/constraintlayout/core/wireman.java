package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PriorityGoalRow.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends androidx.constraintlayout.core.saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public saneness f8335apical;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f8336competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f8337cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public coffeecake.attabal f8338formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public SolverVariable[] f8339impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public SolverVariable[] f8340taiyuan;

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class attabal implements Comparator<SolverVariable> {
        public attabal() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f8006monoploid - solverVariable2.f8006monoploid;
        }
    }

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public SolverVariable f8342attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public wireman f8344saneness;

        public saneness(wireman wiremanVar) {
            this.f8344saneness = wiremanVar;
        }

        public boolean attabal(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (!this.f8342attabal.f8004kowloon) {
                for (int i = 0; i < 9; i++) {
                    float f2 = solverVariable.f8002gintrap[i];
                    if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f8342attabal.f8002gintrap[i] = f3;
                    } else {
                        this.f8342attabal.f8002gintrap[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f8342attabal.f8002gintrap;
                float f4 = fArr[i2] + (solverVariable.f8002gintrap[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f8342attabal.f8002gintrap[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                wireman.this.kattegat(this.f8342attabal);
            }
            return false;
        }

        public final boolean dern() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f8342attabal.f8002gintrap[i];
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return false;
                }
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return true;
                }
            }
            return false;
        }

        public void marial() {
            Arrays.fill(this.f8342attabal.f8002gintrap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public void saneness(SolverVariable solverVariable) {
            this.f8342attabal = solverVariable;
        }

        public String toString() {
            String str = "[ ";
            if (this.f8342attabal != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f8342attabal.f8002gintrap[i] + " ";
                }
            }
            return str + "] " + this.f8342attabal;
        }

        public final boolean wireman(SolverVariable solverVariable) {
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.f8002gintrap[i];
                float f2 = this.f8342attabal.f8002gintrap[i];
                if (f2 != f) {
                    if (f2 < f) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public wireman(coffeecake.attabal attabalVar) {
        super(attabalVar);
        this.f8336competently = 128;
        this.f8339impromptu = new SolverVariable[128];
        this.f8340taiyuan = new SolverVariable[128];
        this.f8337cutely = 0;
        this.f8335apical = new saneness(this);
        this.f8338formularize = attabalVar;
    }

    @Override // androidx.constraintlayout.core.saneness, androidx.constraintlayout.core.dern.attabal
    public void clear() {
        this.f8337cutely = 0;
        this.f8070saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.constraintlayout.core.saneness, androidx.constraintlayout.core.dern.attabal
    public void dern(SolverVariable solverVariable) {
        this.f8335apical.saneness(solverVariable);
        this.f8335apical.marial();
        solverVariable.f8002gintrap[solverVariable.f8005molybdenite] = 1.0f;
        sealless(solverVariable);
    }

    @Override // androidx.constraintlayout.core.saneness, androidx.constraintlayout.core.dern.attabal
    public boolean isEmpty() {
        return this.f8337cutely == 0;
    }

    public final void kattegat(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f8337cutely) {
            if (this.f8339impromptu[i] == solverVariable) {
                while (true) {
                    int i2 = this.f8337cutely;
                    if (i >= i2 - 1) {
                        this.f8337cutely = i2 - 1;
                        solverVariable.f8004kowloon = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f8339impromptu;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.saneness, androidx.constraintlayout.core.dern.attabal
    public SolverVariable saneness(dern dernVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f8337cutely; i2++) {
            SolverVariable solverVariable = this.f8339impromptu[i2];
            if (!zArr[solverVariable.f8006monoploid]) {
                this.f8335apical.saneness(solverVariable);
                if (i == -1) {
                    if (this.f8335apical.dern()) {
                        i = i2;
                    }
                } else if (this.f8335apical.wireman(this.f8339impromptu[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8339impromptu[i];
    }

    public final void sealless(SolverVariable solverVariable) {
        int i;
        int i2 = this.f8337cutely + 1;
        SolverVariable[] solverVariableArr = this.f8339impromptu;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f8339impromptu = solverVariableArr2;
            this.f8340taiyuan = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f8339impromptu;
        int i3 = this.f8337cutely;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f8337cutely = i4;
        if (i4 > 1 && solverVariableArr3[i3].f8006monoploid > solverVariable.f8006monoploid) {
            int i5 = 0;
            while (true) {
                i = this.f8337cutely;
                if (i5 >= i) {
                    break;
                }
                this.f8340taiyuan[i5] = this.f8339impromptu[i5];
                i5++;
            }
            Arrays.sort(this.f8340taiyuan, 0, i, new attabal());
            for (int i6 = 0; i6 < this.f8337cutely; i6++) {
                this.f8339impromptu[i6] = this.f8340taiyuan[i6];
            }
        }
        solverVariable.f8004kowloon = true;
        solverVariable.attabal(this);
    }

    @Override // androidx.constraintlayout.core.saneness
    public void stratoscope(dern dernVar, androidx.constraintlayout.core.saneness sanenessVar, boolean z) {
        SolverVariable solverVariable = sanenessVar.f8066attabal;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.saneness.attabal attabalVar = sanenessVar.f8069marial;
        int iBeachfront = attabalVar.beachfront();
        for (int i = 0; i < iBeachfront; i++) {
            SolverVariable solverVariableSaneness = attabalVar.saneness(i);
            float fTaiyuan = attabalVar.taiyuan(i);
            this.f8335apical.saneness(solverVariableSaneness);
            if (this.f8335apical.attabal(solverVariable, fTaiyuan)) {
                sealless(solverVariableSaneness);
            }
            this.f8070saneness += sanenessVar.f8070saneness * fTaiyuan;
        }
        kattegat(solverVariable);
    }

    @Override // androidx.constraintlayout.core.saneness
    public String toString() {
        String str = " goal -> (" + this.f8070saneness + ") : ";
        for (int i = 0; i < this.f8337cutely; i++) {
            this.f8335apical.saneness(this.f8339impromptu[i]);
            str = str + this.f8335apical + " ";
        }
        return str;
    }
}
