package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13584c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13586b;

    public static final class a {
        public a() {
        }

        public final c6 a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new c6(jSONObject.getInt("w"), jSONObject.getInt(com.smartdigimkt.m3.h.f36614b));
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c6(int i2, int i3) {
        this.f13585a = i2;
        this.f13586b = i3;
    }

    public final int a() {
        return this.f13586b;
    }

    public final int b() {
        return this.f13585a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return this.f13585a == c6Var.f13585a && this.f13586b == c6Var.f13586b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13586b) + (Integer.hashCode(this.f13585a) * 31);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.e(this.f13585a, this.f13586b, "Dimensions(width=", ", height=", ")");
    }
}
