package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\u0082\u0001\u0001\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/s3;", "", "", "c", "()Ljava/lang/String;", "successCallback", "a", "failCallback", "Lcom/ironsource/mh$e;", "b", "()Lcom/ironsource/mh$e;", d9.h.m, "d", "demandSourceName", "Lcom/ironsource/s3$a;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f26737a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/s3$a;", "Lcom/ironsource/s3;", "", "getUrl", "()Ljava/lang/String;", "url", "a", "b", "Lcom/ironsource/s3$a$a;", "Lcom/ironsource/s3$a$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a extends s3 {

        /* JADX INFO: renamed from: com.ironsource.s3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0016\u0010 R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*¨\u0006."}, d2 = {"Lcom/ironsource/s3$a$a;", "Lcom/ironsource/s3$a;", "", "e", f.j, "Lcom/ironsource/mh$e;", g.f40227p, h.f36614b, i.f37957c, "Lcom/ironsource/s3$a$a$a;", "j", "", "k", "l", "successCallback", "failCallback", d9.h.m, "demandSourceName", "url", e9.COORDINATES, "action", e9.META_STATE, "a", "toString", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/ironsource/mh$e;", "()Lcom/ironsource/mh$e;", "getUrl", "Lcom/ironsource/s3$a$a$a;", dc.q, "()Lcom/ironsource/s3$a$a$a;", "I", "m", "()I", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mh$e;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/s3$a$a$a;II)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class C0290a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String successCallback;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String failCallback;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final mh.e productType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final String demandSourceName;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String url;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final C0291a coordinates;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final int action;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final int metaState;

            /* JADX INFO: renamed from: com.ironsource.s3$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/s3$a$a$a;", "", "", "a", "b", "x", "y", "", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "c", "()I", "d", "<init>", "(II)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
            public static final /* data */ class C0291a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int x;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final int y;

                public C0291a(int i2, int i3) {
                    this.x = i2;
                    this.y = i3;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getX() {
                    return this.x;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getY() {
                    return this.y;
                }

                public final int c() {
                    return this.x;
                }

                public final int d() {
                    return this.y;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C0291a)) {
                        return false;
                    }
                    C0291a c0291a = (C0291a) other;
                    return this.x == c0291a.x && this.y == c0291a.y;
                }

                public int hashCode() {
                    return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("Coordinates(x=");
                    sb.append(this.x);
                    sb.append(", y=");
                    return android.support.v4.media.a.p(sb, this.y, ')');
                }

                public final C0291a a(int x, int y) {
                    return new C0291a(x, y);
                }

                public static /* synthetic */ C0291a a(C0291a c0291a, int i2, int i3, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        i2 = c0291a.x;
                    }
                    if ((i4 & 2) != 0) {
                        i3 = c0291a.y;
                    }
                    return c0291a.a(i2, i3);
                }
            }

            public C0290a(String successCallback, String failCallback, mh.e productType, String demandSourceName, String url, C0291a coordinates, int i2, int i3) {
                Intrinsics.f(successCallback, "successCallback");
                Intrinsics.f(failCallback, "failCallback");
                Intrinsics.f(productType, "productType");
                Intrinsics.f(demandSourceName, "demandSourceName");
                Intrinsics.f(url, "url");
                Intrinsics.f(coordinates, "coordinates");
                this.successCallback = successCallback;
                this.failCallback = failCallback;
                this.productType = productType;
                this.demandSourceName = demandSourceName;
                this.url = url;
                this.coordinates = coordinates;
                this.action = i2;
                this.metaState = i3;
            }

            public static /* synthetic */ C0290a a(C0290a c0290a, String str, String str2, mh.e eVar, String str3, String str4, C0291a c0291a, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = c0290a.successCallback;
                }
                if ((i4 & 2) != 0) {
                    str2 = c0290a.failCallback;
                }
                if ((i4 & 4) != 0) {
                    eVar = c0290a.productType;
                }
                if ((i4 & 8) != 0) {
                    str3 = c0290a.demandSourceName;
                }
                if ((i4 & 16) != 0) {
                    str4 = c0290a.url;
                }
                if ((i4 & 32) != 0) {
                    c0291a = c0290a.coordinates;
                }
                if ((i4 & 64) != 0) {
                    i2 = c0290a.action;
                }
                if ((i4 & 128) != 0) {
                    i3 = c0290a.metaState;
                }
                int i5 = i2;
                int i6 = i3;
                String str5 = str4;
                C0291a c0291a2 = c0291a;
                return c0290a.a(str, str2, eVar, str3, str5, c0291a2, i5, i6);
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: b, reason: from getter */
            public mh.e getProductType() {
                return this.productType;
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getSuccessCallback() {
                return this.successCallback;
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getDemandSourceName() {
                return this.demandSourceName;
            }

            public final String e() {
                return this.successCallback;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0290a)) {
                    return false;
                }
                C0290a c0290a = (C0290a) other;
                return Intrinsics.a(this.successCallback, c0290a.successCallback) && Intrinsics.a(this.failCallback, c0290a.failCallback) && this.productType == c0290a.productType && Intrinsics.a(this.demandSourceName, c0290a.demandSourceName) && Intrinsics.a(this.url, c0290a.url) && Intrinsics.a(this.coordinates, c0290a.coordinates) && this.action == c0290a.action && this.metaState == c0290a.metaState;
            }

            public final String f() {
                return this.failCallback;
            }

            public final mh.e g() {
                return this.productType;
            }

            @Override // com.ironsource.s3.a
            public String getUrl() {
                return this.url;
            }

            public final String h() {
                return this.demandSourceName;
            }

            public int hashCode() {
                return Integer.hashCode(this.metaState) + androidx.media3.extractor.text.ttml.a.a(this.action, (this.coordinates.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.url, androidx.datastore.preferences.protobuf.a.b(this.demandSourceName, (this.productType.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.failCallback, this.successCallback.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31);
            }

            public final String i() {
                return this.url;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final C0291a getCoordinates() {
                return this.coordinates;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final int getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final int getMetaState() {
                return this.metaState;
            }

            public final int m() {
                return this.action;
            }

            public final C0291a n() {
                return this.coordinates;
            }

            public final int o() {
                return this.metaState;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Click(successCallback=");
                sb.append(this.successCallback);
                sb.append(", failCallback=");
                sb.append(this.failCallback);
                sb.append(", productType=");
                sb.append(this.productType);
                sb.append(", demandSourceName=");
                sb.append(this.demandSourceName);
                sb.append(", url=");
                sb.append(this.url);
                sb.append(", coordinates=");
                sb.append(this.coordinates);
                sb.append(", action=");
                sb.append(this.action);
                sb.append(", metaState=");
                return android.support.v4.media.a.p(sb, this.metaState, ')');
            }

            public final C0290a a(String successCallback, String failCallback, mh.e productType, String demandSourceName, String url, C0291a coordinates, int action, int metaState) {
                Intrinsics.f(successCallback, "successCallback");
                Intrinsics.f(failCallback, "failCallback");
                Intrinsics.f(productType, "productType");
                Intrinsics.f(demandSourceName, "demandSourceName");
                Intrinsics.f(url, "url");
                Intrinsics.f(coordinates, "coordinates");
                return new C0290a(successCallback, failCallback, productType, demandSourceName, url, coordinates, action, metaState);
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getFailCallback() {
                return this.failCallback;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/s3$a$b;", "Lcom/ironsource/s3$a;", "", "e", f.j, "Lcom/ironsource/mh$e;", g.f40227p, h.f36614b, i.f37957c, "successCallback", "failCallback", d9.h.m, "demandSourceName", "url", "a", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/ironsource/mh$e;", "()Lcom/ironsource/mh$e;", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mh$e;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String successCallback;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String failCallback;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final mh.e productType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final String demandSourceName;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String url;

            public b(String successCallback, String failCallback, mh.e productType, String demandSourceName, String url) {
                Intrinsics.f(successCallback, "successCallback");
                Intrinsics.f(failCallback, "failCallback");
                Intrinsics.f(productType, "productType");
                Intrinsics.f(demandSourceName, "demandSourceName");
                Intrinsics.f(url, "url");
                this.successCallback = successCallback;
                this.failCallback = failCallback;
                this.productType = productType;
                this.demandSourceName = demandSourceName;
                this.url = url;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, mh.e eVar, String str3, String str4, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = bVar.successCallback;
                }
                if ((i2 & 2) != 0) {
                    str2 = bVar.failCallback;
                }
                if ((i2 & 4) != 0) {
                    eVar = bVar.productType;
                }
                if ((i2 & 8) != 0) {
                    str3 = bVar.demandSourceName;
                }
                if ((i2 & 16) != 0) {
                    str4 = bVar.url;
                }
                String str5 = str4;
                mh.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: b, reason: from getter */
            public mh.e getProductType() {
                return this.productType;
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getSuccessCallback() {
                return this.successCallback;
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getDemandSourceName() {
                return this.demandSourceName;
            }

            public final String e() {
                return this.successCallback;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return Intrinsics.a(this.successCallback, bVar.successCallback) && Intrinsics.a(this.failCallback, bVar.failCallback) && this.productType == bVar.productType && Intrinsics.a(this.demandSourceName, bVar.demandSourceName) && Intrinsics.a(this.url, bVar.url);
            }

            public final String f() {
                return this.failCallback;
            }

            public final mh.e g() {
                return this.productType;
            }

            @Override // com.ironsource.s3.a
            public String getUrl() {
                return this.url;
            }

            public final String h() {
                return this.demandSourceName;
            }

            public int hashCode() {
                return this.url.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.demandSourceName, (this.productType.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.failCallback, this.successCallback.hashCode() * 31, 31)) * 31, 31);
            }

            public final String i() {
                return this.url;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Impression(successCallback=");
                sb.append(this.successCallback);
                sb.append(", failCallback=");
                sb.append(this.failCallback);
                sb.append(", productType=");
                sb.append(this.productType);
                sb.append(", demandSourceName=");
                sb.append(this.demandSourceName);
                sb.append(", url=");
                return androidx.media3.extractor.text.ttml.a.p(sb, this.url, ')');
            }

            public final b a(String successCallback, String failCallback, mh.e productType, String demandSourceName, String url) {
                Intrinsics.f(successCallback, "successCallback");
                Intrinsics.f(failCallback, "failCallback");
                Intrinsics.f(productType, "productType");
                Intrinsics.f(demandSourceName, "demandSourceName");
                Intrinsics.f(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.p004ironsource.s3
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getFailCallback() {
                return this.failCallback;
            }
        }

        String getUrl();
    }

    /* JADX INFO: renamed from: com.ironsource.s3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/s3$b;", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/s3$a;", "a", "", "jsonString", "Lcom/ironsource/s3;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f26737a = new Companion();

        private Companion() {
        }

        private final a a(JSONObject json) throws JSONException {
            String successCallback = json.getString("success");
            String failCallback = json.getString("fail");
            String demandSourceName = json.getString("demandSourceName");
            String string = json.getString(d9.h.m);
            Intrinsics.e(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            mh.e eVarValueOf = mh.e.valueOf(string);
            JSONObject jSONObject = json.getJSONObject("params");
            String url = jSONObject.getString("url");
            String strOptString = jSONObject.optString("type");
            if (!Intrinsics.a(strOptString, "click")) {
                if (!Intrinsics.a(strOptString, "impression")) {
                    throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject.optString("type"));
                }
                Intrinsics.e(successCallback, "successCallback");
                Intrinsics.e(failCallback, "failCallback");
                Intrinsics.e(demandSourceName, "demandSourceName");
                Intrinsics.e(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(e9.COORDINATES);
            int i2 = jSONObject2.getInt(e9.SCREEN_X);
            int i3 = jSONObject2.getInt(e9.SCREEN_Y);
            int iOptInt = jSONObject.optInt("action", 0);
            int iOptInt2 = jSONObject.optInt(e9.META_STATE, 0);
            Intrinsics.e(successCallback, "successCallback");
            Intrinsics.e(failCallback, "failCallback");
            Intrinsics.e(demandSourceName, "demandSourceName");
            Intrinsics.e(url, "url");
            return new a.C0290a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0290a.C0291a(i2, i3), iOptInt, iOptInt2);
        }

        @JvmStatic
        public final s3 a(String jsonString) {
            Intrinsics.f(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (Intrinsics.a(strOptString, e9.ATTRIBUTION)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException(android.support.v4.media.a.C("unsupported message type: ", strOptString));
        }
    }

    @JvmStatic
    static s3 a(String str) {
        return INSTANCE.a(str);
    }

    /* JADX INFO: renamed from: a */
    String getFailCallback();

    /* JADX INFO: renamed from: b */
    mh.e getProductType();

    /* JADX INFO: renamed from: c */
    String getSuccessCallback();

    /* JADX INFO: renamed from: d */
    String getDemandSourceName();
}
