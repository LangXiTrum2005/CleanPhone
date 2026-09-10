package sg.bigo.ads.core.f.a.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.core.f.a.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Node f48479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<sg.bigo.ads.core.f.a.a.d> f48480b;

    public b(Node node) {
        this.f48479a = node;
    }

    @Override // sg.bigo.ads.core.f.a.a.b
    public final List<sg.bigo.ads.core.f.a.a.d> a() {
        if (this.f48480b == null) {
            this.f48480b = new ArrayList();
            Iterator<Node> it = sg.bigo.ads.core.f.a.c(this.f48479a, "Companion").iterator();
            while (it.hasNext()) {
                this.f48480b.add(new d(it.next()));
            }
        }
        return this.f48480b;
    }
}
