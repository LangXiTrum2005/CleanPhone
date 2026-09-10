package com.ironsource;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f26831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f26833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f26834d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f26835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f26836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f26837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f26838d;

        /* JADX INFO: renamed from: com.ironsource.P3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public interface InterfaceC0043a {
            List<e> a();
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b implements InterfaceC0043a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<e> f26839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Integer f26840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Long f26841c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final c.C0046c f26842d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Integer f26843e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Boolean f26844f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Long f26845g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Boolean f26846h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final JSONObject f26847i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Boolean f26848j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final Integer f26849k;
            private final Integer l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final Integer f26850m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final f f26851n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final Boolean A() {
                return this.f26846h;
            }

            public final Boolean B() {
                return this.f26848j;
            }

            public final b a(List<e> list, Integer num, Long l, c.C0046c c0046c, Integer num2, Boolean bool, Long l10, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                return new b(list, num, l, c0046c, num2, bool, l10, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            public final List<e> b() {
                return this.f26839a;
            }

            public final Boolean c() {
                return this.f26848j;
            }

            public final Integer d() {
                return this.f26849k;
            }

            public final Integer e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.n.a(this.f26839a, bVar.f26839a) && kotlin.jvm.internal.n.a(this.f26840b, bVar.f26840b) && kotlin.jvm.internal.n.a(this.f26841c, bVar.f26841c) && kotlin.jvm.internal.n.a(this.f26842d, bVar.f26842d) && kotlin.jvm.internal.n.a(this.f26843e, bVar.f26843e) && kotlin.jvm.internal.n.a(this.f26844f, bVar.f26844f) && kotlin.jvm.internal.n.a(this.f26845g, bVar.f26845g) && kotlin.jvm.internal.n.a(this.f26846h, bVar.f26846h) && kotlin.jvm.internal.n.a(this.f26847i, bVar.f26847i) && kotlin.jvm.internal.n.a(this.f26848j, bVar.f26848j) && kotlin.jvm.internal.n.a(this.f26849k, bVar.f26849k) && kotlin.jvm.internal.n.a(this.l, bVar.l) && kotlin.jvm.internal.n.a(this.f26850m, bVar.f26850m) && kotlin.jvm.internal.n.a(this.f26851n, bVar.f26851n);
            }

            public final Integer f() {
                return this.f26850m;
            }

            public final f g() {
                return this.f26851n;
            }

            public final Integer h() {
                return this.f26840b;
            }

            public int hashCode() {
                List<e> list = this.f26839a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.f26840b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.f26841c;
                int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C0046c c0046c = this.f26842d;
                int iHashCode4 = (iHashCode3 + (c0046c == null ? 0 : c0046c.hashCode())) * 31;
                Integer num2 = this.f26843e;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f26844f;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l10 = this.f26845g;
                int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
                Boolean bool2 = this.f26846h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f26847i;
                int iHashCode9 = (iHashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.f26848j;
                int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.f26849k;
                int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.l;
                int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f26850m;
                int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.f26851n;
                return iHashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Long i() {
                return this.f26841c;
            }

            public final c.C0046c j() {
                return this.f26842d;
            }

            public final Integer k() {
                return this.f26843e;
            }

            public final Boolean l() {
                return this.f26844f;
            }

            public final Long m() {
                return this.f26845g;
            }

            public final Boolean n() {
                return this.f26846h;
            }

            public final JSONObject o() {
                return this.f26847i;
            }

            public final JSONObject p() {
                return this.f26847i;
            }

            public final Integer q() {
                return this.f26850m;
            }

            public final Integer r() {
                return this.l;
            }

            public final Long s() {
                return this.f26841c;
            }

            public final Integer t() {
                return this.f26843e;
            }

            public String toString() {
                return "Banner(placements=" + this.f26839a + ", maxNumOfAdaptersToLoadOnStart=" + this.f26840b + ", atim=" + this.f26841c + ", events=" + this.f26842d + ", bannerInterval=" + this.f26843e + ", collectBiddingDataAsyncEnabled=" + this.f26844f + ", collectBiddingDataTimeout=" + this.f26845g + ", sharedManagersThread=" + this.f26846h + ", adUnits=" + this.f26847i + ", isOneFlow=" + this.f26848j + ", delayLoadFailure=" + this.f26849k + ", advancedLoading=" + this.l + ", adapterTimeOutInSeconds=" + this.f26850m + ", providers=" + this.f26851n + ")";
            }

            public final Boolean u() {
                return this.f26844f;
            }

            public final Long v() {
                return this.f26845g;
            }

            public final Integer w() {
                return this.f26849k;
            }

            public final c.C0046c x() {
                return this.f26842d;
            }

            public final Integer y() {
                return this.f26840b;
            }

            public final f z() {
                return this.f26851n;
            }

            public b(List<e> list, Integer num, Long l, c.C0046c c0046c, Integer num2, Boolean bool, Long l10, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                this.f26839a = list;
                this.f26840b = num;
                this.f26841c = l;
                this.f26842d = c0046c;
                this.f26843e = num2;
                this.f26844f = bool;
                this.f26845g = l10;
                this.f26846h = bool2;
                this.f26847i = jSONObject;
                this.f26848j = bool3;
                this.f26849k = num3;
                this.l = num4;
                this.f26850m = num5;
                this.f26851n = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0043a
            public List<e> a() {
                return this.f26839a;
            }

            public /* synthetic */ b(List list, Integer num, Long l, c.C0046c c0046c, Integer num2, Boolean bool, Long l10, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : l, (i10 & 8) != 0 ? null : c0046c, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : l10, (i10 & 128) != 0 ? null : bool2, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : jSONObject, (i10 & 512) != 0 ? null : bool3, (i10 & 1024) != 0 ? null : num3, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : num4, (i10 & 4096) != 0 ? null : num5, (i10 & Segment.SIZE) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class c implements InterfaceC0043a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<e> f26852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c.C0046c f26853b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Integer f26854c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Integer f26855d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Integer f26856e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Boolean f26857f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Long f26858g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Boolean f26859h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final JSONObject f26860i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Integer f26861j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final Integer f26862k;
            private final Boolean l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final Integer f26863m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Integer f26864n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final f f26865o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            public final Integer A() {
                return this.f26863m;
            }

            public final f B() {
                return this.f26865o;
            }

            public final Boolean C() {
                return this.f26859h;
            }

            public final Boolean D() {
                return this.l;
            }

            public final c a(List<e> list, c.C0046c c0046c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                return new c(list, c0046c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            public final List<e> b() {
                return this.f26852a;
            }

            public final Integer c() {
                return this.f26861j;
            }

            public final Integer d() {
                return this.f26862k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.n.a(this.f26852a, cVar.f26852a) && kotlin.jvm.internal.n.a(this.f26853b, cVar.f26853b) && kotlin.jvm.internal.n.a(this.f26854c, cVar.f26854c) && kotlin.jvm.internal.n.a(this.f26855d, cVar.f26855d) && kotlin.jvm.internal.n.a(this.f26856e, cVar.f26856e) && kotlin.jvm.internal.n.a(this.f26857f, cVar.f26857f) && kotlin.jvm.internal.n.a(this.f26858g, cVar.f26858g) && kotlin.jvm.internal.n.a(this.f26859h, cVar.f26859h) && kotlin.jvm.internal.n.a(this.f26860i, cVar.f26860i) && kotlin.jvm.internal.n.a(this.f26861j, cVar.f26861j) && kotlin.jvm.internal.n.a(this.f26862k, cVar.f26862k) && kotlin.jvm.internal.n.a(this.l, cVar.l) && kotlin.jvm.internal.n.a(this.f26863m, cVar.f26863m) && kotlin.jvm.internal.n.a(this.f26864n, cVar.f26864n) && kotlin.jvm.internal.n.a(this.f26865o, cVar.f26865o);
            }

            public final Integer f() {
                return this.f26863m;
            }

            public final Integer g() {
                return this.f26864n;
            }

            public final f h() {
                return this.f26865o;
            }

            public int hashCode() {
                List<e> list = this.f26852a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0046c c0046c = this.f26853b;
                int iHashCode2 = (iHashCode + (c0046c == null ? 0 : c0046c.hashCode())) * 31;
                Integer num = this.f26854c;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f26855d;
                int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f26856e;
                int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f26857f;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f26858g;
                int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f26859h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f26860i;
                int iHashCode9 = (iHashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.f26861j;
                int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f26862k;
                int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.l;
                int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.f26863m;
                int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.f26864n;
                int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.f26865o;
                return iHashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final c.C0046c i() {
                return this.f26853b;
            }

            public final Integer j() {
                return this.f26854c;
            }

            public final Integer k() {
                return this.f26855d;
            }

            public final Integer l() {
                return this.f26856e;
            }

            public final Boolean m() {
                return this.f26857f;
            }

            public final Long n() {
                return this.f26858g;
            }

            public final Boolean o() {
                return this.f26859h;
            }

            public final JSONObject p() {
                return this.f26860i;
            }

            public final JSONObject q() {
                return this.f26860i;
            }

            public final Integer r() {
                return this.f26855d;
            }

            public final Integer s() {
                return this.f26862k;
            }

            public final Integer t() {
                return this.f26864n;
            }

            public String toString() {
                return "Interstitial(placements=" + this.f26852a + ", events=" + this.f26853b + ", maxNumOfAdaptersToLoadOnStart=" + this.f26854c + ", adapterTimeOutInSeconds=" + this.f26855d + ", delayLoadFailure=" + this.f26856e + ", collectBiddingDataAsyncEnabled=" + this.f26857f + ", collectBiddingDataTimeout=" + this.f26858g + ", sharedManagersThread=" + this.f26859h + ", adUnits=" + this.f26860i + ", expiredDurationInMinutes=" + this.f26861j + ", advancedLoading=" + this.f26862k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.f26863m + ", atim=" + this.f26864n + ", providers=" + this.f26865o + ")";
            }

            public final Boolean u() {
                return this.f26857f;
            }

            public final Long v() {
                return this.f26858g;
            }

            public final Integer w() {
                return this.f26856e;
            }

            public final c.C0046c x() {
                return this.f26853b;
            }

            public final Integer y() {
                return this.f26861j;
            }

            public final Integer z() {
                return this.f26854c;
            }

            public c(List<e> list, c.C0046c c0046c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                this.f26852a = list;
                this.f26853b = c0046c;
                this.f26854c = num;
                this.f26855d = num2;
                this.f26856e = num3;
                this.f26857f = bool;
                this.f26858g = l;
                this.f26859h = bool2;
                this.f26860i = jSONObject;
                this.f26861j = num4;
                this.f26862k = num5;
                this.l = bool3;
                this.f26863m = num6;
                this.f26864n = num7;
                this.f26865o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0043a
            public List<e> a() {
                return this.f26852a;
            }

            public /* synthetic */ c(List list, c.C0046c c0046c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : c0046c, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : l, (i10 & 128) != 0 ? null : bool2, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : jSONObject, (i10 & 512) != 0 ? null : num4, (i10 & 1024) != 0 ? null : num5, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : bool3, (i10 & 4096) != 0 ? null : num6, (i10 & Segment.SIZE) != 0 ? null : num7, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class d implements InterfaceC0043a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<e> f26866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c.C0046c f26867b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Boolean f26868c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Long f26869d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Boolean f26870e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final JSONObject f26871f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Integer f26872g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Integer f26873h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Integer f26874i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Integer f26875j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final Long f26876k;
            private final f l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            public final d a(List<e> list, c.C0046c c0046c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l10, f fVar) {
                return new d(list, c0046c, bool, l, bool2, jSONObject, num, num2, num3, num4, l10, fVar);
            }

            public final List<e> b() {
                return this.f26866a;
            }

            public final Integer c() {
                return this.f26875j;
            }

            public final Long d() {
                return this.f26876k;
            }

            public final f e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.n.a(this.f26866a, dVar.f26866a) && kotlin.jvm.internal.n.a(this.f26867b, dVar.f26867b) && kotlin.jvm.internal.n.a(this.f26868c, dVar.f26868c) && kotlin.jvm.internal.n.a(this.f26869d, dVar.f26869d) && kotlin.jvm.internal.n.a(this.f26870e, dVar.f26870e) && kotlin.jvm.internal.n.a(this.f26871f, dVar.f26871f) && kotlin.jvm.internal.n.a(this.f26872g, dVar.f26872g) && kotlin.jvm.internal.n.a(this.f26873h, dVar.f26873h) && kotlin.jvm.internal.n.a(this.f26874i, dVar.f26874i) && kotlin.jvm.internal.n.a(this.f26875j, dVar.f26875j) && kotlin.jvm.internal.n.a(this.f26876k, dVar.f26876k) && kotlin.jvm.internal.n.a(this.l, dVar.l);
            }

            public final c.C0046c f() {
                return this.f26867b;
            }

            public final Boolean g() {
                return this.f26868c;
            }

            public final Long h() {
                return this.f26869d;
            }

            public int hashCode() {
                List<e> list = this.f26866a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0046c c0046c = this.f26867b;
                int iHashCode2 = (iHashCode + (c0046c == null ? 0 : c0046c.hashCode())) * 31;
                Boolean bool = this.f26868c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f26869d;
                int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f26870e;
                int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f26871f;
                int iHashCode6 = (iHashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.f26872g;
                int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f26873h;
                int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f26874i;
                int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f26875j;
                int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l10 = this.f26876k;
                int iHashCode11 = (iHashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
                f fVar = this.l;
                return iHashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Boolean i() {
                return this.f26870e;
            }

            public final JSONObject j() {
                return this.f26871f;
            }

            public final Integer k() {
                return this.f26872g;
            }

            public final Integer l() {
                return this.f26873h;
            }

            public final Integer m() {
                return this.f26874i;
            }

            public final JSONObject n() {
                return this.f26871f;
            }

            public final Integer o() {
                return this.f26875j;
            }

            public final Integer p() {
                return this.f26872g;
            }

            public final Long q() {
                return this.f26876k;
            }

            public final Boolean r() {
                return this.f26868c;
            }

            public final Long s() {
                return this.f26869d;
            }

            public final Integer t() {
                return this.f26873h;
            }

            public String toString() {
                return "NativeAd(placements=" + this.f26866a + ", events=" + this.f26867b + ", collectBiddingDataAsyncEnabled=" + this.f26868c + ", collectBiddingDataTimeout=" + this.f26869d + ", sharedManagersThread=" + this.f26870e + ", adUnits=" + this.f26871f + ", advancedLoading=" + this.f26872g + ", delayLoadFailure=" + this.f26873h + ", maxNumOfAdaptersToLoadOnStart=" + this.f26874i + ", adapterTimeOutInSeconds=" + this.f26875j + ", atim=" + this.f26876k + ", providers=" + this.l + ")";
            }

            public final c.C0046c u() {
                return this.f26867b;
            }

            public final Integer v() {
                return this.f26874i;
            }

            public final f w() {
                return this.l;
            }

            public final Boolean x() {
                return this.f26870e;
            }

            public d(List<e> list, c.C0046c c0046c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l10, f fVar) {
                this.f26866a = list;
                this.f26867b = c0046c;
                this.f26868c = bool;
                this.f26869d = l;
                this.f26870e = bool2;
                this.f26871f = jSONObject;
                this.f26872g = num;
                this.f26873h = num2;
                this.f26874i = num3;
                this.f26875j = num4;
                this.f26876k = l10;
                this.l = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, List list, c.C0046c c0046c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l10, f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = dVar.f26866a;
                }
                if ((i10 & 2) != 0) {
                    c0046c = dVar.f26867b;
                }
                if ((i10 & 4) != 0) {
                    bool = dVar.f26868c;
                }
                if ((i10 & 8) != 0) {
                    l = dVar.f26869d;
                }
                if ((i10 & 16) != 0) {
                    bool2 = dVar.f26870e;
                }
                if ((i10 & 32) != 0) {
                    jSONObject = dVar.f26871f;
                }
                if ((i10 & 64) != 0) {
                    num = dVar.f26872g;
                }
                if ((i10 & 128) != 0) {
                    num2 = dVar.f26873h;
                }
                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    num3 = dVar.f26874i;
                }
                if ((i10 & 512) != 0) {
                    num4 = dVar.f26875j;
                }
                if ((i10 & 1024) != 0) {
                    l10 = dVar.f26876k;
                }
                if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                    fVar = dVar.l;
                }
                Long l11 = l10;
                f fVar2 = fVar;
                Integer num5 = num3;
                Integer num6 = num4;
                Integer num7 = num;
                Integer num8 = num2;
                Boolean bool3 = bool2;
                JSONObject jSONObject2 = jSONObject;
                return dVar.a(list, c0046c, bool, l, bool3, jSONObject2, num7, num8, num5, num6, l11, fVar2);
            }

            @Override // com.ironsource.P3.a.InterfaceC0043a
            public List<e> a() {
                return this.f26866a;
            }

            public /* synthetic */ d(List list, c.C0046c c0046c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l10, f fVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : c0046c, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : l, (i10 & 16) != 0 ? null : bool2, (i10 & 32) != 0 ? null : jSONObject, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : num2, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num3, (i10 & 512) != 0 ? null : num4, (i10 & 1024) != 0 ? null : l10, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f26877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f26878b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Boolean f26879c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f26880d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Integer f26881e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Boolean f26882f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final C0044a f26883g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final b f26884h;

            /* JADX INFO: renamed from: com.ironsource.P3$a$e$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class C0044a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Boolean f26885a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f26886b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final Integer f26887c;

                public C0044a() {
                    this(null, null, null, 7, null);
                }

                public final Boolean a() {
                    return this.f26885a;
                }

                public final String b() {
                    return this.f26886b;
                }

                public final Integer c() {
                    return this.f26887c;
                }

                public final Boolean d() {
                    return this.f26885a;
                }

                public final Integer e() {
                    return this.f26887c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0044a)) {
                        return false;
                    }
                    C0044a c0044a = (C0044a) obj;
                    return kotlin.jvm.internal.n.a(this.f26885a, c0044a.f26885a) && kotlin.jvm.internal.n.a(this.f26886b, c0044a.f26886b) && kotlin.jvm.internal.n.a(this.f26887c, c0044a.f26887c);
                }

                public final String f() {
                    return this.f26886b;
                }

                public int hashCode() {
                    Boolean bool = this.f26885a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.f26886b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.f26887c;
                    return iHashCode2 + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Capping(enabled=" + this.f26885a + ", unit=" + this.f26886b + ", maxImpressions=" + this.f26887c + ")";
                }

                public C0044a(Boolean bool, String str, Integer num) {
                    this.f26885a = bool;
                    this.f26886b = str;
                    this.f26887c = num;
                }

                public final C0044a a(Boolean bool, String str, Integer num) {
                    return new C0044a(bool, str, num);
                }

                public static /* synthetic */ C0044a a(C0044a c0044a, Boolean bool, String str, Integer num, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        bool = c0044a.f26885a;
                    }
                    if ((i10 & 2) != 0) {
                        str = c0044a.f26886b;
                    }
                    if ((i10 & 4) != 0) {
                        num = c0044a.f26887c;
                    }
                    return c0044a.a(bool, str, num);
                }

                public /* synthetic */ C0044a(Boolean bool, String str, Integer num, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Boolean f26888a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final Integer f26889b;

                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final Boolean a() {
                    return this.f26888a;
                }

                public final Integer b() {
                    return this.f26889b;
                }

                public final Boolean c() {
                    return this.f26888a;
                }

                public final Integer d() {
                    return this.f26889b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return kotlin.jvm.internal.n.a(this.f26888a, bVar.f26888a) && kotlin.jvm.internal.n.a(this.f26889b, bVar.f26889b);
                }

                public int hashCode() {
                    Boolean bool = this.f26888a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.f26889b;
                    return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Pacing(enabled=" + this.f26888a + ", numOfSeconds=" + this.f26889b + ")";
                }

                public b(Boolean bool, Integer num) {
                    this.f26888a = bool;
                    this.f26889b = num;
                }

                public final b a(Boolean bool, Integer num) {
                    return new b(bool, num);
                }

                public /* synthetic */ b(Boolean bool, Integer num, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : num);
                }

                public static /* synthetic */ b a(b bVar, Boolean bool, Integer num, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        bool = bVar.f26888a;
                    }
                    if ((i10 & 2) != 0) {
                        num = bVar.f26889b;
                    }
                    return bVar.a(bool, num);
                }
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final Integer a() {
                return this.f26877a;
            }

            public final String b() {
                return this.f26878b;
            }

            public final Boolean c() {
                return this.f26879c;
            }

            public final String d() {
                return this.f26880d;
            }

            public final Integer e() {
                return this.f26881e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return kotlin.jvm.internal.n.a(this.f26877a, eVar.f26877a) && kotlin.jvm.internal.n.a(this.f26878b, eVar.f26878b) && kotlin.jvm.internal.n.a(this.f26879c, eVar.f26879c) && kotlin.jvm.internal.n.a(this.f26880d, eVar.f26880d) && kotlin.jvm.internal.n.a(this.f26881e, eVar.f26881e) && kotlin.jvm.internal.n.a(this.f26882f, eVar.f26882f) && kotlin.jvm.internal.n.a(this.f26883g, eVar.f26883g) && kotlin.jvm.internal.n.a(this.f26884h, eVar.f26884h);
            }

            public final Boolean f() {
                return this.f26882f;
            }

            public final C0044a g() {
                return this.f26883g;
            }

            public final b h() {
                return this.f26884h;
            }

            public int hashCode() {
                Integer num = this.f26877a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f26878b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.f26879c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.f26880d;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f26881e;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f26882f;
                int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0044a c0044a = this.f26883g;
                int iHashCode7 = (iHashCode6 + (c0044a == null ? 0 : c0044a.hashCode())) * 31;
                b bVar = this.f26884h;
                return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final C0044a i() {
                return this.f26883g;
            }

            public final Boolean j() {
                return this.f26882f;
            }

            public final b k() {
                return this.f26884h;
            }

            public final Integer l() {
                return this.f26877a;
            }

            public final String m() {
                return this.f26878b;
            }

            public final Integer n() {
                return this.f26881e;
            }

            public final String o() {
                return this.f26880d;
            }

            public final Boolean p() {
                return this.f26879c;
            }

            public String toString() {
                return "Placement(placementId=" + this.f26877a + ", placementName=" + this.f26878b + ", isDefault=" + this.f26879c + ", virtualItemName=" + this.f26880d + ", virtualItemCount=" + this.f26881e + ", delivery=" + this.f26882f + ", capping=" + this.f26883g + ", pacing=" + this.f26884h + ")";
            }

            public e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0044a c0044a, b bVar) {
                this.f26877a = num;
                this.f26878b = str;
                this.f26879c = bool;
                this.f26880d = str2;
                this.f26881e = num2;
                this.f26882f = bool2;
                this.f26883g = c0044a;
                this.f26884h = bVar;
            }

            public final e a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0044a c0044a, b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c0044a, bVar);
            }

            public static /* synthetic */ e a(e eVar, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0044a c0044a, b bVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    num = eVar.f26877a;
                }
                if ((i10 & 2) != 0) {
                    str = eVar.f26878b;
                }
                if ((i10 & 4) != 0) {
                    bool = eVar.f26879c;
                }
                if ((i10 & 8) != 0) {
                    str2 = eVar.f26880d;
                }
                if ((i10 & 16) != 0) {
                    num2 = eVar.f26881e;
                }
                if ((i10 & 32) != 0) {
                    bool2 = eVar.f26882f;
                }
                if ((i10 & 64) != 0) {
                    c0044a = eVar.f26883g;
                }
                if ((i10 & 128) != 0) {
                    bVar = eVar.f26884h;
                }
                C0044a c0044a2 = c0044a;
                b bVar2 = bVar;
                Integer num3 = num2;
                Boolean bool3 = bool2;
                return eVar.a(num, str, bool, str2, num3, bool3, c0044a2, bVar2);
            }

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0044a c0044a, b bVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : bool2, (i10 & 64) != 0 ? null : c0044a, (i10 & 128) != 0 ? null : bVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Boolean f26890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Boolean f26891b;

            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final Boolean a() {
                return this.f26890a;
            }

            public final Boolean b() {
                return this.f26891b;
            }

            public final Boolean c() {
                return this.f26890a;
            }

            public final Boolean d() {
                return this.f26891b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return kotlin.jvm.internal.n.a(this.f26890a, fVar.f26890a) && kotlin.jvm.internal.n.a(this.f26891b, fVar.f26891b);
            }

            public int hashCode() {
                Boolean bool = this.f26890a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.f26891b;
                return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                return "Providers(parallelInit=" + this.f26890a + ", waitUntilAllProvidersFinishInit=" + this.f26891b + ")";
            }

            public f(Boolean bool, Boolean bool2) {
                this.f26890a = bool;
                this.f26891b = bool2;
            }

            public final f a(Boolean bool, Boolean bool2) {
                return new f(bool, bool2);
            }

            public static /* synthetic */ f a(f fVar, Boolean bool, Boolean bool2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = fVar.f26890a;
                }
                if ((i10 & 2) != 0) {
                    bool2 = fVar.f26891b;
                }
                return fVar.a(bool, bool2);
            }

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class g implements InterfaceC0043a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<e> f26892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Integer f26893b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Integer f26894c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Integer f26895d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Integer f26896e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Integer f26897f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Boolean f26898g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Long f26899h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Boolean f26900i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final JSONObject f26901j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final Integer f26902k;
            private final Boolean l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final Integer f26903m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Integer f26904n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final f f26905o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            public final Integer A() {
                return this.f26903m;
            }

            public final f B() {
                return this.f26905o;
            }

            public final Boolean C() {
                return this.f26900i;
            }

            public final Boolean D() {
                return this.l;
            }

            public final g a(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            public final List<e> b() {
                return this.f26892a;
            }

            public final JSONObject c() {
                return this.f26901j;
            }

            public final Integer d() {
                return this.f26902k;
            }

            public final Boolean e() {
                return this.l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return kotlin.jvm.internal.n.a(this.f26892a, gVar.f26892a) && kotlin.jvm.internal.n.a(this.f26893b, gVar.f26893b) && kotlin.jvm.internal.n.a(this.f26894c, gVar.f26894c) && kotlin.jvm.internal.n.a(this.f26895d, gVar.f26895d) && kotlin.jvm.internal.n.a(this.f26896e, gVar.f26896e) && kotlin.jvm.internal.n.a(this.f26897f, gVar.f26897f) && kotlin.jvm.internal.n.a(this.f26898g, gVar.f26898g) && kotlin.jvm.internal.n.a(this.f26899h, gVar.f26899h) && kotlin.jvm.internal.n.a(this.f26900i, gVar.f26900i) && kotlin.jvm.internal.n.a(this.f26901j, gVar.f26901j) && kotlin.jvm.internal.n.a(this.f26902k, gVar.f26902k) && kotlin.jvm.internal.n.a(this.l, gVar.l) && kotlin.jvm.internal.n.a(this.f26903m, gVar.f26903m) && kotlin.jvm.internal.n.a(this.f26904n, gVar.f26904n) && kotlin.jvm.internal.n.a(this.f26905o, gVar.f26905o);
            }

            public final Integer f() {
                return this.f26903m;
            }

            public final Integer g() {
                return this.f26904n;
            }

            public final f h() {
                return this.f26905o;
            }

            public int hashCode() {
                List<e> list = this.f26892a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.f26893b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f26894c;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f26895d;
                int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f26896e;
                int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f26897f;
                int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.f26898g;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f26899h;
                int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f26900i;
                int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f26901j;
                int iHashCode10 = (iHashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.f26902k;
                int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.l;
                int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.f26903m;
                int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.f26904n;
                int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.f26905o;
                return iHashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final Integer i() {
                return this.f26893b;
            }

            public final Integer j() {
                return this.f26894c;
            }

            public final Integer k() {
                return this.f26895d;
            }

            public final Integer l() {
                return this.f26896e;
            }

            public final Integer m() {
                return this.f26897f;
            }

            public final Boolean n() {
                return this.f26898g;
            }

            public final Long o() {
                return this.f26899h;
            }

            public final Boolean p() {
                return this.f26900i;
            }

            public final JSONObject q() {
                return this.f26901j;
            }

            public final Integer r() {
                return this.f26894c;
            }

            public final Integer s() {
                return this.f26896e;
            }

            public final Integer t() {
                return this.f26904n;
            }

            public String toString() {
                return "Rewarded(placements=" + this.f26892a + ", maxNumOfAdaptersToLoadOnStart=" + this.f26893b + ", adapterTimeOutInSeconds=" + this.f26894c + ", loadRVInterval=" + this.f26895d + ", advancedLoading=" + this.f26896e + ", expiredDurationInMinutes=" + this.f26897f + ", collectBiddingDataAsyncEnabled=" + this.f26898g + ", collectBiddingDataTimeout=" + this.f26899h + ", sharedManagersThread=" + this.f26900i + ", adUnits=" + this.f26901j + ", delayLoadFailure=" + this.f26902k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.f26903m + ", atim=" + this.f26904n + ", providers=" + this.f26905o + ")";
            }

            public final Boolean u() {
                return this.f26898g;
            }

            public final Long v() {
                return this.f26899h;
            }

            public final Integer w() {
                return this.f26902k;
            }

            public final Integer x() {
                return this.f26897f;
            }

            public final Integer y() {
                return this.f26895d;
            }

            public final Integer z() {
                return this.f26893b;
            }

            public g(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                this.f26892a = list;
                this.f26893b = num;
                this.f26894c = num2;
                this.f26895d = num3;
                this.f26896e = num4;
                this.f26897f = num5;
                this.f26898g = bool;
                this.f26899h = l;
                this.f26900i = bool2;
                this.f26901j = jSONObject;
                this.f26902k = num6;
                this.l = bool3;
                this.f26903m = num7;
                this.f26904n = num8;
                this.f26905o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0043a
            public List<e> a() {
                return this.f26892a;
            }

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : num4, (i10 & 32) != 0 ? null : num5, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : l, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool2, (i10 & 512) != 0 ? null : jSONObject, (i10 & 1024) != 0 ? null : num6, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : bool3, (i10 & 4096) != 0 ? null : num7, (i10 & Segment.SIZE) != 0 ? null : num8, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : fVar);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final g a() {
            return this.f26835a;
        }

        public final c b() {
            return this.f26836b;
        }

        public final b c() {
            return this.f26837c;
        }

        public final d d() {
            return this.f26838d;
        }

        public final b e() {
            return this.f26837c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f26835a, aVar.f26835a) && kotlin.jvm.internal.n.a(this.f26836b, aVar.f26836b) && kotlin.jvm.internal.n.a(this.f26837c, aVar.f26837c) && kotlin.jvm.internal.n.a(this.f26838d, aVar.f26838d);
        }

        public final c f() {
            return this.f26836b;
        }

        public final d g() {
            return this.f26838d;
        }

        public final g h() {
            return this.f26835a;
        }

        public int hashCode() {
            g gVar = this.f26835a;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.f26836b;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.f26837c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.f26838d;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f26835a + ", interstitial=" + this.f26836b + ", banner=" + this.f26837c + ", nativeAd=" + this.f26838d + ")";
        }

        public a(g gVar, c cVar, b bVar, d dVar) {
            this.f26835a = gVar;
            this.f26836b = cVar;
            this.f26837c = bVar;
            this.f26838d = dVar;
        }

        public final a a(g gVar, c cVar, b bVar, d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        public static /* synthetic */ a a(a aVar, g gVar, c cVar, b bVar, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gVar = aVar.f26835a;
            }
            if ((i10 & 2) != 0) {
                cVar = aVar.f26836b;
            }
            if ((i10 & 4) != 0) {
                bVar = aVar.f26837c;
            }
            if ((i10 & 8) != 0) {
                dVar = aVar.f26838d;
            }
            return aVar.a(gVar, cVar, bVar, dVar);
        }

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i10, kotlin.jvm.internal.g gVar2) {
            this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : bVar, (i10 & 8) != 0 ? null : dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f26906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26907b;

        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.f26906a;
        }

        public final String b() {
            return this.f26907b;
        }

        public final String c() {
            return this.f26907b;
        }

        public final Integer d() {
            return this.f26906a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.n.a(this.f26906a, bVar.f26906a) && kotlin.jvm.internal.n.a(this.f26907b, bVar.f26907b);
        }

        public int hashCode() {
            Integer num = this.f26906a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f26907b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AdQuality(initMode=" + this.f26906a + ", adqInitBlob=" + this.f26907b + ")";
        }

        public b(Integer num, String str) {
            this.f26906a = num;
            this.f26907b = str;
        }

        public final b a(Integer num, String str) {
            return new b(num, str);
        }

        public /* synthetic */ b(Integer num, String str, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ b a(b bVar, Integer num, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = bVar.f26906a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f26907b;
            }
            return bVar.a(num, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f26908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0046c f26909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f26910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f26911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f26912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f26913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final g f26914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d f26915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Boolean f26916i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Boolean f26917j;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f26918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f26919b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f26920c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Integer f26921d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Long f26922e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Integer f26923f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Boolean f26924g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Boolean f26925h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Integer f26926i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Boolean f26927j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final C0045a f26928k;
            private final C0045a l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final C0045a f26929m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final C0045a f26930n;

            /* JADX INFO: renamed from: com.ironsource.P3$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class C0045a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Boolean f26931a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final Integer f26932b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final Boolean f26933c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final Integer f26934d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final Integer f26935e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private final Boolean f26936f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final Boolean f26937g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private final Integer f26938h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private final Integer f26939i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private final Boolean f26940j;

                public C0045a() {
                    this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
                }

                public final Boolean a() {
                    return this.f26931a;
                }

                public final Boolean b() {
                    return this.f26940j;
                }

                public final Integer c() {
                    return this.f26932b;
                }

                public final Boolean d() {
                    return this.f26933c;
                }

                public final Integer e() {
                    return this.f26934d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0045a)) {
                        return false;
                    }
                    C0045a c0045a = (C0045a) obj;
                    return kotlin.jvm.internal.n.a(this.f26931a, c0045a.f26931a) && kotlin.jvm.internal.n.a(this.f26932b, c0045a.f26932b) && kotlin.jvm.internal.n.a(this.f26933c, c0045a.f26933c) && kotlin.jvm.internal.n.a(this.f26934d, c0045a.f26934d) && kotlin.jvm.internal.n.a(this.f26935e, c0045a.f26935e) && kotlin.jvm.internal.n.a(this.f26936f, c0045a.f26936f) && kotlin.jvm.internal.n.a(this.f26937g, c0045a.f26937g) && kotlin.jvm.internal.n.a(this.f26938h, c0045a.f26938h) && kotlin.jvm.internal.n.a(this.f26939i, c0045a.f26939i) && kotlin.jvm.internal.n.a(this.f26940j, c0045a.f26940j);
                }

                public final Integer f() {
                    return this.f26935e;
                }

                public final Boolean g() {
                    return this.f26936f;
                }

                public final Boolean h() {
                    return this.f26937g;
                }

                public int hashCode() {
                    Boolean bool = this.f26931a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.f26932b;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.f26933c;
                    int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.f26934d;
                    int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.f26935e;
                    int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f26936f;
                    int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.f26937g;
                    int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.f26938h;
                    int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.f26939i;
                    int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.f26940j;
                    return iHashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                public final Integer i() {
                    return this.f26938h;
                }

                public final Integer j() {
                    return this.f26939i;
                }

                public final Integer k() {
                    return this.f26934d;
                }

                public final Boolean l() {
                    return this.f26940j;
                }

                public final Integer m() {
                    return this.f26932b;
                }

                public final Boolean n() {
                    return this.f26933c;
                }

                public final Boolean o() {
                    return this.f26931a;
                }

                public final Integer p() {
                    return this.f26938h;
                }

                public final Integer q() {
                    return this.f26935e;
                }

                public final Integer r() {
                    return this.f26939i;
                }

                public final Boolean s() {
                    return this.f26936f;
                }

                public final Boolean t() {
                    return this.f26937g;
                }

                public String toString() {
                    return "AdFormatAuction(programmatic=" + this.f26931a + ", minTimeBeforeFirstAuction=" + this.f26932b + ", objectPerWaterfall=" + this.f26933c + ", auctionRetryInterval=" + this.f26934d + ", timeToWaitBeforeAuction=" + this.f26935e + ", isAuctionOnShowStart=" + this.f26936f + ", isLoadWhileShow=" + this.f26937g + ", timeToDeleteOldWaterfallAfterAuction=" + this.f26938h + ", timeToWaitBeforeLoad=" + this.f26939i + ", enableAuctionFallback=" + this.f26940j + ")";
                }

                public C0045a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    this.f26931a = bool;
                    this.f26932b = num;
                    this.f26933c = bool2;
                    this.f26934d = num2;
                    this.f26935e = num3;
                    this.f26936f = bool3;
                    this.f26937g = bool4;
                    this.f26938h = num4;
                    this.f26939i = num5;
                    this.f26940j = bool5;
                }

                public final C0045a a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    return new C0045a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                public static /* synthetic */ C0045a a(C0045a c0045a, Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        bool = c0045a.f26931a;
                    }
                    if ((i10 & 2) != 0) {
                        num = c0045a.f26932b;
                    }
                    if ((i10 & 4) != 0) {
                        bool2 = c0045a.f26933c;
                    }
                    if ((i10 & 8) != 0) {
                        num2 = c0045a.f26934d;
                    }
                    if ((i10 & 16) != 0) {
                        num3 = c0045a.f26935e;
                    }
                    if ((i10 & 32) != 0) {
                        bool3 = c0045a.f26936f;
                    }
                    if ((i10 & 64) != 0) {
                        bool4 = c0045a.f26937g;
                    }
                    if ((i10 & 128) != 0) {
                        num4 = c0045a.f26938h;
                    }
                    if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                        num5 = c0045a.f26939i;
                    }
                    if ((i10 & 512) != 0) {
                        bool5 = c0045a.f26940j;
                    }
                    Integer num6 = num5;
                    Boolean bool6 = bool5;
                    Boolean bool7 = bool4;
                    Integer num7 = num4;
                    Integer num8 = num3;
                    Boolean bool8 = bool3;
                    return c0045a.a(bool, num, bool2, num2, num8, bool8, bool7, num7, num6, bool6);
                }

                public /* synthetic */ C0045a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : bool3, (i10 & 64) != 0 ? null : bool4, (i10 & 128) != 0 ? null : num4, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num5, (i10 & 512) != 0 ? null : bool5);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final C0045a A() {
                return this.f26928k;
            }

            public final Boolean B() {
                return this.f26927j;
            }

            public final String a() {
                return this.f26918a;
            }

            public final Boolean b() {
                return this.f26927j;
            }

            public final C0045a c() {
                return this.f26928k;
            }

            public final C0045a d() {
                return this.l;
            }

            public final C0045a e() {
                return this.f26929m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.n.a(this.f26918a, aVar.f26918a) && kotlin.jvm.internal.n.a(this.f26919b, aVar.f26919b) && kotlin.jvm.internal.n.a(this.f26920c, aVar.f26920c) && kotlin.jvm.internal.n.a(this.f26921d, aVar.f26921d) && kotlin.jvm.internal.n.a(this.f26922e, aVar.f26922e) && kotlin.jvm.internal.n.a(this.f26923f, aVar.f26923f) && kotlin.jvm.internal.n.a(this.f26924g, aVar.f26924g) && kotlin.jvm.internal.n.a(this.f26925h, aVar.f26925h) && kotlin.jvm.internal.n.a(this.f26926i, aVar.f26926i) && kotlin.jvm.internal.n.a(this.f26927j, aVar.f26927j) && kotlin.jvm.internal.n.a(this.f26928k, aVar.f26928k) && kotlin.jvm.internal.n.a(this.l, aVar.l) && kotlin.jvm.internal.n.a(this.f26929m, aVar.f26929m) && kotlin.jvm.internal.n.a(this.f26930n, aVar.f26930n);
            }

            public final C0045a f() {
                return this.f26930n;
            }

            public final String g() {
                return this.f26919b;
            }

            public final String h() {
                return this.f26920c;
            }

            public int hashCode() {
                String str = this.f26918a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f26919b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f26920c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.f26921d;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.f26922e;
                int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f26923f;
                int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f26924g;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.f26925h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.f26926i;
                int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.f26927j;
                int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C0045a c0045a = this.f26928k;
                int iHashCode11 = (iHashCode10 + (c0045a == null ? 0 : c0045a.hashCode())) * 31;
                C0045a c0045a2 = this.l;
                int iHashCode12 = (iHashCode11 + (c0045a2 == null ? 0 : c0045a2.hashCode())) * 31;
                C0045a c0045a3 = this.f26929m;
                int iHashCode13 = (iHashCode12 + (c0045a3 == null ? 0 : c0045a3.hashCode())) * 31;
                C0045a c0045a4 = this.f26930n;
                return iHashCode13 + (c0045a4 != null ? c0045a4.hashCode() : 0);
            }

            public final Integer i() {
                return this.f26921d;
            }

            public final Long j() {
                return this.f26922e;
            }

            public final Integer k() {
                return this.f26923f;
            }

            public final Boolean l() {
                return this.f26924g;
            }

            public final Boolean m() {
                return this.f26925h;
            }

            public final Integer n() {
                return this.f26926i;
            }

            public final String o() {
                return this.f26918a;
            }

            public final Integer p() {
                return this.f26923f;
            }

            public final Long q() {
                return this.f26922e;
            }

            public final Integer r() {
                return this.f26921d;
            }

            public final String s() {
                return this.f26919b;
            }

            public final C0045a t() {
                return this.f26929m;
            }

            public String toString() {
                String str = this.f26918a;
                String str2 = this.f26919b;
                String str3 = this.f26920c;
                Integer num = this.f26921d;
                Long l = this.f26922e;
                Integer num2 = this.f26923f;
                Boolean bool = this.f26924g;
                Boolean bool2 = this.f26925h;
                Integer num3 = this.f26926i;
                Boolean bool3 = this.f26927j;
                C0045a c0045a = this.f26928k;
                C0045a c0045a2 = this.l;
                C0045a c0045a3 = this.f26929m;
                C0045a c0045a4 = this.f26930n;
                StringBuilder sbV = defpackage.e.v("Auction(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
                sbV.append(str3);
                sbV.append(", auctionTrials=");
                sbV.append(num);
                sbV.append(", auctionTimeout=");
                sbV.append(l);
                sbV.append(", auctionSavedHistory=");
                sbV.append(num2);
                sbV.append(", compressAuctionRequest=");
                sbV.append(bool);
                sbV.append(", compressAuctionResponse=");
                sbV.append(bool2);
                sbV.append(", encryptionVersion=");
                sbV.append(num3);
                sbV.append(", tokenPerAdapter=");
                sbV.append(bool3);
                sbV.append(", rewarded=");
                sbV.append(c0045a);
                sbV.append(", interstitial=");
                sbV.append(c0045a2);
                sbV.append(", banner=");
                sbV.append(c0045a3);
                sbV.append(", nativeAd=");
                sbV.append(c0045a4);
                sbV.append(")");
                return sbV.toString();
            }

            public final Boolean u() {
                return this.f26924g;
            }

            public final Boolean v() {
                return this.f26925h;
            }

            public final Integer w() {
                return this.f26926i;
            }

            public final String x() {
                return this.f26920c;
            }

            public final C0045a y() {
                return this.l;
            }

            public final C0045a z() {
                return this.f26930n;
            }

            public a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0045a c0045a, C0045a c0045a2, C0045a c0045a3, C0045a c0045a4) {
                this.f26918a = str;
                this.f26919b = str2;
                this.f26920c = str3;
                this.f26921d = num;
                this.f26922e = l;
                this.f26923f = num2;
                this.f26924g = bool;
                this.f26925h = bool2;
                this.f26926i = num3;
                this.f26927j = bool3;
                this.f26928k = c0045a;
                this.l = c0045a2;
                this.f26929m = c0045a3;
                this.f26930n = c0045a4;
            }

            public final a a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0045a c0045a, C0045a c0045a2, C0045a c0045a3, C0045a c0045a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0045a, c0045a2, c0045a3, c0045a4);
            }

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0045a c0045a, C0045a c0045a2, C0045a c0045a3, C0045a c0045a4, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : l, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num3, (i10 & 512) != 0 ? null : bool3, (i10 & 1024) != 0 ? null : c0045a, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : c0045a2, (i10 & 4096) != 0 ? null : c0045a3, (i10 & Segment.SIZE) != 0 ? null : c0045a4);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Boolean f26941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f26942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f26943c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Boolean f26944d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Integer f26945e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Boolean f26946f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final List<String> f26947g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public final Boolean a() {
                return this.f26941a;
            }

            public final String b() {
                return this.f26942b;
            }

            public final String c() {
                return this.f26943c;
            }

            public final Boolean d() {
                return this.f26944d;
            }

            public final Integer e() {
                return this.f26945e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.n.a(this.f26941a, bVar.f26941a) && kotlin.jvm.internal.n.a(this.f26942b, bVar.f26942b) && kotlin.jvm.internal.n.a(this.f26943c, bVar.f26943c) && kotlin.jvm.internal.n.a(this.f26944d, bVar.f26944d) && kotlin.jvm.internal.n.a(this.f26945e, bVar.f26945e) && kotlin.jvm.internal.n.a(this.f26946f, bVar.f26946f) && kotlin.jvm.internal.n.a(this.f26947g, bVar.f26947g);
            }

            public final Boolean f() {
                return this.f26946f;
            }

            public final List<String> g() {
                return this.f26947g;
            }

            public final Boolean h() {
                return this.f26941a;
            }

            public int hashCode() {
                Boolean bool = this.f26941a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.f26942b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f26943c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.f26944d;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.f26945e;
                int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f26946f;
                int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.f26947g;
                return iHashCode6 + (list != null ? list.hashCode() : 0);
            }

            public final Boolean i() {
                return this.f26944d;
            }

            public final List<String> j() {
                return this.f26947g;
            }

            public final String k() {
                return this.f26943c;
            }

            public final String l() {
                return this.f26942b;
            }

            public final Boolean m() {
                return this.f26946f;
            }

            public final Integer n() {
                return this.f26945e;
            }

            public String toString() {
                return "CrashReporter(enabled=" + this.f26941a + ", reporterURL=" + this.f26942b + ", reporterKeyword=" + this.f26943c + ", includeANR=" + this.f26944d + ", timeout=" + this.f26945e + ", setIgnoreDebugger=" + this.f26946f + ", keysToInclude=" + this.f26947g + ")";
            }

            public b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                this.f26941a = bool;
                this.f26942b = str;
                this.f26943c = str2;
                this.f26944d = bool2;
                this.f26945e = num;
                this.f26946f = bool3;
                this.f26947g = list;
            }

            public final b a(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ b a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = bVar.f26941a;
                }
                if ((i10 & 2) != 0) {
                    str = bVar.f26942b;
                }
                if ((i10 & 4) != 0) {
                    str2 = bVar.f26943c;
                }
                if ((i10 & 8) != 0) {
                    bool2 = bVar.f26944d;
                }
                if ((i10 & 16) != 0) {
                    num = bVar.f26945e;
                }
                if ((i10 & 32) != 0) {
                    bool3 = bVar.f26946f;
                }
                if ((i10 & 64) != 0) {
                    list = bVar.f26947g;
                }
                Boolean bool4 = bool3;
                List list2 = list;
                Integer num2 = num;
                String str3 = str2;
                return bVar.a(bool, str, str3, bool2, num2, bool4, list2);
            }

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : bool3, (i10 & 64) != 0 ? null : list);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0046c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Boolean f26948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Boolean f26949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Boolean f26950c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Integer f26951d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f26952e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final String f26953f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Integer f26954g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Integer f26955h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Integer f26956i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final List<Integer> f26957j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final List<Integer> f26958k;
            private final List<Integer> l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final List<Integer> f26959m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final JSONObject f26960n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final a f26961o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private final String f26962p;

            /* JADX INFO: renamed from: com.ironsource.P3$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f26963a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final Boolean f26964b;

                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.f26963a;
                }

                public final Boolean b() {
                    return this.f26964b;
                }

                public final Boolean c() {
                    return this.f26964b;
                }

                public final String d() {
                    return this.f26963a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return kotlin.jvm.internal.n.a(this.f26963a, aVar.f26963a) && kotlin.jvm.internal.n.a(this.f26964b, aVar.f26964b);
                }

                public int hashCode() {
                    String str = this.f26963a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.f26964b;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.f26963a + ", pixelEventsEnabled=" + this.f26964b + ")";
                }

                public a(String str, Boolean bool) {
                    this.f26963a = str;
                    this.f26964b = bool;
                }

                public final a a(String str, Boolean bool) {
                    return new a(str, bool);
                }

                public /* synthetic */ a(String str, Boolean bool, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ a a(a aVar, String str, Boolean bool, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = aVar.f26963a;
                    }
                    if ((i10 & 2) != 0) {
                        bool = aVar.f26964b;
                    }
                    return aVar.a(str, bool);
                }
            }

            public C0046c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            }

            public final a A() {
                return this.f26961o;
            }

            public final Boolean B() {
                return this.f26949b;
            }

            public final Boolean C() {
                return this.f26948a;
            }

            public final String D() {
                return this.f26953f;
            }

            public final String E() {
                return this.f26952e;
            }

            public final List<Integer> F() {
                return this.l;
            }

            public final Boolean a() {
                return this.f26948a;
            }

            public final List<Integer> b() {
                return this.f26957j;
            }

            public final List<Integer> c() {
                return this.f26958k;
            }

            public final List<Integer> d() {
                return this.l;
            }

            public final List<Integer> e() {
                return this.f26959m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0046c)) {
                    return false;
                }
                C0046c c0046c = (C0046c) obj;
                return kotlin.jvm.internal.n.a(this.f26948a, c0046c.f26948a) && kotlin.jvm.internal.n.a(this.f26949b, c0046c.f26949b) && kotlin.jvm.internal.n.a(this.f26950c, c0046c.f26950c) && kotlin.jvm.internal.n.a(this.f26951d, c0046c.f26951d) && kotlin.jvm.internal.n.a(this.f26952e, c0046c.f26952e) && kotlin.jvm.internal.n.a(this.f26953f, c0046c.f26953f) && kotlin.jvm.internal.n.a(this.f26954g, c0046c.f26954g) && kotlin.jvm.internal.n.a(this.f26955h, c0046c.f26955h) && kotlin.jvm.internal.n.a(this.f26956i, c0046c.f26956i) && kotlin.jvm.internal.n.a(this.f26957j, c0046c.f26957j) && kotlin.jvm.internal.n.a(this.f26958k, c0046c.f26958k) && kotlin.jvm.internal.n.a(this.l, c0046c.l) && kotlin.jvm.internal.n.a(this.f26959m, c0046c.f26959m) && kotlin.jvm.internal.n.a(this.f26960n, c0046c.f26960n) && kotlin.jvm.internal.n.a(this.f26961o, c0046c.f26961o) && kotlin.jvm.internal.n.a(this.f26962p, c0046c.f26962p);
            }

            public final JSONObject f() {
                return this.f26960n;
            }

            public final a g() {
                return this.f26961o;
            }

            public final String h() {
                return this.f26962p;
            }

            public int hashCode() {
                Boolean bool = this.f26948a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.f26949b;
                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f26950c;
                int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.f26951d;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f26952e;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f26953f;
                int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f26954g;
                int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f26955h;
                int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f26956i;
                int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.f26957j;
                int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.f26958k;
                int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.l;
                int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.f26959m;
                int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.f26960n;
                int iHashCode14 = (iHashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.f26961o;
                int iHashCode15 = (iHashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.f26962p;
                return iHashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            public final Boolean i() {
                return this.f26949b;
            }

            public final Boolean j() {
                return this.f26950c;
            }

            public final Integer k() {
                return this.f26951d;
            }

            public final String l() {
                return this.f26952e;
            }

            public final String m() {
                return this.f26953f;
            }

            public final Integer n() {
                return this.f26954g;
            }

            public final Integer o() {
                return this.f26955h;
            }

            public final Integer p() {
                return this.f26956i;
            }

            public final String q() {
                return this.f26962p;
            }

            public final Integer r() {
                return this.f26954g;
            }

            public final Boolean s() {
                return this.f26950c;
            }

            public final Integer t() {
                return this.f26951d;
            }

            public String toString() {
                Boolean bool = this.f26948a;
                Boolean bool2 = this.f26949b;
                Boolean bool3 = this.f26950c;
                Integer num = this.f26951d;
                String str = this.f26952e;
                String str2 = this.f26953f;
                Integer num2 = this.f26954g;
                Integer num3 = this.f26955h;
                Integer num4 = this.f26956i;
                List<Integer> list = this.f26957j;
                List<Integer> list2 = this.f26958k;
                List<Integer> list3 = this.l;
                List<Integer> list4 = this.f26959m;
                JSONObject jSONObject = this.f26960n;
                a aVar = this.f26961o;
                String str3 = this.f26962p;
                StringBuilder sb2 = new StringBuilder("Events(sendUltraEvents=");
                sb2.append(bool);
                sb2.append(", sendEventsToggle=");
                sb2.append(bool2);
                sb2.append(", eventsCompression=");
                sb2.append(bool3);
                sb2.append(", eventsCompressionLevel=");
                sb2.append(num);
                sb2.append(", serverEventsURL=");
                d5.u.r(sb2, str, ", serverEventsType=", str2, ", backupThreshold=");
                sb2.append(num2);
                sb2.append(", maxNumberOfEvents=");
                sb2.append(num3);
                sb2.append(", maxEventsPerBatch=");
                sb2.append(num4);
                sb2.append(", optOut=");
                sb2.append(list);
                sb2.append(", optIn=");
                sb2.append(list2);
                sb2.append(", triggerEvents=");
                sb2.append(list3);
                sb2.append(", nonConnectivityEvents=");
                sb2.append(list4);
                sb2.append(", genericParams=");
                sb2.append(jSONObject);
                sb2.append(", pixel=");
                sb2.append(aVar);
                sb2.append(", abt=");
                sb2.append(str3);
                sb2.append(")");
                return sb2.toString();
            }

            public final JSONObject u() {
                return this.f26960n;
            }

            public final Integer v() {
                return this.f26956i;
            }

            public final Integer w() {
                return this.f26955h;
            }

            public final List<Integer> x() {
                return this.f26959m;
            }

            public final List<Integer> y() {
                return this.f26958k;
            }

            public final List<Integer> z() {
                return this.f26957j;
            }

            public C0046c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                this.f26948a = bool;
                this.f26949b = bool2;
                this.f26950c = bool3;
                this.f26951d = num;
                this.f26952e = str;
                this.f26953f = str2;
                this.f26954g = num2;
                this.f26955h = num3;
                this.f26956i = num4;
                this.f26957j = list;
                this.f26958k = list2;
                this.l = list3;
                this.f26959m = list4;
                this.f26960n = jSONObject;
                this.f26961o = aVar;
                this.f26962p = str3;
            }

            public final C0046c a(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                return new C0046c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            public /* synthetic */ C0046c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : num2, (i10 & 128) != 0 ? null : num3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num4, (i10 & 512) != 0 ? null : list, (i10 & 1024) != 0 ? null : list2, (i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? null : list3, (i10 & 4096) != 0 ? null : list4, (i10 & Segment.SIZE) != 0 ? null : jSONObject, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : aVar, (i10 & 32768) != 0 ? null : str3);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map<String, String> f26965a;

            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final Map<String, String> a() {
                return this.f26965a;
            }

            public final Map<String, String> b() {
                return this.f26965a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && kotlin.jvm.internal.n.a(this.f26965a, ((d) obj).f26965a);
            }

            public int hashCode() {
                Map<String, String> map = this.f26965a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "External(mediationTypes=" + this.f26965a + ")";
            }

            public d(Map<String, String> map) {
                this.f26965a = map;
            }

            public final d a(Map<String, String> map) {
                return new d(map);
            }

            public /* synthetic */ d(Map map, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = dVar.f26965a;
                }
                return dVar.a(map);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f26966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Integer f26967b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Integer f26968c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Boolean f26969d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            public final Integer a() {
                return this.f26966a;
            }

            public final Integer b() {
                return this.f26967b;
            }

            public final Integer c() {
                return this.f26968c;
            }

            public final Boolean d() {
                return this.f26969d;
            }

            public final Integer e() {
                return this.f26968c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return kotlin.jvm.internal.n.a(this.f26966a, eVar.f26966a) && kotlin.jvm.internal.n.a(this.f26967b, eVar.f26967b) && kotlin.jvm.internal.n.a(this.f26968c, eVar.f26968c) && kotlin.jvm.internal.n.a(this.f26969d, eVar.f26969d);
            }

            public final Integer f() {
                return this.f26967b;
            }

            public final Integer g() {
                return this.f26966a;
            }

            public final Boolean h() {
                return this.f26969d;
            }

            public int hashCode() {
                Integer num = this.f26966a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f26967b;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f26968c;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f26969d;
                return iHashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                return "Loggers(server=" + this.f26966a + ", publisher=" + this.f26967b + ", console=" + this.f26968c + ", shouldSendPublisherLogsOnUIThread=" + this.f26969d + ")";
            }

            public e(Integer num, Integer num2, Integer num3, Boolean bool) {
                this.f26966a = num;
                this.f26967b = num2;
                this.f26968c = num3;
                this.f26969d = bool;
            }

            public final e a(Integer num, Integer num2, Integer num3, Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            public static /* synthetic */ e a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    num = eVar.f26966a;
                }
                if ((i10 & 2) != 0) {
                    num2 = eVar.f26967b;
                }
                if ((i10 & 4) != 0) {
                    num3 = eVar.f26968c;
                }
                if ((i10 & 8) != 0) {
                    bool = eVar.f26969d;
                }
                return eVar.a(num, num2, num3, bool);
            }

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : bool);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f26970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f26971b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final JSONObject f26972c;

            public f() {
                this(null, null, null, 7, null);
            }

            public final String a() {
                return this.f26970a;
            }

            public final String b() {
                return this.f26971b;
            }

            public final JSONObject c() {
                return this.f26972c;
            }

            public final JSONObject d() {
                return this.f26972c;
            }

            public final String e() {
                return this.f26971b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return kotlin.jvm.internal.n.a(this.f26970a, fVar.f26970a) && kotlin.jvm.internal.n.a(this.f26971b, fVar.f26971b) && kotlin.jvm.internal.n.a(this.f26972c, fVar.f26972c);
            }

            public final String f() {
                return this.f26970a;
            }

            public int hashCode() {
                String str = this.f26970a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f26971b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.f26972c;
                return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            public String toString() {
                String str = this.f26970a;
                String str2 = this.f26971b;
                JSONObject jSONObject = this.f26972c;
                StringBuilder sbV = defpackage.e.v("Segment(name=", str, ", id=", str2, ", custom=");
                sbV.append(jSONObject);
                sbV.append(")");
                return sbV.toString();
            }

            public f(String str, String str2, JSONObject jSONObject) {
                this.f26970a = str;
                this.f26971b = str2;
                this.f26972c = jSONObject;
            }

            public final f a(String str, String str2, JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            public static /* synthetic */ f a(f fVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = fVar.f26970a;
                }
                if ((i10 & 2) != 0) {
                    str2 = fVar.f26971b;
                }
                if ((i10 & 4) != 0) {
                    jSONObject = fVar.f26972c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : jSONObject);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Boolean f26973a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final a f26974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Boolean f26975c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final C0047c f26976d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final List<String> f26977e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Integer f26978f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Boolean f26979g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final b f26980h;

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f26981a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f26982b;

                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.f26981a;
                }

                public final String b() {
                    return this.f26982b;
                }

                public final String c() {
                    return this.f26982b;
                }

                public final String d() {
                    return this.f26981a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return kotlin.jvm.internal.n.a(this.f26981a, aVar.f26981a) && kotlin.jvm.internal.n.a(this.f26982b, aVar.f26982b);
                }

                public int hashCode() {
                    String str = this.f26981a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f26982b;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return l1.d.h("ConsentView(pre=", this.f26981a, ", post=", this.f26982b, ")");
                }

                public a(String str, String str2) {
                    this.f26981a = str;
                    this.f26982b = str2;
                }

                public final a a(String str, String str2) {
                    return new a(str, str2);
                }

                public /* synthetic */ a(String str, String str2, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ a a(a aVar, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = aVar.f26981a;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = aVar.f26982b;
                    }
                    return aVar.a(str, str2);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final JSONObject f26983a;

                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final JSONObject a() {
                    return this.f26983a;
                }

                public final JSONObject b() {
                    return this.f26983a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f26983a, ((b) obj).f26983a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.f26983a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                public String toString() {
                    return "EpConfig(traits=" + this.f26983a + ")";
                }

                public b(JSONObject jSONObject) {
                    this.f26983a = jSONObject;
                }

                public final b a(JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                public /* synthetic */ b(JSONObject jSONObject, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ b a(b bVar, JSONObject jSONObject, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        jSONObject = bVar.f26983a;
                    }
                    return bVar.a(jSONObject);
                }
            }

            /* JADX INFO: renamed from: com.ironsource.P3$c$g$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public static final class C0047c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Map<String, a> f26984a;

                /* JADX INFO: renamed from: com.ironsource.P3$c$g$c$a */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                public static final class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final List<String> f26985a;

                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    public final List<String> a() {
                        return this.f26985a;
                    }

                    public final List<String> b() {
                        return this.f26985a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f26985a, ((a) obj).f26985a);
                    }

                    public int hashCode() {
                        List<String> list = this.f26985a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    public String toString() {
                        return "Provider(skanIds=" + this.f26985a + ")";
                    }

                    public a(List<String> list) {
                        this.f26985a = list;
                    }

                    public final a a(List<String> list) {
                        return new a(list);
                    }

                    public /* synthetic */ a(List list, int i10, kotlin.jvm.internal.g gVar) {
                        this((i10 & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ a a(a aVar, List list, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = aVar.f26985a;
                        }
                        return aVar.a(list);
                    }
                }

                public C0047c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final Map<String, a> a() {
                    return this.f26984a;
                }

                public final Map<String, a> b() {
                    return this.f26984a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0047c) && kotlin.jvm.internal.n.a(this.f26984a, ((C0047c) obj).f26984a);
                }

                public int hashCode() {
                    Map<String, a> map = this.f26984a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                public String toString() {
                    return "Skd(providers=" + this.f26984a + ")";
                }

                public C0047c(Map<String, a> map) {
                    this.f26984a = map;
                }

                public final C0047c a(Map<String, a> map) {
                    return new C0047c(map);
                }

                public /* synthetic */ C0047c(Map map, int i10, kotlin.jvm.internal.g gVar) {
                    this((i10 & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ C0047c a(C0047c c0047c, Map map, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        map = c0047c.f26984a;
                    }
                    return c0047c.a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public final Boolean a() {
                return this.f26973a;
            }

            public final a b() {
                return this.f26974b;
            }

            public final Boolean c() {
                return this.f26975c;
            }

            public final C0047c d() {
                return this.f26976d;
            }

            public final List<String> e() {
                return this.f26977e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return kotlin.jvm.internal.n.a(this.f26973a, gVar.f26973a) && kotlin.jvm.internal.n.a(this.f26974b, gVar.f26974b) && kotlin.jvm.internal.n.a(this.f26975c, gVar.f26975c) && kotlin.jvm.internal.n.a(this.f26976d, gVar.f26976d) && kotlin.jvm.internal.n.a(this.f26977e, gVar.f26977e) && kotlin.jvm.internal.n.a(this.f26978f, gVar.f26978f) && kotlin.jvm.internal.n.a(this.f26979g, gVar.f26979g) && kotlin.jvm.internal.n.a(this.f26980h, gVar.f26980h);
            }

            public final Integer f() {
                return this.f26978f;
            }

            public final Boolean g() {
                return this.f26979g;
            }

            public final b h() {
                return this.f26980h;
            }

            public int hashCode() {
                Boolean bool = this.f26973a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.f26974b;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.f26975c;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0047c c0047c = this.f26976d;
                int iHashCode4 = (iHashCode3 + (c0047c == null ? 0 : c0047c.hashCode())) * 31;
                List<String> list = this.f26977e;
                int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f26978f;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f26979g;
                int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.f26980h;
                return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            public final a i() {
                return this.f26974b;
            }

            public final b j() {
                return this.f26980h;
            }

            public final List<String> k() {
                return this.f26977e;
            }

            public final Boolean l() {
                return this.f26975c;
            }

            public final Boolean m() {
                return this.f26979g;
            }

            public final Boolean n() {
                return this.f26973a;
            }

            public final C0047c o() {
                return this.f26976d;
            }

            public final Integer p() {
                return this.f26978f;
            }

            public String toString() {
                return "Settings(sid=" + this.f26973a + ", consentView=" + this.f26974b + ", passAdditionalContextualSignals=" + this.f26975c + ", skd=" + this.f26976d + ", isp=" + this.f26977e + ", uaeh=" + this.f26978f + ", sharedThreadPool=" + this.f26979g + ", epConfig=" + this.f26980h + ")";
            }

            public g(Boolean bool, a aVar, Boolean bool2, C0047c c0047c, List<String> list, Integer num, Boolean bool3, b bVar) {
                this.f26973a = bool;
                this.f26974b = aVar;
                this.f26975c = bool2;
                this.f26976d = c0047c;
                this.f26977e = list;
                this.f26978f = num;
                this.f26979g = bool3;
                this.f26980h = bVar;
            }

            public final g a(Boolean bool, a aVar, Boolean bool2, C0047c c0047c, List<String> list, Integer num, Boolean bool3, b bVar) {
                return new g(bool, aVar, bool2, c0047c, list, num, bool3, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ g a(g gVar, Boolean bool, a aVar, Boolean bool2, C0047c c0047c, List list, Integer num, Boolean bool3, b bVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = gVar.f26973a;
                }
                if ((i10 & 2) != 0) {
                    aVar = gVar.f26974b;
                }
                if ((i10 & 4) != 0) {
                    bool2 = gVar.f26975c;
                }
                if ((i10 & 8) != 0) {
                    c0047c = gVar.f26976d;
                }
                if ((i10 & 16) != 0) {
                    list = gVar.f26977e;
                }
                if ((i10 & 32) != 0) {
                    num = gVar.f26978f;
                }
                if ((i10 & 64) != 0) {
                    bool3 = gVar.f26979g;
                }
                if ((i10 & 128) != 0) {
                    bVar = gVar.f26980h;
                }
                Boolean bool4 = bool3;
                b bVar2 = bVar;
                List list2 = list;
                Integer num2 = num;
                return gVar.a(bool, aVar, bool2, c0047c, list2, num2, bool4, bVar2);
            }

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C0047c c0047c, List list, Integer num, Boolean bool3, b bVar, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : c0047c, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : bool3, (i10 & 128) != 0 ? null : bVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<String> f26986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final JSONObject f26987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Boolean f26988c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Boolean f26989d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Boolean f26990e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            public final List<String> a() {
                return this.f26986a;
            }

            public final JSONObject b() {
                return this.f26987b;
            }

            public final Boolean c() {
                return this.f26988c;
            }

            public final Boolean d() {
                return this.f26989d;
            }

            public final Boolean e() {
                return this.f26990e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return kotlin.jvm.internal.n.a(this.f26986a, hVar.f26986a) && kotlin.jvm.internal.n.a(this.f26987b, hVar.f26987b) && kotlin.jvm.internal.n.a(this.f26988c, hVar.f26988c) && kotlin.jvm.internal.n.a(this.f26989d, hVar.f26989d) && kotlin.jvm.internal.n.a(this.f26990e, hVar.f26990e);
            }

            public final Boolean f() {
                return this.f26989d;
            }

            public final Boolean g() {
                return this.f26988c;
            }

            public final Boolean h() {
                return this.f26990e;
            }

            public int hashCode() {
                List<String> list = this.f26986a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.f26987b;
                int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.f26988c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.f26989d;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f26990e;
                return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            public final List<String> i() {
                return this.f26986a;
            }

            public final JSONObject j() {
                return this.f26987b;
            }

            public String toString() {
                return "Token(optInKeys=" + this.f26986a + ", tokenGenericParams=" + this.f26987b + ", compressToken=" + this.f26988c + ", compressExternalToken=" + this.f26989d + ", oneToken=" + this.f26990e + ")";
            }

            public h(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                this.f26986a = list;
                this.f26987b = jSONObject;
                this.f26988c = bool;
                this.f26989d = bool2;
                this.f26990e = bool3;
            }

            public final h a(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ h a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = hVar.f26986a;
                }
                if ((i10 & 2) != 0) {
                    jSONObject = hVar.f26987b;
                }
                if ((i10 & 4) != 0) {
                    bool = hVar.f26988c;
                }
                if ((i10 & 8) != 0) {
                    bool2 = hVar.f26989d;
                }
                if ((i10 & 16) != 0) {
                    bool3 = hVar.f26990e;
                }
                Boolean bool4 = bool3;
                Boolean bool5 = bool;
                return hVar.a(list, jSONObject, bool5, bool2, bool4);
            }

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : jSONObject, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        }

        public final e a() {
            return this.f26908a;
        }

        public final Boolean b() {
            return this.f26917j;
        }

        public final C0046c c() {
            return this.f26909b;
        }

        public final h d() {
            return this.f26910c;
        }

        public final f e() {
            return this.f26911d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f26908a, cVar.f26908a) && kotlin.jvm.internal.n.a(this.f26909b, cVar.f26909b) && kotlin.jvm.internal.n.a(this.f26910c, cVar.f26910c) && kotlin.jvm.internal.n.a(this.f26911d, cVar.f26911d) && kotlin.jvm.internal.n.a(this.f26912e, cVar.f26912e) && kotlin.jvm.internal.n.a(this.f26913f, cVar.f26913f) && kotlin.jvm.internal.n.a(this.f26914g, cVar.f26914g) && kotlin.jvm.internal.n.a(this.f26915h, cVar.f26915h) && kotlin.jvm.internal.n.a(this.f26916i, cVar.f26916i) && kotlin.jvm.internal.n.a(this.f26917j, cVar.f26917j);
        }

        public final a f() {
            return this.f26912e;
        }

        public final b g() {
            return this.f26913f;
        }

        public final g h() {
            return this.f26914g;
        }

        public int hashCode() {
            e eVar = this.f26908a;
            int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C0046c c0046c = this.f26909b;
            int iHashCode2 = (iHashCode + (c0046c == null ? 0 : c0046c.hashCode())) * 31;
            h hVar = this.f26910c;
            int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.f26911d;
            int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.f26912e;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f26913f;
            int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.f26914g;
            int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.f26915h;
            int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.f26916i;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f26917j;
            return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final d i() {
            return this.f26915h;
        }

        public final Boolean j() {
            return this.f26916i;
        }

        public final a k() {
            return this.f26912e;
        }

        public final b l() {
            return this.f26913f;
        }

        public final C0046c m() {
            return this.f26909b;
        }

        public final d n() {
            return this.f26915h;
        }

        public final Boolean o() {
            return this.f26917j;
        }

        public final e p() {
            return this.f26908a;
        }

        public final f q() {
            return this.f26911d;
        }

        public final g r() {
            return this.f26914g;
        }

        public final h s() {
            return this.f26910c;
        }

        public final Boolean t() {
            return this.f26916i;
        }

        public String toString() {
            return "Application(loggers=" + this.f26908a + ", events=" + this.f26909b + ", token=" + this.f26910c + ", segment=" + this.f26911d + ", auction=" + this.f26912e + ", crashReporter=" + this.f26913f + ", settings=" + this.f26914g + ", external=" + this.f26915h + ", uuidEnabled=" + this.f26916i + ", integration=" + this.f26917j + ")";
        }

        public c(e eVar, C0046c c0046c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            this.f26908a = eVar;
            this.f26909b = c0046c;
            this.f26910c = hVar;
            this.f26911d = fVar;
            this.f26912e = aVar;
            this.f26913f = bVar;
            this.f26914g = gVar;
            this.f26915h = dVar;
            this.f26916i = bool;
            this.f26917j = bool2;
        }

        public final c a(e eVar, C0046c c0046c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            return new c(eVar, c0046c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        public static /* synthetic */ c a(c cVar, e eVar, C0046c c0046c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = cVar.f26908a;
            }
            if ((i10 & 2) != 0) {
                c0046c = cVar.f26909b;
            }
            if ((i10 & 4) != 0) {
                hVar = cVar.f26910c;
            }
            if ((i10 & 8) != 0) {
                fVar = cVar.f26911d;
            }
            if ((i10 & 16) != 0) {
                aVar = cVar.f26912e;
            }
            if ((i10 & 32) != 0) {
                bVar = cVar.f26913f;
            }
            if ((i10 & 64) != 0) {
                gVar = cVar.f26914g;
            }
            if ((i10 & 128) != 0) {
                dVar = cVar.f26915h;
            }
            if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                bool = cVar.f26916i;
            }
            if ((i10 & 512) != 0) {
                bool2 = cVar.f26917j;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            g gVar2 = gVar;
            d dVar2 = dVar;
            a aVar2 = aVar;
            b bVar2 = bVar;
            return cVar.a(eVar, c0046c, hVar, fVar, aVar2, bVar2, gVar2, dVar2, bool3, bool4);
        }

        public /* synthetic */ c(e eVar, C0046c c0046c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i10, kotlin.jvm.internal.g gVar2) {
            this((i10 & 1) != 0 ? null : eVar, (i10 & 2) != 0 ? null : c0046c, (i10 & 4) != 0 ? null : hVar, (i10 & 8) != 0 ? null : fVar, (i10 & 16) != 0 ? null : aVar, (i10 & 32) != 0 ? null : bVar, (i10 & 64) != 0 ? null : gVar, (i10 & 128) != 0 ? null : dVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool, (i10 & 512) != 0 ? null : bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26991a;

        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.f26991a;
        }

        public final String b() {
            return this.f26991a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.n.a(this.f26991a, ((d) obj).f26991a);
        }

        public int hashCode() {
            String str = this.f26991a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return defpackage.e.o("TestSuite(controllerUrl=", this.f26991a, ")");
        }

        public d(String str) {
            this.f26991a = str;
        }

        public final d a(String str) {
            return new d(str);
        }

        public /* synthetic */ d(String str, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f26991a;
            }
            return dVar.a(str);
        }
    }

    public P3() {
        this(null, null, null, null, 15, null);
    }

    public final c a() {
        return this.f26831a;
    }

    public final a b() {
        return this.f26832b;
    }

    public final d c() {
        return this.f26833c;
    }

    public final b d() {
        return this.f26834d;
    }

    public final a e() {
        return this.f26832b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3)) {
            return false;
        }
        P3 p10 = (P3) obj;
        return kotlin.jvm.internal.n.a(this.f26831a, p10.f26831a) && kotlin.jvm.internal.n.a(this.f26832b, p10.f26832b) && kotlin.jvm.internal.n.a(this.f26833c, p10.f26833c) && kotlin.jvm.internal.n.a(this.f26834d, p10.f26834d);
    }

    public final b f() {
        return this.f26834d;
    }

    public final c g() {
        return this.f26831a;
    }

    public final d h() {
        return this.f26833c;
    }

    public int hashCode() {
        c cVar = this.f26831a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.f26832b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f26833c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f26834d;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Configurations2(application=" + this.f26831a + ", adFormats=" + this.f26832b + ", testSuite=" + this.f26833c + ", adQuality=" + this.f26834d + ")";
    }

    public P3(c cVar, a aVar, d dVar, b bVar) {
        this.f26831a = cVar;
        this.f26832b = aVar;
        this.f26833c = dVar;
        this.f26834d = bVar;
    }

    public final P3 a(c cVar, a aVar, d dVar, b bVar) {
        return new P3(cVar, aVar, dVar, bVar);
    }

    public static /* synthetic */ P3 a(P3 p10, c cVar, a aVar, d dVar, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = p10.f26831a;
        }
        if ((i10 & 2) != 0) {
            aVar = p10.f26832b;
        }
        if ((i10 & 4) != 0) {
            dVar = p10.f26833c;
        }
        if ((i10 & 8) != 0) {
            bVar = p10.f26834d;
        }
        return p10.a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ P3(c cVar, a aVar, d dVar, b bVar, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : dVar, (i10 & 8) != 0 ? null : bVar);
    }
}
