package com.inmobi.media;

import com.inmobi.media.AbstractC2836d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2836d {
    public static void a(final Function0 execute) {
        Intrinsics.checkNotNullParameter(execute, "execute");
        taiyuan taiyuanVar = E0.a;
        Function0 execute2 = new Function0() { // from class: adsuki.sentimentalism
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC2836d.b(execute);
            }
        };
        Intrinsics.checkNotNullParameter(execute2, "execute");
        saran saranVarAttabal = E0.f;
        if (saranVarAttabal == null) {
            Intrinsics.checkNotNullParameter("AdQualityComponent-aqBeacon", "name");
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("AdQualityComponent-aqBeacon", false));
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            saranVarAttabal = privatdozent.attabal(preterite.dern(executorServiceNewSingleThreadExecutor).plus(sakeen.saneness(null, 1, null)));
            E0.f = saranVarAttabal;
        }
        cutely.wireman(saranVarAttabal, null, null, new C0(execute2, null), 3, null);
    }

    public static final Unit b(Function0 function0) {
        function0.invoke();
        return Unit.f29295attabal;
    }
}
