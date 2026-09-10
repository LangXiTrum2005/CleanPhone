package bavaria;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.polloi;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import decarock.grimness;
import decarock.stratoscope;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class taiyuan {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f15009apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f15011beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f15012competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public polloi f15014dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f15015formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f15016impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f15017impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f15018marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public privatdozent f15019saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f15020taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public competently f15021wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f15010attabal = new marial();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public saneness f15013cutely = new saneness();

    /* JADX INFO: compiled from: StreamReader.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public androidx.media3.common.polloi f15022attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public competently f15023saneness;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int apical(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        long jAttabal = this.f15021wireman.attabal(monoploidVar);
        if (jAttabal >= 0) {
            restrictiveVar.f24743attabal = jAttabal;
            return 1;
        }
        if (jAttabal < -1) {
            marial(-(jAttabal + 2));
        }
        if (!this.f15015formularize) {
            this.f15014dern.beachfront((merc) decarock.attabal.taiyuan(this.f15021wireman.createSeekMap()));
            this.f15015formularize = true;
        }
        if (this.f15009apical <= 0 && !this.f15010attabal.wireman(monoploidVar)) {
            this.f15017impromptu = 3;
            return -1;
        }
        this.f15009apical = 0L;
        stratoscope stratoscopeVarDern = this.f15010attabal.dern();
        long jBeachfront = beachfront(stratoscopeVarDern);
        if (jBeachfront >= 0) {
            long j = this.f15012competently;
            if (j + jBeachfront >= this.f15018marial) {
                long jSaneness = saneness(j);
                this.f15019saneness.saneness(stratoscopeVarDern, stratoscopeVarDern.competently());
                this.f15019saneness.wireman(jSaneness, 1, stratoscopeVarDern.competently(), 0, null);
                this.f15018marial = -1L;
            }
        }
        this.f15012competently += jBeachfront;
        return 0;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void attabal() {
        decarock.attabal.taiyuan(this.f15019saneness);
        grimness.impromptu(this.f15014dern);
    }

    public abstract long beachfront(stratoscope stratoscopeVar);

    public final int competently(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        attabal();
        int i = this.f15017impromptu;
        if (i == 0) {
            return cutely(monoploidVar);
        }
        if (i == 1) {
            monoploidVar.skipFully((int) this.f15011beachfront);
            this.f15017impromptu = 2;
            return 0;
        }
        if (i == 2) {
            grimness.impromptu(this.f15021wireman);
            return apical(monoploidVar, restrictiveVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @RequiresNonNull({"trackOutput"})
    public final int cutely(monoploid monoploidVar) throws IOException {
        if (!impromptu(monoploidVar)) {
            return -1;
        }
        androidx.media3.common.polloi polloiVar = this.f15013cutely.f15022attabal;
        this.f15020taiyuan = polloiVar.f11219trm;
        if (!this.f15016impassible) {
            this.f15019saneness.dern(polloiVar);
            this.f15016impassible = true;
        }
        competently competentlyVar = this.f15013cutely.f15023saneness;
        if (competentlyVar != null) {
            this.f15021wireman = competentlyVar;
        } else if (monoploidVar.getLength() == -1) {
            this.f15021wireman = new dern();
        } else {
            beachfront beachfrontVarSaneness = this.f15010attabal.saneness();
            this.f15021wireman = new bavaria.attabal(this, this.f15011beachfront, monoploidVar.getLength(), beachfrontVarSaneness.f14980impromptu + beachfrontVarSaneness.f14983taiyuan, beachfrontVarSaneness.f14979dern, (beachfrontVarSaneness.f14982saneness & 4) != 0);
        }
        this.f15017impromptu = 2;
        this.f15010attabal.beachfront();
        return 0;
    }

    public long dern(long j) {
        return (((long) this.f15020taiyuan) * j) / 1000000;
    }

    public void formularize(boolean z) {
        if (z) {
            this.f15013cutely = new saneness();
            this.f15011beachfront = 0L;
            this.f15017impromptu = 0;
        } else {
            this.f15017impromptu = 1;
        }
        this.f15018marial = -1L;
        this.f15012competently = 0L;
    }

    public final void impassible(long j, long j2) {
        this.f15010attabal.marial();
        if (j == 0) {
            formularize(!this.f15015formularize);
        } else if (this.f15017impromptu != 0) {
            this.f15018marial = dern(j2);
            ((competently) grimness.impromptu(this.f15021wireman)).startSeek(this.f15018marial);
            this.f15017impromptu = 2;
        }
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean impromptu(monoploid monoploidVar) throws IOException {
        while (this.f15010attabal.wireman(monoploidVar)) {
            this.f15009apical = monoploidVar.getPosition() - this.f15011beachfront;
            if (!taiyuan(this.f15010attabal.dern(), this.f15011beachfront, this.f15013cutely)) {
                return true;
            }
            this.f15011beachfront = monoploidVar.getPosition();
        }
        this.f15017impromptu = 3;
        return false;
    }

    public void marial(long j) {
        this.f15012competently = j;
    }

    public long saneness(long j) {
        return (j * 1000000) / ((long) this.f15020taiyuan);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean taiyuan(stratoscope stratoscopeVar, long j, saneness sanenessVar) throws IOException;

    public void wireman(polloi polloiVar, privatdozent privatdozentVar) {
        this.f15014dern = polloiVar;
        this.f15019saneness = privatdozentVar;
        formularize(true);
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class dern implements competently {
        public dern() {
        }

        @Override // bavaria.competently
        public long attabal(monoploid monoploidVar) {
            return -1L;
        }

        @Override // bavaria.competently
        public merc createSeekMap() {
            return new merc.saneness(C.TIME_UNSET);
        }

        @Override // bavaria.competently
        public void startSeek(long j) {
        }
    }
}
