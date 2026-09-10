package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements impassible {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f26835apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.cuirassed f26836attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public privatdozent f26837beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f26838competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f26839cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f26840dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public androidx.media3.common.polloi f26841formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f26842impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f26843impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f26844marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f26845saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f26846taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f26847triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f26848wireman;

    public beachfront() {
        this(null, 0);
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    private void beachfront() {
        this.f26836attabal.arytenoidectomy(0);
        cybernatic.dern.saneness sanenessVarWireman = cybernatic.dern.wireman(this.f26836attabal);
        androidx.media3.common.polloi polloiVar = this.f26841formularize;
        if (polloiVar == null || sanenessVarWireman.f24623dern != polloiVar.f11215stratoscope || sanenessVarWireman.f24625saneness != polloiVar.f11219trm || !"audio/ac4".equals(polloiVar.f11218triweekly)) {
            androidx.media3.common.polloi polloiVarPolder = new androidx.media3.common.polloi.saneness().cultivated(this.f26844marial).sensatory("audio/ac4").saran(sanenessVarWireman.f24623dern).underbelly(sanenessVarWireman.f24625saneness).treadless(this.f26840dern).coi(this.f26848wireman).polder();
            this.f26841formularize = polloiVarPolder;
            this.f26837beachfront.dern(polloiVarPolder);
        }
        this.f26842impassible = sanenessVarWireman.f24626wireman;
        this.f26835apical = (((long) sanenessVarWireman.f24624marial) * 1000000) / ((long) this.f26841formularize.f11219trm);
    }

    private boolean competently(decarock.stratoscope stratoscopeVar) {
        while (true) {
            if (stratoscopeVar.attabal() <= 0) {
                return false;
            }
            if (this.f26846taiyuan) {
                int iSupplicat = stratoscopeVar.supplicat();
                this.f26846taiyuan = iSupplicat == 172;
                if (iSupplicat == 64 || iSupplicat == 65) {
                    this.f26839cutely = iSupplicat == 65;
                    return true;
                }
            } else {
                this.f26846taiyuan = stratoscopeVar.supplicat() == 172;
            }
        }
    }

    private boolean marial(decarock.stratoscope stratoscopeVar, byte[] bArr, int i) {
        int iMin = Math.min(stratoscopeVar.attabal(), i - this.f26843impromptu);
        stratoscopeVar.formularize(bArr, this.f26843impromptu, iMin);
        int i2 = this.f26843impromptu + iMin;
        this.f26843impromptu = i2;
        return i2 == i;
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        decarock.attabal.taiyuan(this.f26837beachfront);
        while (stratoscopeVar.attabal() > 0) {
            int i = this.f26838competently;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(stratoscopeVar.attabal(), this.f26842impassible - this.f26843impromptu);
                        this.f26837beachfront.saneness(stratoscopeVar, iMin);
                        int i2 = this.f26843impromptu + iMin;
                        this.f26843impromptu = i2;
                        if (i2 == this.f26842impassible) {
                            decarock.attabal.competently(this.f26847triweekly != C.TIME_UNSET);
                            this.f26837beachfront.wireman(this.f26847triweekly, 1, this.f26842impassible, 0, null);
                            this.f26847triweekly += this.f26835apical;
                            this.f26838competently = 0;
                        }
                    }
                } else if (marial(stratoscopeVar, this.f26845saneness.marial(), 16)) {
                    beachfront();
                    this.f26845saneness.mathsort(0);
                    this.f26837beachfront.saneness(this.f26845saneness, 16);
                    this.f26838competently = 2;
                }
            } else if (competently(stratoscopeVar)) {
                this.f26838competently = 1;
                this.f26845saneness.marial()[0] = -84;
                this.f26845saneness.marial()[1] = (byte) (this.f26839cutely ? 65 : 64);
                this.f26843impromptu = 2;
            }
        }
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f26844marial = wiremanVar.saneness();
        this.f26837beachfront = polloiVar.track(wiremanVar.dern(), 1);
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f26838competently = 0;
        this.f26843impromptu = 0;
        this.f26846taiyuan = false;
        this.f26839cutely = false;
        this.f26847triweekly = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f26847triweekly = j;
    }

    public beachfront(String str, int i) {
        decarock.cuirassed cuirassedVar = new decarock.cuirassed(new byte[16]);
        this.f26836attabal = cuirassedVar;
        this.f26845saneness = new decarock.stratoscope(cuirassedVar.f25071attabal);
        this.f26838competently = 0;
        this.f26843impromptu = 0;
        this.f26846taiyuan = false;
        this.f26839cutely = false;
        this.f26847triweekly = C.TIME_UNSET;
        this.f26840dern = str;
        this.f26848wireman = i;
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
    }
}
