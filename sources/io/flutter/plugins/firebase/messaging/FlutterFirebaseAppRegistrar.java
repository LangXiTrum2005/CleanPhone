package io.flutter.plugins.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tb.a> getComponents() {
        return Collections.singletonList(i.f("flutter-fire-fcm", "16.6.0"));
    }
}
