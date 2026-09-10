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
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.eliminate;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class pn extends SuspendLambda implements Function1 {
    public un a;
    public w03 b;
    public Closeable c;
    public Object d;
    public formularization.attabal e;
    public int f;
    public final /* synthetic */ un g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(un unVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.g = unVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new pn(this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new pn(this.g, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6 A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ca A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ce A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d2 A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d8 A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0 A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e8 A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0238  */
    /* JADX WARN: Code duplicated, block: B:131:0x0240 A[Catch: all -> 0x0268, TryCatch #2 {all -> 0x0268, blocks: (B:129:0x023b, B:131:0x0240, B:135:0x026b), top: B:195:0x023b, outer: #25 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x026a  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bc A[Catch: all -> 0x0029, TryCatch #3 {all -> 0x0029, blocks: (B:7:0x0023, B:153:0x02a9, B:155:0x02bc, B:156:0x02bf, B:167:0x02de, B:168:0x02e1, B:148:0x028e, B:19:0x004a, B:125:0x021f, B:152:0x02a5), top: B:194:0x000c, inners: #24 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02cd A[Catch: all -> 0x02d5, TRY_LEAVE, TryCatch #20 {all -> 0x02d5, blocks: (B:158:0x02c8, B:160:0x02cd), top: B:218:0x02c8 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02ea A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x02f1 A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x02f5 A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02f9 A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x02fd A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0303 A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x030b A[Catch: all -> 0x02fa, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0313 A[Catch: all -> 0x02fa, TRY_LEAVE, TryCatch #9 {all -> 0x02fa, blocks: (B:170:0x02e3, B:172:0x02ea, B:174:0x02f1, B:176:0x02f5, B:178:0x02f9, B:181:0x02fd, B:182:0x0302, B:183:0x0303, B:184:0x030a, B:185:0x030b, B:186:0x0312, B:187:0x0313), top: B:206:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110 A[Catch: all -> 0x0138, TryCatch #8 {all -> 0x0138, blocks: (B:57:0x010b, B:59:0x0110, B:63:0x013b), top: B:204:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:24:0x0061, B:85:0x0183, B:87:0x0196, B:88:0x0199, B:95:0x01b4, B:96:0x01b7, B:80:0x0167, B:36:0x008c, B:48:0x00ee, B:49:0x00f0, B:50:0x00f8, B:51:0x00fa, B:53:0x00fd, B:84:0x017f), top: B:194:0x000c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7 A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #13 {all -> 0x0149, blocks: (B:90:0x01a2, B:92:0x01a7, B:64:0x0144, B:69:0x0152, B:70:0x0155), top: B:194:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01bf A[Catch: all -> 0x01cf, TryCatch #18 {all -> 0x01cf, blocks: (B:97:0x01b8, B:99:0x01bf, B:101:0x01c6, B:103:0x01ca, B:105:0x01ce, B:108:0x01d2, B:109:0x01d7, B:110:0x01d8, B:111:0x01df, B:112:0x01e0, B:113:0x01e7, B:114:0x01e8), top: B:215:0x01b8 }] */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x014b: MOVE (r8 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:332), block:B:66:0x014a */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x014a: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:331), block:B:66:0x014a */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        Closeable closeable2;
        w03 w03Var;
        w03 w03VarA;
        Closeable closeable3;
        w03 w03VarA2;
        w03 w03Var2;
        un unVar;
        Object objC;
        un unVar2;
        un unVar3;
        Object objC2;
        un unVar4;
        w03 w03Var3;
        Closeable closeable4;
        spartacist spartacistVar;
        formularization.attabal attabalVar;
        un unVar5;
        w03 w03Var4;
        spartacist on0Var;
        formularization.attabal attabalVar2;
        Exception exception;
        nn nnVar;
        w03 w03VarA3;
        spartacist spartacistVar2;
        formularization.attabal attabalVar3;
        w03 w03Var5;
        Closeable closeable5;
        formularization.attabal attabalVar4;
        Exception exception2;
        nn nnVar2;
        w03 w03VarA4;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        try {
            try {
                try {
                    switch (this.f) {
                        case 0:
                            p002kotlin.dern.saneness(obj);
                            un unVar6 = this.g;
                            ri2 ri2Var = unVar6.e;
                            no0 no0Var = no0.CUI_NAME_SIGNAL_CACHE_REFRESH;
                            List listFormularize = adultoid.formularize();
                            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                            if (j13.b().a == null) {
                                w03VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                                try {
                                    j13.a().e().t = new wq2(unVar6.a(), (mo0) null, 6);
                                    try {
                                        this.a = unVar6;
                                        this.b = w03VarA;
                                        this.c = w03VarA;
                                        this.f = 1;
                                        objC2 = unVar6.c(this);
                                        if (objC2 != objBeachfront) {
                                            unVar4 = unVar6;
                                            closeable2 = w03VarA;
                                            try {
                                                spartacistVar = (spartacist) objC2;
                                                try {
                                                    attabalVar = unVar4.h;
                                                    this.a = unVar4;
                                                    this.b = w03VarA;
                                                    this.c = closeable2;
                                                    this.d = spartacistVar;
                                                    this.e = attabalVar;
                                                    this.f = 2;
                                                    if (attabalVar.attabal(null, this) != objBeachfront) {
                                                        unVar5 = unVar4;
                                                        w03Var4 = w03VarA;
                                                        closeable4 = closeable2;
                                                        on0Var = spartacistVar;
                                                        try {
                                                            try {
                                                                if (on0Var instanceof tn0) {
                                                                    eliminate eliminateVar = (eliminate) ((tn0) on0Var).b;
                                                                    amphitheatre amphitheatreVar = unVar5.c;
                                                                    p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                                                                    amphitheatreVar.getClass();
                                                                    nnVar = new nn(eliminateVar, amphitheatreVar, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar5.c().a));
                                                                } else {
                                                                    nnVar = null;
                                                                }
                                                                unVar5.i = nnVar;
                                                                unVar5.j = null;
                                                                unVar5.d();
                                                                Unit unit = Unit.f29295attabal;
                                                                attabalVar.wireman(null);
                                                            } catch (Exception e) {
                                                                e = e;
                                                                w03Var3 = w03Var4;
                                                                unVar4 = unVar5;
                                                                closeable2 = closeable4;
                                                                w03VarA = w03Var3;
                                                                unVar3 = unVar4;
                                                                attabalVar2 = unVar3.h;
                                                                this.a = unVar3;
                                                                this.b = w03VarA;
                                                                this.c = closeable2;
                                                                this.d = e;
                                                                this.e = attabalVar2;
                                                                this.f = 3;
                                                                if (attabalVar2.attabal(null, this) != objBeachfront) {
                                                                    exception = e;
                                                                    try {
                                                                        unVar3.j = null;
                                                                        Unit unit2 = Unit.f29295attabal;
                                                                        attabalVar2.wireman(null);
                                                                        Intrinsics.checkNotNullParameter(exception, "exception");
                                                                        w03VarA3 = j13.a();
                                                                        w03VarA3.e().m = false;
                                                                        if (exception != null) {
                                                                            w03VarA3.a(exception);
                                                                        }
                                                                        closeable4 = closeable2;
                                                                        on0Var = new on0(exception, null, null, 6);
                                                                    } catch (Throwable th) {
                                                                        attabalVar2.wireman(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                                return objBeachfront;
                                                            }
                                                            if (on0Var instanceof nn0) {
                                                                y13.a((nn0) on0Var, false);
                                                            }
                                                            interaction.saneness.attabal(closeable4, null);
                                                            return on0Var;
                                                        } catch (Throwable th2) {
                                                            attabalVar.wireman(null);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    unVar3 = unVar4;
                                                    attabalVar2 = unVar3.h;
                                                    this.a = unVar3;
                                                    this.b = w03VarA;
                                                    this.c = closeable2;
                                                    this.d = e;
                                                    this.e = attabalVar2;
                                                    this.f = 3;
                                                    if (attabalVar2.attabal(null, this) != objBeachfront) {
                                                        exception = e;
                                                        unVar3.j = null;
                                                        Unit unit3 = Unit.f29295attabal;
                                                        attabalVar2.wireman(null);
                                                        Intrinsics.checkNotNullParameter(exception, "exception");
                                                        w03VarA3 = j13.a();
                                                        w03VarA3.e().m = false;
                                                        if (exception != null) {
                                                            w03VarA3.a(exception);
                                                        }
                                                        closeable4 = closeable2;
                                                        on0Var = new on0(exception, null, null, 6);
                                                        if (on0Var instanceof nn0) {
                                                            y13.a((nn0) on0Var, false);
                                                        }
                                                        interaction.saneness.attabal(closeable4, null);
                                                        return on0Var;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                w03Var3 = w03VarA;
                                                closeable4 = closeable2;
                                                closeable2 = closeable4;
                                                w03VarA = w03Var3;
                                                unVar3 = unVar4;
                                                attabalVar2 = unVar3.h;
                                                this.a = unVar3;
                                                this.b = w03VarA;
                                                this.c = closeable2;
                                                this.d = e;
                                                this.e = attabalVar2;
                                                this.f = 3;
                                                if (attabalVar2.attabal(null, this) != objBeachfront) {
                                                    exception = e;
                                                    unVar3.j = null;
                                                    Unit unit4 = Unit.f29295attabal;
                                                    attabalVar2.wireman(null);
                                                    Intrinsics.checkNotNullParameter(exception, "exception");
                                                    w03VarA3 = j13.a();
                                                    w03VarA3.e().m = false;
                                                    if (exception != null) {
                                                        w03VarA3.a(exception);
                                                    }
                                                    closeable4 = closeable2;
                                                    on0Var = new on0(exception, null, null, 6);
                                                    if (on0Var instanceof nn0) {
                                                        y13.a((nn0) on0Var, false);
                                                    }
                                                    interaction.saneness.attabal(closeable4, null);
                                                    return on0Var;
                                                }
                                                return objBeachfront;
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        unVar3 = unVar6;
                                        closeable2 = w03VarA;
                                        attabalVar2 = unVar3.h;
                                        this.a = unVar3;
                                        this.b = w03VarA;
                                        this.c = closeable2;
                                        this.d = e;
                                        this.e = attabalVar2;
                                        this.f = 3;
                                        if (attabalVar2.attabal(null, this) != objBeachfront) {
                                            exception = e;
                                            unVar3.j = null;
                                            Unit unit5 = Unit.f29295attabal;
                                            attabalVar2.wireman(null);
                                            Intrinsics.checkNotNullParameter(exception, "exception");
                                            w03VarA3 = j13.a();
                                            w03VarA3.e().m = false;
                                            if (exception != null) {
                                                w03VarA3.a(exception);
                                            }
                                            closeable4 = closeable2;
                                            on0Var = new on0(exception, null, null, 6);
                                            if (on0Var instanceof nn0) {
                                                y13.a((nn0) on0Var, false);
                                            }
                                            interaction.saneness.attabal(closeable4, null);
                                            return on0Var;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    closeable2 = w03VarA;
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
                                    } catch (Throwable th4) {
                                        try {
                                            throw th4;
                                        } catch (Throwable th5) {
                                            interaction.saneness.attabal(closeable2, th4);
                                            throw th5;
                                        }
                                    }
                                }
                            } else {
                                w03VarA2 = j13.a(no0Var, adultoid.formularize(), true);
                                try {
                                    j13.a().e().t = new wq2(unVar6.a(), (mo0) null, 6);
                                    try {
                                        this.a = unVar6;
                                        this.b = w03VarA2;
                                        this.c = w03VarA2;
                                        this.f = 4;
                                        objC = unVar6.c(this);
                                        if (objC != objBeachfront) {
                                            w03Var2 = w03VarA2;
                                            unVar2 = unVar6;
                                            closeable3 = w03Var2;
                                            try {
                                                spartacistVar2 = (spartacist) objC;
                                                attabalVar3 = unVar2.h;
                                                this.a = unVar2;
                                                this.b = w03Var2;
                                                this.c = closeable3;
                                                this.d = spartacistVar2;
                                                this.e = attabalVar3;
                                                this.f = 5;
                                                if (attabalVar3.attabal(null, this) != objBeachfront) {
                                                    w03Var5 = w03Var2;
                                                    closeable5 = closeable3;
                                                    on0Var = spartacistVar2;
                                                    try {
                                                        if (on0Var instanceof tn0) {
                                                            eliminate eliminateVar2 = (eliminate) ((tn0) on0Var).b;
                                                            amphitheatre amphitheatreVar2 = unVar2.c;
                                                            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                                                            amphitheatreVar2.getClass();
                                                            nnVar2 = new nn(eliminateVar2, amphitheatreVar2, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar2.c().a));
                                                        } else {
                                                            nnVar2 = null;
                                                        }
                                                        unVar2.i = nnVar2;
                                                        unVar2.j = null;
                                                        unVar2.d();
                                                        Unit unit6 = Unit.f29295attabal;
                                                        attabalVar3.wireman(null);
                                                        try {
                                                            if (on0Var instanceof nn0) {
                                                                y13.a((nn0) on0Var, false);
                                                                break;
                                                            }
                                                            interaction.saneness.attabal(closeable5, null);
                                                            return on0Var;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            closeable3 = closeable5;
                                                            w03Var2 = w03Var5;
                                                            w03VarA2 = w03Var2;
                                                            try {
                                                                w03VarA2.b(th);
                                                                if (th instanceof evenfall) {
                                                                    throw th;
                                                                }
                                                                w03VarA2.a(th);
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
                                                            } catch (Throwable th7) {
                                                                try {
                                                                    throw th7;
                                                                } catch (Throwable th8) {
                                                                    interaction.saneness.attabal(closeable3, th7);
                                                                    throw th8;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        attabalVar3.wireman(null);
                                                        throw th9;
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                unVar = unVar2;
                                                attabalVar4 = unVar.h;
                                                this.a = unVar;
                                                this.b = w03Var2;
                                                this.c = closeable3;
                                                this.d = e;
                                                this.e = attabalVar4;
                                                this.f = 6;
                                                if (attabalVar4.attabal(null, this) != objBeachfront) {
                                                    exception2 = e;
                                                    try {
                                                        unVar.j = null;
                                                        Unit unit7 = Unit.f29295attabal;
                                                        attabalVar4.wireman(null);
                                                        Intrinsics.checkNotNullParameter(exception2, "exception");
                                                        w03VarA4 = j13.a();
                                                        w03VarA4.e().m = false;
                                                        if (exception2 != null) {
                                                            w03VarA4.a(exception2);
                                                        }
                                                        w03Var5 = w03Var2;
                                                        closeable5 = closeable3;
                                                        on0Var = new on0(exception2, null, null, 6);
                                                        if (on0Var instanceof nn0) {
                                                            y13.a((nn0) on0Var, false);
                                                            break;
                                                        }
                                                        interaction.saneness.attabal(closeable5, null);
                                                        return on0Var;
                                                    } catch (Throwable th10) {
                                                        attabalVar4.wireman(null);
                                                        throw th10;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        w03Var2 = w03VarA2;
                                        unVar = unVar6;
                                        closeable3 = w03Var2;
                                        attabalVar4 = unVar.h;
                                        this.a = unVar;
                                        this.b = w03Var2;
                                        this.c = closeable3;
                                        this.d = e;
                                        this.e = attabalVar4;
                                        this.f = 6;
                                        if (attabalVar4.attabal(null, this) != objBeachfront) {
                                            exception2 = e;
                                            unVar.j = null;
                                            Unit unit8 = Unit.f29295attabal;
                                            attabalVar4.wireman(null);
                                            Intrinsics.checkNotNullParameter(exception2, "exception");
                                            w03VarA4 = j13.a();
                                            w03VarA4.e().m = false;
                                            if (exception2 != null) {
                                                w03VarA4.a(exception2);
                                            }
                                            w03Var5 = w03Var2;
                                            closeable5 = closeable3;
                                            on0Var = new on0(exception2, null, null, 6);
                                            if (on0Var instanceof nn0) {
                                                y13.a((nn0) on0Var, false);
                                                break;
                                            }
                                            interaction.saneness.attabal(closeable5, null);
                                            return on0Var;
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    closeable3 = w03VarA2;
                                    w03VarA2.b(th);
                                    if (th instanceof evenfall) {
                                        throw th;
                                    }
                                    w03VarA2.a(th);
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
                                }
                            }
                            return objBeachfront;
                        case 1:
                            closeable2 = this.c;
                            w03VarA = this.b;
                            unVar3 = this.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                objC2 = obj;
                                unVar4 = unVar3;
                                spartacistVar = (spartacist) objC2;
                                attabalVar = unVar4.h;
                                this.a = unVar4;
                                this.b = w03VarA;
                                this.c = closeable2;
                                this.d = spartacistVar;
                                this.e = attabalVar;
                                this.f = 2;
                                if (attabalVar.attabal(null, this) != objBeachfront) {
                                    unVar5 = unVar4;
                                    w03Var4 = w03VarA;
                                    closeable4 = closeable2;
                                    on0Var = spartacistVar;
                                    if (on0Var instanceof tn0) {
                                        eliminate eliminateVar3 = (eliminate) ((tn0) on0Var).b;
                                        amphitheatre amphitheatreVar3 = unVar5.c;
                                        p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
                                        amphitheatreVar3.getClass();
                                        nnVar = new nn(eliminateVar3, amphitheatreVar3, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar5.c().a));
                                    } else {
                                        nnVar = null;
                                    }
                                    unVar5.i = nnVar;
                                    unVar5.j = null;
                                    unVar5.d();
                                    Unit unit9 = Unit.f29295attabal;
                                    attabalVar.wireman(null);
                                    if (on0Var instanceof nn0) {
                                        y13.a((nn0) on0Var, false);
                                    }
                                    interaction.saneness.attabal(closeable4, null);
                                    return on0Var;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                attabalVar2 = unVar3.h;
                                this.a = unVar3;
                                this.b = w03VarA;
                                this.c = closeable2;
                                this.d = e;
                                this.e = attabalVar2;
                                this.f = 3;
                                if (attabalVar2.attabal(null, this) != objBeachfront) {
                                    exception = e;
                                    unVar3.j = null;
                                    Unit unit10 = Unit.f29295attabal;
                                    attabalVar2.wireman(null);
                                    Intrinsics.checkNotNullParameter(exception, "exception");
                                    w03VarA3 = j13.a();
                                    w03VarA3.e().m = false;
                                    if (exception != null) {
                                        w03VarA3.a(exception);
                                    }
                                    closeable4 = closeable2;
                                    on0Var = new on0(exception, null, null, 6);
                                    if (on0Var instanceof nn0) {
                                        y13.a((nn0) on0Var, false);
                                    }
                                    interaction.saneness.attabal(closeable4, null);
                                    return on0Var;
                                }
                            }
                            return objBeachfront;
                        case 2:
                            formularization.attabal attabalVar5 = this.e;
                            on0Var = (spartacist) this.d;
                            closeable4 = this.c;
                            w03Var3 = this.b;
                            unVar4 = this.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                unVar5 = unVar4;
                                w03Var4 = w03Var3;
                                attabalVar = attabalVar5;
                                if (on0Var instanceof tn0) {
                                    eliminate eliminateVar4 = (eliminate) ((tn0) on0Var).b;
                                    amphitheatre amphitheatreVar4 = unVar5.c;
                                    p002kotlin.time.saneness.Companion companion4 = p002kotlin.time.saneness.INSTANCE;
                                    amphitheatreVar4.getClass();
                                    nnVar = new nn(eliminateVar4, amphitheatreVar4, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar5.c().a));
                                } else {
                                    nnVar = null;
                                }
                                unVar5.i = nnVar;
                                unVar5.j = null;
                                unVar5.d();
                                Unit unit11 = Unit.f29295attabal;
                                attabalVar.wireman(null);
                            } catch (Exception e8) {
                                e = e8;
                                closeable2 = closeable4;
                                w03VarA = w03Var3;
                                unVar3 = unVar4;
                                attabalVar2 = unVar3.h;
                                this.a = unVar3;
                                this.b = w03VarA;
                                this.c = closeable2;
                                this.d = e;
                                this.e = attabalVar2;
                                this.f = 3;
                                if (attabalVar2.attabal(null, this) != objBeachfront) {
                                    exception = e;
                                    unVar3.j = null;
                                    Unit unit12 = Unit.f29295attabal;
                                    attabalVar2.wireman(null);
                                    Intrinsics.checkNotNullParameter(exception, "exception");
                                    w03VarA3 = j13.a();
                                    w03VarA3.e().m = false;
                                    if (exception != null) {
                                        w03VarA3.a(exception);
                                    }
                                    closeable4 = closeable2;
                                    on0Var = new on0(exception, null, null, 6);
                                    if (on0Var instanceof nn0) {
                                        y13.a((nn0) on0Var, false);
                                    }
                                    interaction.saneness.attabal(closeable4, null);
                                    return on0Var;
                                }
                                return objBeachfront;
                            } catch (Throwable th12) {
                                th = th12;
                                closeable2 = closeable4;
                                w03VarA = w03Var3;
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
                            if (on0Var instanceof nn0) {
                                y13.a((nn0) on0Var, false);
                            }
                            interaction.saneness.attabal(closeable4, null);
                            return on0Var;
                        case 3:
                            formularization.attabal attabalVar6 = this.e;
                            exception = (Exception) this.d;
                            closeable2 = this.c;
                            w03VarA = this.b;
                            unVar3 = this.a;
                            p002kotlin.dern.saneness(obj);
                            attabalVar2 = attabalVar6;
                            unVar3.j = null;
                            Unit unit13 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            Intrinsics.checkNotNullParameter(exception, "exception");
                            w03VarA3 = j13.a();
                            w03VarA3.e().m = false;
                            if (exception != null) {
                                w03VarA3.a(exception);
                            }
                            closeable4 = closeable2;
                            on0Var = new on0(exception, null, null, 6);
                            if (on0Var instanceof nn0) {
                                y13.a((nn0) on0Var, false);
                            }
                            interaction.saneness.attabal(closeable4, null);
                            return on0Var;
                        case 4:
                            closeable3 = this.c;
                            w03Var2 = this.b;
                            unVar = this.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                objC = obj;
                                unVar2 = unVar;
                                spartacistVar2 = (spartacist) objC;
                                attabalVar3 = unVar2.h;
                                this.a = unVar2;
                                this.b = w03Var2;
                                this.c = closeable3;
                                this.d = spartacistVar2;
                                this.e = attabalVar3;
                                this.f = 5;
                                if (attabalVar3.attabal(null, this) != objBeachfront) {
                                    w03Var5 = w03Var2;
                                    closeable5 = closeable3;
                                    on0Var = spartacistVar2;
                                    if (on0Var instanceof tn0) {
                                        eliminate eliminateVar5 = (eliminate) ((tn0) on0Var).b;
                                        amphitheatre amphitheatreVar5 = unVar2.c;
                                        p002kotlin.time.saneness.Companion companion5 = p002kotlin.time.saneness.INSTANCE;
                                        amphitheatreVar5.getClass();
                                        nnVar2 = new nn(eliminateVar5, amphitheatreVar5, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar2.c().a));
                                    } else {
                                        nnVar2 = null;
                                    }
                                    unVar2.i = nnVar2;
                                    unVar2.j = null;
                                    unVar2.d();
                                    Unit unit14 = Unit.f29295attabal;
                                    attabalVar3.wireman(null);
                                    if (on0Var instanceof nn0) {
                                        y13.a((nn0) on0Var, false);
                                        break;
                                    }
                                    interaction.saneness.attabal(closeable5, null);
                                    return on0Var;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                attabalVar4 = unVar.h;
                                this.a = unVar;
                                this.b = w03Var2;
                                this.c = closeable3;
                                this.d = e;
                                this.e = attabalVar4;
                                this.f = 6;
                                if (attabalVar4.attabal(null, this) != objBeachfront) {
                                    exception2 = e;
                                    unVar.j = null;
                                    Unit unit15 = Unit.f29295attabal;
                                    attabalVar4.wireman(null);
                                    Intrinsics.checkNotNullParameter(exception2, "exception");
                                    w03VarA4 = j13.a();
                                    w03VarA4.e().m = false;
                                    if (exception2 != null) {
                                        w03VarA4.a(exception2);
                                    }
                                    w03Var5 = w03Var2;
                                    closeable5 = closeable3;
                                    on0Var = new on0(exception2, null, null, 6);
                                    if (on0Var instanceof nn0) {
                                        y13.a((nn0) on0Var, false);
                                        break;
                                    }
                                    interaction.saneness.attabal(closeable5, null);
                                    return on0Var;
                                }
                            }
                            return objBeachfront;
                        case 5:
                            formularization.attabal attabalVar7 = this.e;
                            on0Var = (spartacist) this.d;
                            closeable5 = this.c;
                            w03Var5 = this.b;
                            unVar2 = this.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                attabalVar3 = attabalVar7;
                                if (on0Var instanceof tn0) {
                                    eliminate eliminateVar6 = (eliminate) ((tn0) on0Var).b;
                                    amphitheatre amphitheatreVar6 = unVar2.c;
                                    p002kotlin.time.saneness.Companion companion6 = p002kotlin.time.saneness.INSTANCE;
                                    amphitheatreVar6.getClass();
                                    nnVar2 = new nn(eliminateVar6, amphitheatreVar6, p002kotlin.time.saneness.polder(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), unVar2.c().a));
                                } else {
                                    nnVar2 = null;
                                }
                                unVar2.i = nnVar2;
                                unVar2.j = null;
                                unVar2.d();
                                Unit unit16 = Unit.f29295attabal;
                                attabalVar3.wireman(null);
                            } catch (Exception e10) {
                                e = e10;
                                closeable3 = closeable5;
                                w03Var2 = w03Var5;
                                unVar = unVar2;
                                attabalVar4 = unVar.h;
                                this.a = unVar;
                                this.b = w03Var2;
                                this.c = closeable3;
                                this.d = e;
                                this.e = attabalVar4;
                                this.f = 6;
                                if (attabalVar4.attabal(null, this) != objBeachfront) {
                                    exception2 = e;
                                    unVar.j = null;
                                    Unit unit17 = Unit.f29295attabal;
                                    attabalVar4.wireman(null);
                                    Intrinsics.checkNotNullParameter(exception2, "exception");
                                    w03VarA4 = j13.a();
                                    w03VarA4.e().m = false;
                                    if (exception2 != null) {
                                        w03VarA4.a(exception2);
                                    }
                                    w03Var5 = w03Var2;
                                    closeable5 = closeable3;
                                    on0Var = new on0(exception2, null, null, 6);
                                }
                                return objBeachfront;
                            } catch (Throwable th13) {
                                th = th13;
                                closeable3 = closeable5;
                                w03VarA2 = w03Var5;
                                w03VarA2.b(th);
                                if (th instanceof evenfall) {
                                    throw th;
                                }
                                w03VarA2.a(th);
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
                            }
                            if (on0Var instanceof nn0) {
                                y13.a((nn0) on0Var, false);
                                break;
                            }
                            interaction.saneness.attabal(closeable5, null);
                            return on0Var;
                        case 6:
                            formularization.attabal attabalVar8 = this.e;
                            exception2 = (Exception) this.d;
                            closeable3 = this.c;
                            w03Var2 = this.b;
                            unVar = this.a;
                            p002kotlin.dern.saneness(obj);
                            attabalVar4 = attabalVar8;
                            unVar.j = null;
                            Unit unit18 = Unit.f29295attabal;
                            attabalVar4.wireman(null);
                            Intrinsics.checkNotNullParameter(exception2, "exception");
                            w03VarA4 = j13.a();
                            w03VarA4.e().m = false;
                            if (exception2 != null) {
                                w03VarA4.a(exception2);
                            }
                            w03Var5 = w03Var2;
                            closeable5 = closeable3;
                            on0Var = new on0(exception2, null, null, 6);
                            if (on0Var instanceof nn0) {
                                y13.a((nn0) on0Var, false);
                                break;
                            }
                            interaction.saneness.attabal(closeable5, null);
                            return on0Var;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th14) {
                    th = th14;
                    closeable2 = closeable;
                    w03VarA = w03Var;
                }
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Throwable th16) {
            th = th16;
        }
    }
}
