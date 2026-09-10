package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2810Uo implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f3845a;
    public final Resources b;
    public final InterfaceC2836Vo c;
    public final int d;
    public Object e;

    public C2810Uo(Resources.Theme theme, Resources resources, InterfaceC2836Vo interfaceC2836Vo, int i) {
        this.f3845a = theme;
        this.b = resources;
        this.c = interfaceC2836Vo;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return this.c.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        try {
            Object objC = this.c.c(this.b, this.d, this.f3845a);
            this.e = objC;
            interfaceC3463fl.k(objC);
        } catch (Resources.NotFoundException e) {
            interfaceC3463fl.d(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}
