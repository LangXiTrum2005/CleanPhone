package com.iab.omid.library.unity3d.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25531a;

    public c(a aVar) {
        this.f25531a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.unity3d.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.unity3d.adsession.a> it = collectionA.iterator();
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

    @Override // com.iab.omid.library.unity3d.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.unity3d.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0034a interfaceC0034a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0034a.a(it.next(), this.f25531a, jSONObject, z11);
        }
    }
}
