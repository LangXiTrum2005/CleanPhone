package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import bo.i;
import bo.l;
import gd.f;
import java.io.IOException;
import ld.g;
import md.h;
import xn.d;
import xn.e;
import xn.m;
import xn.o;
import xn.s;
import xn.t;
import xn.u;
import xn.w;
import xn.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void a(w wVar, f fVar, long j10, long j11) {
        s sVar = wVar.f54081a;
        if (sVar == null) {
            return;
        }
        fVar.j(sVar.f54060a.h().toString());
        fVar.c(sVar.f54061b);
        u uVar = sVar.f54063d;
        if (uVar != null) {
            long j12 = ((t) uVar).f54067b;
            if (j12 != -1) {
                fVar.e(j12);
            }
        }
        y yVar = wVar.f54087g;
        if (yVar != null) {
            long jH = yVar.h();
            if (jH != -1) {
                fVar.h(jH);
            }
            o oVarK = yVar.k();
            if (oVarK != null) {
                fVar.g(oVarK.f54000a);
            }
        }
        fVar.d(wVar.f54084d);
        fVar.f(j10);
        fVar.i(j11);
        fVar.b();
    }

    @Keep
    public static void enqueue(d dVar, e eVar) {
        h hVar = new h();
        i iVar = (i) dVar;
        iVar.f(new l(eVar, g.f45301s, hVar, hVar.f45967a));
    }

    @Keep
    public static w execute(d dVar) throws IOException {
        f fVar = new f(g.f45301s);
        long jE = h.e();
        long jA = h.a();
        try {
            w wVarG = ((i) dVar).g();
            h.e();
            a(wVarG, fVar, jE, h.a() - jA);
            return wVarG;
        } catch (IOException e10) {
            s sVar = ((i) dVar).f5787b;
            m mVar = sVar.f54060a;
            if (mVar != null) {
                fVar.j(mVar.h().toString());
            }
            String str = sVar.f54061b;
            if (str != null) {
                fVar.c(str);
            }
            fVar.f(jE);
            h.e();
            fVar.i(h.a() - jA);
            id.g.c(fVar);
            throw e10;
        }
    }
}
