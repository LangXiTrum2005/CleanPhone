package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Y2 implements InterfaceC4445qx, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public Y2(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2)) {
            return false;
        }
        Y2 y2 = (Y2) obj;
        return this.isTopLevel == y2.isTopLevel && this.arity == y2.arity && this.flags == y2.flags && AbstractC2995aW.i(this.receiver, y2.receiver) && AbstractC2995aW.i(this.owner, y2.owner) && this.name.equals(y2.name) && this.signature.equals(y2.signature);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4445qx
    public int getArity() {
        return this.arity;
    }

    public InterfaceC3333eG getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return AbstractC3263dY.a(cls);
        }
        AbstractC3263dY.f4274a.getClass();
        return new C4751uT(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((DM.d(this.signature, DM.d(this.name, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        AbstractC3263dY.f4274a.getClass();
        return C3351eY.a(this);
    }
}
