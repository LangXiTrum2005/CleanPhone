package androidx.media3.exoplayer;

import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderCounters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5825c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5826e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5828i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5829l;

    public final String toString() {
        int i2 = this.f5823a;
        int i3 = this.f5824b;
        int i4 = this.f5825c;
        int i5 = this.d;
        int i6 = this.f5826e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.f5827h;
        int i10 = this.f5828i;
        int i11 = this.j;
        long j = this.k;
        int i12 = this.f5829l;
        int i13 = Util.f5683a;
        Locale locale = Locale.US;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i10, "\n droppedToKeyframeEvents=", i11, "\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i12);
        sbP.append("\n}");
        return sbP.toString();
    }
}
