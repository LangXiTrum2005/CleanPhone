package ads_mobile_sdk;

import com.ironsource.X3;
import formularization.beachfront;
import http.arytenoidectomy;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import org.chromium.support_lib_boundary.util.Features;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.adultoid;
import saneness.blighty;
import saneness.coffeecake;
import saneness.evenfall;
import saneness.gelandelaufer;
import saneness.godward;
import saneness.lateral;
import saneness.shapoo;
import saneness.shiite;

/* JADX INFO: loaded from: classes.dex */
public final class fa3 extends godward implements gelandelaufer, lateral {
    public final jk0 c;
    public final CoroutineContext d;
    public final saran e;
    public final ri2 f;
    public final ns g;
    public final adultoid h;
    public final shapoo i;
    public final shiite j;
    public http.dern k;
    public final formularization.attabal l;
    public monroe m;

    public fa3(jk0 flags, CoroutineContext uiContext, saran backgroundScope, ri2 rootTraceCreator, blighty userAgentProvider, ns concurrencyObjects, coffeecake webViewInitializationTaskProvider, shapoo webViewFeatureWrapper, shiite webViewProfileStoreWrapper) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(webViewInitializationTaskProvider, "webViewInitializationTaskProvider");
        Intrinsics.checkNotNullParameter(webViewFeatureWrapper, "webViewFeatureWrapper");
        Intrinsics.checkNotNullParameter(webViewProfileStoreWrapper, "webViewProfileStoreWrapper");
        this.c = flags;
        this.d = uiContext;
        this.e = backgroundScope;
        this.f = rootTraceCreator;
        this.g = concurrencyObjects;
        this.h = webViewInitializationTaskProvider;
        this.i = webViewFeatureWrapper;
        this.j = webViewProfileStoreWrapper;
        this.l = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00df A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:35:0x00c9, B:37:0x00d0, B:39:0x00d7, B:41:0x00db, B:43:0x00df, B:46:0x00e3, B:47:0x00e8, B:48:0x00e9, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:52:0x00f9), top: B:93:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017a A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0181 A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0185 A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0189 A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x019b A[Catch: all -> 0x018a, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #4 {all -> 0x018a, blocks: (B:71:0x0173, B:73:0x017a, B:75:0x0181, B:77:0x0185, B:79:0x0189, B:82:0x018d, B:83:0x0192, B:84:0x0193, B:85:0x019a, B:86:0x019b, B:87:0x01a2, B:88:0x01a3), top: B:100:0x0173 }] */
    public static final Object a(fa3 fa3Var, wretchedly.dern dernVar) {
        r93 r93Var;
        w03 w03Var;
        TimeoutCancellationException timeoutCancellationException;
        w03 w03Var2;
        fa3 fa3Var2;
        w03 w03Var3;
        TimeoutCancellationException timeoutCancellationException2;
        w03 w03Var4;
        fa3Var.getClass();
        if (dernVar instanceof r93) {
            r93Var = (r93) dernVar;
            int i = r93Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r93Var.f = i - Integer.MIN_VALUE;
            } else {
                r93Var = new r93(fa3Var, dernVar);
            }
        } else {
            r93Var = new r93(fa3Var, dernVar);
        }
        Object obj = r93Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = r93Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = fa3Var.f;
            no0 no0Var = no0.CUI_NAME_WEBVIEW_PROFILE_INIT;
            List listFormularize = p002kotlin.collections.adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    jk0 jk0Var = fa3Var.c;
                    jk0Var.getClass();
                    p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                    long jMolybdenite = p002kotlin.time.dern.molybdenite(2, DurationUnit.SECONDS);
                    Intrinsics.checkNotNullParameter("gads:webview_profile_timeout", X3.i.W);
                    long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:webview_profile_timeout", p002kotlin.time.saneness.cutely(jMolybdenite), zk.l)).getRawValue();
                    t93 t93Var = new t93(fa3Var, null);
                    r93Var.a = fa3Var;
                    r93Var.b = v62VarA;
                    r93Var.c = v62VarA;
                    r93Var.f = 1;
                    if (TimeoutKt.wireman(rawValue, t93Var, r93Var) != objBeachfront) {
                        fa3Var2 = fa3Var;
                        w03Var4 = v62VarA;
                        w03Var3 = w03Var4;
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var4, null);
                    }
                } catch (Throwable th) {
                    w03Var3 = v62VarA;
                    timeoutCancellationException2 = th;
                    w03Var4 = w03Var3;
                    w03Var3.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var3.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                }
            } else {
                w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    jk0 jk0Var2 = fa3Var.c;
                    jk0Var2.getClass();
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    long jMolybdenite2 = p002kotlin.time.dern.molybdenite(2, DurationUnit.SECONDS);
                    Intrinsics.checkNotNullParameter("gads:webview_profile_timeout", X3.i.W);
                    long rawValue2 = ((p002kotlin.time.saneness) jk0Var2.a("gads:webview_profile_timeout", p002kotlin.time.saneness.cutely(jMolybdenite2), zk.l)).getRawValue();
                    t93 t93Var2 = new t93(fa3Var, null);
                    r93Var.a = fa3Var;
                    r93Var.b = w03VarA;
                    r93Var.c = w03VarA;
                    r93Var.f = 2;
                    if (TimeoutKt.wireman(rawValue2, t93Var2, r93Var) != objBeachfront) {
                        fa3Var2 = fa3Var;
                        w03Var2 = w03VarA;
                        w03Var = w03Var2;
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var2, null);
                    }
                } catch (Throwable th2) {
                    w03Var = w03VarA;
                    timeoutCancellationException = th2;
                    w03Var2 = w03Var;
                    w03Var.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03Var.a(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException);
                    }
                    if (!(timeoutCancellationException instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException);
                    }
                    if (timeoutCancellationException instanceof yn0) {
                        throw timeoutCancellationException;
                    }
                    throw new gn0(timeoutCancellationException);
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            w03Var4 = r93Var.c;
            w03Var3 = r93Var.b;
            fa3Var2 = r93Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var4, null);
            } catch (Throwable th3) {
                timeoutCancellationException2 = th3;
                try {
                    w03Var3.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var3.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var4, th4);
                        throw th5;
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = r93Var.c;
            w03Var = r93Var.b;
            fa3Var2 = r93Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var2, null);
            } catch (Throwable th6) {
                timeoutCancellationException = th6;
                try {
                    w03Var.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03Var.a(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException);
                    }
                    if (!(timeoutCancellationException instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException);
                    }
                    if (timeoutCancellationException instanceof yn0) {
                        throw timeoutCancellationException;
                    }
                    throw new gn0(timeoutCancellationException);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        interaction.saneness.attabal(w03Var2, th7);
                        throw th8;
                    }
                }
            }
        }
        if (fa3Var2.k != null) {
            saran saranVar = fa3Var2.e;
            u93 block = new u93(fa3Var2, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r6.h(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ads_mobile_sdk.fa3 r6, wretchedly.dern r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof ads_mobile_sdk.x93
            if (r0 == 0) goto L16
            r0 = r7
            ads_mobile_sdk.x93 r0 = (ads_mobile_sdk.x93) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.x93 r0 = new ads_mobile_sdk.x93
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            p002kotlin.dern.saneness(r7)
            goto L6b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ads_mobile_sdk.fa3 r6 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L5f
        L40:
            ads_mobile_sdk.fa3 r6 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L54
        L46:
            p002kotlin.dern.saneness(r7)
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L54
            goto L6a
        L54:
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L5f
            goto L6a
        L5f:
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fa3.b(ads_mobile_sdk.fa3, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(fa3 fa3Var, wretchedly.dern dernVar) {
        v93 v93Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof v93) {
            v93Var = (v93) dernVar;
            int i = v93Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v93Var.e = i - Integer.MIN_VALUE;
            } else {
                v93Var = new v93(fa3Var, dernVar);
            }
        } else {
            v93Var = new v93(fa3Var, dernVar);
        }
        Object obj = v93Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = v93Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = fa3Var.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_profile:enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:webview_profile:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return Unit.f29295attabal;
            }
            attabalVar = fa3Var.l;
            v93Var.a = fa3Var;
            v93Var.b = attabalVar;
            v93Var.e = 1;
            if (attabalVar.attabal(null, v93Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = v93Var.b;
            fa3 fa3Var2 = v93Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            fa3Var = fa3Var2;
        }
        try {
            if (fa3Var.k == null && fa3Var.m == null) {
                fa3Var.m = cutely.wireman(fa3Var.e, null, null, new w93(fa3Var, null), 3, null);
                return Unit.f29295attabal;
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(fa3 fa3Var, wretchedly.dern dernVar) {
        ea3 ea3Var;
        if (dernVar instanceof ea3) {
            ea3Var = (ea3) dernVar;
            int i = ea3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ea3Var.c = i - Integer.MIN_VALUE;
            } else {
                ea3Var = new ea3(fa3Var, dernVar);
            }
        } else {
            ea3Var = new ea3(fa3Var, dernVar);
        }
        Object obj = ea3Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ea3Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = fa3Var.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("init_profile_in_post_init_task:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("init_profile_in_post_init_task:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                ea3Var.c = 1;
                if (c(fa3Var, ea3Var) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return new tn0(Unit.f29295attabal);
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return d(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197 A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:104:0x019d A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a5 A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010c A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0113 A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0117 A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011b A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0125 A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x012d A[Catch: all -> 0x011c, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0135 A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #6 {all -> 0x011c, blocks: (B:54:0x0105, B:56:0x010c, B:58:0x0113, B:60:0x0117, B:62:0x011b, B:65:0x011f, B:66:0x0124, B:67:0x0125, B:68:0x012c, B:69:0x012d, B:70:0x0134, B:71:0x0135), top: B:124:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184 A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x018b A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x018f A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0193 A[Catch: all -> 0x0194, TryCatch #2 {all -> 0x0194, blocks: (B:91:0x017d, B:93:0x0184, B:95:0x018b, B:97:0x018f, B:99:0x0193, B:102:0x0197, B:103:0x019c, B:104:0x019d, B:105:0x01a4, B:106:0x01a5, B:107:0x01ac, B:108:0x01ad), top: B:118:0x017d }] */
    public final Object f(wretchedly.dern dernVar) {
        p93 p93Var;
        fa3 fa3Var;
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        if (dernVar instanceof p93) {
            p93Var = (p93) dernVar;
            int i = p93Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p93Var.e = i - Integer.MIN_VALUE;
            } else {
                p93Var = new p93(this, dernVar);
            }
        } else {
            p93Var = new p93(this, dernVar);
        }
        Object obj = p93Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = p93Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_quic_hints_enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:webview_quic_hints_enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return Unit.f29295attabal;
            }
            v83 v83Var = (v83) this.h.get();
            p93Var.a = this;
            p93Var.e = 1;
            if (v83Var.a(p93Var) != objBeachfront) {
                fa3Var = this;
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w03Var3 = p93Var.b;
                w03Var4 = (w03) p93Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var3, null);
                    return Unit.f29295attabal;
                } catch (Throwable th) {
                    th = th;
                    w03VarA2 = w03Var4;
                    try {
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA2.a(th);
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
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(w03Var3, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = p93Var.b;
            w03Var2 = (w03) p93Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
                return Unit.f29295attabal;
            } catch (Throwable th4) {
                th = th4;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
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
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03Var, th5);
                        throw th6;
                    }
                }
            }
        }
        fa3Var = (fa3) p93Var.a;
        p002kotlin.dern.saneness(obj);
        http.dern dernVar2 = fa3Var.k;
        if (dernVar2 != null) {
            ri2 ri2Var = fa3Var.f;
            no0 no0Var = no0.CUI_NAME_WEBVIEW_PROFILE_QUIC_HINTS;
            List listFormularize = p002kotlin.collections.adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    fa3Var.i.getClass();
                    Intrinsics.checkNotNullParameter("ADD_QUIC_HINTS", "feature");
                    if (!arytenoidectomy.attabal("ADD_QUIC_HINTS")) {
                        y13.a("Quic hints are not supported", null, 6);
                        Unit unit3 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA2, null);
                        return unit3;
                    }
                    CoroutineContext coroutineContext = fa3Var.d;
                    q93 q93Var = new q93(dernVar2, fa3Var, null);
                    p93Var.a = w03VarA2;
                    p93Var.b = w03VarA2;
                    p93Var.e = 2;
                    if (impromptu.competently(coroutineContext, q93Var, p93Var) != objBeachfront) {
                        w03Var4 = w03VarA2;
                        w03Var3 = w03Var4;
                        Unit unit4 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    w03Var3 = w03VarA2;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
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
                w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    fa3Var.i.getClass();
                    Intrinsics.checkNotNullParameter("ADD_QUIC_HINTS", "feature");
                    if (!arytenoidectomy.attabal("ADD_QUIC_HINTS")) {
                        y13.a("Quic hints are not supported", null, 6);
                        Unit unit5 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA, null);
                        return unit5;
                    }
                    CoroutineContext coroutineContext2 = fa3Var.d;
                    q93 q93Var2 = new q93(dernVar2, fa3Var, null);
                    p93Var.a = w03VarA;
                    p93Var.b = w03VarA;
                    p93Var.e = 3;
                    if (impromptu.competently(coroutineContext2, q93Var2, p93Var) != objBeachfront) {
                        w03Var2 = w03VarA;
                        w03Var = w03Var2;
                        Unit unit6 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th8) {
                    th = th8;
                    w03Var = w03VarA;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
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
            }
            return objBeachfront;
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x010d A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0114 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0126 A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012e A[Catch: all -> 0x011d, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0136 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #6 {all -> 0x011d, blocks: (B:48:0x0106, B:50:0x010d, B:52:0x0114, B:54:0x0118, B:56:0x011c, B:59:0x0120, B:60:0x0125, B:61:0x0126, B:62:0x012d, B:63:0x012e, B:64:0x0135, B:65:0x0136), top: B:115:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0197 A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x019b A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x019f A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5 A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad A[Catch: all -> 0x019c, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5 A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #5 {all -> 0x019c, blocks: (B:80:0x0185, B:82:0x018c, B:84:0x0193, B:86:0x0197, B:88:0x019b, B:91:0x019f, B:92:0x01a4, B:93:0x01a5, B:94:0x01ac, B:95:0x01ad, B:96:0x01b4, B:97:0x01b5), top: B:114:0x0185 }] */
    public final Object g(wretchedly.dern dernVar) {
        y93 y93Var;
        fa3 fa3Var;
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        if (dernVar instanceof y93) {
            y93Var = (y93) dernVar;
            int i = y93Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y93Var.e = i - Integer.MIN_VALUE;
            } else {
                y93Var = new y93(this, dernVar);
            }
        } else {
            y93Var = new y93(this, dernVar);
        }
        Object obj = y93Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = y93Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_preconnect_enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:webview_preconnect_enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return Unit.f29295attabal;
            }
            v83 v83Var = (v83) this.h.get();
            y93Var.a = this;
            y93Var.e = 1;
            if (v83Var.a(y93Var) != objBeachfront) {
                fa3Var = this;
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w03Var3 = y93Var.b;
                w03Var4 = (w03) y93Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var3, null);
                    return Unit.f29295attabal;
                } catch (Throwable th) {
                    th = th;
                    w03VarA2 = w03Var4;
                    try {
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA2.a(th);
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
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(w03Var3, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = y93Var.b;
            w03Var2 = (w03) y93Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
                return Unit.f29295attabal;
            } catch (Throwable th4) {
                th = th4;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
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
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03Var, th5);
                        throw th6;
                    }
                }
            }
        }
        fa3Var = (fa3) y93Var.a;
        p002kotlin.dern.saneness(obj);
        http.dern dernVar2 = fa3Var.k;
        if (dernVar2 != null) {
            ri2 ri2Var = fa3Var.f;
            no0 no0Var = no0.CUI_NAME_WEBVIEW_PROFILE_PRECONNECT;
            List listFormularize = p002kotlin.collections.adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    jk0 jk0Var2 = fa3Var.c;
                    jk0Var2.getClass();
                    p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                    long jMolybdenite = p002kotlin.time.dern.molybdenite(2, DurationUnit.SECONDS);
                    Intrinsics.checkNotNullParameter("gads:webview_profile_preconnect_timeout", X3.i.W);
                    long rawValue = ((p002kotlin.time.saneness) jk0Var2.a("gads:webview_profile_preconnect_timeout", p002kotlin.time.saneness.cutely(jMolybdenite), zk.l)).getRawValue();
                    aa3 aa3Var = new aa3(dernVar2, fa3Var, null);
                    y93Var.a = w03VarA2;
                    y93Var.b = w03VarA2;
                    y93Var.e = 2;
                    if (TimeoutKt.wireman(rawValue, aa3Var, y93Var) != objBeachfront) {
                        w03Var4 = w03VarA2;
                        w03Var3 = w03Var4;
                        Unit unit3 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    w03Var3 = w03VarA2;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
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
                w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    jk0 jk0Var3 = fa3Var.c;
                    jk0Var3.getClass();
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    long jMolybdenite2 = p002kotlin.time.dern.molybdenite(2, DurationUnit.SECONDS);
                    Intrinsics.checkNotNullParameter("gads:webview_profile_preconnect_timeout", X3.i.W);
                    long rawValue2 = ((p002kotlin.time.saneness) jk0Var3.a("gads:webview_profile_preconnect_timeout", p002kotlin.time.saneness.cutely(jMolybdenite2), zk.l)).getRawValue();
                    aa3 aa3Var2 = new aa3(dernVar2, fa3Var, null);
                    y93Var.a = w03VarA;
                    y93Var.b = w03VarA;
                    y93Var.e = 3;
                    if (TimeoutKt.wireman(rawValue2, aa3Var2, y93Var) != objBeachfront) {
                        w03Var2 = w03VarA;
                        w03Var = w03Var2;
                        Unit unit4 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th8) {
                    th = th8;
                    w03Var = w03VarA;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
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
            }
            return objBeachfront;
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(wretchedly.dern dernVar) {
        ba3 ba3Var;
        fa3 fa3Var;
        if (dernVar instanceof ba3) {
            ba3Var = (ba3) dernVar;
            int i = ba3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba3Var.d = i - Integer.MIN_VALUE;
            } else {
                ba3Var = new ba3(this, dernVar);
            }
        } else {
            ba3Var = new ba3(this, dernVar);
        }
        Object obj = ba3Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ba3Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_prefetch_resources_enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:webview_prefetch_resources_enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return Unit.f29295attabal;
            }
            v83 v83Var = (v83) this.h.get();
            ba3Var.a = this;
            ba3Var.d = 1;
            if (v83Var.a(ba3Var) == objBeachfront) {
                return objBeachfront;
            }
            fa3Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fa3Var = ba3Var.a;
            p002kotlin.dern.saneness(obj);
        }
        http.dern dernVar2 = fa3Var.k;
        if (dernVar2 != null) {
            ri2 ri2Var = fa3Var.f;
            no0 no0Var = no0.CUI_NAME_WEBVIEW_PROFILE_PREFETCH_RESOURCES;
            List listFormularize = p002kotlin.collections.adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            String str = "block";
            String str2 = "context";
            String str3 = "<this>";
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    fa3Var.i.getClass();
                    Intrinsics.checkNotNullParameter(Features.PREFETCH_WITH_URL, "feature");
                    if (!arytenoidectomy.attabal(Features.PREFETCH_WITH_URL)) {
                        y13.a("Profile prefetch is not supported", null, 6);
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(v62VarA, null);
                        return unit;
                    }
                    jk0 jk0Var2 = fa3Var.c;
                    jk0Var2.getClass();
                    List defaultValue = p002kotlin.collections.adultoid.kowloon("https://pagead2.googlesyndication.com/omsdk/releases/live/omsdk-v1.js", "https://pagead2.googlesyndication.com/omsdk/releases/live/omid_session_bin.js", "https://www.googletagservices.com/activeview/js/current/lidar.js?cache=r20110914");
                    Intrinsics.checkNotNullParameter("gads:webview_prefetch_resources_url_list", X3.i.W);
                    Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                    for (String str4 : (List) jk0Var2.a("gads:webview_prefetch_resources_url_list", defaultValue, zk.g)) {
                        saran saranVar = fa3Var.e;
                        da3 da3Var = new da3(dernVar2, str4, fa3Var, null);
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        String str5 = str3;
                        Intrinsics.checkNotNullParameter(saranVar, str5);
                        String str6 = str2;
                        Intrinsics.checkNotNullParameter(emptyCoroutineContext, str6);
                        String str7 = str;
                        Intrinsics.checkNotNullParameter(da3Var, str7);
                        cutely.wireman(saranVar, emptyCoroutineContext, null, new x13(da3Var, null), 2, null);
                        str3 = str5;
                        str2 = str6;
                        str = str7;
                    }
                    Unit unit2 = Unit.f29295attabal;
                    interaction.saneness.attabal(v62VarA, null);
                } catch (Throwable th) {
                    try {
                        v62VarA.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        v62VarA.a(th);
                        if (th instanceof TimeoutCancellationException) {
                            throw new cp0(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(v62VarA, th2);
                            throw th3;
                        }
                    }
                }
            } else {
                w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    fa3Var.i.getClass();
                    Intrinsics.checkNotNullParameter(Features.PREFETCH_WITH_URL, "feature");
                    if (!arytenoidectomy.attabal(Features.PREFETCH_WITH_URL)) {
                        y13.a("Profile prefetch is not supported", null, 6);
                        Unit unit3 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA, null);
                        return unit3;
                    }
                    jk0 jk0Var3 = fa3Var.c;
                    jk0Var3.getClass();
                    List defaultValue2 = p002kotlin.collections.adultoid.kowloon("https://pagead2.googlesyndication.com/omsdk/releases/live/omsdk-v1.js", "https://pagead2.googlesyndication.com/omsdk/releases/live/omid_session_bin.js", "https://www.googletagservices.com/activeview/js/current/lidar.js?cache=r20110914");
                    Intrinsics.checkNotNullParameter("gads:webview_prefetch_resources_url_list", X3.i.W);
                    Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
                    for (String str8 : (List) jk0Var3.a("gads:webview_prefetch_resources_url_list", defaultValue2, zk.g)) {
                        saran saranVar2 = fa3Var.e;
                        da3 da3Var2 = new da3(dernVar2, str8, fa3Var, null);
                        EmptyCoroutineContext emptyCoroutineContext2 = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar2, str3);
                        Intrinsics.checkNotNullParameter(emptyCoroutineContext2, str2);
                        String str9 = str;
                        Intrinsics.checkNotNullParameter(da3Var2, str9);
                        cutely.wireman(saranVar2, emptyCoroutineContext2, null, new x13(da3Var2, null), 2, null);
                        str = str9;
                    }
                    Unit unit4 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA, null);
                } catch (Throwable th4) {
                    try {
                        w03VarA.b(th4);
                        if (th4 instanceof evenfall) {
                            throw th4;
                        }
                        w03VarA.a(th4);
                        if (th4 instanceof TimeoutCancellationException) {
                            throw new cp0(th4);
                        }
                        if (th4 instanceof CancellationException) {
                            throw new bn0(th4);
                        }
                        if (th4 instanceof yn0) {
                            throw th4;
                        }
                        throw new gn0(th4);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            interaction.saneness.attabal(w03VarA, th5);
                            throw th6;
                        }
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final String b() {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("profile_init_during_webview_creation:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("profile_init_during_webview_creation:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            this.i.getClass();
            Intrinsics.checkNotNullParameter(Features.MULTI_PROFILE, "feature");
            if (arytenoidectomy.attabal(Features.MULTI_PROFILE)) {
                return "GMA_WEBVIEW_PROFILE";
            }
            return null;
        }
        http.dern dernVar = this.k;
        if (dernVar != null) {
            return dernVar.getName();
        }
        return null;
    }
}
