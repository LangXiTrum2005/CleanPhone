package uc;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;
import l7.i0;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f51983b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f51982a = i10;
        this.f51983b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vc.b bVarE;
        vc.b bVarG;
        boolean z10;
        int i10 = this.f51982a;
        c cVar = this.f51983b;
        switch (i10) {
            case 0:
                cVar.a();
                return;
            case 1:
                cVar.a();
                return;
            default:
                Object obj = c.f51984m;
                synchronized (obj) {
                    try {
                        mb.g gVar = cVar.f51985a;
                        gVar.a();
                        k kVarF = k.f(gVar.f45928a);
                        try {
                            bVarE = cVar.f51987c.E();
                            if (kVarF != null) {
                                kVarF.F();
                            }
                        } catch (Throwable th2) {
                            if (kVarF != null) {
                                kVarF.F();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    int i11 = bVarE.f52544b;
                    if (i11 == 5) {
                        bVarG = cVar.g(bVarE);
                    } else if (i11 == 3) {
                        bVarG = cVar.g(bVarE);
                    } else if (!cVar.f51988d.a(bVarE)) {
                        return;
                    } else {
                        bVarG = cVar.b(bVarE);
                    }
                    synchronized (obj) {
                        try {
                            mb.g gVar2 = cVar.f51985a;
                            gVar2.a();
                            k kVarF2 = k.f(gVar2.f45928a);
                            try {
                                cVar.f51987c.B(bVarG);
                                if (kVarF2 != null) {
                                    kVarF2.F();
                                }
                            } catch (Throwable th4) {
                                if (kVarF2 != null) {
                                    kVarF2.F();
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            boolean z11 = bVarG.f52544b == 4;
                            String str = bVarG.f52543a;
                            if (!z11 || TextUtils.isEmpty(str)) {
                                z10 = false;
                            } else if (TextUtils.equals(bVarE.f52543a, str)) {
                                z10 = !(bVarE.f52544b == 4);
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                Iterator it = cVar.f51995k.iterator();
                                while (it.hasNext()) {
                                    FirebaseMessaging firebaseMessaging = ((zc.k) it.next()).f54842a;
                                    i0 i0Var = FirebaseMessaging.f24672n;
                                    if (firebaseMessaging.g() != null) {
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                                        }
                                        synchronized (firebaseMessaging) {
                                            try {
                                                if (!firebaseMessaging.l) {
                                                    firebaseMessaging.m(0L);
                                                }
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    if (bVarG.f52544b == 4) {
                        String str2 = bVarG.f52543a;
                        synchronized (cVar) {
                            cVar.f51994j = str2;
                        }
                    }
                    int i12 = bVarG.f52544b;
                    if (i12 == 5) {
                        cVar.h(new e());
                        return;
                    }
                    if (i12 == 2 || i12 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e10) {
                    cVar.h(e10);
                    return;
                }
        }
    }
}
