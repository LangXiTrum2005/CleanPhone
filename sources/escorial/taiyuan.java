package escorial;

/* JADX INFO: compiled from: AutoValue_LogResponse.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan extends arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f25942attabal;

    public taiyuan(long j) {
        this.f25942attabal = j;
    }

    @Override // escorial.arytenoidectomy
    public long dern() {
        return this.f25942attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof arytenoidectomy) && this.f25942attabal == ((arytenoidectomy) obj).dern();
    }

    public int hashCode() {
        long j = this.f25942attabal;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f25942attabal + "}";
    }
}
