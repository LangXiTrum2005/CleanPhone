package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f21769a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0221a interfaceC0221a, boolean z2) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0221a.a((View) it2.next(), this, jSONObject, z2);
            }
        }
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.bytedance2.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f21769a);
        int[] iArr = this.f21769a;
        return com.iab.omid.library.bytedance2.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0221a interfaceC0221a, boolean z2, boolean z3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z2) {
                b(viewGroup, jSONObject, interfaceC0221a, z3);
            } else {
                a(viewGroup, jSONObject, interfaceC0221a, z3);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0221a interfaceC0221a, boolean z2) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            interfaceC0221a.a(viewGroup.getChildAt(i2), this, jSONObject, z2);
        }
    }
}
