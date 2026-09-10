package diakinesis;

/* JADX INFO: compiled from: NetworkState.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f25231attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f25232dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f25233saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f25234wireman;

    public saneness(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f25231attabal = z;
        this.f25233saneness = z2;
        this.f25232dern = z3;
        this.f25234wireman = z4;
    }

    public boolean attabal() {
        return this.f25231attabal;
    }

    public boolean dern() {
        return this.f25234wireman;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saneness)) {
            return false;
        }
        saneness sanenessVar = (saneness) obj;
        return this.f25231attabal == sanenessVar.f25231attabal && this.f25233saneness == sanenessVar.f25233saneness && this.f25232dern == sanenessVar.f25232dern && this.f25234wireman == sanenessVar.f25234wireman;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.f25231attabal;
        int i = r0;
        if (this.f25233saneness) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f25232dern) {
            i2 = i + 256;
        }
        return this.f25234wireman ? i2 + 4096 : i2;
    }

    public boolean saneness() {
        return this.f25232dern;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f25231attabal), Boolean.valueOf(this.f25233saneness), Boolean.valueOf(this.f25232dern), Boolean.valueOf(this.f25234wireman));
    }

    public boolean wireman() {
        return this.f25233saneness;
    }
}
