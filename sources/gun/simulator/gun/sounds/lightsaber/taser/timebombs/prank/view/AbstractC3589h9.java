package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3589h9 implements InterfaceC3759j7 {
    public C3585h7 b;
    public C3585h7 c;
    public C3585h7 d;
    public C3585h7 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public AbstractC3589h9() {
        ByteBuffer byteBuffer = InterfaceC3759j7.f4537a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        C3585h7 c3585h7 = C3585h7.e;
        this.d = c3585h7;
        this.e = c3585h7;
        this.b = c3585h7;
        this.c = c3585h7;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final C3585h7 a(C3585h7 c3585h7) {
        this.d = c3585h7;
        this.e = b(c3585h7);
        return isActive() ? this.e : C3585h7.e;
    }

    public abstract C3585h7 b(C3585h7 c3585h7);

    public final ByteBuffer f(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void flush() {
        this.g = InterfaceC3759j7.f4537a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        c();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC3759j7.f4537a;
        return byteBuffer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public boolean isActive() {
        return this.e != C3585h7.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public boolean isEnded() {
        return this.h && this.g == InterfaceC3759j7.f4537a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueEndOfStream() {
        this.h = true;
        d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void reset() {
        flush();
        this.f = InterfaceC3759j7.f4537a;
        C3585h7 c3585h7 = C3585h7.e;
        this.d = c3585h7;
        this.e = c3585h7;
        this.b = c3585h7;
        this.c = c3585h7;
        e();
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
