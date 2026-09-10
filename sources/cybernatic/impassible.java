package cybernatic;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DiscardingTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible implements privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f24670attabal = new byte[4096];

    @Override // cybernatic.privatdozent
    public void attabal(decarock.stratoscope stratoscopeVar, int i, int i2) {
        stratoscopeVar.splinterproof(i);
    }

    @Override // cybernatic.privatdozent
    public int beachfront(androidx.media3.common.taiyuan taiyuanVar, int i, boolean z, int i2) throws IOException {
        int i3 = taiyuanVar.read(this.f24670attabal, 0, Math.min(this.f24670attabal.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // cybernatic.privatdozent
    public void dern(androidx.media3.common.polloi polloiVar) {
    }

    @Override // cybernatic.privatdozent
    public void wireman(long j, int i, int i2, int i3, privatdozent.attabal attabalVar) {
    }
}
