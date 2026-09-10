package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class VL implements InterfaceC3956lP {
    private InterfaceC3956lP[] factories;

    public VL(InterfaceC3956lP... interfaceC3956lPArr) {
        this.factories = interfaceC3956lPArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3956lP
    public boolean isSupported(Class<?> cls) {
        for (InterfaceC3956lP interfaceC3956lP : this.factories) {
            if (interfaceC3956lP.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3956lP
    public InterfaceC3868kP messageInfoFor(Class<?> cls) {
        for (InterfaceC3956lP interfaceC3956lP : this.factories) {
            if (interfaceC3956lP.isSupported(cls)) {
                return interfaceC3956lP.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
