package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import bluecoat.impassible;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.di.ServiceProvider;
import decarock.grimness;

/* JADX INFO: compiled from: VideoFrameReleaseControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f12898attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f12900competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f12901cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f12902dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impassible f12906saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f12908wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f12905marial = 0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f12899beachfront = C.TIME_UNSET;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f12904impromptu = C.TIME_UNSET;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f12907taiyuan = C.TIME_UNSET;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f12897apical = 1.0f;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public decarock.wireman f12903formularize = decarock.wireman.f25152attabal;

    /* JADX INFO: compiled from: VideoFrameReleaseControl.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f12909attabal = C.TIME_UNSET;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f12910saneness = C.TIME_UNSET;

        public long beachfront() {
            return this.f12909attabal;
        }

        public long competently() {
            return this.f12910saneness;
        }

        public final void impromptu() {
            this.f12909attabal = C.TIME_UNSET;
            this.f12910saneness = C.TIME_UNSET;
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseControl.java */
    public interface saneness {
        boolean arytenoidectomy(long j, long j2);

        boolean monoploid(long j, long j2, long j3, boolean z, boolean z2) throws ExoPlaybackException;

        boolean rotuma(long j, long j2, boolean z);
    }

    public dern(Context context, saneness sanenessVar, long j) {
        this.f12898attabal = sanenessVar;
        this.f12902dern = j;
        this.f12906saneness = new impassible(context);
    }

    public void apical() {
        this.f12908wireman = true;
        this.f12900competently = grimness.outmarry(this.f12903formularize.elapsedRealtime());
        this.f12906saneness.apical();
    }

    public void arytenoidectomy(float f) {
        this.f12906saneness.competently(f);
    }

    public void attabal() {
        if (this.f12905marial == 0) {
            this.f12905marial = 1;
        }
    }

    public final void beachfront(int i) {
        this.f12905marial = Math.min(this.f12905marial, i);
    }

    public void competently() {
        beachfront(0);
    }

    public void cutely() {
        beachfront(2);
    }

    public int dern(long j, long j2, long j3, long j4, boolean z, attabal attabalVar) throws ExoPlaybackException {
        attabalVar.impromptu();
        if (this.f12899beachfront == C.TIME_UNSET) {
            this.f12899beachfront = j2;
        }
        if (this.f12904impromptu != j) {
            this.f12906saneness.impromptu(j);
            this.f12904impromptu = j;
        }
        attabalVar.f12909attabal = saneness(j2, j3, j);
        if (molybdenite(j2, attabalVar.f12909attabal, j4)) {
            return 0;
        }
        if (!this.f12908wireman || j2 == this.f12899beachfront) {
            return 5;
        }
        long jNanoTime = this.f12903formularize.nanoTime();
        attabalVar.f12910saneness = this.f12906saneness.saneness((attabalVar.f12909attabal * 1000) + jNanoTime);
        attabalVar.f12909attabal = (attabalVar.f12910saneness - jNanoTime) / 1000;
        boolean z2 = (this.f12907taiyuan == C.TIME_UNSET || this.f12901cutely) ? false : true;
        if (this.f12898attabal.monoploid(attabalVar.f12909attabal, j2, j3, z, z2)) {
            return 4;
        }
        if (this.f12898attabal.rotuma(attabalVar.f12909attabal, j3, z)) {
            return z2 ? 3 : 2;
        }
        return attabalVar.f12909attabal > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? 5 : 1;
    }

    public void formularize() {
        this.f12908wireman = false;
        this.f12907taiyuan = C.TIME_UNSET;
        this.f12906saneness.formularize();
    }

    public void impassible() {
        this.f12906saneness.cutely();
        this.f12904impromptu = C.TIME_UNSET;
        this.f12899beachfront = C.TIME_UNSET;
        beachfront(1);
        this.f12907taiyuan = C.TIME_UNSET;
    }

    public void impromptu(boolean z) {
        this.f12905marial = z ? 1 : 0;
    }

    public void kowloon(decarock.wireman wiremanVar) {
        this.f12903formularize = wiremanVar;
    }

    public void marial(boolean z) {
        this.f12901cutely = z;
        this.f12907taiyuan = this.f12902dern > 0 ? this.f12903formularize.elapsedRealtime() + this.f12902dern : C.TIME_UNSET;
    }

    public final boolean molybdenite(long j, long j2, long j3) {
        if (this.f12907taiyuan != C.TIME_UNSET && !this.f12901cutely) {
            return false;
        }
        int i = this.f12905marial;
        if (i == 0) {
            return this.f12908wireman;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.f12908wireman && this.f12898attabal.arytenoidectomy(j2, grimness.outmarry(this.f12903formularize.elapsedRealtime()) - this.f12900competently);
        }
        throw new IllegalStateException();
    }

    public void monoploid(Surface surface) {
        this.f12906saneness.impassible(surface);
        beachfront(1);
    }

    public void polloi(float f) {
        if (f == this.f12897apical) {
            return;
        }
        this.f12897apical = f;
        this.f12906saneness.taiyuan(f);
    }

    public final long saneness(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / ((double) this.f12897apical));
        return this.f12908wireman ? j4 - (grimness.outmarry(this.f12903formularize.elapsedRealtime()) - j2) : j4;
    }

    public boolean taiyuan() {
        boolean z = this.f12905marial != 3;
        this.f12905marial = 3;
        this.f12900competently = grimness.outmarry(this.f12903formularize.elapsedRealtime());
        return z;
    }

    public void triweekly(int i) {
        this.f12906saneness.kowloon(i);
    }

    public boolean wireman(boolean z) {
        if (z && this.f12905marial == 3) {
            this.f12907taiyuan = C.TIME_UNSET;
            return true;
        }
        if (this.f12907taiyuan == C.TIME_UNSET) {
            return false;
        }
        if (this.f12903formularize.elapsedRealtime() < this.f12907taiyuan) {
            return true;
        }
        this.f12907taiyuan = C.TIME_UNSET;
        return false;
    }
}
