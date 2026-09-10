package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3629hg implements InterfaceC3549gk, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3549gk f4462a;
    public final InterfaceC3373ek b;

    public C3629hg(InterfaceC3373ek interfaceC3373ek, InterfaceC3549gk interfaceC3549gk) {
        AbstractC2995aW.q(interfaceC3549gk, TtmlNode.LEFT);
        AbstractC2995aW.q(interfaceC3373ek, "element");
        this.f4462a = interfaceC3549gk;
        this.b = interfaceC3373ek;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3629hg) {
                C3629hg c3629hg = (C3629hg) obj;
                c3629hg.getClass();
                int i = 2;
                C3629hg c3629hg2 = c3629hg;
                int i2 = 2;
                while (true) {
                    InterfaceC3549gk interfaceC3549gk = c3629hg2.f4462a;
                    c3629hg2 = interfaceC3549gk instanceof C3629hg ? (C3629hg) interfaceC3549gk : null;
                    if (c3629hg2 == null) {
                        break;
                    }
                    i2++;
                }
                C3629hg c3629hg3 = this;
                while (true) {
                    InterfaceC3549gk interfaceC3549gk2 = c3629hg3.f4462a;
                    c3629hg3 = interfaceC3549gk2 instanceof C3629hg ? (C3629hg) interfaceC3549gk2 : null;
                    if (c3629hg3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    C3629hg c3629hg4 = this;
                    while (true) {
                        InterfaceC3373ek interfaceC3373ek = c3629hg4.b;
                        if (!AbstractC2995aW.i(c3629hg.get(interfaceC3373ek.getKey()), interfaceC3373ek)) {
                            break;
                        }
                        InterfaceC3549gk interfaceC3549gk3 = c3629hg4.f4462a;
                        if (interfaceC3549gk3 instanceof C3629hg) {
                            c3629hg4 = (C3629hg) interfaceC3549gk3;
                        } else {
                            AbstractC2995aW.o(interfaceC3549gk3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            InterfaceC3373ek interfaceC3373ek2 = (InterfaceC3373ek) interfaceC3549gk3;
                            if (AbstractC2995aW.i(c3629hg.get(interfaceC3373ek2.getKey()), interfaceC3373ek2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final Object fold(Object obj, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "operation");
        return interfaceC3567gx.invoke(this.f4462a.fold(obj, interfaceC3567gx), this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3373ek get(InterfaceC3461fk interfaceC3461fk) {
        AbstractC2995aW.q(interfaceC3461fk, "key");
        C3629hg c3629hg = this;
        while (true) {
            InterfaceC3373ek interfaceC3373ek = c3629hg.b.get(interfaceC3461fk);
            if (interfaceC3373ek != null) {
                return interfaceC3373ek;
            }
            InterfaceC3549gk interfaceC3549gk = c3629hg.f4462a;
            if (!(interfaceC3549gk instanceof C3629hg)) {
                return interfaceC3549gk.get(interfaceC3461fk);
            }
            c3629hg = (C3629hg) interfaceC3549gk;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.f4462a.hashCode();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3549gk minusKey(InterfaceC3461fk interfaceC3461fk) {
        AbstractC2995aW.q(interfaceC3461fk, "key");
        InterfaceC3373ek interfaceC3373ek = this.b;
        InterfaceC3373ek interfaceC3373ek2 = interfaceC3373ek.get(interfaceC3461fk);
        InterfaceC3549gk interfaceC3549gk = this.f4462a;
        if (interfaceC3373ek2 != null) {
            return interfaceC3549gk;
        }
        InterfaceC3549gk interfaceC3549gkMinusKey = interfaceC3549gk.minusKey(interfaceC3461fk);
        if (interfaceC3549gkMinusKey == interfaceC3549gk) {
            return this;
        }
        return interfaceC3549gkMinusKey == C2734Rq.f3684a ? interfaceC3373ek : new C3629hg(interfaceC3373ek, interfaceC3549gkMinusKey);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public final InterfaceC3549gk plus(InterfaceC3549gk interfaceC3549gk) {
        AbstractC2995aW.q(interfaceC3549gk, com.umeng.analytics.pro.f.X);
        return interfaceC3549gk == C2734Rq.f3684a ? this : (InterfaceC3549gk) interfaceC3549gk.fold(this, C3541gg.h);
    }

    public final String toString() {
        return DM.l(new StringBuilder("["), (String) fold("", C3541gg.g), ']');
    }
}
