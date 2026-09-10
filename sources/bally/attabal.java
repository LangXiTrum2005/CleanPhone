package bally;

import android.content.Context;
import com.blankj.utilcode.util.impromptu;
import loungewear.IapConfig;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfigHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lbally/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "saneness", "(Landroid/content/Context;)V", "Lloungewear/saneness;", "Lloungewear/saneness;", "attabal", "()Lloungewear/saneness;", "setConfig", "(Lloungewear/saneness;)V", "config", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f14909attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static IapConfig config = new IapConfig(false, false, 3, null);

    public final IapConfig attabal() {
        return config;
    }

    public final void saneness(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objWireman = impromptu.wireman(ampleness.attabal.attabal(context, "iap_config.json"), IapConfig.class);
            Intrinsics.checkNotNullExpressionValue(objWireman, "fromJson(...)");
            config = (IapConfig) objWireman;
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
        }
    }
}
