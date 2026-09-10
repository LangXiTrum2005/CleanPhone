package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22032k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22033m;

    public /* synthetic */ xx1(int i10) {
        this.f22022a = i10;
    }

    public synchronized void a() {
    }

    public final String toString() {
        switch (this.f22022a) {
            case 0:
                int i10 = this.f22023b;
                int i11 = this.f22024c;
                int i12 = this.f22025d;
                int i13 = this.f22026e;
                int i14 = this.f22027f;
                int i15 = this.f22028g;
                int i16 = this.f22029h;
                int i17 = this.f22030i;
                int i18 = this.f22031j;
                int i19 = this.f22032k;
                long j10 = this.l;
                int i20 = this.f22033m;
                String str = uu0.f20901a;
                Locale locale = Locale.US;
                StringBuilder sbL = l1.d.l("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
                l1.d.o(sbL, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
                l1.d.o(sbL, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
                l1.d.o(sbL, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
                l1.d.o(sbL, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
                sbL.append(j10);
                sbL.append("\n videoFrameProcessingOffsetCount=");
                sbL.append(i20);
                sbL.append("\n}");
                return sbL.toString();
            default:
                int i21 = this.f22023b;
                int i22 = this.f22024c;
                int i23 = this.f22025d;
                int i24 = this.f22026e;
                int i25 = this.f22027f;
                int i26 = this.f22028g;
                int i27 = this.f22029h;
                int i28 = this.f22030i;
                int i29 = this.f22031j;
                int i30 = this.f22032k;
                long j11 = this.l;
                int i31 = this.f22033m;
                String str2 = l1.y.f44830a;
                Locale locale2 = Locale.US;
                StringBuilder sbL2 = l1.d.l("DecoderCounters {\n decoderInits=", i21, ",\n decoderReleases=", i22, "\n queuedInputBuffers=");
                l1.d.o(sbL2, i23, "\n skippedInputBuffers=", i24, "\n renderedOutputBuffers=");
                l1.d.o(sbL2, i25, "\n skippedOutputBuffers=", i26, "\n droppedBuffers=");
                l1.d.o(sbL2, i27, "\n droppedInputBuffers=", i28, "\n maxConsecutiveDroppedBuffers=");
                l1.d.o(sbL2, i29, "\n droppedToKeyframeEvents=", i30, "\n totalVideoFrameProcessingOffsetUs=");
                sbL2.append(j11);
                sbL2.append("\n videoFrameProcessingOffsetCount=");
                sbL2.append(i31);
                sbL2.append("\n}");
                return sbL2.toString();
        }
    }
}
