package ads_mobile_sdk;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.time.DurationUnit;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class us extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public int c;
    public final /* synthetic */ bt d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(bt btVar, boolean z, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = btVar;
        this.e = z;
        this.f = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new us(this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((us) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0105 A[Catch: all -> 0x00f5, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:43:0x00de, B:45:0x00e5, B:47:0x00ec, B:49:0x00f0, B:51:0x00f4, B:54:0x00f7, B:55:0x00fc, B:56:0x00fd, B:57:0x0104, B:58:0x0105, B:59:0x010c, B:60:0x010d), top: B:101:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0145 A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014c A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0150 A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0154 A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0157 A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[Catch: all -> 0x0155, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x016d A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #2 {all -> 0x0155, blocks: (B:75:0x013e, B:77:0x0145, B:79:0x014c, B:81:0x0150, B:83:0x0154, B:86:0x0157, B:87:0x015c, B:88:0x015d, B:89:0x0164, B:90:0x0165, B:91:0x016c, B:92:0x016d), top: B:102:0x013e }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bt btVar;
        formularization.attabal attabalVar;
        w03 w03Var;
        TimeoutCancellationException th;
        Closeable closeable;
        w03 w03Var2;
        TimeoutCancellationException th2;
        Closeable closeable2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                btVar = this.d;
                attabalVar = btVar.p;
                this.a = attabalVar;
                this.b = btVar;
                this.c = 1;
                if (attabalVar.attabal(null, this) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i != 1) {
                if (i == 2) {
                    closeable2 = (Closeable) this.b;
                    w03Var2 = (w03) this.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        closeable2 = closeable2;
                        w03Var2 = w03Var2;
                        Boolean boolAttabal = igo.attabal.attabal(((Boolean) obj).booleanValue());
                        interaction.saneness.attabal(closeable2, null);
                        return boolAttabal;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            w03Var2.b(th2);
                            if (!(th2 instanceof evenfall)) {
                                throw th2;
                            }
                            w03Var2.a(th2);
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
                                interaction.saneness.attabal(closeable2, th4);
                                throw th5;
                            }
                        }
                    }
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.b;
                w03Var = (w03) this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    closeable = closeable;
                    w03Var = w03Var;
                    Boolean boolAttabal2 = igo.attabal.attabal(((Boolean) obj).booleanValue());
                    interaction.saneness.attabal(closeable, null);
                    return boolAttabal2;
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
                            interaction.saneness.attabal(closeable, th7);
                            throw th8;
                        }
                    }
                }
            }
            btVar = (bt) this.b;
            attabalVar = (formularization.attabal) this.a;
            p002kotlin.dern.saneness(obj);
            if (!bt.a(btVar)) {
                Boolean boolAttabal3 = igo.attabal.attabal(false);
                attabalVar.wireman(null);
                return boolAttabal3;
            }
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            btVar.l.getClass();
            btVar.r = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            btVar.q = true;
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            ri2 ri2Var = this.d.n;
            no0 no0Var = no0.CUI_NAME_SDKINIT_CLD;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            bt btVar2 = this.d;
            boolean z = this.e;
            String str = this.f;
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    this.a = v62VarA;
                    this.b = v62VarA;
                    this.c = 2;
                    Object objA = bt.a(btVar2, z, str, this);
                    if (objA != objBeachfront) {
                        v62 v62Var = v62VarA;
                        obj = objA;
                        w03Var2 = v62Var;
                        closeable2 = v62Var;
                        Boolean boolAttabal4 = igo.attabal.attabal(((Boolean) obj).booleanValue());
                        interaction.saneness.attabal(closeable2, null);
                        return boolAttabal4;
                    }
                } catch (Throwable th9) {
                    w03Var2 = v62VarA;
                    th2 = th9;
                    closeable2 = w03Var2;
                    w03Var2.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        throw th2;
                    }
                    w03Var2.a(th2);
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
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.c = 3;
                    Object objA2 = bt.a(btVar2, z, str, this);
                    if (objA2 != objBeachfront) {
                        w03 w03Var3 = w03VarA;
                        obj = objA2;
                        w03Var = w03Var3;
                        closeable = w03Var3;
                        Boolean boolAttabal5 = igo.attabal.attabal(((Boolean) obj).booleanValue());
                        interaction.saneness.attabal(closeable, null);
                        return boolAttabal5;
                    }
                } catch (Throwable th10) {
                    w03Var = w03VarA;
                    th = th10;
                    closeable = w03Var;
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
        } catch (Throwable th11) {
            attabalVar.wireman(null);
            throw th11;
        }
    }
}
