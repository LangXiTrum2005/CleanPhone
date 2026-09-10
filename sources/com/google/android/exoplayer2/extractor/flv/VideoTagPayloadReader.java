package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17645c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17646e;
    public boolean f;
    public int g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.f17644b = new ParsableByteArray(NalUnitUtil.f18927a);
        this.f17645c = new ParsableByteArray(4);
    }
}
