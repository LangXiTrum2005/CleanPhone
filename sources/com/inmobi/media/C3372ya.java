package com.inmobi.media;

import com.inmobi.media.C3372ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3372ya {
    public final saran a;
    public final Map b;

    public C3372ya(saran coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(final String id, Function2 block) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        final monroe monroeVarWireman = cutely.wireman(this.a, null, null, new C3347xa(block, null), 3, null);
        Map jobMap = this.b;
        Intrinsics.checkNotNullExpressionValue(jobMap, "jobMap");
        Object objSynchronizedList = jobMap.get(id);
        if (objSynchronizedList == null) {
            objSynchronizedList = Collections.synchronizedList(new ArrayList());
            jobMap.put(id, objSynchronizedList);
        }
        ((List) objSynchronizedList).add(monroeVarWireman);
        monroeVarWireman.restrictive(new Function1() { // from class: adsuki.decantation
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3372ya.a(this.f3399kowloon, id, monroeVarWireman, (Throwable) obj);
            }
        });
    }

    public static final Unit a(C3372ya c3372ya, String str, monroe monroeVar, Throwable th) {
        List list = (List) c3372ya.b.get(str);
        if (list != null) {
            list.remove(monroeVar);
        }
        return Unit.f29295attabal;
    }
}
