package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONObject;
import saneness.dovishness;
import saneness.glassmaker;
import saneness.graunch;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends glassmaker {
    public final p4 a;
    public dovishness c;
    public t4 d;
    public final String g;
    public final wk0 b = new wk0();
    public boolean e = false;
    public boolean f = false;

    public r4(o4 o4Var, p4 p4Var, String str) {
        this.a = p4Var;
        this.g = str;
        c();
        if (p4Var.a() == q4.b || p4Var.a() == q4.c) {
            this.d = new graunch(p4Var.d(), str);
        } else {
            this.d = new uk1(str, p4Var.c(), p4Var.b());
        }
        this.d.c();
        s4.a().a(this);
        this.d.a(o4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // saneness.glassmaker
    public final void a() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        t4 t4Var = this.d;
        rv1.a.a((WebView) t4Var.b.get(), "finishSession", t4Var.a);
        s4 s4Var = s4.c;
        boolean z = s4Var.b.size() > 0;
        s4Var.a.remove(this);
        s4Var.b.remove(this);
        if (z && s4Var.b.size() <= 0) {
            ax1 ax1VarA = ax1.a();
            ax1VarA.getClass();
            s23 s23Var = s23.g;
            s23Var.getClass();
            Handler handler = s23.i;
            if (handler != null) {
                handler.removeCallbacks(s23.k);
                s23.i = null;
            }
            s23Var.a.clear();
            s23.h.post(new p23(s23Var));
            n4 n4Var = n4.d;
            n4Var.a = false;
            n4Var.c = null;
            cd0 cd0Var = ax1VarA.d;
            cd0Var.b.getContentResolver().unregisterContentObserver(cd0Var);
        }
        this.d.b();
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // saneness.glassmaker
    public final void b() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        s4 s4Var = s4.c;
        boolean z = s4Var.b.size() > 0;
        s4Var.b.add(this);
        if (!z) {
            ax1 ax1VarA = ax1.a();
            ax1VarA.getClass();
            n4 n4Var = n4.d;
            n4Var.c = ax1VarA;
            n4Var.b();
            s23.g.getClass();
            if (s23.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                s23.i = handler;
                handler.post(s23.j);
                s23.i.postDelayed(s23.k, 200L);
            }
            cd0 cd0Var = ax1VarA.d;
            cd0Var.h.submit(new bd0(cd0Var));
            cd0Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cd0Var);
        }
        float f = ax1.a().a;
        t4 t4Var = this.d;
        rv1 rv1Var = rv1.a;
        rv1Var.a((WebView) t4Var.b.get(), "setDeviceVolume", Float.valueOf(f), t4Var.a);
        t4 t4Var2 = this.d;
        Date date = o.f.b;
        Date date2 = date != null ? (Date) date.clone() : null;
        t4Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            nw1.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            rv1Var.a((WebView) t4Var2.b.get(), "setLastActivity", jSONObject);
        }
        this.d.a(this, this.a);
    }

    public final void c() {
        this.c = new dovishness(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // saneness.glassmaker
    public final void a(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new dovishness(view);
        this.d.a();
        Collection<r4> collectionUnmodifiableCollection = Collections.unmodifiableCollection(s4.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (r4 r4Var : collectionUnmodifiableCollection) {
            if (r4Var != this && ((View) r4Var.c.get()) == view) {
                r4Var.c.clear();
            }
        }
    }
}
