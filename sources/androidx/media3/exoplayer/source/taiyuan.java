package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements apical, apical.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public attabal f12707adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long f12708arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f12709dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public long f12710gintrap = C.TIME_UNSET;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public apical.attabal f12711graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final formularize.saneness f12712kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public apical f12713molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final polyfoil.saneness f12714monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public formularize f12715polloi;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface attabal {
        void attabal(formularize.saneness sanenessVar, IOException iOException);

        void saneness(formularize.saneness sanenessVar);
    }

    public taiyuan(formularize.saneness sanenessVar, polyfoil.saneness sanenessVar2, long j) {
        this.f12712kowloon = sanenessVar;
        this.f12714monoploid = sanenessVar2;
        this.f12708arytenoidectomy = j;
    }

    @Override // androidx.media3.exoplayer.source.adultoid.attabal
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public void wireman(apical apicalVar) {
        ((apical.attabal) grimness.impromptu(this.f12711graveside)).wireman(this);
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        apical apicalVar = this.f12713molybdenite;
        return apicalVar != null && apicalVar.attabal(sensatoryVar);
    }

    public void beachfront(formularize.saneness sanenessVar) {
        long jCutely = cutely(this.f12708arytenoidectomy);
        apical apicalVarKowloon = ((formularize) decarock.attabal.marial(this.f12715polloi)).kowloon(sanenessVar, this.f12714monoploid, jCutely);
        this.f12713molybdenite = apicalVarKowloon;
        if (this.f12711graveside != null) {
            apicalVarKowloon.competently(this, jCutely);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        this.f12711graveside = attabalVar;
        apical apicalVar = this.f12713molybdenite;
        if (apicalVar != null) {
            apicalVar.competently(this, cutely(this.f12708arytenoidectomy));
        }
    }

    public final long cutely(long j) {
        long j2 = this.f12710gintrap;
        return j2 != C.TIME_UNSET ? j2 : j;
    }

    @Override // androidx.media3.exoplayer.source.apical.attabal
    public void dern(apical apicalVar) {
        ((apical.attabal) grimness.impromptu(this.f12711graveside)).dern(this);
        attabal attabalVar = this.f12707adultoid;
        if (attabalVar != null) {
            attabalVar.saneness(this.f12712kowloon);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
        ((apical) grimness.impromptu(this.f12713molybdenite)).discardBuffer(j, z);
    }

    public void formularize(long j) {
        this.f12710gintrap = j;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).getTrackGroups();
    }

    public void impassible() {
        if (this.f12713molybdenite != null) {
            ((formularize) decarock.attabal.marial(this.f12715polloi)).beachfront(this.f12713molybdenite);
        }
    }

    public long impromptu() {
        return this.f12710gintrap;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        apical apicalVar = this.f12713molybdenite;
        return apicalVar != null && apicalVar.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).marial(j, moletVar);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() throws IOException {
        try {
            apical apicalVar = this.f12713molybdenite;
            if (apicalVar != null) {
                apicalVar.maybeThrowPrepareError();
                return;
            }
            formularize formularizeVar = this.f12715polloi;
            if (formularizeVar != null) {
                formularizeVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            attabal attabalVar = this.f12707adultoid;
            if (attabalVar == null) {
                throw e;
            }
            if (this.f12709dovishness) {
                return;
            }
            this.f12709dovishness = true;
            attabalVar.attabal(this.f12712kowloon, e);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
        ((apical) grimness.impromptu(this.f12713molybdenite)).reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        long j2 = this.f12710gintrap;
        long j3 = (j2 == C.TIME_UNSET || j != this.f12708arytenoidectomy) ? j : j2;
        this.f12710gintrap = C.TIME_UNSET;
        return ((apical) grimness.impromptu(this.f12713molybdenite)).saneness(rotumaVarArr, zArr, trmVarArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        return ((apical) grimness.impromptu(this.f12713molybdenite)).seekToUs(j);
    }

    public long taiyuan() {
        return this.f12708arytenoidectomy;
    }

    public void triweekly(formularize formularizeVar) {
        decarock.attabal.competently(this.f12715polloi == null);
        this.f12715polloi = formularizeVar;
    }
}
