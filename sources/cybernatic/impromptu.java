package cybernatic;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f24671attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f24672beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f24673competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24674dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f24675marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f24676saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f24677wireman;

    public impromptu(long j, long j2, int i, int i2, boolean z) {
        this.f24671attabal = j;
        this.f24676saneness = j2;
        this.f24674dern = i2 == -1 ? 1 : i2;
        this.f24675marial = i;
        this.f24673competently = z;
        if (j == -1) {
            this.f24677wireman = -1L;
            this.f24672beachfront = C.TIME_UNSET;
        } else {
            this.f24677wireman = j - j2;
            this.f24672beachfront = wireman(j, j2, i);
        }
    }

    public static long wireman(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public final long attabal(long j) {
        long j2 = (j * ((long) this.f24675marial)) / 8000000;
        int i = this.f24674dern;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.f24677wireman;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.f24676saneness + Math.max(jMin, 0L);
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24672beachfront;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        if (this.f24677wireman == -1 && !this.f24673competently) {
            return new merc.attabal(new polder(0L, this.f24676saneness));
        }
        long jAttabal = attabal(j);
        long jSaneness = saneness(jAttabal);
        polder polderVar = new polder(jSaneness, jAttabal);
        if (this.f24677wireman != -1 && jSaneness < j) {
            int i = this.f24674dern;
            if (((long) i) + jAttabal < this.f24671attabal) {
                long j2 = jAttabal + ((long) i);
                return new merc.attabal(polderVar, new polder(saneness(j2), j2));
            }
        }
        return new merc.attabal(polderVar);
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return this.f24677wireman != -1 || this.f24673competently;
    }

    public long saneness(long j) {
        return wireman(j, this.f24676saneness, this.f24675marial);
    }
}
