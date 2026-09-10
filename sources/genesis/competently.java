package genesis;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;

/* JADX INFO: compiled from: TypeTable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ProtoBuf$Type> f26668attabal;

    public competently(ProtoBuf$TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf$Type> typeList2 = typeTable.getTypeList();
            Intrinsics.checkNotNullExpressionValue(typeList2, "getTypeList(...)");
            List<ProtoBuf$Type> list = typeList2;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    adultoid.dovishness();
                }
                ProtoBuf$Type protoBuf$TypeTriweekly = (ProtoBuf$Type) obj;
                if (i >= firstNullable) {
                    protoBuf$TypeTriweekly = protoBuf$TypeTriweekly.toBuilder().yemenite(true).build();
                }
                arrayList.add(protoBuf$TypeTriweekly);
                i = i2;
            }
            typeList = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(typeList, "run(...)");
        this.f26668attabal = typeList;
    }

    public final ProtoBuf$Type attabal(int i) {
        return this.f26668attabal.get(i);
    }
}
