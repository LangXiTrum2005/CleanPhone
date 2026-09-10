package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4306pN {
    MediaFormat a();

    ByteBuffer b(int i);

    void c(Surface surface);

    void d(JN jn, Handler handler);

    void e(Bundle bundle);

    void f(int i, long j);

    void flush();

    int g();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(int i, C2339Ck c2339Ck, long j);

    void j(int i, boolean z);

    ByteBuffer k(int i);

    void l(int i, int i2, long j, int i3);

    void release();

    void setVideoScalingMode(int i);
}
