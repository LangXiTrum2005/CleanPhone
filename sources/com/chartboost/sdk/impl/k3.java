package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k3 {

    public static final class a extends k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7 f14320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f14321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s7 reason, URL url) {
            super(null);
            Intrinsics.f(reason, "reason");
            Intrinsics.f(url, "url");
            this.f14320a = reason;
            this.f14321b = url;
        }

        public final s7 a() {
            return this.f14320a;
        }

        public final URL b() {
            return this.f14321b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14320a == aVar.f14320a && Intrinsics.a(this.f14321b, aVar.f14321b);
        }

        public int hashCode() {
            return this.f14321b.hashCode() + (this.f14320a.hashCode() * 31);
        }

        public String toString() {
            return "Evicted(reason=" + this.f14320a + ", url=" + this.f14321b + ")";
        }
    }

    public k3() {
    }

    public /* synthetic */ k3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
