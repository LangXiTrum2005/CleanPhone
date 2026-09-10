package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2912Ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC4083mo f4040a;

    static {
        String property;
        InterfaceC4083mo interfaceC4083mo;
        int i = Ta0.f3778a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            interfaceC4083mo = RunnableC2886Xm.h;
        } else {
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            InterfaceC3373ek interfaceC3373ek = TL.f3768a;
            C3217cz c3217cz = ((C3217cz) interfaceC3373ek).d;
            interfaceC4083mo = !(interfaceC3373ek instanceof InterfaceC4083mo) ? RunnableC2886Xm.h : (InterfaceC4083mo) interfaceC3373ek;
        }
        f4040a = interfaceC4083mo;
    }
}
