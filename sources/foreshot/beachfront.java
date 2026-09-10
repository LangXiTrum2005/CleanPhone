package foreshot;

import java.util.List;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: JvmNameResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront extends competently {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final JvmProtoBuf.StringTableTypes f26267impromptu;

    /* JADX WARN: Illegal instructions before constructor call */
    public beachfront(JvmProtoBuf.StringTableTypes types, String[] strings) {
        Set setPrefect;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List<Integer> localNameList = types.getLocalNameList();
        if (localNameList.isEmpty()) {
            setPrefect = creditor.marial();
        } else {
            Intrinsics.beachfront(localNameList);
            setPrefect = CollectionsKt.prefect(localNameList);
        }
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        Intrinsics.checkNotNullExpressionValue(recordList, "getRecordList(...)");
        super(strings, setPrefect, impromptu.attabal(recordList));
        this.f26267impromptu = types;
    }
}
