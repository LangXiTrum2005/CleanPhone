package androidx.compose.ui.graphics.colorspace;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Illuminant.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0014\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\n\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/apical;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "saneness", "Landroidx/compose/ui/graphics/colorspace/preprohormone;", "getA", "()Landroidx/compose/ui/graphics/colorspace/preprohormone;", "A", "dern", "getB", "B", "wireman", "attabal", "C", "marial", "D50", "beachfront", "getD55", "D55", "competently", "D60", "impromptu", "D65", "taiyuan", "getD75", "D75", "cutely", "getE", "E", "", "apical", "[F", "()[F", "D50Xyz", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final apical f6488attabal = new apical();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    public final WhitePoint attabal() {
        return C;
    }

    public final float[] dern() {
        return D50Xyz;
    }

    public final WhitePoint marial() {
        return D65;
    }

    public final WhitePoint saneness() {
        return D50;
    }

    public final WhitePoint wireman() {
        return D60;
    }
}
