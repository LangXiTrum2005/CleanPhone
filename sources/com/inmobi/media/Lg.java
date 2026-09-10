package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Lg;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.sequences.arytenoidectomy;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Lg extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg(Context context, dern dernVar) {
        super(2, dernVar);
        this.a = context;
    }

    public static final boolean a(String str) {
        Intrinsics.beachfront(str);
        return dovishness.starveling(str, "auto_", false, 2, null);
    }

    public static final boolean b(String str) {
        return Intrinsics.wireman(str, "a_i_dep");
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Lg(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Lg(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            Og og = Og.a;
            Context context = this.a;
            og.getClass();
            if (Og.d == null) {
                Og.d = new C3403zg(context, "pub_signals_store");
            }
            C3403zg c3403zg = null;
            try {
                C3403zg c3403zg2 = Og.d;
                if (c3403zg2 == null) {
                    Intrinsics.preprohormone("prefDao");
                    c3403zg2 = null;
                }
                String strA = c3403zg2.a("saved_signals");
                if (strA != null) {
                    JSONObject jSONObject = new JSONObject(strA);
                    Iterator<String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                    Iterator it = SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.cord(arytenoidectomy.competently(itKeys), new Function1() { // from class: adsuki.pruinose
                        @Override // p002kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    C3403zg c3403zg3 = Og.d;
                    if (c3403zg3 == null) {
                        Intrinsics.preprohormone("prefDao");
                        c3403zg3 = null;
                    }
                    String value = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    c3403zg3.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
                    Intrinsics.checkNotNullParameter(value, "value");
                    c3403zg3.a.a("saved_signals", value, true);
                }
            } catch (Exception e) {
                C3403zg c3403zg4 = Og.d;
                if (c3403zg4 == null) {
                    Intrinsics.preprohormone("prefDao");
                    c3403zg4 = null;
                }
                c3403zg4.getClass();
                Intrinsics.checkNotNullParameter("saved_signals", com.ironsource.X3.i.W);
                c3403zg4.a.a("saved_signals");
                Og.a.getClass();
                Og.e.a();
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                taiyuan taiyuanVar = P9.a;
                P9.a(new L2(e));
            }
            try {
                C3403zg c3403zg5 = Og.d;
                if (c3403zg5 == null) {
                    Intrinsics.preprohormone("prefDao");
                    c3403zg5 = null;
                }
                String strA2 = c3403zg5.a("imp_depth");
                if (strA2 != null) {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
                    Iterator it2 = SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.cord(arytenoidectomy.competently(itKeys2), new Function1() { // from class: adsuki.tarboosh
                        @Override // p002kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Lg.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    C3403zg c3403zg6 = Og.d;
                    if (c3403zg6 == null) {
                        Intrinsics.preprohormone("prefDao");
                        c3403zg6 = null;
                    }
                    String value2 = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
                    c3403zg6.getClass();
                    Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
                    Intrinsics.checkNotNullParameter(value2, "value");
                    Ea ea = c3403zg6.a;
                    ConcurrentHashMap concurrentHashMap = Ea.b;
                    ea.a("imp_depth", value2, false);
                }
            } catch (Exception unused) {
                C3403zg c3403zg7 = Og.d;
                if (c3403zg7 == null) {
                    Intrinsics.preprohormone("prefDao");
                } else {
                    c3403zg = c3403zg7;
                }
                c3403zg.getClass();
                Intrinsics.checkNotNullParameter("imp_depth", com.ironsource.X3.i.W);
                c3403zg.a.a("imp_depth");
            }
            Og.a.getClass();
            I1 i1 = Og.e;
            i1.c = i1.a.invoke();
            I1 i2 = Og.f;
            i2.c = i2.a.invoke();
        } catch (Exception e2) {
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            taiyuan taiyuanVar2 = P9.a;
            AbstractC2973i9.a(e2);
        }
        Og.a.getClass();
        I1 i3 = Og.e;
        i3.c = i3.a.invoke();
        I1 i4 = Og.f;
        i4.c = i4.a.invoke();
        return Unit.f29295attabal;
    }
}
