package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2339Ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f2937a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final C2313Bk j;

    public C2339Ck() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = Ug0.f3833a >= 24 ? new C2313Bk(cryptoInfo) : null;
    }
}
