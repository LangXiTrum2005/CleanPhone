package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y3 {

    public static final class a extends y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls) {
            super(null);
            Intrinsics.f(clickTrackingUrls, "clickTrackingUrls");
            this.f15603a = clickTrackingUrls;
        }

        public final List a() {
            return this.f15603a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.a(this.f15603a, ((a) obj).f15603a);
        }

        public int hashCode() {
            return this.f15603a.hashCode();
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.f15603a + ")";
        }
    }

    public static final class b extends y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15604a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List clickTrackingUrls) {
            super(null);
            Intrinsics.f(clickTrackingUrls, "clickTrackingUrls");
            this.f15604a = clickTrackingUrls;
        }

        public final List a() {
            return this.f15604a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.a(this.f15604a, ((b) obj).f15604a);
        }

        public int hashCode() {
            return this.f15604a.hashCode();
        }

        public String toString() {
            return "GeneralClick(clickTrackingUrls=" + this.f15604a + ")";
        }
    }

    public static final class c extends y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15605a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List clickTrackingUrls) {
            super(null);
            Intrinsics.f(clickTrackingUrls, "clickTrackingUrls");
            this.f15605a = clickTrackingUrls;
        }

        public final List a() {
            return this.f15605a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.a(this.f15605a, ((c) obj).f15605a);
        }

        public int hashCode() {
            return this.f15605a.hashCode();
        }

        public String toString() {
            return "VastCompanionClick(clickTrackingUrls=" + this.f15605a + ")";
        }
    }

    public static final class d extends y3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List clickTrackingUrls) {
            super(null);
            Intrinsics.f(clickTrackingUrls, "clickTrackingUrls");
            this.f15606a = clickTrackingUrls;
        }

        public final List a() {
            return this.f15606a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.a(this.f15606a, ((d) obj).f15606a);
        }

        public int hashCode() {
            return this.f15606a.hashCode();
        }

        public String toString() {
            return "VastVideoClick(clickTrackingUrls=" + this.f15606a + ")";
        }
    }

    public y3() {
    }

    public /* synthetic */ y3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
