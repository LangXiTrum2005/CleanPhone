package ladefoged;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.splinterproof;

/* JADX INFO: compiled from: TypeAttributeTranslators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<splinterproof> f32572attabal;

    /* JADX WARN: Multi-variable type inference failed */
    public attabal(List<? extends splinterproof> translators) {
        Intrinsics.checkNotNullParameter(translators, "translators");
        this.f32572attabal = translators;
    }

    public final List<splinterproof> attabal() {
        return this.f32572attabal;
    }
}
