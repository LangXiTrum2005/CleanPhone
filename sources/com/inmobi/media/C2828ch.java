package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2828ch extends AbstractC2879eh {
    public final int a;
    public final String b;

    public C2828ch(String message, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = i;
        this.b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2828ch)) {
            return false;
        }
        C2828ch c2828ch = (C2828ch) obj;
        return this.a == c2828ch.a && Intrinsics.wireman(this.b, c2828ch.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.a + ", message=" + this.b + ")";
    }
}
