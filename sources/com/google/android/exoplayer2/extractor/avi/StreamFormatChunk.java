package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
final class StreamFormatChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f17616a;

    public StreamFormatChunk(Format format) {
        this.f17616a = format;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public final int getType() {
        return 1718776947;
    }
}
