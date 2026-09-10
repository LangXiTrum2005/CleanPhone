package sg.bigo.ads.core.f;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.CDATASection;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    public static String a(Node node) {
        String nodeValue;
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            int iMin = Math.min(childNodes.getLength(), 5);
            if (iMin <= 0) {
                if (node != null) {
                    return null;
                }
                return null;
            }
            for (int i2 = 0; i2 < iMin; i2++) {
                Node nodeItem = childNodes.item(i2);
                if ((nodeItem instanceof CDATASection) && nodeItem.getNodeValue() != null) {
                    nodeValue = nodeItem.getNodeValue();
                }
            }
            if (node != null) {
                return null;
            }
            return null;
        }
        if (node != null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        nodeValue = node.getFirstChild().getNodeValue();
        return nodeValue.trim();
    }

    public static String b(Node node) {
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                Node nodeItem = childNodes.item(i2);
                if (nodeItem != null && !q.b(nodeItem.getNodeValue())) {
                    return nodeItem.getNodeValue();
                }
            }
        }
        return null;
    }

    public static List<Node> c(Node node, String str) {
        return b(node, str, null, null);
    }

    public static Integer d(Node node, String str) {
        if (node == null) {
            return -1;
        }
        String strE = e(node, str);
        if (q.a((CharSequence) strE)) {
            return -1;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strE));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String e(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static Node a(Node node, String str) {
        return a(node, str, null, null);
    }

    public static String b(Node node, String str) {
        Node nodeA = a(node, str, null, null);
        if (nodeA == null) {
            return null;
        }
        String strB = b(nodeA);
        if (q.a((CharSequence) strB)) {
            return null;
        }
        return strB;
    }

    public static Node a(Node node, String str, String str2, List<String> list) {
        List<Node> listB;
        if (node == null || str == null || (listB = b(node, str, str2, list)) == null || listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    public static List<Node> b(Node node, String str, String str2, List<String> list) {
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeName().equals(str) && a(nodeItem, str2, list)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    private static boolean a(Node node, String str, List<String> list) {
        Node namedItem;
        if (str == null || list == null) {
            return true;
        }
        NamedNodeMap attributes = node.getAttributes();
        return (attributes == null || (namedItem = attributes.getNamedItem(str)) == null || !list.contains(namedItem.getNodeValue())) ? false : true;
    }
}
