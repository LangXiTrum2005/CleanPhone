package amount;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently extends sealless.wireman.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4180attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f4181saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    public static final class saneness extends sealless.wireman.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4182attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public byte[] f4183saneness;

        @Override // amount.sealless.wireman.saneness.attabal
        public sealless.wireman.saneness attabal() {
            byte[] bArr;
            String str = this.f4182attabal;
            if (str != null && (bArr = this.f4183saneness) != null) {
                return new competently(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4182attabal == null) {
                sb.append(" filename");
            }
            if (this.f4183saneness == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.wireman.saneness.attabal
        public sealless.wireman.saneness.attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f4182attabal = str;
            return this;
        }

        @Override // amount.sealless.wireman.saneness.attabal
        public sealless.wireman.saneness.attabal saneness(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f4183saneness = bArr;
            return this;
        }
    }

    @Override // amount.sealless.wireman.saneness
    public String dern() {
        return this.f4180attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.wireman.saneness) {
            sealless.wireman.saneness sanenessVar = (sealless.wireman.saneness) obj;
            if (this.f4180attabal.equals(sanenessVar.dern())) {
                if (Arrays.equals(this.f4181saneness, sanenessVar instanceof competently ? ((competently) sanenessVar).f4181saneness : sanenessVar.saneness())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4180attabal.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4181saneness);
    }

    @Override // amount.sealless.wireman.saneness
    public byte[] saneness() {
        return this.f4181saneness;
    }

    public String toString() {
        return "File{filename=" + this.f4180attabal + ", contents=" + Arrays.toString(this.f4181saneness) + "}";
    }

    public competently(String str, byte[] bArr) {
        this.f4180attabal = str;
        this.f4181saneness = bArr;
    }
}
