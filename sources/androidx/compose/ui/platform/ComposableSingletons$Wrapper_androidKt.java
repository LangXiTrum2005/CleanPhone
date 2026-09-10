package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$Wrapper_androidKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ComposableSingletons$Wrapper_androidKt f7277attabal = new ComposableSingletons$Wrapper_androidKt();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Function2<androidx.compose.runtime.taiyuan, Integer, Unit> f7278saneness = cuirassed.wireman.saneness(-1759434350, false, new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar, Integer num) {
            invoke(taiyuanVar, num.intValue());
            return Unit.f29295attabal;
        }

        public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar, int i) {
            if ((i & 3) == 2 && taiyuanVar.saneness()) {
                taiyuanVar.kowloon();
                return;
            }
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.mathsort(-1759434350, i, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
            }
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.peridotite();
            }
        }
    });

    public final Function2<androidx.compose.runtime.taiyuan, Integer, Unit> attabal() {
        return f7278saneness;
    }
}
