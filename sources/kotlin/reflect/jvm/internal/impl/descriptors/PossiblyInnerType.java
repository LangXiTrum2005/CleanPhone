package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassifierDescriptorWithTypeParameters f43584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PossiblyInnerType f43586c;

    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.f(classifierDescriptor, "classifierDescriptor");
        Intrinsics.f(arguments, "arguments");
        this.f43584a = classifierDescriptor;
        this.f43585b = arguments;
        this.f43586c = possiblyInnerType;
    }
}
