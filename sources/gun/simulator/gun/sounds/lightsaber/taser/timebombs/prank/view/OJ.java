package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OJ implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3499a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ OJ(Object obj, Object obj2, Object obj3, int i) {
        this.f3499a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[PHI: r8
  0x00a9: PHI (r8v0 ??) = (r8v15 ??), (r8v8 ??) binds: [B:39:0x00a7, B:51:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yR] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jK] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.un] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.un] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.un] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        ?? r8;
        MJ mj;
        ?? A;
        Object obj;
        C4661tR c4661tR;
        Pair pair;
        C3775jK c3775jKF;
        C5101yR c5101yR;
        switch (this.f3499a) {
            case 0:
                Context context = (Context) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                C5101yR c5101yR2 = EG.f3017a;
                ?? c3775jK = c5101yR2;
                if (c5101yR2 == null) {
                    synchronized (C5101yR.class) {
                        try {
                            C5101yR c5101yR3 = EG.f3017a;
                            c5101yR = c5101yR3;
                            if (c5101yR3 == null) {
                                C5101yR c5101yR4 = new C5101yR(EG.a(context), new C4872vn());
                                EG.f3017a = c5101yR4;
                                c5101yR = c5101yR4;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    c3775jK = c5101yR;
                }
                ?? r5 = 0;
                r5 = 0;
                if (str2 != null && (c4661tR = c3775jK.f5276a) != null) {
                    try {
                        File fileB = c4661tR.b(str);
                        if (fileB == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileB);
                            r8 = fileB.getAbsolutePath().endsWith(".zip") ? EnumC2815Ut.ZIP : fileB.getAbsolutePath().endsWith(".gz") ? EnumC2815Ut.GZIP : EnumC2815Ut.JSON;
                            fileB.getAbsolutePath();
                            AbstractC5005xJ.a();
                            pair = new Pair(r8, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        mj = null;
                        A = r8;
                    } else {
                        EnumC2815Ut enumC2815Ut = (EnumC2815Ut) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = enumC2815Ut.ordinal();
                        r8 = 1;
                        A = 1;
                        if (iOrdinal == 1) {
                            c3775jKF = RJ.f(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            c3775jKF = RJ.c(inputStream, str2);
                        } else {
                            try {
                                c3775jKF = RJ.c(new GZIPInputStream(inputStream), str2);
                            } catch (IOException e) {
                                c3775jKF = new C3775jK(e);
                            }
                        }
                        Object obj2 = c3775jKF.f4549a;
                        if (obj2 != null) {
                            mj = (MJ) obj2;
                        } else {
                            mj = null;
                            A = r8;
                        }
                    }
                    break;
                } else {
                    mj = null;
                    A = r8;
                }
                if (mj == null) {
                    AbstractC5005xJ.a();
                    AbstractC5005xJ.a();
                    try {
                        try {
                            try {
                                A = ((C4872vn) c3775jK.b).a(str);
                                try {
                                    try {
                                        if (A.f5101a.getResponseCode() / 100 == 2) {
                                            C3775jK c3775jKA = c3775jK.a(context, str, A.f5101a.getInputStream(), A.f5101a.getContentType(), str2);
                                            Object obj3 = c3775jKA.f4549a;
                                            AbstractC5005xJ.a();
                                            A.close();
                                            c3775jK = c3775jKA;
                                        } else {
                                            C3775jK c3775jK2 = new C3775jK(new IllegalArgumentException(A.h()));
                                            A.close();
                                            c3775jK = c3775jK2;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        r5 = A;
                                        C3775jK c3775jK3 = new C3775jK(e);
                                        if (r5 != 0) {
                                            try {
                                                r5.close();
                                            } catch (IOException e3) {
                                                AbstractC5005xJ.c("LottieFetchResult close failed ", e3);
                                            }
                                        }
                                        c3775jK = c3775jK3;
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r5 = A;
                                        if (r5 != 0) {
                                            try {
                                                r5.close();
                                            } catch (IOException e4) {
                                                AbstractC5005xJ.c("LottieFetchResult close failed ", e4);
                                            }
                                            break;
                                        }
                                        throw th;
                                    }
                                } catch (IOException unused2) {
                                }
                            } catch (IOException e5) {
                                AbstractC5005xJ.c("LottieFetchResult close failed ", e5);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (r5 != 0) {
                                r5.close();
                                break;
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        C3775jK c3775jK4 = new C3775jK(e);
                        if (r5 != 0) {
                            r5.close();
                        }
                        c3775jK = c3775jK4;
                    }
                    break;
                } else {
                    c3775jK = new C3775jK(mj);
                }
                if (str2 != null && (obj = c3775jK.f4549a) != null) {
                    NJ.b.f3451a.put(str2, (MJ) obj);
                }
                return c3775jK;
            case 1:
                return RJ.b((Context) this.b, (String) this.c, (String) this.d);
            default:
                ScheduledExecutorServiceC4435qo scheduledExecutorServiceC4435qo = (ScheduledExecutorServiceC4435qo) this.b;
                Callable callable = (Callable) this.c;
                Wm0 wm0 = (Wm0) this.d;
                scheduledExecutorServiceC4435qo.getClass();
                return scheduledExecutorServiceC4435qo.f4902a.submit(new RunnableC3976le0(27, callable, wm0));
        }
    }
}
