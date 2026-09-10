package androidx.compose.ui.platform;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmActuals.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0000\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"", "obj", "", "name", "attabal", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class permissivist {
    public static final String attabal(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
