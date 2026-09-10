package kotlin.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EnumEntriesKt {
    public static final EnumEntries a(Enum[] entries) {
        Intrinsics.f(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
