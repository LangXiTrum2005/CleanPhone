package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3116lb extends AbstractC3148nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23789b;

    public C3116lb(String message, int i2) {
        Intrinsics.f(message, "message");
        this.f23788a = i2;
        this.f23789b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3116lb)) {
            return false;
        }
        C3116lb c3116lb = (C3116lb) obj;
        return this.f23788a == c3116lb.f23788a && Intrinsics.a(this.f23789b, c3116lb.f23789b);
    }

    public final int hashCode() {
        return this.f23789b.hashCode() + (Integer.hashCode(this.f23788a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(statusCode=");
        sb.append(this.f23788a);
        sb.append(", message=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f23789b, ')');
    }
}
