package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends sealless.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<sealless.wireman.saneness> f4176attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4177saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    public static final class saneness extends sealless.wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public List<sealless.wireman.saneness> f4178attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4179saneness;

        @Override // amount.sealless.wireman.attabal
        public sealless.wireman attabal() {
            List<sealless.wireman.saneness> list = this.f4178attabal;
            if (list != null) {
                return new beachfront(list, this.f4179saneness);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // amount.sealless.wireman.attabal
        public sealless.wireman.attabal dern(String str) {
            this.f4179saneness = str;
            return this;
        }

        @Override // amount.sealless.wireman.attabal
        public sealless.wireman.attabal saneness(List<sealless.wireman.saneness> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f4178attabal = list;
            return this;
        }
    }

    @Override // amount.sealless.wireman
    public String dern() {
        return this.f4177saneness;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.wireman) {
            sealless.wireman wiremanVar = (sealless.wireman) obj;
            if (this.f4176attabal.equals(wiremanVar.saneness()) && ((str = this.f4177saneness) != null ? str.equals(wiremanVar.dern()) : wiremanVar.dern() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f4176attabal.hashCode() ^ 1000003) * 1000003;
        String str = this.f4177saneness;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // amount.sealless.wireman
    public List<sealless.wireman.saneness> saneness() {
        return this.f4176attabal;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f4176attabal + ", orgId=" + this.f4177saneness + "}";
    }

    public beachfront(List<sealless.wireman.saneness> list, String str) {
        this.f4176attabal = list;
        this.f4177saneness = str;
    }
}
