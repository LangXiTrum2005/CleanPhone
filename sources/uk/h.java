package uk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Member member, Type type, Class cls, Type[] typeArr, int i10) {
        super(member, type, cls, typeArr);
        this.f52233e = i10;
    }

    @Override // uk.f
    public final Object call(Object[] args) {
        switch (this.f52233e) {
            case 0:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                Constructor constructor = (Constructor) this.f52243a;
                h2.d dVar = new h2.d(2);
                dVar.h(args);
                dVar.f(null);
                ArrayList arrayList = dVar.f42079a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                return ((Constructor) this.f52243a).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
