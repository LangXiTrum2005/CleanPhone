package kotlin.collections;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final void b(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        Intrinsics.f(objArr, "<this>");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            StringsKt.j(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static final void c(Object[] objArr, HashSet hashSet) {
        Intrinsics.f(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }
}
