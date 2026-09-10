package com.chartboost.sdk.impl;

import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15558i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15561c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15562e;
    public final long f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f15563h;

    public static final class a {
        public a() {
        }

        public final xi a(JSONObject config) {
            Intrinsics.f(config, "config");
            long jOptLong = config.optLong("maxBytes", 52428800L);
            int iOptInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int iOptInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long jOptLong2 = config.optLong("timeWindow", 18000L);
            long jOptLong3 = config.optLong("timeWindowCellular", 18000L);
            long jOptLong4 = config.optLong("ttl", TelemetryConfig.DEFAULT_EVENT_TTL_SEC);
            int iOptInt3 = config.optInt("bufferSize", 3);
            String strOptString = config.optString("videoPlayer", yi.f15665a);
            b.a aVar = b.f15564c;
            Intrinsics.c(strOptString);
            return new xi(jOptLong, iOptInt, iOptInt2, jOptLong2, jOptLong3, jOptLong4, iOptInt3, aVar.a(strOptString));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum b {
        EXO_PLAYER("exoplayer"),
        MEDIA_PLAYER("mediaplayer");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15566b;
        public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15564c = new a(null);

        public static final class a {
            public a() {
            }

            public final b a(String value) {
                Object next;
                Intrinsics.f(value, "value");
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((b) next).c(), value));
                b bVar = (b) next;
                return bVar == null ? b.EXO_PLAYER : bVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        b(String str) {
            this.f15566b = str;
        }

        public static EnumEntries b() {
            return g;
        }

        public final String c() {
            return this.f15566b;
        }
    }

    public xi(long j, int i2, int i3, long j2, long j3, long j4, int i4, b videoPlayer) {
        Intrinsics.f(videoPlayer, "videoPlayer");
        this.f15559a = j;
        this.f15560b = i2;
        this.f15561c = i3;
        this.d = j2;
        this.f15562e = j3;
        this.f = j4;
        this.g = i4;
        this.f15563h = videoPlayer;
    }

    public final int a() {
        return this.g;
    }

    public final long b() {
        return this.f15559a;
    }

    public final int c() {
        return this.f15560b;
    }

    public final int d() {
        return this.f15561c;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return this.f15559a == xiVar.f15559a && this.f15560b == xiVar.f15560b && this.f15561c == xiVar.f15561c && this.d == xiVar.d && this.f15562e == xiVar.f15562e && this.f == xiVar.f && this.g == xiVar.g && this.f15563h == xiVar.f15563h;
    }

    public final long f() {
        return this.f15562e;
    }

    public final long g() {
        return this.f;
    }

    public final b h() {
        return this.f15563h;
    }

    public int hashCode() {
        return this.f15563h.hashCode() + androidx.media3.extractor.text.ttml.a.a(this.g, androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.f15561c, androidx.media3.extractor.text.ttml.a.a(this.f15560b, Long.hashCode(this.f15559a) * 31, 31), 31), 31, this.d), 31, this.f15562e), 31, this.f), 31);
    }

    public String toString() {
        long j = this.f15559a;
        int i2 = this.f15560b;
        int i3 = this.f15561c;
        long j2 = this.d;
        long j3 = this.f15562e;
        long j4 = this.f;
        int i4 = this.g;
        b bVar = this.f15563h;
        StringBuilder sb = new StringBuilder("VideoPreCachingModel(maxBytes=");
        sb.append(j);
        sb.append(", maxUnitsPerTimeWindow=");
        sb.append(i2);
        sb.append(", maxUnitsPerTimeWindowCellular=");
        sb.append(i3);
        sb.append(", timeWindow=");
        sb.append(j2);
        androidx.datastore.preferences.protobuf.a.A(sb, ", timeWindowCellular=", j3, ", ttl=");
        sb.append(j4);
        sb.append(", bufferSize=");
        sb.append(i4);
        sb.append(", videoPlayer=");
        sb.append(bVar);
        sb.append(")");
        return sb.toString();
    }

    public static final xi a(JSONObject jSONObject) {
        return f15558i.a(jSONObject);
    }

    public /* synthetic */ xi(long j, int i2, int i3, long j2, long j3, long j4, int i4, b bVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 52428800L : j, (i5 & 2) != 0 ? 10 : i2, (i5 & 4) == 0 ? i3 : 10, (i5 & 8) != 0 ? 18000L : j2, (i5 & 16) == 0 ? j3 : 18000L, (i5 & 32) != 0 ? TelemetryConfig.DEFAULT_EVENT_TTL_SEC : j4, (i5 & 64) != 0 ? 3 : i4, (i5 & 128) != 0 ? b.EXO_PLAYER : bVar);
    }
}
