package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class E40 implements D40, InterfaceC2331Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D40 f3005a;
    public final String b;
    public final Set c;

    public E40(D40 d40) {
        AbstractC2995aW.q(d40, "original");
        this.f3005a = d40;
        this.b = d40.h() + '?';
        this.c = AbstractC2871Wx.Q(d40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2331Cc
    public final Set a() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean b() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int c(String str) {
        AbstractC2995aW.q(str, "name");
        return this.f3005a.c(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final int d() {
        return this.f3005a.d();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String e(int i) {
        return this.f3005a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E40) {
            return AbstractC2995aW.i(this.f3005a, ((E40) obj).f3005a);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List f(int i) {
        return this.f3005a.f(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final D40 g(int i) {
        return this.f3005a.g(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final List getAnnotations() {
        return this.f3005a.getAnnotations();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final L40 getKind() {
        return this.f3005a.getKind();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.f3005a.hashCode() * 31;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean i(int i) {
        return this.f3005a.i(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final boolean isInline() {
        return this.f3005a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3005a);
        sb.append('?');
        return sb.toString();
    }
}
