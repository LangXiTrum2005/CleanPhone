package db;

import android.content.Context;
import android.preference.PreferenceManager;
import fc.f;
import jb.c1;
import jb.f1;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38798b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va.c f38799a;

    public a(f fVar) {
        Context context = (Context) fVar.f40781c;
        String str = (String) fVar.f40780b;
        String str2 = (String) fVar.f40782d;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f38799a = (va.c) fVar.f40786h;
    }

    public final synchronized k a() {
        k kVarO;
        va.c cVar = this.f38799a;
        synchronized (cVar) {
            kVarO = k.o((f1) ((c1) cVar.f52514b).a());
        }
        return kVarO;
    }
}
