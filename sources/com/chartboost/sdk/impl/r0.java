package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f14983a = new r0();

    public final q0 a(Element element, ii context) {
        List<Element> listD;
        String string;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "vendor");
        Element elementC = gkVar.c(element, "JavaScriptResource");
        ra raVarA = elementC != null ? sa.f15118a.a(elementC) : null;
        Element elementC2 = gkVar.c(element, "TrackingEvents");
        ArrayList arrayList = new ArrayList();
        if (elementC2 != null && (listD = gkVar.d(elementC2, "Tracking")) != null) {
            for (Element element2 : listD) {
                gk gkVar2 = gk.f14032a;
                String strB2 = gkVar2.b(element2, "event");
                String strB3 = gkVar2.b(element2, "offset");
                String textContent = element2.getTextContent();
                String str = (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) ? null : string;
                if (strB2 != null && str != null) {
                    arrayList.add(new dh(strB2, str, context.c(), strB3, null, 16, null));
                }
            }
        }
        Element elementC3 = gk.f14032a.c(element, "VerificationParameters");
        return new q0(strB, raVarA, arrayList, elementC3 != null ? elementC3.getTextContent() : null);
    }

    public final List b(Element adVerificationsParentElement, ii context) {
        q0 q0VarA;
        Intrinsics.f(adVerificationsParentElement, "adVerificationsParentElement");
        Intrinsics.f(context, "context");
        List listD = gk.f14032a.d(adVerificationsParentElement, "Verification");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                q0VarA = f14983a.a((Element) it.next(), context);
            } catch (Exception e2) {
                za.b("Failed to parse AdVerification element: " + e2.getMessage(), e2);
                q0VarA = null;
            }
            if (q0VarA != null) {
                arrayList.add(q0VarA);
            }
        }
        return arrayList;
    }
}
