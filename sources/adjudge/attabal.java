package adjudge;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ladjudge/attabal;", "", "", "signalString", "<init>", "(Ljava/lang/String;)V", "attabal", "Ljava/lang/String;", "()Ljava/lang/String;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String signalString;

    public attabal(String signalString) {
        Intrinsics.checkNotNullParameter(signalString, "signalString");
        this.signalString = signalString;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getSignalString() {
        return this.signalString;
    }
}
