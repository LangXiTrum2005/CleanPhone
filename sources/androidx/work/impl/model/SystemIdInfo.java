package androidx.work.impl.model;

/* JADX INFO: loaded from: classes.dex */
public class SystemIdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8764b;

    public SystemIdInfo(String str, int i2) {
        this.f8763a = str;
        this.f8764b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.f8764b != systemIdInfo.f8764b) {
            return false;
        }
        return this.f8763a.equals(systemIdInfo.f8763a);
    }

    public final int hashCode() {
        return (this.f8763a.hashCode() * 31) + this.f8764b;
    }
}
