package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4315pW extends AbstractC2513Jc implements InterfaceC4035mG {
    private final boolean syntheticJavaProperty;

    public AbstractC4315pW(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2513Jc
    public InterfaceC3068bG compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4315pW) {
            AbstractC4315pW abstractC4315pW = (AbstractC4315pW) obj;
            return getOwner().equals(abstractC4315pW.getOwner()) && getName().equals(abstractC4315pW.getName()) && getSignature().equals(abstractC4315pW.getSignature()) && AbstractC2995aW.i(getBoundReceiver(), abstractC4315pW.getBoundReceiver());
        }
        if (obj instanceof InterfaceC4035mG) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4035mG
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4035mG
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC3068bG interfaceC3068bGCompute = compute();
        if (interfaceC3068bGCompute != this) {
            return interfaceC3068bGCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2513Jc
    public InterfaceC4035mG getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        InterfaceC3068bG interfaceC3068bGCompute = compute();
        if (interfaceC3068bGCompute != this) {
            return (InterfaceC4035mG) interfaceC3068bGCompute;
        }
        throw new RR("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
