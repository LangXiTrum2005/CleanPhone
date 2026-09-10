package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44125a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        Intrinsics.f(typeTable, "typeTable");
        List list = typeTable.Z;
        if ((typeTable.f44081Y & 1) == 1) {
            int i2 = typeTable.e0;
            Intrinsics.e(list, "typeTable.typeList");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            int i3 = 0;
            for (Object obj : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.f0();
                    throw null;
                }
                ProtoBuf.Type typeI = (ProtoBuf.Type) obj;
                if (i3 >= i2) {
                    typeI.getClass();
                    ProtoBuf.Type.Builder builderR = ProtoBuf.Type.r(typeI);
                    builderR.e0 |= 2;
                    builderR.g0 = true;
                    typeI = builderR.i();
                    if (!typeI.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(typeI);
                i3 = i4;
            }
            list = arrayList;
        }
        Intrinsics.e(list, "run {\n        val origin… else originalTypes\n    }");
        this.f44125a = list;
    }

    public final ProtoBuf.Type a(int i2) {
        return (ProtoBuf.Type) this.f44125a.get(i2);
    }
}
