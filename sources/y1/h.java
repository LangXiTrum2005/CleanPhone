package y1;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import ta.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f54123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f54124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f54125c;

    public h() {
        g gVar = g.f54121a;
        this.f54123a = new HashSet();
        this.f54124b = gVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f54125c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            go.k.t(this.f54123a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f54123a.clear();
        LoudnessCodecController loudnessCodecController = this.f54125c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f54123a.remove(mediaCodec) || (loudnessCodecController = this.f54125c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f54125c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f54125c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, c0.f50592a, new f(this));
        this.f54125c = loudnessCodecControllerCreate;
        Iterator it = this.f54123a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
