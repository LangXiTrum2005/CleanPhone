package saneness;

import android.content.res.Configuration;
import androidx.p000activity.ComponentActivity;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface sunback {
    default void a() {
    }

    void a(ComponentActivity componentActivity);

    default void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    void onDestroy();

    default Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar) {
        return Unit.f29295attabal;
    }

    default void b() {
    }

    default void c() {
    }

    default void d() {
    }

    default void e() {
    }

    default void onPause() {
    }

    default void onResume() {
    }
}
