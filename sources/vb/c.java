package vb;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import mb.g;
import zb.r;
import zb.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f52533a;

    public c(r rVar) {
        this.f52533a = rVar;
    }

    public static c a() {
        c cVar = (c) g.e().c(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(boolean z10) {
        r rVar = this.f52533a;
        Boolean boolValueOf = Boolean.valueOf(z10);
        u uVar = rVar.f54737b;
        synchronized (uVar) {
            uVar.f54768f = false;
            uVar.f54769g = boolValueOf;
            SharedPreferences.Editor editorEdit = uVar.f54763a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", z10);
            editorEdit.apply();
            synchronized (uVar.f54765c) {
                try {
                    if (uVar.a()) {
                        if (!uVar.f54767e) {
                            uVar.f54766d.trySetResult(null);
                            uVar.f54767e = true;
                        }
                    } else if (uVar.f54767e) {
                        uVar.f54766d = new TaskCompletionSource();
                        uVar.f54767e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
