package minuteness;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p000activity.ComponentActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: PermissionRegister.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lminuteness/impromptu;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "kowloon", "attabal", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class impromptu implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Map<String, competently<String, Boolean>> f33496arytenoidectomy = new LinkedHashMap();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Map<String, competently<String[], Map<String, Boolean>>> f33498monoploid = new LinkedHashMap();

    /* JADX INFO: renamed from: minuteness.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PermissionRegister.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lminuteness/impromptu$attabal;", "", "<init>", "()V", "", "", "Lminuteness/competently;", "", "singlePermissionLauncherMap", "Ljava/util/Map;", "attabal", "()Ljava/util/Map;", "KEY_UNIQUE_ACTIVITY", "Ljava/lang/String;", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, competently<String, Boolean>> attabal() {
            return impromptu.f33496arytenoidectomy;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof ComponentActivity) {
            String str = habitue.attabal.attabal(activity) + nonviolence.saneness.dern("yyyy-MM-dd HH:mm:ss");
            wireman.saneness sanenessVar = (wireman.saneness) activity;
            competently<String, Boolean> competentlyVar = new competently<>(sanenessVar, new marial.dern());
            competently<String[], Map<String, Boolean>> competentlyVar2 = new competently<>(sanenessVar, new marial.saneness());
            ((ComponentActivity) activity).getIntent().putExtra("KEY_UNIQUE_ACTIVITY", str);
            f33496arytenoidectomy.put(str, competentlyVar);
            f33498monoploid.put(str, competentlyVar2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof ComponentActivity) {
            String stringExtra = ((ComponentActivity) activity).getIntent().getStringExtra("KEY_UNIQUE_ACTIVITY");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            Map<String, competently<String, Boolean>> map = f33496arytenoidectomy;
            competently<String, Boolean> competentlyVar = map.get(stringExtra);
            if (competentlyVar != null) {
                competentlyVar.wireman();
            }
            rotuma.wireman(map).remove(stringExtra);
            Map<String, competently<String[], Map<String, Boolean>>> map2 = f33498monoploid;
            competently<String[], Map<String, Boolean>> competentlyVar2 = map2.get(stringExtra);
            if (competentlyVar2 != null) {
                competentlyVar2.wireman();
            }
            rotuma.wireman(map2).remove(stringExtra);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
