package habitue;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Clazz.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "attabal", "(Ljava/lang/Object;)Ljava/lang/String;", "tools_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class attabal {
    public static final String attabal(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
