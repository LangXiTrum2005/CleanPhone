package il;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f43091a = new m();

    public static final d0 a(String internalName, String str, String str2, String str3) {
        ArrayList arrayList = g0.f43077a;
        yl.f fVarE = yl.f.e(str);
        String jvmDescriptor = str + '(' + str2 + ')' + str3;
        kotlin.jvm.internal.n.f(internalName, "internalName");
        kotlin.jvm.internal.n.f(jvmDescriptor, "jvmDescriptor");
        return new d0(fVarE, internalName + '.' + jvmDescriptor);
    }
}
