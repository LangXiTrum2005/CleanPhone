package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: loaded from: classes7.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(3),
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF26("ALWAYS_PARENTHESIZED", true);

    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f44233Y;

    /* synthetic */ AnnotationArgumentsRenderingPolicy(int i2) {
        this(str, false);
    }

    AnnotationArgumentsRenderingPolicy(String str, boolean z2) {
        this.X = z;
        this.f44233Y = z2;
    }
}
