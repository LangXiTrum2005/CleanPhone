package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uj f15333a = new uj();

    public final tj a(Element element) {
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        return new tj(gkVar.b(element, "id"), gkVar.f(element, "Viewable"), gkVar.f(element, "NotViewable"), gkVar.f(element, "ViewUndetermined"));
    }

    public final List b(Element parentElement) {
        tj tjVarA;
        Intrinsics.f(parentElement, "parentElement");
        List listD = gk.f14032a.d(parentElement, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                tjVarA = f15333a.a((Element) it.next());
            } catch (Exception e2) {
                za.b("Failed to parse ViewableImpression element: " + e2.getMessage(), e2);
                tjVarA = null;
            }
            if (tjVarA != null) {
                arrayList.add(tjVarA);
            }
        }
        return arrayList;
    }
}
