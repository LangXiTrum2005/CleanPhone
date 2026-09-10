package bavaria;

import com.inmobi.media.core.config.models.CrashConfig;
import cybernatic.merc;
import cybernatic.molybdenite;
import cybernatic.monoploid;
import cybernatic.polder;
import decarock.grimness;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements competently {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f14961apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f14962attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f14963beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f14964competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long f14965cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f14966dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f14967formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f14968impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f14969marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f14970saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f14971taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f14972wireman;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class saneness implements merc {
        public saneness() {
        }

        @Override // cybernatic.merc
        public long getDurationUs() {
            return attabal.this.f14972wireman.saneness(attabal.this.f14963beachfront);
        }

        @Override // cybernatic.merc
        public merc.attabal getSeekPoints(long j) {
            return new merc.attabal(new polder(j, grimness.arytenoidectomy((attabal.this.f14970saneness + BigInteger.valueOf(attabal.this.f14972wireman.dern(j)).multiply(BigInteger.valueOf(attabal.this.f14966dern - attabal.this.f14970saneness)).divide(BigInteger.valueOf(attabal.this.f14963beachfront)).longValue()) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, attabal.this.f14970saneness, attabal.this.f14966dern - 1)));
        }

        @Override // cybernatic.merc
        public boolean isSeekable() {
            return true;
        }
    }

    public attabal(taiyuan taiyuanVar, long j, long j2, long j3, long j4, boolean z) {
        decarock.attabal.attabal(j >= 0 && j2 > j);
        this.f14972wireman = taiyuanVar;
        this.f14970saneness = j;
        this.f14966dern = j2;
        if (j3 == j2 - j || z) {
            this.f14963beachfront = j4;
            this.f14969marial = 4;
        } else {
            this.f14969marial = 0;
        }
        this.f14962attabal = new beachfront();
    }

    @Override // bavaria.competently
    public long attabal(monoploid monoploidVar) throws IOException {
        int i = this.f14969marial;
        if (i == 0) {
            long position = monoploidVar.getPosition();
            this.f14964competently = position;
            this.f14969marial = 1;
            long j = this.f14966dern - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jCompetently = competently(monoploidVar);
                if (jCompetently != -1) {
                    return jCompetently;
                }
                this.f14969marial = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            taiyuan(monoploidVar);
            this.f14969marial = 4;
            return -(this.f14961apical + 2);
        }
        this.f14963beachfront = impromptu(monoploidVar);
        this.f14969marial = 4;
        return this.f14964competently;
    }

    @Override // bavaria.competently
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public saneness createSeekMap() {
        if (this.f14963beachfront != 0) {
            return new saneness();
        }
        return null;
    }

    public final long competently(monoploid monoploidVar) throws IOException {
        if (this.f14971taiyuan == this.f14965cutely) {
            return -1L;
        }
        long position = monoploidVar.getPosition();
        if (!this.f14962attabal.wireman(monoploidVar, this.f14965cutely)) {
            long j = this.f14971taiyuan;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f14962attabal.attabal(monoploidVar, false);
        monoploidVar.resetPeekPosition();
        long j2 = this.f14968impromptu;
        beachfront beachfrontVar = this.f14962attabal;
        long j3 = beachfrontVar.f14979dern;
        long j4 = j2 - j3;
        int i = beachfrontVar.f14980impromptu + beachfrontVar.f14983taiyuan;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f14965cutely = position;
            this.f14967formularize = j3;
        } else {
            this.f14971taiyuan = monoploidVar.getPosition() + ((long) i);
            this.f14961apical = this.f14962attabal.f14979dern;
        }
        long j5 = this.f14965cutely;
        long j6 = this.f14971taiyuan;
        if (j5 - j6 < 100000) {
            this.f14965cutely = j6;
            return j6;
        }
        long position2 = monoploidVar.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f14965cutely;
        long j8 = this.f14971taiyuan;
        return grimness.arytenoidectomy(position2 + ((j4 * (j7 - j8)) / (this.f14967formularize - this.f14961apical)), j8, j7 - 1);
    }

    public long impromptu(monoploid monoploidVar) throws IOException {
        this.f14962attabal.saneness();
        if (!this.f14962attabal.dern(monoploidVar)) {
            throw new EOFException();
        }
        this.f14962attabal.attabal(monoploidVar, false);
        beachfront beachfrontVar = this.f14962attabal;
        monoploidVar.skipFully(beachfrontVar.f14980impromptu + beachfrontVar.f14983taiyuan);
        long j = this.f14962attabal.f14979dern;
        while (true) {
            beachfront beachfrontVar2 = this.f14962attabal;
            if ((beachfrontVar2.f14982saneness & 4) == 4 || !beachfrontVar2.dern(monoploidVar) || monoploidVar.getPosition() >= this.f14966dern || !this.f14962attabal.attabal(monoploidVar, true)) {
                break;
            }
            beachfront beachfrontVar3 = this.f14962attabal;
            if (!molybdenite.marial(monoploidVar, beachfrontVar3.f14980impromptu + beachfrontVar3.f14983taiyuan)) {
                break;
            }
            j = this.f14962attabal.f14979dern;
        }
        return j;
    }

    @Override // bavaria.competently
    public void startSeek(long j) {
        this.f14968impromptu = grimness.arytenoidectomy(j, 0L, this.f14963beachfront - 1);
        this.f14969marial = 2;
        this.f14971taiyuan = this.f14970saneness;
        this.f14965cutely = this.f14966dern;
        this.f14961apical = 0L;
        this.f14967formularize = this.f14963beachfront;
    }

    public final void taiyuan(monoploid monoploidVar) throws IOException {
        while (true) {
            this.f14962attabal.dern(monoploidVar);
            this.f14962attabal.attabal(monoploidVar, false);
            beachfront beachfrontVar = this.f14962attabal;
            if (beachfrontVar.f14979dern > this.f14968impromptu) {
                monoploidVar.resetPeekPosition();
                return;
            } else {
                monoploidVar.skipFully(beachfrontVar.f14980impromptu + beachfrontVar.f14983taiyuan);
                this.f14971taiyuan = monoploidVar.getPosition();
                this.f14961apical = this.f14962attabal.f14979dern;
            }
        }
    }
}
