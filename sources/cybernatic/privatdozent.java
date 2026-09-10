package cybernatic;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public interface privatdozent {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24739attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24740dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final byte[] f24741saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24742wireman;

        public attabal(int i, byte[] bArr, int i2, int i3) {
            this.f24739attabal = i;
            this.f24741saneness = bArr;
            this.f24740dern = i2;
            this.f24742wireman = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && attabal.class == obj.getClass()) {
                attabal attabalVar = (attabal) obj;
                if (this.f24739attabal == attabalVar.f24739attabal && this.f24740dern == attabalVar.f24740dern && this.f24742wireman == attabalVar.f24742wireman && Arrays.equals(this.f24741saneness, attabalVar.f24741saneness)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f24739attabal * 31) + Arrays.hashCode(this.f24741saneness)) * 31) + this.f24740dern) * 31) + this.f24742wireman;
        }
    }

    void attabal(decarock.stratoscope stratoscopeVar, int i, int i2);

    int beachfront(androidx.media3.common.taiyuan taiyuanVar, int i, boolean z, int i2) throws IOException;

    void dern(androidx.media3.common.polloi polloiVar);

    default int marial(androidx.media3.common.taiyuan taiyuanVar, int i, boolean z) throws IOException {
        return beachfront(taiyuanVar, i, z, 0);
    }

    default void saneness(decarock.stratoscope stratoscopeVar, int i) {
        attabal(stratoscopeVar, i, 0);
    }

    void wireman(long j, int i, int i2, int i3, attabal attabalVar);
}
