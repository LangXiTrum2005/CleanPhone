package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3913kt {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    public abstract com.google.protobuf.W getExtensions(Object obj);

    public abstract com.google.protobuf.W getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(MessageLite messageLite);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, AX ax, Object obj2, ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.W w, UB ub, com.google.protobuf.O0 o0) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(AX ax, Object obj, ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.W w) throws IOException;

    public abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.W w) throws IOException;

    public abstract void serializeExtension(InterfaceC3642hm0 interfaceC3642hm0, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, com.google.protobuf.W w);
}
