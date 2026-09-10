package kinshasa;

import android.app.Application;
import android.content.Context;
import p002kotlin.Metadata;
import p002kotlin.UninitializedPropertyAccessException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lkinshasa/attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "saneness", "(Landroid/app/Application;)V", "Landroid/content/Context;", "attabal", "()Landroid/content/Context;", "Landroid/app/Application;", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f29288attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static Application application;

    public static final Context attabal() {
        Application application2 = application;
        if (application2 == null) {
            throw new UninitializedPropertyAccessException("应用未初始化，请调用ToolsConfig.init()");
        }
        if (application2 == null) {
            Intrinsics.preprohormone("application");
            application2 = null;
        }
        Context applicationContext = application2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final void saneness(Application application2) {
        Intrinsics.checkNotNullParameter(application2, "application");
        if (application == null) {
            application = application2;
        }
    }
}
