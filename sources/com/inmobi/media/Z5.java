package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f23396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f23397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y6 f23398c;

    public Z5(JSONObject vitals, JSONArray logs, Y6 data) {
        Intrinsics.f(vitals, "vitals");
        Intrinsics.f(logs, "logs");
        Intrinsics.f(data, "data");
        this.f23396a = vitals;
        this.f23397b = logs;
        this.f23398c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z5)) {
            return false;
        }
        Z5 z5 = (Z5) obj;
        return Intrinsics.a(this.f23396a, z5.f23396a) && Intrinsics.a(this.f23397b, z5.f23397b) && Intrinsics.a(this.f23398c, z5.f23398c);
    }

    public final int hashCode() {
        return this.f23398c.hashCode() + ((this.f23397b.hashCode() + (this.f23396a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f23396a + ", logs=" + this.f23397b + ", data=" + this.f23398c + ')';
    }
}
