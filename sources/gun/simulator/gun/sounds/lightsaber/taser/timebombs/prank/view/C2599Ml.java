package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2599Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3420a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.f3420a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        int i12 = Ug0.f3833a;
        Locale locale = Locale.US;
        StringBuilder sbT = AbstractC3950lJ.t("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        AbstractC3888ke0.t(sbT, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC3888ke0.t(sbT, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC3888ke0.t(sbT, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC3888ke0.t(sbT, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbT.append(j);
        sbT.append("\n videoFrameProcessingOffsetCount=");
        sbT.append(i11);
        sbT.append("\n}");
        return sbT.toString();
    }
}
