package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox0 {
    public final no0 a;
    public final boolean b;

    public /* synthetic */ ox0(no0 no0Var, int i) {
        this((i & 1) != 0 ? null : no0Var, (i & 2) != 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:18:0x003e, B:30:0x0067, B:32:0x006d), top: B:77:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0098 A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x009e A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #2 {all -> 0x0096, blocks: (B:39:0x007f, B:41:0x0086, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:50:0x0098, B:51:0x009d, B:52:0x009e, B:53:0x00a5, B:54:0x00a6, B:55:0x00ad, B:56:0x00ae), top: B:79:0x007f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [ads_mobile_sdk.ox0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.nx0, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ads_mobile_sdk.ox0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ads_mobile_sdk.ox0] */
    public final Object d(wretchedly.dern dernVar) {
        ?? nx0Var;
        spartacist on0Var;
        ?? r0;
        ?? r1;
        w03 w03Var;
        w03 w03Var2;
        TimeoutCancellationException th;
        if (dernVar instanceof nx0) {
            nx0 nx0Var2 = (nx0) dernVar;
            int i = nx0Var2.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nx0Var2.f = i - Integer.MIN_VALUE;
                nx0Var = nx0Var2;
            } else {
                nx0Var = new nx0(this, dernVar);
            }
        } else {
            nx0Var = new nx0(this, dernVar);
        }
        Object objE = nx0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nx0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objE);
                try {
                    no0 no0Var = this.a;
                    if (no0Var != null) {
                        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                        try {
                            nx0Var.a = this;
                            nx0Var.b = w03VarA;
                            nx0Var.c = w03VarA;
                            nx0Var.f = 1;
                            Object objE2 = e(nx0Var);
                            if (objE2 != objBeachfront) {
                                w03Var = w03VarA;
                                w03Var2 = w03Var;
                                objE = objE2;
                                nx0Var = this;
                                on0Var = (spartacist) objE;
                                if (on0Var instanceof nn0) {
                                    y13.a((nn0) on0Var, false);
                                }
                                interaction.saneness.attabal(w03Var, null);
                                r0 = nx0Var;
                            }
                        } catch (Throwable th2) {
                            w03Var = w03VarA;
                            w03Var2 = w03Var;
                            th = th2;
                            nx0Var = this;
                            w03Var2.b(th);
                            if (!(th instanceof evenfall)) {
                                throw th;
                            }
                            w03Var2.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw new cp0(th);
                            }
                            if (!(th instanceof CancellationException)) {
                                throw new bn0(th);
                            }
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                    } else {
                        nx0Var.a = this;
                        nx0Var.f = 2;
                        objE = e(nx0Var);
                        if (objE != objBeachfront) {
                            r1 = this;
                            on0Var = (spartacist) objE;
                            r0 = r1;
                        }
                    }
                    return objBeachfront;
                } catch (Exception e) {
                    e = e;
                    nx0Var = this;
                    on0Var = new on0(e, null, null, 6);
                    r0 = nx0Var;
                }
            } else if (i2 == 1) {
                w03Var = nx0Var.c;
                w03Var2 = nx0Var.b;
                nx0Var = nx0Var.a;
                try {
                    p002kotlin.dern.saneness(objE);
                    nx0Var = nx0Var;
                    on0Var = (spartacist) objE;
                    if (on0Var instanceof nn0) {
                        y13.a((nn0) on0Var, false);
                    }
                    interaction.saneness.attabal(w03Var, null);
                    r0 = nx0Var;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        w03Var2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03Var2.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            throw new cp0(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(w03Var, th4);
                            throw th5;
                        }
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ox0 ox0Var = nx0Var.a;
                p002kotlin.dern.saneness(objE);
                r1 = ox0Var;
                on0Var = (spartacist) objE;
                r0 = r1;
            }
        } catch (Exception e2) {
            e = e2;
            on0Var = new on0(e, null, null, 6);
            r0 = nx0Var;
            if (r0.b) {
                return on0Var;
            }
            return new tn0(Unit.f29295attabal);
        }
        if (r0.b) {
            return on0Var;
        }
        return new tn0(Unit.f29295attabal);
    }

    public abstract Object e(wretchedly.dern dernVar);

    public ox0(no0 no0Var, boolean z) {
        this.a = no0Var;
        this.b = z;
    }
}
