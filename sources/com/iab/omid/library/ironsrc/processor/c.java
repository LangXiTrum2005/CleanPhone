package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25270a;

    public c(a aVar) {
        this.f25270a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.ironsrc.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewC = it.next().c();
                if (viewC != null && h.g(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
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

    @Override // com.iab.omid.library.ironsrc.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0026a interfaceC0026a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0026a.a(it.next(), this.f25270a, jSONObject, z11);
        }
    }
}
