package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f6892c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6893e;
    public boolean f;
    public int g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.f6891b = new ParsableByteArray(NalUnitUtil.f5695a);
        this.f6892c = new ParsableByteArray(4);
    }
}
