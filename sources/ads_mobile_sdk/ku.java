package ads_mobile_sdk;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.time.DurationUnit;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ku extends SuspendLambda implements Function1 {
    public Object a;
    public Object b;
    public iv c;
    public int d;
    public final /* synthetic */ iv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(iv ivVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.e = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new ku(this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ku(this.e, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0184 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:16:0x0042, B:27:0x0091, B:29:0x0097), top: B:109:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:36:0x00aa, B:38:0x00b1, B:40:0x00b8, B:42:0x00bc, B:44:0x00c0, B:47:0x00c3, B:48:0x00c8, B:49:0x00c9, B:50:0x00d0, B:51:0x00d1, B:52:0x00d8, B:53:0x00d9), top: B:106:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0104 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #4 {all -> 0x0037, blocks: (B:11:0x0032, B:63:0x00fe, B:65:0x0104), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0163 A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0167 A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x016b A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x016e A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0174 A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017c A[Catch: all -> 0x016c, TryCatch #8 {all -> 0x016c, blocks: (B:84:0x0155, B:86:0x015c, B:88:0x0163, B:90:0x0167, B:92:0x016b, B:95:0x016e, B:96:0x0173, B:97:0x0174, B:98:0x017b, B:99:0x017c, B:100:0x0183, B:101:0x0184), top: B:121:0x0155 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        w03 w03Var;
        Closeable closeable2;
        w03 w03Var2;
        w03 w03Var3;
        Closeable closeable3;
        spartacist spartacistVar;
        w03 w03Var4;
        Closeable closeable4;
        spartacist spartacistVar2;
        formularization.attabal attabalVar;
        iv ivVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            iv ivVar2 = this.e;
            ri2 ri2Var = ivVar2.q;
            no0 no0Var = no0.CUI_NAME_GET_TRUSTLESS_TOKEN;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    x23 x23Var = (x23) ivVar2.s.get();
                    this.a = v62VarA;
                    this.b = v62VarA;
                    this.d = 1;
                    obj = x23Var.a(this);
                    if (obj != objBeachfront) {
                        w03Var2 = v62VarA;
                        closeable3 = v62VarA;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(closeable3, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = v62VarA;
                    w03Var3 = v62VarA;
                    w03Var3.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var3.a(th);
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
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    x23 x23Var2 = (x23) ivVar2.s.get();
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.d = 2;
                    obj = x23Var2.a(this);
                    if (obj != objBeachfront) {
                        w03Var = w03VarA;
                        closeable4 = w03VarA;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(closeable4, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = w03VarA;
                    w03Var4 = w03VarA;
                    w03Var4.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var4.a(th);
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
        if (i == 1) {
            closeable3 = (Closeable) this.b;
            w03Var2 = (w03) this.a;
            try {
                p002kotlin.dern.saneness(obj);
                closeable3 = closeable3;
                w03Var2 = w03Var2;
                spartacistVar = (spartacist) obj;
                if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                interaction.saneness.attabal(closeable3, null);
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable3;
                w03Var3 = w03Var2;
                try {
                    w03Var3.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var3.a(th);
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
                        interaction.saneness.attabal(closeable2, th4);
                        throw th5;
                    }
                }
            }
        } else if (i == 2) {
            closeable4 = (Closeable) this.b;
            w03Var = (w03) this.a;
            try {
                p002kotlin.dern.saneness(obj);
                closeable4 = closeable4;
                w03Var = w03Var;
                spartacistVar = (spartacist) obj;
                if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                interaction.saneness.attabal(closeable4, null);
            } catch (Throwable th6) {
                th = th6;
                closeable = closeable4;
                w03Var4 = w03Var;
                try {
                    w03Var4.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var4.a(th);
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
                        interaction.saneness.attabal(closeable, th7);
                        throw th8;
                    }
                }
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ivVar = this.c;
            attabalVar = (formularization.attabal) this.b;
            spartacistVar2 = (spartacist) this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            ivVar.M = (String) ((tn0) spartacistVar2).b;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            ivVar.p.getClass();
            ivVar.O = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            Unit unit = Unit.f29295attabal;
            return spartacistVar2;
        } finally {
            attabalVar.wireman(null);
        }
        spartacistVar2 = spartacistVar;
        if (!(spartacistVar2 instanceof tn0)) {
            return spartacistVar2;
        }
        iv ivVar3 = this.e;
        attabalVar = ivVar3.L;
        this.a = spartacistVar2;
        this.b = attabalVar;
        this.c = ivVar3;
        this.d = 3;
        if (attabalVar.attabal(null, this) != objBeachfront) {
            ivVar = ivVar3;
            ivVar.M = (String) ((tn0) spartacistVar2).b;
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            ivVar.p.getClass();
            ivVar.O = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            Unit unit2 = Unit.f29295attabal;
            return spartacistVar2;
        }
        return objBeachfront;
    }
}
