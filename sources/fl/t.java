package fl;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f41007a;

    public t(Field member) {
        kotlin.jvm.internal.n.f(member, "member");
        this.f41007a = member;
    }

    @Override // fl.v
    public final Member b() {
        return this.f41007a;
    }
}
