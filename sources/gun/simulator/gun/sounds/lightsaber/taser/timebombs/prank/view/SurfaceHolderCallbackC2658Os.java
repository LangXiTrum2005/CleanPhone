package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class SurfaceHolderCallbackC2658Os implements Hh0, Wb0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC3321e7, M90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2736Rs f3526a;

    public SurfaceHolderCallbackC2658Os(C2736Rs c2736Rs) {
        this.f3526a = c2736Rs;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2736Rs c2736Rs = this.f3526a;
        c2736Rs.getClass();
        Surface surface = new Surface(surfaceTexture);
        c2736Rs.L(surface);
        c2736Rs.Q = surface;
        c2736Rs.C(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2736Rs c2736Rs = this.f3526a;
        c2736Rs.L(null);
        c2736Rs.C(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f3526a.C(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f3526a.C(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2736Rs c2736Rs = this.f3526a;
        if (c2736Rs.T) {
            c2736Rs.L(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2736Rs c2736Rs = this.f3526a;
        if (c2736Rs.T) {
            c2736Rs.L(null);
        }
        c2736Rs.C(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
