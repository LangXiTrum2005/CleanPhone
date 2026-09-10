package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2758So implements ModelLoaderFactory, InterfaceC2836Vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3738a;
    public Context b;

    public C2758So() {
        this.f3738a = 4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final Class a() {
        switch (this.f3738a) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final void b(Object obj) throws IOException {
        switch (this.f3738a) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final Object c(Resources resources, int i, Resources.Theme theme) {
        switch (this.f3738a) {
            case 0:
                return resources.openRawResourceFd(i);
            default:
                return resources.openRawResource(i);
        }
    }

    public final C2624Nk d() {
        Context context = this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C2624Nk c2624Nk = new C2624Nk();
        c2624Nk.f3473a = C2370Dp.a(AbstractC2995aW.b);
        C4559sD c4559sD = new C4559sD(context);
        c2624Nk.b = c4559sD;
        Qm0 qm0 = BF.f;
        C4710tz c4710tz = AbstractC4496rb.j;
        c2624Nk.c = C2370Dp.a(new C3692iN(25, c4559sD, new C4954wk(c4559sD, qm0, c4710tz, 0)));
        C4559sD c4559sD2 = c2624Nk.b;
        c2624Nk.d = new C4954wk(c4559sD2, AbstractC2845Vx.c, AbstractC2871Wx.c, 1);
        InterfaceC5194zW interfaceC5194zWA = C2370Dp.a(new Xd0(qm0, c4710tz, WD.g, c2624Nk.d, C2370Dp.a(new Wm0(c4559sD2, 19)), 2));
        c2624Nk.e = interfaceC5194zWA;
        NN nn = new NN(qm0, 18);
        C4559sD c4559sD3 = c2624Nk.b;
        C3490g30 c3490g30 = new C3490g30(c4559sD3, interfaceC5194zWA, nn, c4710tz, 0);
        InterfaceC5194zW interfaceC5194zW = c2624Nk.f3473a;
        InterfaceC5194zW interfaceC5194zW2 = c2624Nk.c;
        Xd0 xd0 = new Xd0(interfaceC5194zW, interfaceC5194zW2, c3490g30, interfaceC5194zWA, interfaceC5194zWA, 1);
        OK ok = new OK();
        ok.f3500a = c4559sD3;
        ok.b = interfaceC5194zW2;
        ok.c = interfaceC5194zWA;
        ok.d = c3490g30;
        ok.e = interfaceC5194zW;
        ok.f = interfaceC5194zWA;
        ok.g = qm0;
        ok.h = c4710tz;
        ok.i = interfaceC5194zWA;
        c2624Nk.f = C2370Dp.a(new Xd0(qm0, c4710tz, xd0, ok, new C3490g30(interfaceC5194zW, interfaceC5194zWA, c3490g30, interfaceC5194zWA, 1), 0));
        return c2624Nk;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        switch (this.f3738a) {
            case 0:
                return new C2862Wo(this.b, this);
            case 1:
                return new C2862Wo(this.b, this);
            case 2:
                return new C2862Wo(this.b, c3166cQ.c(Integer.class, InputStream.class));
            default:
                return new QO(this.b, 1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2758So(int i) {
        this();
        this.f3738a = 4;
    }

    public /* synthetic */ C2758So(Context context, int i) {
        this.f3738a = i;
        this.b = context;
    }
}
