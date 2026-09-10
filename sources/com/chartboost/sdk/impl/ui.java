package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ui f15332a = new ui();

    public final ti a(Element element) {
        Intrinsics.f(element, "element");
        gk gkVar = gk.f14032a;
        String strE = gkVar.e(element, "ClickThrough");
        List listF = gkVar.f(element, "ClickTracking");
        if (strE == null && listF.isEmpty()) {
            return null;
        }
        return new ti(strE, listF);
    }
}
