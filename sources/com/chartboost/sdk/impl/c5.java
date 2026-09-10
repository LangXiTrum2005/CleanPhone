package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13581c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13583b;

    public static final class a {
        public a() {
        }

        public final c5 a(JSONObject jsonObject) {
            Intrinsics.f(jsonObject, "jsonObject");
            return new c5(jsonObject.optLong("duration", 30L), jsonObject.optLong("delay"));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c5(long j, long j2) {
        this.f13582a = j;
        this.f13583b = j2;
    }

    public final long a() {
        return this.f13583b;
    }

    public final long b() {
        return this.f13582a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return this.f13582a == c5Var.f13582a && this.f13583b == c5Var.f13583b;
    }

    public int hashCode() {
        return Long.hashCode(this.f13583b) + (Long.hashCode(this.f13582a) * 31);
    }

    public String toString() {
        return android.support.v4.media.a.j(this.f13583b, ")", android.support.v4.media.a.v(this.f13582a, "Countdown(duration=", ", delay="));
    }
}
