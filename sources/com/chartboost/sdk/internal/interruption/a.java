package com.chartboost.sdk.internal.interruption;

import com.p004ironsource.mediationsdk.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0183a f15852b = new C0183a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15853c = new a("APP_LIFECYCLE");
    public static final a d = new a("AUDIO");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15854e = new a(l.f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15855a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.a$a, reason: collision with other inner class name */
    public static final class C0183a {
        public /* synthetic */ C0183a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f15853c;
        }

        public final a b() {
            return a.d;
        }

        public C0183a() {
        }
    }

    public a(String name) {
        Intrinsics.f(name, "name");
        this.f15855a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.a(this.f15855a, ((a) obj).f15855a);
    }

    public int hashCode() {
        return this.f15855a.hashCode();
    }

    public String toString() {
        return android.support.v4.media.a.n("InterruptionType(name=", this.f15855a, ")");
    }
}
