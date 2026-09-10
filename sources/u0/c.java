package u0;

import ak.f;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.p;
import cl.t0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import v0.k;
import wj.j;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f51649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f51650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f51651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f51653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f51654f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, p pVar, k kVar) {
        n.f(context, "context");
        n.f(sharedPreferencesName, "sharedPreferencesName");
        n.f(keysToMigrate, "keysToMigrate");
        t0 t0Var = new t0(12, context, sharedPreferencesName);
        this.f51649a = pVar;
        this.f51650b = kVar;
        this.f51651c = context;
        this.f51652d = sharedPreferencesName;
        this.f51653e = r9.b.u(t0Var);
        this.f51654f = keysToMigrate == d.f51655a ? null : xj.n.Q0(keysToMigrate);
    }

    @Override // s0.e
    public final Object cleanUp(f fVar) throws IOException {
        Context context;
        String str;
        j jVar = this.f51653e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) jVar.getValue()).edit();
        Set set = this.f51654f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) jVar.getValue()).getAll().isEmpty() && (context = this.f51651c) != null && (str = this.f51652d) != null) {
            a.a(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return r.f53297a;
    }

    @Override // s0.e
    public final Object migrate(Object obj, f fVar) {
        return this.f51650b.invoke(new e((SharedPreferences) this.f51653e.getValue(), this.f51654f), obj, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s0.e
    public final Object shouldMigrate(Object obj, f fVar) {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f51648i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f51648i = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (ck.c) fVar);
            }
        } else {
            bVar = new b(this, (ck.c) fVar);
        }
        Object objInvoke = bVar.f51646g;
        int i11 = bVar.f51648i;
        boolean z10 = true;
        if (i11 == 0) {
            t9.e.z(objInvoke);
            bVar.f51645f = this;
            bVar.f51648i = 1;
            objInvoke = this.f51649a.invoke(obj, bVar);
            bk.a aVar = bk.a.f5708a;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = bVar.f51645f;
            t9.e.z(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f51654f;
        j jVar = this.f51653e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) jVar.getValue()).getAll();
            n.e(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) jVar.getValue();
            if (set.isEmpty()) {
                z10 = false;
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
