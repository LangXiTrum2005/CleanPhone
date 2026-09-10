package strother;

import androidx.media3.common.rotuma;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import decarock.grimness;
import decarock.stratoscope;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: SubtitleTranscodingTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness implements privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final privatdozent f38180attabal;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public polloi f38184impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final polloi.attabal f38186saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public androidx.media3.common.polloi f38187taiyuan;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f38183dern = new wireman();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f38185marial = 0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f38181beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public byte[] f38182competently = grimness.f25081beachfront;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final stratoscope f38188wireman = new stratoscope();

    public dovishness(privatdozent privatdozentVar, polloi.attabal attabalVar) {
        this.f38180attabal = privatdozentVar;
        this.f38186saneness = attabalVar;
    }

    @Override // cybernatic.privatdozent
    public void attabal(stratoscope stratoscopeVar, int i, int i2) {
        if (this.f38184impromptu == null) {
            this.f38180attabal.attabal(stratoscopeVar, i, i2);
            return;
        }
        impromptu(i);
        stratoscopeVar.formularize(this.f38182competently, this.f38181beachfront, i);
        this.f38181beachfront += i;
    }

    @Override // cybernatic.privatdozent
    public int beachfront(androidx.media3.common.taiyuan taiyuanVar, int i, boolean z, int i2) throws IOException {
        if (this.f38184impromptu == null) {
            return this.f38180attabal.beachfront(taiyuanVar, i, z, i2);
        }
        impromptu(i);
        int i3 = taiyuanVar.read(this.f38182competently, this.f38181beachfront, i);
        if (i3 != -1) {
            this.f38181beachfront += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void cutely() {
        polloi polloiVar = this.f38184impromptu;
        if (polloiVar != null) {
            polloiVar.reset();
        }
    }

    @Override // cybernatic.privatdozent
    public void dern(androidx.media3.common.polloi polloiVar) {
        decarock.attabal.marial(polloiVar.f11218triweekly);
        decarock.attabal.attabal(rotuma.beachfront(polloiVar.f11218triweekly) == 3);
        if (!polloiVar.equals(this.f38187taiyuan)) {
            this.f38187taiyuan = polloiVar;
            this.f38184impromptu = this.f38186saneness.attabal(polloiVar) ? this.f38186saneness.dern(polloiVar) : null;
        }
        if (this.f38184impromptu == null) {
            this.f38180attabal.dern(polloiVar);
        } else {
            this.f38180attabal.dern(polloiVar.attabal().sensatory("application/x-media3-cues").privatdozent(polloiVar.f11218triweekly).igbo(Long.MAX_VALUE).walach(this.f38186saneness.saneness(polloiVar)).polder());
        }
    }

    public final void impromptu(int i) {
        int length = this.f38182competently.length;
        int i2 = this.f38181beachfront;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f38185marial;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f38182competently;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f38185marial, bArr2, 0, i3);
        this.f38185marial = 0;
        this.f38181beachfront = i3;
        this.f38182competently = bArr2;
    }

    public final void taiyuan(marial marialVar, long j, int i) {
        decarock.attabal.taiyuan(this.f38187taiyuan);
        byte[] bArrAttabal = this.f38183dern.attabal(marialVar.f38194attabal, marialVar.f38195dern);
        this.f38188wireman.hydrovane(bArrAttabal);
        this.f38180attabal.saneness(this.f38188wireman, bArrAttabal.length);
        long j2 = marialVar.f38196saneness;
        if (j2 == C.TIME_UNSET) {
            decarock.attabal.competently(this.f38187taiyuan.f11204molybdenite == Long.MAX_VALUE);
        } else {
            long j3 = this.f38187taiyuan.f11204molybdenite;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.f38180attabal.wireman(j, i, bArrAttabal.length, 0, null);
    }

    @Override // cybernatic.privatdozent
    public void wireman(final long j, final int i, int i2, int i3, privatdozent.attabal attabalVar) {
        if (this.f38184impromptu == null) {
            this.f38180attabal.wireman(j, i, i2, i3, attabalVar);
            return;
        }
        decarock.attabal.saneness(attabalVar == null, "DRM on subtitles is not supported");
        int i4 = (this.f38181beachfront - i3) - i2;
        this.f38184impromptu.saneness(this.f38182competently, i4, i2, polloi.saneness.saneness(), new decarock.impromptu() { // from class: strother.adultoid
            @Override // decarock.impromptu
            public final void accept(Object obj) {
                this.f38171attabal.taiyuan((marial) obj, j, i);
            }
        });
        int i5 = i4 + i2;
        this.f38185marial = i5;
        if (i5 == this.f38181beachfront) {
            this.f38185marial = 0;
            this.f38181beachfront = 0;
        }
    }
}
