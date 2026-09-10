package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13696c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f13697e;

    public dh(String str, String str2, int i2, String str3, Map extras) {
        Intrinsics.f(extras, "extras");
        this.f13694a = str;
        this.f13695b = str2;
        this.f13696c = i2;
        this.d = str3;
        this.f13697e = extras;
    }

    public final dh a(String str, String str2, int i2, String str3, Map extras) {
        Intrinsics.f(extras, "extras");
        return new dh(str, str2, i2, str3, extras);
    }

    public final Map b() {
        return this.f13697e;
    }

    public final int c() {
        return this.f13696c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f13695b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return Intrinsics.a(this.f13694a, dhVar.f13694a) && Intrinsics.a(this.f13695b, dhVar.f13695b) && this.f13696c == dhVar.f13696c && Intrinsics.a(this.d, dhVar.d) && Intrinsics.a(this.f13697e, dhVar.f13697e);
    }

    public int hashCode() {
        String str = this.f13694a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13695b;
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f13696c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        return this.f13697e.hashCode() + ((iA + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f13694a;
        String str2 = this.f13695b;
        int i2 = this.f13696c;
        String str3 = this.d;
        Map map = this.f13697e;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("TrackingEvent(event=", str, ", url=", str2, ", level=");
        sbQ.append(i2);
        sbQ.append(", offset=");
        sbQ.append(str3);
        sbQ.append(", extras=");
        sbQ.append(map);
        sbQ.append(")");
        return sbQ.toString();
    }

    public static /* synthetic */ dh a(dh dhVar, String str, String str2, int i2, String str3, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dhVar.f13694a;
        }
        if ((i3 & 2) != 0) {
            str2 = dhVar.f13695b;
        }
        if ((i3 & 4) != 0) {
            i2 = dhVar.f13696c;
        }
        if ((i3 & 8) != 0) {
            str3 = dhVar.d;
        }
        if ((i3 & 16) != 0) {
            map = dhVar.f13697e;
        }
        Map map2 = map;
        int i4 = i2;
        return dhVar.a(str, str2, i4, str3, map2);
    }

    public final String a() {
        return this.f13694a;
    }

    public /* synthetic */ dh(String str, String str2, int i2, String str3, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? EmptyMap.X : map);
    }
}
