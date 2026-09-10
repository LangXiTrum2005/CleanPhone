package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hh f14116a = new hh();

    public final List a(Element trackingEventsParentElement, ii context) {
        String string;
        Intrinsics.f(trackingEventsParentElement, "trackingEventsParentElement");
        Intrinsics.f(context, "context");
        ArrayList arrayList = new ArrayList();
        for (Element element : gk.f14032a.d(trackingEventsParentElement, "Tracking")) {
            gk gkVar = gk.f14032a;
            String strB = gkVar.b(element, "event");
            String strB2 = gkVar.b(element, "offset");
            String textContent = element.getTextContent();
            if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
                string = null;
            }
            String str = string;
            if (str != null) {
                dh dhVar = new dh(strB, str, context.c(), strB2, null, 16, null);
                arrayList.add(dhVar);
                context.b().add(dhVar);
            }
        }
        return arrayList;
    }
}
