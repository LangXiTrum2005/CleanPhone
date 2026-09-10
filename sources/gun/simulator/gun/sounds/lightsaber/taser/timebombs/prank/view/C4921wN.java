package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4921wN extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5177a;
    public final boolean b;
    public final C4745uN c;
    public final String d;

    public C4921wN(int i, C4619sw c4619sw, DN dn, boolean z) {
        this("Decoder init failed: [" + i + "], " + c4619sw, dn, c4619sw.l, z, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C4921wN(String str, Throwable th, String str2, boolean z, C4745uN c4745uN, String str3) {
        super(str, th);
        this.f5177a = str2;
        this.b = z;
        this.c = c4745uN;
        this.d = str3;
    }
}
