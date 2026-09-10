package androidx.core.view.insets;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import monroe.wireman;

/* JADX INFO: compiled from: Protection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f9343attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f9344beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f9345competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public wireman f9346dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public Object f9347impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f9348marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public wireman f9349saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f9350wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Interpolator f9342taiyuan = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Interpolator f9340cutely = new PathInterpolator(0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Interpolator f9339apical = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final Interpolator f9341formularize = new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);

    /* JADX INFO: renamed from: androidx.core.view.insets.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Protection.java */
    public static class C0060attabal {
        public static /* synthetic */ void attabal(C0060attabal c0060attabal, wireman wiremanVar) {
            throw null;
        }

        public static /* synthetic */ int beachfront(C0060attabal c0060attabal) {
            throw null;
        }

        public static /* synthetic */ void competently(C0060attabal c0060attabal, float f) {
            throw null;
        }

        public static /* synthetic */ void dern(C0060attabal c0060attabal, int i) {
            throw null;
        }

        public static /* synthetic */ int impromptu(C0060attabal c0060attabal) {
            throw null;
        }

        public static /* synthetic */ void marial(C0060attabal c0060attabal, float f) {
            throw null;
        }

        public static /* synthetic */ void saneness(C0060attabal c0060attabal, int i) {
            throw null;
        }

        public static /* synthetic */ void taiyuan(C0060attabal c0060attabal, float f) {
            throw null;
        }

        public static /* synthetic */ void wireman(C0060attabal c0060attabal, boolean z) {
            throw null;
        }
    }

    public void apical(boolean z) {
        C0060attabal.wireman(null, z);
    }

    public boolean competently() {
        return false;
    }

    public void cutely(float f) {
        this.f9344beachfront = f;
        impassible();
    }

    public C0060attabal dern() {
        return null;
    }

    public final void formularize() {
        C0060attabal.marial(null, this.f9350wireman * this.f9348marial);
    }

    public final void impassible() {
        float f = this.f9345competently * this.f9344beachfront;
        int i = this.f9343attabal;
        if (i == 1) {
            C0060attabal.competently(null, (-(1.0f - f)) * C0060attabal.beachfront(null));
            return;
        }
        if (i == 2) {
            C0060attabal.taiyuan(null, (-(1.0f - f)) * C0060attabal.impromptu(null));
        } else if (i == 4) {
            C0060attabal.competently(null, (1.0f - f) * C0060attabal.beachfront(null));
        } else {
            if (i != 8) {
                return;
            }
            C0060attabal.taiyuan(null, (1.0f - f) * C0060attabal.impromptu(null));
        }
    }

    public void impromptu(Object obj) {
        this.f9347impromptu = obj;
    }

    public int marial() {
        return this.f9343attabal;
    }

    public wireman saneness(wireman wiremanVar, wireman wiremanVar2, wireman wiremanVar3) {
        this.f9349saneness = wiremanVar;
        this.f9346dern = wiremanVar2;
        C0060attabal.attabal(null, wiremanVar3);
        return triweekly();
    }

    public void taiyuan(float f) {
        this.f9350wireman = f;
        formularize();
    }

    public wireman triweekly() {
        int i;
        wireman wiremanVarDern = wireman.f33603marial;
        int i2 = this.f9343attabal;
        if (i2 == 1) {
            i = this.f9349saneness.f33604attabal;
            C0060attabal.saneness(null, beachfront(this.f9346dern.f33604attabal));
            if (competently()) {
                wiremanVarDern = wireman.dern(beachfront(i), 0, 0, 0);
            }
        } else if (i2 == 2) {
            i = this.f9349saneness.f33606saneness;
            C0060attabal.dern(null, beachfront(this.f9346dern.f33606saneness));
            if (competently()) {
                wiremanVarDern = wireman.dern(0, beachfront(i), 0, 0);
            }
        } else if (i2 == 4) {
            i = this.f9349saneness.f33605dern;
            C0060attabal.saneness(null, beachfront(this.f9346dern.f33605dern));
            if (competently()) {
                wiremanVarDern = wireman.dern(0, 0, beachfront(i), 0);
            }
        } else if (i2 != 8) {
            i = 0;
        } else {
            i = this.f9349saneness.f33607wireman;
            C0060attabal.dern(null, beachfront(this.f9346dern.f33607wireman));
            if (competently()) {
                wiremanVarDern = wireman.dern(0, 0, 0, beachfront(i));
            }
        }
        apical(i > 0);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        taiyuan(i > 0 ? 1.0f : 0.0f);
        if (i > 0) {
            f = 1.0f;
        }
        cutely(f);
        return wiremanVarDern;
    }

    public Object wireman() {
        return this.f9347impromptu;
    }

    public void attabal(int i) {
    }

    public int beachfront(int i) {
        return i;
    }
}
