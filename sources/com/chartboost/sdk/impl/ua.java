package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ua f15261a = new ua();

    public final ta a(Element element, ii context) {
        List listB;
        List listA;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        gk gkVar = gk.f14032a;
        String strE = gkVar.e(element, "Duration");
        Element elementC = gkVar.c(element, "TrackingEvents");
        EmptyList emptyList = EmptyList.X;
        List list = (elementC == null || (listA = hh.f14116a.a(elementC, context)) == null) ? emptyList : listA;
        Element elementC2 = gkVar.c(element, "VideoClicks");
        ti tiVarA = elementC2 != null ? ui.f15332a.a(elementC2) : null;
        Element elementC3 = gkVar.c(element, "MediaFiles");
        return new ta(strE, list, tiVarA, (elementC3 == null || (listB = ib.f14172a.b(elementC3)) == null) ? emptyList : listB, x8.f15529a.b(element, context));
    }
}
