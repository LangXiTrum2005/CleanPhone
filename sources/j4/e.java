package j4;

import android.os.Bundle;
import androidx.lifecycle.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f43703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f43705e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.f f43701a = new r.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43706f = true;

    public final Bundle a(String str) {
        if (!this.f43704d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f43703c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f43703c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f43703c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f43703c = null;
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f43701a.iterator();
        do {
            r.b bVar = (r.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            n.e(components, "components");
            str = (String) components.getKey();
            dVar = (d) components.getValue();
        } while (!n.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d provider) {
        Object obj;
        n.f(provider, "provider");
        r.f fVar = this.f43701a;
        r.c cVarB = fVar.b(str);
        if (cVarB != null) {
            obj = cVarB.f49208b;
        } else {
            r.c cVar = new r.c(str, provider);
            fVar.f49217d++;
            r.c cVar2 = fVar.f49215b;
            if (cVar2 == null) {
                fVar.f49214a = cVar;
                fVar.f49215b = cVar;
            } else {
                cVar2.f49209c = cVar;
                cVar.f49210d = cVar2;
                fVar.f49215b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f43706f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f43705e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f43705e = aVar;
        try {
            j.class.getDeclaredConstructor(null);
            a aVar2 = this.f43705e;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f43698b).add(j.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
