package com.chartboost.sdk.impl;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f14796a = new p();

    public final Object a(Element element, ii context) {
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "id");
        Element elementC = gkVar.c(element, "InLine");
        Element elementC2 = gkVar.c(element, "Wrapper");
        if (elementC != null) {
            Object objA = ca.f13587a.a(elementC, context);
            return !(objA instanceof Result.Failure) ? new c.a(strB, (ba) objA) : objA;
        }
        if (elementC2 == null) {
            return ResultKt.a(new qa("Ad element must contain InLine or Wrapper", 101));
        }
        Object objA2 = fk.f13969a.a(elementC2, context);
        return !(objA2 instanceof Result.Failure) ? new c.b(strB, (ek) objA2) : objA2;
    }
}
