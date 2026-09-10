package cg;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f6383a = new b();

    public static e c(String name, String str, jk.a builder) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(builder, "builder");
        List list = ((d) builder.invoke()).f6384a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xj.o.V();
                throw null;
            }
            a aVar = (a) obj;
            kotlin.jvm.internal.n.d(aVar, "null cannot be cast to non-null type com.otaliastudios.transcoder.internal.pipeline.Step<kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel, kotlin.Any, com.otaliastudios.transcoder.internal.pipeline.Channel>");
            arrayList.add(new f(aVar, i11 + "/" + list.size() + " '" + aVar.f6380a + "'"));
            i10 = i11;
        }
        if (str == null) {
            str = "";
        }
        return new e(arrayList, wi.d.i(name, "Pipeline", str));
    }
}
