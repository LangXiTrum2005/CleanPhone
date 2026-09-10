package com.chartboost.sdk.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes3.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gk f14032a = new gk();

    public final List a(Element element, String tagName) {
        Intrinsics.f(element, "<this>");
        Intrinsics.f(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = elementsByTagName.item(i2);
            if (nodeItem instanceof Element) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public final String b(Element element, String name) {
        Intrinsics.f(element, "<this>");
        Intrinsics.f(name, "name");
        if (!element.hasAttribute(name)) {
            return null;
        }
        String attribute = element.getAttribute(name);
        Intrinsics.e(attribute, "getAttribute(...)");
        String string = StringsKt.a0(attribute).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public final Element c(Element element, String tagName) {
        Intrinsics.f(element, "<this>");
        Intrinsics.f(tagName, "tagName");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.a(element2.getNodeName(), tagName)) {
                    return element2;
                }
            }
        }
        return null;
    }

    public final List d(Element element, String tagName) {
        Intrinsics.f(element, "<this>");
        Intrinsics.f(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if ((nodeItem instanceof Element) && Intrinsics.a(((Element) nodeItem).getNodeName(), tagName)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public final String e(Element element, String tagName) {
        String string;
        Intrinsics.f(element, "<this>");
        Intrinsics.f(tagName, "tagName");
        NodeList elementsByTagName = element.getElementsByTagName(tagName);
        int length = elementsByTagName.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = elementsByTagName.item(i2);
            if (Intrinsics.a(nodeItem.getParentNode(), element) && (nodeItem instanceof Element)) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.a(element2.getNodeName(), tagName)) {
                    String textContent = element2.getTextContent();
                    if (textContent == null || (string = StringsKt.a0(textContent).toString()) == null || string.length() <= 0) {
                        return null;
                    }
                    return string;
                }
            }
        }
        return null;
    }

    public final List f(Element element, String tagName) {
        String textContent;
        String string;
        Intrinsics.f(element, "<this>");
        Intrinsics.f(tagName, "tagName");
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (Intrinsics.a(element2.getNodeName(), tagName) && (textContent = element2.getTextContent()) != null && (string = StringsKt.a0(textContent).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object a(String xmlString) {
        Intrinsics.f(xmlString, "xmlString");
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            documentBuilderFactoryNewInstance.setValidating(false);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(xmlString)));
            document.getDocumentElement().normalize();
            return document;
        } catch (Exception e2) {
            za.b("Error parsing XML string.", e2);
            return ResultKt.a(new qa(android.support.v4.media.a.C("Error parsing VAST XML: ", e2.getMessage()), null, 2, null));
        }
    }
}
