package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4532rx extends AbstractC2513Jc implements InterfaceC4445qx, InterfaceC3421fG {
    private final int arity;
    private final int flags;

    public AbstractC4532rx(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2513Jc
    public InterfaceC3068bG computeReflected() {
        AbstractC3263dY.f4274a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4532rx) {
            AbstractC4532rx abstractC4532rx = (AbstractC4532rx) obj;
            return getName().equals(abstractC4532rx.getName()) && getSignature().equals(abstractC4532rx.getSignature()) && this.flags == abstractC4532rx.flags && this.arity == abstractC4532rx.arity && AbstractC2995aW.i(getBoundReceiver(), abstractC4532rx.getBoundReceiver()) && AbstractC2995aW.i(getOwner(), abstractC4532rx.getOwner());
        }
        if (obj instanceof InterfaceC3421fG) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4445qx
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3421fG
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3421fG
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3421fG
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3421fG
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2513Jc, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC3068bG interfaceC3068bGCompute = compute();
        if (interfaceC3068bGCompute != this) {
            return interfaceC3068bGCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2513Jc
    public InterfaceC3421fG getReflected() {
        InterfaceC3068bG interfaceC3068bGCompute = compute();
        if (interfaceC3068bGCompute != this) {
            return (InterfaceC3421fG) interfaceC3068bGCompute;
        }
        throw new RR("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
