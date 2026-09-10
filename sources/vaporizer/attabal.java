package vaporizer;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_BackendRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal extends marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Iterable<lehua.taiyuan> f39277attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f39278saneness;

    /* JADX INFO: compiled from: AutoValue_BackendRequest.java */
    public static final class saneness extends marial.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Iterable<lehua.taiyuan> f39279attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public byte[] f39280saneness;

        @Override // vaporizer.marial.attabal
        public marial attabal() {
            String str = "";
            if (this.f39279attabal == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new attabal(this.f39279attabal, this.f39280saneness);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // vaporizer.marial.attabal
        public marial.attabal dern(byte[] bArr) {
            this.f39280saneness = bArr;
            return this;
        }

        @Override // vaporizer.marial.attabal
        public marial.attabal saneness(Iterable<lehua.taiyuan> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f39279attabal = iterable;
            return this;
        }
    }

    @Override // vaporizer.marial
    public byte[] dern() {
        return this.f39278saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof marial) {
            marial marialVar = (marial) obj;
            if (this.f39277attabal.equals(marialVar.saneness())) {
                if (Arrays.equals(this.f39278saneness, marialVar instanceof attabal ? ((attabal) marialVar).f39278saneness : marialVar.dern())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f39277attabal.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39278saneness);
    }

    @Override // vaporizer.marial
    public Iterable<lehua.taiyuan> saneness() {
        return this.f39277attabal;
    }

    public String toString() {
        return "BackendRequest{events=" + this.f39277attabal + ", extras=" + Arrays.toString(this.f39278saneness) + "}";
    }

    public attabal(Iterable<lehua.taiyuan> iterable, byte[] bArr) {
        this.f39277attabal = iterable;
        this.f39278saneness = bArr;
    }
}
