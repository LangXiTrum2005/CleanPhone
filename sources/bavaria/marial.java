package bavaria;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import cybernatic.molybdenite;
import cybernatic.monoploid;
import decarock.stratoscope;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f15000marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f15002wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f14998attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final stratoscope f15001saneness = new stratoscope(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f14999dern = -1;

    public final int attabal(int i) {
        int i2;
        int i3 = 0;
        this.f15002wireman = 0;
        do {
            int i4 = this.f15002wireman;
            int i5 = i + i4;
            beachfront beachfrontVar = this.f14998attabal;
            if (i5 >= beachfrontVar.f14977competently) {
                break;
            }
            int[] iArr = beachfrontVar.f14978cutely;
            this.f15002wireman = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public void beachfront() {
        if (this.f15001saneness.marial().length == 65025) {
            return;
        }
        stratoscope stratoscopeVar = this.f15001saneness;
        stratoscopeVar.walach(Arrays.copyOf(stratoscopeVar.marial(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f15001saneness.competently())), this.f15001saneness.competently());
    }

    public stratoscope dern() {
        return this.f15001saneness;
    }

    public void marial() {
        this.f14998attabal.saneness();
        this.f15001saneness.starveling(0);
        this.f14999dern = -1;
        this.f15000marial = false;
    }

    public beachfront saneness() {
        return this.f14998attabal;
    }

    public boolean wireman(monoploid monoploidVar) throws IOException {
        int i;
        decarock.attabal.competently(monoploidVar != null);
        if (this.f15000marial) {
            this.f15000marial = false;
            this.f15001saneness.starveling(0);
        }
        while (!this.f15000marial) {
            if (this.f14999dern < 0) {
                if (!this.f14998attabal.dern(monoploidVar) || !this.f14998attabal.attabal(monoploidVar, true)) {
                    return false;
                }
                beachfront beachfrontVar = this.f14998attabal;
                int iAttabal = beachfrontVar.f14980impromptu;
                if ((beachfrontVar.f14982saneness & 1) == 1 && this.f15001saneness.competently() == 0) {
                    iAttabal += attabal(0);
                    i = this.f15002wireman;
                } else {
                    i = 0;
                }
                if (!molybdenite.marial(monoploidVar, iAttabal)) {
                    return false;
                }
                this.f14999dern = i;
            }
            int iAttabal2 = attabal(this.f14999dern);
            int i2 = this.f14999dern + this.f15002wireman;
            if (iAttabal2 > 0) {
                stratoscope stratoscopeVar = this.f15001saneness;
                stratoscopeVar.dern(stratoscopeVar.competently() + iAttabal2);
                if (!molybdenite.wireman(monoploidVar, this.f15001saneness.marial(), this.f15001saneness.competently(), iAttabal2)) {
                    return false;
                }
                stratoscope stratoscopeVar2 = this.f15001saneness;
                stratoscopeVar2.peridotite(stratoscopeVar2.competently() + iAttabal2);
                this.f15000marial = this.f14998attabal.f14978cutely[i2 + (-1)] != 255;
            }
            if (i2 == this.f14998attabal.f14977competently) {
                i2 = -1;
            }
            this.f14999dern = i2;
        }
        return true;
    }
}
