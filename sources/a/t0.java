package A;

import android.content.Context;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.applovin.impl.i5;
import com.inmobi.media.InterfaceC3333z5;
import com.p004ironsource.hm;
import com.unity3d.mediation.LevelPlayAdError;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ long f3195Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ t0(hm hmVar, long j, LevelPlayAdError levelPlayAdError) {
        this.X = 4;
        this.Z = hmVar;
        this.f3195Y = j;
        this.e0 = levelPlayAdError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e0;
        long j = this.f3195Y;
        Object obj2 = this.Z;
        switch (this.X) {
            case 0:
                com.inmobi.media.r.a((InterfaceC3333z5) obj2, (Context) obj, j);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher = (VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6667b.f(j, obj);
                break;
            case 2:
                ((i5) obj2).a((Thread) obj, j);
                break;
            case 3:
                com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher2.getClass();
                int i3 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher2.f19025b.f(j, obj);
                break;
            default:
                hm.a((hm) obj2, j, (LevelPlayAdError) obj);
                break;
        }
    }

    public /* synthetic */ t0(Object obj, Object obj2, long j, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f3195Y = j;
    }
}
