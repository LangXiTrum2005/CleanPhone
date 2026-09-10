package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd implements na.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23968b;

    public /* synthetic */ sd(Object obj, int i10) {
        this.f23967a = i10;
        this.f23968b = obj;
    }

    @Override // na.e
    public final Object apply(Object obj) {
        switch (this.f23967a) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((ud) this.f23968b).f24041c)), (Throwable) obj);
                return null;
            case 1:
                dd ddVar = (dd) obj;
                tf tfVar = zd.f24203a;
                String str = (String) this.f23968b;
                zc zcVar = (zc) ddVar.u(str, ad.v()).l();
                if (!Collections.unmodifiableList(((ad) zcVar.f23489b).u()).contains("")) {
                    zcVar.b();
                    ((ad) zcVar.f23489b).w("");
                }
                cd cdVar = (cd) ddVar.l();
                zcVar.b();
                ((ad) zcVar.f23489b).x("");
                ad adVar = (ad) zcVar.f();
                cdVar.b();
                ((dd) cdVar.f23489b).w().put(str, adVar);
                return (dd) cdVar.f();
            default:
                oe oeVar = (oe) this.f23968b;
                yc ycVar = (yc) obj;
                oeVar.getClass();
                h6 h6Var = new h6(5);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (oe.f23807j) {
                            te teVar = (te) oeVar.f23812d.get();
                            Uri uri = oeVar.f23815g;
                            h6 h6Var2 = new h6(ycVar.u());
                            h6Var2.f23541c = new h6[]{h6Var};
                            teVar.a(uri, h6Var2);
                            oeVar.f23816h = ycVar.u();
                            break;
                        }
                        synchronized (oe.f23808k) {
                            te teVar2 = (te) oeVar.f23812d.get();
                            Uri uri2 = oeVar.f23817i;
                            h6 h6Var3 = new h6(ycVar.v());
                            h6Var3.f23541c = new h6[]{h6Var};
                            teVar2.a(uri2, h6Var3);
                            ycVar.v();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th2;
                }
        }
    }
}
