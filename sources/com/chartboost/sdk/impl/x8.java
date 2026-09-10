package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x8 f15529a = new x8();

    public final t8 a(Element element, ii context) {
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
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
        Element elementC = gkVar.c(element, "IconClicks");
        v8 v8VarA = elementC != null ? w8.f15460a.a(elementC) : null;
        List listF = gkVar.f(element, "IconViewTracking");
        Iterator it4 = listF.iterator();
        while (it4.hasNext()) {
            context.b().add(new dh("iconView", (String) it4.next(), context.c(), null, null, 24, null));
        }
        gk gkVar2 = gk.f14032a;
        String strB = gkVar2.b(element, "program");
        String strB2 = gkVar2.b(element, "width");
        Integer numY = strB2 != null ? StringsKt.Y(strB2) : null;
        String strB3 = gkVar2.b(element, "height");
        return new t8(strB, numY, strB3 != null ? StringsKt.Y(strB3) : null, gkVar2.b(element, "xPosition"), gkVar2.b(element, "yPosition"), gkVar2.b(element, "duration"), gkVar2.b(element, "offset"), gkVar2.b(element, "apiFramework"), gkVar2.b(element, "pxratio"), gkVar2.b(element, "altText"), gkVar2.b(element, "hoverText"), arrayList, arrayList2, arrayList3, v8VarA, listF);
    }

    public final List b(Element parentElement, ii context) {
        List listD;
        t8 t8VarA;
        Intrinsics.f(parentElement, "parentElement");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        Element elementC = gkVar.c(parentElement, "Icons");
        if (elementC == null || (listD = gkVar.d(elementC, "Icon")) == null) {
            return EmptyList.X;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                t8VarA = f15529a.a((Element) it.next(), context);
            } catch (Exception e2) {
                za.b("Failed to parse Icon element: " + e2.getMessage(), e2);
                t8VarA = null;
            }
            if (t8VarA != null) {
                arrayList.add(t8VarA);
            }
        }
        return arrayList;
    }
}
