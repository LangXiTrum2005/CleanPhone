package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class xm2 implements coi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int f3295attabal = 0;
    public final List a;
    public final List b;

    static {
        h21.a(Collections.EMPTY_SET);
    }

    public xm2(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection2 = (Collection) ((coffeecake) this.b.get(i)).get();
            size += collection2.size();
            arrayList.add(collection2);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = ((coffeecake) this.a.get(i2)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj2 : (Collection) arrayList.get(i3)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
