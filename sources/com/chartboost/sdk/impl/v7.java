package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v7 f15393a = new v7();

    public final t7 a(Element element, ii context) {
        String string;
        String strB;
        String string2;
        Intrinsics.f(element, "element");
        Intrinsics.f(context, "context");
        String strB2 = gk.f14032a.b(element, "type");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                String nodeName = element2.getNodeName();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length2 = element2.getAttributes().getLength();
                for (int i3 = 0; i3 < length2; i3++) {
                    Node nodeItem2 = element2.getAttributes().item(i3);
                    String nodeName2 = nodeItem2.getNodeName();
                    Intrinsics.e(nodeName2, "getNodeName(...)");
                    String nodeValue = nodeItem2.getNodeValue();
                    Intrinsics.e(nodeValue, "getNodeValue(...)");
                    linkedHashMap.put(nodeName2, nodeValue);
                }
                String textContent2 = element2.getTextContent();
                String str = (textContent2 == null || (string2 = StringsKt.a0(textContent2).toString()) == null || string2.length() <= 0) ? null : string2;
                if (Intrinsics.a(nodeName, "Tracking") && Intrinsics.a(element2.getParentNode(), element) && (strB = gk.f14032a.b(element2, "event")) != null && str != null) {
                    context.b().add(new dh(strB, str, context.c(), null, null, 24, null));
                }
                Intrinsics.c(nodeName);
                arrayList.add(new u7(nodeName, linkedHashMap, str));
            }
        }
        return new t7(strB2, string, arrayList);
    }

    public final List b(Element extensionsParentElement, ii context) {
        t7 t7VarA;
        Intrinsics.f(extensionsParentElement, "extensionsParentElement");
        Intrinsics.f(context, "context");
        List listD = gk.f14032a.d(extensionsParentElement, "Extension");
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            try {
                t7VarA = f15393a.a((Element) it.next(), context);
            } catch (Exception e2) {
                za.b("Failed to parse Extension element: " + e2.getMessage(), e2);
                t7VarA = null;
            }
            if (t7VarA != null) {
                arrayList.add(t7VarA);
            }
        }
        return arrayList;
    }
}
