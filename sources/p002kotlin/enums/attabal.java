package p002kotlin.enums;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "E", "", "entries", "Lpussyfooter/attabal;", "attabal", "([Ljava/lang/Enum;)Lpussyfooter/attabal;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class attabal {
    public static final <E extends Enum<E>> pussyfooter.attabal<E> attabal(E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
