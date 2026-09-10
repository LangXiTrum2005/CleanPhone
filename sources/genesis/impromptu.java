package genesis;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ProtoBuf$VersionRequirement> f26671attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f26670saneness = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final impromptu f26669dern = new impromptu(adultoid.formularize());

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final impromptu attabal(ProtoBuf$VersionRequirementTable table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.getRequirementCount() == 0) {
                return saneness();
            }
            List<ProtoBuf$VersionRequirement> requirementList = table.getRequirementList();
            Intrinsics.checkNotNullExpressionValue(requirementList, "getRequirementList(...)");
            return new impromptu(requirementList, null);
        }

        public final impromptu saneness() {
            return impromptu.f26669dern;
        }

        public attabal() {
        }
    }

    public /* synthetic */ impromptu(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public impromptu(List<ProtoBuf$VersionRequirement> list) {
        this.f26671attabal = list;
    }
}
