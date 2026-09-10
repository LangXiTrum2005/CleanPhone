package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import hyalinization.dovishness;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public long f11719adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f11720apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f11721arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f11722attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public dovishness f11723beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f11724competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public long f11725cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public long f11726cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f11727cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public AudioTrack f11728dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public long f11729dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f11730formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f11731gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f11732graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f11733impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f11734impromptu;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public long f11735kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f11736kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f11737marial;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public decarock.wireman f11738merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public long f11739molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f11740monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public long f11741oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public long f11742polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public long f11743preprohormone;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public long f11744restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f11745rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f11746saneness;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public long f11747sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public long f11748stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public boolean f11749supplicat;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f11750taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public Method f11751triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public long f11752trm;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f11753wireman;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public boolean f11754yemenite;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface attabal {
        void onInvalidLatency(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);

        void wireman(long j);
    }

    public wireman(attabal attabalVar) {
        this.f11722attabal = (attabal) decarock.attabal.marial(attabalVar);
        try {
            this.f11751triweekly = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f11746saneness = new long[10];
        this.f11738merc = decarock.wireman.f25152attabal;
    }

    public static boolean kowloon(int i) {
        if (grimness.f25080attabal < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    public void adultoid(decarock.wireman wiremanVar) {
        this.f11738merc = wiremanVar;
    }

    public boolean apical(long j) {
        int playState = ((AudioTrack) decarock.attabal.marial(this.f11728dern)).getPlayState();
        if (this.f11734impromptu) {
            if (playState == 2) {
                this.f11721arytenoidectomy = false;
                return false;
            }
            if (playState == 1 && marial() == 0) {
                return false;
            }
        }
        boolean z = this.f11721arytenoidectomy;
        boolean zImpromptu = impromptu(j);
        this.f11721arytenoidectomy = zImpromptu;
        if (z && !zImpromptu && playState != 1) {
            this.f11722attabal.onUnderrun(this.f11737marial, grimness.sultanate(this.f11750taiyuan));
        }
        return true;
    }

    public boolean arytenoidectomy() {
        polloi();
        if (this.f11743preprohormone == C.TIME_UNSET) {
            ((dovishness) decarock.attabal.marial(this.f11723beachfront)).impromptu();
            return true;
        }
        this.f11726cuirassed = marial();
        return false;
    }

    public void attabal() {
        this.f11749supplicat = true;
        dovishness dovishnessVar = this.f11723beachfront;
        if (dovishnessVar != null) {
            dovishnessVar.saneness();
        }
    }

    public final long beachfront() {
        return grimness.libyan(marial(), this.f11724competently);
    }

    public void competently(long j) {
        this.f11726cuirassed = marial();
        this.f11743preprohormone = grimness.outmarry(this.f11738merc.elapsedRealtime());
        this.f11748stratoscope = j;
    }

    public boolean cutely(long j) {
        return this.f11725cord != C.TIME_UNSET && j > 0 && this.f11738merc.elapsedRealtime() - this.f11725cord >= 200;
    }

    public int dern(long j) {
        return this.f11737marial - ((int) (j - (marial() * ((long) this.f11753wireman))));
    }

    public void dovishness() {
        if (this.f11743preprohormone != C.TIME_UNSET) {
            this.f11743preprohormone = grimness.outmarry(this.f11738merc.elapsedRealtime());
        }
        ((dovishness) decarock.attabal.marial(this.f11723beachfront)).impromptu();
    }

    public final void formularize(long j) {
        dovishness dovishnessVar = (dovishness) decarock.attabal.marial(this.f11723beachfront);
        if (dovishnessVar.beachfront(j)) {
            long jWireman = dovishnessVar.wireman();
            long jDern = dovishnessVar.dern();
            long jBeachfront = beachfront();
            if (Math.abs(jWireman - j) > 5000000) {
                this.f11722attabal.onSystemTimeUsMismatch(jDern, jWireman, j, jBeachfront);
                dovishnessVar.competently();
            } else if (Math.abs(grimness.libyan(jDern, this.f11724competently) - jBeachfront) <= 5000000) {
                dovishnessVar.attabal();
            } else {
                this.f11722attabal.onPositionFramesMismatch(jDern, jWireman, j, jBeachfront);
                dovishnessVar.competently();
            }
        }
    }

    public final void gintrap(long j) {
        AudioTrack audioTrack = (AudioTrack) decarock.attabal.marial(this.f11728dern);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f11734impromptu) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11729dovishness = this.f11732graveside;
            }
            playbackHeadPosition += this.f11729dovishness;
        }
        if (grimness.f25080attabal <= 29) {
            if (playbackHeadPosition == 0 && this.f11732graveside > 0 && playState == 3) {
                if (this.f11725cord == C.TIME_UNSET) {
                    this.f11725cord = j;
                    return;
                }
                return;
            }
            this.f11725cord = C.TIME_UNSET;
        }
        long j2 = this.f11732graveside;
        if (j2 > playbackHeadPosition) {
            if (this.f11749supplicat) {
                this.f11744restrictive += j2;
                this.f11749supplicat = false;
            } else {
                this.f11719adultoid++;
            }
        }
        this.f11732graveside = playbackHeadPosition;
    }

    public void graveside(float f) {
        this.f11727cutely = f;
        dovishness dovishnessVar = this.f11723beachfront;
        if (dovishnessVar != null) {
            dovishnessVar.impromptu();
        }
        polloi();
    }

    public final void impassible() {
        long jNanoTime = this.f11738merc.nanoTime() / 1000;
        if (jNanoTime - this.f11733impassible >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long jBeachfront = beachfront();
            if (jBeachfront != 0) {
                this.f11746saneness[this.f11731gintrap] = grimness.treadless(jBeachfront, this.f11727cutely) - jNanoTime;
                this.f11731gintrap = (this.f11731gintrap + 1) % 10;
                int i = this.f11745rotuma;
                if (i < 10) {
                    this.f11745rotuma = i + 1;
                }
                this.f11733impassible = jNanoTime;
                this.f11730formularize = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f11745rotuma;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f11730formularize += this.f11746saneness[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f11734impromptu) {
            return;
        }
        formularize(jNanoTime);
        triweekly(jNanoTime);
    }

    public boolean impromptu(long j) {
        return j > grimness.yemenite(wireman(false), this.f11724competently) || saneness();
    }

    public final long marial() {
        long jElapsedRealtime = this.f11738merc.elapsedRealtime();
        if (this.f11743preprohormone != C.TIME_UNSET) {
            if (((AudioTrack) decarock.attabal.marial(this.f11728dern)).getPlayState() == 2) {
                return this.f11726cuirassed;
            }
            return Math.min(this.f11748stratoscope, this.f11726cuirassed + grimness.yemenite(grimness.permissivist(grimness.outmarry(jElapsedRealtime) - this.f11743preprohormone, this.f11727cutely), this.f11724competently));
        }
        if (jElapsedRealtime - this.f11739molybdenite >= 5) {
            gintrap(jElapsedRealtime);
            this.f11739molybdenite = jElapsedRealtime;
        }
        return this.f11732graveside + this.f11744restrictive + (this.f11719adultoid << 32);
    }

    public void molybdenite(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f11728dern = audioTrack;
        this.f11753wireman = i2;
        this.f11737marial = i3;
        this.f11723beachfront = new dovishness(audioTrack);
        this.f11724competently = audioTrack.getSampleRate();
        this.f11734impromptu = z && kowloon(i);
        boolean zLightstruck = grimness.lightstruck(i);
        this.f11740monoploid = zLightstruck;
        this.f11750taiyuan = zLightstruck ? grimness.libyan(i3 / i2, this.f11724competently) : -9223372036854775807L;
        this.f11732graveside = 0L;
        this.f11719adultoid = 0L;
        this.f11749supplicat = false;
        this.f11744restrictive = 0L;
        this.f11729dovishness = 0L;
        this.f11721arytenoidectomy = false;
        this.f11743preprohormone = C.TIME_UNSET;
        this.f11725cord = C.TIME_UNSET;
        this.f11742polloi = 0L;
        this.f11736kowloon = 0L;
        this.f11727cutely = 1.0f;
    }

    public void monoploid() {
        polloi();
        this.f11728dern = null;
        this.f11723beachfront = null;
    }

    public final void polloi() {
        this.f11730formularize = 0L;
        this.f11745rotuma = 0;
        this.f11731gintrap = 0;
        this.f11733impassible = 0L;
        this.f11741oilcan = 0L;
        this.f11735kattegat = 0L;
        this.f11720apical = false;
    }

    public final boolean saneness() {
        return this.f11734impromptu && ((AudioTrack) decarock.attabal.marial(this.f11728dern)).getPlayState() == 2 && marial() == 0;
    }

    public boolean taiyuan() {
        return ((AudioTrack) decarock.attabal.marial(this.f11728dern)).getPlayState() == 3;
    }

    public final void triweekly(long j) {
        Method method;
        if (!this.f11740monoploid || (method = this.f11751triweekly) == null || j - this.f11742polloi < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) grimness.impromptu((Integer) method.invoke(decarock.attabal.marial(this.f11728dern), null))).intValue()) * 1000) - this.f11750taiyuan;
            this.f11736kowloon = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f11736kowloon = jMax;
            if (jMax > 5000000) {
                this.f11722attabal.onInvalidLatency(jMax);
                this.f11736kowloon = 0L;
            }
        } catch (Exception unused) {
            this.f11751triweekly = null;
        }
        this.f11742polloi = j;
    }

    public long wireman(boolean z) {
        long jBeachfront;
        if (((AudioTrack) decarock.attabal.marial(this.f11728dern)).getPlayState() == 3) {
            impassible();
        }
        long jNanoTime = this.f11738merc.nanoTime() / 1000;
        dovishness dovishnessVar = (dovishness) decarock.attabal.marial(this.f11723beachfront);
        boolean zMarial = dovishnessVar.marial();
        if (zMarial) {
            jBeachfront = grimness.libyan(dovishnessVar.dern(), this.f11724competently) + grimness.permissivist(jNanoTime - dovishnessVar.wireman(), this.f11727cutely);
        } else {
            jBeachfront = this.f11745rotuma == 0 ? beachfront() : grimness.permissivist(this.f11730formularize + jNanoTime, this.f11727cutely);
            if (!z) {
                jBeachfront = Math.max(0L, jBeachfront - this.f11736kowloon);
            }
        }
        if (this.f11754yemenite != zMarial) {
            this.f11735kattegat = this.f11741oilcan;
            this.f11747sealless = this.f11752trm;
        }
        long j = jNanoTime - this.f11735kattegat;
        if (j < 1000000) {
            long jPermissivist = this.f11747sealless + grimness.permissivist(j, this.f11727cutely);
            long j2 = (j * 1000) / 1000000;
            jBeachfront = ((jBeachfront * j2) + ((1000 - j2) * jPermissivist)) / 1000;
        }
        if (!this.f11720apical) {
            long j3 = this.f11752trm;
            if (jBeachfront > j3) {
                this.f11720apical = true;
                this.f11722attabal.wireman(this.f11738merc.currentTimeMillis() - grimness.sultanate(grimness.treadless(grimness.sultanate(jBeachfront - j3), this.f11727cutely)));
            }
        }
        this.f11741oilcan = jNanoTime;
        this.f11752trm = jBeachfront;
        this.f11754yemenite = zMarial;
        return jBeachfront;
    }
}
