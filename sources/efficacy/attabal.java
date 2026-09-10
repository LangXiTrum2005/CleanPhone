package efficacy;

import android.app.Application;
import habitue.saneness;
import kurbash.formularize;
import minuteness.impromptu;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: ToolsConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR+\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lefficacy/attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "attabal", "(Landroid/app/Application;)V", "", "<set-?>", "dern", "Lhabitue/saneness;", "isInitialized", "()Z", "saneness", "(Z)V", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f25589saneness = {polloi.competently(new MutablePropertyReference1Impl(attabal.class, "isInitialized", "isInitialized()Z", 0))};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f25587attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final saneness isInitialized = new saneness(true);

    public static final void attabal(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        kinshasa.attabal.saneness(application);
        application.registerActivityLifecycleCallbacks(new impromptu());
        f25587attabal.saneness(true);
    }

    public final void saneness(boolean z) {
        isInitialized.setValue(this, f25589saneness[0], Boolean.valueOf(z));
    }
}
