package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eg f13824a = new eg();

    public final dg a(Element element) {
        String string;
        Intrinsics.f(element, "element");
        String strB = gk.f14032a.b(element, "creativeType");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new dg(strB, string);
        }
        return null;
    }
}
