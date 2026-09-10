package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ca f13587a = new ca();

    public final Object a(Element element, ii context) {
        String str;
        List listB;
        List listD;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strE = gkVar.e(element, "AdSystem");
        String strE2 = gkVar.e(element, "AdTitle");
        String strE3 = gkVar.e(element, "Description");
        String strE4 = gkVar.e(element, "Error");
        if (strE4 != null) {
            str = strE4;
            context.b().add(new dh("error", str, context.c(), null, null, 24, null));
        } else {
            str = strE4;
        }
        List listF = gkVar.f(element, "Impression");
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            context.b().add(new dh("impression", (String) it.next(), context.c(), null, null, 24, null));
        }
        gk gkVar2 = gk.f14032a;
        Element elementC = gkVar2.c(element, "Creatives");
        if (elementC == null) {
            return ResultKt.a(new pb("Creatives in InLine", null, 2, null));
        }
        Object objB = e5.f13761a.b(elementC, context);
        if (objB instanceof Result.Failure) {
            Throwable thA = Result.a(objB);
            Intrinsics.c(thA);
            return ResultKt.a(thA);
        }
        Element elementC2 = gkVar2.c(element, "Extensions");
        if (elementC2 == null || (listB = v7.f15393a.b(elementC2, context)) == null) {
            listB = EmptyList.X;
        }
        List list = listB;
        ArrayList arrayList = new ArrayList();
        Element elementC3 = gkVar2.c(element, "AdVerifications");
        if (elementC3 != null) {
            arrayList.addAll(r0.f14983a.b(elementC3, context));
        }
        if (elementC2 != null && (listD = gkVar2.d(elementC2, "Extension")) != null) {
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                Element elementC4 = gk.f14032a.c((Element) it2.next(), "AdVerifications");
                if (elementC4 != null) {
                    arrayList.addAll(r0.f14983a.b(elementC4, context));
                }
            }
        }
        List listQ = CollectionsKt.q(arrayList);
        context.a().addAll(listQ);
        List listB2 = uj.f15333a.b(element);
        ResultKt.b(objB);
        return new ba(strE, strE2, strE3, str, listF, (List) objB, list, listQ, listB2);
    }
}
