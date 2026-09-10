package jg;

import android.media.MediaFormat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f43836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaFormat f43837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43838d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43839e = false;

    public a(long j10) {
        this.f43835a = j10;
    }

    @Override // jg.b
    public final boolean a(vf.c cVar) {
        return cVar == vf.c.AUDIO;
    }

    @Override // jg.b
    public final MediaFormat d(vf.c cVar) {
        if (cVar == vf.c.AUDIO) {
            return this.f43837c;
        }
        return null;
    }

    @Override // jg.b
    public final void e(f2.e eVar) {
        int iPosition = ((ByteBuffer) eVar.f40323d).position();
        int iMin = Math.min(((ByteBuffer) eVar.f40323d).remaining(), Segment.SIZE);
        this.f43836b.clear();
        this.f43836b.limit(iMin);
        ((ByteBuffer) eVar.f40323d).put(this.f43836b);
        ((ByteBuffer) eVar.f40323d).position(iPosition);
        ((ByteBuffer) eVar.f40323d).limit(iPosition + iMin);
        eVar.f40320a = true;
        long j10 = this.f43838d;
        eVar.f40321b = j10;
        eVar.f40322c = true;
        this.f43838d = ((((long) iMin) * 1000000) / ((long) 176400)) + j10;
    }

    @Override // jg.b
    public final boolean f() {
        return this.f43838d >= this.f43835a;
    }

    @Override // jg.b
    public final void g() {
        this.f43838d = 0L;
        this.f43839e = false;
    }

    @Override // jg.b
    public final long getDurationUs() {
        return this.f43835a;
    }

    @Override // jg.b
    public final double[] getLocation() {
        return null;
    }

    @Override // jg.b
    public final int getOrientation() {
        return 0;
    }

    @Override // jg.b
    public final long getPositionUs() {
        return this.f43838d;
    }

    @Override // jg.b
    public final void initialize() {
        this.f43836b = ByteBuffer.allocateDirect(Segment.SIZE).order(ByteOrder.nativeOrder());
        MediaFormat mediaFormat = new MediaFormat();
        this.f43837c = mediaFormat;
        mediaFormat.setString("mime", MimeTypes.AUDIO_RAW);
        this.f43837c.setInteger("bitrate", 1411200);
        this.f43837c.setInteger("channel-count", 2);
        this.f43837c.setInteger("max-input-size", Segment.SIZE);
        this.f43837c.setInteger("sample-rate", 44100);
        this.f43839e = true;
    }

    @Override // jg.b
    public final boolean isInitialized() {
        return this.f43839e;
    }

    @Override // jg.b
    public final void b(vf.c cVar) {
    }

    @Override // jg.b
    public final void c(vf.c cVar) {
    }
}
