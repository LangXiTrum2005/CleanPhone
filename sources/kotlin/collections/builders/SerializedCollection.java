package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43286Y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SerializedCollection(int i2, Collection collection) {
        this.X = collection;
        this.f43286Y = i2;
    }

    /* JADX INFO: renamed from: readResolve, reason: from getter */
    private final Object getX() {
        return this.X;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        Object objM;
        Intrinsics.f(input, "input");
        byte b2 = input.readByte();
        int i2 = b2 & 1;
        if ((b2 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + '.');
        }
        int i3 = input.readInt();
        if (i3 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i3 + '.');
        }
        int i4 = 0;
        if (i2 == 0) {
            ListBuilder listBuilder = new ListBuilder(i3);
            while (i4 < i3) {
                listBuilder.add(input.readObject());
                i4++;
            }
            objM = CollectionsKt.m(listBuilder);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(i3));
            while (i4 < i3) {
                setBuilder.add(input.readObject());
                i4++;
            }
            objM = SetsKt.a(setBuilder);
        }
        this.X = objM;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.f(output, "output");
        output.writeByte(this.f43286Y);
        output.writeInt(this.X.size());
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(0, EmptyList.X);
    }
}
