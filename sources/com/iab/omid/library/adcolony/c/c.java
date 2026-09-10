package com.iab.omid.library.adcolony.c;

import android.view.View;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21484a;

    public c(a aVar) {
        this.f21484a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.adcolony.b.a aVarA = com.iab.omid.library.adcolony.b.a.a();
        if (aVarA != null) {
            Collection<com.iab.omid.library.adcolony.adsession.a> collectionC = aVarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<com.iab.omid.library.adcolony.adsession.a> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && f.c(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > fA) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.adcolony.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.adcolony.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.adcolony.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0211a interfaceC0211a, boolean z2, boolean z3) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0211a.a(it.next(), this.f21484a, jSONObject, z3);
        }
    }
}
