package hyalinization;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f28039attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f28040beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f28041dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f28042marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f28043saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f28044wireman;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AudioTrack f28045attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f28046beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f28047competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f28048dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f28049marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AudioTimestamp f28050saneness = new AudioTimestamp();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f28051wireman;

        public attabal(AudioTrack audioTrack) {
            this.f28045attabal = audioTrack;
        }

        public void attabal() {
            this.f28046beachfront = true;
        }

        public long dern() {
            return this.f28050saneness.nanoTime / 1000;
        }

        public long saneness() {
            return this.f28049marial;
        }

        public boolean wireman() {
            boolean timestamp = this.f28045attabal.getTimestamp(this.f28050saneness);
            if (timestamp) {
                long j = this.f28050saneness.framePosition;
                long j2 = this.f28051wireman;
                if (j2 > j) {
                    if (this.f28046beachfront) {
                        this.f28047competently += j2;
                        this.f28046beachfront = false;
                    } else {
                        this.f28048dern++;
                    }
                }
                this.f28051wireman = j;
                this.f28049marial = j + this.f28047competently + (this.f28048dern << 32);
            }
            return timestamp;
        }
    }

    public dovishness(AudioTrack audioTrack) {
        this.f28039attabal = new attabal(audioTrack);
        impromptu();
    }

    public void attabal() {
        if (this.f28043saneness == 4) {
            impromptu();
        }
    }

    public boolean beachfront(long j) {
        attabal attabalVar = this.f28039attabal;
        if (attabalVar == null || j - this.f28042marial < this.f28044wireman) {
            return false;
        }
        this.f28042marial = j;
        boolean zWireman = attabalVar.wireman();
        int i = this.f28043saneness;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zWireman) {
                        impromptu();
                        return zWireman;
                    }
                } else if (!zWireman) {
                    impromptu();
                    return zWireman;
                }
            } else {
                if (!zWireman) {
                    impromptu();
                    return zWireman;
                }
                if (this.f28039attabal.saneness() > this.f28040beachfront) {
                    taiyuan(2);
                    return zWireman;
                }
            }
        } else {
            if (zWireman) {
                if (this.f28039attabal.dern() < this.f28041dern) {
                    return false;
                }
                this.f28040beachfront = this.f28039attabal.saneness();
                taiyuan(1);
                return zWireman;
            }
            if (j - this.f28041dern > 500000) {
                taiyuan(3);
            }
        }
        return zWireman;
    }

    public void competently() {
        taiyuan(4);
    }

    public long dern() {
        attabal attabalVar = this.f28039attabal;
        if (attabalVar != null) {
            return attabalVar.saneness();
        }
        return -1L;
    }

    public void impromptu() {
        if (this.f28039attabal != null) {
            taiyuan(0);
        }
    }

    public boolean marial() {
        return this.f28043saneness == 2;
    }

    public void saneness() {
        attabal attabalVar = this.f28039attabal;
        if (attabalVar != null) {
            attabalVar.attabal();
        }
    }

    public final void taiyuan(int i) {
        this.f28043saneness = i;
        if (i == 0) {
            this.f28042marial = 0L;
            this.f28040beachfront = -1L;
            this.f28041dern = System.nanoTime() / 1000;
            this.f28044wireman = Ua.s;
            return;
        }
        if (i == 1) {
            this.f28044wireman = Ua.s;
            return;
        }
        if (i == 2 || i == 3) {
            this.f28044wireman = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f28044wireman = 500000L;
        }
    }

    public long wireman() {
        attabal attabalVar = this.f28039attabal;
        return attabalVar != null ? attabalVar.dern() : C.TIME_UNSET;
    }
}
