package ads_mobile_sdk;

import com.google.gson.JsonObject;
import formularization.beachfront;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.hydrofracturing;
import saneness.spartacist;
import saneness.stratoscope;

/* JADX INFO: loaded from: classes.dex */
public final class e51 implements hydrofracturing {
    public final gq0 a;
    public final saran b;
    public final ri2 c;
    public final boolean d;
    public final formularization.attabal e;
    public boolean f;
    public int g;

    public e51(gq0 webView, saran backgroundScope, ri2 rootTraceCreator, boolean z) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = webView;
        this.b = backgroundScope;
        this.c = rootTraceCreator;
        this.d = z;
        this.e = beachfront.saneness(false, 1, null);
    }

    @Override // saneness.hydrofracturing
    public final Object a(String str, String str2, wretchedly.dern dernVar) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return a(this, str, str2, uuidRandomUUID, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r6.e(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(wretchedly.dern r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.z41
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.z41 r0 = (ads_mobile_sdk.z41) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.z41 r0 = new ads_mobile_sdk.z41
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r8)
            goto L67
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            formularization.attabal r2 = r0.b
            ads_mobile_sdk.e51 r6 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L50
        L3d:
            p002kotlin.dern.saneness(r8)
            formularization.attabal r2 = r7.e
            r0.a = r7
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r2.attabal(r5, r0)
            if (r8 != r1) goto L4f
            goto L66
        L4f:
            r6 = r7
        L50:
            int r8 = r6.g     // Catch: java.lang.Throwable -> L6a
            int r8 = r8 - r4
            r6.g = r8     // Catch: java.lang.Throwable -> L6a
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L6a
            r2.wireman(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        L6a:
            r8 = move-exception
            r2.wireman(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e51.b(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r6.e(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(wretchedly.dern r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.a51
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.a51 r0 = (ads_mobile_sdk.a51) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.a51 r0 = new ads_mobile_sdk.a51
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r8)
            goto L64
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            formularization.attabal r2 = r0.b
            ads_mobile_sdk.e51 r6 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L50
        L3d:
            p002kotlin.dern.saneness(r8)
            formularization.attabal r2 = r7.e
            r0.a = r7
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r2.attabal(r5, r0)
            if (r8 != r1) goto L4f
            goto L63
        L4f:
            r6 = r7
        L50:
            r6.f = r4     // Catch: java.lang.Throwable -> L67
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L67
            r2.wireman(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        L67:
            r8 = move-exception
            r2.wireman(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e51.c(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(wretchedly.dern dernVar) {
        b51 b51Var;
        e51 e51Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof b51) {
            b51Var = (b51) dernVar;
            int i = b51Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b51Var.e = i - Integer.MIN_VALUE;
            } else {
                b51Var = new b51(this, dernVar);
            }
        } else {
            b51Var = new b51(this, dernVar);
        }
        Object obj = b51Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = b51Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.e;
            b51Var.a = this;
            b51Var.b = attabalVar2;
            b51Var.e = 1;
            if (attabalVar2.attabal(null, b51Var) == objBeachfront) {
                return objBeachfront;
            }
            e51Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = b51Var.b;
            e51Var = b51Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            e51Var.g++;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(wretchedly.dern dernVar) {
        c51 c51Var;
        e51 e51Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof c51) {
            c51Var = (c51) dernVar;
            int i = c51Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c51Var.e = i - Integer.MIN_VALUE;
            } else {
                c51Var = new c51(this, dernVar);
            }
        } else {
            c51Var = new c51(this, dernVar);
        }
        Object obj = c51Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c51Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.e;
            c51Var.a = this;
            c51Var.b = attabalVar2;
            c51Var.e = 1;
            if (attabalVar2.attabal(null, c51Var) == objBeachfront) {
                return objBeachfront;
            }
            e51Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c51Var.b;
            e51Var = c51Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (e51Var.f && e51Var.g <= 0) {
                cutely.wireman(e51Var.b, null, null, new d51(e51Var, null), 3, null);
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #7 {all -> 0x004e, blocks: (B:20:0x004a, B:31:0x00bf, B:33:0x00c5), top: B:108:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5 A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #5 {all -> 0x00ec, blocks: (B:39:0x00d5, B:41:0x00dc, B:43:0x00e3, B:45:0x00e7, B:47:0x00eb, B:50:0x00ef, B:51:0x00f4, B:52:0x00f5, B:53:0x00fc, B:54:0x00fd, B:55:0x0104, B:56:0x0105), top: B:105:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0150 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:66:0x014a, B:68:0x0150), top: B:103:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0167 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x016e A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0176 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x017a A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0180 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0188 A[Catch: all -> 0x0177, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0190 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #3 {all -> 0x0177, blocks: (B:74:0x0160, B:76:0x0167, B:78:0x016e, B:80:0x0172, B:82:0x0176, B:85:0x017a, B:86:0x017f, B:87:0x0180, B:88:0x0187, B:89:0x0188, B:90:0x018f, B:91:0x0190), top: B:102:0x0160 }] */
    public static Object a(e51 e51Var, String value, String str, UUID uuid, wretchedly.dern dernVar) {
        y41 y41Var;
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        if (dernVar instanceof y41) {
            y41Var = (y41) dernVar;
            int i = y41Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y41Var.e = i - Integer.MIN_VALUE;
            } else {
                y41Var = new y41(e51Var, dernVar);
            }
        } else {
            y41Var = new y41(e51Var, dernVar);
        }
        Object obj = y41Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = y41Var.e;
        if (i2 != 0) {
            if (i2 == 1) {
                w03Var3 = y41Var.b;
                w03Var4 = y41Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var3, null);
                    return spartacistVar;
                } catch (Throwable th) {
                    th = th;
                    w03VarA2 = w03Var4;
                    try {
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            w03VarA2.a(th);
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
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = y41Var.b;
            w03Var2 = y41Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                interaction.saneness.attabal(w03Var, null);
                return spartacistVar2;
            } catch (Throwable th4) {
                th = th4;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA.a(th);
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
        p002kotlin.dern.saneness(obj);
        ri2 ri2Var = e51Var.c;
        no0 no0Var = no0.CUI_NAME_WEBVIEW_CALL_JS;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                o12 o12VarE = j13.a().e();
                stratoscope builder = bb1.o();
                Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(value, "value");
                builder.attabal(value);
                xm0 xm0VarA = builder.a();
                Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                o12VarE.y = (bb1) xm0VarA;
                gq0 gq0Var = e51Var.a;
                y41Var.a = w03VarA2;
                y41Var.b = w03VarA2;
                y41Var.e = 1;
                Object objB = gq0Var.b(value, str, uuid, y41Var);
                if (objB != objBeachfront) {
                    w03Var3 = w03VarA2;
                    w03Var4 = w03Var3;
                    obj = objB;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var3, null);
                    return spartacistVar;
                }
            } catch (Throwable th7) {
                th = th7;
                w03Var3 = w03VarA2;
                w03VarA2.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA2.a(th);
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
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                o12 o12VarE2 = j13.a().e();
                stratoscope builder2 = bb1.o();
                Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder2, "builder");
                Intrinsics.checkNotNullParameter(value, "value");
                builder2.attabal(value);
                xm0 xm0VarA2 = builder2.a();
                Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
                o12VarE2.y = (bb1) xm0VarA2;
                gq0 gq0Var2 = e51Var.a;
                y41Var.a = w03VarA;
                y41Var.b = w03VarA;
                y41Var.e = 2;
                Object objB2 = gq0Var2.b(value, str, uuid, y41Var);
                if (objB2 != objBeachfront) {
                    w03Var = w03VarA;
                    w03Var2 = w03Var;
                    obj = objB2;
                    spartacistVar2 = (spartacist) obj;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    interaction.saneness.attabal(w03Var, null);
                    return spartacistVar2;
                }
            } catch (Throwable th8) {
                th = th8;
                w03Var = w03VarA;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA.a(th);
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
        }
        return objBeachfront;
    }

    @Override // saneness.hydrofracturing
    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        Object objA = this.a.a(jsonObject, str, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
