package com.airbnb.lottie.parser;

import android.graphics.Path;
import android.support.v4.media.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class ContentModelParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9883a = JsonReader.Options.a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:425:0x0751 A[LOOP:1: B:423:0x074b->B:425:0x0751, LOOP_END] */
    public static ContentModel a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String strT;
        ContentModel circleShape;
        ContentModel gradientFill;
        ContentModel shapeGroup;
        ContentModel contentModelA;
        ShapeTrimPath.Type type;
        boolean zP = false;
        jsonReader.h();
        int iR = 2;
        while (true) {
            if (!jsonReader.m()) {
                strT = null;
                break;
            }
            int iJ = jsonReader.J(f9883a);
            if (iJ == 0) {
                strT = jsonReader.t();
                break;
            }
            if (iJ != 1) {
                jsonReader.K();
                jsonReader.P();
            } else {
                iR = jsonReader.r();
            }
        }
        if (strT == null) {
            return null;
        }
        GradientType gradientType = GradientType.f9769Y;
        GradientType gradientType2 = GradientType.X;
        switch (strT) {
            case "el":
                JsonReader.Options options = CircleShapeParser.f9881a;
                boolean z2 = iR == 3;
                boolean zP2 = false;
                String strT2 = null;
                AnimatableValue animatableValueB = null;
                AnimatablePointValue animatablePointValueD = null;
                while (jsonReader.m()) {
                    int iJ2 = jsonReader.J(CircleShapeParser.f9881a);
                    if (iJ2 == 0) {
                        strT2 = jsonReader.t();
                    } else if (iJ2 == 1) {
                        animatableValueB = AnimatablePathValueParser.b(jsonReader, lottieComposition);
                    } else if (iJ2 == 2) {
                        animatablePointValueD = AnimatableValueParser.d(jsonReader, lottieComposition);
                    } else if (iJ2 == 3) {
                        zP2 = jsonReader.p();
                    } else if (iJ2 != 4) {
                        jsonReader.K();
                        jsonReader.P();
                    } else {
                        z2 = jsonReader.r() == 3;
                    }
                }
                circleShape = new CircleShape(strT2, animatableValueB, animatablePointValueD, z2, zP2);
                contentModelA = circleShape;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "fl":
                JsonReader.Options options2 = ShapeFillParser.f9928a;
                boolean zP3 = false;
                boolean zP4 = false;
                int iR2 = 1;
                String strT3 = null;
                AnimatableColorValue animatableColorValueA = null;
                AnimatableIntegerValue animatableIntegerValueC = null;
                while (jsonReader.m()) {
                    int iJ3 = jsonReader.J(ShapeFillParser.f9928a);
                    if (iJ3 == 0) {
                        strT3 = jsonReader.t();
                    } else if (iJ3 == 1) {
                        animatableColorValueA = AnimatableValueParser.a(jsonReader, lottieComposition);
                    } else if (iJ3 == 2) {
                        animatableIntegerValueC = AnimatableValueParser.c(jsonReader, lottieComposition);
                    } else if (iJ3 == 3) {
                        zP3 = jsonReader.p();
                    } else if (iJ3 == 4) {
                        iR2 = jsonReader.r();
                    } else if (iJ3 != 5) {
                        jsonReader.K();
                        jsonReader.P();
                    } else {
                        zP4 = jsonReader.p();
                    }
                }
                circleShape = new ShapeFill(strT3, zP3, iR2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, animatableColorValueA, animatableIntegerValueC == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueC, zP4);
                contentModelA = circleShape;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "gf":
                JsonReader.Options options3 = GradientFillParser.f9899a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zP5 = false;
                AnimatableIntegerValue animatableIntegerValue = null;
                String strT4 = null;
                GradientType gradientType3 = null;
                AnimatableGradientColorValue animatableGradientColorValue = null;
                AnimatablePointValue animatablePointValueD2 = null;
                AnimatablePointValue animatablePointValueD3 = null;
                while (jsonReader.m()) {
                    switch (jsonReader.J(GradientFillParser.f9899a)) {
                        case 0:
                            strT4 = jsonReader.t();
                            break;
                        case 1:
                            jsonReader.h();
                            int iR3 = -1;
                            while (jsonReader.m()) {
                                int iJ4 = jsonReader.J(GradientFillParser.f9900b);
                                if (iJ4 == 0) {
                                    iR3 = jsonReader.r();
                                } else if (iJ4 != 1) {
                                    jsonReader.K();
                                    jsonReader.P();
                                } else {
                                    GradientColorParser gradientColorParser = new GradientColorParser();
                                    gradientColorParser.f9898a = iR3;
                                    animatableGradientColorValue = new AnimatableGradientColorValue(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, gradientColorParser, false));
                                }
                            }
                            jsonReader.l();
                            break;
                        case 2:
                            animatableIntegerValue = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType3 = jsonReader.r() != 1 ? gradientType : gradientType2;
                            break;
                        case 4:
                            animatablePointValueD2 = AnimatableValueParser.d(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueD3 = AnimatableValueParser.d(jsonReader, lottieComposition);
                            break;
                        case 6:
                            fillType = jsonReader.r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zP5 = jsonReader.p();
                            break;
                        default:
                            jsonReader.K();
                            jsonReader.P();
                            break;
                    }
                }
                if (animatableIntegerValue == null) {
                    animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                gradientFill = new GradientFill(strT4, gradientType3, fillType, animatableGradientColorValue, animatableIntegerValue, animatablePointValueD2, animatablePointValueD3, zP5);
                contentModelA = gradientFill;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "gr":
                JsonReader.Options options4 = ShapeGroupParser.f9929a;
                ArrayList arrayList = new ArrayList();
                String strT5 = null;
                while (jsonReader.m()) {
                    int iJ5 = jsonReader.J(ShapeGroupParser.f9929a);
                    if (iJ5 == 0) {
                        strT5 = jsonReader.t();
                    } else if (iJ5 == 1) {
                        zP = jsonReader.p();
                    } else if (iJ5 != 2) {
                        jsonReader.P();
                    } else {
                        jsonReader.d();
                        while (jsonReader.m()) {
                            ContentModel contentModelA2 = a(jsonReader, lottieComposition);
                            if (contentModelA2 != null) {
                                arrayList.add(contentModelA2);
                            }
                        }
                        jsonReader.k();
                    }
                }
                shapeGroup = new ShapeGroup(strT5, arrayList, zP);
                contentModelA = shapeGroup;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "gs":
                JsonReader.Options options5 = GradientStrokeParser.f9901a;
                ArrayList arrayList2 = new ArrayList();
                boolean zP6 = false;
                float fQ = 0.0f;
                AnimatableIntegerValue animatableIntegerValue2 = null;
                String strT6 = null;
                GradientType gradientType4 = null;
                AnimatableGradientColorValue animatableGradientColorValue2 = null;
                AnimatablePointValue animatablePointValueD4 = null;
                AnimatablePointValue animatablePointValueD5 = null;
                AnimatableFloatValue animatableFloatValueB = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                AnimatableFloatValue animatableFloatValue = null;
                while (jsonReader.m()) {
                    switch (jsonReader.J(GradientStrokeParser.f9901a)) {
                        case 0:
                            strT6 = jsonReader.t();
                            break;
                        case 1:
                            jsonReader.h();
                            int iR4 = -1;
                            while (jsonReader.m()) {
                                int iJ6 = jsonReader.J(GradientStrokeParser.f9902b);
                                if (iJ6 == 0) {
                                    iR4 = jsonReader.r();
                                } else if (iJ6 != 1) {
                                    jsonReader.K();
                                    jsonReader.P();
                                } else {
                                    GradientColorParser gradientColorParser2 = new GradientColorParser();
                                    gradientColorParser2.f9898a = iR4;
                                    animatableGradientColorValue2 = new AnimatableGradientColorValue(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, gradientColorParser2, false));
                                }
                            }
                            jsonReader.l();
                            break;
                        case 2:
                            animatableIntegerValue2 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType4 = jsonReader.r() != 1 ? gradientType : gradientType2;
                            break;
                        case 4:
                            animatablePointValueD4 = AnimatableValueParser.d(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueD5 = AnimatableValueParser.d(jsonReader, lottieComposition);
                            break;
                        case 6:
                            animatableFloatValueB = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[jsonReader.r() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.r() - 1];
                            break;
                        case 9:
                            fQ = (float) jsonReader.q();
                            break;
                        case 10:
                            zP6 = jsonReader.p();
                            break;
                        case 11:
                            jsonReader.d();
                            while (jsonReader.m()) {
                                jsonReader.h();
                                String strT7 = null;
                                AnimatableFloatValue animatableFloatValueB2 = null;
                                while (jsonReader.m()) {
                                    int iJ7 = jsonReader.J(GradientStrokeParser.f9903c);
                                    if (iJ7 == 0) {
                                        strT7 = jsonReader.t();
                                    } else if (iJ7 != 1) {
                                        jsonReader.K();
                                        jsonReader.P();
                                    } else {
                                        animatableFloatValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                                    }
                                }
                                jsonReader.l();
                                if (strT7.equals("o")) {
                                    animatableFloatValue = animatableFloatValueB2;
                                } else if (strT7.equals("d") || strT7.equals(g.f40227p)) {
                                    lottieComposition.f9521n = true;
                                    arrayList2.add(animatableFloatValueB2);
                                }
                            }
                            jsonReader.k();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((AnimatableFloatValue) arrayList2.get(0));
                            }
                            break;
                        default:
                            jsonReader.K();
                            jsonReader.P();
                            break;
                    }
                }
                if (animatableIntegerValue2 == null) {
                    animatableIntegerValue2 = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                gradientFill = new GradientStroke(strT6, gradientType4, animatableGradientColorValue2, animatableIntegerValue2, animatablePointValueD4, animatablePointValueD5, animatableFloatValueB, lineCapType, lineJoinType, fQ, arrayList2, animatableFloatValue, zP6);
                contentModelA = gradientFill;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "mm":
                JsonReader.Options options6 = MergePathsParser.f9918a;
                MergePaths.MergePathsMode mergePathsMode = null;
                String strT8 = null;
                while (jsonReader.m()) {
                    int iJ8 = jsonReader.J(MergePathsParser.f9918a);
                    if (iJ8 == 0) {
                        strT8 = jsonReader.t();
                    } else if (iJ8 == 1) {
                        int iR5 = jsonReader.r();
                        MergePaths.MergePathsMode mergePathsMode2 = MergePaths.MergePathsMode.X;
                        if (iR5 != 1) {
                            if (iR5 == 2) {
                                mergePathsMode = MergePaths.MergePathsMode.f9776Y;
                            } else if (iR5 == 3) {
                                mergePathsMode = MergePaths.MergePathsMode.Z;
                            } else if (iR5 == 4) {
                                mergePathsMode = MergePaths.MergePathsMode.e0;
                            } else if (iR5 == 5) {
                                mergePathsMode = MergePaths.MergePathsMode.f0;
                            }
                        }
                        mergePathsMode = mergePathsMode2;
                    } else if (iJ8 != 2) {
                        jsonReader.K();
                        jsonReader.P();
                    } else {
                        zP = jsonReader.p();
                    }
                }
                MergePaths mergePaths = new MergePaths(strT8, mergePathsMode, zP);
                lottieComposition.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                contentModelA = mergePaths;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "rc":
                JsonReader.Options options7 = RectangleShapeParser.f9922a;
                boolean zP7 = false;
                String strT9 = null;
                AnimatableValue animatableValueB2 = null;
                AnimatablePointValue animatablePointValueD6 = null;
                AnimatableFloatValue animatableFloatValueB3 = null;
                while (jsonReader.m()) {
                    int iJ9 = jsonReader.J(RectangleShapeParser.f9922a);
                    if (iJ9 == 0) {
                        strT9 = jsonReader.t();
                    } else if (iJ9 == 1) {
                        animatableValueB2 = AnimatablePathValueParser.b(jsonReader, lottieComposition);
                    } else if (iJ9 == 2) {
                        animatablePointValueD6 = AnimatableValueParser.d(jsonReader, lottieComposition);
                    } else if (iJ9 == 3) {
                        animatableFloatValueB3 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                    } else if (iJ9 != 4) {
                        jsonReader.P();
                    } else {
                        zP7 = jsonReader.p();
                    }
                }
                circleShape = new RectangleShape(strT9, animatableValueB2, animatablePointValueD6, animatableFloatValueB3, zP7);
                contentModelA = circleShape;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "rd":
                JsonReader.Options options8 = RoundedCornersParser.f9924a;
                String strT10 = null;
                AnimatableFloatValue animatableFloatValueB4 = null;
                while (jsonReader.m()) {
                    int iJ10 = jsonReader.J(RoundedCornersParser.f9924a);
                    if (iJ10 == 0) {
                        strT10 = jsonReader.t();
                    } else if (iJ10 == 1) {
                        animatableFloatValueB4 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                    } else if (iJ10 != 2) {
                        jsonReader.P();
                    } else {
                        zP = jsonReader.p();
                    }
                }
                contentModelA = zP ? null : new RoundedCorners(strT10, animatableFloatValueB4);
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "rp":
                JsonReader.Options options9 = RepeaterParser.f9923a;
                boolean zP8 = false;
                String strT11 = null;
                AnimatableFloatValue animatableFloatValueB5 = null;
                AnimatableFloatValue animatableFloatValueB6 = null;
                AnimatableTransform animatableTransformA = null;
                while (jsonReader.m()) {
                    int iJ11 = jsonReader.J(RepeaterParser.f9923a);
                    if (iJ11 == 0) {
                        strT11 = jsonReader.t();
                    } else if (iJ11 == 1) {
                        animatableFloatValueB5 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    } else if (iJ11 == 2) {
                        animatableFloatValueB6 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    } else if (iJ11 == 3) {
                        animatableTransformA = AnimatableTransformParser.a(jsonReader, lottieComposition);
                    } else if (iJ11 != 4) {
                        jsonReader.P();
                    } else {
                        zP8 = jsonReader.p();
                    }
                }
                circleShape = new Repeater(strT11, animatableFloatValueB5, animatableFloatValueB6, animatableTransformA, zP8);
                contentModelA = circleShape;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "sh":
                JsonReader.Options options10 = ShapePathParser.f9930a;
                int iR6 = 0;
                boolean zP9 = false;
                AnimatableShapeValue animatableShapeValue = null;
                String strT12 = null;
                while (jsonReader.m()) {
                    int iJ12 = jsonReader.J(ShapePathParser.f9930a);
                    if (iJ12 == 0) {
                        strT12 = jsonReader.t();
                    } else if (iJ12 == 1) {
                        iR6 = jsonReader.r();
                    } else if (iJ12 == 2) {
                        animatableShapeValue = new AnimatableShapeValue(KeyframesParser.a(jsonReader, lottieComposition, Utils.c(), ShapeDataParser.f9926a, false));
                    } else if (iJ12 != 3) {
                        jsonReader.P();
                    } else {
                        zP9 = jsonReader.p();
                    }
                }
                shapeGroup = new ShapePath(strT12, iR6, animatableShapeValue, zP9);
                contentModelA = shapeGroup;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "sr":
                JsonReader.Options options11 = PolystarShapeParser.f9921a;
                boolean z3 = iR == 3;
                boolean zP10 = false;
                String strT13 = null;
                PolystarShape.Type type2 = null;
                AnimatableFloatValue animatableFloatValueB7 = null;
                AnimatableValue animatableValueB3 = null;
                AnimatableFloatValue animatableFloatValueB8 = null;
                AnimatableFloatValue animatableFloatValueB9 = null;
                AnimatableFloatValue animatableFloatValueB10 = null;
                AnimatableFloatValue animatableFloatValueB11 = null;
                AnimatableFloatValue animatableFloatValueB12 = null;
                while (jsonReader.m()) {
                    switch (jsonReader.J(PolystarShapeParser.f9921a)) {
                        case 0:
                            strT13 = jsonReader.t();
                            break;
                        case 1:
                            int iR7 = jsonReader.r();
                            PolystarShape.Type[] typeArrValues = PolystarShape.Type.values();
                            int length = typeArrValues.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    type2 = null;
                                }
                                PolystarShape.Type type3 = typeArrValues[i2];
                                if (type3.X == iR7) {
                                    type2 = type3;
                                }
                                i2++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            animatableFloatValueB7 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                            break;
                        case 3:
                            animatableValueB3 = AnimatablePathValueParser.b(jsonReader, lottieComposition);
                            break;
                        case 4:
                            animatableFloatValueB8 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                            break;
                        case 5:
                            animatableFloatValueB10 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                            break;
                        case 6:
                            animatableFloatValueB12 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                            break;
                        case 7:
                            animatableFloatValueB9 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                            break;
                        case 8:
                            animatableFloatValueB11 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                            break;
                        case 9:
                            zP10 = jsonReader.p();
                            break;
                        case 10:
                            z3 = jsonReader.r() == 3;
                            break;
                        default:
                            jsonReader.K();
                            jsonReader.P();
                            break;
                    }
                }
                gradientFill = new PolystarShape(strT13, type2, animatableFloatValueB7, animatableValueB3, animatableFloatValueB8, animatableFloatValueB9, animatableFloatValueB10, animatableFloatValueB11, animatableFloatValueB12, zP10, z3);
                contentModelA = gradientFill;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "st":
                JsonReader.Options options12 = ShapeStrokeParser.f9931a;
                ArrayList arrayList3 = new ArrayList();
                boolean zP11 = false;
                float fQ2 = 0.0f;
                AnimatableIntegerValue animatableIntegerValue3 = null;
                String strT14 = null;
                AnimatableFloatValue animatableFloatValue2 = null;
                AnimatableColorValue animatableColorValueA2 = null;
                AnimatableFloatValue animatableFloatValueB13 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                while (jsonReader.m()) {
                    switch (jsonReader.J(ShapeStrokeParser.f9931a)) {
                        case 0:
                            strT14 = jsonReader.t();
                            break;
                        case 1:
                            animatableColorValueA2 = AnimatableValueParser.a(jsonReader, lottieComposition);
                            break;
                        case 2:
                            animatableFloatValueB13 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                            break;
                        case 3:
                            animatableIntegerValue3 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[jsonReader.r() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[jsonReader.r() - 1];
                            break;
                        case 6:
                            fQ2 = (float) jsonReader.q();
                            break;
                        case 7:
                            zP11 = jsonReader.p();
                            break;
                        case 8:
                            jsonReader.d();
                            while (jsonReader.m()) {
                                jsonReader.h();
                                String strT15 = null;
                                AnimatableFloatValue animatableFloatValueB14 = null;
                                while (jsonReader.m()) {
                                    int iJ13 = jsonReader.J(ShapeStrokeParser.f9932b);
                                    if (iJ13 == 0) {
                                        strT15 = jsonReader.t();
                                    } else if (iJ13 != 1) {
                                        jsonReader.K();
                                        jsonReader.P();
                                    } else {
                                        animatableFloatValueB14 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                                    }
                                }
                                jsonReader.l();
                                strT15.getClass();
                                switch (strT15) {
                                    case "d":
                                    case "g":
                                        lottieComposition.f9521n = true;
                                        arrayList3.add(animatableFloatValueB14);
                                        break;
                                    case "o":
                                        animatableFloatValue2 = animatableFloatValueB14;
                                        break;
                                }
                            }
                            jsonReader.k();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((AnimatableFloatValue) arrayList3.get(0));
                            }
                            break;
                        default:
                            jsonReader.P();
                            break;
                    }
                }
                if (animatableIntegerValue3 == null) {
                    animatableIntegerValue3 = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                gradientFill = new ShapeStroke(strT14, animatableFloatValue2, arrayList3, animatableColorValueA2, animatableIntegerValue3, animatableFloatValueB13, lineCapType2, lineJoinType2, fQ2, zP11);
                contentModelA = gradientFill;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "tm":
                JsonReader.Options options13 = ShapeTrimPathParser.f9933a;
                boolean zP12 = false;
                String strT16 = null;
                ShapeTrimPath.Type type4 = null;
                AnimatableFloatValue animatableFloatValueB15 = null;
                AnimatableFloatValue animatableFloatValueB16 = null;
                AnimatableFloatValue animatableFloatValueB17 = null;
                while (jsonReader.m()) {
                    int iJ14 = jsonReader.J(ShapeTrimPathParser.f9933a);
                    if (iJ14 == 0) {
                        animatableFloatValueB15 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    } else if (iJ14 == 1) {
                        animatableFloatValueB16 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    } else if (iJ14 == 2) {
                        animatableFloatValueB17 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    } else if (iJ14 == 3) {
                        strT16 = jsonReader.t();
                    } else if (iJ14 == 4) {
                        int iR8 = jsonReader.r();
                        if (iR8 == 1) {
                            type = ShapeTrimPath.Type.X;
                        } else {
                            if (iR8 != 2) {
                                throw new IllegalArgumentException(a.h(iR8, "Unknown trim path type "));
                            }
                            type = ShapeTrimPath.Type.f9818Y;
                        }
                        type4 = type;
                    } else if (iJ14 != 5) {
                        jsonReader.P();
                    } else {
                        zP12 = jsonReader.p();
                    }
                }
                circleShape = new ShapeTrimPath(strT16, type4, animatableFloatValueB15, animatableFloatValueB16, animatableFloatValueB17, zP12);
                contentModelA = circleShape;
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            case "tr":
                contentModelA = AnimatableTransformParser.a(jsonReader, lottieComposition);
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
            default:
                Logger.b("Unknown shape type ".concat(strT));
                while (jsonReader.m()) {
                    jsonReader.P();
                }
                jsonReader.l();
                return contentModelA;
        }
    }
}
