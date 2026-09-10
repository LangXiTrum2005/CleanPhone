package ads_mobile_sdk;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import complexometry.MediationAdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.evenfall;
import saneness.sclerosis;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class m23 implements undertread, sclerosis {
    public final ri2 a;
    public final tc1 b;
    public final g6 c;
    public final rg2 d;
    public final Optional e;
    public final jm2 f;
    public final h1 g;
    public final l13 h;
    public final int i;
    public final amphitheatre j;
    public final gm2 k;
    public final ch0 l;
    public final a22 m;
    public final adultoid n;
    public final ah o;
    public final Set p;
    public final jk0 q;
    public final ej1 r;

    public m23(ri2 rootTraceCreator, tc1 macroExpander, g6 adSpamClient, rg2 retryingUrlPinger, Optional view, jm2 serverTransaction, h1 adConfiguration, l13 traceMetaSet, int i, amphitheatre clock, gm2 serverSideVerificationOptionsHolder, ch0 firebaseAnalyticsEventHandler, a22 placementIdWrapper, coffeecake adEventEmitterProvider, ah appStatsTracker, Set requestTypes, jk0 flags) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(macroExpander, "macroExpander");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(serverSideVerificationOptionsHolder, "serverSideVerificationOptionsHolder");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        Intrinsics.checkNotNullParameter(adEventEmitterProvider, "adEventEmitterProvider");
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        Intrinsics.checkNotNullParameter(requestTypes, "requestTypes");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = rootTraceCreator;
        this.b = macroExpander;
        this.c = adSpamClient;
        this.d = retryingUrlPinger;
        this.e = view;
        this.f = serverTransaction;
        this.g = adConfiguration;
        this.h = traceMetaSet;
        this.i = i;
        this.j = clock;
        this.k = serverSideVerificationOptionsHolder;
        this.l = firebaseAnalyticsEventHandler;
        this.m = placementIdWrapper;
        this.n = adEventEmitterProvider;
        this.o = appStatsTracker;
        this.p = requestTypes;
        this.q = flags;
        this.r = new ej1(null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // saneness.undertread
    public final Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        g23 g23Var;
        m23 m23Var;
        if (dernVar instanceof g23) {
            g23Var = (g23) dernVar;
            int i = g23Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g23Var.d = i - Integer.MIN_VALUE;
            } else {
                g23Var = new g23(this, dernVar);
            }
        } else {
            g23Var = new g23(this, dernVar);
        }
        g23 g23Var2 = g23Var;
        Object objA = g23Var2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = g23Var2.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            MediationAdError mediationAdError = fullScreenContentError.getMediationAdError();
            int iIntValue = mediationAdError != null ? mediationAdError.attabal().intValue() : fullScreenContentError.getCode().getValue();
            List list = this.g.V;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String string = ((Uri) it.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(Uri.parse(p002kotlin.text.dovishness.polder(string, "@gw_mpe@", "2." + iIntValue, false, 4, null)));
            }
            tc1 tc1Var = this.b;
            jm2 jm2Var = this.f;
            h1 h1Var = this.g;
            Integer numWireman = igo.attabal.wireman(this.i);
            g23Var2.a = this;
            g23Var2.d = 1;
            objA = tc1.a(tc1Var, arrayList, jm2Var, h1Var, numWireman, null, null, null, null, null, g23Var2, 496);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            m23Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m23Var = g23Var2.a;
            p002kotlin.dern.saneness(objA);
        }
        a(m23Var, (List) objA);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // saneness.sclerosis
    public final Object f(wretchedly.dern dernVar) {
        k23 k23Var;
        m23 m23Var;
        if (dernVar instanceof k23) {
            k23Var = (k23) dernVar;
            int i = k23Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k23Var.d = i - Integer.MIN_VALUE;
            } else {
                k23Var = new k23(this, dernVar);
            }
        } else {
            k23Var = new k23(this, dernVar);
        }
        k23 k23Var2 = k23Var;
        Object objA = k23Var2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = k23Var2.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            tc1 tc1Var = this.b;
            h1 h1Var = this.g;
            List list = h1Var.g0;
            jm2 jm2Var = this.f;
            Integer numWireman = igo.attabal.wireman(this.i);
            k23Var2.a = this;
            k23Var2.d = 1;
            objA = tc1.a(tc1Var, list, jm2Var, h1Var, numWireman, null, null, null, null, null, k23Var2, 496);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            m23Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m23Var = k23Var2.a;
            p002kotlin.dern.saneness(objA);
        }
        a(m23Var, (List) objA);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9 A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #3 {all -> 0x00b8, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:48:0x00bb, B:49:0x00c0, B:50:0x00c1, B:51:0x00c8, B:52:0x00c9, B:53:0x00d0, B:54:0x00d1), top: B:98:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0124 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x012b A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012f A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0133 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0137 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013d A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0145 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:88:0x014d A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #1 {all -> 0x0134, blocks: (B:71:0x011d, B:73:0x0124, B:75:0x012b, B:77:0x012f, B:79:0x0133, B:82:0x0137, B:83:0x013c, B:84:0x013d, B:85:0x0144, B:86:0x0145, B:87:0x014c, B:88:0x014d), top: B:95:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // saneness.undertread
    public final Object j(wretchedly.dern dernVar) {
        i23 i23Var;
        w03 w03Var;
        w03 w03Var2;
        m23 m23Var;
        w03 w03Var3;
        w03 w03Var4;
        m23 m23Var2;
        TimeoutCancellationException timeoutCancellationException;
        TimeoutCancellationException timeoutCancellationException2;
        if (dernVar instanceof i23) {
            i23Var = (i23) dernVar;
            int i = i23Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i23Var.f = i - Integer.MIN_VALUE;
            } else {
                i23Var = new i23(this, dernVar);
            }
        } else {
            i23Var = new i23(this, dernVar);
        }
        i23 i23Var2 = i23Var;
        Object obj = i23Var2.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = i23Var2.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.a;
            no0 no0Var = no0.CUI_NAME_PRESENTATION;
            List listFormularize = p002kotlin.collections.adultoid.formularize();
            l13 l13Var = this.h;
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    tc1 tc1Var = this.b;
                    h1 h1Var = this.g;
                    List list = h1Var.T;
                    jm2 jm2Var = this.f;
                    Integer numWireman = igo.attabal.wireman(this.i);
                    i23Var2.a = v62VarA;
                    i23Var2.b = v62VarA;
                    i23Var2.c = this;
                    i23Var2.f = 1;
                    Object objA = tc1.a(tc1Var, list, jm2Var, h1Var, numWireman, null, null, null, null, null, i23Var2, 496);
                    if (objA != objBeachfront) {
                        m23Var2 = this;
                        w03Var4 = v62VarA;
                        obj = objA;
                        w03Var3 = w03Var4;
                        a(m23Var2, (List) obj);
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    w03Var3 = v62VarA;
                    w03Var4 = w03Var3;
                    timeoutCancellationException = th;
                    w03Var4.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03Var4.a(timeoutCancellationException);
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
            } else {
                w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    tc1 tc1Var2 = this.b;
                    h1 h1Var2 = this.g;
                    List list2 = h1Var2.T;
                    jm2 jm2Var2 = this.f;
                    Integer numWireman2 = igo.attabal.wireman(this.i);
                    i23Var2.a = w03VarA;
                    i23Var2.b = w03VarA;
                    i23Var2.c = this;
                    i23Var2.f = 2;
                    Object objA2 = tc1.a(tc1Var2, list2, jm2Var2, h1Var2, numWireman2, null, null, null, null, null, i23Var2, 496);
                    if (objA2 != objBeachfront) {
                        m23Var = this;
                        w03Var2 = w03VarA;
                        obj = objA2;
                        w03Var = w03Var2;
                        a(m23Var, (List) obj);
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    w03Var = w03VarA;
                    w03Var2 = w03Var;
                    timeoutCancellationException2 = th;
                    w03Var2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var2.a(timeoutCancellationException2);
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
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            m23Var2 = i23Var2.c;
            w03Var3 = i23Var2.b;
            w03Var4 = i23Var2.a;
            try {
                p002kotlin.dern.saneness(obj);
                a(m23Var2, (List) obj);
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var3, null);
            } catch (Throwable th3) {
                th = th3;
                timeoutCancellationException = th;
                try {
                    w03Var4.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        throw timeoutCancellationException;
                    }
                    w03Var4.a(timeoutCancellationException);
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
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var3, th4);
                        throw th5;
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m23Var = i23Var2.c;
            w03Var = i23Var2.b;
            w03Var2 = i23Var2.a;
            try {
                p002kotlin.dern.saneness(obj);
                a(m23Var, (List) obj);
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
            } catch (Throwable th6) {
                th = th6;
                timeoutCancellationException2 = th;
                try {
                    w03Var2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var2.a(timeoutCancellationException2);
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
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        interaction.saneness.attabal(w03Var, th7);
                        throw th8;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // saneness.sclerosis
    public final Object k(wretchedly.dern dernVar) {
        l23 l23Var;
        m23 m23Var;
        if (dernVar instanceof l23) {
            l23Var = (l23) dernVar;
            int i = l23Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l23Var.d = i - Integer.MIN_VALUE;
            } else {
                l23Var = new l23(this, dernVar);
            }
        } else {
            l23Var = new l23(this, dernVar);
        }
        l23 l23Var2 = l23Var;
        Object objA = l23Var2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l23Var2.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            tc1 tc1Var = this.b;
            h1 h1Var = this.g;
            List list = h1Var.h0;
            jm2 jm2Var = this.f;
            Integer numWireman = igo.attabal.wireman(this.i);
            l23Var2.a = this;
            l23Var2.d = 1;
            objA = tc1.a(tc1Var, list, jm2Var, h1Var, numWireman, null, null, null, null, null, l23Var2, 496);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            m23Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m23Var = l23Var2.a;
            p002kotlin.dern.saneness(objA);
        }
        a(m23Var, (List) objA);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0110 -> B:54:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // saneness.undertread
    public final java.lang.Object n(wretchedly.dern r21) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m23.n(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0146 -> B:57:0x0149). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // saneness.undertread
    public final java.lang.Object q(wretchedly.dern r29) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m23.q(wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.sclerosis
    public final Unit a(scarbroite.attabal rewardItem, wretchedly.dern dernVar) {
        tc1 tc1Var = this.b;
        List uris = this.g.d0;
        this.j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        gm2 gm2Var = this.k;
        vw2 vw2Var = gm2Var.a;
        formularize[] formularizeVarArr = gm2.b;
        scarbroite.saneness sanenessVar = (scarbroite.saneness) vw2Var.getValue(gm2Var, formularizeVarArr[0]);
        String userId = sanenessVar != null ? sanenessVar.getUserId() : null;
        gm2 gm2Var2 = this.k;
        scarbroite.saneness sanenessVar2 = (scarbroite.saneness) gm2Var2.a.getValue(gm2Var2, formularizeVarArr[0]);
        String customData = sanenessVar2 != null ? sanenessVar2.getCustomData() : null;
        tc1Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(uris, 10));
        Iterator it = uris.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String strPolder = p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(string, "@gw_rwd_userid@", userId == null ? "" : userId, false, 4, null), "@gw_rwd_custom_data@", customData == null ? "" : customData, false, 4, null), "@gw_tmstmp@", String.valueOf(jElapsedRealtime), false, 4, null);
            String strEncode = Uri.encode(rewardItem.getType());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            arrayList.add(Uri.parse(p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(strPolder, "@gw_rwd_itm@", strEncode, false, 4, null), "@gw_rwd_amt@", String.valueOf(rewardItem.getAmount()), false, 4, null), "@gw_sdkver@", tc1Var.b, false, 4, null)));
        }
        a(this, arrayList);
        return Unit.f29295attabal;
    }

    public static void a(m23 m23Var, List uris) {
        Boolean bool = Boolean.FALSE;
        rg2 rg2Var = m23Var.d;
        rg2Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        qg2.a(rg2Var.c, uris, rg2Var.a, rg2Var.b, null, bool, 32);
    }
}
