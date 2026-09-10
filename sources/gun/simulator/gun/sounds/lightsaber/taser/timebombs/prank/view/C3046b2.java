package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3046b2 {
    public static final C2957a2 Companion = new C2957a2(null);
    private final Integer height;
    private final Integer width;

    public C3046b2() {
        this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C3046b2 copy$default(C3046b2 c3046b2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c3046b2.width;
        }
        if ((i & 2) != 0) {
            num2 = c3046b2.height;
        }
        return c3046b2.copy(num, num2);
    }

    public static final void write$Self(C3046b2 c3046b2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        Integer num;
        Integer num2;
        AbstractC2995aW.q(c3046b2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || (num2 = c3046b2.width) == null || num2.intValue() != 0) {
            interfaceC4596sh.r(d40, 0, AD.f2808a, c3046b2.width);
        }
        if (interfaceC4596sh.j(d40) || (num = c3046b2.height) == null || num.intValue() != 0) {
            interfaceC4596sh.r(d40, 1, AD.f2808a, c3046b2.height);
        }
    }

    public final Integer component1() {
        return this.width;
    }

    public final Integer component2() {
        return this.height;
    }

    public final C3046b2 copy(Integer num, Integer num2) {
        return new C3046b2(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3046b2)) {
            return false;
        }
        C3046b2 c3046b2 = (C3046b2) obj;
        return AbstractC2995aW.i(this.width, c3046b2.width) && AbstractC2995aW.i(this.height, c3046b2.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
    }

    public /* synthetic */ C3046b2(Integer num, Integer num2, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
    }

    public /* synthetic */ C3046b2(int i, Integer num, Integer num2, O40 o40) {
        this.width = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.height = 0;
        } else {
            this.height = num2;
        }
    }

    public C3046b2(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }
}
