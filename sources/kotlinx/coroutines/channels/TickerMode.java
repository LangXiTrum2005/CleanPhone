package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TickerMode {
    public static final /* synthetic */ TickerMode[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f44838Y;

    /* JADX INFO: Fake field, exist only in values array */
    TickerMode EF5;

    static {
        TickerMode[] tickerModeArr = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};
        X = tickerModeArr;
        f44838Y = EnumEntriesKt.a(tickerModeArr);
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) X.clone();
    }
}
