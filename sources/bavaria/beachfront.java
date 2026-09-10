package bavaria;

import androidx.media3.common.ParserException;
import cybernatic.molybdenite;
import cybernatic.monoploid;
import decarock.stratoscope;
import java.io.IOException;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f14975attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f14976beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f14977competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f14979dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f14980impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f14981marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f14982saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f14983taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f14984wireman;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int[] f14978cutely = new int[255];

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final stratoscope f14974apical = new stratoscope(255);

    public boolean attabal(monoploid monoploidVar, boolean z) throws IOException {
        saneness();
        this.f14974apical.starveling(27);
        if (!molybdenite.saneness(monoploidVar, this.f14974apical.marial(), 0, 27, z) || this.f14974apical.merc() != 1332176723) {
            return false;
        }
        int iSupplicat = this.f14974apical.supplicat();
        this.f14975attabal = iSupplicat;
        if (iSupplicat != 0) {
            if (z) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f14982saneness = this.f14974apical.supplicat();
        this.f14979dern = this.f14974apical.dovishness();
        this.f14984wireman = this.f14974apical.rotuma();
        this.f14981marial = this.f14974apical.rotuma();
        this.f14976beachfront = this.f14974apical.rotuma();
        int iSupplicat2 = this.f14974apical.supplicat();
        this.f14977competently = iSupplicat2;
        this.f14980impromptu = iSupplicat2 + 27;
        this.f14974apical.starveling(iSupplicat2);
        if (!molybdenite.saneness(monoploidVar, this.f14974apical.marial(), 0, this.f14977competently, z)) {
            return false;
        }
        for (int i = 0; i < this.f14977competently; i++) {
            this.f14978cutely[i] = this.f14974apical.supplicat();
            this.f14983taiyuan += this.f14978cutely[i];
        }
        return true;
    }

    public boolean dern(monoploid monoploidVar) throws IOException {
        return wireman(monoploidVar, -1L);
    }

    public void saneness() {
        this.f14975attabal = 0;
        this.f14982saneness = 0;
        this.f14979dern = 0L;
        this.f14984wireman = 0L;
        this.f14981marial = 0L;
        this.f14976beachfront = 0L;
        this.f14977competently = 0;
        this.f14980impromptu = 0;
        this.f14983taiyuan = 0;
    }

    public boolean wireman(monoploid monoploidVar, long j) throws IOException {
        decarock.attabal.attabal(monoploidVar.getPosition() == monoploidVar.getPeekPosition());
        this.f14974apical.starveling(4);
        while (true) {
            if ((j != -1 && monoploidVar.getPosition() + 4 >= j) || !molybdenite.saneness(monoploidVar, this.f14974apical.marial(), 0, 4, true)) {
                break;
            }
            this.f14974apical.mathsort(0);
            if (this.f14974apical.merc() == 1332176723) {
                monoploidVar.resetPeekPosition();
                return true;
            }
            monoploidVar.skipFully(1);
        }
        do {
            if (j != -1 && monoploidVar.getPosition() >= j) {
                break;
            }
        } while (monoploidVar.skip(1) != -1);
        return false;
    }
}
