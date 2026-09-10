package saneness;

import ads_mobile_sdk.r21;
import ads_mobile_sdk.z72;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class lamplit implements Cloneable {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Iterable iterable, prescient prescientVar) {
        r21.a(iterable);
        if (iterable instanceof ampleness) {
            prescientVar.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (prescientVar instanceof ArrayList) {
                ((ArrayList) prescientVar).ensureCapacity(prescientVar.size() + size);
            } else if (prescientVar instanceof z72) {
                ((z72) prescientVar).b(prescientVar.size() + size);
            }
        }
        int size2 = prescientVar.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, prescientVar);
                    throw null;
                }
                prescientVar.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list.get(i);
            if (obj2 == null) {
                a(size2, prescientVar);
                throw null;
            }
            prescientVar.add(obj2);
        }
    }

    public static void a(int i, prescient prescientVar) {
        String str = "Element at index " + (prescientVar.size() - i) + " is null.";
        for (int size = prescientVar.size() - 1; size >= i; size--) {
            prescientVar.remove(size);
        }
        throw new NullPointerException(str);
    }
}
