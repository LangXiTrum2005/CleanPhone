package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4972wx implements InterfaceC3956lP {
    private static final C4972wx instance = new C4972wx();

    private C4972wx() {
    }

    public static C4972wx getInstance() {
        return instance;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3956lP
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3956lP
    public InterfaceC3868kP messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC3868kP) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
