package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently f30269attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final seminary f30270dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<timberyard> f30271saneness;

    /* JADX WARN: Multi-variable type inference failed */
    public seminary(competently classifierDescriptor, List<? extends timberyard> arguments, seminary seminaryVar) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f30269attabal = classifierDescriptor;
        this.f30271saneness = arguments;
        this.f30270dern = seminaryVar;
    }

    public final List<timberyard> attabal() {
        return this.f30271saneness;
    }

    public final seminary dern() {
        return this.f30270dern;
    }

    public final competently saneness() {
        return this.f30269attabal;
    }
}
