package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14390c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14392b;

    public static final class a {
        public a() {
        }

        public final l3 a(String content) {
            Object next;
            Object next2;
            Intrinsics.f(content, "content");
            try {
                List listV = SequencesKt.v(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(content));
                Iterator it = listV.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!StringsKt.M((String) next, "url=", false));
                String str = (String) next;
                Iterator it2 = listV.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!StringsKt.M((String) next2, "expiry=", false));
                String str2 = (String) next2;
                if (str != null && str2 != null) {
                    String strSubstring = str.substring(4);
                    Intrinsics.e(strSubstring, "substring(...)");
                    String strSubstring2 = str2.substring(7);
                    Intrinsics.e(strSubstring2, "substring(...)");
                    Long lZ = StringsKt.Z(strSubstring2);
                    if (lZ != null) {
                        return new l3(strSubstring, lZ.longValue());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l3(String originalUrl, long j) {
        Intrinsics.f(originalUrl, "originalUrl");
        this.f14391a = originalUrl;
        this.f14392b = j;
    }

    public final long a() {
        return this.f14392b;
    }

    public final String b() {
        return this.f14391a;
    }

    public final String c() {
        return "url=" + this.f14391a + "\nexpiry=" + this.f14392b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Intrinsics.a(this.f14391a, l3Var.f14391a) && this.f14392b == l3Var.f14392b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14392b) + (this.f14391a.hashCode() * 31);
    }

    public String toString() {
        return "CacheMetadata(originalUrl=" + this.f14391a + ", expiryTimestampMillis=" + this.f14392b + ")";
    }
}
