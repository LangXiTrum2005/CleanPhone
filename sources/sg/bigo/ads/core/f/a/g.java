package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<sg.bigo.ads.core.f.a.a.b> f48506a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Node f48507b;

    public g(Node node) {
        this.f48507b = node;
    }

    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = sg.bigo.ads.core.f.a.c(this.f48507b, "Error");
        if (listC != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final List<n> b() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f48507b, "Impression", null, null);
        ArrayList arrayList = new ArrayList();
        if (listB != null) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final List<n> c() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48507b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "Viewable")) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final List<n> d() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48507b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "NotViewable")) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final int e() {
        String strB = sg.bigo.ads.core.f.a.b(this.f48507b, "Expires");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            return 0;
        }
        try {
            return Integer.parseInt(strB);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String f() {
        String strB = sg.bigo.ads.core.f.a.b(this.f48507b, "AdTitle");
        return strB == null ? "" : strB;
    }

    public final String g() {
        String strB = sg.bigo.ads.core.f.a.b(this.f48507b, "Description");
        return strB == null ? "" : strB;
    }

    public final String h() {
        String strB = sg.bigo.ads.core.f.a.b(this.f48507b, "AdSystem");
        return strB == null ? "" : strB;
    }

    public final int i() {
        List<Node> listB;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48507b, "Extensions", null, null);
        if (nodeA != null && (listB = sg.bigo.ads.core.f.a.b(nodeA, "Extension", null, null)) != null && !listB.isEmpty()) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strB = sg.bigo.ads.core.f.a.b(it.next(), "Mute");
                if (sg.bigo.ads.common.utils.q.b((CharSequence) strB)) {
                    return sg.bigo.ads.common.utils.q.a(strB, -1);
                }
            }
        }
        return -1;
    }

    public final List<sg.bigo.ads.core.c.a> j() {
        List<Node> listB;
        List<Node> listC;
        Node namedItem;
        NodeList childNodes;
        String strTrim;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48507b, "Extensions", null, null);
        if (nodeA == null || (listB = sg.bigo.ads.core.f.a.b(nodeA, "Extension", null, null)) == null || listB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = listB.iterator();
        while (it.hasNext()) {
            Node nodeA2 = sg.bigo.ads.core.f.a.a(it.next(), "AdVerifications");
            if (nodeA2 != null && (listC = sg.bigo.ads.core.f.a.c(nodeA2, "Verification")) != null && !listC.isEmpty()) {
                for (Node node : listC) {
                    NamedNodeMap attributes = node.getAttributes();
                    if (attributes != null && (namedItem = attributes.getNamedItem("vendor")) != null) {
                        sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                        aVar.f48324b = namedItem.getNodeValue();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("omid");
                        Node nodeA3 = sg.bigo.ads.core.f.a.a(node, "JavaScriptResource", "apiFramework", arrayList2);
                        if (nodeA3 != null && (childNodes = nodeA3.getChildNodes()) != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childNodes.getLength()) {
                                    strTrim = "";
                                    break;
                                }
                                Node nodeItem = childNodes.item(i2);
                                if (nodeItem != null && (nodeValue2 = nodeItem.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                    strTrim = nodeValue2.trim();
                                    break;
                                }
                                i2++;
                            }
                            if (!strTrim.isEmpty()) {
                                aVar.f48323a = strTrim;
                                Node nodeA4 = sg.bigo.ads.core.f.a.a(node, "VerificationParameters");
                                if (nodeA4 != null && (childNodes2 = nodeA4.getChildNodes()) != null) {
                                    for (int i3 = 0; i3 < childNodes2.getLength(); i3++) {
                                        Node nodeItem2 = childNodes2.item(i3);
                                        if (nodeItem2 != null && (nodeValue = nodeItem2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.f48325c = nodeValue.trim();
                                            break;
                                        }
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<h> a(String... strArr) {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48507b, "Creatives");
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "Creative")) != null) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            linkedHashSet.add("Linear");
            if (!sg.bigo.ads.common.utils.k.a(strArr)) {
                linkedHashSet.addAll(Arrays.asList(strArr));
            }
            for (Node node : listC) {
                for (String str : linkedHashSet) {
                    Node nodeA2 = sg.bigo.ads.core.f.a.a(node, str);
                    if (nodeA2 != null) {
                        str.getClass();
                        if (str.equals("Linear")) {
                            arrayList.add(new h(nodeA2));
                        } else if (str.equals("CompanionAds")) {
                            this.f48506a.add(new sg.bigo.ads.core.f.a.a.a.b(nodeA2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
