package sg.bigo.ads.controller.d;

import java.util.Map;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends a {
    public e(g gVar, sg.bigo.ads.controller.a.b bVar) {
        super(gVar, bVar);
    }

    @Override // sg.bigo.ads.common.j
    public final void a(Map<String, Object> map, final j.a aVar) {
        new l(map, this.f48035a, this.f48036b, new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.d.e.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i2, int i3, int i4, String str, Object obj) {
                j.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(i3, i4, str);
                }
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i2, String str) {
                j.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }).b();
    }
}
