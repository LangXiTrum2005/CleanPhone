package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OverrideRenderingPolicy {
    public static final OverrideRenderingPolicy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final OverrideRenderingPolicy f44271Y;
    public static final /* synthetic */ OverrideRenderingPolicy[] Z;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        X = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        f44271Y = overrideRenderingPolicy2;
        Z = new OverrideRenderingPolicy[]{overrideRenderingPolicy, overrideRenderingPolicy2, new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) Z.clone();
    }
}
