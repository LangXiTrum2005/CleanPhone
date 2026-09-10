package A;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.inmobi.media.O4;
import com.p004ironsource.hm;

/* JADX INFO: renamed from: A.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0916x implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ long f3202Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ RunnableC0916x(Object obj, long j, int i2) {
        this.X = i2;
        this.Z = obj;
        this.f3202Y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f3202Y;
        Object obj = this.Z;
        switch (this.X) {
            case 0:
                O4.a((O4) obj, j);
                break;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.d(j);
                break;
            case 2:
                com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i3 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher2.f17292b.d(j);
                break;
            default:
                hm.a((hm) obj, j);
                break;
        }
    }
}
