package ads_mobile_sdk;

import android.net.Uri;
import com.ironsource.X3;
import java.net.URL;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.evenfall;
import saneness.kaif;
import saneness.laky;
import saneness.loun;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class oh {
    public final rg2 a;
    public final x83 b;
    public final iv c;
    public final kaif d;
    public final jk0 e;
    public final loun f;

    public oh(rg2 urlPinger, x83 webViewInputEventStore, iv consentManager, kaif randomGenerator, jk0 flags, loun traceLogger) {
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = urlPinger;
        this.b = webViewInputEventStore;
        this.c = consentManager;
        this.d = randomGenerator;
        this.e = flags;
        this.f = traceLogger;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #2 {all -> 0x00ae, blocks: (B:30:0x0097, B:32:0x009e, B:34:0x00a5, B:36:0x00a9, B:38:0x00ad, B:41:0x00b0, B:42:0x00b5, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:46:0x00c5, B:47:0x00c6), top: B:56:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Uri uri, wretchedly.dern dernVar) {
        kh khVar;
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        if (dernVar instanceof kh) {
            khVar = (kh) dernVar;
            int i = khVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                khVar.e = i - Integer.MIN_VALUE;
            } else {
                khVar = new kh(this, dernVar);
            }
        } else {
            khVar = new kh(this, dernVar);
        }
        Object obj = khVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = khVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_REGISTER_ATTRIBUTION_SOURCE;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                laky lakyVar = ip0.f;
                jk0 jk0Var = this.e;
                jk0Var.getClass();
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                long jMolybdenite = p002kotlin.time.dern.molybdenite(1, DurationUnit.MINUTES);
                Intrinsics.checkNotNullParameter("gads:source_registration_timeout_in_millis", X3.i.W);
                long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:source_registration_timeout_in_millis", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue();
                lh lhVar = new lh(this, uri, null);
                khVar.a = w03VarA;
                khVar.b = w03VarA;
                khVar.e = 1;
                Object objSaneness = lakyVar.saneness(rawValue, lhVar, khVar);
                if (objSaneness == objBeachfront) {
                    return objBeachfront;
                }
                w03Var = w03VarA;
                obj = objSaneness;
                w03Var2 = w03Var;
            } catch (Throwable th2) {
                w03Var = w03VarA;
                th = th2;
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
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = khVar.b;
            w03Var = khVar.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th3) {
                th = th3;
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
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var2, th4);
                        throw th5;
                    }
                }
            }
        }
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            y13.a((nn0) spartacistVar, false);
        }
        interaction.saneness.attabal(w03Var2, null);
        return spartacistVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Uri uri, wretchedly.dern dernVar) {
        mh mhVar;
        if (dernVar instanceof mh) {
            mhVar = (mh) dernVar;
            int i = mhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhVar.d = i - Integer.MIN_VALUE;
            } else {
                mhVar = new mh(this, dernVar);
            }
        } else {
            mhVar = new mh(this, dernVar);
        }
        Object objA = mhVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mhVar.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:attribution_reporting:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:attribution_reporting:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                mhVar.a = uri;
                mhVar.d = 1;
                objA = a(uri, mhVar);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            }
            return uri;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uri = mhVar.a;
        p002kotlin.dern.saneness(objA);
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof tn0) {
            uri = (Uri) ((tn0) spartacistVar).b;
        }
        Intrinsics.beachfront(uri);
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Uri uri, wretchedly.dern dernVar) {
        nh nhVar;
        oh ohVar;
        if (dernVar instanceof nh) {
            nhVar = (nh) dernVar;
            int i = nhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhVar.e = i - Integer.MIN_VALUE;
            } else {
                nhVar = new nh(this, dernVar);
            }
        } else {
            nhVar = new nh(this, dernVar);
        }
        Object objA = nhVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nhVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:attribution_reporting:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:attribution_reporting:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                nhVar.a = this;
                nhVar.b = uri;
                nhVar.e = 1;
                objA = a(uri, nhVar);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                ohVar = this;
            } else {
                rg2 rg2Var = this.a;
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String string2 = new URL(string).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                rg2.a(rg2Var, Uri.parse(string2));
            }
            return Unit.f29295attabal;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uri = nhVar.b;
        ohVar = nhVar.a;
        p002kotlin.dern.saneness(objA);
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof tn0) {
            rg2 rg2Var2 = ohVar.a;
            String string3 = ((Uri) ((tn0) spartacistVar).b).toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            String string4 = new URL(string3).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            rg2.a(rg2Var2, Uri.parse(string4));
        } else {
            rg2 rg2Var3 = ohVar.a;
            String string5 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            String string6 = new URL(string5).toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            rg2.a(rg2Var3, Uri.parse(string6));
        }
        return Unit.f29295attabal;
    }
}
