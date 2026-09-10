package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2513Jc implements InterfaceC3068bG, Serializable {
    public static final Object NO_RECEIVER = C2487Ic.f3227a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC3068bG reflected;
    private final String signature;

    public AbstractC2513Jc(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC3068bG compute() {
        InterfaceC3068bG interfaceC3068bG = this.reflected;
        if (interfaceC3068bG != null) {
            return interfaceC3068bG;
        }
        InterfaceC3068bG interfaceC3068bGComputeReflected = computeReflected();
        this.reflected = interfaceC3068bGComputeReflected;
        return interfaceC3068bGComputeReflected;
    }

    public abstract InterfaceC3068bG computeReflected();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2979aG
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC3068bG getReflected();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public InterfaceC4211oG getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public EnumC4562sG getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3068bG
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
