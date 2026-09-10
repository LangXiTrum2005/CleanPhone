package swimathon;

import com.codejoy.boom.clap.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import procaine.dern;

/* JADX INFO: compiled from: AdIdConstants.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lswimathon/attabal;", "", "<init>", "()V", "", "saneness", "Z", "()Z", "setDebug", "(Z)V", "isDebug", "", "dern", "Ljava/lang/String;", "attabal", "()Ljava/lang/String;", "AD_ADMOB_PUB_ID", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f38543attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final String AD_ADMOB_PUB_ID;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static boolean isDebug;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f38546wireman;

    static {
        String string;
        if (isDebug) {
            string = "ca-app-pub-3940256099942544~3347511713";
        } else {
            string = dern.f35986attabal.beachfront().getString(arytenoidectomy.admob_app_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        AD_ADMOB_PUB_ID = string;
        f38546wireman = 8;
    }

    public final String attabal() {
        return AD_ADMOB_PUB_ID;
    }

    public final boolean saneness() {
        return isDebug;
    }
}
