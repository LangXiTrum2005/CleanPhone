package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4715u10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f5060a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SurfaceHolder d;
    public final /* synthetic */ Bitmap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4715u10(SurfaceHolder surfaceHolder, Bitmap bitmap, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.d = surfaceHolder;
        this.e = bitmap;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4715u10 c4715u10 = new C4715u10(this.d, this.e, interfaceC2857Wj);
        c4715u10.c = obj;
        return c4715u10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4715u10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        SurfaceHolder surfaceHolder;
        Canvas canvas;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            surfaceHolder = this.d;
            Canvas canvasLockCanvas = surfaceHolder.lockCanvas();
            if (canvasLockCanvas == null) {
                return null;
            }
            canvasLockCanvas.drawColor(ViewCompat.MEASURED_STATE_MASK);
            C4627t10 c4627t10 = new C4627t10(this.e, canvasLockCanvas.getWidth(), canvasLockCanvas.getHeight(), null);
            this.c = surfaceHolder;
            this.f5060a = canvasLockCanvas;
            this.b = 1;
            Object objX = WD.X(c4627t10, AbstractC4437qp.b, this);
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
            canvas = canvasLockCanvas;
            obj = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            canvas = this.f5060a;
            surfaceHolder = (SurfaceHolder) this.c;
            AbstractC3375el.b0(obj);
        }
        AbstractC2995aW.p(obj, "withIO(...)");
        canvas.drawBitmap((Bitmap) obj, 0.0f, 0.0f, (Paint) null);
        surfaceHolder.unlockCanvasAndPost(canvas);
        return C5033xf0.f5238a;
    }
}
