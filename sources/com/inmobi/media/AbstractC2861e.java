package com.inmobi.media;

import com.inmobi.media.AbstractC2861e;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2861e {
    public static final boolean a() {
        return true;
    }

    public static void a(final M0 process, final Eg eg, Long l, final Function0 shouldProcess) {
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(shouldProcess, "shouldProcess");
        taiyuan taiyuanVar = E0.a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Function0 execute = new Function0() { // from class: adsuki.hydrated
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC2861e.a(shouldProcess, process, eg);
            }
        };
        Intrinsics.checkNotNullParameter(execute, "execute");
        saran saranVarAttabal = E0.e;
        if (saranVarAttabal == null) {
            saranVarAttabal = privatdozent.attabal(premeiotic.attabal().plus(sakeen.saneness(null, 1, null)));
            E0.e = saranVarAttabal;
        }
        cutely.wireman(saranVarAttabal, null, null, new D0(jLongValue, execute, null), 3, null);
    }

    public static final Unit a(Function0 function0, M0 m0, Eg eg) {
        try {
            if (((Boolean) function0.invoke()).booleanValue()) {
                Object objA = m0.a();
                if (eg != null) {
                    eg.a(objA);
                }
            } else if (eg != null) {
                eg.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e) {
            if (eg != null) {
                eg.onError(e);
            }
        }
        return Unit.f29295attabal;
    }
}
