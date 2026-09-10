package sg.bigo.ads.controller.g;

import java.util.Map;
import sg.bigo.ads.common.u.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<T extends sg.bigo.ads.common.u.a> extends a<T> {
    private final sg.bigo.ads.controller.b j;
    private final Map<String, Object> k;

    public e(Map<String, Object> map, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.controller.b bVar2) {
        super(gVar, bVar);
        this.j = bVar2;
        this.k = map;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i2, int i3, String str) {
        this.j.a(a(), i2, i3, str, null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, Map<String, Object> map) {
        this.j.a(a(), str);
    }

    @Override // sg.bigo.ads.controller.g.a
    public void a(a.b bVar) {
        for (String str : this.k.keySet()) {
            bVar.a(str, this.k.get(str));
        }
    }
}
