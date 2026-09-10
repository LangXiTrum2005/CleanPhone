package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/uuid/UuidSerialized;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class UuidSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    public long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f44734Y;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/uuid/UuidSerialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public UuidSerialized(long j, long j2) {
        this.X = j;
        this.f44734Y = j2;
    }

    private final Object readResolve() {
        return Uuid.Companion.a(this.X, this.f44734Y);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.f(input, "input");
        this.X = input.readLong();
        this.f44734Y = input.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.f(output, "output");
        output.writeLong(this.X);
        output.writeLong(this.f44734Y);
    }

    public UuidSerialized() {
        this(0L, 0L);
    }
}
