package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements View.OnTouchListener {

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final int f9470sealless = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f9471adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f9473cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f9474cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f9475dovishness;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final View f9480monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public boolean f9481oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public Runnable f9482polloi;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public boolean f9485stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public boolean f9486trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public boolean f9487yemenite;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final C0065attabal f9478kowloon = new C0065attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Interpolator f9472arytenoidectomy = new AccelerateInterpolator();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float[] f9479molybdenite = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float[] f9477graveside = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float[] f9476gintrap = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float[] f9484rotuma = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float[] f9483preprohormone = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public static class C0065attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f9488apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f9489attabal;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f9492cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f9493dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f9496saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f9498wireman;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f9495marial = Long.MIN_VALUE;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public long f9497taiyuan = -1;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f9490beachfront = 0;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f9491competently = 0;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f9494impromptu = 0;

        public void apical(int i) {
            this.f9489attabal = i;
        }

        public void attabal() {
            if (this.f9490beachfront == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fCompetently = competently(marial(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f9490beachfront;
            this.f9490beachfront = jCurrentAnimationTimeMillis;
            float f = j * fCompetently;
            this.f9491competently = (int) (this.f9493dern * f);
            this.f9494impromptu = (int) (f * this.f9498wireman);
        }

        public int beachfront() {
            float f = this.f9498wireman;
            return (int) (f / Math.abs(f));
        }

        public final float competently(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void cutely(int i) {
            this.f9496saneness = i;
        }

        public int dern() {
            return this.f9494impromptu;
        }

        public void formularize(float f, float f2) {
            this.f9493dern = f;
            this.f9498wireman = f2;
        }

        public void impassible() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9495marial = jCurrentAnimationTimeMillis;
            this.f9497taiyuan = -1L;
            this.f9490beachfront = jCurrentAnimationTimeMillis;
            this.f9492cutely = 0.5f;
            this.f9491competently = 0;
            this.f9494impromptu = 0;
        }

        public boolean impromptu() {
            return this.f9497taiyuan > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9497taiyuan + ((long) this.f9488apical);
        }

        public final float marial(long j) {
            long j2 = this.f9495marial;
            if (j < j2) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            long j3 = this.f9497taiyuan;
            if (j3 < 0 || j < j3) {
                return attabal.marial((j - j2) / this.f9489attabal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
            }
            float f = this.f9492cutely;
            return (1.0f - f) + (f * attabal.marial((j - j3) / this.f9488apical, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        }

        public int saneness() {
            return this.f9491competently;
        }

        public void taiyuan() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9488apical = attabal.beachfront((int) (jCurrentAnimationTimeMillis - this.f9495marial), 0, this.f9496saneness);
            this.f9492cutely = marial(jCurrentAnimationTimeMillis);
            this.f9497taiyuan = jCurrentAnimationTimeMillis;
        }

        public int wireman() {
            float f = this.f9493dern;
            return (int) (f / Math.abs(f));
        }
    }

    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public class saneness implements Runnable {
        public saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            attabal attabalVar = attabal.this;
            if (attabalVar.f9486trm) {
                if (attabalVar.f9474cuirassed) {
                    attabalVar.f9474cuirassed = false;
                    attabalVar.f9478kowloon.impassible();
                }
                C0065attabal c0065attabal = attabal.this.f9478kowloon;
                if (c0065attabal.impromptu() || !attabal.this.adultoid()) {
                    attabal.this.f9486trm = false;
                    return;
                }
                attabal attabalVar2 = attabal.this;
                if (attabalVar2.f9485stratoscope) {
                    attabalVar2.f9485stratoscope = false;
                    attabalVar2.dern();
                }
                c0065attabal.attabal();
                attabal.this.cutely(c0065attabal.saneness(), c0065attabal.dern());
                premeiotic.timberyard(attabal.this.f9480monoploid, this);
            }
        }
    }

    public attabal(View view) {
        this.f9480monoploid = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        kowloon(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        arytenoidectomy(f3, f3);
        formularize(1);
        triweekly(Float.MAX_VALUE, Float.MAX_VALUE);
        molybdenite(0.2f, 0.2f);
        graveside(1.0f, 1.0f);
        apical(f9470sealless);
        polloi(500);
        monoploid(500);
    }

    public static int beachfront(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    public static float marial(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    public boolean adultoid() {
        C0065attabal c0065attabal = this.f9478kowloon;
        int iBeachfront = c0065attabal.beachfront();
        int iWireman = c0065attabal.wireman();
        if (iBeachfront == 0 || !saneness(iBeachfront)) {
            return iWireman != 0 && attabal(iWireman);
        }
        return true;
    }

    public attabal apical(int i) {
        this.f9475dovishness = i;
        return this;
    }

    public attabal arytenoidectomy(float f, float f2) {
        float[] fArr = this.f9484rotuma;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public abstract boolean attabal(int i);

    public final float competently(float f, float f2) {
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i = this.f9471adultoid;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return 1.0f - (f / f2);
                }
                if (this.f9486trm && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f / (-f2);
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public abstract void cutely(int i, int i2);

    public void dern() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.f9480monoploid.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final void dovishness() {
        int i;
        if (this.f9482polloi == null) {
            this.f9482polloi = new saneness();
        }
        this.f9486trm = true;
        this.f9474cuirassed = true;
        if (this.f9473cord || (i = this.f9475dovishness) <= 0) {
            this.f9482polloi.run();
        } else {
            premeiotic.milliradian(this.f9480monoploid, this.f9482polloi, i);
        }
        this.f9473cord = true;
    }

    public attabal formularize(int i) {
        this.f9471adultoid = i;
        return this;
    }

    public attabal graveside(float f, float f2) {
        float[] fArr = this.f9476gintrap;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public attabal impassible(boolean z) {
        if (this.f9481oilcan && !z) {
            taiyuan();
        }
        this.f9481oilcan = z;
        return this;
    }

    public final float impromptu(float f, float f2, float f3, float f4) {
        float interpolation;
        float fMarial = marial(f * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        float fCompetently = competently(f2 - f4, fMarial) - competently(f4, fMarial);
        if (fCompetently < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            interpolation = -this.f9472arytenoidectomy.getInterpolation(-fCompetently);
        } else {
            if (fCompetently <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            interpolation = this.f9472arytenoidectomy.getInterpolation(fCompetently);
        }
        return marial(interpolation, -1.0f, 1.0f);
    }

    public attabal kowloon(float f, float f2) {
        float[] fArr = this.f9483preprohormone;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public attabal molybdenite(float f, float f2) {
        float[] fArr = this.f9479molybdenite;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public attabal monoploid(int i) {
        this.f9478kowloon.cutely(i);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f9481oilcan) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                taiyuan();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    taiyuan();
                }
            }
            return !this.f9487yemenite && this.f9486trm;
        }
        this.f9485stratoscope = true;
        this.f9473cord = false;
        this.f9478kowloon.formularize(wireman(0, motionEvent.getX(), view.getWidth(), this.f9480monoploid.getWidth()), wireman(1, motionEvent.getY(), view.getHeight(), this.f9480monoploid.getHeight()));
        if (!this.f9486trm && adultoid()) {
            dovishness();
        }
        if (this.f9487yemenite) {
        }
    }

    public attabal polloi(int i) {
        this.f9478kowloon.apical(i);
        return this;
    }

    public abstract boolean saneness(int i);

    public final void taiyuan() {
        if (this.f9474cuirassed) {
            this.f9486trm = false;
        } else {
            this.f9478kowloon.taiyuan();
        }
    }

    public attabal triweekly(float f, float f2) {
        float[] fArr = this.f9477graveside;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public final float wireman(int i, float f, float f2, float f3) {
        float fImpromptu = impromptu(this.f9479molybdenite[i], f2, this.f9477graveside[i], f);
        if (fImpromptu == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f4 = this.f9476gintrap[i];
        float f5 = this.f9484rotuma[i];
        float f6 = this.f9483preprohormone[i];
        float f7 = f4 * f3;
        return fImpromptu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? marial(fImpromptu * f7, f5, f6) : -marial((-fImpromptu) * f7, f5, f6);
    }
}
