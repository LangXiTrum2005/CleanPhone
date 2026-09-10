package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2779Tj implements D40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D40 f3786a;
    public final InterfaceC3156cG b;
    public final String c;

    public C2779Tj(F40 f40, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(interfaceC3156cG, "kClass");
        this.f3786a = f40;
        this.b = interfaceC3156cG;
        this.c = f40.f3052a + '<' + ((C3186cf) interfaceC3156cG).b() + '>';
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return this.f3786a.b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        return this.f3786a.c(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return this.f3786a.d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return this.f3786a.e(i);
    }

    public final boolean equals(Object obj) {
        C2779Tj c2779Tj = obj instanceof C2779Tj ? (C2779Tj) obj : null;
        return c2779Tj != null && AbstractC2995aW.i(this.f3786a, c2779Tj.f3786a) && AbstractC2995aW.i(c2779Tj.b, this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        return this.f3786a.f(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        return this.f3786a.g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return this.f3786a.getAnnotations();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return this.f3786a.getKind();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        return this.f3786a.i(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return this.f3786a.isInline();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.f3786a + ')';
    }
}
