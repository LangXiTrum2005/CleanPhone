package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class J20 extends WG implements InterfaceC3567gx {
    public final /* synthetic */ G20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J20(G20 g20) {
        super(2);
        this.f = g20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC3373ek interfaceC3373ek = (InterfaceC3373ek) obj2;
        InterfaceC3461fk key = interfaceC3373ek.getKey();
        InterfaceC3373ek interfaceC3373ek2 = this.f.b.get(key);
        if (key != G7.e) {
            return Integer.valueOf(interfaceC3373ek != interfaceC3373ek2 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC3373ek2;
        InterfaceC5000xE parent = (InterfaceC5000xE) interfaceC3373ek;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC5000xE || !(parent instanceof C4016m30)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == interfaceC5000xE) {
            if (interfaceC5000xE != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC5000xE + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
