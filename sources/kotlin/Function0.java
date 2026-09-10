package kotlin;

import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.cutely;
import complexometry.ResponseInfo;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: bitten.dern, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AdExt.kt */
/* JADX INFO: loaded from: classes3.dex */
@p002kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0006*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\"\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/Function0;", "", "block", "wireman", "(Lkotlin/jvm/functions/Function0;)V", "Lcomplexometry/attabal;", "", "competently", "(Lcomplexometry/attabal;)Ljava/lang/String;", "Lcomplexometry/molybdenite;", "impromptu", "(Lcomplexometry/molybdenite;)Ljava/lang/String;", "Lcomplexometry/taiyuan;", "", "taiyuan", "(Lcomplexometry/taiyuan;)D", "Landroid/os/Handler;", "attabal", "Lpatroclinal/taiyuan;", "beachfront", "()Landroid/os/Handler;", "adMainHandler", "yoadxlib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f15054attabal = p002kotlin.saneness.saneness(new p002kotlin.jvm.functions.Function0() { // from class: bitten.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Function0.dern();
        }
    });

    public static final Handler beachfront() {
        return (Handler) f15054attabal.getValue();
    }

    public static final String competently(complexometry.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        return impromptu(attabalVar.getResponseInfo());
    }

    public static final Handler dern() {
        return new Handler(Looper.getMainLooper());
    }

    public static final String impromptu(ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(responseInfo, "<this>");
        String adapterClassName = responseInfo.getAdapterClassName();
        if (adapterClassName == null) {
            return "";
        }
        switch (adapterClassName.hashCode()) {
            case -1231191543:
                return !adapterClassName.equals("com.google.ads.mediation.facebook.FacebookMediationAdapter") ? "" : "Facebook";
            case -981494273:
                return !adapterClassName.equals("com.google.ads.mediation.admob.AdMobAdapter") ? "" : "Admob";
            case -738944727:
                return !adapterClassName.equals("com.google.ads.mediation.inmobi.InMobiMediationAdapter") ? "" : "Inmobi";
            case -307509335:
                return !adapterClassName.equals("com.google.ads.mediation.vungle.VungleMediationAdapter") ? "" : cutely.OMSDK_PARTNER_NAME;
            case 39996265:
                return !adapterClassName.equals("com.google.ads.mediation.pangle.PangleMediationAdapter") ? "" : "Pangle";
            case 1584661087:
                return !adapterClassName.equals("com.google.ads.mediation.mintegral.MintegralMediationAdapter") ? "" : "Mintegral";
            case 1700600727:
                return !adapterClassName.equals("com.google.ads.mediation.unity.UnityMediationAdapter") ? "" : "Unity ads";
            case 1834901769:
                return !adapterClassName.equals("com.google.ads.mediation.applovin.AppLovinMediationAdapter") ? "" : "Applovin";
            default:
                return "";
        }
    }

    public static final void marial(p002kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
    }

    public static final double taiyuan(complexometry.taiyuan taiyuanVar) {
        Intrinsics.checkNotNullParameter(taiyuanVar, "<this>");
        return taiyuanVar.getValueMicros() / 1000000.0d;
    }

    public static final void wireman(final p002kotlin.jvm.functions.Function0<p002kotlin.Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (Intrinsics.wireman(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            beachfront().post(new Runnable() { // from class: bitten.saneness
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.marial(block);
                }
            });
        }
    }
}
