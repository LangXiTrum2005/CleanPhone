package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.view.ViewGroup;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ViewGroup f48540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f48541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0870a f48542c;
    private final b.a d = new b.a() { // from class: sg.bigo.ads.core.g.a.a.1
        @Override // sg.bigo.ads.core.g.a.b.a
        public final void a() {
            InterfaceC0870a interfaceC0870a = a.this.f48542c;
            if (interfaceC0870a != null) {
                interfaceC0870a.a();
            }
            b bVarB = a.this.b();
            u.a(bVarB, a.this.f48540a, null, -1);
            bVarB.setVPAIDEvenListener(a.this.f48541b.getVPAIDEvenListener());
            bVarB.setLayoutParams(a.this.f48541b.getLayoutParams());
            u.b(a.this.f48541b);
            a.this.f48541b = bVarB;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f48543e;
    private final String f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f48544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f48545i;
    private final String j;
    private final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private sg.bigo.ads.api.core.u f48546l;

    /* JADX INFO: renamed from: sg.bigo.ads.core.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0870a {
        void a();
    }

    public a(Context context, ViewGroup viewGroup, String str, int i2, int i3, f fVar, String str2, int i4, sg.bigo.ads.api.core.u uVar) {
        this.f48543e = context;
        this.f48540a = viewGroup;
        this.f = str;
        this.g = i2;
        this.f48544h = i3;
        this.f48545i = fVar;
        this.j = str2;
        this.k = i4;
        this.f48546l = uVar;
        b bVarB = b();
        this.f48541b = bVarB;
        u.a(bVarB, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f48541b.a("window.vpaidwrapper.pauseAd()");
    }

    public final b b() {
        b bVar = new b(this.f48543e, this.f, this.g, this.f48544h, this.f48545i, this.j, this.k, this.f48546l);
        bVar.setOnRenderProcessGoneListener(this.d);
        return bVar;
    }
}
