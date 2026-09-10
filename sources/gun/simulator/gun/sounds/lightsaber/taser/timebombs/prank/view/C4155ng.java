package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4155ng {
    public static final C4067mg Companion = new C4067mg(null);
    private final int height;
    private final int width;

    public /* synthetic */ C4155ng(int i, int i2, int i3, O40 o40) {
        if (3 != (i & 3)) {
            AbstractC4496rb.B(i, 3, C3979lg.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = i2;
        this.height = i3;
    }

    public static /* synthetic */ C4155ng copy$default(C4155ng c4155ng, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c4155ng.width;
        }
        if ((i3 & 2) != 0) {
            i2 = c4155ng.height;
        }
        return c4155ng.copy(i, i2);
    }

    public static final void write$Self(C4155ng c4155ng, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4155ng, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.g(0, c4155ng.width, d40);
        interfaceC4596sh.g(1, c4155ng.height, d40);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final C4155ng copy(int i, int i2) {
        return new C4155ng(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4155ng)) {
            return false;
        }
        C4155ng c4155ng = (C4155ng) obj;
        return this.width == c4155ng.width && this.height == c4155ng.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdSizeParam(width=");
        sb.append(this.width);
        sb.append(", height=");
        return DM.k(sb, this.height, ')');
    }

    public C4155ng(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }
}
