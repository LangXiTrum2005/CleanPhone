package com.google.android.exoplayer2.decoder;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderCounters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17428c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17429e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17431i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17432l;

    public final String toString() {
        int i2 = this.f17426a;
        int i3 = this.f17427b;
        int i4 = this.f17428c;
        int i5 = this.d;
        int i6 = this.f17429e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.f17430h;
        int i10 = this.f17431i;
        int i11 = this.j;
        long j = this.k;
        int i12 = this.f17432l;
        int i13 = Util.f18979a;
        Locale locale = Locale.US;
        StringBuilder sbP = a.p(i2, i3, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        a.y(sbP, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
        a.y(sbP, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
        a.y(sbP, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
        a.y(sbP, i10, "\n droppedToKeyframeEvents=", i11, "\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i12);
        sbP.append("\n}");
        return sbP.toString();
    }
}
