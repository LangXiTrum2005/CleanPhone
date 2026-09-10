package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22881c;

    public I3(long j, long j2, long j3) {
        this.f22879a = j;
        this.f22880b = j2;
        this.f22881c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I3)) {
            return false;
        }
        I3 i3 = (I3) obj;
        return this.f22879a == i3.f22879a && this.f22880b == i3.f22880b && this.f22881c == i3.f22881c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22881c) + androidx.media3.extractor.text.ttml.a.b(Long.hashCode(this.f22879a) * 31, 31, this.f22880b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceMemoryInfo(maxHeapSize=");
        sb.append(this.f22879a);
        sb.append(", freeHeapSize=");
        sb.append(this.f22880b);
        sb.append(", currentHeapSize=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.f22881c, ')');
    }
}
