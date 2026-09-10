package decarock;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BundleCollectionUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {
    public static void attabal(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) grimness.impromptu(dern.class.getClassLoader()));
        }
    }

    public static <T> ArrayList<Bundle> dern(Collection<T> collection2, com.google.common.base.marial<T, Bundle> marialVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection2.size());
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(marialVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> ImmutableList<T> saneness(com.google.common.base.marial<Bundle, T> marialVar, List<Bundle> list) {
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            attabalVarBuilder.attabal(marialVar.apply((Bundle) attabal.marial(list.get(i))));
        }
        return attabalVarBuilder.impassible();
    }
}
