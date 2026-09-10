package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2363Di {
    public static final C2285Ai Companion = new C2285Ai(null);
    private final Integer tcfStatus;

    public C2363Di() {
        this((Integer) null, 1, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C2363Di copy$default(C2363Di c2363Di, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c2363Di.tcfStatus;
        }
        return c2363Di.copy(num);
    }

    public static final void write$Self(C2363Di c2363Di, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2363Di, "self");
        if (!AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) && c2363Di.tcfStatus == null) {
            return;
        }
        interfaceC4596sh.r(d40, 0, AD.f2808a, c2363Di.tcfStatus);
    }

    public final Integer component1() {
        return this.tcfStatus;
    }

    public final C2363Di copy(Integer num) {
        return new C2363Di(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2363Di) && AbstractC2995aW.i(this.tcfStatus, ((C2363Di) obj).tcfStatus);
    }

    public final Integer getTcfStatus() {
        return this.tcfStatus;
    }

    public int hashCode() {
        Integer num = this.tcfStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
    }

    public /* synthetic */ C2363Di(Integer num, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : num);
    }

    public /* synthetic */ C2363Di(int i, Integer num, O40 o40) {
        if ((i & 1) == 0) {
            this.tcfStatus = null;
        } else {
            this.tcfStatus = num;
        }
    }

    public C2363Di(Integer num) {
        this.tcfStatus = num;
    }

    public static /* synthetic */ void getTcfStatus$annotations() {
    }
}
