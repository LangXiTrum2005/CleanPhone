package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static int f7996sealless = 1;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public String f7998arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f8003graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f8004kowloon;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public Type f8010rotuma;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f8006monoploid = -1;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f8008polloi = -1;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f8005molybdenite = 0;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f7997adultoid = false;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float[] f8001dovishness = new float[9];

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float[] f8002gintrap = new float[9];

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public saneness[] f8009preprohormone = new saneness[16];

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f7999cord = 0;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f8000cuirassed = 0;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public boolean f8011stratoscope = false;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int f8012trm = -1;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public float f8007oilcan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public HashSet<saneness> f8013yemenite = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f8010rotuma = type;
    }

    public static void wireman() {
        f7996sealless++;
    }

    public void apical(Type type, String str) {
        this.f8010rotuma = type;
    }

    public final void attabal(saneness sanenessVar) {
        int i = 0;
        while (true) {
            int i2 = this.f7999cord;
            if (i >= i2) {
                saneness[] sanenessVarArr = this.f8009preprohormone;
                if (i2 >= sanenessVarArr.length) {
                    this.f8009preprohormone = (saneness[]) Arrays.copyOf(sanenessVarArr, sanenessVarArr.length * 2);
                }
                saneness[] sanenessVarArr2 = this.f8009preprohormone;
                int i3 = this.f7999cord;
                sanenessVarArr2[i3] = sanenessVar;
                this.f7999cord = i3 + 1;
                return;
            }
            if (this.f8009preprohormone[i] == sanenessVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public void cutely(dern dernVar, float f) {
        this.f8003graveside = f;
        this.f7997adultoid = true;
        this.f8011stratoscope = false;
        this.f8012trm = -1;
        this.f8007oilcan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = this.f7999cord;
        this.f8008polloi = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8009preprohormone[i2].cuirassed(dernVar, this, false);
        }
        this.f7999cord = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f8006monoploid - solverVariable.f8006monoploid;
    }

    public final void formularize(dern dernVar, saneness sanenessVar) {
        int i = this.f7999cord;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8009preprohormone[i2].stratoscope(dernVar, sanenessVar, false);
        }
        this.f7999cord = 0;
    }

    public final void marial(saneness sanenessVar) {
        int i = this.f7999cord;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8009preprohormone[i2] == sanenessVar) {
                while (i2 < i - 1) {
                    saneness[] sanenessVarArr = this.f8009preprohormone;
                    int i3 = i2 + 1;
                    sanenessVarArr[i2] = sanenessVarArr[i3];
                    i2 = i3;
                }
                this.f7999cord--;
                return;
            }
            i2++;
        }
    }

    public void taiyuan() {
        this.f7998arytenoidectomy = null;
        this.f8010rotuma = Type.UNKNOWN;
        this.f8005molybdenite = 0;
        this.f8006monoploid = -1;
        this.f8008polloi = -1;
        this.f8003graveside = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f7997adultoid = false;
        this.f8011stratoscope = false;
        this.f8012trm = -1;
        this.f8007oilcan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = this.f7999cord;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8009preprohormone[i2] = null;
        }
        this.f7999cord = 0;
        this.f8000cuirassed = 0;
        this.f8004kowloon = false;
        Arrays.fill(this.f8002gintrap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public String toString() {
        if (this.f7998arytenoidectomy != null) {
            return "" + this.f7998arytenoidectomy;
        }
        return "" + this.f8006monoploid;
    }
}
