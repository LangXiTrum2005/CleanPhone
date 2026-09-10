package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.q8.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class LayerParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9911a = JsonReader.Options.a("nm", b.W0, "refId", "ty", "parent", "sw", "sh", com.smartdigimkt.o1.b.I1, "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", b.b1, "w", h.f36614b, "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f9912b = JsonReader.Options.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f9913c = JsonReader.Options.a("ty", "nm");

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.LayerParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9914a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f9914a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9914a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:205:0x03c3 A[PHI: r44
  0x03c3: PHI (r44v21 boolean) = (r44v16 boolean), (r44v17 boolean), (r44v18 boolean), (r44v19 boolean), (r44v22 boolean) binds: [B:219:0x03f6, B:215:0x03e8, B:211:0x03db, B:207:0x03ce, B:204:0x03c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.airbnb.lottie.model.animatable.AnimatableIntegerValue] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.airbnb.lottie.model.animatable.AnimatableIntegerValue] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.airbnb.lottie.model.animatable.AnimatableShapeValue] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.airbnb.lottie.model.animatable.AnimatableShapeValue] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static Layer a(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z2;
        boolean z3;
        ?? r4;
        boolean z4;
        ?? r2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        ?? r15;
        int i2 = 2;
        boolean z5 = true;
        Layer.MatteType matteType = Layer.MatteType.X;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.h();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        String strT = "UNSET";
        long jR = 0;
        boolean z6 = false;
        long jR2 = -1;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        int iC3 = 0;
        boolean zP = false;
        Layer.MatteType matteType2 = matteType;
        float fQ = 1.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        AnimatableTransform animatableTransformA = null;
        String strT2 = null;
        Layer.LayerType layerType = null;
        String strT3 = null;
        BlurEffect blurEffect = null;
        DropShadowEffect dropShadowEffect = null;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValueB = null;
        int iC4 = 0;
        while (jsonReader.m()) {
            switch (jsonReader.J(f9911a)) {
                case 0:
                    z2 = z5;
                    strT = jsonReader.t();
                    z5 = z2;
                    i2 = 2;
                    break;
                case 1:
                    z2 = z5;
                    z3 = z6;
                    jR = jsonReader.r();
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 2:
                    z2 = z5;
                    strT3 = jsonReader.t();
                    z5 = z2;
                    i2 = 2;
                    break;
                case 3:
                    z2 = z5;
                    z3 = z6;
                    int iR = jsonReader.r();
                    layerType = iR < 6 ? Layer.LayerType.values()[iR] : Layer.LayerType.Z;
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 4:
                    z2 = z5;
                    z3 = z6;
                    jR2 = jsonReader.r();
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 5:
                    z2 = z5;
                    z3 = z6;
                    iC2 = (int) (Utils.c() * jsonReader.r());
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 6:
                    z2 = z5;
                    z3 = z6;
                    iC4 = (int) (Utils.c() * jsonReader.r());
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 7:
                    z2 = z5;
                    z3 = z6;
                    color = Color.parseColor(jsonReader.t());
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 8:
                    z2 = z5;
                    z3 = z6;
                    animatableTransformA = AnimatableTransformParser.a(jsonReader, lottieComposition);
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 9:
                    z2 = z5;
                    z3 = z6;
                    int iR2 = jsonReader.r();
                    if (iR2 >= Layer.MatteType.values().length) {
                        lottieComposition.a("Unsupported matte type: " + iR2);
                    } else {
                        matteType2 = Layer.MatteType.values()[iR2];
                        int iOrdinal = matteType2.ordinal();
                        if (iOrdinal == 3) {
                            lottieComposition.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            lottieComposition.a("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.o++;
                    }
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 10:
                    ArrayList arrayList3 = arrayList;
                    Mask.MaskMode maskMode = null;
                    jsonReader.d();
                    while (jsonReader.m()) {
                        jsonReader.h();
                        Mask.MaskMode maskMode2 = maskMode;
                        Mask.MaskMode maskMode3 = maskMode2;
                        ?? C = maskMode3;
                        boolean zP2 = false;
                        ?? animatableShapeValue = maskMode3;
                        while (jsonReader.m()) {
                            String strS = jsonReader.s();
                            strS.getClass();
                            switch (strS.hashCode()) {
                                case 111:
                                    r4 = !strS.equals("o") ? -1 : 0;
                                    break;
                                case 3588:
                                    r4 = !strS.equals("pt") ? -1 : z5;
                                    break;
                                case 104433:
                                    r4 = !strS.equals("inv") ? -1 : 2;
                                    break;
                                case 3357091:
                                    r4 = !strS.equals(d9.a.t) ? -1 : 3;
                                    break;
                                default:
                                    r4 = -1;
                                    break;
                            }
                            switch (r4) {
                                case 0:
                                    z4 = z5;
                                    C = AnimatableValueParser.c(jsonReader, lottieComposition);
                                    break;
                                case 1:
                                    z4 = z5;
                                    animatableShapeValue = new AnimatableShapeValue(KeyframesParser.a(jsonReader, lottieComposition, Utils.c(), ShapeDataParser.f9926a, false));
                                    break;
                                case 2:
                                    z4 = z5;
                                    zP2 = jsonReader.p();
                                    break;
                                case 3:
                                    String strT4 = jsonReader.t();
                                    strT4.getClass();
                                    Mask.MaskMode maskMode4 = Mask.MaskMode.X;
                                    switch (strT4.hashCode()) {
                                        case 97:
                                            z4 = z5;
                                            if (!strT4.equals("a")) {
                                                r2 = -1;
                                            } else {
                                                r2 = 0;
                                            }
                                            break;
                                        case 105:
                                            z4 = z5;
                                            if (!strT4.equals(i.f37957c)) {
                                                r2 = -1;
                                            } else {
                                                r2 = z4;
                                            }
                                            break;
                                        case 110:
                                            z4 = z5;
                                            if (!strT4.equals(dc.q)) {
                                                r2 = -1;
                                            } else {
                                                r2 = 2;
                                            }
                                            break;
                                        case 115:
                                            z4 = z5;
                                            if (!strT4.equals("s")) {
                                                r2 = -1;
                                            } else {
                                                r2 = 3;
                                            }
                                            break;
                                        default:
                                            z4 = z5;
                                            r2 = -1;
                                            break;
                                    }
                                    switch (r2) {
                                        case 0:
                                            maskMode2 = maskMode4;
                                            break;
                                        case 1:
                                            lottieComposition.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode2 = Mask.MaskMode.Z;
                                            break;
                                        case 2:
                                            maskMode2 = Mask.MaskMode.e0;
                                            break;
                                        case 3:
                                            maskMode2 = Mask.MaskMode.f9773Y;
                                            break;
                                        default:
                                            Logger.b("Unknown mask mode " + strS + ". Defaulting to Add.");
                                            maskMode2 = maskMode4;
                                            break;
                                    }
                                    break;
                                default:
                                    jsonReader.P();
                                    z4 = z5;
                                    break;
                            }
                            z5 = z4;
                            animatableShapeValue = animatableShapeValue;
                            C = C;
                        }
                        jsonReader.l();
                        Mask mask = new Mask(maskMode2, animatableShapeValue, C, zP2);
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(mask);
                        arrayList3 = arrayList4;
                        z5 = z5;
                        maskMode = null;
                    }
                    z2 = z5;
                    arrayList = arrayList3;
                    z3 = false;
                    lottieComposition.o += arrayList.size();
                    jsonReader.k();
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 11:
                    ArrayList arrayList5 = arrayList;
                    jsonReader.d();
                    while (jsonReader.m()) {
                        ContentModel contentModelA = ContentModelParser.a(jsonReader, lottieComposition);
                        if (contentModelA != null) {
                            arrayList2.add(contentModelA);
                        }
                    }
                    jsonReader.k();
                    z2 = z5;
                    arrayList = arrayList5;
                    z3 = false;
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
                case 12:
                    ArrayList arrayList6 = arrayList;
                    jsonReader.h();
                    while (jsonReader.m()) {
                        int iJ = jsonReader.J(f9912b);
                        if (iJ == 0) {
                            animatableTextFrame = new AnimatableTextFrame(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, DocumentDataParser.f9884a, false));
                        } else if (iJ != z5) {
                            jsonReader.K();
                            jsonReader.P();
                        } else {
                            jsonReader.d();
                            if (jsonReader.m()) {
                                JsonReader.Options options = AnimatableTextPropertiesParser.f9875a;
                                jsonReader.h();
                                AnimatableTextProperties animatableTextProperties2 = null;
                                while (jsonReader.m()) {
                                    if (jsonReader.J(AnimatableTextPropertiesParser.f9875a) != 0) {
                                        jsonReader.K();
                                        jsonReader.P();
                                    } else {
                                        jsonReader.h();
                                        AnimatableColorValue animatableColorValueA = null;
                                        AnimatableColorValue animatableColorValueA2 = null;
                                        AnimatableFloatValue animatableFloatValueB2 = null;
                                        AnimatableFloatValue animatableFloatValueB3 = null;
                                        while (jsonReader.m()) {
                                            int iJ2 = jsonReader.J(AnimatableTextPropertiesParser.f9876b);
                                            if (iJ2 == 0) {
                                                animatableColorValueA = AnimatableValueParser.a(jsonReader, lottieComposition);
                                            } else if (iJ2 == z5) {
                                                animatableColorValueA2 = AnimatableValueParser.a(jsonReader, lottieComposition);
                                            } else if (iJ2 == i2) {
                                                animatableFloatValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition, z5);
                                            } else if (iJ2 != 3) {
                                                jsonReader.K();
                                                jsonReader.P();
                                            } else {
                                                animatableFloatValueB3 = AnimatableValueParser.b(jsonReader, lottieComposition, z5);
                                            }
                                        }
                                        jsonReader.l();
                                        animatableTextProperties2 = new AnimatableTextProperties(animatableColorValueA, animatableColorValueA2, animatableFloatValueB2, animatableFloatValueB3);
                                    }
                                }
                                jsonReader.l();
                                if (animatableTextProperties2 == null) {
                                    animatableTextProperties2 = new AnimatableTextProperties(null, null, null, null);
                                }
                                animatableTextProperties = animatableTextProperties2;
                            }
                            while (jsonReader.m()) {
                                jsonReader.P();
                            }
                            jsonReader.k();
                        }
                    }
                    jsonReader.l();
                    arrayList = arrayList6;
                    z6 = false;
                    break;
                case 13:
                    ArrayList arrayList7 = arrayList;
                    jsonReader.d();
                    ArrayList arrayList8 = new ArrayList();
                    while (jsonReader.m()) {
                        jsonReader.h();
                        while (jsonReader.m()) {
                            int iJ3 = jsonReader.J(f9913c);
                            if (iJ3 == 0) {
                                int iR3 = jsonReader.r();
                                if (iR3 == 29) {
                                    JsonReader.Options options2 = BlurEffectParser.f9879a;
                                    blurEffect = null;
                                    while (jsonReader.m()) {
                                        if (jsonReader.J(BlurEffectParser.f9879a) != 0) {
                                            jsonReader.K();
                                            jsonReader.P();
                                        } else {
                                            jsonReader.d();
                                            while (jsonReader.m()) {
                                                jsonReader.h();
                                                boolean z7 = z6;
                                                BlurEffect blurEffect2 = null;
                                                while (jsonReader.m()) {
                                                    int iJ4 = jsonReader.J(BlurEffectParser.f9880b);
                                                    if (iJ4 == 0) {
                                                        z7 = jsonReader.r() == 0 ? z5 : z6;
                                                    } else if (iJ4 != z5) {
                                                        jsonReader.K();
                                                        jsonReader.P();
                                                    } else if (z7) {
                                                        blurEffect2 = new BlurEffect(AnimatableValueParser.b(jsonReader, lottieComposition, z5));
                                                    } else {
                                                        jsonReader.P();
                                                    }
                                                }
                                                jsonReader.l();
                                                if (blurEffect2 != null) {
                                                    blurEffect = blurEffect2;
                                                }
                                            }
                                            jsonReader.k();
                                        }
                                    }
                                } else if (iR3 == 25) {
                                    DropShadowEffectParser dropShadowEffectParser = new DropShadowEffectParser();
                                    while (jsonReader.m()) {
                                        if (jsonReader.J(DropShadowEffectParser.f) != 0) {
                                            jsonReader.K();
                                            jsonReader.P();
                                        } else {
                                            jsonReader.d();
                                            while (jsonReader.m()) {
                                                jsonReader.h();
                                                String strT5 = "";
                                                while (jsonReader.m()) {
                                                    int iJ5 = jsonReader.J(DropShadowEffectParser.g);
                                                    if (iJ5 == 0) {
                                                        strT5 = jsonReader.t();
                                                    } else if (iJ5 == z5) {
                                                        strT5.getClass();
                                                        switch (strT5.hashCode()) {
                                                            case 353103893:
                                                                r15 = !strT5.equals("Distance") ? -1 : z6;
                                                                break;
                                                            case 397447147:
                                                                r15 = !strT5.equals("Opacity") ? -1 : z5;
                                                                break;
                                                            case 1041377119:
                                                                r15 = !strT5.equals("Direction") ? -1 : i2;
                                                                break;
                                                            case 1379387491:
                                                                r15 = !strT5.equals("Shadow Color") ? -1 : 3;
                                                                break;
                                                            case 1383710113:
                                                                r15 = !strT5.equals("Softness") ? -1 : 4;
                                                                break;
                                                            default:
                                                                r15 = -1;
                                                                break;
                                                        }
                                                        switch (r15) {
                                                            case 0:
                                                                dropShadowEffectParser.d = AnimatableValueParser.b(jsonReader, lottieComposition, z5);
                                                                break;
                                                            case 1:
                                                                dropShadowEffectParser.f9891b = AnimatableValueParser.b(jsonReader, lottieComposition, z6);
                                                                break;
                                                            case 2:
                                                                dropShadowEffectParser.f9892c = AnimatableValueParser.b(jsonReader, lottieComposition, z6);
                                                                break;
                                                            case 3:
                                                                dropShadowEffectParser.f9890a = AnimatableValueParser.a(jsonReader, lottieComposition);
                                                                break;
                                                            case 4:
                                                                dropShadowEffectParser.f9893e = AnimatableValueParser.b(jsonReader, lottieComposition, z5);
                                                                break;
                                                            default:
                                                                jsonReader.P();
                                                                break;
                                                        }
                                                    } else {
                                                        jsonReader.K();
                                                        jsonReader.P();
                                                    }
                                                }
                                                jsonReader.l();
                                            }
                                            jsonReader.k();
                                        }
                                    }
                                    AnimatableColorValue animatableColorValue = dropShadowEffectParser.f9890a;
                                    dropShadowEffect = (animatableColorValue == null || (animatableFloatValue = dropShadowEffectParser.f9891b) == null || (animatableFloatValue2 = dropShadowEffectParser.f9892c) == null || (animatableFloatValue3 = dropShadowEffectParser.d) == null || (animatableFloatValue4 = dropShadowEffectParser.f9893e) == null) ? null : new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
                                }
                            } else if (iJ3 != z5) {
                                jsonReader.K();
                                jsonReader.P();
                            } else {
                                arrayList8.add(jsonReader.t());
                            }
                            z6 = false;
                        }
                        jsonReader.l();
                        z6 = false;
                    }
                    jsonReader.k();
                    lottieComposition.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList8);
                    arrayList = arrayList7;
                    z6 = false;
                    break;
                case 14:
                    fQ = (float) jsonReader.q();
                    arrayList = arrayList;
                    break;
                case 15:
                    fQ4 = (float) jsonReader.q();
                    arrayList = arrayList;
                    break;
                case 16:
                    iC3 = (int) (Utils.c() * jsonReader.r());
                    arrayList = arrayList;
                    break;
                case 17:
                    iC = (int) (Utils.c() * jsonReader.r());
                    arrayList = arrayList;
                    break;
                case 18:
                    fQ2 = (float) jsonReader.q();
                    arrayList = arrayList;
                    break;
                case 19:
                    fQ3 = (float) jsonReader.q();
                    arrayList = arrayList;
                    break;
                case 20:
                    animatableFloatValueB = AnimatableValueParser.b(jsonReader, lottieComposition, z6);
                    break;
                case 21:
                    strT2 = jsonReader.t();
                    break;
                case 22:
                    zP = jsonReader.p();
                    break;
                default:
                    jsonReader.K();
                    jsonReader.P();
                    z2 = z5;
                    z3 = z6;
                    z6 = z3;
                    z5 = z2;
                    i2 = 2;
                    break;
            }
        }
        jsonReader.l();
        ArrayList arrayList9 = new ArrayList();
        if (fQ2 > 0.0f) {
            arrayList9.add(new Keyframe(lottieComposition, fValueOf2, fValueOf2, (Interpolator) null, 0.0f, Float.valueOf(fQ2)));
        }
        if (fQ3 <= 0.0f) {
            fQ3 = lottieComposition.f9520l;
        }
        arrayList9.add(new Keyframe(lottieComposition, fValueOf, fValueOf, (Interpolator) null, fQ2, Float.valueOf(fQ3)));
        arrayList9.add(new Keyframe(lottieComposition, fValueOf2, fValueOf2, (Interpolator) null, fQ3, Float.valueOf(Float.MAX_VALUE)));
        if (strT.endsWith(".ai") || com.smartdigimkt.o1.b.a3.equals(strT2)) {
            lottieComposition.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, lottieComposition, strT, jR, layerType, jR2, strT3, arrayList, animatableTransformA, iC2, iC4, color, fQ, fQ4, iC3, iC, animatableTextFrame, animatableTextProperties, arrayList9, matteType2, animatableFloatValueB, zP, blurEffect, dropShadowEffect);
    }
}
