package p002kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "map", "<init>", "(Ljava/util/Map;)V", "()V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", AgentOptions.OUTPUT, "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "Ljava/util/Map;", "Companion", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SerializedMap implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public SerializedMap(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        byte b = input.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b));
        }
        int i = input.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        Map mapWireman = polder.wireman(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapWireman.put(input.readObject(), input.readObject());
        }
        this.map = polder.saneness(mapWireman);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(seminary.taiyuan());
    }
}
