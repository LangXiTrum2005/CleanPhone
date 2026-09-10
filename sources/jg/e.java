package jg;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import cc.a2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f43847n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec.a f43848a = new ec.a("DefaultDataSource(" + f43847n.getAndIncrement() + ")");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.e f43849b = new wf.e((Object) null, (Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf.e f43850c = new wf.e((Object) null, (Object) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f43851d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wf.e f43852e = new wf.e((Object) 0L, (Object) 0L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaMetadataRetriever f43853f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaExtractor f43854g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43855h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43856i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f43857j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f43858k = -1;
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f43859m;

    public e(Context context, Uri uri) {
        this.l = context.getApplicationContext();
        this.f43859m = uri;
    }

    @Override // jg.b
    public final boolean a(vf.c cVar) {
        return this.f43854g.getSampleTrackIndex() == ((Integer) this.f43850c.l(cVar)).intValue();
    }

    @Override // jg.b
    public final void b(vf.c cVar) {
        this.f43848a.a("selectTrack(" + cVar + ")");
        HashSet hashSet = this.f43851d;
        if (hashSet.contains(cVar)) {
            return;
        }
        hashSet.add(cVar);
        this.f43854g.selectTrack(((Integer) this.f43850c.l(cVar)).intValue());
    }

    @Override // jg.b
    public final void c(vf.c cVar) {
        this.f43848a.a("releaseTrack(" + cVar + ")");
        HashSet hashSet = this.f43851d;
        if (hashSet.contains(cVar)) {
            hashSet.remove(cVar);
            this.f43854g.unselectTrack(((Integer) this.f43850c.l(cVar)).intValue());
        }
    }

    @Override // jg.b
    public final MediaFormat d(vf.c cVar) {
        this.f43848a.a("getTrackFormat(" + cVar + ")");
        wf.e eVar = this.f43849b;
        eVar.getClass();
        return (MediaFormat) eg.a.a(eVar, cVar);
    }

    @Override // jg.b
    public final void e(f2.e eVar) {
        if (this.f43855h == Long.MIN_VALUE) {
            this.f43855h = this.f43854g.getSampleTime();
        }
        int sampleTrackIndex = this.f43854g.getSampleTrackIndex();
        int iPosition = ((ByteBuffer) eVar.f40323d).position();
        int iLimit = ((ByteBuffer) eVar.f40323d).limit();
        int sampleData = this.f43854g.readSampleData((ByteBuffer) eVar.f40323d, iPosition);
        if (sampleData < 0) {
            throw new IllegalStateException("No samples available! Forgot to call canReadTrack / isDrained?");
        }
        int i10 = sampleData + iPosition;
        if (i10 > iLimit) {
            throw new IllegalStateException("MediaExtractor is not respecting the buffer limit. This might cause other issues down the pipeline.");
        }
        ((ByteBuffer) eVar.f40323d).limit(i10);
        ((ByteBuffer) eVar.f40323d).position(iPosition);
        eVar.f40320a = (this.f43854g.getSampleFlags() & 1) != 0;
        long sampleTime = this.f43854g.getSampleTime();
        eVar.f40321b = sampleTime;
        eVar.f40322c = sampleTime < this.f43857j || sampleTime >= this.f43858k;
        String str = "readTrack(): time=" + eVar.f40321b + ", render=" + eVar.f40322c + ", end=" + this.f43858k;
        ec.a aVar = this.f43848a;
        aVar.c(str);
        wf.e eVar2 = this.f43850c;
        eVar2.getClass();
        vf.c cVar = vf.c.AUDIO;
        if (!eVar2.k(cVar) || ((Integer) eVar2.l(cVar)).intValue() != sampleTrackIndex) {
            cVar = vf.c.VIDEO;
            if (!eVar2.k(cVar) || ((Integer) eVar2.l(cVar)).intValue() != sampleTrackIndex) {
                cVar = null;
            }
        }
        if (cVar == null) {
            throw new RuntimeException(l1.d.e(sampleTrackIndex, "Unknown type: "));
        }
        this.f43852e.b(cVar, Long.valueOf(eVar.f40321b));
        this.f43854g.advance();
        if (eVar.f40322c || !f()) {
            return;
        }
        aVar.b(2, null, "Force rendering the last frame. timeUs=" + eVar.f40321b);
        eVar.f40322c = true;
    }

    @Override // jg.b
    public final boolean f() {
        return this.f43854g.getSampleTrackIndex() < 0;
    }

    @Override // jg.b
    public final void g() {
        ec.a aVar = this.f43848a;
        aVar.a("deinitialize(): deinitializing...");
        try {
            this.f43854g.release();
        } catch (Exception e10) {
            aVar.b(2, e10, "Could not release extractor:");
        }
        try {
            this.f43853f.release();
        } catch (Exception e11) {
            aVar.b(2, e11, "Could not release metadata:");
        }
        this.f43851d.clear();
        this.f43855h = Long.MIN_VALUE;
        wf.e eVar = this.f43852e;
        vf.c cVar = vf.c.VIDEO;
        eVar.b(cVar, 0L);
        vf.c cVar2 = vf.c.AUDIO;
        eVar.b(cVar2, 0L);
        wf.e eVar2 = this.f43849b;
        eVar2.b(cVar, null);
        eVar2.b(cVar2, null);
        wf.e eVar3 = this.f43850c;
        eVar3.b(cVar, null);
        eVar3.b(cVar2, null);
        this.f43857j = -1L;
        this.f43858k = -1L;
        this.f43856i = false;
    }

    @Override // jg.b
    public final long getDurationUs() {
        try {
            return Long.parseLong(this.f43853f.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // jg.b
    public final double[] getLocation() {
        float[] fArr;
        this.f43848a.a("getLocation()");
        String strExtractMetadata = this.f43853f.extractMetadata(23);
        if (strExtractMetadata != null) {
            Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(strExtractMetadata);
            if (matcher.find() && matcher.groupCount() == 2) {
                try {
                    fArr = new float[]{Float.parseFloat(matcher.group(1)), Float.parseFloat(matcher.group(2))};
                } catch (NumberFormatException unused) {
                    fArr = null;
                }
            } else {
                fArr = null;
            }
            if (fArr != null) {
                return new double[]{fArr[0], fArr[1]};
            }
        }
        return null;
    }

    @Override // jg.b
    public final int getOrientation() {
        this.f43848a.a("getOrientation()");
        try {
            return Integer.parseInt(this.f43853f.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // jg.b
    public final long getPositionUs() {
        if (this.f43855h == Long.MIN_VALUE) {
            return 0L;
        }
        wf.e eVar = this.f43852e;
        eVar.getClass();
        long jLongValue = ((Long) eVar.l(vf.c.AUDIO)).longValue();
        eVar.getClass();
        return Math.max(jLongValue, ((Long) eVar.l(vf.c.VIDEO)).longValue()) - this.f43855h;
    }

    @Override // jg.b
    public final void initialize() {
        Uri uri = this.f43859m;
        Context context = this.l;
        ec.a aVar = this.f43848a;
        aVar.a("initialize(): initializing...");
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f43854g = mediaExtractor;
        try {
            mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f43853f = mediaMetadataRetriever;
            mediaMetadataRetriever.setDataSource(context, uri);
            int trackCount = this.f43854g.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                MediaFormat trackFormat = this.f43854g.getTrackFormat(i10);
                vf.c cVarV = a2.v(trackFormat);
                if (cVarV != null) {
                    wf.e eVar = this.f43850c;
                    if (!eVar.k(cVarV)) {
                        eVar.b(cVarV, Integer.valueOf(i10));
                        this.f43849b.b(cVarV, trackFormat);
                    }
                }
            }
            this.f43856i = true;
        } catch (IOException e10) {
            aVar.b(3, e10, "Got IOException while trying to open MediaExtractor.");
            throw new RuntimeException(e10);
        }
    }

    @Override // jg.b
    public final boolean isInitialized() {
        return this.f43856i;
    }
}
