package androidx.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class preterite {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final vesuvio f12286apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.apical f12287attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public wostteth f12288beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f12289competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final hydromechanics.trm f12290cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ethene.trm[] f12291dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public preterite f12292formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ethene.restrictive f12293impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean[] f12294impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f12295kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f12296marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f12297saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final lampshade[] f12298taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public hydromechanics.oilcan f12299triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f12300wireman;

    /* JADX INFO: compiled from: MediaPeriodHolder.java */
    public interface attabal {
        preterite attabal(wostteth wosttethVar, long j);
    }

    public preterite(lampshade[] lampshadeVarArr, long j, hydromechanics.trm trmVar, polyfoil.saneness sanenessVar, vesuvio vesuvioVar, wostteth wosttethVar, hydromechanics.oilcan oilcanVar) {
        this.f12298taiyuan = lampshadeVarArr;
        this.f12295kowloon = j;
        this.f12290cutely = trmVar;
        this.f12286apical = vesuvioVar;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = wosttethVar.f13003attabal;
        this.f12297saneness = sanenessVar2.f12518attabal;
        this.f12288beachfront = wosttethVar;
        this.f12293impassible = ethene.restrictive.f26058wireman;
        this.f12299triweekly = oilcanVar;
        this.f12291dern = new ethene.trm[lampshadeVarArr.length];
        this.f12294impromptu = new boolean[lampshadeVarArr.length];
        this.f12287attabal = beachfront(sanenessVar2, vesuvioVar, sanenessVar, wosttethVar.f13009saneness, wosttethVar.f13011wireman);
    }

    public static androidx.media3.exoplayer.source.apical beachfront(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, vesuvio vesuvioVar, polyfoil.saneness sanenessVar2, long j, long j2) {
        androidx.media3.exoplayer.source.apical apicalVarImpromptu = vesuvioVar.impromptu(sanenessVar, sanenessVar2, j);
        return j2 != C.TIME_UNSET ? new androidx.media3.exoplayer.source.saneness(apicalVarImpromptu, true, 0L, j2) : apicalVarImpromptu;
    }

    public static void gintrap(vesuvio vesuvioVar, androidx.media3.exoplayer.source.apical apicalVar) {
        try {
            if (apicalVar instanceof androidx.media3.exoplayer.source.saneness) {
                vesuvioVar.cord(((androidx.media3.exoplayer.source.saneness) apicalVar).f12700kowloon);
            } else {
                vesuvioVar.cord(apicalVar);
            }
        } catch (RuntimeException e) {
            decarock.triweekly.wireman("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void adultoid(long j) {
        decarock.attabal.competently(graveside());
        if (this.f12300wireman) {
            this.f12287attabal.reevaluateBuffer(cuirassed(j));
        }
    }

    public preterite apical() {
        return this.f12292formularize;
    }

    public hydromechanics.oilcan arytenoidectomy() {
        return this.f12299triweekly;
    }

    public long attabal(hydromechanics.oilcan oilcanVar, long j, boolean z) {
        return saneness(oilcanVar, j, z, new boolean[this.f12298taiyuan.length]);
    }

    public final void competently() {
        if (!graveside()) {
            return;
        }
        int i = 0;
        while (true) {
            hydromechanics.oilcan oilcanVar = this.f12299triweekly;
            if (i >= oilcanVar.f28177attabal) {
                return;
            }
            boolean zDern = oilcanVar.dern(i);
            hydromechanics.rotuma rotumaVar = this.f12299triweekly.f28178dern[i];
            if (zDern && rotumaVar != null) {
                rotumaVar.disable();
            }
            i++;
        }
    }

    public void cord(long j) {
        this.f12295kowloon = j;
    }

    public long cuirassed(long j) {
        return j - impassible();
    }

    public long cutely() {
        if (!this.f12300wireman) {
            return this.f12288beachfront.f13009saneness;
        }
        long bufferedPositionUs = this.f12296marial ? this.f12287attabal.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f12288beachfront.f13008marial : bufferedPositionUs;
    }

    public final void dern(ethene.trm[] trmVarArr) {
        int i = 0;
        while (true) {
            lampshade[] lampshadeVarArr = this.f12298taiyuan;
            if (i >= lampshadeVarArr.length) {
                return;
            }
            if (lampshadeVarArr[i].getTrackType() == -2 && this.f12299triweekly.dern(i)) {
                trmVarArr[i] = new ethene.impassible();
            }
            i++;
        }
    }

    public void dovishness() {
        competently();
        gintrap(this.f12286apical, this.f12287attabal);
    }

    public long formularize() {
        if (this.f12300wireman) {
            return this.f12287attabal.getNextLoadPositionUs();
        }
        return 0L;
    }

    public final boolean graveside() {
        return this.f12292formularize == null;
    }

    public long impassible() {
        return this.f12295kowloon;
    }

    public final void impromptu(ethene.trm[] trmVarArr) {
        int i = 0;
        while (true) {
            lampshade[] lampshadeVarArr = this.f12298taiyuan;
            if (i >= lampshadeVarArr.length) {
                return;
            }
            if (lampshadeVarArr[i].getTrackType() == -2) {
                trmVarArr[i] = null;
            }
            i++;
        }
    }

    public ethene.restrictive kowloon() {
        return this.f12293impassible;
    }

    public void marial(long j, float f, long j2) {
        decarock.attabal.competently(graveside());
        this.f12287attabal.attabal(new sensatory.saneness().beachfront(cuirassed(j)).competently(f).marial(j2).wireman());
    }

    public boolean molybdenite() {
        if (this.f12300wireman) {
            return !this.f12296marial || this.f12287attabal.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void monoploid(float f, androidx.media3.common.oilcan oilcanVar) throws ExoPlaybackException {
        this.f12300wireman = true;
        this.f12293impassible = this.f12287attabal.getTrackGroups();
        hydromechanics.oilcan oilcanVarRotuma = rotuma(f, oilcanVar);
        wostteth wosttethVar = this.f12288beachfront;
        long jMax = wosttethVar.f13009saneness;
        long j = wosttethVar.f13008marial;
        if (j != C.TIME_UNSET && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jAttabal = attabal(oilcanVarRotuma, jMax, false);
        long j2 = this.f12295kowloon;
        wostteth wosttethVar2 = this.f12288beachfront;
        this.f12295kowloon = j2 + (wosttethVar2.f13009saneness - jAttabal);
        this.f12288beachfront = wosttethVar2.saneness(jAttabal);
    }

    public boolean polloi() {
        try {
            if (this.f12300wireman) {
                for (ethene.trm trmVar : this.f12291dern) {
                    if (trmVar != null) {
                        trmVar.maybeThrowError();
                    }
                }
            } else {
                this.f12287attabal.maybeThrowPrepareError();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public void preprohormone(preterite preteriteVar) {
        if (preteriteVar == this.f12292formularize) {
            return;
        }
        competently();
        this.f12292formularize = preteriteVar;
        taiyuan();
    }

    public hydromechanics.oilcan rotuma(float f, androidx.media3.common.oilcan oilcanVar) throws ExoPlaybackException {
        hydromechanics.oilcan oilcanVarCutely = this.f12290cutely.cutely(this.f12298taiyuan, kowloon(), this.f12288beachfront.f13003attabal, oilcanVar);
        for (int i = 0; i < oilcanVarCutely.f28177attabal; i++) {
            boolean z = true;
            if (oilcanVarCutely.dern(i)) {
                if (oilcanVarCutely.f28178dern[i] == null && this.f12298taiyuan[i].getTrackType() != -2) {
                    z = false;
                }
                decarock.attabal.competently(z);
            } else {
                decarock.attabal.competently(oilcanVarCutely.f28178dern[i] == null);
            }
        }
        for (hydromechanics.rotuma rotumaVar : oilcanVarCutely.f28178dern) {
            if (rotumaVar != null) {
                rotumaVar.onPlaybackSpeed(f);
            }
        }
        return oilcanVarCutely;
    }

    public long saneness(hydromechanics.oilcan oilcanVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= oilcanVar.f28177attabal) {
                break;
            }
            boolean[] zArr2 = this.f12294impromptu;
            if (z || !oilcanVar.saneness(this.f12299triweekly, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        impromptu(this.f12291dern);
        competently();
        this.f12299triweekly = oilcanVar;
        taiyuan();
        long jSaneness = this.f12287attabal.saneness(oilcanVar.f28178dern, this.f12294impromptu, this.f12291dern, zArr, j);
        dern(this.f12291dern);
        this.f12296marial = false;
        int i2 = 0;
        while (true) {
            ethene.trm[] trmVarArr = this.f12291dern;
            if (i2 >= trmVarArr.length) {
                return jSaneness;
            }
            if (trmVarArr[i2] != null) {
                decarock.attabal.competently(oilcanVar.dern(i2));
                if (this.f12298taiyuan[i2].getTrackType() != -2) {
                    this.f12296marial = true;
                }
            } else {
                decarock.attabal.competently(oilcanVar.f28178dern[i2] == null);
            }
            i2++;
        }
    }

    public long stratoscope(long j) {
        return j + impassible();
    }

    public final void taiyuan() {
        if (!graveside()) {
            return;
        }
        int i = 0;
        while (true) {
            hydromechanics.oilcan oilcanVar = this.f12299triweekly;
            if (i >= oilcanVar.f28177attabal) {
                return;
            }
            boolean zDern = oilcanVar.dern(i);
            hydromechanics.rotuma rotumaVar = this.f12299triweekly.f28178dern[i];
            if (zDern && rotumaVar != null) {
                rotumaVar.enable();
            }
            i++;
        }
    }

    public long triweekly() {
        return this.f12288beachfront.f13009saneness + this.f12295kowloon;
    }

    public void trm() {
        androidx.media3.exoplayer.source.apical apicalVar = this.f12287attabal;
        if (apicalVar instanceof androidx.media3.exoplayer.source.saneness) {
            long j = this.f12288beachfront.f13011wireman;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.saneness) apicalVar).formularize(0L, j);
        }
    }

    public boolean wireman(wostteth wosttethVar) {
        if (!gusty.wireman(this.f12288beachfront.f13008marial, wosttethVar.f13008marial)) {
            return false;
        }
        wostteth wosttethVar2 = this.f12288beachfront;
        return wosttethVar2.f13009saneness == wosttethVar.f13009saneness && wosttethVar2.f13003attabal.equals(wosttethVar.f13003attabal);
    }
}
