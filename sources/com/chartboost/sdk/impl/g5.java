package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g5 f13983a = new g5();

    public final f5 a(Element element) {
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        String strB = gkVar.b(element, "type");
        Element elementC = gkVar.c(element, "UniversalAdId");
        return new f5(strB, elementC != null ? oh.f14791a.a(elementC) : null);
    }
}
