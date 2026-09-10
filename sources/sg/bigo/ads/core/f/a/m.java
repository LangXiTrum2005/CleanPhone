package sg.bigo.ads.core.f.a;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Document f48520a;

    public final List<d> a() {
        ArrayList arrayList = new ArrayList();
        Document document = this.f48520a;
        if (document != null) {
            NodeList elementsByTagName = document.getElementsByTagName("Ad");
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                arrayList.add(new d(elementsByTagName.item(i2)));
            }
        }
        return arrayList;
    }
}
