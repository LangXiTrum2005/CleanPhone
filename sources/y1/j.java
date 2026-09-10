package y1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.internal.ads.qx1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    ByteBuffer A(int i10);

    void B(ArrayList arrayList);

    void C(ArrayList arrayList);

    void b(Bundle bundle);

    void c(int i10, qx1 qx1Var, long j10, int i11);

    void d(int i10, int i11, int i12, long j10);

    void flush();

    MediaFormat j();

    default void k(w1.b bVar) {
        bVar.run();
    }

    void l();

    void o(h9.h hVar, Handler handler);

    default boolean p(x xVar) {
        return false;
    }

    ByteBuffer q(int i10);

    void r(Surface surface);

    void release();

    void setVideoScalingMode(int i10);

    void t(int i10);

    void v(int i10, long j10);

    int w();

    int x(MediaCodec.BufferInfo bufferInfo);
}
