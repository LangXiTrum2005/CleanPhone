package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static final void e(Iterable iterable, StringBuilder buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, Function1 function1) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(buffer, "buffer");
        Intrinsics.f(prefix, "prefix");
        Intrinsics.f(postfix, "postfix");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(charSequence);
            }
            StringsKt.j(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    public static final List f(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.j0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.g0(iterable, arrayList);
        return arrayList;
    }
}
