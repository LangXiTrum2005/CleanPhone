package isoparametric;

import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdClickEventHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lisoparametric/attabal;", "", "<init>", "()V", "", "adScene", "", "saneness", "(Ljava/lang/String;)V", "attabal", "()Ljava/lang/String;", "", "Ljava/util/Set;", "recallScenes", "dern", "Ljava/lang/String;", "recallClickScene", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static volatile String recallClickScene;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f29004attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> recallScenes = creditor.impromptu("ad_scenes_select_language_page", "ad_scenes_guide_page1", "ad_scenes_guide_page2", "ad_scenes_guide_page3");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f29007wireman = 8;

    public final String attabal() {
        String str;
        synchronized (this) {
            str = recallClickScene;
            recallClickScene = null;
        }
        if (str == null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "切后台时没有待处理的召回广告点击");
            return str;
        }
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "消费召回广告点击：entrance=" + str);
        return str;
    }

    public final void saneness(String adScene) {
        Intrinsics.checkNotNullParameter(adScene, "adScene");
        if (recallScenes.contains(adScene)) {
            recallClickScene = adScene;
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "记录召回广告点击：entrance=" + adScene);
        }
    }
}
