package escorial;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_BatchedLogRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern extends cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<kowloon> f25901attabal;

    public dern(List<kowloon> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f25901attabal = list;
    }

    @Override // escorial.cutely
    public List<kowloon> dern() {
        return this.f25901attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cutely) {
            return this.f25901attabal.equals(((cutely) obj).dern());
        }
        return false;
    }

    public int hashCode() {
        return this.f25901attabal.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f25901attabal + "}";
    }
}
