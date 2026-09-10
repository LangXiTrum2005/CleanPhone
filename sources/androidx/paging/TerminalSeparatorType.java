package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/TerminalSeparatorType;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalSeparatorType {
    public static final /* synthetic */ TerminalSeparatorType[] X = {new TerminalSeparatorType("FULLY_COMPLETE", 0), new TerminalSeparatorType("SOURCE_COMPLETE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TerminalSeparatorType EF5;

    public static TerminalSeparatorType valueOf(String str) {
        return (TerminalSeparatorType) Enum.valueOf(TerminalSeparatorType.class, str);
    }

    public static TerminalSeparatorType[] values() {
        return (TerminalSeparatorType[]) X.clone();
    }
}
