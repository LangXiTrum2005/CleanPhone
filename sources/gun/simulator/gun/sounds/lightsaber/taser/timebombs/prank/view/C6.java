package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6 implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2908a;
    public final /* synthetic */ JN b;
    public final /* synthetic */ InterfaceC4306pN c;

    public /* synthetic */ C6(InterfaceC4306pN interfaceC4306pN, JN jn, int i) {
        this.f2908a = i;
        this.c = interfaceC4306pN;
        this.b = jn;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f2908a) {
            case 0:
                E6 e6 = (E6) this.c;
                JN jn = this.b;
                e6.getClass();
                jn.getClass();
                if (Ug0.f3833a >= 30) {
                    jn.a(j);
                } else {
                    Handler handler = jn.f3264a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Na0 na0 = (Na0) this.c;
                JN jn2 = this.b;
                na0.getClass();
                jn2.getClass();
                if (Ug0.f3833a >= 30) {
                    jn2.a(j);
                } else {
                    Handler handler2 = jn2.f3264a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
