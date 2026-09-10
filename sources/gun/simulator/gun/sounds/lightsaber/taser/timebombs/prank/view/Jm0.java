package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class Jm0 extends M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TN f3283a;
    public final Y60 b;
    public final C4348po0 c;
    public Im0 d;
    public V2 e;
    public boolean f;
    public boolean g;
    public final String h;
    public boolean i;
    public boolean j;

    public Jm0(Y60 y60, TN tn) {
        V2 fm0;
        WebView webView;
        String str;
        String string = UUID.randomUUID().toString();
        this.c = new C4348po0();
        this.f = false;
        this.g = false;
        this.b = y60;
        this.f3283a = tn;
        this.h = string;
        this.d = new Im0(null);
        R2 r2 = (R2) tn.i;
        R2 r3 = R2.HTML;
        int i = tn.f3770a;
        if (r2 == r3 || r2 == R2.JAVASCRIPT) {
            switch (i) {
                case 1:
                    webView = (WebView) tn.d;
                    break;
                default:
                    webView = (WebView) tn.d;
                    break;
            }
            fm0 = new Fm0(string, 1);
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            fm0.b(webView);
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
            fm0 = new C4961wn0(string, mapB, str);
        }
        this.e = fm0;
        this.e.r();
        Hn0.c.f3186a.add(this);
        V2 v2 = this.e;
        C4003lv.b.a(v2.q(), "init", y60.f(), v2.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M2
    public final void b() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.f4852a.clear();
        }
        this.g = true;
        this.e.o();
        Hn0 hn0 = Hn0.c;
        boolean z = hn0.b.size() > 0;
        hn0.f3186a.remove(this);
        ArrayList arrayList = hn0.b;
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            C4523ro0.f().h();
        }
        this.e.m();
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M2
    public final void c(View view) {
        if (this.g || ((View) this.d.get()) == view) {
            return;
        }
        this.d = new Im0(view);
        this.e.k();
        Collection<Jm0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(Hn0.c.f3186a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (Jm0 jm0 : collectionUnmodifiableCollection) {
            if (jm0 != this && ((View) jm0.d.get()) == view) {
                jm0.d.clear();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M2
    public final void d() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        Hn0 hn0 = Hn0.c;
        boolean z = hn0.b.size() > 0;
        hn0.b.add(this);
        if (!z) {
            C4523ro0.f().g();
        }
        this.e.a(C4523ro0.f().c());
        V2 v2 = this.e;
        Date date = Km0.f.b;
        v2.h(date != null ? (Date) date.clone() : null);
        this.e.c(this, this.f3283a);
    }
}
