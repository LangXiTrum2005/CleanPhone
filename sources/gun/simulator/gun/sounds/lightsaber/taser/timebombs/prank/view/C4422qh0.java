package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4422qh0 extends GLSurfaceView implements InterfaceC4597sh0 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4334ph0 f4895a;

    public C4422qh0(Context context) {
        super(context, null);
        C4334ph0 c4334ph0 = new C4334ph0(this);
        this.f4895a = c4334ph0;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c4334ph0);
        setRenderMode(0);
    }

    public void setOutputBuffer(AbstractC4509rh0 abstractC4509rh0) {
        C4334ph0 c4334ph0 = this.f4895a;
        AbstractC3950lJ.z(c4334ph0.f.getAndSet(abstractC4509rh0));
        c4334ph0.f4845a.requestRender();
    }

    @Deprecated
    public InterfaceC4597sh0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
