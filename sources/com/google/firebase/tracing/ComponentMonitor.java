package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;
import p008p.b;

/* JADX INFO: loaded from: classes4.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component component : componentRegistrar.getComponents()) {
            String str = component.f20198a;
            if (str != null) {
                b bVar = new b(2, str, component);
                component = new Component(str, component.f20199b, component.f20200c, component.d, component.f20201e, bVar, component.g);
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
