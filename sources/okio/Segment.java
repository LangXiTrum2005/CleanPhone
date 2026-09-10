package okio;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Segment;", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Segment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45159c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45160e;
    public Segment f;
    public Segment g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokio/Segment$Companion;", "", "", "SHARE_MINIMUM", "I", "SIZE", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public Segment() {
        this.f45157a = new byte[com.applovin.shadow.okio.Segment.SIZE];
        this.f45160e = true;
        this.d = false;
    }

    public final Segment a() {
        Segment segment = this.f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.g;
        Intrinsics.c(segment2);
        segment2.f = this.f;
        Segment segment3 = this.f;
        Intrinsics.c(segment3);
        segment3.g = this.g;
        this.f = null;
        this.g = null;
        return segment;
    }

    public final void b(Segment segment) {
        Intrinsics.f(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        Segment segment2 = this.f;
        Intrinsics.c(segment2);
        segment2.g = segment;
        this.f = segment;
    }

    public final Segment c() {
        this.d = true;
        return new Segment(this.f45157a, this.f45158b, this.f45159c, true, false);
    }

    public final void d(Segment sink, int i2) {
        Intrinsics.f(sink, "sink");
        if (!sink.f45160e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = sink.f45159c;
        int i4 = i3 + i2;
        byte[] bArr = sink.f45157a;
        if (i4 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.f45158b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt.m(0, i5, i3, bArr, bArr);
            sink.f45159c -= sink.f45158b;
            sink.f45158b = 0;
        }
        int i6 = sink.f45159c;
        int i7 = this.f45158b;
        ArraysKt.m(i6, i7, i7 + i2, this.f45157a, bArr);
        sink.f45159c += i2;
        this.f45158b += i2;
    }

    public Segment(byte[] data, int i2, int i3, boolean z2, boolean z3) {
        Intrinsics.f(data, "data");
        this.f45157a = data;
        this.f45158b = i2;
        this.f45159c = i3;
        this.d = z2;
        this.f45160e = z3;
    }
}
