package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ib f14172a = new ib();

    public final hb a(Element element) {
        String str;
        Integer num;
        String string;
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "type");
        if (strB == null) {
            strB = "";
        }
        String strB2 = gkVar.b(element, "width");
        Integer numY = strB2 != null ? StringsKt.Y(strB2) : null;
        String strB3 = gkVar.b(element, "height");
        Integer numY2 = strB3 != null ? StringsKt.Y(strB3) : null;
        String strB4 = gkVar.b(element, "bitrate");
        Integer numY3 = strB4 != null ? StringsKt.Y(strB4) : null;
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null) {
            Integer num2 = numY2;
            str = "";
            num = num2;
        } else {
            num = numY2;
            str = string;
        }
        return new hb(strB, numY, num, numY3, str);
    }

    public final List b(Element parentElement) {
        hb hbVarA;
        Intrinsics.f(parentElement, "parentElement");
        List listD = gk.f14032a.d(parentElement, "MediaFile");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                hbVarA = f14172a.a((Element) it.next());
            } catch (Exception e2) {
                za.b("Failed to parse MediaFile element: " + e2.getMessage(), e2);
                hbVarA = null;
            }
            if (hbVarA != null) {
                arrayList.add(hbVarA);
            }
        }
        return arrayList;
    }
}
