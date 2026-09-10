package ads_mobile_sdk;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.grimness;

/* JADX INFO: loaded from: classes.dex */
public final class cq1 {
    public final ri2 a;
    public final g83 b;
    public final grimness c;

    public cq1(ri2 rootTraceCreator, g83 webViewFactory, grimness nativePolicyValidatorOverlayConfigurator) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorOverlayConfigurator, "nativePolicyValidatorOverlayConfigurator");
        this.a = rootTraceCreator;
        this.b = webViewFactory;
        this.c = nativePolicyValidatorOverlayConfigurator;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b3 A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7 A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01bd A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5 A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0126 A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012a A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0134 A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x013c A[Catch: all -> 0x012b, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0144 A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #10 {all -> 0x012b, blocks: (B:55:0x0114, B:57:0x011b, B:59:0x0122, B:61:0x0126, B:63:0x012a, B:66:0x012e, B:67:0x0133, B:68:0x0134, B:69:0x013b, B:70:0x013c, B:71:0x0143, B:72:0x0144), top: B:135:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab A[Catch: all -> 0x01b4, TryCatch #3 {all -> 0x01b4, blocks: (B:94:0x019d, B:96:0x01a4, B:98:0x01ab, B:100:0x01af, B:102:0x01b3, B:105:0x01b7, B:106:0x01bc, B:107:0x01bd, B:108:0x01c4, B:109:0x01c5, B:110:0x01cc, B:111:0x01cd), top: B:122:0x019d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v22, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static Object a(cq1 cq1Var, wretchedly.dern dernVar) {
        bq1 bq1Var;
        Closeable closeableA;
        ?? r6;
        Closeable closeable;
        Closeable closeableA2;
        ?? r7;
        Closeable closeable2;
        ?? r4;
        gq0 gq0Var;
        grimness grimnessVar;
        gerenuk gerenukVarC;
        gq0 gq0Var2;
        ?? r2;
        Closeable closeable3;
        ?? r5;
        gq0 gq0Var3;
        grimness grimnessVar2;
        gerenuk gerenukVarC2;
        gq0 gq0Var4;
        ?? r3;
        Closeable closeable4;
        cq1 cq1Var2 = cq1Var;
        if (dernVar instanceof bq1) {
            bq1Var = (bq1) dernVar;
            int i = bq1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq1Var.f = i - Integer.MIN_VALUE;
            } else {
                bq1Var = new bq1(cq1Var2, dernVar);
            }
        } else {
            bq1Var = new bq1(cq1Var2, dernVar);
        }
        Object objA = bq1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = bq1Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            ri2 ri2Var = cq1Var2.a;
            no0 no0Var = no0.CUI_NAME_NATIVE_POLICY_VALIDATOR_WEBVIEW_CREATE;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                closeableA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    g83 g83Var = cq1Var2.b;
                    ia3 ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                    bq1Var.a = cq1Var2;
                    bq1Var.b = closeableA2;
                    bq1Var.c = closeableA2;
                    bq1Var.f = 1;
                    objA = g83Var.a(ia3Var, null, bq1Var);
                    if (objA != objBeachfront) {
                        closeable2 = closeableA2;
                        r4 = closeableA2;
                        gq0Var = (gq0) objA;
                        grimnessVar = cq1Var2.c;
                        gerenukVarC = gq0Var.c();
                        bq1Var.a = r4;
                        bq1Var.b = closeable2;
                        bq1Var.c = gq0Var;
                        bq1Var.f = 2;
                        if (grimnessVar.a(gerenukVarC, bq1Var) != objBeachfront) {
                            gq0Var2 = gq0Var;
                            r2 = r4;
                            closeable3 = closeable2;
                            gq0Var2.setVisibility(4);
                            gq0Var2.setContentDescription("policy_validator");
                            interaction.saneness.attabal(closeable3, null);
                            return gq0Var2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r7 = closeableA2;
                    r7.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r7.a(th);
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
                closeableA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    g83 g83Var2 = cq1Var2.b;
                    ia3 ia3Var2 = new ia3(ha3.DEFAULT, 0, 0, 14);
                    bq1Var.a = cq1Var2;
                    bq1Var.b = closeableA;
                    bq1Var.c = closeableA;
                    bq1Var.f = 3;
                    objA = g83Var2.a(ia3Var2, null, bq1Var);
                    if (objA != objBeachfront) {
                        closeable = closeableA;
                        r5 = closeableA;
                        gq0Var3 = (gq0) objA;
                        grimnessVar2 = cq1Var2.c;
                        gerenukVarC2 = gq0Var3.c();
                        bq1Var.a = r5;
                        bq1Var.b = closeable;
                        bq1Var.c = gq0Var3;
                        bq1Var.f = 4;
                        if (grimnessVar2.a(gerenukVarC2, bq1Var) != objBeachfront) {
                            gq0Var4 = gq0Var3;
                            r3 = r5;
                            closeable4 = closeable;
                            gq0Var4.setVisibility(4);
                            gq0Var4.setContentDescription("policy_validator");
                            interaction.saneness.attabal(closeable4, null);
                            return gq0Var4;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r6 = closeableA;
                    r6.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r6.a(th);
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
        if (i2 == 1) {
            closeableA2 = (Closeable) bq1Var.c;
            r7 = (w03) bq1Var.b;
            cq1Var2 = (cq1) bq1Var.a;
            try {
                p002kotlin.dern.saneness(objA);
                closeable2 = closeableA2;
                r4 = r7;
                try {
                    gq0Var = (gq0) objA;
                    grimnessVar = cq1Var2.c;
                    gerenukVarC = gq0Var.c();
                    bq1Var.a = r4;
                    bq1Var.b = closeable2;
                    bq1Var.c = gq0Var;
                    bq1Var.f = 2;
                    if (grimnessVar.a(gerenukVarC, bq1Var) != objBeachfront) {
                        gq0Var2 = gq0Var;
                        r2 = r4;
                        closeable3 = closeable2;
                        gq0Var2.setVisibility(4);
                        gq0Var2.setContentDescription("policy_validator");
                        interaction.saneness.attabal(closeable3, null);
                        return gq0Var2;
                    }
                    return objBeachfront;
                } catch (Throwable th3) {
                    th = th3;
                    Closeable closeable5 = closeable2;
                    r7 = r4;
                    closeableA2 = closeable5;
                    r7.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r7.a(th);
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
            } catch (Throwable th4) {
                th = th4;
                r7.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                r7.a(th);
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
        if (i2 == 2) {
            gq0Var2 = (gq0) bq1Var.c;
            closeable3 = bq1Var.b;
            r2 = (w03) bq1Var.a;
            try {
                p002kotlin.dern.saneness(objA);
                r2 = r2;
                closeable3 = closeable3;
                gq0Var2.setVisibility(4);
                gq0Var2.setContentDescription("policy_validator");
                interaction.saneness.attabal(closeable3, null);
                return gq0Var2;
            } catch (Throwable th5) {
                th = th5;
                r7 = r2;
                closeableA2 = closeable3;
                try {
                    r7.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r7.a(th);
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
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        interaction.saneness.attabal(closeableA2, th6);
                        throw th7;
                    }
                }
            }
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var4 = (gq0) bq1Var.c;
            closeable4 = bq1Var.b;
            r3 = (w03) bq1Var.a;
            try {
                p002kotlin.dern.saneness(objA);
                r3 = r3;
                closeable4 = closeable4;
                gq0Var4.setVisibility(4);
                gq0Var4.setContentDescription("policy_validator");
                interaction.saneness.attabal(closeable4, null);
                return gq0Var4;
            } catch (Throwable th8) {
                th = th8;
                r6 = r3;
                closeableA = closeable4;
                try {
                    r6.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r6.a(th);
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
                } catch (Throwable th9) {
                    try {
                        throw th9;
                    } catch (Throwable th10) {
                        interaction.saneness.attabal(closeableA, th9);
                        throw th10;
                    }
                }
            }
        }
        closeableA = (Closeable) bq1Var.c;
        r6 = (w03) bq1Var.b;
        cq1Var2 = (cq1) bq1Var.a;
        try {
            p002kotlin.dern.saneness(objA);
            closeable = closeableA;
            r5 = r6;
            try {
                gq0Var3 = (gq0) objA;
                grimnessVar2 = cq1Var2.c;
                gerenukVarC2 = gq0Var3.c();
                bq1Var.a = r5;
                bq1Var.b = closeable;
                bq1Var.c = gq0Var3;
                bq1Var.f = 4;
                if (grimnessVar2.a(gerenukVarC2, bq1Var) != objBeachfront) {
                    gq0Var4 = gq0Var3;
                    r3 = r5;
                    closeable4 = closeable;
                    gq0Var4.setVisibility(4);
                    gq0Var4.setContentDescription("policy_validator");
                    interaction.saneness.attabal(closeable4, null);
                    return gq0Var4;
                }
                return objBeachfront;
            } catch (Throwable th11) {
                th = th11;
                Closeable closeable6 = closeable;
                r6 = r5;
                closeableA = closeable6;
                r6.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                r6.a(th);
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
        } catch (Throwable th12) {
            th = th12;
            r6.b(th);
            if (!(th instanceof evenfall)) {
                throw th;
            }
            r6.a(th);
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
}
