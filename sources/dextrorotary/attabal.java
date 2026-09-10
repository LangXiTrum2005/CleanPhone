package dextrorotary;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: IapHttpUrlConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Ldextrorotary/attabal;", "", "<init>", "()V", "", "path", "attabal", "(Ljava/lang/String;)Ljava/lang/String;", "saneness", "newPurchaseVerify", "", "wireman", "(Ljava/lang/String;)V", "Ljava/lang/String;", "dern", "()Ljava/lang/String;", "setPURCHASE_VERIFY", "PURCHASE_VERIFY", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f25229attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static String PURCHASE_VERIFY = "/pay/gp";

    public final String attabal(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return revolt.attabal.f36720attabal.saneness() + path;
    }

    public final String dern() {
        return PURCHASE_VERIFY;
    }

    public final String saneness(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return revolt.attabal.f36720attabal.wireman() + path;
    }

    public final void wireman(String newPurchaseVerify) {
        Intrinsics.checkNotNullParameter(newPurchaseVerify, "newPurchaseVerify");
        if (StringsKt.overspeculate(newPurchaseVerify, "/pay/gp", false, 2, null)) {
            PURCHASE_VERIFY = newPurchaseVerify;
        }
    }
}
