package androidx.media3.exoplayer;

import com.ironsource.Ua;
import incorrectly.ctenidium;
import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes.dex */
public interface homozygous extends mastfed.saneness {

    /* JADX INFO: compiled from: Renderer.java */
    public interface attabal {
        void attabal();

        void saneness();
    }

    long cord();

    void disable();

    lampshade getCapabilities();

    underbelly getMediaClock();

    String getName();

    int getState();

    ethene.trm getStream();

    int getTrackType();

    void graveside(androidx.media3.common.oilcan oilcanVar);

    boolean hasReadStreamToEnd();

    void impromptu(int i, ctenidium ctenidiumVar, decarock.wireman wiremanVar);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    default long molybdenite(long j, long j2) {
        return Ua.s;
    }

    void preprohormone(libyan libyanVar, androidx.media3.common.polloi[] polloiVarArr, ethene.trm trmVar, long j, boolean z, boolean z2, long j2, long j3, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) throws ExoPlaybackException;

    void render(long j, long j2) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    void start() throws ExoPlaybackException;

    void stop();

    void triweekly(androidx.media3.common.polloi[] polloiVarArr, ethene.trm trmVar, long j, long j2, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) throws ExoPlaybackException;

    default void dern() {
    }

    default void release() {
    }

    default void gintrap(float f, float f2) throws ExoPlaybackException {
    }
}
