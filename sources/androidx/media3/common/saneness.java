package androidx.media3.common;

import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import decarock.grimness;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11276attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public wireman f11277beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11278dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f11279marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11280saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f11281wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final saneness f11271competently = new marial().attabal();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f11274impromptu = grimness.igbo(0);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f11275taiyuan = grimness.igbo(1);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f11272cutely = grimness.igbo(2);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final String f11270apical = grimness.igbo(3);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final String f11273formularize = grimness.igbo(4);

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class dern {
        public static void attabal(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f11282attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f11285saneness = 0;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f11283dern = 1;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f11286wireman = 1;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f11284marial = 0;

        public saneness attabal() {
            return new saneness(this.f11282attabal, this.f11285saneness, this.f11283dern, this.f11286wireman, this.f11284marial);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class C0077saneness {
        public static void attabal(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AudioAttributes f11287attabal;

        public wireman(saneness sanenessVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(sanenessVar.f11276attabal).setFlags(sanenessVar.f11280saneness).setUsage(sanenessVar.f11278dern);
            int i = grimness.f25080attabal;
            if (i >= 29) {
                C0077saneness.attabal(usage, sanenessVar.f11281wireman);
            }
            if (i >= 32) {
                dern.attabal(usage, sanenessVar.f11279marial);
            }
            this.f11287attabal = usage.build();
        }
    }

    public wireman attabal() {
        if (this.f11277beachfront == null) {
            this.f11277beachfront = new wireman();
        }
        return this.f11277beachfront;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && saneness.class == obj.getClass()) {
            saneness sanenessVar = (saneness) obj;
            if (this.f11276attabal == sanenessVar.f11276attabal && this.f11280saneness == sanenessVar.f11280saneness && this.f11278dern == sanenessVar.f11278dern && this.f11281wireman == sanenessVar.f11281wireman && this.f11279marial == sanenessVar.f11279marial) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11276attabal) * 31) + this.f11280saneness) * 31) + this.f11278dern) * 31) + this.f11281wireman) * 31) + this.f11279marial;
    }

    public saneness(int i, int i2, int i3, int i4, int i5) {
        this.f11276attabal = i;
        this.f11280saneness = i2;
        this.f11278dern = i3;
        this.f11281wireman = i4;
        this.f11279marial = i5;
    }
}
