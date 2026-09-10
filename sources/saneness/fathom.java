package saneness;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fathom {
    public static Object attabal(String str, Function1 block) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (StringsKt.empress(str)) {
            return null;
        }
        return block.invoke(str);
    }
}
