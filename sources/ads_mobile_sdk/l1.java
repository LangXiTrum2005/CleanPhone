package ads_mobile_sdk;

import complexometry.formularize;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.idolatry;
import saneness.permanently;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 implements idolatry {
    public final l13 a;
    public final formularize b;
    public final yf2 c;
    public final long d;
    public final int e;
    public final h1 f;
    public final ur g;
    public final jm2 h;
    public final String i;
    public final a22 j;

    public l1(l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String uniqueRenderId, a22 placementIdWrapper) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(uniqueRenderId, "uniqueRenderId");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.a = traceMetaSet;
        this.b = baseRequest;
        this.c = requestType;
        this.d = j;
        this.e = i;
        this.f = adConfiguration;
        this.g = commonConfiguration;
        this.h = serverTransaction;
        this.i = uniqueRenderId;
        this.j = placementIdWrapper;
    }

    public abstract Object a(boolean z, wretchedly.dern dernVar);

    public final permanently a(permanently componentBuilder, boolean z) {
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        return (permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) ((permanently) componentBuilder.a(this.f)).a(this.g)).a(this.h)).a(this.a.a)).a(this.a.b)).a(this.a.c)).a(this.a.d)).a(this.c)).a(this.b)).a(this.d)).a(z)).a(this.e)).a(this.j);
    }

    public final h1 c() {
        return this.f;
    }

    public final jm2 d() {
        return this.h;
    }

    @Override // saneness.idolatry
    public final Object a(String str, int i, wretchedly.dern dernVar) {
        return a(this, str, i, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #3 {all -> 0x0095, blocks: (B:26:0x0092, B:39:0x00ca, B:41:0x00ce, B:38:0x00a4), top: B:70:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0100 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:45:0x00d9, B:47:0x00e0, B:49:0x00e7, B:51:0x00eb, B:53:0x00ef, B:56:0x00f2, B:57:0x00f7, B:58:0x00f8, B:59:0x00ff, B:60:0x0100, B:61:0x0107, B:62:0x0108), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r7v16, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static /* synthetic */ Object a(l1 l1Var, String str, int i, wretchedly.dern dernVar) {
        j1 j1Var;
        TimeoutCancellationException th;
        ?? r7;
        ?? A;
        TimeoutCancellationException e;
        ?? r9;
        spartacist un0Var;
        if (dernVar instanceof j1) {
            j1Var = (j1) dernVar;
            int i2 = j1Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j1Var.f = i2 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(l1Var, dernVar);
            }
        } else {
            j1Var = new j1(l1Var, dernVar);
        }
        ?? r10 = j1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = j1Var.f;
        try {
            if (i3 == 0) {
                p002kotlin.dern.saneness(r10);
                no0 no0Var = no0.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER;
                WeakHashMap weakHashMap = j13.a;
                A = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    j13.a().a(l1Var.a);
                    le2 le2Var = l1Var.a.c;
                    le2Var.a = l1Var.i;
                    le2Var.c = str;
                    le2Var.b = i;
                    h1 h1Var = l1Var.f;
                    le2Var.d = h1Var.f;
                    le2Var.g = h1Var.b();
                    try {
                        long jA = l1Var.f.a();
                        k1 k1Var = new k1(l1Var, null);
                        j1Var.a = l1Var;
                        j1Var.b = A;
                        j1Var.c = A;
                        j1Var.f = 1;
                        Object objWireman = TimeoutKt.wireman(jA, k1Var, j1Var);
                        if (objWireman == objBeachfront) {
                            return objBeachfront;
                        }
                        r9 = objWireman;
                        str = A;
                        A = A;
                        un0Var = (spartacist) r9;
                        str = str;
                        r10 = A;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                        str = A;
                        un0Var = new un0("Timed out while waiting " + p002kotlin.time.saneness.starveling(l1Var.f.a()) + " for rendering.", e);
                        str = str;
                        r10 = A;
                        if (un0Var instanceof nn0) {
                            y13.a((nn0) un0Var, false);
                        }
                        interaction.saneness.attabal(r10, null);
                        return un0Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r7 = A;
                    str = r7;
                    str.b(th);
                    if (!(th instanceof evenfall)) {
                        str.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r7 = j1Var.c;
                str = j1Var.b;
                l1 l1Var2 = j1Var.a;
                try {
                    p002kotlin.dern.saneness(r10);
                    A = r7;
                    l1Var = l1Var2;
                    r9 = r10;
                    str = str;
                    try {
                        un0Var = (spartacist) r9;
                        str = str;
                        r10 = A;
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        un0Var = new un0("Timed out while waiting " + p002kotlin.time.saneness.starveling(l1Var.f.a()) + " for rendering.", e);
                        str = str;
                        r10 = A;
                    }
                } catch (TimeoutCancellationException e4) {
                    A = r7;
                    l1Var = l1Var2;
                    e = e4;
                    un0Var = new un0("Timed out while waiting " + p002kotlin.time.saneness.starveling(l1Var.f.a()) + " for rendering.", e);
                    str = str;
                    r10 = A;
                    if (un0Var instanceof nn0) {
                        y13.a((nn0) un0Var, false);
                    }
                    interaction.saneness.attabal(r10, null);
                    return un0Var;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        str.b(th);
                        if (!(th instanceof evenfall)) {
                            str.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(r7, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (un0Var instanceof nn0) {
                y13.a((nn0) un0Var, false);
            }
            interaction.saneness.attabal(r10, null);
            return un0Var;
        } catch (Throwable th6) {
            th = th6;
            r7 = r10;
        }
    }
}
