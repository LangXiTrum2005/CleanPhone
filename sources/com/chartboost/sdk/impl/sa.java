package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sa f15118a = new sa();

    public final ra a(Element element) {
        String string;
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "apiFramework");
        String strB2 = gkVar.b(element, "browserOptional");
        String str = null;
        Boolean boolValueOf = strB2 != null ? Boolean.valueOf(Boolean.parseBoolean(strB2)) : null;
        String textContent = element.getTextContent();
        if (textContent != null && (string = StringsKt.a0(textContent).toString()) != null && string.length() > 0) {
            str = string;
        }
        return new ra(strB, boolValueOf, str);
    }
}
