package kotlin.text;

import androidx.room.e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 kotlin.text.CharDirectionality[], still in use, count: 1, list:
  (r0v7 kotlin.text.CharDirectionality[]) from 0x00d3: INVOKE (r0v7 kotlin.text.CharDirectionality[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m), WRAPPED] (LINE:212)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CharDirectionality {
    /* JADX INFO: Fake field, exist only in values array */
    UNDEFINED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT(0),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT(1),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT_ARABIC(2),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER(3),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER_SEPARATOR(4),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPEAN_NUMBER_TERMINATOR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ARABIC_NUMBER(6),
    /* JADX INFO: Fake field, exist only in values array */
    COMMON_NUMBER_SEPARATOR(7),
    /* JADX INFO: Fake field, exist only in values array */
    NONSPACING_MARK(8),
    /* JADX INFO: Fake field, exist only in values array */
    BOUNDARY_NEUTRAL(9),
    /* JADX INFO: Fake field, exist only in values array */
    PARAGRAPH_SEPARATOR(10),
    /* JADX INFO: Fake field, exist only in values array */
    SEGMENT_SEPARATOR(11),
    /* JADX INFO: Fake field, exist only in values array */
    WHITESPACE(12),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER_NEUTRALS(13),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT_EMBEDDING(14),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_TO_RIGHT_OVERRIDE(15),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT_EMBEDDING(16),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT_TO_LEFT_OVERRIDE(17),
    /* JADX INFO: Fake field, exist only in values array */
    POP_DIRECTIONAL_FORMAT(18);


    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Lazy f44690Y = LazyKt.b(new e(11));
    public static final /* synthetic */ EnumEntries e0 = EnumEntriesKt.a(new CharDirectionality[]{new CharDirectionality(-1), new CharDirectionality(0), new CharDirectionality(1), new CharDirectionality(2), new CharDirectionality(3), new CharDirectionality(4), new CharDirectionality(5), new CharDirectionality(6), new CharDirectionality(7), new CharDirectionality(8), new CharDirectionality(9), new CharDirectionality(10), new CharDirectionality(11), new CharDirectionality(12), new CharDirectionality(13), new CharDirectionality(14), new CharDirectionality(15), new CharDirectionality(16), new CharDirectionality(17), new CharDirectionality(18)});
    public final int X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
    }

    public CharDirectionality(int i2) {
        super(str, i);
        this.X = i2;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) Z.clone();
    }
}
