package jc;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.p;
import j1.f;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import na.g;
import qk.w;
import s0.i;
import v0.k;
import v0.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f43812d = {d0.f44761a.h(new kotlin.jvm.internal.w(d.NO_RECEIVER, c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f43814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f43815c;

    /* JADX WARN: Type inference failed for: r1v1, types: [jc.a] */
    public c(Context context, String name) {
        n.f(context, "context");
        n.f(name, "name");
        this.f43813a = name;
        this.f43814b = new ThreadLocal();
        final int i10 = 0;
        g gVar = new g(new jk.b(this) { // from class: jc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f43807b;

            {
                this.f43807b = this;
            }

            @Override // jk.b
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        s0.b ex = (s0.b) obj;
                        n.f(ex, "ex");
                        Log.w(d0.f44761a.b(c.class).g(), "CorruptionException in " + this.f43807b.f43813a + " DataStore running in process " + Process.myPid(), ex);
                        return new w0.b(true);
                    default:
                        Context it = (Context) obj;
                        n.f(it, "it");
                        String sharedPreferencesName = this.f43807b.f43813a;
                        LinkedHashSet keysToMigrate = l.f52289a;
                        n.f(sharedPreferencesName, "sharedPreferencesName");
                        n.f(keysToMigrate, "keysToMigrate");
                        return f.C(new u0.c(it, sharedPreferencesName, u0.d.f51655a, new p(keysToMigrate, null, 15), new k(3, null)));
                }
            }
        });
        final int i11 = 1;
        this.f43815c = (i) f.E(name, gVar, new jk.b(this) { // from class: jc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f43807b;

            {
                this.f43807b = this;
            }

            @Override // jk.b
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        s0.b ex = (s0.b) obj;
                        n.f(ex, "ex");
                        Log.w(d0.f44761a.b(c.class).g(), "CorruptionException in " + this.f43807b.f43813a + " DataStore running in process " + Process.myPid(), ex);
                        return new w0.b(true);
                    default:
                        Context it = (Context) obj;
                        n.f(it, "it");
                        String sharedPreferencesName = this.f43807b.f43813a;
                        LinkedHashSet keysToMigrate = l.f52289a;
                        n.f(sharedPreferencesName, "sharedPreferencesName");
                        n.f(keysToMigrate, "keysToMigrate");
                        return f.C(new u0.c(it, sharedPreferencesName, u0.d.f51655a, new p(keysToMigrate, null, 15), new k(3, null)));
                }
            }
        }, 8).getValue(context, f43812d[0]);
    }

    public final void a(jk.b bVar) {
    }

    public final Object b(w0.d key, Long l) {
        n.f(key, "key");
        return cn.d0.C(ak.l.f3620a, new b4.b(this, key, l, null, 8));
    }
}
