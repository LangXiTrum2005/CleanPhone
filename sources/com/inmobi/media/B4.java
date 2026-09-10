package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22718c;
    public final int d;

    public B4(float f, float f2, int i2, int i3) {
        this.f22716a = f;
        this.f22717b = f2;
        this.f22718c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B4)) {
            return false;
        }
        B4 b4 = (B4) obj;
        return Float.compare(this.f22716a, b4.f22716a) == 0 && Float.compare(this.f22717b, b4.f22717b) == 0 && this.f22718c == b4.f22718c && this.d == b4.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f22718c, (Float.hashCode(this.f22717b) + (Float.hashCode(this.f22716a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExposureRectangle(x=");
        sb.append(this.f22716a);
        sb.append(", y=");
        sb.append(this.f22717b);
        sb.append(", width=");
        sb.append(this.f22718c);
        sb.append(", height=");
        return android.support.v4.media.a.p(sb, this.d, ')');
    }
}
