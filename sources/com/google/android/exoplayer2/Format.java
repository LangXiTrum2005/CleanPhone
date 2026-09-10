package com.google.android.exoplayer2;

import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Joiner;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Format implements Bundleable {
    public static final Format J0 = new Format(new Builder());
    public static final String K0 = Integer.toString(0, 36);
    public static final String L0 = Integer.toString(1, 36);
    public static final String M0 = Integer.toString(2, 36);
    public static final String N0 = Integer.toString(3, 36);
    public static final String O0 = Integer.toString(4, 36);
    public static final String P0 = Integer.toString(5, 36);
    public static final String Q0 = Integer.toString(6, 36);
    public static final String R0 = Integer.toString(7, 36);
    public static final String S0 = Integer.toString(8, 36);
    public static final String T0 = Integer.toString(9, 36);
    public static final String U0 = Integer.toString(10, 36);
    public static final String V0 = Integer.toString(11, 36);
    public static final String W0 = Integer.toString(12, 36);
    public static final String X0 = Integer.toString(13, 36);
    public static final String Y0 = Integer.toString(14, 36);
    public static final String Z0 = Integer.toString(15, 36);
    public static final String a1 = Integer.toString(16, 36);
    public static final String b1 = Integer.toString(17, 36);
    public static final String c1 = Integer.toString(18, 36);
    public static final String d1 = Integer.toString(19, 36);
    public static final String e1 = Integer.toString(20, 36);
    public static final String f1 = Integer.toString(21, 36);
    public static final String g1 = Integer.toString(22, 36);
    public static final String h1 = Integer.toString(23, 36);
    public static final String i1 = Integer.toString(24, 36);
    public static final String j1 = Integer.toString(25, 36);
    public static final String k1 = Integer.toString(26, 36);
    public static final String l1 = Integer.toString(27, 36);
    public static final String m1 = Integer.toString(28, 36);
    public static final String n1 = Integer.toString(29, 36);
    public static final String o1 = Integer.toString(30, 36);
    public static final String p1 = Integer.toString(31, 36);
    public static final d q1 = new d(3);
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public int I0;
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f17076Y;
    public final String Z;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final String j0;
    public final Metadata k0;
    public final String l0;
    public final String m0;
    public final int n0;
    public final List o0;
    public final DrmInitData p0;
    public final long q0;
    public final int r0;
    public final int s0;
    public final float t0;
    public final int u0;
    public final float v0;
    public final byte[] w0;
    public final int x0;
    public final ColorInfo y0;
    public final int z0;

    public static final class Builder {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f17077A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f17078B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17083c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17084e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Metadata f17086i;
        public String j;
        public String k;
        public List m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DrmInitData f17088n;
        public int s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public byte[] f17090u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ColorInfo f17091w;
        public int f = -1;
        public int g = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17087l = -1;
        public long o = Long.MAX_VALUE;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f17089p = -1;
        public int q = -1;
        public float r = -1.0f;
        public float t = 1.0f;
        public int v = -1;
        public int x = -1;
        public int y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f17092z = -1;
        public int C = -1;
        public int D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f17079E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f17080F = 0;

        public final Format a() {
            return new Format(this);
        }
    }

    public Format(Builder builder) {
        this.X = builder.f17081a;
        this.f17076Y = builder.f17082b;
        this.Z = Util.C(builder.f17083c);
        this.e0 = builder.d;
        this.f0 = builder.f17084e;
        int i2 = builder.f;
        this.g0 = i2;
        int i3 = builder.g;
        this.h0 = i3;
        this.i0 = i3 != -1 ? i3 : i2;
        this.j0 = builder.f17085h;
        this.k0 = builder.f17086i;
        this.l0 = builder.j;
        this.m0 = builder.k;
        this.n0 = builder.f17087l;
        List list = builder.m;
        this.o0 = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = builder.f17088n;
        this.p0 = drmInitData;
        this.q0 = builder.o;
        this.r0 = builder.f17089p;
        this.s0 = builder.q;
        this.t0 = builder.r;
        int i4 = builder.s;
        this.u0 = i4 == -1 ? 0 : i4;
        float f = builder.t;
        this.v0 = f == -1.0f ? 1.0f : f;
        this.w0 = builder.f17090u;
        this.x0 = builder.v;
        this.y0 = builder.f17091w;
        this.z0 = builder.x;
        this.A0 = builder.y;
        this.B0 = builder.f17092z;
        int i5 = builder.f17077A;
        this.C0 = i5 == -1 ? 0 : i5;
        int i6 = builder.f17078B;
        this.D0 = i6 != -1 ? i6 : 0;
        this.E0 = builder.C;
        this.F0 = builder.D;
        this.G0 = builder.f17079E;
        int i7 = builder.f17080F;
        if (i7 != 0 || drmInitData == null) {
            this.H0 = i7;
        } else {
            this.H0 = 1;
        }
    }

    public static String c(Format format) {
        int i2;
        if (format == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sbW = android.support.v4.media.a.w("id=");
        sbW.append(format.X);
        sbW.append(", mimeType=");
        sbW.append(format.m0);
        int i3 = format.i0;
        if (i3 != -1) {
            sbW.append(", bitrate=");
            sbW.append(i3);
        }
        String str = format.j0;
        if (str != null) {
            sbW.append(", codecs=");
            sbW.append(str);
        }
        DrmInitData drmInitData = format.p0;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < drmInitData.e0; i4++) {
                UUID uuid = drmInitData.X[i4].f17475Y;
                if (uuid.equals(C.f16998b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C.f16999c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.f17000e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.f16997a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbW.append(", drm=[");
            Joiner.d(AbstractJsonLexerKt.COMMA).b(sbW, linkedHashSet.iterator());
            sbW.append(AbstractJsonLexerKt.END_LIST);
        }
        int i5 = format.r0;
        if (i5 != -1 && (i2 = format.s0) != -1) {
            androidx.datastore.preferences.protobuf.a.z(sbW, ", res=", i5, "x", i2);
        }
        float f = format.t0;
        if (f != -1.0f) {
            sbW.append(", fps=");
            sbW.append(f);
        }
        int i6 = format.z0;
        if (i6 != -1) {
            sbW.append(", channels=");
            sbW.append(i6);
        }
        int i7 = format.A0;
        if (i7 != -1) {
            sbW.append(", sample_rate=");
            sbW.append(i7);
        }
        String str2 = format.Z;
        if (str2 != null) {
            sbW.append(", language=");
            sbW.append(str2);
        }
        String str3 = format.f17076Y;
        if (str3 != null) {
            sbW.append(", label=");
            sbW.append(str3);
        }
        int i8 = format.e0;
        if (i8 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i8 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i8 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i8 & 2) != 0) {
                arrayList.add("forced");
            }
            sbW.append(", selectionFlags=[");
            Joiner.d(AbstractJsonLexerKt.COMMA).b(sbW, arrayList.iterator());
            sbW.append(d9.i.f24752e);
        }
        int i9 = format.f0;
        if (i9 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add(d9.h.Z);
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i9 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i9 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i9 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i9 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i9 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i9 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i9 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i9 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sbW.append(", roleFlags=[");
            Joiner.d(AbstractJsonLexerKt.COMMA).b(sbW, arrayList2.iterator());
            sbW.append(d9.i.f24752e);
        }
        return sbW.toString();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f17081a = this.X;
        builder.f17082b = this.f17076Y;
        builder.f17083c = this.Z;
        builder.d = this.e0;
        builder.f17084e = this.f0;
        builder.f = this.g0;
        builder.g = this.h0;
        builder.f17085h = this.j0;
        builder.f17086i = this.k0;
        builder.j = this.l0;
        builder.k = this.m0;
        builder.f17087l = this.n0;
        builder.m = this.o0;
        builder.f17088n = this.p0;
        builder.o = this.q0;
        builder.f17089p = this.r0;
        builder.q = this.s0;
        builder.r = this.t0;
        builder.s = this.u0;
        builder.t = this.v0;
        builder.f17090u = this.w0;
        builder.v = this.x0;
        builder.f17091w = this.y0;
        builder.x = this.z0;
        builder.y = this.A0;
        builder.f17092z = this.B0;
        builder.f17077A = this.C0;
        builder.f17078B = this.D0;
        builder.C = this.E0;
        builder.D = this.F0;
        builder.f17079E = this.G0;
        builder.f17080F = this.H0;
        return builder;
    }

    public final boolean b(Format format) {
        List list = this.o0;
        if (list.size() != format.o0.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) format.o0.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i3 = this.I0;
            if ((i3 == 0 || (i2 = format.I0) == 0 || i3 == i2) && this.e0 == format.e0 && this.f0 == format.f0 && this.g0 == format.g0 && this.h0 == format.h0 && this.n0 == format.n0 && this.q0 == format.q0 && this.r0 == format.r0 && this.s0 == format.s0 && this.u0 == format.u0 && this.x0 == format.x0 && this.z0 == format.z0 && this.A0 == format.A0 && this.B0 == format.B0 && this.C0 == format.C0 && this.D0 == format.D0 && this.E0 == format.E0 && this.F0 == format.F0 && this.G0 == format.G0 && this.H0 == format.H0 && Float.compare(this.t0, format.t0) == 0 && Float.compare(this.v0, format.v0) == 0 && Util.a(this.X, format.X) && Util.a(this.f17076Y, format.f17076Y) && Util.a(this.j0, format.j0) && Util.a(this.l0, format.l0) && Util.a(this.m0, format.m0) && Util.a(this.Z, format.Z) && Arrays.equals(this.w0, format.w0) && Util.a(this.k0, format.k0) && Util.a(this.y0, format.y0) && Util.a(this.p0, format.p0) && b(format)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.I0 == 0) {
            String str = this.X;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f17076Y;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.Z;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e0) * 31) + this.f0) * 31) + this.g0) * 31) + this.h0) * 31;
            String str4 = this.j0;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.k0;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.l0;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m0;
            this.I0 = ((((((((((((((((((((Float.floatToIntBits(this.v0) + ((((Float.floatToIntBits(this.t0) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n0) * 31) + ((int) this.q0)) * 31) + this.r0) * 31) + this.s0) * 31)) * 31) + this.u0) * 31)) * 31) + this.x0) * 31) + this.z0) * 31) + this.A0) * 31) + this.B0) * 31) + this.C0) * 31) + this.D0) * 31) + this.E0) * 31) + this.F0) * 31) + this.G0) * 31) + this.H0;
        }
        return this.I0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.f17076Y);
        sb.append(", ");
        sb.append(this.l0);
        sb.append(", ");
        sb.append(this.m0);
        sb.append(", ");
        sb.append(this.j0);
        sb.append(", ");
        sb.append(this.i0);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(", [");
        sb.append(this.r0);
        sb.append(", ");
        sb.append(this.s0);
        sb.append(", ");
        sb.append(this.t0);
        sb.append("], [");
        sb.append(this.z0);
        sb.append(", ");
        return android.support.v4.media.a.i(this.A0, "])", sb);
    }
}
