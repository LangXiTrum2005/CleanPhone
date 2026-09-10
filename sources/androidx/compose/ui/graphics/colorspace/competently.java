package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010 \u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010)\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010,\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0017\u0010/\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\u0017\u00102\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018R\u0017\u00105\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b3\u0010\u0016\u001a\u0004\b4\u0010\u0018R\u0017\u00108\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u0010\u0018R\u0017\u0010;\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u0018R\u0017\u0010>\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b<\u0010\u0016\u001a\u0004\b=\u0010\u0018R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010G\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001a\u0010I\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010K\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bJ\u0010A\u001a\u0004\b\u001a\u0010CR \u0010P\u001a\b\u0012\u0004\u0012\u00020?0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b\u0013\u0010O¨\u0006Q"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/competently;", "", "<init>", "()V", "", "saneness", "[F", "taiyuan", "()[F", "SrgbPrimaries", "dern", "beachfront", "Ntsc1953Primaries", "Landroidx/compose/ui/graphics/colorspace/rotuma;", "wireman", "Landroidx/compose/ui/graphics/colorspace/rotuma;", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/rotuma;", "SrgbTransferParameters", "marial", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "impromptu", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "competently", "getLinearSrgb", "LinearSrgb", "getExtendedSrgb", "ExtendedSrgb", "getLinearExtendedSrgb", "LinearExtendedSrgb", "cutely", "getBt709", "Bt709", "apical", "getBt2020", "Bt2020", "formularize", "getDciP3", "DciP3", "impassible", "getDisplayP3", "DisplayP3", "triweekly", "getNtsc1953", "Ntsc1953", "kowloon", "getSmpteC", "SmpteC", "arytenoidectomy", "getAdobeRgb", "AdobeRgb", "monoploid", "getProPhotoRgb", "ProPhotoRgb", "polloi", "getAces", "Aces", "molybdenite", "getAcescg", "Acescg", "Landroidx/compose/ui/graphics/colorspace/dern;", "graveside", "Landroidx/compose/ui/graphics/colorspace/dern;", "getCieXyz", "()Landroidx/compose/ui/graphics/colorspace/dern;", "CieXyz", "adultoid", "getCieLab", "CieLab", "dovishness", "Unspecified", "gintrap", "Oklab", "", "rotuma", "[Landroidx/compose/ui/graphics/colorspace/dern;", "()[Landroidx/compose/ui/graphics/colorspace/dern;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public static final dern CieLab;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Bt2020;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Rgb AdobeRgb;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f6507attabal = new competently();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Srgb;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Rgb LinearSrgb;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Bt709;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Unspecified;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public static final Rgb DciP3;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final dern Oklab;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public static final dern CieXyz;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public static final Rgb DisplayP3;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final Rgb ExtendedSrgb;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final Rgb SmpteC;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Acescg;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public static final Rgb ProPhotoRgb;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Aces;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public static final dern[] ColorSpacesArray;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final Rgb LinearExtendedSrgb;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public static final Rgb Ntsc1953;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final TransferParameters SrgbTransferParameters;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        apical apicalVar = apical.f6488attabal;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, apicalVar.marial(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, apicalVar.marial(), 1.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, apicalVar.marial(), null, new cutely() { // from class: androidx.compose.ui.graphics.colorspace.marial
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return competently.dern(d);
            }
        }, new cutely() { // from class: androidx.compose.ui.graphics.colorspace.beachfront
            @Override // androidx.compose.ui.graphics.colorspace.cutely
            public final double attabal(double d) {
                return competently.wireman(d);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, apicalVar.marial(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, apicalVar.marial(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, apicalVar.marial(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, apicalVar.marial(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, apicalVar.attabal(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, apicalVar.marial(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, apicalVar.marial(), 2.2d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, apicalVar.saneness(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0E-4f, -0.077f}, apicalVar.wireman(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, apicalVar.wireman(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        cord cordVar = new cord("Generic XYZ", 14);
        CieXyz = cordVar;
        formularize formularizeVar = new formularize("Generic L*a*b*", 15);
        CieLab = formularizeVar;
        Rgb rgb15 = new Rgb("None", fArr, apicalVar.marial(), transferParameters2, 16);
        Unspecified = rgb15;
        impassible impassibleVar = new impassible("Oklab", 17);
        Oklab = impassibleVar;
        ColorSpacesArray = new dern[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, cordVar, formularizeVar, rgb15, impassibleVar};
    }

    public static final double dern(double d) {
        return wireman.attabal(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double wireman(double d) {
        return wireman.saneness(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final float[] beachfront() {
        return Ntsc1953Primaries;
    }

    public final dern competently() {
        return Oklab;
    }

    public final Rgb cutely() {
        return Unspecified;
    }

    public final Rgb impromptu() {
        return Srgb;
    }

    public final dern[] marial() {
        return ColorSpacesArray;
    }

    public final float[] taiyuan() {
        return SrgbPrimaries;
    }
}
