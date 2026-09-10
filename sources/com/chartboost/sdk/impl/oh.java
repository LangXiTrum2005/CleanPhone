package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oh f14791a = new oh();

    public final nh a(Element element) {
        String string;
        Intrinsics.f(element, "element");
        String strB = gk.f14032a.b(element, "idRegistry");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        return new nh(strB, string);
    }

    public final List b(Element parentElement) {
        nh nhVarA;
        Intrinsics.f(parentElement, "parentElement");
        List listD = gk.f14032a.d(parentElement, "UniversalAdId");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                nhVarA = f14791a.a((Element) it.next());
            } catch (Exception e2) {
                za.b("Failed to parse UniversalAdId element: " + e2.getMessage(), e2);
                nhVarA = null;
            }
            if (nhVarA != null) {
                arrayList.add(nhVarA);
            }
        }
        return arrayList;
    }
}
