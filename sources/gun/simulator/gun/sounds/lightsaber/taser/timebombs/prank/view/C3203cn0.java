package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3203cn0 extends N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TN f4246a;
    public final Y60 b;
    public final C4436qo0 c;
    public Im0 d;
    public W2 e;
    public boolean f;
    public boolean g;
    public final String h;
    public boolean i;
    public boolean j;

    public C3203cn0(Y60 y60, TN tn) {
        W2 xm0;
        WebView webView;
        String str;
        String string = UUID.randomUUID().toString();
        this.c = new C4436qo0();
        this.f = false;
        this.g = false;
        this.b = y60;
        this.f4246a = tn;
        this.h = string;
        this.d = new Im0(null);
        S2 s2 = (S2) tn.i;
        S2 s3 = S2.HTML;
        int i = tn.f3770a;
        if (s2 == s3 || s2 == S2.JAVASCRIPT) {
            switch (i) {
                case 1:
                    webView = (WebView) tn.d;
                    break;
                default:
                    webView = (WebView) tn.d;
                    break;
            }
            xm0 = new Xm0(string);
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            xm0.b = new Im0(webView);
        } else {
            Map mapB = tn.b();
            switch (i) {
                case 1:
                    str = tn.b;
                    break;
                default:
                    str = tn.b;
                    break;
            }
            xm0 = new C4434qn0(string, mapB, str);
        }
        this.e = xm0;
        this.e.g();
        Cn0.c.f2942a.add(this);
        W2 w2 = this.e;
        CD.b.a(w2.f(), "init", y60.f(), w2.f3906a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2
    public final void a(View view, EnumC2584Lw enumC2584Lw) {
        C3996lo0 c3996lo0;
        if (this.g) {
            return;
        }
        C4436qo0 c4436qo0 = this.c;
        c4436qo0.getClass();
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        ArrayList arrayList = c4436qo0.f4903a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                c3996lo0 = null;
                break;
            }
            c3996lo0 = (C3996lo0) it.next();
        } while (c3996lo0.f4668a.get() != view);
        if (c3996lo0 == null) {
            arrayList.add(new C3996lo0(view, enumC2584Lw));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2
    public final void c() {
        if (this.g) {
            return;
        }
        this.d.clear();
        e();
        this.g = true;
        W2 w2 = this.e;
        CD.b.a(w2.f(), "finishSession", w2.f3906a);
        Cn0 cn0 = Cn0.c;
        boolean z = cn0.b.size() > 0;
        cn0.f2942a.remove(this);
        ArrayList arrayList = cn0.b;
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            C4523ro0.d().h();
        }
        this.e.e();
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2
    public final void d(View view) {
        if (this.g) {
            return;
        }
        AbstractC2995aW.d(view, "AdView is null");
        if (((View) this.d.get()) == view) {
            return;
        }
        this.d = new Im0(view);
        W2 w2 = this.e;
        w2.getClass();
        w2.f = System.nanoTime();
        w2.e = 1;
        Collection<C3203cn0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(Cn0.c.f2942a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (C3203cn0 c3203cn0 : collectionUnmodifiableCollection) {
            if (c3203cn0 != this && ((View) c3203cn0.d.get()) == view) {
                c3203cn0.d.clear();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2
    public final void e() {
        if (this.g) {
            return;
        }
        this.c.f4903a.clear();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2
    public final void f() {
        if (this.f) {
            return;
        }
        this.f = true;
        Cn0 cn0 = Cn0.c;
        boolean z = cn0.b.size() > 0;
        cn0.b.add(this);
        if (!z) {
            C4523ro0.d().g();
        }
        float fC = C4523ro0.d().c();
        W2 w2 = this.e;
        CD.b.a(w2.f(), "setDeviceVolume", Float.valueOf(fC), w2.f3906a);
        W2 w3 = this.e;
        Date date = Mm0.f.b;
        w3.d(date != null ? (Date) date.clone() : null);
        this.e.a(this, this.f4246a);
    }
}
