package ads_mobile_sdk;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.AdError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import complexometry.AdSourceResponseInfo;
import complexometry.MediationAdError;
import complexometry.ResponseInfo;
import formularization.beachfront;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polloi;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.marial;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ve2 {
    public final saran a;
    public final amphitheatre b;
    public final qg2 c;
    public final tc1 d;
    public final marial e;
    public final d6 f;
    public final int g;
    public long h;
    public jm2 i;
    public final formularization.attabal j;
    public ne2[] k;

    public ve2(saran backgroundScope, amphitheatre clock, qg2 retryingUrlPinger, tc1 macroExpander, marial internalAdLoadEventEmitter, d6 adSourceResponseInfoCollector, int i) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        Intrinsics.checkNotNullParameter(macroExpander, "macroExpander");
        Intrinsics.checkNotNullParameter(internalAdLoadEventEmitter, "internalAdLoadEventEmitter");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        this.a = backgroundScope;
        this.b = clock;
        this.c = retryingUrlPinger;
        this.d = macroExpander;
        this.e = internalAdLoadEventEmitter;
        this.f = adSourceResponseInfoCollector;
        this.g = i;
        this.h = p002kotlin.time.saneness.INSTANCE.dern();
        this.j = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(ve2 ve2Var, wretchedly.dern dernVar) {
        oe2 oe2Var;
        formularization.attabal attabalVar;
        ve2Var.getClass();
        if (dernVar instanceof oe2) {
            oe2Var = (oe2) dernVar;
            int i = oe2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oe2Var.e = i - Integer.MIN_VALUE;
            } else {
                oe2Var = new oe2(ve2Var, dernVar);
            }
        } else {
            oe2Var = new oe2(ve2Var, dernVar);
        }
        Object obj = oe2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oe2Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = ve2Var.j;
            oe2Var.a = ve2Var;
            oe2Var.b = attabalVar;
            oe2Var.e = 1;
            if (attabalVar.attabal(null, oe2Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = oe2Var.b;
            ve2 ve2Var2 = oe2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ve2Var = ve2Var2;
        }
        try {
            ne2[] ne2VarArr = ve2Var.k;
            if (ne2VarArr == null) {
                Intrinsics.preprohormone("results");
                ne2VarArr = null;
            }
            return CollectionsKt.preterite(polloi.saran(ne2VarArr), "_", null, null, 0, null, null, 62, null);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:29:0x00b2, B:31:0x00b6, B:34:0x00c0, B:36:0x00c4, B:38:0x00c8, B:40:0x00cc, B:46:0x00d7, B:43:0x00d1), top: B:83:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:29:0x00b2, B:31:0x00b6, B:34:0x00c0, B:36:0x00c4, B:38:0x00c8, B:40:0x00cc, B:46:0x00d7, B:43:0x00d1), top: B:83:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:29:0x00b2, B:31:0x00b6, B:34:0x00c0, B:36:0x00c4, B:38:0x00c8, B:40:0x00cc, B:46:0x00d7, B:43:0x00d1), top: B:83:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[Catch: all -> 0x00bd, LOOP:0: B:35:0x00c2->B:43:0x00d1, LOOP_END, TryCatch #1 {all -> 0x00bd, blocks: (B:29:0x00b2, B:31:0x00b6, B:34:0x00c0, B:36:0x00c4, B:38:0x00c8, B:40:0x00cc, B:46:0x00d7, B:43:0x00d1), top: B:83:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #1 {all -> 0x00bd, blocks: (B:29:0x00b2, B:31:0x00b6, B:34:0x00c0, B:36:0x00c4, B:38:0x00c8, B:40:0x00cc, B:46:0x00d7, B:43:0x00d1), top: B:83:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017a  */
    /* JADX WARN: Code duplicated, block: B:72:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d0 A[SYNTHETIC] */
    public final Object a(wretchedly.dern dernVar) {
        pe2 pe2Var;
        formularization.attabal attabalVar;
        ve2 ve2Var;
        formularization.attabal attabalVar2;
        long j;
        ne2[] ne2VarArr;
        int length;
        int i;
        ne2 ne2Var;
        h1 winningAdConfiguration;
        jm2 jm2Var;
        d6 d6Var;
        long j2;
        ve2 ve2Var2;
        me2 me2Var;
        marial marialVar;
        jm2 jm2Var2;
        ResponseInfo responseInfo;
        h1 h1Var;
        long j3;
        ve2 ve2Var3;
        if (dernVar instanceof pe2) {
            pe2Var = (pe2) dernVar;
            int i2 = pe2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pe2Var.f = i2 - Integer.MIN_VALUE;
            } else {
                pe2Var = new pe2(this, dernVar);
            }
        } else {
            pe2Var = new pe2(this, dernVar);
        }
        Object obj = pe2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = pe2Var.f;
        try {
            if (i3 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.j;
                pe2Var.a = this;
                pe2Var.b = attabalVar;
                pe2Var.f = 1;
                if (attabalVar.attabal(null, pe2Var) != objBeachfront) {
                    ve2Var = this;
                }
                return objBeachfront;
            }
            if (i3 == 1) {
                attabalVar = (formularization.attabal) pe2Var.b;
                ve2 ve2Var4 = pe2Var.a;
                p002kotlin.dern.saneness(obj);
                ve2Var = ve2Var4;
            } else {
                if (i3 == 2) {
                    j = pe2Var.c;
                    attabalVar2 = (formularization.attabal) pe2Var.b;
                    ve2Var = pe2Var.a;
                    p002kotlin.dern.saneness(obj);
                    try {
                        ne2VarArr = ve2Var.k;
                        if (ne2VarArr == null) {
                            Intrinsics.preprohormone("results");
                            ne2VarArr = null;
                        }
                        length = ne2VarArr.length;
                        i = 0;
                        while (true) {
                            if (i >= length) {
                                ne2Var = null;
                                break;
                            }
                            ne2Var = ne2VarArr[i];
                            if (ne2Var != null) {
                                me2Var = ne2Var.b;
                            } else {
                                me2Var = null;
                            }
                            if (me2Var == me2.FILL) {
                                break;
                            }
                            i++;
                        }
                        if (ne2Var != null) {
                            winningAdConfiguration = ne2Var.a;
                        } else {
                            winningAdConfiguration = null;
                        }
                        attabalVar2.wireman(null);
                        if (winningAdConfiguration != null) {
                            d6Var = ve2Var.f;
                            d6Var.getClass();
                            Intrinsics.checkNotNullParameter(winningAdConfiguration, "winningAdConfiguration");
                            if (((AdSourceResponseInfo) d6Var.f.get(winningAdConfiguration.d)) != null) {
                                AdSourceResponseInfo adSourceResponseInfo = (AdSourceResponseInfo) d6Var.f.get(winningAdConfiguration.d);
                                d6Var.d = adSourceResponseInfo;
                                int iIndexOf = d6Var.e.indexOf(adSourceResponseInfo);
                                List adapterResponses = d6Var.e;
                                Intrinsics.checkNotNullExpressionValue(adapterResponses, "adapterResponses");
                                d6Var.e = CollectionsKt.dhss(adapterResponses, new IntRange(0, iIndexOf));
                                d6Var.c = winningAdConfiguration.z0;
                            }
                            pe2Var.a = ve2Var;
                            pe2Var.b = winningAdConfiguration;
                            pe2Var.c = j;
                            pe2Var.f = 3;
                            if (ve2Var.a(j, winningAdConfiguration, pe2Var) != objBeachfront) {
                                j2 = j;
                                ve2Var2 = ve2Var;
                                marialVar = ve2Var2.e;
                                jm2Var2 = ve2Var2.i;
                                if (jm2Var2 == null) {
                                    Intrinsics.preprohormone("serverTransaction");
                                    jm2Var2 = null;
                                }
                                d6 d6Var2 = ve2Var2.f;
                                AdSourceResponseInfo adSourceResponseInfo2 = d6Var2.d;
                                String adapterClassName = adSourceResponseInfo2 != null ? adSourceResponseInfo2.getAdapterClassName() : null;
                                String str = d6Var2.a;
                                Bundle bundleB = d6Var2.b();
                                AdSourceResponseInfo adSourceResponseInfo3 = d6Var2.d;
                                List adapterResponses2 = d6Var2.e;
                                Intrinsics.checkNotNullExpressionValue(adapterResponses2, "adapterResponses");
                                responseInfo = new ResponseInfo(adapterClassName, str, bundleB, adSourceResponseInfo3, adapterResponses2);
                                pe2Var.a = ve2Var2;
                                pe2Var.b = winningAdConfiguration;
                                pe2Var.c = j2;
                                pe2Var.f = 4;
                                if (marialVar.a(jm2Var2, winningAdConfiguration, responseInfo, pe2Var) != objBeachfront) {
                                    h1Var = winningAdConfiguration;
                                    j3 = j2;
                                    ve2Var3 = ve2Var2;
                                }
                            }
                            return objBeachfront;
                        }
                        jm2Var = ve2Var.i;
                        if (jm2Var == null) {
                            Intrinsics.preprohormone("serverTransaction");
                            jm2Var = null;
                        }
                        ve2Var.a(jm2Var.b.b.m, (h1) null, j);
                        return Unit.f29295attabal;
                    } catch (Throwable th) {
                        attabalVar2.wireman(null);
                        throw th;
                    }
                }
                if (i3 == 3) {
                    j2 = pe2Var.c;
                    h1 h1Var2 = (h1) pe2Var.b;
                    ve2Var2 = pe2Var.a;
                    p002kotlin.dern.saneness(obj);
                    winningAdConfiguration = h1Var2;
                    marialVar = ve2Var2.e;
                    jm2Var2 = ve2Var2.i;
                    if (jm2Var2 == null) {
                        Intrinsics.preprohormone("serverTransaction");
                        jm2Var2 = null;
                    }
                    d6 d6Var3 = ve2Var2.f;
                    AdSourceResponseInfo adSourceResponseInfo4 = d6Var3.d;
                    String adapterClassName2 = adSourceResponseInfo4 != null ? adSourceResponseInfo4.getAdapterClassName() : null;
                    String str2 = d6Var3.a;
                    Bundle bundleB2 = d6Var3.b();
                    AdSourceResponseInfo adSourceResponseInfo5 = d6Var3.d;
                    List adapterResponses3 = d6Var3.e;
                    Intrinsics.checkNotNullExpressionValue(adapterResponses3, "adapterResponses");
                    responseInfo = new ResponseInfo(adapterClassName2, str2, bundleB2, adSourceResponseInfo5, adapterResponses3);
                    pe2Var.a = ve2Var2;
                    pe2Var.b = winningAdConfiguration;
                    pe2Var.c = j2;
                    pe2Var.f = 4;
                    if (marialVar.a(jm2Var2, winningAdConfiguration, responseInfo, pe2Var) != objBeachfront) {
                        h1Var = winningAdConfiguration;
                        j3 = j2;
                        ve2Var3 = ve2Var2;
                    }
                    return objBeachfront;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = pe2Var.c;
                h1Var = (h1) pe2Var.b;
                ve2Var3 = pe2Var.a;
                p002kotlin.dern.saneness(obj);
            }
            ve2Var3.a(CollectionsKt.unconsolidated(h1Var.C, h1Var.e), h1Var, j3);
            return Unit.f29295attabal;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            ve2Var.b.getClass();
            long jMerc = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), ve2Var.h);
            attabalVar.wireman(null);
            attabalVar2 = ve2Var.j;
            pe2Var.a = ve2Var;
            pe2Var.b = attabalVar2;
            pe2Var.c = jMerc;
            pe2Var.f = 2;
            if (attabalVar2.attabal(null, pe2Var) != objBeachfront) {
                j = jMerc;
                ne2VarArr = ve2Var.k;
                if (ne2VarArr == null) {
                    Intrinsics.preprohormone("results");
                    ne2VarArr = null;
                }
                length = ne2VarArr.length;
                i = 0;
                while (true) {
                    if (i >= length) {
                        ne2Var = null;
                        break;
                    }
                    ne2Var = ne2VarArr[i];
                    if (ne2Var != null) {
                        me2Var = ne2Var.b;
                    } else {
                        me2Var = null;
                    }
                    if (me2Var == me2.FILL) {
                        break;
                        break;
                    }
                    i++;
                }
                if (ne2Var != null) {
                    winningAdConfiguration = ne2Var.a;
                } else {
                    winningAdConfiguration = null;
                }
                attabalVar2.wireman(null);
                if (winningAdConfiguration != null) {
                    d6Var = ve2Var.f;
                    d6Var.getClass();
                    Intrinsics.checkNotNullParameter(winningAdConfiguration, "winningAdConfiguration");
                    if (((AdSourceResponseInfo) d6Var.f.get(winningAdConfiguration.d)) != null) {
                        AdSourceResponseInfo adSourceResponseInfo6 = (AdSourceResponseInfo) d6Var.f.get(winningAdConfiguration.d);
                        d6Var.d = adSourceResponseInfo6;
                        int iIndexOf2 = d6Var.e.indexOf(adSourceResponseInfo6);
                        List adapterResponses4 = d6Var.e;
                        Intrinsics.checkNotNullExpressionValue(adapterResponses4, "adapterResponses");
                        d6Var.e = CollectionsKt.dhss(adapterResponses4, new IntRange(0, iIndexOf2));
                        d6Var.c = winningAdConfiguration.z0;
                    }
                    pe2Var.a = ve2Var;
                    pe2Var.b = winningAdConfiguration;
                    pe2Var.c = j;
                    pe2Var.f = 3;
                    if (ve2Var.a(j, winningAdConfiguration, pe2Var) != objBeachfront) {
                        j2 = j;
                        ve2Var2 = ve2Var;
                        marialVar = ve2Var2.e;
                        jm2Var2 = ve2Var2.i;
                        if (jm2Var2 == null) {
                            Intrinsics.preprohormone("serverTransaction");
                            jm2Var2 = null;
                        }
                        d6 d6Var4 = ve2Var2.f;
                        AdSourceResponseInfo adSourceResponseInfo7 = d6Var4.d;
                        String adapterClassName3 = adSourceResponseInfo7 != null ? adSourceResponseInfo7.getAdapterClassName() : null;
                        String str3 = d6Var4.a;
                        Bundle bundleB3 = d6Var4.b();
                        AdSourceResponseInfo adSourceResponseInfo8 = d6Var4.d;
                        List adapterResponses5 = d6Var4.e;
                        Intrinsics.checkNotNullExpressionValue(adapterResponses5, "adapterResponses");
                        responseInfo = new ResponseInfo(adapterClassName3, str3, bundleB3, adSourceResponseInfo8, adapterResponses5);
                        pe2Var.a = ve2Var2;
                        pe2Var.b = winningAdConfiguration;
                        pe2Var.c = j2;
                        pe2Var.f = 4;
                        if (marialVar.a(jm2Var2, winningAdConfiguration, responseInfo, pe2Var) != objBeachfront) {
                            h1Var = winningAdConfiguration;
                            j3 = j2;
                            ve2Var3 = ve2Var2;
                            ve2Var3.a(CollectionsKt.unconsolidated(h1Var.C, h1Var.e), h1Var, j3);
                        }
                    }
                } else {
                    jm2Var = ve2Var.i;
                    if (jm2Var == null) {
                        Intrinsics.preprohormone("serverTransaction");
                        jm2Var = null;
                    }
                    ve2Var.a(jm2Var.b.b.m, (h1) null, j);
                }
                return Unit.f29295attabal;
            }
            return objBeachfront;
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jm2 transaction, wretchedly.dern dernVar) {
        qe2 qe2Var;
        formularization.attabal attabalVar;
        ve2 ve2Var;
        if (dernVar instanceof qe2) {
            qe2Var = (qe2) dernVar;
            int i = qe2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe2Var.f = i - Integer.MIN_VALUE;
            } else {
                qe2Var = new qe2(this, dernVar);
            }
        } else {
            qe2Var = new qe2(this, dernVar);
        }
        Object obj = qe2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qe2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            this.i = transaction;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.b.getClass();
            this.h = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            d6 d6Var = this.f;
            d6Var.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            fm2 fm2Var = transaction.b;
            d6Var.b = fm2Var.b;
            h1 h1Var = (h1) CollectionsKt.firstOrNull(fm2Var.a);
            d6Var.a = h1Var != null ? h1Var.c0 : null;
            String replacementKey = transaction.b.b.a;
            if (!StringsKt.empress(replacementKey)) {
                Intrinsics.checkNotNullParameter(replacementKey, "replacementKey");
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                if (d6Var.f.containsKey(replacementKey)) {
                    int iIndexOf = d6Var.e.indexOf((AdSourceResponseInfo) d6Var.f.get(replacementKey));
                    d6Var.e.remove(iIndexOf);
                    d6Var.f.remove(replacementKey);
                    Iterator it = transaction.b.a.iterator();
                    while (it.hasNext()) {
                        d6Var.a((h1) it.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            } else {
                Iterator it2 = transaction.b.a.iterator();
                while (it2.hasNext()) {
                    d6Var.a((h1) it2.next(), d6Var.e.size());
                }
            }
            attabalVar = this.j;
            qe2Var.a = this;
            qe2Var.b = transaction;
            qe2Var.c = attabalVar;
            qe2Var.f = 1;
            if (attabalVar.attabal(null, qe2Var) == objBeachfront) {
                return objBeachfront;
            }
            ve2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = qe2Var.c;
            jm2 jm2Var = qe2Var.b;
            ve2Var = qe2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            transaction = jm2Var;
        }
        try {
            ve2Var.k = new ne2[transaction.b.a.size()];
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final void a(List list, h1 h1Var, long j) {
        saran saranVar = this.a;
        re2 block = new re2(this, list, h1Var, j, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(spartacist spartacistVar, h1 adConfiguration, long j, wretchedly.dern dernVar) {
        se2 se2Var;
        me2 me2Var;
        formularization.attabal attabalVar;
        me2 me2Var2;
        long j2;
        h1 h1Var;
        Integer num;
        ve2 ve2Var;
        MediationAdError mediationAdError;
        ne2[] ne2VarArr;
        spartacist renderResult = spartacistVar;
        if (dernVar instanceof se2) {
            se2Var = (se2) dernVar;
            int i = se2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                se2Var.j = i - Integer.MIN_VALUE;
            } else {
                se2Var = new se2(this, dernVar);
            }
        } else {
            se2Var = new se2(this, dernVar);
        }
        Object obj = se2Var.h;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = se2Var.j;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            d6 d6Var = this.f;
            d6Var.getClass();
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(renderResult, "renderResult");
            boolean z = renderResult instanceof tn0;
            if (z) {
                d6Var.a(adConfiguration, j, null);
            } else if (renderResult instanceof qn0) {
                d6Var.a(adConfiguration, j, ((qn0) renderResult).c);
            } else if (renderResult instanceof nn0) {
                int value = ((nn0) renderResult).a().a().getValue();
                ag0 ag0Var = ag0.b;
                d6Var.a(adConfiguration, j, new MediationAdError(value, "Internal error.", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            }
            if (z) {
                me2Var = me2.FILL;
            } else if (renderResult instanceof un0) {
                me2Var = me2.TIMEOUT;
            } else if (renderResult instanceof on0) {
                if (((on0) renderResult).c instanceof CancellationException) {
                    me2Var = me2.CANCELLED;
                } else {
                    me2Var = me2.EXCEPTION;
                }
            } else if (renderResult instanceof qn0) {
                int iIntValue = ((qn0) renderResult).c.attabal().intValue();
                if (iIntValue == LoadAdError.ErrorCode.NOT_FOUND.getValue()) {
                    me2Var = me2.NOT_FOUND;
                } else {
                    me2Var = iIntValue == LoadAdError.ErrorCode.NO_FILL.getValue() ? me2.NO_FILL : me2.ERROR;
                }
            } else {
                me2Var = me2.ERROR;
            }
            qn0 qn0Var = renderResult instanceof qn0 ? (qn0) renderResult : null;
            Integer numAttabal = (qn0Var == null || (mediationAdError = qn0Var.c) == null) ? null : mediationAdError.attabal();
            attabalVar = this.j;
            se2Var.a = this;
            se2Var.b = renderResult;
            se2Var.c = adConfiguration;
            se2Var.d = me2Var;
            se2Var.e = numAttabal;
            se2Var.f = attabalVar;
            se2Var.g = j;
            se2Var.j = 1;
            if (attabalVar.attabal(null, se2Var) == objBeachfront) {
                return objBeachfront;
            }
            me2Var2 = me2Var;
            j2 = j;
            h1Var = adConfiguration;
            num = numAttabal;
            ve2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = se2Var.g;
            formularization.attabal attabalVar2 = se2Var.f;
            Integer num2 = se2Var.e;
            me2 me2Var3 = se2Var.d;
            h1 h1Var2 = se2Var.c;
            spartacist spartacistVar2 = se2Var.b;
            ve2 ve2Var2 = se2Var.a;
            p002kotlin.dern.saneness(obj);
            ve2Var = ve2Var2;
            j2 = j3;
            h1Var = h1Var2;
            num = num2;
            me2Var2 = me2Var3;
            attabalVar = attabalVar2;
            renderResult = spartacistVar2;
        }
        try {
            ne2[] ne2VarArr2 = ve2Var.k;
            if (ne2VarArr2 == null) {
                Intrinsics.preprohormone("results");
                ne2VarArr = null;
            } else {
                ne2VarArr = ne2VarArr2;
            }
            ne2VarArr[h1Var.w] = new ne2(h1Var, me2Var2, j2, num);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            if (renderResult instanceof nn0) {
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                ve2Var.b.getClass();
                ve2Var.a(h1Var.Q, h1Var, p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), ve2Var.h));
            }
            return unit;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(h1 h1Var, wretchedly.dern dernVar) {
        te2 te2Var;
        ve2 ve2Var;
        h1 h1Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof te2) {
            te2Var = (te2) dernVar;
            int i = te2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                te2Var.f = i - Integer.MIN_VALUE;
            } else {
                te2Var = new te2(this, dernVar);
            }
        } else {
            te2Var = new te2(this, dernVar);
        }
        Object obj = te2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = te2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.j;
            te2Var.a = this;
            te2Var.b = h1Var;
            te2Var.c = attabalVar2;
            te2Var.f = 1;
            if (attabalVar2.attabal(null, te2Var) == objBeachfront) {
                return objBeachfront;
            }
            ve2Var = this;
            h1Var2 = h1Var;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = te2Var.c;
            h1 h1Var3 = te2Var.b;
            ve2Var = te2Var.a;
            p002kotlin.dern.saneness(obj);
            h1Var2 = h1Var3;
        }
        try {
            ne2[] ne2VarArr = ve2Var.k;
            if (ne2VarArr == null) {
                Intrinsics.preprohormone("results");
                ne2VarArr = null;
            }
            int i3 = h1Var2.w;
            me2 me2Var = me2.FILL;
            ne2VarArr[i3] = new ne2(h1Var2, me2.INFLIGHT, p002kotlin.time.saneness.INSTANCE.dern(), null);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, h1 h1Var, wretchedly.dern dernVar) {
        ue2 ue2Var;
        formularization.attabal attabalVar;
        ve2 ve2Var;
        if (dernVar instanceof ue2) {
            ue2Var = (ue2) dernVar;
            int i = ue2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue2Var.g = i - Integer.MIN_VALUE;
            } else {
                ue2Var = new ue2(this, dernVar);
            }
        } else {
            ue2Var = new ue2(this, dernVar);
        }
        Object obj = ue2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ue2Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.j;
            ue2Var.a = this;
            ue2Var.b = h1Var;
            ue2Var.c = attabalVar;
            ue2Var.d = j;
            ue2Var.g = 1;
            if (attabalVar.attabal(null, ue2Var) == objBeachfront) {
                return objBeachfront;
            }
            ve2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ue2Var.d;
            formularization.attabal attabalVar2 = ue2Var.c;
            h1 h1Var2 = ue2Var.b;
            ve2Var = ue2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            h1Var = h1Var2;
        }
        try {
            ne2[] ne2VarArr = ve2Var.k;
            if (ne2VarArr == null) {
                Intrinsics.preprohormone("results");
                ne2VarArr = null;
            }
            int length = ne2VarArr.length;
            for (int i3 = h1Var.w + 1; i3 < length; i3++) {
                ne2[] ne2VarArr2 = ve2Var.k;
                if (ne2VarArr2 == null) {
                    Intrinsics.preprohormone("results");
                    ne2VarArr2 = null;
                }
                ne2 ne2Var = ne2VarArr2[i3];
                if ((ne2Var != null ? ne2Var.b : null) == me2.FILL) {
                    ne2Var.b = me2.RENDERED_BUT_LOST;
                    h1 h1Var3 = ne2Var.a;
                    ve2Var.a(h1Var3.Q, h1Var3, j);
                }
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
