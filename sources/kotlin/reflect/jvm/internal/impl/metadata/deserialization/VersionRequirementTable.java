package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes7.dex */
public final class VersionRequirementTable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final VersionRequirementTable f44126b = new VersionRequirementTable(EmptyList.X);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44127a;

    public static final class Companion {
        public static VersionRequirementTable a(ProtoBuf.VersionRequirementTable table) {
            Intrinsics.f(table, "table");
            if (table.f44088Y.size() == 0) {
                return VersionRequirementTable.f44126b;
            }
            List list = table.f44088Y;
            Intrinsics.e(list, "table.requirementList");
            return new VersionRequirementTable(list);
        }
    }

    public VersionRequirementTable(List list) {
        this.f44127a = list;
    }
}
