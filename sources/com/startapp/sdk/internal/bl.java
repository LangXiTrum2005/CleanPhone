package com.startapp.sdk.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bl {
    public static ArrayList a(Node node, String str, String str2, List list, Set set) {
        NamedNodeMap attributes;
        Node namedItem;
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            if ((str == null || str.equals(nodeItem.getNodeName())) && ((TextUtils.isEmpty(str2) || list == null || ((attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem(str2)) != null && list.contains(namedItem.getNodeValue()))) && (set == null || !set.contains(Short.valueOf(nodeItem.getNodeType()))))) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }
}
