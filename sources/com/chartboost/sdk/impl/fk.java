package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fk f13969a = new fk();

    public final Object a(Element element, ii context) {
        List listB;
        List listD;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strE = gkVar.e(element, "AdSystem");
        String strE2 = gkVar.e(element, "Error");
        List listF = gkVar.f(element, "Impression");
        String strE3 = gkVar.e(element, "VASTAdTagURI");
        if (strE3 == null) {
            return ResultKt.a(new pb("VASTAdTagURI in Wrapper", null, 2, null));
        }
        Element elementC = gkVar.c(element, "Creatives");
        EmptyList emptyList = EmptyList.X;
        Object objB = elementC != null ? e5.f13761a.b(elementC, context) : emptyList;
        if (objB instanceof Result.Failure) {
            Throwable thA = Result.a(objB);
            Intrinsics.c(thA);
            return ResultKt.a(thA);
        }
        Element elementC2 = gkVar.c(element, "Extensions");
        if (elementC2 == null || (listB = v7.f15393a.b(elementC2, context)) == null) {
            listB = emptyList;
        }
        ArrayList arrayList = new ArrayList();
        Element elementC3 = gkVar.c(element, "AdVerifications");
        if (elementC3 != null) {
            arrayList.addAll(r0.f14983a.b(elementC3, context));
        }
        if (elementC2 != null && (listD = gkVar.d(elementC2, "Extension")) != null) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                Element elementC4 = gk.f14032a.c((Element) it.next(), "AdVerifications");
                if (elementC4 != null) {
                    arrayList.addAll(r0.f14983a.b(elementC4, context));
                }
            }
        }
        List listB2 = uj.f15333a.b(element);
        ResultKt.b(objB);
        return new ek(strE, strE2, listF, (List) objB, listB, strE3, arrayList, listB2);
    }
}
