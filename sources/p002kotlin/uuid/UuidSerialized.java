package p002kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlin/uuid/UuidSerialized;", "Ljava/io/Externalizable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "()V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", AgentOptions.OUTPUT, "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "J", "getMostSignificantBits", "()J", "setMostSignificantBits", "(J)V", "getLeastSignificantBits", "setLeastSignificantBits", "Companion", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class UuidSerialized implements Externalizable {
    private static final long serialVersionUID = 0;
    private long leastSignificantBits;
    private long mostSignificantBits;

    public UuidSerialized(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final Object readResolve() {
        return Uuid.INSTANCE.attabal(this.mostSignificantBits, this.leastSignificantBits);
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.mostSignificantBits = input.readLong();
        this.leastSignificantBits = input.readLong();
    }

    public final void setLeastSignificantBits(long j) {
        this.leastSignificantBits = j;
    }

    public final void setMostSignificantBits(long j) {
        this.mostSignificantBits = j;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.mostSignificantBits);
        output.writeLong(this.leastSignificantBits);
    }

    public UuidSerialized() {
        this(0L, 0L);
    }
}
