package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4874vo implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f5154a;
    public final int b;
    public final int c;
    public final InterfaceC3567gx d;

    public C4874vo(CharSequence charSequence, int i, int i2, C3000aa0 c3000aa0) {
        AbstractC2995aW.q(charSequence, "input");
        this.f5154a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = c3000aa0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new C4786uo(this);
    }
}
