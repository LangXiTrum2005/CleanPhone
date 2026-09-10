package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;

/* JADX INFO: loaded from: classes.dex */
public class px0 {
    public final adultoid a;
    public final boolean b;

    public /* synthetic */ px0(adultoid adultoidVar) {
        this(adultoidVar, false);
    }

    public px0(adultoid initializationTaskProvider, boolean z) {
        Intrinsics.checkNotNullParameter(initializationTaskProvider, "initializationTaskProvider");
        this.a = initializationTaskProvider;
        this.b = z;
    }
}
