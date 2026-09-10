package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoroutineSingletons {
    public static final CoroutineSingletons X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final CoroutineSingletons f43293Y;
    public static final CoroutineSingletons Z;
    public static final /* synthetic */ CoroutineSingletons[] e0;
    public static final /* synthetic */ EnumEntries f0;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        X = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        f43293Y = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        Z = coroutineSingletons3;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        e0 = coroutineSingletonsArr;
        f0 = EnumEntriesKt.a(coroutineSingletonsArr);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) e0.clone();
    }
}
