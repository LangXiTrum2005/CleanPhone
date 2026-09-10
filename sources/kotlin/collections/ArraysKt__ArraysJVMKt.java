package kotlin.collections;

import androidx.datastore.preferences.protobuf.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
class ArraysKt__ArraysJVMKt {
    public static final void a(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(a.e(i2, i3, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
