package y1;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.e22;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.h f54101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f54102c;

    public /* synthetic */ a(j jVar, h9.h hVar, int i10) {
        this.f54100a = i10;
        this.f54102c = jVar;
        this.f54101b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f54100a) {
            case 0:
                ((e22) this.f54102c).getClass();
                this.f54101b.a(j10);
                break;
            default:
                ((v) this.f54102c).getClass();
                this.f54101b.a(j10);
                break;
        }
    }
}
