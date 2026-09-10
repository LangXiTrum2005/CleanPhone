package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ie {

    public static final class a extends ie {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f14185a;

        public a(double d) {
            super(null);
            this.f14185a = d;
        }

        public final double a() {
            return this.f14185a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.f14185a, ((a) obj).f14185a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f14185a);
        }

        public String toString() {
            return "Fraction(fraction=" + this.f14185a + ")";
        }
    }

    public static final class b extends ie {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14186a;

        public b(long j) {
            super(null);
            this.f14186a = j;
        }

        public final long a() {
            return this.f14186a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f14186a == ((b) obj).f14186a;
        }

        public int hashCode() {
            return Long.hashCode(this.f14186a);
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.j(this.f14186a, "TimeMs(ms=", ")");
        }
    }

    public ie() {
    }

    public /* synthetic */ ie(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
