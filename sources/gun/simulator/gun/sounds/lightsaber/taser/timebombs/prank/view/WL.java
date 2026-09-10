package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.AbstractC2127l0;
import com.google.protobuf.C2140s0;
import com.google.protobuf.C2142t0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes3.dex */
public final class WL implements InterfaceC3666i30 {
    private static final InterfaceC3956lP EMPTY_FACTORY = new UL();
    private final InterfaceC3956lP messageInfoFactory;

    public WL() {
        this(getDefaultMessageInfoFactory());
    }

    private static InterfaceC3956lP getDefaultMessageInfoFactory() {
        return new VL(C4972wx.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static InterfaceC3956lP getDescriptorMessageInfoFactory() {
        try {
            return (InterfaceC3956lP) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(InterfaceC3868kP interfaceC3868kP) {
        return interfaceC3868kP.getSyntax() == ProtoSyntax.PROTO2;
    }

    private static <T> InterfaceC3578h30 newSchema(Class<T> cls, InterfaceC3868kP interfaceC3868kP) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return isProto2(interfaceC3868kP) ? C2140s0.newSchema(cls, interfaceC3868kP, FR.lite(), AbstractC2127l0.lite(), com.google.protobuf.D0.unknownFieldSetLiteSchema(), C4001lt.lite(), C3691iM.lite()) : C2140s0.newSchema(cls, interfaceC3868kP, FR.lite(), AbstractC2127l0.lite(), com.google.protobuf.D0.unknownFieldSetLiteSchema(), null, C3691iM.lite());
        }
        return isProto2(interfaceC3868kP) ? C2140s0.newSchema(cls, interfaceC3868kP, FR.full(), AbstractC2127l0.full(), com.google.protobuf.D0.proto2UnknownFieldSetSchema(), C4001lt.full(), C3691iM.full()) : C2140s0.newSchema(cls, interfaceC3868kP, FR.full(), AbstractC2127l0.full(), com.google.protobuf.D0.proto3UnknownFieldSetSchema(), null, C3691iM.full());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3666i30
    public <T> InterfaceC3578h30 createSchema(Class<T> cls) {
        com.google.protobuf.D0.requireGeneratedMessage(cls);
        InterfaceC3868kP interfaceC3868kPMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (interfaceC3868kPMessageInfoFor.isMessageSetWireFormat()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? C2142t0.newSchema(com.google.protobuf.D0.unknownFieldSetLiteSchema(), C4001lt.lite(), interfaceC3868kPMessageInfoFor.getDefaultInstance()) : C2142t0.newSchema(com.google.protobuf.D0.proto2UnknownFieldSetSchema(), C4001lt.full(), interfaceC3868kPMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, interfaceC3868kPMessageInfoFor);
    }

    private WL(InterfaceC3956lP interfaceC3956lP) {
        this.messageInfoFactory = (InterfaceC3956lP) Internal.checkNotNull(interfaceC3956lP, "messageInfoFactory");
    }
}
