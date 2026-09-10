package kotlin.collections.builders;

import android.support.v4.media.a;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SerializedMap implements Externalizable {
    private static final long serialVersionUID = 0;
    public Object X = EmptyMap.X;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: readResolve, reason: from getter */
    private final Object getX() {
        return this.X;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        Intrinsics.f(input, "input");
        byte b2 = input.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException(a.h(b2, "Unsupported flags value: "));
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        MapBuilder mapBuilder = new MapBuilder(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        this.X = mapBuilder.d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.f(output, "output");
        output.writeByte(0);
        output.writeInt(this.X.size());
        for (Map.Entry entry : this.X.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
