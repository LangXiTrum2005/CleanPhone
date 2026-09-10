package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import com.iab.omid.library.bytedance2.utils.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21768a;

    public c(a aVar) {
        this.f21768a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.bytedance2.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.bytedance2.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewC = it.next().c();
                if (viewC != null && h.e(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.bytedance2.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0221a interfaceC0221a, boolean z2, boolean z3) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0221a.a(it.next(), this.f21768a, jSONObject, z3);
        }
    }
}
