package complexometry;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import complexometry.triweekly;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcomplexometry/triweekly;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcomplexometry/impassible;", "", "signalType", "adUnitId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class triweekly<T extends triweekly<T>> extends impassible<T> {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final String f24044formularize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public triweekly(String signalType, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        this.f24044formularize = signalType;
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final String getF24044formularize() {
        return this.f24044formularize;
    }
}
