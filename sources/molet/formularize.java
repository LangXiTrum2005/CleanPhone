package molet;

import android.util.AndroidRuntimeException;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: SpringAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize extends impromptu<formularize> {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public boolean f33521oilcan;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public impassible f33522stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public float f33523trm;

    public formularize(cutely cutelyVar) {
        super(cutelyVar);
        this.f33522stratoscope = null;
        this.f33523trm = Float.MAX_VALUE;
        this.f33521oilcan = false;
    }

    public boolean adultoid() {
        return this.f33522stratoscope.f33531saneness > 0.0d;
    }

    public boolean dovishness(float f, float f2) {
        return this.f33522stratoscope.marial(f, f2);
    }

    public final void gintrap() {
        impassible impassibleVar = this.f33522stratoscope;
        if (impassibleVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dSaneness = impassibleVar.saneness();
        if (dSaneness > this.f33551competently) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dSaneness < this.f33556impromptu) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public void graveside(float f) {
        if (impromptu()) {
            this.f33523trm = f;
            return;
        }
        if (this.f33522stratoscope == null) {
            this.f33522stratoscope = new impassible(f);
        }
        this.f33522stratoscope.competently(f);
        monoploid();
    }

    @Override // molet.impromptu
    public boolean molybdenite(long j) {
        if (this.f33521oilcan) {
            float f = this.f33523trm;
            if (f != Float.MAX_VALUE) {
                this.f33522stratoscope.competently(f);
                this.f33523trm = Float.MAX_VALUE;
            }
            this.f33558saneness = this.f33522stratoscope.saneness();
            this.f33549attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f33521oilcan = false;
            return true;
        }
        if (this.f33523trm != Float.MAX_VALUE) {
            long j2 = j / 2;
            impromptu.arytenoidectomy arytenoidectomyVarCutely = this.f33522stratoscope.cutely(this.f33558saneness, this.f33549attabal, j2);
            this.f33522stratoscope.competently(this.f33523trm);
            this.f33523trm = Float.MAX_VALUE;
            impromptu.arytenoidectomy arytenoidectomyVarCutely2 = this.f33522stratoscope.cutely(arytenoidectomyVarCutely.f33561attabal, arytenoidectomyVarCutely.f33562saneness, j2);
            this.f33558saneness = arytenoidectomyVarCutely2.f33561attabal;
            this.f33549attabal = arytenoidectomyVarCutely2.f33562saneness;
        } else {
            impromptu.arytenoidectomy arytenoidectomyVarCutely3 = this.f33522stratoscope.cutely(this.f33558saneness, this.f33549attabal, j);
            this.f33558saneness = arytenoidectomyVarCutely3.f33561attabal;
            this.f33549attabal = arytenoidectomyVarCutely3.f33562saneness;
        }
        float fMax = Math.max(this.f33558saneness, this.f33556impromptu);
        this.f33558saneness = fMax;
        float fMin = Math.min(fMax, this.f33551competently);
        this.f33558saneness = fMin;
        if (!dovishness(fMin, this.f33549attabal)) {
            return false;
        }
        this.f33558saneness = this.f33522stratoscope.saneness();
        this.f33549attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return true;
    }

    @Override // molet.impromptu
    public void monoploid() {
        gintrap();
        this.f33522stratoscope.taiyuan(competently());
        super.monoploid();
    }

    public void preprohormone() {
        if (!adultoid()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!marial().cutely()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f33550beachfront) {
            this.f33521oilcan = true;
        }
    }

    public formularize rotuma(impassible impassibleVar) {
        this.f33522stratoscope = impassibleVar;
        return this;
    }

    public <K> formularize(K k, taiyuan<K> taiyuanVar) {
        super(k, taiyuanVar);
        this.f33522stratoscope = null;
        this.f33523trm = Float.MAX_VALUE;
        this.f33521oilcan = false;
    }

    @Override // molet.impromptu
    public void arytenoidectomy(float f) {
    }
}
