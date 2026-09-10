package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ParameterNameRenderingPolicy {
    public static final ParameterNameRenderingPolicy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f44272Y;
    public static final ParameterNameRenderingPolicy Z;
    public static final /* synthetic */ ParameterNameRenderingPolicy[] e0;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        X = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        f44272Y = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        Z = parameterNameRenderingPolicy3;
        e0 = new ParameterNameRenderingPolicy[]{parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) e0.clone();
    }
}
