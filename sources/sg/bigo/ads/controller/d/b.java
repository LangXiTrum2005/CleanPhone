package sg.bigo.ads.controller.d;

import java.util.Map;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {
    public b(g gVar, sg.bigo.ads.controller.a.b bVar) {
        super(gVar, bVar);
    }

    @Override // sg.bigo.ads.common.j
    public final void a(Map<String, Object> map, final j.a aVar) {
        new sg.bigo.ads.controller.g.f(map, this.f48035a, this.f48036b, new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.d.b.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i2, int i3, int i4, String str, Object obj) {
                aVar.a(i3, i4, str);
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i2, String str) {
                aVar.a();
            }
        }).b();
    }
}
