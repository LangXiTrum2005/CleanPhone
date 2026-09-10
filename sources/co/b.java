package co;

import bo.i;
import bo.k;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.ProtocolException;
import lo.m;
import qk.i0;
import xn.n;
import xn.s;
import xn.t;
import xn.u;
import xn.v;
import xn.w;
import xn.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements n {
    @Override // xn.n
    public final w a(g gVar) throws Throwable {
        v vVarG;
        IOException iOException;
        bo.e eVar = gVar.f6798d;
        kotlin.jvm.internal.n.c(eVar);
        i iVar = (i) eVar.f5777b;
        e eVar2 = (e) eVar.f5779d;
        k kVar = (k) eVar.f5780e;
        s sVar = gVar.f6799e;
        u uVar = sVar.f54063d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                eVar2.d(sVar);
                boolean z10 = true;
                try {
                    if (!com.bumptech.glide.d.G(sVar.f54061b) || uVar == null) {
                        iVar.j(eVar, true, false, null);
                        vVarG = null;
                    } else {
                        if ("100-continue".equalsIgnoreCase(sVar.f54062c.b("Expect"))) {
                            try {
                                eVar2.flushRequest();
                                vVarG = eVar.g(true);
                            } catch (IOException e10) {
                                eVar.h(e10);
                                throw e10;
                            }
                        } else {
                            vVarG = null;
                        }
                        if (vVarG == null) {
                            kotlin.jvm.internal.n.c(uVar);
                            long j10 = ((t) uVar).f54067b;
                            m mVarB = q1.b(new bo.c(eVar, eVar2.b(sVar, j10), j10));
                            t tVar = (t) uVar;
                            mVarB.i(tVar.f54067b, tVar.f54068c);
                            mVarB.close();
                        } else {
                            iVar.j(eVar, true, false, null);
                            if (kVar.f5806g == null) {
                                z10 = false;
                            }
                            if (!z10) {
                                eVar2.getConnection().k();
                            }
                        }
                    }
                    try {
                        eVar2.finishRequest();
                        iOException = null;
                    } catch (IOException e11) {
                        eVar.h(e11);
                        throw e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                    if ((e instanceof fo.a) || !eVar.f5776a) {
                        throw e;
                    }
                    iOException = e;
                }
            } catch (IOException e13) {
                eVar.h(e13);
                throw e13;
            }
        } catch (IOException e14) {
            e = e14;
            vVarG = null;
        }
        if (vVarG == null) {
            try {
                vVarG = eVar.g(false);
                kotlin.jvm.internal.n.c(vVarG);
            } catch (IOException e15) {
                if (iOException == null) {
                    throw e15;
                }
                i0.c(iOException, e15);
                throw iOException;
            }
        }
        vVarG.f54069a = sVar;
        vVarG.f54073e = kVar.f5804e;
        vVarG.f54079k = jCurrentTimeMillis;
        vVarG.l = System.currentTimeMillis();
        w wVarA = vVarG.a();
        int i10 = wVarA.f54084d;
        if (i10 == 100 || (102 <= i10 && i10 < 200)) {
            v vVarG2 = eVar.g(false);
            kotlin.jvm.internal.n.c(vVarG2);
            vVarG2.f54069a = sVar;
            vVarG2.f54073e = kVar.f5804e;
            vVarG2.f54079k = jCurrentTimeMillis;
            vVarG2.l = System.currentTimeMillis();
            wVarA = vVarG2.a();
            i10 = wVarA.f54084d;
        }
        v vVarD = wVarA.d();
        try {
            String strA = w.a("Content-Type", wVarA);
            long jC = eVar2.c(wVarA);
            vVarD.f54075g = new h(strA, jC, new lo.n(new bo.d(eVar, eVar2.a(wVarA), jC)));
            w wVarA2 = vVarD.a();
            if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(wVarA2.f54081a.f54062c.b("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(w.a("Connection", wVarA2))) {
                eVar2.getConnection().k();
            }
            if (i10 == 204 || i10 == 205) {
                y yVar = wVarA2.f54087g;
                if ((yVar != null ? yVar.h() : -1L) > 0) {
                    StringBuilder sb2 = new StringBuilder("HTTP ");
                    sb2.append(i10);
                    sb2.append(" had non-zero Content-Length: ");
                    y yVar2 = wVarA2.f54087g;
                    sb2.append(yVar2 != null ? Long.valueOf(yVar2.h()) : null);
                    throw new ProtocolException(sb2.toString());
                }
            }
            return wVarA2;
        } catch (IOException e16) {
            eVar.h(e16);
            throw e16;
        }
    }
}
