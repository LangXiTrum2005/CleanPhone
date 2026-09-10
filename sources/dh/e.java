package dh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Double.compare(2.0d, 2.0d) == 0 && Double.compare(10.0d, 10.0d) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(13) + wi.d.f(7, (Double.hashCode(10.0d) + (Double.hashCode(2.0d) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExtractionRule(minInterval=2.0, maxInterval=10.0, frameCount=7, maxFrameCount=13)";
    }
}
