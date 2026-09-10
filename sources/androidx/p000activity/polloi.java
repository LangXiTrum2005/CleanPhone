package androidx.p000activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\r\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "", "attabal", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "saneness", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Landroidx/activity/stratoscope;", "dern", "Landroidx/activity/stratoscope;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class polloi {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static stratoscope f4494dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f4493attabal = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f4495saneness = Color.argb(128, 27, 27, 27);

    public static final void attabal(ComponentActivity componentActivity, SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1<Resources, Boolean> function1Saneness = statusBarStyle.saneness();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = function1Saneness.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function1Saneness2 = navigationBarStyle.saneness();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = function1Saneness2.invoke(resources2).booleanValue();
        stratoscope gravesideVar = f4494dern;
        if (gravesideVar == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                gravesideVar = new cord();
            } else if (i >= 29) {
                gravesideVar = new preprohormone();
            } else if (i >= 28) {
                gravesideVar = new dovishness();
            } else {
                gravesideVar = i >= 26 ? new graveside() : new molybdenite();
            }
        }
        stratoscope stratoscopeVar = gravesideVar;
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        stratoscopeVar.saneness(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        stratoscopeVar.attabal(window2);
    }

    public static /* synthetic */ void saneness(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.saneness(SystemBarStyle.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.saneness(SystemBarStyle.INSTANCE, f4493attabal, f4495saneness, null, 4, null);
        }
        attabal(componentActivity, systemBarStyle, systemBarStyle2);
    }
}
