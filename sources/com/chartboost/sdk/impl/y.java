package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EndpointRepository.EndPoint f15590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EndpointRepository.EndPoint f15591c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15592e;
    public final boolean f;

    public static final class a extends y {
        public static final a g = new a();

        public a() {
            super("Banner", EndpointRepository.EndPoint.BANNER_GET, EndpointRepository.EndPoint.BANNER_SHOW, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }
    }

    public static final class b extends y {
        public static final b g = new b();

        public b() {
            super("Interstitial", EndpointRepository.EndPoint.INTERSTITIAL_GET, EndpointRepository.EndPoint.INTERSTITIAL_SHOW, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }
    }

    public static final class c extends y {
        public static final c g = new c();

        public c() {
            super("Rewarded", EndpointRepository.EndPoint.REWARDED_GET, EndpointRepository.EndPoint.REWARDED_SHOW, false, false, 8, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }
    }

    public y(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z2, boolean z3) {
        this.f15589a = str;
        this.f15590b = endPoint;
        this.f15591c = endPoint2;
        this.d = z2;
        this.f15592e = z3;
        this.f = !z2;
    }

    public final EndpointRepository.EndPoint a() {
        return this.f15590b;
    }

    public final String b() {
        return this.f15589a;
    }

    public final boolean c() {
        return this.d;
    }

    public final EndpointRepository.EndPoint d() {
        return this.f15591c;
    }

    public final boolean e() {
        return this.f;
    }

    public /* synthetic */ y(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? true : z3, null);
    }

    public /* synthetic */ y(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, z2, z3);
    }
}
