package escorial;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_ExperimentIds.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman extends apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f25943attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f25944saneness;

    /* JADX INFO: compiled from: AutoValue_ExperimentIds.java */
    public static final class saneness extends apical.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public byte[] f25945attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public byte[] f25946saneness;

        @Override // escorial.apical.attabal
        public apical attabal() {
            return new wireman(this.f25945attabal, this.f25946saneness);
        }

        @Override // escorial.apical.attabal
        public apical.attabal dern(byte[] bArr) {
            this.f25946saneness = bArr;
            return this;
        }

        @Override // escorial.apical.attabal
        public apical.attabal saneness(byte[] bArr) {
            this.f25945attabal = bArr;
            return this;
        }
    }

    @Override // escorial.apical
    public byte[] dern() {
        return this.f25944saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apical) {
            apical apicalVar = (apical) obj;
            boolean z = apicalVar instanceof wireman;
            if (Arrays.equals(this.f25943attabal, z ? ((wireman) apicalVar).f25943attabal : apicalVar.saneness())) {
                if (Arrays.equals(this.f25944saneness, z ? ((wireman) apicalVar).f25944saneness : apicalVar.dern())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f25943attabal) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25944saneness);
    }

    @Override // escorial.apical
    public byte[] saneness() {
        return this.f25943attabal;
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f25943attabal) + ", encryptedBlob=" + Arrays.toString(this.f25944saneness) + "}";
    }

    public wireman(byte[] bArr, byte[] bArr2) {
        this.f25943attabal = bArr;
        this.f25944saneness = bArr2;
    }
}
