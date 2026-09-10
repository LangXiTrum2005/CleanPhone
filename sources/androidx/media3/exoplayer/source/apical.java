package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public interface apical extends adultoid {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface attabal extends adultoid.attabal<apical> {
        void dern(apical apicalVar);
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    boolean attabal(sensatory sensatoryVar);

    void competently(attabal attabalVar, long j);

    void discardBuffer(long j, boolean z);

    @Override // androidx.media3.exoplayer.source.adultoid
    long getBufferedPositionUs();

    @Override // androidx.media3.exoplayer.source.adultoid
    long getNextLoadPositionUs();

    restrictive getTrackGroups();

    @Override // androidx.media3.exoplayer.source.adultoid
    boolean isLoading();

    long marial(long j, molet moletVar);

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // androidx.media3.exoplayer.source.adultoid
    void reevaluateBuffer(long j);

    long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j);

    long seekToUs(long j);
}
