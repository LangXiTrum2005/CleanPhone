package sg.bigo.ads.core.f.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Node f48508a;

    public h(Node node) {
        this.f48508a = node;
    }

    public final String a() {
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48508a, "VideoClicks", null, null);
        if (nodeA == null) {
            return null;
        }
        return sg.bigo.ads.core.f.a.a(sg.bigo.ads.core.f.a.a(nodeA, "ClickThrough", null, null));
    }

    public final List<n> b() {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48508a, "VideoClicks");
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "ClickTracking")) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (strA != null) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final List<j> c() {
        List<String> listB = b("mute");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(it.next(), true));
        }
        Iterator<String> it2 = b("unmute").iterator();
        while (it2.hasNext()) {
            arrayList.add(new j(it2.next(), false));
        }
        return arrayList;
    }

    public final List<n> d() {
        List<n> listA = a("close");
        listA.addAll(a("closeLinear"));
        return listA;
    }

    public final List<n> e() {
        List<String> listB = b("pause");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    public final List<n> f() {
        List<String> listB = b("resume");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next(), (byte) 0));
        }
        return arrayList;
    }

    public final List<l> g() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, b("firstQuartile"), 25.0f);
        a(arrayList, b("midpoint"), 50.0f);
        a(arrayList, b("thirdQuartile"), 75.0f);
        List<Node> listB = sg.bigo.ads.core.f.a.b(sg.bigo.ads.core.f.a.a(this.f48508a, "TrackingEvents"), "Tracking", "event", Collections.singletonList("progress"));
        if (listB != null) {
            for (Node node : listB) {
                String strE = sg.bigo.ads.core.f.a.e(node, "offset");
                if (strE != null) {
                    String strTrim = strE.trim();
                    if (o.a(strTrim)) {
                        String strA = sg.bigo.ads.core.f.a.a(node);
                        try {
                            int iD = o.d(strTrim);
                            if (iD >= 0 && sg.bigo.ads.common.utils.q.b((CharSequence) strA)) {
                                arrayList.add(new l(strA, iD));
                            }
                        } catch (NumberFormatException unused) {
                            sg.bigo.ads.common.t.a.a(0, 3, "VastLinearNode", "Failed to parse VAST progress tracker " + strTrim);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List<c> h() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new c(it.next(), 0));
        }
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48508a, "TrackingEvents");
        List<Node> listB = sg.bigo.ads.core.f.a.b(nodeA, "Tracking", "event", Collections.singletonList("progress"));
        if (listB != null) {
            for (Node node : listB) {
                String strE = sg.bigo.ads.core.f.a.e(node, "offset");
                if (strE != null) {
                    String strTrim = strE.trim();
                    if (o.b(strTrim)) {
                        String strB = sg.bigo.ads.core.f.a.b(node);
                        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
                            try {
                                int iC = o.c(strTrim);
                                if (iC >= 0) {
                                    arrayList.add(new c(strB, iC));
                                }
                            } catch (NumberFormatException unused) {
                                sg.bigo.ads.common.t.a.a(0, 3, "VastLinearNode", "Failed to parse VAST progress tracker " + strTrim);
                            }
                        }
                    }
                }
            }
        }
        List<Node> listB2 = sg.bigo.ads.core.f.a.b(nodeA, "Tracking", "event", Collections.singletonList("creativeView"));
        if (listB2 != null) {
            Iterator<Node> it2 = listB2.iterator();
            while (it2.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it2.next());
                if (strA != null) {
                    arrayList.add(new c(strA, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final int i() {
        String strB = sg.bigo.ads.core.f.a.b(this.f48508a, "Duration");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            return -1;
        }
        return o.c(strB);
    }

    private List<String> b(String str) {
        List<Node> listB;
        ArrayList arrayList = new ArrayList();
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48508a, "TrackingEvents");
        if (nodeA != null && (listB = sg.bigo.ads.core.f.a.b(nodeA, "Tracking", "event", Collections.singletonList(str))) != null) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
        }
        return arrayList;
    }

    public final List<n> a(String str) {
        List<String> listB = b(str);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new n(it.next()));
        }
        return arrayList;
    }

    private static void a(List<l> list, List<String> list2, float f) {
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            list.add(new l(it.next(), f));
        }
    }
}
