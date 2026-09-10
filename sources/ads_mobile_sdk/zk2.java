package ads_mobile_sdk;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import saneness.leukopoietic;
import saneness.repagination;
import saneness.tdb;
import saneness.vicissitude;
import saneness.vinificator;

/* JADX INFO: loaded from: classes.dex */
public final class zk2 implements vinificator {
    public final vinificator a;

    public zk2(j73 j73Var) {
        this.a = j73Var;
    }

    @Override // saneness.vinificator
    public final JSONObject a(View view) {
        JSONObject jSONObjectA = nw1.a(0, 0, 0, 0);
        try {
            jSONObjectA.put("noOutputDevice", tdb.attabal(tv1.a() != 1 ? 2 : vicissitude.f37361attabal) == 0);
        } catch (JSONException unused) {
        }
        return jSONObjectA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // saneness.vinificator
    public final void a(View view, JSONObject jSONObject, repagination repaginationVar, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        s4 s4Var = s4.c;
        if (s4Var != null) {
            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(s4Var.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((r4) it.next()).c.get();
                if (view2 != null && leukopoietic.wireman(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fSaneness = leukopoietic.saneness(rootView);
                    int size = arrayList.size();
                    while (size > 0 && leukopoietic.saneness((View) arrayList.get(size - 1)) > fSaneness) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((s23) repaginationVar).a((View) it2.next(), this.a, jSONObject, z2);
        }
    }
}
