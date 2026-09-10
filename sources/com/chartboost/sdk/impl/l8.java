package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l8 f14410a = new l8();

    public final k8 a(Element element) {
        String string;
        Intrinsics.f(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return new k8(string);
        }
        return null;
    }
}
