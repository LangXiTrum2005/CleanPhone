package kotlin.collections.builders;

import com.p004ironsource.d9;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ListBuilderKt {
    public static final boolean a(Object[] objArr, int i2, int i3, List list) {
        if (i3 == list.size()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (Intrinsics.a(objArr[i2 + i4], list.get(i4))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String b(Object[] objArr, int i2, int i3, AbstractMutableList abstractMutableList) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append(d9.i.d);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == abstractMutableList) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(d9.i.f24752e);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static final void c(Object[] objArr, int i2, int i3) {
        Intrinsics.f(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }
}
