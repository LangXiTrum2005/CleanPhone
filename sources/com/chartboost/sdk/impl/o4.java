package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4 f14694a = new o4();

    public final n4 a(Element element, ii iiVar) {
        List listA;
        List listD = gk.f14032a.d(element, "StaticResource");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            dg dgVarA = eg.f13824a.a((Element) it.next());
            if (dgVarA != null) {
                arrayList.add(dgVarA);
            }
        }
        List listD2 = gk.f14032a.d(element, "IFrameResource");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listD2.iterator();
        while (it2.hasNext()) {
            r8 r8VarA = s8.f15115a.a((Element) it2.next());
            if (r8VarA != null) {
                arrayList2.add(r8VarA);
            }
        }
        List listD3 = gk.f14032a.d(element, "HTMLResource");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = listD3.iterator();
        while (it3.hasNext()) {
            k8 k8VarA = l8.f14410a.a((Element) it3.next());
            if (k8VarA != null) {
                arrayList3.add(k8VarA);
            }
        }
        gk gkVar = gk.f14032a;
        Element elementC = gkVar.c(element, "TrackingEvents");
        if (elementC == null || (listA = hh.f14116a.a(elementC, iiVar)) == null) {
            listA = EmptyList.X;
        }
        List list = listA;
        String strE = gkVar.e(element, "CompanionClickThrough");
        List listF = gkVar.f(element, "CompanionClickTracking");
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        String strB = gkVar.b(element, "id");
        String strB2 = gkVar.b(element, "width");
        Integer numY = strB2 != null ? StringsKt.Y(strB2) : null;
        String strB3 = gkVar.b(element, "height");
        Integer numY2 = strB3 != null ? StringsKt.Y(strB3) : null;
        String strB4 = gkVar.b(element, "assetWidth");
        Integer numY3 = strB4 != null ? StringsKt.Y(strB4) : null;
        String strB5 = gkVar.b(element, "assetHeight");
        Integer numY4 = strB5 != null ? StringsKt.Y(strB5) : null;
        String strB6 = gkVar.b(element, "expandedWidth");
        Integer numY5 = strB6 != null ? StringsKt.Y(strB6) : null;
        String strB7 = gkVar.b(element, "expandedHeight");
        return new n4(strB, numY, numY2, numY3, numY4, numY5, strB7 != null ? StringsKt.Y(strB7) : null, gkVar.b(element, "apiFramework"), gkVar.b(element, "adSlotID"), gkVar.b(element, "pxratio"), gkVar.e(element, "AltText"), gkVar.e(element, "AdParameters"), arrayList, arrayList2, arrayList3, list, strE, listF, null, 262144, null);
    }

    public final q4 b(Element element, ii context) {
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "required");
        ArrayList arrayList = new ArrayList();
        Iterator it = gkVar.d(element, "Companion").iterator();
        while (it.hasNext()) {
            n4 n4VarA = f14694a.a((Element) it.next(), context);
            if (n4VarA != null) {
                arrayList.add(n4VarA);
            }
        }
        return new q4(strB, arrayList);
    }
}
