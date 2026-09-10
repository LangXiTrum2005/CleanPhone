package androidx.work.impl.model;

/* JADX INFO: loaded from: classes.dex */
public class Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f8760b;

    public Preference(String str, long j) {
        this.f8759a = str;
        this.f8760b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.f8759a.equals(preference.f8759a)) {
            return false;
        }
        Long l2 = preference.f8760b;
        Long l3 = this.f8760b;
        if (l3 != null) {
            return l3.equals(l2);
        }
        return l2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f8759a.hashCode() * 31;
        Long l2 = this.f8760b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
