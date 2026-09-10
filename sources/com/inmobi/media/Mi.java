package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Mi {
    public final int a;
    public final int b;
    public final int c;

    public Mi(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mi)) {
            return false;
        }
        Mi mi = (Mi) obj;
        return this.a == mi.a && this.b == mi.b && this.c == mi.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + AbstractC2906fi.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.a + ", minor=" + this.b + ", patch=" + this.c + ")";
    }
}
