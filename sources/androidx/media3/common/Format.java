package androidx.media3.common;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.applovin.shadow.okio.Segment;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class Format {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f5400A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f5401B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f5402E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f5403F;
    public final int G;
    public final int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f5404I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f5405J;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList f5408c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5409e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5411i;
    public final String j;
    public final Metadata k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5412l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5413n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f5414p;
    public final DrmInitData q;
    public final long r;
    public final int s;
    public final int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f5415u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f5416w;
    public final byte[] x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ColorInfo f5417z;

    public static final class Builder {
        public int C;
        public int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5424b;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5426e;
        public int f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f5428i;
        public Metadata j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f5429l;
        public List o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DrmInitData f5431p;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f5432u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public byte[] f5433w;
        public ColorInfo y;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableList f5425c = ImmutableList.x();
        public int g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5427h = -1;
        public int m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5430n = -1;
        public long q = Long.MAX_VALUE;
        public int r = -1;
        public int s = -1;
        public float t = -1.0f;
        public float v = 1.0f;
        public int x = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f5434z = -1;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f5418A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f5419B = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f5420E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f5421F = 1;
        public int G = -1;
        public int H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f5422I = 0;

        public final Format a() {
            return new Format(this);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CueReplacementBehavior {
    }

    static {
        new Builder().a();
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
        a.s(5, 6, 7, 8, 9);
        a.s(10, 11, 12, 13, 14);
        a.s(15, 16, 17, 18, 19);
        a.s(20, 21, 22, 23, 24);
        a.s(25, 26, 27, 28, 29);
        Util.E(30);
        Util.E(31);
        Util.E(32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Format(Builder builder) {
        boolean z2;
        String str;
        this.f5406a = builder.f5423a;
        String strJ = Util.J(builder.d);
        this.d = strJ;
        if (builder.f5425c.isEmpty() && builder.f5424b != null) {
            this.f5408c = ImmutableList.z(new Label(strJ, builder.f5424b));
            this.f5407b = builder.f5424b;
        } else if (builder.f5425c.isEmpty() || builder.f5424b != null) {
            if (!builder.f5425c.isEmpty() || builder.f5424b != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= builder.f5425c.size()) {
                        z2 = false;
                        break;
                    } else {
                        if (((Label) builder.f5425c.get(i2)).f5436b.equals(builder.f5424b)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            Assertions.e(z2);
            this.f5408c = builder.f5425c;
            this.f5407b = builder.f5424b;
        } else {
            ImmutableList immutableList = builder.f5425c;
            this.f5408c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((Label) immutableList.get(0)).f5436b;
                    break;
                }
                Label label = (Label) it.next();
                if (TextUtils.equals(label.f5435a, strJ)) {
                    str = label.f5436b;
                    break;
                }
            }
            this.f5407b = str;
        }
        this.f5409e = builder.f5426e;
        this.f = builder.f;
        int i3 = builder.g;
        this.g = i3;
        int i4 = builder.f5427h;
        this.f5410h = i4;
        this.f5411i = i4 != -1 ? i4 : i3;
        this.j = builder.f5428i;
        this.k = builder.j;
        this.f5412l = builder.k;
        this.m = builder.f5429l;
        this.f5413n = builder.m;
        this.o = builder.f5430n;
        List list = builder.o;
        this.f5414p = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = builder.f5431p;
        this.q = drmInitData;
        this.r = builder.q;
        this.s = builder.r;
        this.t = builder.s;
        this.f5415u = builder.t;
        int i5 = builder.f5432u;
        this.v = i5 == -1 ? 0 : i5;
        float f = builder.v;
        this.f5416w = f == -1.0f ? 1.0f : f;
        this.x = builder.f5433w;
        this.y = builder.x;
        this.f5417z = builder.y;
        this.f5400A = builder.f5434z;
        this.f5401B = builder.f5418A;
        this.C = builder.f5419B;
        int i6 = builder.C;
        this.D = i6 == -1 ? 0 : i6;
        int i7 = builder.D;
        this.f5402E = i7 != -1 ? i7 : 0;
        this.f5403F = builder.f5420E;
        this.G = builder.f5421F;
        this.H = builder.G;
        this.f5404I = builder.H;
        int i8 = builder.f5422I;
        if (i8 != 0 || drmInitData == null) {
            this.f5405J = i8;
        } else {
            this.f5405J = 1;
        }
    }

    public static String c(Format format) {
        String str;
        int i2;
        if (format == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sbW = android.support.v4.media.a.w("id=");
        sbW.append(format.f5406a);
        sbW.append(", mimeType=");
        sbW.append(format.m);
        String str2 = format.f5412l;
        if (str2 != null) {
            sbW.append(", container=");
            sbW.append(str2);
        }
        int i3 = format.f5411i;
        if (i3 != -1) {
            sbW.append(", bitrate=");
            sbW.append(i3);
        }
        String str3 = format.j;
        if (str3 != null) {
            sbW.append(", codecs=");
            sbW.append(str3);
        }
        DrmInitData drmInitData = format.q;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < drmInitData.e0; i4++) {
                UUID uuid = drmInitData.X[i4].f5396Y;
                if (uuid.equals(C.f5379b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C.f5380c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.f5381e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.f5378a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbW.append(", drm=[");
            Joiner.d(AbstractJsonLexerKt.COMMA).b(sbW, linkedHashSet.iterator());
            sbW.append(AbstractJsonLexerKt.END_LIST);
        }
        int i5 = format.s;
        if (i5 != -1 && (i2 = format.t) != -1) {
            a.z(sbW, ", res=", i5, "x", i2);
        }
        ColorInfo colorInfo = format.f5417z;
        if (colorInfo != null) {
            int i6 = colorInfo.f;
            int i7 = colorInfo.f5386e;
            if ((i7 != -1 && i6 != -1) || colorInfo.d()) {
                sbW.append(", color=");
                if (colorInfo.d()) {
                    String strB = ColorInfo.b(colorInfo.f5383a);
                    String strA = ColorInfo.a(colorInfo.f5384b);
                    String strC = ColorInfo.c(colorInfo.f5385c);
                    Locale locale = Locale.US;
                    str = strB + "/" + strA + "/" + strC;
                } else {
                    str = "NA/NA/NA";
                }
                sbW.append(str + "/" + ((i7 == -1 || i6 == -1) ? "NA/NA" : i7 + "/" + i6));
            }
        }
        float f = format.f5415u;
        if (f != -1.0f) {
            sbW.append(", fps=");
            sbW.append(f);
        }
        int i8 = format.f5400A;
        if (i8 != -1) {
            sbW.append(", channels=");
            sbW.append(i8);
        }
        int i9 = format.f5401B;
        if (i9 != -1) {
            sbW.append(", sample_rate=");
            sbW.append(i9);
        }
        String str4 = format.d;
        if (str4 != null) {
            sbW.append(", language=");
            sbW.append(str4);
        }
        ImmutableList immutableList = format.f5408c;
        if (!immutableList.isEmpty()) {
            sbW.append(", labels=[");
            Joiner.d(AbstractJsonLexerKt.COMMA).b(sbW, immutableList.iterator());
            sbW.append(d9.i.f24752e);
        }
        int i10 = format.f5409e;
        if (i10 != 0) {
            sbW.append(", selectionFlags=[");
            Joiner joinerD = Joiner.d(AbstractJsonLexerKt.COMMA);
            int i11 = Util.f5683a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            joinerD.b(sbW, arrayList.iterator());
            sbW.append(d9.i.f24752e);
        }
        int i12 = format.f;
        if (i12 != 0) {
            sbW.append(", roleFlags=[");
            Joiner joinerD2 = Joiner.d(AbstractJsonLexerKt.COMMA);
            int i13 = Util.f5683a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add(d9.h.Z);
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i12 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i12 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i12 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i12 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i12 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i12 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i12 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i12 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            joinerD2.b(sbW, arrayList2.iterator());
            sbW.append(d9.i.f24752e);
        }
        return sbW.toString();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f5423a = this.f5406a;
        builder.f5424b = this.f5407b;
        builder.f5425c = this.f5408c;
        builder.d = this.d;
        builder.f5426e = this.f5409e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f5427h = this.f5410h;
        builder.f5428i = this.j;
        builder.j = this.k;
        builder.k = this.f5412l;
        builder.f5429l = this.m;
        builder.m = this.f5413n;
        builder.f5430n = this.o;
        builder.o = this.f5414p;
        builder.f5431p = this.q;
        builder.q = this.r;
        builder.r = this.s;
        builder.s = this.t;
        builder.t = this.f5415u;
        builder.f5432u = this.v;
        builder.v = this.f5416w;
        builder.f5433w = this.x;
        builder.x = this.y;
        builder.y = this.f5417z;
        builder.f5434z = this.f5400A;
        builder.f5418A = this.f5401B;
        builder.f5419B = this.C;
        builder.C = this.D;
        builder.D = this.f5402E;
        builder.f5420E = this.f5403F;
        builder.f5421F = this.G;
        builder.G = this.H;
        builder.H = this.f5404I;
        builder.f5422I = this.f5405J;
        return builder;
    }

    public final boolean b(Format format) {
        List list = this.f5414p;
        if (list.size() != format.f5414p.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) format.f5414p.get(i2))) {
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
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i3 = this.K;
        return (i3 == 0 || (i2 = format.K) == 0 || i3 == i2) && this.f5409e == format.f5409e && this.f == format.f && this.g == format.g && this.f5410h == format.f5410h && this.f5413n == format.f5413n && this.r == format.r && this.s == format.s && this.t == format.t && this.v == format.v && this.y == format.y && this.f5400A == format.f5400A && this.f5401B == format.f5401B && this.C == format.C && this.D == format.D && this.f5402E == format.f5402E && this.f5403F == format.f5403F && this.H == format.H && this.f5404I == format.f5404I && this.f5405J == format.f5405J && Float.compare(this.f5415u, format.f5415u) == 0 && Float.compare(this.f5416w, format.f5416w) == 0 && Objects.equals(this.f5406a, format.f5406a) && Objects.equals(this.f5407b, format.f5407b) && this.f5408c.equals(format.f5408c) && Objects.equals(this.j, format.j) && Objects.equals(this.f5412l, format.f5412l) && Objects.equals(this.m, format.m) && Objects.equals(this.d, format.d) && Arrays.equals(this.x, format.x) && Objects.equals(this.k, format.k) && Objects.equals(this.f5417z, format.f5417z) && Objects.equals(this.q, format.q) && b(format);
    }

    public final int hashCode() {
        if (this.K == 0) {
            String str = this.f5406a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f5407b;
            int iHashCode2 = (this.f5408c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5409e) * 31) + this.f) * 31) + this.g) * 31) + this.f5410h) * 31;
            String str4 = this.j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.k;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 961;
            String str5 = this.f5412l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            this.K = ((((((((((((((((((((Float.floatToIntBits(this.f5416w) + ((((Float.floatToIntBits(this.f5415u) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f5413n) * 31) + ((int) this.r)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.v) * 31)) * 31) + this.y) * 31) + this.f5400A) * 31) + this.f5401B) * 31) + this.C) * 31) + this.D) * 31) + this.f5402E) * 31) + this.f5403F) * 31) + this.H) * 31) + this.f5404I) * 31) + this.f5405J;
        }
        return this.K;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f5406a);
        sb.append(", ");
        sb.append(this.f5407b);
        sb.append(", ");
        sb.append(this.f5412l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.f5411i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.f5415u);
        sb.append(", ");
        sb.append(this.f5417z);
        sb.append("], [");
        sb.append(this.f5400A);
        sb.append(", ");
        return android.support.v4.media.a.i(this.f5401B, "])", sb);
    }
}
