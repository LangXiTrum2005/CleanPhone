package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class Track {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7141c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7142e;
    public final Format f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f7143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f7144i;
    public final int j;
    public final TrackEncryptionBox[] k;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i2, int i3, long j, long j2, long j3, Format format, int i4, TrackEncryptionBox[] trackEncryptionBoxArr, int i5, long[] jArr, long[] jArr2) {
        this.f7139a = i2;
        this.f7140b = i3;
        this.f7141c = j;
        this.d = j2;
        this.f7142e = j3;
        this.f = format;
        this.g = i4;
        this.k = trackEncryptionBoxArr;
        this.j = i5;
        this.f7143h = jArr;
        this.f7144i = jArr2;
    }
}
