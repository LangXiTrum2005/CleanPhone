package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2611Mx implements Wa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3431a;
    public final int b;
    public IY c;
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public C2611Mx(Handler handler, int i, long j) {
        if (!Tg0.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f3431a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void a(InterfaceC4903w70 interfaceC4903w70) {
        ((T60) interfaceC4903w70).j(this.f3431a, this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void b(IY iy) {
        this.c = iy;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void c(Object obj) {
        this.g = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final IY e() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void f(Drawable drawable) {
        this.g = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final /* bridge */ /* synthetic */ void onDestroy() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final /* bridge */ /* synthetic */ void onStop() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final /* bridge */ /* synthetic */ void d(Drawable drawable) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final /* bridge */ /* synthetic */ void g(InterfaceC4903w70 interfaceC4903w70) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final /* bridge */ /* synthetic */ void h(Drawable drawable) {
    }
}
