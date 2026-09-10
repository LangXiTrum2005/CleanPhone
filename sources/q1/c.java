package q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.i22;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.measurement.nf;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n1;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;
import q7.l;
import q7.o;
import q7.p;
import q7.t;
import qj.x;
import r1.a0;
import r1.c0;
import r1.q;
import tj.i0;
import zc.e0;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48526b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f48525a = i10;
        this.f48526b = obj;
    }

    private final void a() {
        i22 i22Var = (i22) this.f48526b;
        synchronized (i22Var.f15534b) {
            try {
                if (i22Var.l) {
                    return;
                }
                long j10 = i22Var.f15543k - 1;
                i22Var.f15543k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    i22Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (i22Var.f15534b) {
                    i22Var.f15544m = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        nf nfVar = (nf) this.f48526b;
        synchronized (((ArrayDeque) nfVar.f23785e)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) nfVar.f23782b).edit();
            String str = (String) nfVar.f23783c;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) nfVar.f23785e).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) nfVar.f23784d);
            }
            editorEdit.putString(str, sb2.toString()).apply();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48525a) {
            case 0:
                f fVar = (f) this.f48526b;
                fVar.I(fVar.D(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new d(0));
                fVar.f48534f.d();
                return;
            case 1:
                l.g((l) this.f48526b);
                return;
            case 2:
                o oVar = (o) this.f48526b;
                oVar.f48747a.c(p.b(oVar.f48748b));
                return;
            case 3:
                ((t) this.f48526b).onError();
                return;
            case 4:
                ((mk0) this.f48526b).e(-1, new q(0));
                return;
            case 5:
                a0 a0Var = (a0) this.f48526b;
                if (a0Var.f49224a0 >= 300000) {
                    ((c0) a0Var.f49237n.f49096b).P0 = true;
                    a0Var.f49224a0 = 0L;
                    return;
                }
                return;
            case 6:
                ((ri.d) ((n1) this.f48526b).f39622b).f49604e.prefetchDefaultFontManager();
                return;
            case 7:
                tj.c cVar = (tj.c) this.f48526b;
                if (cVar.f50810j) {
                    return;
                }
                while (true) {
                    tj.b bVar = (tj.b) cVar.f50805e.poll();
                    if (bVar == null) {
                        cVar.f50807g.postDelayed(cVar.f50808h, cVar.f50811k);
                        return;
                    }
                    HashMap map = cVar.f50806f;
                    h0.b(map);
                    Long l = (Long) map.remove(bVar);
                    if (l != null) {
                        cVar.f50803c.remove(l);
                        cVar.f50804d.remove(l);
                        x xVar = cVar.f50801a;
                        long jLongValue = l.longValue();
                        new k5.g(((tj.e) xVar.f49096b).f50819a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (xi.l) tj.e.f50818b.getValue(), (Object) null).y(j1.f.C(l), new k3.j(new rc.h(jLongValue, 1), 28));
                    }
                }
                break;
            case 8:
                ((rb.c) this.f48526b).r();
                return;
            case 9:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f48526b);
                return;
            case 10:
                x0.l lVar = (x0.l) this.f48526b;
                synchronized (lVar.f53530d) {
                    try {
                        if (lVar.f53534h == null) {
                            return;
                        }
                        try {
                            j0.i iVarB = lVar.b();
                            int i10 = iVarB.f43574f;
                            if (i10 == 2) {
                                synchronized (lVar.f53530d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                un.a aVar = lVar.f53529c;
                                Context context = lVar.f53527a;
                                aVar.getClass();
                                Typeface typefaceA = f0.d.a(context, new j0.i[]{iVarB}, 0);
                                MappedByteBuffer mappedByteBufferA = a.a.A(lVar.f53527a, iVarB.f43569a);
                                if (mappedByteBufferA == null || typefaceA == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(typefaceA, com.google.android.gms.internal.auth.i.E(mappedByteBufferA));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (lVar.f53530d) {
                                        try {
                                            com.bumptech.glide.c cVar2 = lVar.f53534h;
                                            if (cVar2 != null) {
                                                cVar2.z(uVar);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    lVar.a();
                                    return;
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (lVar.f53530d) {
                                try {
                                    com.bumptech.glide.c cVar3 = lVar.f53534h;
                                    if (cVar3 != null) {
                                        cVar3.y(th5);
                                    }
                                    lVar.a();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 11:
                k5.g gVar = (k5.g) this.f48526b;
                ((y8.h) ((z8.c) gVar.f44328d)).o(new i0(gVar, 13));
                return;
            case 12:
                a();
                return;
            case 13:
                y7.h this$0 = (y7.h) this.f48526b;
                n.f(this$0, "this$0");
                this$0.L();
                return;
            case 14:
                ((xi.o) this.f48526b).c();
                return;
            case 15:
                b();
                return;
            default:
                e0 e0Var = (e0) this.f48526b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.f54820a.getAction() + " finishing.");
                e0Var.f54821b.trySetResult(null);
                return;
        }
    }
}
