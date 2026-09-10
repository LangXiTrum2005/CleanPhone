package androidx.core.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BlendModeCompat {
    public static final /* synthetic */ BlendModeCompat[] X = {new BlendModeCompat("CLEAR", 0), new BlendModeCompat("SRC", 1), new BlendModeCompat("DST", 2), new BlendModeCompat("SRC_OVER", 3), new BlendModeCompat("DST_OVER", 4), new BlendModeCompat("SRC_IN", 5), new BlendModeCompat("DST_IN", 6), new BlendModeCompat("SRC_OUT", 7), new BlendModeCompat("DST_OUT", 8), new BlendModeCompat("SRC_ATOP", 9), new BlendModeCompat("DST_ATOP", 10), new BlendModeCompat("XOR", 11), new BlendModeCompat("PLUS", 12), new BlendModeCompat("MODULATE", 13), new BlendModeCompat("SCREEN", 14), new BlendModeCompat("OVERLAY", 15), new BlendModeCompat("DARKEN", 16), new BlendModeCompat("LIGHTEN", 17), new BlendModeCompat("COLOR_DODGE", 18), new BlendModeCompat("COLOR_BURN", 19), new BlendModeCompat("HARD_LIGHT", 20), new BlendModeCompat("SOFT_LIGHT", 21), new BlendModeCompat("DIFFERENCE", 22), new BlendModeCompat("EXCLUSION", 23), new BlendModeCompat("MULTIPLY", 24), new BlendModeCompat("HUE", 25), new BlendModeCompat("SATURATION", 26), new BlendModeCompat("COLOR", 27), new BlendModeCompat("LUMINOSITY", 28)};

    /* JADX INFO: Fake field, exist only in values array */
    BlendModeCompat EF5;

    public static BlendModeCompat valueOf(String str) {
        return (BlendModeCompat) Enum.valueOf(BlendModeCompat.class, str);
    }

    public static BlendModeCompat[] values() {
        return (BlendModeCompat[]) X.clone();
    }
}
