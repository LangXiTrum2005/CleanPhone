package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;
import saneness.adultoid;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.cord;
import saneness.dishoard;
import saneness.evenfall;
import saneness.exaltedly;
import saneness.hobby;
import saneness.juju;
import saneness.spartacist;
import saneness.stupefactive;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class y91 extends cf0 implements supercargo {
    public static final long q;
    public final Context c;
    public final saran d;
    public final saran e;
    public final jk0 f;
    public final amphitheatre g;
    public final hobby h;
    public final zj0 i;
    public final ll2 j;
    public final g83 k;
    public final ri2 l;
    public final cord m;
    public final adultoid n;
    public final ip0 o;
    public exaltedly p;

    static {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        q = p002kotlin.time.dern.molybdenite(2, DurationUnit.MINUTES);
    }

    public y91(Context context, saran uiScope, saran backgroundScope, jk0 flags, amphitheatre clock, hobby httpClient, zj0 flagUpdater, ll2 sdkCoreDataStore, stupefactive flagValueProvider, g83 webViewFactory, ri2 rootTraceCreator, cord jsContext, coffeecake configuratorProvider, ip0 gmaUtil) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flagUpdater, "flagUpdater");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(configuratorProvider, "configuratorProvider");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.c = context;
        this.d = uiScope;
        this.e = backgroundScope;
        this.f = flags;
        this.g = clock;
        this.h = httpClient;
        this.i = flagUpdater;
        this.j = sdkCoreDataStore;
        this.k = webViewFactory;
        this.l = rootTraceCreator;
        this.m = jsContext;
        this.n = configuratorProvider;
        this.o = gmaUtil;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r5.c(r6, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.y91 r5, java.lang.String r6, wretchedly.dern r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof ads_mobile_sdk.u91
            if (r0 == 0) goto L16
            r0 = r7
            ads_mobile_sdk.u91 r0 = (ads_mobile_sdk.u91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.u91 r0 = new ads_mobile_sdk.u91
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p002kotlin.dern.saneness(r7)
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ads_mobile_sdk.y91 r5 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L4b
        L3d:
            p002kotlin.dern.saneness(r7)
            r0.a = r5
            r0.d = r4
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L4b
            goto L6a
        L4b:
            saneness.spartacist r7 = (saneness.spartacist) r7
            boolean r6 = r7 instanceof ads_mobile_sdk.nn0
            if (r6 == 0) goto L54
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        L54:
            java.lang.String r6 = "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>"
            p002kotlin.jvm.internal.Intrinsics.competently(r7, r6)
            ads_mobile_sdk.tn0 r7 = (ads_mobile_sdk.tn0) r7
            java.lang.Object r6 = r7.b
            ads_mobile_sdk.e51 r6 = (ads_mobile_sdk.e51) r6
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y91.a(ads_mobile_sdk.y91, java.lang.String, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(y91 y91Var, String str, wretchedly.dern dernVar) {
        x91 x91Var;
        y91Var.getClass();
        if (dernVar instanceof x91) {
            x91Var = (x91) dernVar;
            int i = x91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x91Var.d = i - Integer.MIN_VALUE;
            } else {
                x91Var = new x91(y91Var, dernVar);
            }
        } else {
            x91Var = new x91(y91Var, dernVar);
        }
        Object objC = x91Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = x91Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objC);
            x91Var.a = y91Var;
            x91Var.d = 1;
            objC = y91Var.c(str, x91Var);
            if (objC != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) x91Var.a;
            p002kotlin.dern.saneness(objC);
            return str2;
        }
        y91Var = (y91) x91Var.a;
        p002kotlin.dern.saneness(objC);
        spartacist spartacistVar = (spartacist) objC;
        if (spartacistVar instanceof nn0) {
            return null;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        dg2 dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
        String strA = dg2Var != null ? dg2.a(dg2Var) : null;
        if (strA != null && !StringsKt.empress(strA)) {
            ll2 ll2Var = y91Var.j;
            x91Var.a = strA;
            x91Var.d = 2;
            ll2Var.getClass();
            if (ll2.a(ll2Var, strA, x91Var) == objBeachfront) {
                return objBeachfront;
            }
        }
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #4 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x0091, B:33:0x0097), top: B:101:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #6 {all -> 0x00bc, blocks: (B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:44:0x00b7, B:46:0x00bb, B:49:0x00be, B:50:0x00c3, B:51:0x00c4, B:52:0x00cb, B:53:0x00cc, B:54:0x00d3, B:55:0x00d4), top: B:105:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0100 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:65:0x00fa, B:67:0x0100), top: B:96:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0115 A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011c A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124 A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127 A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x012d A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0135 A[Catch: all -> 0x0125, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x013d A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #2 {all -> 0x0125, blocks: (B:72:0x010e, B:74:0x0115, B:76:0x011c, B:78:0x0120, B:80:0x0124, B:83:0x0127, B:84:0x012c, B:85:0x012d, B:86:0x0134, B:87:0x0135, B:88:0x013c, B:89:0x013d), top: B:98:0x010e }] */
    public final Object c(String str, wretchedly.dern dernVar) {
        v91 v91Var;
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        w03 w03Var3;
        TimeoutCancellationException th2;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        if (dernVar instanceof v91) {
            v91Var = (v91) dernVar;
            int i = v91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v91Var.e = i - Integer.MIN_VALUE;
            } else {
                v91Var = new v91(this, dernVar);
            }
        } else {
            v91Var = new v91(this, dernVar);
        }
        Object obj = v91Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = v91Var.e;
        if (i2 != 0) {
            if (i2 == 1) {
                w03Var4 = v91Var.b;
                w03Var3 = v91Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return spartacistVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        w03Var3.b(th2);
                        if (!(th2 instanceof evenfall)) {
                            throw th2;
                        }
                        w03Var3.a(th2);
                        if (!(th2 instanceof TimeoutCancellationException)) {
                            throw new cp0(th2);
                        }
                        if (!(th2 instanceof CancellationException)) {
                            throw new bn0(th2);
                        }
                        if (th2 instanceof yn0) {
                            throw th2;
                        }
                        throw new gn0(th2);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(w03Var4, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = v91Var.b;
            w03Var = v91Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                interaction.saneness.attabal(w03Var2, null);
                return spartacistVar2;
            } catch (Throwable th6) {
                th = th6;
                try {
                    w03Var.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var.a(th);
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
        p002kotlin.dern.saneness(obj);
        ri2 ri2Var = this.l;
        no0 no0Var = no0.CUI_NAME_SDKINIT_SDKCORE_REQUEST;
        List listFormularize = p002kotlin.collections.adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                hobby hobbyVar = this.h;
                URL url = new URL(str);
                v91Var.a = v62VarA;
                v91Var.b = v62VarA;
                v91Var.e = 1;
                Object objAttabal = hobby.attabal(hobbyVar, url, null, v91Var, 14);
                if (objAttabal != objBeachfront) {
                    w03Var3 = v62VarA;
                    obj = objAttabal;
                    w03Var4 = w03Var3;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return spartacistVar;
                }
            } catch (Throwable th9) {
                w03Var3 = v62VarA;
                th2 = th9;
                w03Var4 = w03Var3;
                w03Var3.b(th2);
                if (!(th2 instanceof evenfall)) {
                    throw th2;
                }
                w03Var3.a(th2);
                if (!(th2 instanceof TimeoutCancellationException)) {
                    throw new cp0(th2);
                }
                if (!(th2 instanceof CancellationException)) {
                    throw new bn0(th2);
                }
                if (th2 instanceof yn0) {
                    throw th2;
                }
                throw new gn0(th2);
            }
        } else {
            w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
            try {
                hobby hobbyVar2 = this.h;
                URL url2 = new URL(str);
                v91Var.a = w03VarA;
                v91Var.b = w03VarA;
                v91Var.e = 2;
                Object objAttabal2 = hobby.attabal(hobbyVar2, url2, null, v91Var, 14);
                if (objAttabal2 != objBeachfront) {
                    w03Var = w03VarA;
                    obj = objAttabal2;
                    w03Var2 = w03Var;
                    spartacistVar2 = (spartacist) obj;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    interaction.saneness.attabal(w03Var2, null);
                    return spartacistVar2;
                }
            } catch (Throwable th10) {
                w03Var = w03VarA;
                th = th10;
                w03Var2 = w03Var;
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var.a(th);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(wretchedly.dern dernVar) {
        t91 t91Var;
        y91 y91Var;
        if (dernVar instanceof t91) {
            t91Var = (t91) dernVar;
            int i = t91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t91Var.d = i - Integer.MIN_VALUE;
            } else {
                t91Var = new t91(this, dernVar);
            }
        } else {
            t91Var = new t91(this, dernVar);
        }
        Object objB = t91Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = t91Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB);
            if (((ik) this.f.a).m.get()) {
                return new tn0(Unit.f29295attabal);
            }
            t91Var.a = this;
            t91Var.d = 1;
            objB = b(t91Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
            y91Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y91Var = t91Var.a;
            p002kotlin.dern.saneness(objB);
        }
        spartacist spartacistVar = (spartacist) objB;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        return ((ik) y91Var.f.a).m.get() ? new tn0(Unit.f29295attabal) : new rn0("Failed to get the CSRB flags", k41.INTERNAL_ERROR);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(y91 y91Var, wretchedly.dern dernVar) {
        w91 w91Var;
        long j;
        long jGraveside;
        dishoard dishoardVar;
        y91Var.getClass();
        if (dernVar instanceof w91) {
            w91Var = (w91) dernVar;
            int i = w91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w91Var.e = i - Integer.MIN_VALUE;
            } else {
                w91Var = new w91(y91Var, dernVar);
            }
        } else {
            w91Var = new w91(y91Var, dernVar);
        }
        Object objA = w91Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = w91Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            ll2 ll2Var = y91Var.j;
            w91Var.a = y91Var;
            w91Var.e = 1;
            ll2Var.getClass();
            objA = ll2.a(ll2Var, w91Var);
            if (objA != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            y91Var = w91Var.a;
            p002kotlin.dern.saneness(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = w91Var.b;
            y91Var = w91Var.a;
            p002kotlin.dern.saneness(objA);
        }
        jGraveside = p002kotlin.time.dern.graveside(((fl2) objA).q(), DurationUnit.MILLISECONDS);
        dishoardVar = y91Var.f.s;
        dishoardVar.getClass();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        if (p002kotlin.time.saneness.formularize(j, p002kotlin.time.saneness.polder(jGraveside, ((p002kotlin.time.saneness) dishoardVar.a("gads:sdk_core_ttl_seconds", juju.attabal(30, DurationUnit.DAYS, "gads:sdk_core_ttl_seconds", X3.i.W), zk.l)).getRawValue())) >= 0) {
            z = false;
        }
        return igo.attabal.attabal(z);
        String strO = ((fl2) objA).o();
        Intrinsics.checkNotNullExpressionValue(strO, "getCachedSdkCore(...)");
        if (StringsKt.empress(strO)) {
            z = false;
        } else {
            dishoard dishoardVar2 = y91Var.f.s;
            dishoardVar2.getClass();
            if (p002kotlin.time.saneness.formularize(((p002kotlin.time.saneness) dishoardVar2.a("gads:sdk_core_ttl_seconds", juju.attabal(30, DurationUnit.DAYS, "gads:sdk_core_ttl_seconds", X3.i.W), zk.l)).getRawValue(), p002kotlin.time.saneness.INSTANCE.dern()) > 0) {
                y91Var.g.getClass();
                long jGraveside2 = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
                ll2 ll2Var2 = y91Var.j;
                w91Var.a = y91Var;
                w91Var.b = jGraveside2;
                w91Var.e = 2;
                ll2Var2.getClass();
                objA = ll2.a(ll2Var2, w91Var);
                if (objA != objBeachfront) {
                    j = jGraveside2;
                    jGraveside = p002kotlin.time.dern.graveside(((fl2) objA).q(), DurationUnit.MILLISECONDS);
                    dishoardVar = y91Var.f.s;
                    dishoardVar.getClass();
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    if (p002kotlin.time.saneness.formularize(j, p002kotlin.time.saneness.polder(jGraveside, ((p002kotlin.time.saneness) dishoardVar.a("gads:sdk_core_ttl_seconds", juju.attabal(30, DurationUnit.DAYS, "gads:sdk_core_ttl_seconds", X3.i.W), zk.l)).getRawValue())) >= 0) {
                        z = false;
                    }
                }
                return objBeachfront;
            }
        }
        return igo.attabal.attabal(z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, wretchedly.dern dernVar) {
        m91 m91Var;
        String str2;
        y91 y91Var;
        Ref$ObjectRef ref$ObjectRef;
        if (dernVar instanceof m91) {
            m91Var = (m91) dernVar;
            int i = m91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                m91Var.e = i - Integer.MIN_VALUE;
            } else {
                m91Var = new m91(this, dernVar);
            }
        } else {
            m91Var = new m91(this, dernVar);
        }
        m91 m91Var2 = m91Var;
        Object objWireman = m91Var2.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = m91Var2.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objWireman);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ip0 ip0Var = this.o;
            Context context = this.c;
            ip0Var.getClass();
            String str3 = ip0.a(context).b;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null && lowerCase.equals("ru")) {
                    dishoard dishoardVar = this.f.s;
                    dishoardVar.getClass();
                    Intrinsics.checkNotNullParameter("gads:sdk_core_location:decagon", X3.i.W);
                    Intrinsics.checkNotNullParameter("https://mediation.goog/mads/static/sdk/native/sdk-core-v40.html", "defaultValue");
                    str2 = (String) dishoardVar.a("gads:sdk_core_location:decagon", "https://mediation.goog/mads/static/sdk/native/sdk-core-v40.html", zk.o);
                } else {
                    dishoard dishoardVar2 = this.f.s;
                    dishoardVar2.getClass();
                    Intrinsics.checkNotNullParameter("gads:sdk_core_location:decagon", X3.i.W);
                    Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-android.html", "defaultValue");
                    str2 = (String) dishoardVar2.a("gads:sdk_core_location:decagon", "https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-android.html", zk.o);
                }
            } else {
                dishoard dishoardVar3 = this.f.s;
                dishoardVar3.getClass();
                Intrinsics.checkNotNullParameter("gads:sdk_core_location:decagon", X3.i.W);
                Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-android.html", "defaultValue");
                str2 = (String) dishoardVar3.a("gads:sdk_core_location:decagon", "https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-android.html", zk.o);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str2).buildUpon();
            dishoard dishoardVar4 = this.f.s;
            dishoardVar4.getClass();
            JsonObject defaultValue = new JsonObject();
            Intrinsics.checkNotNullParameter("sdk_core_query_params", X3.i.W);
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) dishoardVar4.a("sdk_core_query_params", defaultValue, zk.i)).entrySet()) {
                if (entry.getValue().isJsonPrimitive() && entry.getValue().getAsJsonPrimitive().isString()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue().getAsString());
                }
            }
            String string = builderBuildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            dishoard dishoardVar5 = this.f.s;
            dishoardVar5.getClass();
            Intrinsics.checkNotNullParameter("gads:cache_sdk_core:enabled", X3.i.W);
            Boolean bool = Boolean.TRUE;
            jk jkVar = zk.b;
            boolean zBooleanValue = ((Boolean) dishoardVar5.a("gads:cache_sdk_core:enabled", bool, jkVar)).booleanValue();
            dishoard dishoardVar6 = this.f.s;
            dishoardVar6.getClass();
            Intrinsics.checkNotNullParameter("gads:fetch_initial_sdk_core_separately:enabled", X3.i.W);
            boolean zBooleanValue2 = ((Boolean) dishoardVar6.a("gads:fetch_initial_sdk_core_separately:enabled", Boolean.FALSE, jkVar)).booleanValue();
            try {
                long jAttabal = this.f.s.attabal();
                q91 q91Var = new q91(str, zBooleanValue, this, zBooleanValue2, ref$ObjectRef2, string, null);
                m91Var2.a = this;
                m91Var2.b = ref$ObjectRef2;
                m91Var2.e = 1;
                objWireman = TimeoutKt.wireman(jAttabal, q91Var, m91Var2);
                if (objWireman == objBeachfront) {
                    return objBeachfront;
                }
                y91Var = this;
                ref$ObjectRef = ref$ObjectRef2;
            } catch (cp0 e) {
                e = e;
                y91Var = this;
                ref$ObjectRef = ref$ObjectRef2;
                cutely.wireman(y91Var.d, dhss.f32190kowloon, null, new s91(ref$ObjectRef, null), 2, null);
                return new un0("Timed out waiting on /jsLoaded gmsg while loading a JavascriptEngine", e);
            } catch (TimeoutCancellationException e2) {
                e = e2;
                y91Var = this;
                ref$ObjectRef = ref$ObjectRef2;
                cutely.wireman(y91Var.d, dhss.f32190kowloon, null, new r91(ref$ObjectRef, null), 2, null);
                return new un0("Timed out waiting on /jsLoaded gmsg while loading a JavascriptEngine", e);
            }
        } else if (i2 == 1) {
            ref$ObjectRef = m91Var2.b;
            y91Var = m91Var2.a;
            try {
                p002kotlin.dern.saneness(objWireman);
            } catch (cp0 e3) {
                e = e3;
                cutely.wireman(y91Var.d, dhss.f32190kowloon, null, new s91(ref$ObjectRef, null), 2, null);
                return new un0("Timed out waiting on /jsLoaded gmsg while loading a JavascriptEngine", e);
            } catch (TimeoutCancellationException e4) {
                e = e4;
                cutely.wireman(y91Var.d, dhss.f32190kowloon, null, new r91(ref$ObjectRef, null), 2, null);
                return new un0("Timed out waiting on /jsLoaded gmsg while loading a JavascriptEngine", e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (spartacist) objWireman;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (ads_mobile_sdk.zj0.a(r2, r14, (com.google.gson.JsonObject) r15, r0) == r1) goto L40;
     */
    @Override // ads_mobile_sdk.cf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.e51 r14, wretchedly.dern r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y91.a(ads_mobile_sdk.e51, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #3 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x0088, B:33:0x008e), top: B:98:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x009c, B:40:0x00a3, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:49:0x00b5, B:50:0x00ba, B:51:0x00bb, B:52:0x00c2, B:53:0x00c3, B:54:0x00ca, B:55:0x00cb), top: B:94:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:65:0x00ea, B:67:0x00f0), top: B:95:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:76:0x010c A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0110 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0114 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:85:0x011d A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:89:0x012d A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #2 {all -> 0x0115, blocks: (B:72:0x00fe, B:74:0x0105, B:76:0x010c, B:78:0x0110, B:80:0x0114, B:83:0x0117, B:84:0x011c, B:85:0x011d, B:86:0x0124, B:87:0x0125, B:88:0x012c, B:89:0x012d), top: B:97:0x00fe }] */
    @Override // ads_mobile_sdk.cf0
    public final Object a(String str, wretchedly.dern dernVar) {
        l91 l91Var;
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        w03 w03Var3;
        TimeoutCancellationException th2;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        if (dernVar instanceof l91) {
            l91Var = (l91) dernVar;
            int i = l91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l91Var.e = i - Integer.MIN_VALUE;
            } else {
                l91Var = new l91(this, dernVar);
            }
        } else {
            l91Var = new l91(this, dernVar);
        }
        Object obj = l91Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l91Var.e;
        if (i2 != 0) {
            if (i2 == 1) {
                w03Var4 = l91Var.b;
                w03Var3 = l91Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return spartacistVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        w03Var3.b(th2);
                        if (!(th2 instanceof evenfall)) {
                            w03Var3.a(th2);
                            if (!(th2 instanceof TimeoutCancellationException)) {
                                if (!(th2 instanceof CancellationException)) {
                                    if (th2 instanceof yn0) {
                                        throw th2;
                                    }
                                    throw new gn0(th2);
                                }
                                throw new bn0(th2);
                            }
                            throw new cp0(th2);
                        }
                        throw th2;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(w03Var4, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = l91Var.b;
            w03Var = l91Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                interaction.saneness.attabal(w03Var2, null);
                return spartacistVar2;
            } catch (Throwable th6) {
                th = th6;
                try {
                    w03Var.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var.a(th);
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
        p002kotlin.dern.saneness(obj);
        ri2 ri2Var = this.l;
        no0 no0Var = no0.CUI_NAME_SDKINIT_SDKCORE;
        List listFormularize = p002kotlin.collections.adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                l91Var.a = v62VarA;
                l91Var.b = v62VarA;
                l91Var.e = 1;
                Object objB = b(str, l91Var);
                if (objB != objBeachfront) {
                    w03Var3 = v62VarA;
                    obj = objB;
                    w03Var4 = w03Var3;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(w03Var4, null);
                    return spartacistVar;
                }
            } catch (Throwable th9) {
                w03Var3 = v62VarA;
                th2 = th9;
                w03Var4 = w03Var3;
                w03Var3.b(th2);
                if (!(th2 instanceof evenfall)) {
                    w03Var3.a(th2);
                    if (!(th2 instanceof TimeoutCancellationException)) {
                        if (!(th2 instanceof CancellationException)) {
                            if (th2 instanceof yn0) {
                                throw th2;
                            }
                            throw new gn0(th2);
                        }
                        throw new bn0(th2);
                    }
                    throw new cp0(th2);
                }
                throw th2;
            }
        } else {
            w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
            try {
                l91Var.a = w03VarA;
                l91Var.b = w03VarA;
                l91Var.e = 2;
                Object objB2 = b(str, l91Var);
                if (objB2 != objBeachfront) {
                    w03Var = w03VarA;
                    obj = objB2;
                    w03Var2 = w03Var;
                    spartacistVar2 = (spartacist) obj;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    interaction.saneness.attabal(w03Var2, null);
                    return spartacistVar2;
                }
            } catch (Throwable th10) {
                w03Var = w03VarA;
                th = th10;
                w03Var2 = w03Var;
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    w03Var.a(th);
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
}
