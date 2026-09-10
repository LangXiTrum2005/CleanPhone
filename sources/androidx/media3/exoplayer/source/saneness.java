package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements apical, apical.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public ClippingMediaSource.IllegalClippingException f12697adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public apical.attabal f12698arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f12699graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final apical f12700kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public long f12701molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public attabal[] f12702monoploid = new attabal[0];

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public long f12703polloi;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class attabal implements trm {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final trm f12704attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f12706saneness;

        public attabal(trm trmVar) {
            this.f12704attabal = trmVar;
        }

        @Override // ethene.trm
        public int attabal(empress empressVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (saneness.this.impromptu()) {
                return -3;
            }
            if (this.f12706saneness) {
                decoderInputBuffer.impassible(4);
                return -4;
            }
            long bufferedPositionUs = saneness.this.getBufferedPositionUs();
            int iAttabal = this.f12704attabal.attabal(empressVar, decoderInputBuffer, i);
            if (iAttabal == -5) {
                androidx.media3.common.polloi polloiVar = (androidx.media3.common.polloi) decarock.attabal.marial(empressVar.f11879saneness);
                int i2 = polloiVar.f11221yemenite;
                if (i2 != 0 || polloiVar.f11213sealless != 0) {
                    saneness sanenessVar = saneness.this;
                    if (sanenessVar.f12701molybdenite != 0) {
                        i2 = 0;
                    }
                    empressVar.f11879saneness = polloiVar.attabal().splinterproof(i2).overspeculate(sanenessVar.f12699graveside == Long.MIN_VALUE ? polloiVar.f11213sealless : 0).polder();
                }
                return -5;
            }
            long j = saneness.this.f12699graveside;
            if (j == Long.MIN_VALUE || ((iAttabal != -4 || decoderInputBuffer.f11480graveside < j) && !(iAttabal == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f11481molybdenite))) {
                return iAttabal;
            }
            decoderInputBuffer.dern();
            decoderInputBuffer.impassible(4);
            this.f12706saneness = true;
            return -4;
        }

        @Override // ethene.trm
        public boolean isReady() {
            return !saneness.this.impromptu() && this.f12704attabal.isReady();
        }

        @Override // ethene.trm
        public void maybeThrowError() throws IOException {
            this.f12704attabal.maybeThrowError();
        }

        public void saneness() {
            this.f12706saneness = false;
        }

        @Override // ethene.trm
        public int skipData(long j) {
            if (saneness.this.impromptu()) {
                return -3;
            }
            return this.f12704attabal.skipData(j);
        }
    }

    public saneness(apical apicalVar, boolean z, long j, long j2) {
        this.f12700kowloon = apicalVar;
        this.f12703polloi = z ? j : C.TIME_UNSET;
        this.f12701molybdenite = j;
        this.f12699graveside = j2;
    }

    public static boolean apical(long j, hydromechanics.rotuma[] rotumaVarArr) {
        if (j != 0) {
            for (hydromechanics.rotuma rotumaVar : rotumaVarArr) {
                if (rotumaVar != null) {
                    androidx.media3.common.polloi selectedFormat = rotumaVar.getSelectedFormat();
                    if (!androidx.media3.common.rotuma.attabal(selectedFormat.f11218triweekly, selectedFormat.f11192cutely)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        return this.f12700kowloon.attabal(sensatoryVar);
    }

    public final molet beachfront(long j, molet moletVar) {
        long jArytenoidectomy = grimness.arytenoidectomy(moletVar.f12118attabal, 0L, j - this.f12701molybdenite);
        long j2 = moletVar.f12119saneness;
        long j3 = this.f12699graveside;
        long jArytenoidectomy2 = grimness.arytenoidectomy(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jArytenoidectomy == moletVar.f12118attabal && jArytenoidectomy2 == moletVar.f12119saneness) ? moletVar : new molet(jArytenoidectomy, jArytenoidectomy2);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        this.f12698arytenoidectomy = attabalVar;
        this.f12700kowloon.competently(this, j);
    }

    public void cutely(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f12697adultoid = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.apical.attabal
    public void dern(apical apicalVar) {
        if (this.f12697adultoid != null) {
            return;
        }
        ((apical.attabal) decarock.attabal.marial(this.f12698arytenoidectomy)).dern(this);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
        this.f12700kowloon.discardBuffer(j, z);
    }

    public void formularize(long j, long j2) {
        this.f12701molybdenite = j;
        this.f12699graveside = j2;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f12700kowloon.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f12699graveside;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f12700kowloon.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f12699graveside;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return this.f12700kowloon.getTrackGroups();
    }

    public boolean impromptu() {
        return this.f12703polloi != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        return this.f12700kowloon.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        long j2 = this.f12701molybdenite;
        if (j == j2) {
            return j2;
        }
        return this.f12700kowloon.marial(j, beachfront(j, moletVar));
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f12697adultoid;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f12700kowloon.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        if (impromptu()) {
            long j = this.f12703polloi;
            this.f12703polloi = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j;
        }
        long discontinuity2 = this.f12700kowloon.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        decarock.attabal.competently(discontinuity2 >= this.f12701molybdenite);
        long j2 = this.f12699graveside;
        decarock.attabal.competently(j2 == Long.MIN_VALUE || discontinuity2 <= j2);
        return discontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
        this.f12700kowloon.reevaluateBuffer(j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f12702monoploid = new attabal[trmVarArr.length];
        trm[] trmVarArr2 = new trm[trmVarArr.length];
        int i = 0;
        while (true) {
            trm trmVar = null;
            if (i >= trmVarArr.length) {
                break;
            }
            attabal[] attabalVarArr = this.f12702monoploid;
            attabal attabalVar = (attabal) trmVarArr[i];
            attabalVarArr[i] = attabalVar;
            if (attabalVar != null) {
                trmVar = attabalVar.f12704attabal;
            }
            trmVarArr2[i] = trmVar;
            i++;
        }
        long jSaneness = this.f12700kowloon.saneness(rotumaVarArr, zArr, trmVarArr2, zArr2, j);
        if (impromptu()) {
            long j3 = this.f12701molybdenite;
            if (j == j3 && apical(j3, rotumaVarArr)) {
                j2 = jSaneness;
            } else {
                j2 = C.TIME_UNSET;
            }
        } else {
            j2 = C.TIME_UNSET;
        }
        this.f12703polloi = j2;
        if (jSaneness != j) {
            if (jSaneness >= this.f12701molybdenite) {
                long j4 = this.f12699graveside;
                z = j4 == Long.MIN_VALUE || jSaneness <= j4;
            }
        }
        decarock.attabal.competently(z);
        for (int i2 = 0; i2 < trmVarArr.length; i2++) {
            trm trmVar2 = trmVarArr2[i2];
            if (trmVar2 == null) {
                this.f12702monoploid[i2] = null;
            } else {
                attabal[] attabalVarArr2 = this.f12702monoploid;
                attabal attabalVar2 = attabalVarArr2[i2];
                if (attabalVar2 == null || attabalVar2.f12704attabal != trmVar2) {
                    attabalVarArr2[i2] = new attabal(trmVar2);
                }
            }
            trmVarArr[i2] = this.f12702monoploid[i2];
        }
        return jSaneness;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        this.f12703polloi = C.TIME_UNSET;
        boolean z = false;
        for (attabal attabalVar : this.f12702monoploid) {
            if (attabalVar != null) {
                attabalVar.saneness();
            }
        }
        long jSeekToUs = this.f12700kowloon.seekToUs(j);
        if (jSeekToUs == j) {
            z = true;
        } else if (jSeekToUs >= this.f12701molybdenite) {
            long j2 = this.f12699graveside;
            if (j2 == Long.MIN_VALUE || jSeekToUs <= j2) {
                z = true;
            }
        }
        decarock.attabal.competently(z);
        return jSeekToUs;
    }

    @Override // androidx.media3.exoplayer.source.adultoid.attabal
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public void wireman(apical apicalVar) {
        ((apical.attabal) decarock.attabal.marial(this.f12698arytenoidectomy)).wireman(this);
    }
}
