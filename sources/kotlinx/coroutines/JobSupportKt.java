package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JobSupportKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f44763a = new Symbol("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Symbol f44764b = new Symbol("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Symbol f44765c = new Symbol("COMPLETING_RETRY");
    public static final Symbol d = new Symbol("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Symbol f44766e = new Symbol("SEALED");
    public static final Empty f = new Empty(false);
    public static final Empty g = new Empty(true);

    public static final Object a(Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.f44759a) == null) ? obj : incomplete;
    }
}
