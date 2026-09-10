package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BufferOverflow {
    public static final BufferOverflow X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final BufferOverflow f44779Y;
    public static final BufferOverflow Z;
    public static final /* synthetic */ BufferOverflow[] e0;
    public static final /* synthetic */ EnumEntries f0;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        X = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        f44779Y = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        Z = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        e0 = bufferOverflowArr;
        f0 = EnumEntriesKt.a(bufferOverflowArr);
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) e0.clone();
    }
}
