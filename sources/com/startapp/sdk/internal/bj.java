package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes6.dex */
public final class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Node f40842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40843b;

    public bj(Node node) {
        this.f40842a = node;
        this.f40843b = false;
    }

    public final ArrayList a(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bl.a(this.f40842a, str, str2, list, Collections.singleton((short) 8)).iterator();
        while (it.hasNext()) {
            arrayList.add(new bj((Node) it.next()));
        }
        return arrayList;
    }

    public final Integer b(String str) {
        try {
            String strA = a(str);
            if (strA != null) {
                return Integer.valueOf(Integer.parseInt(strA));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final ArrayList c(String str) {
        ArrayList arrayListA = a(str, null, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            String strB = ((bj) it.next()).b();
            if (!TextUtils.isEmpty(strB)) {
                arrayList.add(strB);
            }
        }
        return arrayList;
    }

    public final ArrayList d(String str) {
        return a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = d(str).iterator();
        while (it.hasNext()) {
            String strB = ((bj) it.next()).b();
            if (!TextUtils.isEmpty(strB)) {
                arrayList.add(strB);
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        bj bjVarA = a(str, null);
        if (bjVarA == null) {
            return null;
        }
        return bjVarA.b();
    }

    public final String b() {
        Node node = this.f40842a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public bj(String str) throws IOException {
        String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setCoalescing(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        ArrayList arrayListA = bl.a(documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst))), null, null, null, Collections.singleton((short) 8));
        Node node = arrayListA.isEmpty() ? null : (Node) arrayListA.get(0);
        if (node != null) {
            this.f40842a = node;
            this.f40843b = true;
            return;
        }
        throw new IOException();
    }

    public final bj a(String str, String str2) {
        ArrayList arrayListA = bl.a(this.f40842a, str, str2, null, Collections.singleton((short) 8));
        Node node = arrayListA.isEmpty() ? null : (Node) arrayListA.get(0);
        if (node != null) {
            return new bj(node);
        }
        return null;
    }

    public final String c() {
        String strA;
        bj bjVarA = a("StaticResource", null);
        if (bjVarA == null || (strA = bjVarA.a("creativeType")) == null) {
            return null;
        }
        return strA.toLowerCase(Locale.ROOT);
    }

    public final ArrayList a(String str, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        bj bjVarA = a(str2, null);
        return bjVarA == null ? arrayList : bjVarA.a(str, str3, list);
    }

    public final String a(String str) {
        Node namedItem = this.f40842a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = a("Creative", "Creatives", null, null).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((bj) it.next()).a("Companion", "CompanionAds", null, null));
        }
        return arrayList;
    }
}
