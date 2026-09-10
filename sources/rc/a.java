package rc;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49531b;

    public a(ArrayList arrayList, String str) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f49530a = str;
        this.f49531b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f49530a.equals(aVar.f49530a) && this.f49531b.equals(aVar.f49531b);
    }

    public final int hashCode() {
        return this.f49531b.hashCode() ^ ((this.f49530a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f49530a + ", usedDates=" + this.f49531b + "}";
    }
}
