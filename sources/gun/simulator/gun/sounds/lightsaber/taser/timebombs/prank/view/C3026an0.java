package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.an0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026an0 extends L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f4141a;
    public final O2 b;
    public Im0 d;
    public V2 e;
    public final String h;
    public boolean i;
    public boolean j;
    public final ArrayList c = new ArrayList();
    public boolean f = false;
    public boolean g = false;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C3026an0(O2 o2, P2 p2) {
        V2 fm0;
        this.b = o2;
        this.f4141a = p2;
        String string = UUID.randomUUID().toString();
        this.h = string;
        this.d = new Im0(null);
        Q2 q2 = p2.h;
        if (q2 == Q2.HTML || q2 == Q2.JAVASCRIPT) {
            fm0 = new Fm0(string, 0);
            WebView webView = p2.b;
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            fm0.b(webView);
        } else {
            fm0 = new C4697tn0(string, Collections.unmodifiableMap(p2.d), p2.e);
        }
        this.e = fm0;
        this.e.r();
        Fn0.c.f3088a.add(this);
        V2 v2 = this.e;
        G7 g7 = G7.m;
        WebView webViewQ = v2.q();
        String str = v2.b;
        o2.getClass();
        JSONObject jSONObject = new JSONObject();
        Gn0.b(jSONObject, "impressionOwner", o2.f3490a);
        Gn0.b(jSONObject, "mediaEventsOwner", o2.b);
        Gn0.b(jSONObject, "creativeType", o2.d);
        Gn0.b(jSONObject, "impressionType", o2.e);
        Gn0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(o2.c));
        g7.n(webViewQ, "init", jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L2
    public final void a(WebView webView) {
        if (this.g) {
            return;
        }
        AbstractC2340Cl.d(webView, "AdView is null");
        if (((View) this.d.get()) == webView) {
            return;
        }
        this.d = new Im0(webView);
        this.e.k();
        Collection<C3026an0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(Fn0.c.f3088a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (C3026an0 c3026an0 : collectionUnmodifiableCollection) {
            if (c3026an0 != this && ((View) c3026an0.d.get()) == webView) {
                c3026an0.d.clear();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L2
    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        Fn0 fn0 = Fn0.c;
        boolean z = fn0.b.size() > 0;
        fn0.b.add(this);
        if (!z) {
            C4523ro0.e().g();
        }
        this.e.a(C4523ro0.e().c());
        V2 v2 = this.e;
        Date date = C3115bn0.f.b;
        v2.h(date != null ? (Date) date.clone() : null);
        this.e.e(this, this.f4141a);
    }
}
