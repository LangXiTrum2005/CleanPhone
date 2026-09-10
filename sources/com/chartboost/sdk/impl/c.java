package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ba f13548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ba inLine) {
            super(null);
            Intrinsics.f(inLine, "inLine");
            this.f13547a = str;
            this.f13548b = inLine;
        }

        public final a a(String str, ba inLine) {
            Intrinsics.f(inLine, "inLine");
            return new a(str, inLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f13547a, aVar.f13547a) && Intrinsics.a(this.f13548b, aVar.f13548b);
        }

        public int hashCode() {
            String str = this.f13547a;
            return this.f13548b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "InLineAd(id=" + this.f13547a + ", inLine=" + this.f13548b + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, ba baVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f13547a;
            }
            if ((i2 & 2) != 0) {
                baVar = aVar.f13548b;
            }
            return aVar.a(str, baVar);
        }

        public final ba a() {
            return this.f13548b;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ek f13550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ek wrapper) {
            super(null);
            Intrinsics.f(wrapper, "wrapper");
            this.f13549a = str;
            this.f13550b = wrapper;
        }

        public final ek a() {
            return this.f13550b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.f13549a, bVar.f13549a) && Intrinsics.a(this.f13550b, bVar.f13550b);
        }

        public int hashCode() {
            String str = this.f13549a;
            return this.f13550b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "WrapperAd(id=" + this.f13549a + ", wrapper=" + this.f13550b + ")";
        }
    }

    public c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
