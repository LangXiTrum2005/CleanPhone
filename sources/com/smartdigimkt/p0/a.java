package com.smartdigimkt.p0;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.f1.l;
import com.smartdigimkt.h0.e;
import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.m;
import com.smartdigimkt.h0.n;
import com.smartdigimkt.l0.c;
import com.smartdigimkt.l0.d;
import com.smartdigimkt.l0.g;
import com.smartdigimkt.v0.s;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37494b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f37495a;

    public a(Context context) {
        if (context == null) {
            this.f37495a = com.smartdigimkt.u.a.f().d();
        } else {
            this.f37495a = context.getApplicationContext();
        }
    }

    public void a(String str, b bVar) {
        if (bVar != null) {
            bVar.a(MRAIDPresenter.OPEN, com.smartdigimkt.b0.a.C2);
            bVar.a("band_width", com.smartdigimkt.h0.a.c().b() + "");
            String str2 = bVar.a().get("unit_id");
            if (str2 != null) {
                String strA = l.a().a(str2, str);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                bVar.a("ch_info", strA);
            }
        }
    }

    public void b(int i2, String str, b bVar, e eVar) {
        b(i2, str, bVar, new com.smartdigimkt.h0.b(), eVar);
    }

    public void c(int i2, String str, b bVar, e eVar) {
        String str2 = bVar.a().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.a("ts", jCurrentTimeMillis + "");
        bVar.a(com.smartdigimkt.q0.b.b1, s.a(str2 + jCurrentTimeMillis));
        b(i2, str, bVar, new com.smartdigimkt.h0.b(), eVar);
    }

    private void b(int i2, String str, b bVar, m mVar, e eVar) {
        j gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        a(str, bVar);
        if (i2 == 0) {
            gVar = new g(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.smartdigimkt.o0.b.f37293e);
        } else if (i2 == 1) {
            gVar = new d(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.smartdigimkt.o0.b.f37293e);
        } else if (i2 != 2) {
            gVar = null;
        } else {
            gVar = new c(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", com.smartdigimkt.o0.b.f37293e);
        }
        if (gVar != null) {
            gVar.a(mVar);
            n.a(gVar);
        }
    }

    public void a(int i2, String str, b bVar, e eVar) {
        a(i2, str, bVar, new com.smartdigimkt.h0.b(), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public void a(int i2, String str, b bVar, m mVar, e eVar) {
        j gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        a(str, bVar);
        String str2 = bVar.a().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.a("ts", jCurrentTimeMillis + "");
        bVar.a(com.smartdigimkt.q0.b.b1, s.a(str2 + jCurrentTimeMillis));
        StringBuilder sbX = android.support.v4.media.a.x(str, "?");
        sbX.append(bVar.toString());
        String string = sbX.toString();
        j jVar = null;
        if (i2 == 0) {
            gVar = new g(0, string, null, eVar);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    gVar = new c(0, string, null, eVar);
                }
                if (jVar != null) {
                    jVar.a(mVar);
                    n.a(jVar);
                }
            }
            gVar = new d(0, string, null, eVar);
        }
        jVar = gVar;
        if (jVar != null) {
            jVar.a(mVar);
            n.a(jVar);
        }
    }

    public static void a(File file, String str, e eVar) {
        n.b().a(file, str, (e<Void>) eVar);
    }
}
