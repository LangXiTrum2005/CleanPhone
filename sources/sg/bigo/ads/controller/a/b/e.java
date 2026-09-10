package sg.bigo.ads.controller.a.b;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Map;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;
import sg.bigo.ads.controller.g.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Pair<String, Integer> f47848a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k.a f47849i;

    public e(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
        this.f47848a = null;
        this.f47849i = new k.a() { // from class: sg.bigo.ads.controller.a.b.e.1
            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str, int i2, int i3, int i4, String str2, Map<String, Object> map) {
                e.this.f47839h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f47848a, c.a(i4));
            }

            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str, int i2, String str2, Map<String, Object> map) {
                e.this.f47839h.set(false);
                e eVar = e.this;
                eVar.a(eVar.f47848a, false);
            }
        };
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.b();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f47836b.f47798a.g;
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(Pair<String, Integer> pair) {
        if (pair == null) {
            return;
        }
        this.f47839h.set(true);
        this.f47848a = pair;
        sg.bigo.ads.controller.a.b bVar = this.f47836b;
        String str = (String) pair.first;
        k.a aVar = this.f47849i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        k kVar = new k(bVar.f47799b, bVar, new k.a() { // from class: sg.bigo.ads.controller.a.b.3

            /* JADX INFO: renamed from: a */
            final /* synthetic */ sg.bigo.ads.controller.a.a.c f47808a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ sg.bigo.ads.controller.g.k.a f47809b;

            public AnonymousClass3() {
                cVar = cVar;
                aVar = aVar;
            }

            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str2, int i2, int i3, int i4, String str3, Map<String, Object> map) {
                sg.bigo.ads.controller.g.k.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i2, i3, i4, str3, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str2, int i2, String str3, Map<String, Object> map) {
                cVar.f47770h = System.currentTimeMillis();
                b.this.f47798a.a(0L);
                sg.bigo.ads.controller.g.k.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str2, i2, str3, map);
                }
            }
        });
        kVar.f48151i = str;
        kVar.b();
    }
}
