package jg;

import android.media.MediaExtractor;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ec.a f43841g = new ec.a("TrimDataSource");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43846f;

    public d(e eVar, long j10, long j11) {
        this.f43840a = eVar;
        this.f43844d = 0L;
        this.f43845e = Long.MIN_VALUE;
        this.f43846f = false;
        if (j10 < 0 || j11 < 0) {
            throw new IllegalArgumentException("Trim values cannot be negative.");
        }
        this.f43842b = j10;
        this.f43843c = j11;
    }

    @Override // jg.b
    public final boolean a(vf.c cVar) {
        e eVar = this.f43840a;
        if (!this.f43846f) {
            long j10 = this.f43842b;
            if (j10 > 0) {
                wf.e eVar2 = eVar.f43850c;
                if (eVar.f43855h == Long.MIN_VALUE) {
                    eVar.f43855h = eVar.f43854g.getSampleTime();
                }
                HashSet hashSet = eVar.f43851d;
                boolean zContains = hashSet.contains(vf.c.VIDEO);
                vf.c cVar2 = vf.c.AUDIO;
                boolean zContains2 = hashSet.contains(cVar2);
                ec.a aVar = eVar.f43848a;
                aVar.a("seekTo(): seeking to " + (eVar.f43855h + j10) + " originUs=" + eVar.f43855h + " extractorUs=" + eVar.f43854g.getSampleTime() + " externalUs=" + j10 + " hasVideo=" + zContains + " hasAudio=" + zContains2);
                if (zContains && zContains2) {
                    MediaExtractor mediaExtractor = eVar.f43854g;
                    eVar2.getClass();
                    mediaExtractor.unselectTrack(((Integer) eVar2.l(cVar2)).intValue());
                    aVar.c("seekTo(): unselected AUDIO, seeking to " + (eVar.f43855h + j10) + " (extractorUs=" + eVar.f43854g.getSampleTime() + ")");
                    eVar.f43854g.seekTo(eVar.f43855h + j10, 0);
                    StringBuilder sb2 = new StringBuilder("seekTo(): unselected AUDIO and sought (extractorUs=");
                    sb2.append(eVar.f43854g.getSampleTime());
                    sb2.append(")");
                    aVar.c(sb2.toString());
                    eVar.f43854g.selectTrack(((Integer) eVar2.l(cVar2)).intValue());
                    aVar.c("seekTo(): reselected AUDIO, seeking to extractorUs (extractorUs=" + eVar.f43854g.getSampleTime() + ")");
                    MediaExtractor mediaExtractor2 = eVar.f43854g;
                    mediaExtractor2.seekTo(mediaExtractor2.getSampleTime(), 2);
                    aVar.c("seekTo(): seek workaround completed. (extractorUs=" + eVar.f43854g.getSampleTime() + ")");
                } else {
                    eVar.f43854g.seekTo(eVar.f43855h + j10, 0);
                }
                long sampleTime = eVar.f43854g.getSampleTime();
                eVar.f43857j = sampleTime;
                long j11 = eVar.f43855h + j10;
                eVar.f43858k = j11;
                if (sampleTime > j11) {
                    eVar.f43857j = j11;
                }
                aVar.a("seekTo(): dontRenderRange=" + eVar.f43857j + ".." + eVar.f43858k + " (" + (eVar.f43858k - eVar.f43857j) + "us)");
                this.f43844d = j10 - (eVar.f43854g.getSampleTime() - eVar.f43855h);
                StringBuilder sb3 = new StringBuilder("canReadTrack(): extraDurationUs=");
                sb3.append(this.f43844d);
                q4.a.r(sb3, " trimStartUs=", j10, " source.seekTo(trimStartUs)=");
                sb3.append(this.f43844d - j10);
                f43841g.a(sb3.toString());
                this.f43846f = true;
            }
        }
        return eVar.a(cVar);
    }

    @Override // jg.b
    public final boolean f() {
        return this.f43840a.f() || getPositionUs() >= getDurationUs();
    }

    @Override // jg.b
    public final void g() {
        this.f43840a.g();
        this.f43845e = Long.MIN_VALUE;
        this.f43846f = false;
    }

    @Override // jg.b
    public final long getDurationUs() {
        return this.f43845e + this.f43844d;
    }

    @Override // jg.b
    public final long getPositionUs() {
        return (this.f43840a.getPositionUs() - this.f43842b) + this.f43844d;
    }

    @Override // jg.b
    public final void initialize() {
        e eVar = this.f43840a;
        if (!isInitialized()) {
            if (eVar == null) {
                throw new NullPointerException("DataSourceWrapper's source is not set!");
            }
            eVar.initialize();
        }
        long durationUs = eVar.getDurationUs();
        long j10 = this.f43842b;
        long j11 = this.f43843c;
        long j12 = j10 + j11;
        ec.a aVar = f43841g;
        if (j12 >= durationUs) {
            StringBuilder sbL = wi.d.l(j10, "Trim values are too large! start=", ", end=");
            sbL.append(j11);
            aVar.b(2, null, defpackage.e.s(sbL, ", duration=", durationUs));
            throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
        }
        StringBuilder sbL2 = wi.d.l(durationUs, "initialize(): duration=", " trimStart=");
        sbL2.append(j10);
        sbL2.append(" trimEnd=");
        sbL2.append(j11);
        sbL2.append(" trimDuration=");
        long j13 = (durationUs - j10) - j11;
        sbL2.append(j13);
        aVar.a(sbL2.toString());
        this.f43845e = j13;
    }

    @Override // jg.b
    public final boolean isInitialized() {
        e eVar = this.f43840a;
        return (eVar == null || !eVar.f43856i || this.f43845e == Long.MIN_VALUE) ? false : true;
    }
}
