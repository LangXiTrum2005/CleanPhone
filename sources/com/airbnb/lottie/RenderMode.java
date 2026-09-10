package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RenderMode {
    public static final RenderMode X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final RenderMode f9557Y;
    public static final RenderMode Z;
    public static final /* synthetic */ RenderMode[] e0;

    /* JADX INFO: renamed from: com.airbnb.lottie.RenderMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9558a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f9558a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9558a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9558a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        X = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        f9557Y = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        Z = renderMode3;
        e0 = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) e0.clone();
    }
}
