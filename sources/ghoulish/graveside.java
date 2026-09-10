package ghoulish;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class graveside implements impassible {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f26892apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.stratoscope f26893attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public String f26894beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f26895competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f26896cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f26897dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f26898formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f26899impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f26900impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public privatdozent f26901marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final cybernatic.sealless.attabal f26902saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f26903taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f26904wireman;

    public graveside() {
        this(null, 0);
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        decarock.attabal.taiyuan(this.f26901marial);
        while (stratoscopeVar.attabal() > 0) {
            int i = this.f26895competently;
            if (i == 0) {
                marial(stratoscopeVar);
            } else if (i == 1) {
                competently(stratoscopeVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                beachfront(stratoscopeVar);
            }
        }
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void beachfront(decarock.stratoscope stratoscopeVar) {
        int iMin = Math.min(stratoscopeVar.attabal(), this.f26898formularize - this.f26900impromptu);
        this.f26901marial.saneness(stratoscopeVar, iMin);
        int i = this.f26900impromptu + iMin;
        this.f26900impromptu = i;
        if (i < this.f26898formularize) {
            return;
        }
        decarock.attabal.competently(this.f26899impassible != C.TIME_UNSET);
        this.f26901marial.wireman(this.f26899impassible, 1, this.f26898formularize, 0, null);
        this.f26899impassible += this.f26892apical;
        this.f26900impromptu = 0;
        this.f26895competently = 0;
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void competently(decarock.stratoscope stratoscopeVar) {
        int iMin = Math.min(stratoscopeVar.attabal(), 4 - this.f26900impromptu);
        stratoscopeVar.formularize(this.f26893attabal.marial(), this.f26900impromptu, iMin);
        int i = this.f26900impromptu + iMin;
        this.f26900impromptu = i;
        if (i < 4) {
            return;
        }
        this.f26893attabal.mathsort(0);
        if (!this.f26902saneness.attabal(this.f26893attabal.monoploid())) {
            this.f26900impromptu = 0;
            this.f26895competently = 1;
            return;
        }
        cybernatic.sealless.attabal attabalVar = this.f26902saneness;
        this.f26898formularize = attabalVar.f24769dern;
        if (!this.f26903taiyuan) {
            this.f26892apical = (((long) attabalVar.f24768competently) * 1000000) / ((long) attabalVar.f24772wireman);
            this.f26901marial.dern(new androidx.media3.common.polloi.saneness().cultivated(this.f26894beachfront).sensatory(this.f26902saneness.f24771saneness).itchy(4096).saran(this.f26902saneness.f24770marial).underbelly(this.f26902saneness.f24772wireman).treadless(this.f26897dern).coi(this.f26904wireman).polder());
            this.f26903taiyuan = true;
        }
        this.f26893attabal.mathsort(0);
        this.f26901marial.saneness(this.f26893attabal, 4);
        this.f26895competently = 2;
    }

    public final void marial(decarock.stratoscope stratoscopeVar) {
        byte[] bArrMarial = stratoscopeVar.marial();
        int iCompetently = stratoscopeVar.competently();
        for (int iBeachfront = stratoscopeVar.beachfront(); iBeachfront < iCompetently; iBeachfront++) {
            byte b = bArrMarial[iBeachfront];
            boolean z = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
            boolean z2 = this.f26896cutely && (b & 224) == 224;
            this.f26896cutely = z;
            if (z2) {
                stratoscopeVar.mathsort(iBeachfront + 1);
                this.f26896cutely = false;
                this.f26893attabal.marial()[1] = bArrMarial[iBeachfront];
                this.f26900impromptu = 2;
                this.f26895competently = 1;
                return;
            }
        }
        stratoscopeVar.mathsort(iCompetently);
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f26894beachfront = wiremanVar.saneness();
        this.f26901marial = polloiVar.track(wiremanVar.dern(), 1);
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f26895competently = 0;
        this.f26900impromptu = 0;
        this.f26896cutely = false;
        this.f26899impassible = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f26899impassible = j;
    }

    public graveside(String str, int i) {
        this.f26895competently = 0;
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(4);
        this.f26893attabal = stratoscopeVar;
        stratoscopeVar.marial()[0] = -1;
        this.f26902saneness = new cybernatic.sealless.attabal();
        this.f26899impassible = C.TIME_UNSET;
        this.f26897dern = str;
        this.f26904wireman = i;
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
    }
}
