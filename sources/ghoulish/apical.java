package ghoulish;

import androidx.media3.common.ParserException;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical implements impassible {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public androidx.media3.common.polloi f26769apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.stratoscope f26771attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public privatdozent f26772beachfront;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long f26774cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f26775dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f26776formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f26777impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f26778impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f26780marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f26782taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f26784wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f26773competently = 0;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f26770arytenoidectomy = C.TIME_UNSET;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicInteger f26781saneness = new AtomicInteger();

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f26783triweekly = -1;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f26779kowloon = -1;

    public apical(String str, int i, int i2) {
        this.f26771attabal = new decarock.stratoscope(new byte[i2]);
        this.f26775dern = str;
        this.f26784wireman = i;
    }

    private boolean marial(decarock.stratoscope stratoscopeVar, byte[] bArr, int i) {
        int iMin = Math.min(stratoscopeVar.attabal(), i - this.f26778impromptu);
        stratoscopeVar.formularize(bArr, this.f26778impromptu, iMin);
        int i2 = this.f26778impromptu + iMin;
        this.f26778impromptu = i2;
        return i2 == i;
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) throws ParserException {
        decarock.attabal.taiyuan(this.f26772beachfront);
        while (stratoscopeVar.attabal() > 0) {
            switch (this.f26773competently) {
                case 0:
                    if (taiyuan(stratoscopeVar)) {
                        int i = this.f26777impassible;
                        if (i == 3 || i == 4) {
                            this.f26773competently = 4;
                        } else if (i != 1) {
                            this.f26773competently = 2;
                        } else {
                            this.f26773competently = 1;
                        }
                    }
                    break;
                case 1:
                    if (marial(stratoscopeVar, this.f26771attabal.marial(), 18)) {
                        beachfront();
                        this.f26771attabal.mathsort(0);
                        this.f26772beachfront.saneness(this.f26771attabal, 18);
                        this.f26773competently = 6;
                    }
                    break;
                case 2:
                    if (marial(stratoscopeVar, this.f26771attabal.marial(), 7)) {
                        this.f26783triweekly = cybernatic.kowloon.cutely(this.f26771attabal.marial());
                        this.f26773competently = 3;
                    }
                    break;
                case 3:
                    if (marial(stratoscopeVar, this.f26771attabal.marial(), this.f26783triweekly)) {
                        competently();
                        this.f26771attabal.mathsort(0);
                        this.f26772beachfront.saneness(this.f26771attabal, this.f26783triweekly);
                        this.f26773competently = 6;
                    }
                    break;
                case 4:
                    if (marial(stratoscopeVar, this.f26771attabal.marial(), 6)) {
                        int iFormularize = cybernatic.kowloon.formularize(this.f26771attabal.marial());
                        this.f26779kowloon = iFormularize;
                        int i2 = this.f26778impromptu;
                        if (i2 > iFormularize) {
                            int i3 = i2 - iFormularize;
                            this.f26778impromptu = i2 - i3;
                            stratoscopeVar.mathsort(stratoscopeVar.beachfront() - i3);
                        }
                        this.f26773competently = 5;
                    }
                    break;
                case 5:
                    if (marial(stratoscopeVar, this.f26771attabal.marial(), this.f26779kowloon)) {
                        impromptu();
                        this.f26771attabal.mathsort(0);
                        this.f26772beachfront.saneness(this.f26771attabal, this.f26779kowloon);
                        this.f26773competently = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(stratoscopeVar.attabal(), this.f26776formularize - this.f26778impromptu);
                    this.f26772beachfront.saneness(stratoscopeVar, iMin);
                    int i4 = this.f26778impromptu + iMin;
                    this.f26778impromptu = i4;
                    if (i4 == this.f26776formularize) {
                        decarock.attabal.competently(this.f26770arytenoidectomy != C.TIME_UNSET);
                        this.f26772beachfront.wireman(this.f26770arytenoidectomy, this.f26777impassible == 4 ? 0 : 1, this.f26776formularize, 0, null);
                        this.f26770arytenoidectomy += this.f26774cutely;
                        this.f26773competently = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void beachfront() {
        byte[] bArrMarial = this.f26771attabal.marial();
        if (this.f26769apical == null) {
            androidx.media3.common.polloi polloiVarImpromptu = cybernatic.kowloon.impromptu(bArrMarial, this.f26780marial, this.f26775dern, this.f26784wireman, null);
            this.f26769apical = polloiVarImpromptu;
            this.f26772beachfront.dern(polloiVarImpromptu);
        }
        this.f26776formularize = cybernatic.kowloon.saneness(bArrMarial);
        this.f26774cutely = Ints.wireman(decarock.grimness.libyan(cybernatic.kowloon.competently(bArrMarial), this.f26769apical.f11219trm));
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void competently() throws ParserException {
        cybernatic.kowloon.saneness sanenessVarTaiyuan = cybernatic.kowloon.taiyuan(this.f26771attabal.marial());
        cutely(sanenessVarTaiyuan);
        this.f26776formularize = sanenessVarTaiyuan.f24692wireman;
        long j = sanenessVarTaiyuan.f24690marial;
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        this.f26774cutely = j;
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void cutely(cybernatic.kowloon.saneness sanenessVar) {
        int i;
        int i2 = sanenessVar.f24691saneness;
        if (i2 == -2147483647 || (i = sanenessVar.f24689dern) == -1) {
            return;
        }
        androidx.media3.common.polloi polloiVar = this.f26769apical;
        if (polloiVar != null && i == polloiVar.f11215stratoscope && i2 == polloiVar.f11219trm && decarock.grimness.dern(sanenessVar.f24687attabal, polloiVar.f11218triweekly)) {
            return;
        }
        androidx.media3.common.polloi polloiVar2 = this.f26769apical;
        androidx.media3.common.polloi polloiVarPolder = (polloiVar2 == null ? new androidx.media3.common.polloi.saneness() : polloiVar2.attabal()).cultivated(this.f26780marial).sensatory(sanenessVar.f24687attabal).saran(sanenessVar.f24689dern).underbelly(sanenessVar.f24691saneness).treadless(this.f26775dern).coi(this.f26784wireman).polder();
        this.f26769apical = polloiVarPolder;
        this.f26772beachfront.dern(polloiVarPolder);
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void impromptu() throws ParserException {
        cybernatic.kowloon.saneness sanenessVarApical = cybernatic.kowloon.apical(this.f26771attabal.marial(), this.f26781saneness);
        if (this.f26777impassible == 3) {
            cutely(sanenessVarApical);
        }
        this.f26776formularize = sanenessVarApical.f24692wireman;
        long j = sanenessVarApical.f24690marial;
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        this.f26774cutely = j;
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f26780marial = wiremanVar.saneness();
        this.f26772beachfront = polloiVar.track(wiremanVar.dern(), 1);
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f26773competently = 0;
        this.f26778impromptu = 0;
        this.f26782taiyuan = 0;
        this.f26770arytenoidectomy = C.TIME_UNSET;
        this.f26781saneness.set(0);
    }

    public final boolean taiyuan(decarock.stratoscope stratoscopeVar) {
        while (stratoscopeVar.attabal() > 0) {
            int i = this.f26782taiyuan << 8;
            this.f26782taiyuan = i;
            int iSupplicat = i | stratoscopeVar.supplicat();
            this.f26782taiyuan = iSupplicat;
            int iDern = cybernatic.kowloon.dern(iSupplicat);
            this.f26777impassible = iDern;
            if (iDern != 0) {
                byte[] bArrMarial = this.f26771attabal.marial();
                int i2 = this.f26782taiyuan;
                bArrMarial[0] = (byte) ((i2 >> 24) & 255);
                bArrMarial[1] = (byte) ((i2 >> 16) & 255);
                bArrMarial[2] = (byte) ((i2 >> 8) & 255);
                bArrMarial[3] = (byte) (i2 & 255);
                this.f26778impromptu = 4;
                this.f26782taiyuan = 0;
                return true;
            }
        }
        return false;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f26770arytenoidectomy = j;
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
    }
}
