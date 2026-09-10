package molet;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.splinterproof;
import java.util.ArrayList;

/* JADX INFO: compiled from: AnimationHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final ThreadLocal<dern> f33506cutely = new ThreadLocal<>();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public apical f33512marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public marial f33514taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final splinterproof<InterfaceC0731dern, Long> f33507attabal = new splinterproof<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<InterfaceC0731dern> f33513saneness = new ArrayList<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f33510dern = new saneness();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Runnable f33515wireman = new Runnable() { // from class: molet.saneness
        @Override // java.lang.Runnable
        public final void run() {
            this.f33565kowloon.f33510dern.attabal();
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f33508beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f33509competently = false;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f33511impromptu = 1.0f;

    /* JADX INFO: compiled from: AnimationHandler.java */
    public static final class beachfront implements apical {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Choreographer f33516attabal = Choreographer.getInstance();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Looper f33517saneness = Looper.myLooper();

        @Override // molet.apical
        public void attabal(final Runnable runnable) {
            this.f33516attabal.postFrameCallback(new Choreographer.FrameCallback() { // from class: molet.competently
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }

        @Override // molet.apical
        public boolean saneness() {
            return Thread.currentThread() == this.f33517saneness.getThread();
        }
    }

    /* JADX INFO: renamed from: molet.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimationHandler.java */
    public interface InterfaceC0731dern {
        boolean attabal(long j);
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public interface marial {
        boolean attabal();

        boolean saneness();
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public class saneness {
        public saneness() {
        }

        public void attabal() {
            dern.this.f33508beachfront = SystemClock.uptimeMillis();
            dern dernVar = dern.this;
            dernVar.beachfront(dernVar.f33508beachfront);
            if (dern.this.f33513saneness.size() > 0) {
                dern.this.f33512marial.attabal(dern.this.f33515wireman);
            }
        }
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public class wireman implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public ValueAnimator.DurationScaleChangeListener f33519attabal;

        public wireman() {
        }

        @Override // molet.dern.marial
        public boolean attabal() {
            if (this.f33519attabal != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: molet.beachfront
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    dern.this.f33511impromptu = f;
                }
            };
            this.f33519attabal = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }

        @Override // molet.dern.marial
        public boolean saneness() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f33519attabal);
            this.f33519attabal = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    public dern(apical apicalVar) {
        this.f33512marial = apicalVar;
    }

    public static dern impromptu() {
        ThreadLocal<dern> threadLocal = f33506cutely;
        if (threadLocal.get() == null) {
            threadLocal.set(new dern(new beachfront()));
        }
        return threadLocal.get();
    }

    public void apical(InterfaceC0731dern interfaceC0731dern) {
        this.f33507attabal.remove(interfaceC0731dern);
        int iIndexOf = this.f33513saneness.indexOf(interfaceC0731dern);
        if (iIndexOf >= 0) {
            this.f33513saneness.set(iIndexOf, null);
            this.f33509competently = true;
        }
    }

    public void beachfront(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f33513saneness.size(); i++) {
            InterfaceC0731dern interfaceC0731dern = this.f33513saneness.get(i);
            if (interfaceC0731dern != null && taiyuan(interfaceC0731dern, jUptimeMillis)) {
                interfaceC0731dern.attabal(j);
            }
        }
        marial();
    }

    public float competently() {
        return this.f33511impromptu;
    }

    public boolean cutely() {
        return this.f33512marial.saneness();
    }

    public final void marial() {
        if (this.f33509competently) {
            for (int size = this.f33513saneness.size() - 1; size >= 0; size--) {
                if (this.f33513saneness.get(size) == null) {
                    this.f33513saneness.remove(size);
                }
            }
            if (this.f33513saneness.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f33514taiyuan.saneness();
            }
            this.f33509competently = false;
        }
    }

    public final boolean taiyuan(InterfaceC0731dern interfaceC0731dern, long j) {
        Long l = this.f33507attabal.get(interfaceC0731dern);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f33507attabal.remove(interfaceC0731dern);
        return true;
    }

    public void wireman(InterfaceC0731dern interfaceC0731dern, long j) {
        if (this.f33513saneness.size() == 0) {
            this.f33512marial.attabal(this.f33515wireman);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f33511impromptu = ValueAnimator.getDurationScale();
                if (this.f33514taiyuan == null) {
                    this.f33514taiyuan = new wireman();
                }
                this.f33514taiyuan.attabal();
            }
        }
        if (!this.f33513saneness.contains(interfaceC0731dern)) {
            this.f33513saneness.add(interfaceC0731dern);
        }
        if (j > 0) {
            this.f33507attabal.put(interfaceC0731dern, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }
}
