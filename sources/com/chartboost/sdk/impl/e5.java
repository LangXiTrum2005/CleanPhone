package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e5 f13761a = new e5();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public final d5 a(Element element, ii context) {
        ?? arrayList;
        List listD;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "id");
        String strB2 = gkVar.b(element, "AdID");
        if (strB2 == null) {
            strB2 = gkVar.b(element, com.ironsource.sdk.controller.f.b.AD_ID);
        }
        String str = strB2;
        String strB3 = gkVar.b(element, "sequence");
        Integer numY = strB3 != null ? StringsKt.Y(strB3) : null;
        List listB = oh.f14791a.b(element);
        Element elementC = gkVar.c(element, "CreativeExtensions");
        if (elementC == null || (listD = gkVar.d(elementC, "CreativeExtension")) == null) {
            arrayList = EmptyList.X;
        } else {
            arrayList = new ArrayList(CollectionsKt.n(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(g5.f13983a.a((Element) it.next()));
            }
        }
        ?? r8 = arrayList;
        gk gkVar2 = gk.f14032a;
        Element elementC2 = gkVar2.c(element, "Linear");
        if (elementC2 != null) {
            return new d5.b(strB, str, numY, listB, ua.f15261a.a(elementC2, context), r8);
        }
        Element elementC3 = gkVar2.c(element, "CompanionAds");
        if (elementC3 != null) {
            return new d5.a(strB, str, numY, listB, o4.f14694a.b(elementC3, context), r8);
        }
        gkVar2.c(element, "NonLinearAds");
        return null;
    }

    public final Object b(Element creativesParentElement, ii context) {
        d5 d5VarA;
        Intrinsics.f(creativesParentElement, "creativesParentElement");
        Intrinsics.f(context, "context");
        List listD = gk.f14032a.d(creativesParentElement, "Creative");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                d5VarA = f13761a.a((Element) it.next(), context);
            } catch (Exception e2) {
                za.b("Failed to parse Creative element: " + e2.getMessage(), e2);
                d5VarA = null;
            }
            if (d5VarA != null) {
                arrayList.add(d5VarA);
            }
        }
        return arrayList;
    }
}
