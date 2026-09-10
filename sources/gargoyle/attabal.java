package gargoyle;

import ads_mobile_sdk.en0;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.r71;
import ads_mobile_sdk.w71;
import ads_mobile_sdk.z51;
import android.app.Activity;
import com.ironsource.C3700q2;
import complexometry.competently;
import complexometry.wireman;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.subsynchronous;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lgargoyle/attabal;", "Lcomplexometry/attabal;", "Landroid/app/Activity;", "activity", "", C3700q2.v, "(Landroid/app/Activity;)V", "Lgargoyle/saneness;", "getAdEventCallback", "()Lgargoyle/saneness;", "setAdEventCallback", "(Lgargoyle/saneness;)V", "adEventCallback", "saneness", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface attabal extends complexometry.attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f26547attabal;

    /* JADX INFO: renamed from: gargoyle.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgargoyle/attabal$attabal;", "", "Lcomplexometry/competently;", "adRequest", "Lcomplexometry/wireman;", "Lgargoyle/attabal;", "adLoadCallback", "", "attabal", "(Lcomplexometry/competently;Lcomplexometry/wireman;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f26547attabal = new Companion();

        public final void attabal(competently adRequest, wireman<attabal> adLoadCallback) {
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
            w71.d.getClass();
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adLoadCallback, "loadCallback");
            terni.f37333attabal.getClass();
            ((z51) ((i60) ((terni) en0.c.getValue())).p2.get()).a((Function1) new r71(subsynchronous.attabal(adRequest), adLoadCallback, null));
        }
    }

    void setAdEventCallback(saneness sanenessVar);

    void show(Activity activity);
}
