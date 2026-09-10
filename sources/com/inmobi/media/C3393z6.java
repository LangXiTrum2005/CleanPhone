package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3393z6 extends C6 {
    public final short a;

    public C3393z6(short s) {
        this.a = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3393z6) && this.a == ((C3393z6) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.a) + ")";
    }
}
