package com.iab.omid.library.applovin.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25136a;

    public c(a aVar) {
        this.f25136a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.applovin.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.applovin.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && h.g(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0022a interfaceC0022a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0022a.a(it.next(), this.f25136a, jSONObject, z11);
        }
    }
}
