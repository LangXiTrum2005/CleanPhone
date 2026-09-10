package com.iab.omid.library.bigosg.c;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21677a;

    public c(a aVar) {
        this.f21677a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            Collection<com.iab.omid.library.bigosg.adsession.a> collectionC = aVarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<com.iab.omid.library.bigosg.adsession.a> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewD = it.next().d();
                if (viewD != null && f.c(viewD) && (rootView = viewD.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
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

    @Override // com.iab.omid.library.bigosg.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.bigosg.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.bigosg.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0218a interfaceC0218a, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0218a.a(it.next(), this.f21677a, jSONObject);
        }
    }
}
