package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4637t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SE f5016a = new SE("NO_VALUE", 1);

    public static final C4549s60 a(int i, int i2, EnumC5024xb enumC5024xb) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("replay cannot be negative, but was ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        if (i <= 0 && i2 <= 0 && enumC5024xb != EnumC5024xb.f5229a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC5024xb).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new C4549s60(i, i3, enumC5024xb);
    }

    public static /* synthetic */ C4549s60 b(int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return a(i, 0, EnumC5024xb.f5229a);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
