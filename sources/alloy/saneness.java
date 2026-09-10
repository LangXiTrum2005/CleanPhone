package alloy;

import com.google.android.gms.ads.AdSize;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.adultoid;
import cybernatic.arytenoidectomy;
import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.polloi;
import cybernatic.restrictive;
import cybernatic.yemenite;
import decarock.stratoscope;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements arytenoidectomy {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final adultoid f3946monoploid = new adultoid() { // from class: alloy.attabal
        @Override // cybernatic.adultoid
        public final arytenoidectomy[] createExtractors() {
            return saneness.dern();
        }
    };

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f3947apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public androidx.media3.extractor.flv.saneness f3948arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public polloi f3950beachfront;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f3952cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f3954formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f3955impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f3956impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public androidx.media3.extractor.flv.attabal f3957kowloon;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f3960taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f3961triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f3949attabal = new stratoscope(4);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final stratoscope f3959saneness = new stratoscope(9);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f3953dern = new stratoscope(11);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final stratoscope f3962wireman = new stratoscope();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final dern f3958marial = new dern();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f3951competently = 1;

    public static /* synthetic */ arytenoidectomy[] dern() {
        return new arytenoidectomy[]{new saneness()};
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    public final boolean apical(monoploid monoploidVar) throws IOException {
        boolean zAttabal;
        boolean z;
        long j;
        long jImpromptu = impromptu();
        int i = this.f3947apical;
        if (i == 8 && this.f3957kowloon != null) {
            competently();
            zAttabal = this.f3957kowloon.attabal(taiyuan(monoploidVar), jImpromptu);
        } else {
            if (i != 9 || this.f3948arytenoidectomy == null) {
                if (i != 18 || this.f3961triweekly) {
                    monoploidVar.skipFully(this.f3954formularize);
                    zAttabal = false;
                    z = false;
                } else {
                    zAttabal = this.f3958marial.attabal(taiyuan(monoploidVar), jImpromptu);
                    long jWireman = this.f3958marial.wireman();
                    if (jWireman != C.TIME_UNSET) {
                        this.f3950beachfront.beachfront(new yemenite(this.f3958marial.marial(), this.f3958marial.beachfront(), jWireman));
                        this.f3961triweekly = true;
                    }
                }
                if (!this.f3956impromptu && zAttabal) {
                    this.f3956impromptu = true;
                    if (this.f3958marial.wireman() == C.TIME_UNSET) {
                        j = -this.f3955impassible;
                    } else {
                        j = 0;
                    }
                    this.f3960taiyuan = j;
                }
                this.f3952cutely = 4;
                this.f3951competently = 2;
                return z;
            }
            competently();
            zAttabal = this.f3948arytenoidectomy.attabal(taiyuan(monoploidVar), jImpromptu);
        }
        z = true;
        if (!this.f3956impromptu) {
            this.f3956impromptu = true;
            if (this.f3958marial.wireman() == C.TIME_UNSET) {
                j = -this.f3955impassible;
            } else {
                j = 0;
            }
            this.f3960taiyuan = j;
        }
        this.f3952cutely = 4;
        this.f3951competently = 2;
        return z;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        monoploidVar.peekFully(this.f3949attabal.marial(), 0, 3);
        this.f3949attabal.mathsort(0);
        if (this.f3949attabal.polder() != 4607062) {
            return false;
        }
        monoploidVar.peekFully(this.f3949attabal.marial(), 0, 2);
        this.f3949attabal.mathsort(0);
        if ((this.f3949attabal.saran() & AdSize.MEDIUM_RECTANGLE_HEIGHT) != 0) {
            return false;
        }
        monoploidVar.peekFully(this.f3949attabal.marial(), 0, 4);
        this.f3949attabal.mathsort(0);
        int iMonoploid = this.f3949attabal.monoploid();
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition(iMonoploid);
        monoploidVar.peekFully(this.f3949attabal.marial(), 0, 4);
        this.f3949attabal.mathsort(0);
        return this.f3949attabal.monoploid() == 0;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        decarock.attabal.taiyuan(this.f3950beachfront);
        while (true) {
            int i = this.f3951competently;
            if (i != 1) {
                if (i == 2) {
                    impassible(monoploidVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (apical(monoploidVar)) {
                        return 0;
                    }
                } else if (!formularize(monoploidVar)) {
                    return -1;
                }
            } else if (!cutely(monoploidVar)) {
                return -1;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    public final void competently() {
        if (this.f3961triweekly) {
            return;
        }
        this.f3950beachfront.beachfront(new merc.saneness(C.TIME_UNSET));
        this.f3961triweekly = true;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean cutely(monoploid monoploidVar) throws IOException {
        if (!monoploidVar.readFully(this.f3959saneness.marial(), 0, 9, true)) {
            return false;
        }
        this.f3959saneness.mathsort(0);
        this.f3959saneness.splinterproof(4);
        int iSupplicat = this.f3959saneness.supplicat();
        boolean z = (iSupplicat & 4) != 0;
        boolean z2 = (iSupplicat & 1) != 0;
        if (z && this.f3957kowloon == null) {
            this.f3957kowloon = new androidx.media3.extractor.flv.attabal(this.f3950beachfront.track(8, 1));
        }
        if (z2 && this.f3948arytenoidectomy == null) {
            this.f3948arytenoidectomy = new androidx.media3.extractor.flv.saneness(this.f3950beachfront.track(9, 2));
        }
        this.f3950beachfront.endTracks();
        this.f3952cutely = this.f3959saneness.monoploid() - 5;
        this.f3951competently = 2;
        return true;
    }

    public final boolean formularize(monoploid monoploidVar) throws IOException {
        if (!monoploidVar.readFully(this.f3953dern.marial(), 0, 11, true)) {
            return false;
        }
        this.f3953dern.mathsort(0);
        this.f3947apical = this.f3953dern.supplicat();
        this.f3954formularize = this.f3953dern.polder();
        this.f3955impassible = this.f3953dern.polder();
        this.f3955impassible = (((long) (this.f3953dern.supplicat() << 24)) | this.f3955impassible) * 1000;
        this.f3953dern.splinterproof(3);
        this.f3951competently = 4;
        return true;
    }

    public final void impassible(monoploid monoploidVar) throws IOException {
        monoploidVar.skipFully(this.f3952cutely);
        this.f3952cutely = 0;
        this.f3951competently = 3;
    }

    public final long impromptu() {
        if (this.f3956impromptu) {
            return this.f3960taiyuan + this.f3955impassible;
        }
        if (this.f3958marial.wireman() == C.TIME_UNSET) {
            return 0L;
        }
        return this.f3955impassible;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f3950beachfront = polloiVar;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f3951competently = 1;
            this.f3956impromptu = false;
        } else {
            this.f3951competently = 3;
        }
        this.f3952cutely = 0;
    }

    public final stratoscope taiyuan(monoploid monoploidVar) throws IOException {
        if (this.f3954formularize > this.f3962wireman.saneness()) {
            stratoscope stratoscopeVar = this.f3962wireman;
            stratoscopeVar.walach(new byte[Math.max(stratoscopeVar.saneness() * 2, this.f3954formularize)], 0);
        } else {
            this.f3962wireman.mathsort(0);
        }
        this.f3962wireman.peridotite(this.f3954formularize);
        monoploidVar.readFully(this.f3962wireman.marial(), 0, this.f3954formularize);
        return this.f3962wireman;
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
