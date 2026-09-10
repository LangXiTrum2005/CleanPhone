package y7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import oa.k0;
import q7.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends t {
    public static final Parcelable.Creator<k> CREATOR = new l7.h(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f54260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54261d;

    public k(p pVar) {
        this.f54315b = pVar;
        this.f54261d = "get_token";
    }

    @Override // y7.t
    public final void b() {
        j jVar = this.f54260c;
        if (jVar != null) {
            jVar.f54252d = false;
            jVar.f54251c = null;
            this.f54260c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54261d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: all -> 0x008a, TRY_ENTER, TryCatch #1 {all -> 0x008a, blocks: (B:8:0x001c, B:13:0x0025, B:25:0x004c, B:28:0x0056, B:19:0x0043, B:16:0x0033), top: B:49:0x001c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:8:0x001c, B:13:0x0025, B:25:0x004c, B:28:0x0056, B:19:0x0043, B:16:0x0033), top: B:49:0x001c, inners: #0 }] */
    @Override // y7.t
    public final int k(n request) {
        int i10;
        Intent intentE;
        boolean z10;
        kotlin.jvm.internal.n.f(request, "request");
        Context contextE = d().e();
        if (contextE == null) {
            contextE = l7.s.b();
        }
        j jVar = new j(contextE, request);
        this.f54260c = jVar;
        synchronized (jVar) {
            try {
                if (!jVar.f54252d) {
                    int i11 = jVar.f54258j;
                    z zVar = z.f48798a;
                    if (v7.a.b(z.class)) {
                        i10 = 0;
                        if (i10 == -1) {
                            intentE = z.e(jVar.f54249a);
                            if (intentE == null) {
                                z10 = false;
                            } else {
                                jVar.f54252d = true;
                                jVar.f54249a.bindService(intentE, jVar, 1);
                                z10 = true;
                            }
                        }
                    } else {
                        try {
                            i10 = z.f48798a.i(z.f48799b, new int[]{i11}).f38703b;
                        } catch (Throwable th2) {
                            v7.a.a(z.class, th2);
                            i10 = 0;
                        }
                        if (i10 == -1) {
                            intentE = z.e(jVar.f54249a);
                            if (intentE == null) {
                                z10 = false;
                            } else {
                                jVar.f54252d = true;
                                jVar.f54249a.bindService(intentE, jVar, 1);
                                z10 = true;
                            }
                        }
                    }
                }
                z10 = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z10) {
            return 0;
        }
        k0 k0Var = d().f54298e;
        if (k0Var != null) {
            View view = ((q) k0Var.f47269b).f54309e;
            if (view == null) {
                kotlin.jvm.internal.n.l("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        tb.n nVar = new tb.n(4, this, request);
        j jVar2 = this.f54260c;
        if (jVar2 != null) {
            jVar2.f54251c = nVar;
        }
        return 1;
    }

    public final void l(Bundle result, n request) {
        o oVar;
        l7.i iVar;
        kotlin.jvm.internal.n.f(request, "request");
        kotlin.jvm.internal.n.f(result, "result");
        try {
            l7.a aVarJ = j1.f.j(result, request.f54268d);
            String str = request.f54282s;
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                iVar = null;
            } else {
                try {
                    iVar = new l7.i(string, str);
                } catch (Exception e10) {
                    throw new l7.n(e10.getMessage());
                }
            }
            oVar = new o(request, 1, aVarJ, iVar, null, null);
        } catch (l7.n e11) {
            n nVar = d().f54300g;
            String message = e11.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            oVar = new o(nVar, 3, null, TextUtils.join(": ", arrayList), null);
        }
        d().d(oVar);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f54261d = "get_token";
    }
}
