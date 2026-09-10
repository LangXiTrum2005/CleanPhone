package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w8 f15460a = new w8();

    public final v8 a(Element element) {
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        String strE = gkVar.e(element, "IconClickThrough");
        List listF = gkVar.f(element, "IconClickTracking");
        ArrayList arrayList = new ArrayList();
        Element elementC = gkVar.c(element, "IconClickFallbackImages");
        if (elementC != null) {
            Iterator it = gkVar.d(elementC, "IconClickFallbackImage").iterator();
            while (it.hasNext()) {
                u8 u8VarB = f15460a.b((Element) it.next());
                if (u8VarB != null) {
                    arrayList.add(u8VarB);
                }
            }
        }
        if (strE == null && listF.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        return new v8(strE, listF, arrayList);
    }

    public final u8 b(Element element) {
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "width");
        Integer numY = strB != null ? StringsKt.Y(strB) : null;
        String strB2 = gkVar.b(element, "height");
        Integer numY2 = strB2 != null ? StringsKt.Y(strB2) : null;
        String strE = gkVar.e(element, "AltText");
        Element elementC = gkVar.c(element, "StaticResource");
        dg dgVarA = elementC != null ? eg.f13824a.a(elementC) : null;
        if (dgVarA != null) {
            return new u8(numY, numY2, strE, dgVarA);
        }
        return null;
    }
}
