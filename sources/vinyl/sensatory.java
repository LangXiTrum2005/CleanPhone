package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvinyl/sensatory;", "Lvinyl/pruinose;", "", "<init>", "()V", "Lbristol/beachfront;", "", "index", "timberyard", "(Lbristol/beachfront;I)Ljava/lang/String;", "nestedName", "milliradian", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "premeiotic", "parentName", "childName", "cultivated", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class sensatory extends pruinose<String> {
    public abstract String cultivated(String parentName, String childName);

    public final String milliradian(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String strOverspeculate = overspeculate();
        if (strOverspeculate == null) {
            strOverspeculate = "";
        }
        return cultivated(strOverspeculate, nestedName);
    }

    public abstract String premeiotic(bristol.beachfront descriptor, int index);

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: timberyard, reason: merged with bridge method [inline-methods] */
    public final String clubfoot(bristol.beachfront beachfrontVar, int i) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        return milliradian(premeiotic(beachfrontVar, i));
    }
}
