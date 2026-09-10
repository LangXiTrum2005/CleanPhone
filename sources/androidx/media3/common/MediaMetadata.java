package androidx.media3.common;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata {
    public static final MediaMetadata y = new MediaMetadata(new Builder());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f5465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f5466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f5467c;
    public final CharSequence d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f5468e;
    public final byte[] f;
    public final Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f5469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f5470i;
    public final Integer j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f5471l;
    public final Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f5472n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f5473p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f5474u;
    public final CharSequence v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f5475w;
    public final Integer x;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f5476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f5477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f5478c;
        public CharSequence d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f5479e;
        public byte[] f;
        public Integer g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f5480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f5481i;
        public Integer j;
        public Boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f5482l;
        public Integer m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Integer f5483n;
        public Integer o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Integer f5484p;
        public Integer q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence f5485u;
        public CharSequence v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Integer f5486w;

        public final void a(int i2, byte[] bArr) {
            if (this.f != null) {
                Integer numValueOf = Integer.valueOf(i2);
                int i3 = Util.f5683a;
                if (!numValueOf.equals(3) && Util.a(this.g, 3)) {
                    return;
                }
            }
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i2);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    static {
        a.s(0, 1, 2, 3, 4);
        a.s(5, 6, 8, 9, 10);
        a.s(11, 12, 13, 14, 15);
        a.s(16, 17, 18, 19, 20);
        a.s(21, 22, 23, 24, 25);
        a.s(26, 27, 28, 29, 30);
        Util.E(31);
        Util.E(32);
        Util.E(33);
        Util.E(1000);
    }

    public MediaMetadata(Builder builder) {
        Boolean boolValueOf = builder.k;
        Integer numValueOf = builder.j;
        Integer numValueOf2 = builder.f5486w;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i2 = 0;
                            break;
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                    i4 = i2;
                }
                numValueOf = Integer.valueOf(i4);
            }
        } else if (numValueOf != null) {
            boolean z2 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z2);
            if (z2 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i3 = 21;
                        break;
                    case 3:
                        i3 = 22;
                        break;
                    case 4:
                        i3 = 23;
                        break;
                    case 5:
                        i3 = 24;
                        break;
                    case 6:
                        i3 = 25;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i3);
            }
        }
        this.f5465a = builder.f5476a;
        this.f5466b = builder.f5477b;
        this.f5467c = builder.f5478c;
        this.d = builder.d;
        this.f5468e = builder.f5479e;
        this.f = builder.f;
        this.g = builder.g;
        this.f5469h = builder.f5480h;
        this.f5470i = builder.f5481i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = builder.f5482l;
        this.f5471l = num;
        this.m = num;
        this.f5472n = builder.m;
        this.o = builder.f5483n;
        this.f5473p = builder.o;
        this.q = builder.f5484p;
        this.r = builder.q;
        this.s = builder.r;
        this.t = builder.s;
        this.f5474u = builder.t;
        this.v = builder.f5485u;
        this.f5475w = builder.v;
        this.x = numValueOf2;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f5476a = this.f5465a;
        builder.f5477b = this.f5466b;
        builder.f5478c = this.f5467c;
        builder.d = this.d;
        builder.f5479e = this.f5468e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f5480h = this.f5469h;
        builder.f5481i = this.f5470i;
        builder.j = this.j;
        builder.k = this.k;
        builder.f5482l = this.m;
        builder.m = this.f5472n;
        builder.f5483n = this.o;
        builder.o = this.f5473p;
        builder.f5484p = this.q;
        builder.q = this.r;
        builder.r = this.s;
        builder.s = this.t;
        builder.t = this.f5474u;
        builder.f5485u = this.v;
        builder.v = this.f5475w;
        builder.f5486w = this.x;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Util.a(this.f5465a, mediaMetadata.f5465a) && Util.a(this.f5466b, mediaMetadata.f5466b) && Util.a(this.f5467c, mediaMetadata.f5467c) && Util.a(this.d, mediaMetadata.d) && Util.a(this.f5468e, mediaMetadata.f5468e) && Arrays.equals(this.f, mediaMetadata.f) && Util.a(this.g, mediaMetadata.g) && Util.a(this.f5469h, mediaMetadata.f5469h) && Util.a(this.f5470i, mediaMetadata.f5470i) && Util.a(this.j, mediaMetadata.j) && Util.a(this.k, mediaMetadata.k) && Util.a(this.m, mediaMetadata.m) && Util.a(this.f5472n, mediaMetadata.f5472n) && Util.a(this.o, mediaMetadata.o) && Util.a(this.f5473p, mediaMetadata.f5473p) && Util.a(this.q, mediaMetadata.q) && Util.a(this.r, mediaMetadata.r) && Util.a(this.s, mediaMetadata.s) && Util.a(this.t, mediaMetadata.t) && Util.a(this.f5474u, mediaMetadata.f5474u) && Util.a(this.v, mediaMetadata.v) && Util.a(this.f5475w, mediaMetadata.f5475w) && Util.a(this.x, mediaMetadata.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5465a, this.f5466b, this.f5467c, this.d, null, null, this.f5468e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.f5469h, this.f5470i, this.j, this.k, null, this.m, this.f5472n, this.o, this.f5473p, this.q, this.r, this.s, this.t, this.f5474u, null, null, this.v, null, this.f5475w, this.x, true});
    }
}
