package rajahship;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: SynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes.dex */
public class rotuma implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MediaCodec f36047attabal;

    public rotuma(MediaCodec mediaCodec) {
        this.f36047attabal = mediaCodec;
    }

    @Override // rajahship.competently
    public void attabal(int i, int i2, miliaria.dern dernVar, long j, int i3) {
        this.f36047attabal.queueSecureInputBuffer(i, i2, dernVar.attabal(), j, i3);
    }

    @Override // rajahship.competently
    public void dern(Bundle bundle) {
        this.f36047attabal.setParameters(bundle);
    }

    @Override // rajahship.competently
    public void saneness(int i, int i2, int i3, long j, int i4) {
        this.f36047attabal.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // rajahship.competently
    public void flush() {
    }

    @Override // rajahship.competently
    public void shutdown() {
    }

    @Override // rajahship.competently
    public void start() {
    }

    @Override // rajahship.competently
    public void wireman() {
    }
}
