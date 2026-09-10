package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;

/* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class rotuma implements apical, apical.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long f12692arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final apical f12693kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public apical.attabal f12694monoploid;

    /* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
    public static final class attabal implements trm {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final trm f12695attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f12696saneness;

        public attabal(trm trmVar, long j) {
            this.f12695attabal = trmVar;
            this.f12696saneness = j;
        }

        @Override // ethene.trm
        public int attabal(empress empressVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int iAttabal = this.f12695attabal.attabal(empressVar, decoderInputBuffer, i);
            if (iAttabal == -4) {
                decoderInputBuffer.f11480graveside += this.f12696saneness;
            }
            return iAttabal;
        }

        @Override // ethene.trm
        public boolean isReady() {
            return this.f12695attabal.isReady();
        }

        @Override // ethene.trm
        public void maybeThrowError() throws IOException {
            this.f12695attabal.maybeThrowError();
        }

        public trm saneness() {
            return this.f12695attabal;
        }

        @Override // ethene.trm
        public int skipData(long j) {
            return this.f12695attabal.skipData(j - this.f12696saneness);
        }
    }

    public rotuma(apical apicalVar, long j) {
        this.f12693kowloon = apicalVar;
        this.f12692arytenoidectomy = j;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        return this.f12693kowloon.attabal(sensatoryVar.attabal().beachfront(sensatoryVar.f12396attabal - this.f12692arytenoidectomy).wireman());
    }

    public apical beachfront() {
        return this.f12693kowloon;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        this.f12694monoploid = attabalVar;
        this.f12693kowloon.competently(this, j - this.f12692arytenoidectomy);
    }

    @Override // androidx.media3.exoplayer.source.apical.attabal
    public void dern(apical apicalVar) {
        ((apical.attabal) decarock.attabal.marial(this.f12694monoploid)).dern(this);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
        this.f12693kowloon.discardBuffer(j - this.f12692arytenoidectomy, z);
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f12693kowloon.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f12692arytenoidectomy;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f12693kowloon.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f12692arytenoidectomy;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return this.f12693kowloon.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.adultoid.attabal
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public void wireman(apical apicalVar) {
        ((apical.attabal) decarock.attabal.marial(this.f12694monoploid)).wireman(this);
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        return this.f12693kowloon.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        return this.f12693kowloon.marial(j - this.f12692arytenoidectomy, moletVar) + this.f12692arytenoidectomy;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() throws IOException {
        this.f12693kowloon.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        long discontinuity = this.f12693kowloon.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f12692arytenoidectomy;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
        this.f12693kowloon.reevaluateBuffer(j - this.f12692arytenoidectomy);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        trm[] trmVarArr2 = new trm[trmVarArr.length];
        int i = 0;
        while (true) {
            trm trmVarSaneness = null;
            if (i >= trmVarArr.length) {
                break;
            }
            attabal attabalVar = (attabal) trmVarArr[i];
            if (attabalVar != null) {
                trmVarSaneness = attabalVar.saneness();
            }
            trmVarArr2[i] = trmVarSaneness;
            i++;
        }
        long jSaneness = this.f12693kowloon.saneness(rotumaVarArr, zArr, trmVarArr2, zArr2, j - this.f12692arytenoidectomy);
        for (int i2 = 0; i2 < trmVarArr.length; i2++) {
            trm trmVar = trmVarArr2[i2];
            if (trmVar == null) {
                trmVarArr[i2] = null;
            } else {
                trm trmVar2 = trmVarArr[i2];
                if (trmVar2 == null || ((attabal) trmVar2).saneness() != trmVar) {
                    trmVarArr[i2] = new attabal(trmVar, this.f12692arytenoidectomy);
                }
            }
        }
        return jSaneness + this.f12692arytenoidectomy;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        return this.f12693kowloon.seekToUs(j - this.f12692arytenoidectomy) + this.f12692arytenoidectomy;
    }
}
