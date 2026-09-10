package sg.bigo.ads.core.f.a.a.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.core.f.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Node f48483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48485c;
    private final int d;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.core.f.a.a.a f48487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48488i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.g> f48486e = new ArrayList();
    private final List<String> f = new ArrayList();
    private final List<sg.bigo.ads.core.f.a.a.c> j = new ArrayList();

    public d(Node node) {
        this.f48483a = node;
        this.f48484b = sg.bigo.ads.core.f.a.e(node, "id");
        this.f48485c = sg.bigo.ads.core.f.a.d(node, "width").intValue();
        this.d = sg.bigo.ads.core.f.a.d(node, "height").intValue();
        g();
    }

    private void g() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f48483a, "StaticResource", null, null);
        if (!k.a((Collection) listB)) {
            for (Node node : listB) {
                this.f48486e.add(new g(sg.bigo.ads.core.f.a.e(node, "creativeType"), sg.bigo.ads.core.f.a.a(node)));
            }
        }
        List<Node> listB2 = sg.bigo.ads.core.f.a.b(this.f48483a, "IFrameResource", null, null);
        if (!k.a((Collection) listB2)) {
            Iterator<Node> it = listB2.iterator();
            while (it.hasNext()) {
                this.f48486e.add(new f(sg.bigo.ads.core.f.a.b(it.next())));
            }
        }
        List<Node> listB3 = sg.bigo.ads.core.f.a.b(this.f48483a, "HTMLResource", null, null);
        if (!k.a((Collection) listB3)) {
            Iterator<Node> it2 = listB3.iterator();
            while (it2.hasNext()) {
                this.f48486e.add(new e(sg.bigo.ads.core.f.a.b(it2.next())));
            }
        }
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f48483a, "AltText", null, null);
        if (nodeA != null) {
            this.g = sg.bigo.ads.core.f.a.b(nodeA);
        }
        Node nodeA2 = sg.bigo.ads.core.f.a.a(this.f48483a, "AdParameters", null, null);
        if (nodeA2 != null) {
            this.f48487h = new a(TextUtils.equals(sg.bigo.ads.core.f.a.e(nodeA2, "xmlEncoded"), com.p004ironsource.mediationsdk.metadata.a.g), sg.bigo.ads.core.f.a.b(nodeA2));
        }
        Node nodeA3 = sg.bigo.ads.core.f.a.a(this.f48483a, "CompanionClickThrough", null, null);
        if (nodeA3 != null) {
            this.f48488i = sg.bigo.ads.core.f.a.a(nodeA3);
        }
        List<Node> listB4 = sg.bigo.ads.core.f.a.b(this.f48483a, "CompanionClickTracking", null, null);
        if (!k.a((Collection) listB4)) {
            for (Node node2 : listB4) {
                this.j.add(new c(sg.bigo.ads.core.f.a.e(node2, "id"), sg.bigo.ads.core.f.a.a(node2)));
            }
        }
        Node nodeA4 = sg.bigo.ads.core.f.a.a(this.f48483a, "TrackingEvents", null, null);
        if (nodeA4 != null) {
            List<Node> listB5 = sg.bigo.ads.core.f.a.b(nodeA4, "Tracking", "event", Arrays.asList("creativeView"));
            if (k.a((Collection) listB5)) {
                return;
            }
            Iterator<Node> it3 = listB5.iterator();
            while (it3.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it3.next());
                if (!TextUtils.isEmpty(strA)) {
                    this.f.add(strA);
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int a() {
        return this.f48485c;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int b() {
        return this.d;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.g> c() {
        return this.f48486e;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final String d() {
        return this.f48488i;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.c> e() {
        return this.j;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<String> f() {
        return this.f;
    }
}
