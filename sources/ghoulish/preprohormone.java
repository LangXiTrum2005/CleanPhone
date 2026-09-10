package ghoulish;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class preprohormone implements polder {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f27051apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impassible f27052attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f27053beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f27054competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f27055cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f27057formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f27058impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public decarock.kattegat f27059marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f27061taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f27062wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.cuirassed f27060saneness = new decarock.cuirassed(new byte[10]);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f27056dern = 0;

    public preprohormone(impassible impassibleVar) {
        this.f27052attabal = impassibleVar;
    }

    @Override // ghoulish.polder
    public void attabal(decarock.stratoscope stratoscopeVar, int i) throws ParserException {
        decarock.attabal.taiyuan(this.f27059marial);
        if ((i & 1) != 0) {
            int i2 = this.f27056dern;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    decarock.triweekly.impromptu("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f27055cutely != -1) {
                        decarock.triweekly.impromptu("PesReader", "Unexpected start indicator: expected " + this.f27055cutely + " more bytes");
                    }
                    this.f27052attabal.dern(stratoscopeVar.competently() == 0);
                }
            }
            competently(1);
        }
        while (stratoscopeVar.attabal() > 0) {
            int i3 = this.f27056dern;
            if (i3 == 0) {
                stratoscopeVar.splinterproof(stratoscopeVar.attabal());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (wireman(stratoscopeVar, this.f27060saneness.f25071attabal, Math.min(10, this.f27061taiyuan)) && wireman(stratoscopeVar, null, this.f27061taiyuan)) {
                        beachfront();
                        i |= this.f27051apical ? 4 : 0;
                        this.f27052attabal.wireman(this.f27057formularize, i);
                        competently(3);
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int iAttabal = stratoscopeVar.attabal();
                    int i4 = this.f27055cutely;
                    int i5 = i4 == -1 ? 0 : iAttabal - i4;
                    if (i5 > 0) {
                        iAttabal -= i5;
                        stratoscopeVar.peridotite(stratoscopeVar.beachfront() + iAttabal);
                    }
                    this.f27052attabal.attabal(stratoscopeVar);
                    int i6 = this.f27055cutely;
                    if (i6 != -1) {
                        int i7 = i6 - iAttabal;
                        this.f27055cutely = i7;
                        if (i7 == 0) {
                            this.f27052attabal.dern(false);
                            competently(1);
                        }
                    }
                }
            } else if (wireman(stratoscopeVar, this.f27060saneness.f25071attabal, 9)) {
                competently(marial() ? 2 : 0);
            }
        }
    }

    @RequiresNonNull({"timestampAdjuster"})
    public final void beachfront() {
        this.f27060saneness.arytenoidectomy(0);
        this.f27057formularize = C.TIME_UNSET;
        if (this.f27053beachfront) {
            this.f27060saneness.polloi(4);
            long jImpromptu = ((long) this.f27060saneness.impromptu(3)) << 30;
            this.f27060saneness.polloi(1);
            long jImpromptu2 = jImpromptu | ((long) (this.f27060saneness.impromptu(15) << 15));
            this.f27060saneness.polloi(1);
            long jImpromptu3 = jImpromptu2 | ((long) this.f27060saneness.impromptu(15));
            this.f27060saneness.polloi(1);
            if (!this.f27058impromptu && this.f27054competently) {
                this.f27060saneness.polloi(4);
                long jImpromptu4 = ((long) this.f27060saneness.impromptu(3)) << 30;
                this.f27060saneness.polloi(1);
                long jImpromptu5 = jImpromptu4 | ((long) (this.f27060saneness.impromptu(15) << 15));
                this.f27060saneness.polloi(1);
                long jImpromptu6 = jImpromptu5 | ((long) this.f27060saneness.impromptu(15));
                this.f27060saneness.polloi(1);
                this.f27059marial.saneness(jImpromptu6);
                this.f27058impromptu = true;
            }
            this.f27057formularize = this.f27059marial.saneness(jImpromptu3);
        }
    }

    public final void competently(int i) {
        this.f27056dern = i;
        this.f27062wireman = 0;
    }

    public boolean dern(boolean z) {
        if (this.f27056dern == 3 && this.f27055cutely == -1) {
            return (z && (this.f27052attabal instanceof triweekly)) ? false : true;
        }
        return false;
    }

    public final boolean marial() {
        this.f27060saneness.arytenoidectomy(0);
        int iImpromptu = this.f27060saneness.impromptu(24);
        if (iImpromptu != 1) {
            decarock.triweekly.impromptu("PesReader", "Unexpected start code prefix: " + iImpromptu);
            this.f27055cutely = -1;
            return false;
        }
        this.f27060saneness.polloi(8);
        int iImpromptu2 = this.f27060saneness.impromptu(16);
        this.f27060saneness.polloi(5);
        this.f27051apical = this.f27060saneness.competently();
        this.f27060saneness.polloi(2);
        this.f27053beachfront = this.f27060saneness.competently();
        this.f27054competently = this.f27060saneness.competently();
        this.f27060saneness.polloi(6);
        int iImpromptu3 = this.f27060saneness.impromptu(8);
        this.f27061taiyuan = iImpromptu3;
        if (iImpromptu2 == 0) {
            this.f27055cutely = -1;
        } else {
            int i = (iImpromptu2 - 3) - iImpromptu3;
            this.f27055cutely = i;
            if (i < 0) {
                decarock.triweekly.impromptu("PesReader", "Found negative packet payload size: " + this.f27055cutely);
                this.f27055cutely = -1;
            }
        }
        return true;
    }

    @Override // ghoulish.polder
    public void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        this.f27059marial = kattegatVar;
        this.f27052attabal.saneness(polloiVar, wiremanVar);
    }

    @Override // ghoulish.polder
    public void seek() {
        this.f27056dern = 0;
        this.f27062wireman = 0;
        this.f27058impromptu = false;
        this.f27052attabal.seek();
    }

    public final boolean wireman(decarock.stratoscope stratoscopeVar, byte[] bArr, int i) {
        int iMin = Math.min(stratoscopeVar.attabal(), i - this.f27062wireman);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            stratoscopeVar.splinterproof(iMin);
        } else {
            stratoscopeVar.formularize(bArr, this.f27062wireman, iMin);
        }
        int i2 = this.f27062wireman + iMin;
        this.f27062wireman = i2;
        return i2 == i;
    }
}
