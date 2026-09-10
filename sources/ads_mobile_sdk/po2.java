package ads_mobile_sdk;

import android.os.Bundle;
import android.os.SystemClock;
import complexometry.formularize;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import liquory.competently;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.adultoid;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.evenfall;
import saneness.gold;
import saneness.holophone;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class po2 {
    public final saran a;
    public final jk0 b;
    public final amphitheatre c;
    public final ri2 d;
    public final adultoid e;
    public boolean f;
    public final formularization.attabal g;
    public final LinkedHashMap i;
    public final LinkedHashMap j;

    public po2(saran backgroundScope, jk0 flags, amphitheatre clock, ri2 rootTraceCreator, coffeecake signalComponentProvider) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(signalComponentProvider, "signalComponentProvider");
        this.a = backgroundScope;
        this.b = flags;
        this.c = clock;
        this.d = rootTraceCreator;
        this.e = signalComponentProvider;
        this.g = beachfront.saneness(false, 1, null);
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #5 {all -> 0x005c, blocks: (B:25:0x0057, B:49:0x00c2, B:50:0x00c4, B:52:0x00c8, B:30:0x0063, B:41:0x00ac), top: B:133:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:94:0x013f, B:95:0x0141, B:97:0x0145, B:22:0x004e, B:86:0x0129), top: B:133:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [ads_mobile_sdk.po2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.io2, kotlin.coroutines.jvm.internal.ContinuationImpl, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static Object b(po2 po2Var, boolean z, wretchedly.dern dernVar) {
        ?? io2Var;
        ?? r2;
        ?? r3;
        ?? r1;
        ?? r4;
        w03 w03Var;
        w03 w03Var2;
        w03 w03Var3;
        w03 w03Var4;
        w03 w03Var5;
        spartacist spartacistVar;
        w03 w03Var6;
        w03 w03Var7;
        spartacist spartacistVar2;
        w03 w03Var8;
        ?? r5 = z;
        if (dernVar instanceof io2) {
            io2 io2Var2 = (io2) dernVar;
            int i = io2Var2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                io2Var2.e = i - Integer.MIN_VALUE;
                io2Var = io2Var2;
            } else {
                io2Var = new io2(po2Var, dernVar);
            }
        } else {
            io2Var = new io2(po2Var, dernVar);
        }
        Object obj = io2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = io2Var.e;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        w03 w03Var9 = io2Var.b;
                        w03 w03Var10 = io2Var.a;
                        p002kotlin.dern.saneness(obj);
                        w03Var5 = w03Var9;
                        w03Var4 = w03Var10;
                        spartacistVar = (spartacist) obj;
                        r5 = w03Var5;
                        io2Var = w03Var4;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(r5, null);
                        return spartacistVar;
                    }
                    if (i2 == 2) {
                        w03 w03Var11 = io2Var.b;
                        w03 w03Var12 = io2Var.a;
                        p002kotlin.dern.saneness(obj);
                        w03Var6 = w03Var11;
                        w03Var3 = w03Var12;
                        spartacistVar = (spartacist) obj;
                        r5 = w03Var6;
                        io2Var = w03Var3;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(r5, null);
                        return spartacistVar;
                    }
                    if (i2 == 3) {
                        w03 w03Var13 = io2Var.b;
                        w03 w03Var14 = io2Var.a;
                        p002kotlin.dern.saneness(obj);
                        w03Var7 = w03Var13;
                        w03Var2 = w03Var14;
                        spartacistVar2 = (spartacist) obj;
                        r5 = w03Var7;
                        io2Var = w03Var2;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        interaction.saneness.attabal(r5, null);
                        return spartacistVar2;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w03 w03Var15 = io2Var.b;
                    w03 w03Var16 = io2Var.a;
                    p002kotlin.dern.saneness(obj);
                    w03Var8 = w03Var15;
                    w03Var = w03Var16;
                    spartacistVar2 = (spartacist) obj;
                    r5 = w03Var8;
                    io2Var = w03Var;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    interaction.saneness.attabal(r5, null);
                    return spartacistVar2;
                }
                p002kotlin.dern.saneness(obj);
                ri2 ri2Var = po2Var.d;
                no0 no0Var = no0.CUI_NAME_GET_SIGNAL_FROM_CACHE;
                List listFormularize = p002kotlin.collections.adultoid.formularize();
                l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                if (j13.b().a == null) {
                    v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                    try {
                        if (po2Var.f) {
                            io2Var.a = v62VarA;
                            io2Var.b = v62VarA;
                            io2Var.e = 1;
                            Object objB = po2Var.b(r5, io2Var);
                            if (objB != objBeachfront) {
                                v62 v62Var = v62VarA;
                                w03Var4 = v62Var;
                                obj = objB;
                                w03Var5 = v62Var;
                                spartacistVar = (spartacist) obj;
                                r5 = w03Var5;
                                io2Var = w03Var4;
                                if (spartacistVar instanceof nn0) {
                                    y13.a((nn0) spartacistVar, false);
                                }
                                interaction.saneness.attabal(r5, null);
                                return spartacistVar;
                            }
                        } else {
                            io2Var.a = v62VarA;
                            io2Var.b = v62VarA;
                            io2Var.e = 2;
                            Object objA = po2Var.a(r5, io2Var);
                            if (objA != objBeachfront) {
                                v62 v62Var2 = v62VarA;
                                w03Var3 = v62Var2;
                                obj = objA;
                                w03Var6 = v62Var2;
                                spartacistVar = (spartacist) obj;
                                r5 = w03Var6;
                                io2Var = w03Var3;
                                if (spartacistVar instanceof nn0) {
                                    y13.a((nn0) spartacistVar, false);
                                }
                                interaction.saneness.attabal(r5, null);
                                return spartacistVar;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r4 = v62VarA;
                        r3 = v62VarA;
                        try {
                            r3.b(th);
                            if (th instanceof evenfall) {
                                throw th;
                            }
                            r3.a(th);
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
                                interaction.saneness.attabal(r4, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                    try {
                        if (po2Var.f) {
                            io2Var.a = w03VarA;
                            io2Var.b = w03VarA;
                            io2Var.e = 3;
                            Object objB2 = po2Var.b(r5, io2Var);
                            if (objB2 != objBeachfront) {
                                w03 w03Var17 = w03VarA;
                                w03Var2 = w03Var17;
                                obj = objB2;
                                w03Var7 = w03Var17;
                                spartacistVar2 = (spartacist) obj;
                                r5 = w03Var7;
                                io2Var = w03Var2;
                                if (spartacistVar2 instanceof nn0) {
                                    y13.a((nn0) spartacistVar2, false);
                                }
                                interaction.saneness.attabal(r5, null);
                                return spartacistVar2;
                            }
                        } else {
                            io2Var.a = w03VarA;
                            io2Var.b = w03VarA;
                            io2Var.e = 4;
                            Object objA2 = po2Var.a(r5, io2Var);
                            if (objA2 != objBeachfront) {
                                w03 w03Var18 = w03VarA;
                                w03Var = w03Var18;
                                obj = objA2;
                                w03Var8 = w03Var18;
                                spartacistVar2 = (spartacist) obj;
                                r5 = w03Var8;
                                io2Var = w03Var;
                                if (spartacistVar2 instanceof nn0) {
                                    y13.a((nn0) spartacistVar2, false);
                                }
                                interaction.saneness.attabal(r5, null);
                                return spartacistVar2;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r1 = w03VarA;
                        r2 = w03VarA;
                        try {
                            r2.b(th);
                            if (th instanceof evenfall) {
                                throw th;
                            }
                            r2.a(th);
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
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                interaction.saneness.attabal(r1, th5);
                                throw th6;
                            }
                        }
                    }
                }
                return objBeachfront;
            } catch (Throwable th7) {
                th = th7;
                r2 = io2Var;
                r1 = r5;
            }
        } catch (Throwable th8) {
            th = th8;
            r3 = io2Var;
            r4 = r5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("accept_3p_cookie", z);
        competently competentlyVarAdultoid = ((competently.attabal) new competently.attabal("requester_type_6").monoploid(bundle)).adultoid();
        uq2 uq2VarA = ((holophone) this.e.get()).a((formularize) competentlyVarAdultoid).a((adjudge.saneness) competentlyVarAdultoid).c().b().a().a();
        uq2VarA.getClass();
        return uq2.a(uq2VarA, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(boolean z, wretchedly.dern dernVar) throws Throwable {
        jo2 jo2Var;
        gintrap gintrapVarDern;
        formularization.attabal attabalVar;
        boolean z2;
        po2 po2Var;
        if (dernVar instanceof jo2) {
            jo2Var = (jo2) dernVar;
            int i = jo2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jo2Var.g = i - Integer.MIN_VALUE;
            } else {
                jo2Var = new jo2(this, dernVar);
            }
        } else {
            jo2Var = new jo2(this, dernVar);
        }
        Object obj = jo2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jo2Var.g;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                gintrapVarDern = preprohormone.dern(null, 1, null);
                attabalVar = this.g;
                jo2Var.a = this;
                jo2Var.b = gintrapVarDern;
                jo2Var.c = attabalVar;
                z2 = z;
                jo2Var.d = z2;
                jo2Var.g = 1;
                if (attabalVar.attabal(null, jo2Var) != objBeachfront) {
                    po2Var = this;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            boolean z3 = jo2Var.d;
            attabalVar = jo2Var.c;
            gintrapVarDern = jo2Var.b;
            po2Var = jo2Var.a;
            p002kotlin.dern.saneness(obj);
            z2 = z3;
            ho2 ho2Var = (ho2) po2Var.i.get(igo.attabal.attabal(z2));
            if (ho2Var != null) {
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                ho2Var.a.getClass();
                formularization.attabal attabalVar2 = attabalVar;
                try {
                    if (p002kotlin.time.saneness.formularize(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), ho2Var.d) < 0) {
                        o12 o12VarE = j13.a().e();
                        gold builder = ro2.o();
                        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.dern(z2);
                        builder.attabal(true);
                        xm0 xm0VarA = builder.a();
                        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                        o12VarE.B = (ro2) xm0VarA;
                        ho2Var.c.set(true);
                        spartacist spartacistVar = ho2Var.b;
                        attabalVar2.wireman(null);
                        return spartacistVar;
                    }
                    attabalVar = attabalVar2;
                } catch (Throwable th) {
                    th = th;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            o12 o12VarE2 = j13.a().e();
            gold builder2 = ro2.o();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            builder2.dern(z2);
            builder2.attabal(false);
            xm0 xm0VarA2 = builder2.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
            o12VarE2.B = (ro2) xm0VarA2;
            List arrayList = (List) po2Var.j.get(igo.attabal.attabal(z2));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(gintrapVarDern);
            po2Var.j.put(igo.attabal.attabal(z2), arrayList);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            jo2Var.a = null;
            jo2Var.b = null;
            jo2Var.c = null;
            jo2Var.g = 2;
            Object objDent = gintrapVarDern.dent(jo2Var);
            return objDent == objBeachfront ? objBeachfront : objDent;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
