package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh f13610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13612c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mediation f13613e;
    public final b f;
    public ug g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13615i;
    public long j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f13616l;

    public enum a {
        LOW,
        HIGH;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13619e = EnumEntriesKt.a(a());
    }

    public enum b {
        INFO,
        CRITICAL,
        ERROR;

        public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());
    }

    public ch(fh fhVar, String str, String str2, String str3, Mediation mediation, b bVar, ug ugVar, boolean z2, boolean z3, long j, float f, a aVar) {
        this.f13610a = fhVar;
        this.f13611b = str;
        this.f13612c = str2;
        this.d = str3;
        this.f13613e = mediation;
        this.f = bVar;
        this.g = ugVar;
        this.f13614h = z2;
        this.f13615i = z3;
        this.j = j;
        this.k = f;
        this.f13616l = aVar;
    }

    public final String a() {
        return this.f13612c;
    }

    public final float b() {
        return this.k;
    }

    public final String c() {
        return this.d;
    }

    public final Mediation d() {
        return this.f13613e;
    }

    public final String e() {
        return this.f13611b;
    }

    public final fh f() {
        return this.f13610a;
    }

    public final a g() {
        return this.f13616l;
    }

    public final boolean h() {
        return this.f13615i;
    }

    public final long i() {
        return this.j;
    }

    public final long j() {
        return gg.a(this.j);
    }

    public final ug k() {
        return this.g;
    }

    public final b l() {
        return this.f;
    }

    public final boolean m() {
        return this.f13614h;
    }

    public String toString() {
        String value = this.f13610a.getValue();
        String str = this.f13611b;
        String str2 = this.f13612c;
        String str3 = this.d;
        Mediation mediation = this.f13613e;
        b bVar = this.f;
        ug ugVar = this.g;
        boolean z2 = this.f13614h;
        boolean z3 = this.f13615i;
        long j = this.j;
        float f = this.k;
        a aVar = this.f13616l;
        long j2 = j();
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("TrackingEvent(name=", value, ", message='", str, "', impressionAdType='");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str2, "', location='", str3, "', mediation=");
        sbQ.append(mediation);
        sbQ.append(", type=");
        sbQ.append(bVar);
        sbQ.append(", trackAd=");
        sbQ.append(ugVar);
        sbQ.append(", isLatencyEvent=");
        sbQ.append(z2);
        sbQ.append(", shouldCalculateLatency=");
        sbQ.append(z3);
        sbQ.append(", timestamp=");
        sbQ.append(j);
        sbQ.append(", latency=");
        sbQ.append(f);
        sbQ.append(", priority=");
        sbQ.append(aVar);
        sbQ.append(", timestampInSeconds=");
        sbQ.append(j2);
        sbQ.append(")");
        return sbQ.toString();
    }

    public final void a(float f) {
        this.k = f;
    }

    public final void b(boolean z2) {
        this.f13615i = z2;
    }

    public final void a(boolean z2) {
        this.f13614h = z2;
    }

    public final void a(a aVar) {
        Intrinsics.f(aVar, "<set-?>");
        this.f13616l = aVar;
    }

    public final void a(ug ugVar) {
        this.g = ugVar;
    }

    public /* synthetic */ ch(fh fhVar, String str, String str2, String str3, Mediation mediation, b bVar, ug ugVar, boolean z2, boolean z3, long j, float f, a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fhVar, str, str2, str3, mediation, bVar, (i2 & 64) != 0 ? new ug(null, null, null, null, null, null, null, null, 255, null) : ugVar, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? true : z3, (i2 & 512) != 0 ? System.currentTimeMillis() : j, (i2 & 1024) != 0 ? 0.0f : f, aVar, null);
    }

    public /* synthetic */ ch(fh fhVar, String str, String str2, String str3, Mediation mediation, b bVar, ug ugVar, boolean z2, boolean z3, long j, float f, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fhVar, str, str2, str3, mediation, bVar, ugVar, z2, z3, j, f, aVar);
    }
}
