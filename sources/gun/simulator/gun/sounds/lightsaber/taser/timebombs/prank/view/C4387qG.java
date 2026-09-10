package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProxyConfig;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4387qG {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4474rG f4875a;
    public final InterfaceC4211oG b;

    static {
        new C4387qG(null, null);
    }

    public C4387qG(EnumC4474rG enumC4474rG, Be0 be0) {
        String str;
        this.f4875a = enumC4474rG;
        this.b = be0;
        if ((enumC4474rG == null) == (be0 == null)) {
            return;
        }
        if (enumC4474rG == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC4474rG + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4387qG)) {
            return false;
        }
        C4387qG c4387qG = (C4387qG) obj;
        return this.f4875a == c4387qG.f4875a && AbstractC2995aW.i(this.b, c4387qG.b);
    }

    public final int hashCode() {
        EnumC4474rG enumC4474rG = this.f4875a;
        int iHashCode = (enumC4474rG == null ? 0 : enumC4474rG.hashCode()) * 31;
        InterfaceC4211oG interfaceC4211oG = this.b;
        return iHashCode + (interfaceC4211oG != null ? interfaceC4211oG.hashCode() : 0);
    }

    public final String toString() {
        EnumC4474rG enumC4474rG = this.f4875a;
        int i = enumC4474rG == null ? -1 : AbstractC4299pG.f4829a[enumC4474rG.ordinal()];
        if (i == -1) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        InterfaceC4211oG interfaceC4211oG = this.b;
        if (i == 1) {
            return String.valueOf(interfaceC4211oG);
        }
        if (i == 2) {
            return "in " + interfaceC4211oG;
        }
        if (i != 3) {
            throw new C3770jF(7, 0);
        }
        return "out " + interfaceC4211oG;
    }
}
