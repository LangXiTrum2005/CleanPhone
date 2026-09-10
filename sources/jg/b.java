package jg;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface b {
    boolean a(vf.c cVar);

    void b(vf.c cVar);

    void c(vf.c cVar);

    MediaFormat d(vf.c cVar);

    void e(f2.e eVar);

    boolean f();

    void g();

    long getDurationUs();

    double[] getLocation();

    int getOrientation();

    long getPositionUs();

    void initialize();

    boolean isInitialized();
}
