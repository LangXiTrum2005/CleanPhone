package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f3759a = new Object[0];

    public static final void a(int i2, List list) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            RuntimeHelpersKt.b("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i2, int i3, List list) {
        int size = list.size();
        if (i2 > i3) {
            RuntimeHelpersKt.a("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
            throw null;
        }
        if (i2 < 0) {
            RuntimeHelpersKt.b("fromIndex (" + i2 + ") is less than 0.");
            throw null;
        }
        if (i3 <= size) {
            return;
        }
        RuntimeHelpersKt.b("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
