package ads_mobile_sdk;

import acidy.taiyuan;
import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import complexometry.polloi;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.astaticism;
import saneness.evenfall;
import saneness.laky;
import saneness.sclerosis;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 implements undertread, sclerosis, astaticism {
    public final saran a;
    public final l13 b;
    public final ri2 c;
    public complexometry.dern d;
    public polloi e;
    public gargoyle.saneness h;
    public acidy.dern k;
    public taiyuan l;
    public extensimeter.saneness n;
    public final ArrayBlockingQueue p;
    public final AtomicBoolean q;

    public wb0(saran backgroundScope, jk0 flags, l13 traceMetaSet, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.a = backgroundScope;
        this.b = traceMetaSet;
        this.c = rootTraceCreator;
        this.p = new ArrayBlockingQueue(flags.j());
        this.q = new AtomicBoolean(true);
    }

    public final complexometry.dern a() {
        complexometry.dern dernVar;
        synchronized (this) {
            dernVar = this.d;
        }
        return dernVar;
    }

    public final taiyuan b() {
        taiyuan taiyuanVar;
        synchronized (this) {
            taiyuanVar = this.l;
        }
        return taiyuanVar;
    }

    @Override // saneness.undertread
    public final Unit e(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new rb0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit g(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new kb0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object n(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new jb0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit o(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new qb0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object q(wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new mb0(this, null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit a(String str, String str2, wretchedly.dern dernVar) {
        if (!this.q.get()) {
            laky lakyVar = ip0.f;
            cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new sb0(null, this, str, str2), 3, null);
            return Unit.f29295attabal;
        }
        if (!this.p.offer(new Pair(str, str2))) {
            kn0.b("The queue for app events is full, dropping the new event.", null);
            ri2 ri2Var = this.c;
            no0 no0Var = no0.CUI_NAME_UNKNOWN;
            List listFormularize = adultoid.formularize();
            l13 l13Var = this.b;
            if (j13.c() == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    y13.a("App events queue overflow. name: " + str + ", data: " + str2, null, 6);
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(v62VarA, null);
                } catch (Throwable th) {
                    try {
                        v62VarA.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        v62VarA.a(th);
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
                            interaction.saneness.attabal(v62VarA, th2);
                            throw th3;
                        }
                    }
                }
            } else {
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    y13.a("App events queue overflow. name: " + str + ", data: " + str2, null, 6);
                    Unit unit2 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA, null);
                } catch (Throwable th4) {
                    try {
                        w03VarA.b(th4);
                        if (th4 instanceof evenfall) {
                            throw th4;
                        }
                        w03VarA.a(th4);
                        if (th4 instanceof TimeoutCancellationException) {
                            throw new cp0(th4);
                        }
                        if (th4 instanceof CancellationException) {
                            throw new bn0(th4);
                        }
                        if (th4 instanceof yn0) {
                            throw th4;
                        }
                        throw new gn0(th4);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            interaction.saneness.attabal(w03VarA, th5);
                            throw th6;
                        }
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final void a(complexometry.dern dernVar) {
        synchronized (this) {
            this.d = dernVar;
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void a(liquory.dern dernVar) {
        synchronized (this) {
            a((complexometry.dern) dernVar);
            a((polloi) dernVar);
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void a(polloi polloiVar) {
        synchronized (this) {
            this.e = polloiVar;
            Unit unit = Unit.f29295attabal;
        }
        saran saranVar = this.a;
        tb0 block = new tb0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // saneness.undertread
    public final Unit a(String str, wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new ub0(null, this, str), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new lb0(null, this, fullScreenContentError), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Unit a(complexometry.taiyuan taiyuanVar, wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new pb0(null, this, taiyuanVar), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.sclerosis
    public final Unit a(scarbroite.attabal attabalVar, wretchedly.dern dernVar) {
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(dernVar.getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new vb0(null, this, attabalVar), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.astaticism
    public final Object a(Bundle bundle, wretchedly.dern dernVar) {
        Object objMarial = privatdozent.marial(new ob0(this, null), dernVar);
        return objMarial == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }
}
