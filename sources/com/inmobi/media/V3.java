package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class V3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23294c;

    public V3(int i2, float f, int i3) {
        this.f23292a = i2;
        this.f23293b = i3;
        this.f23294c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3)) {
            return false;
        }
        V3 v3 = (V3) obj;
        return this.f23292a == v3.f23292a && this.f23293b == v3.f23293b && Float.compare(this.f23294c, v3.f23294c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23294c) + androidx.media3.extractor.text.ttml.a.a(this.f23293b, Integer.hashCode(this.f23292a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f23292a + ", height=" + this.f23293b + ", density=" + this.f23294c + ')';
    }
}
