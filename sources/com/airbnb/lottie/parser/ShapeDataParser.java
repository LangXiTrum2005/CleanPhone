package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.smartdigimkt.q8.i;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ShapeDataParser f9926a = new ShapeDataParser();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f9927b = JsonReader.Options.a("c", "v", i.f37957c, "o");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        if (jsonReader.H() == JsonReader.Token.X) {
            jsonReader.d();
        }
        jsonReader.h();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zP = false;
        while (jsonReader.m()) {
            int iJ = jsonReader.J(f9927b);
            if (iJ == 0) {
                zP = jsonReader.p();
            } else if (iJ == 1) {
                arrayListC = JsonUtils.c(jsonReader, f);
            } else if (iJ == 2) {
                arrayListC2 = JsonUtils.c(jsonReader, f);
            } else if (iJ != 3) {
                jsonReader.K();
                jsonReader.P();
            } else {
                arrayListC3 = JsonUtils.c(jsonReader, f);
            }
        }
        jsonReader.l();
        if (jsonReader.H() == JsonReader.Token.f9937Y) {
            jsonReader.k();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = (PointF) arrayListC.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new CubicCurveData(MiscUtils.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), MiscUtils.a(pointF2, (PointF) arrayListC2.get(i2)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i4 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.a((PointF) arrayListC.get(i4), (PointF) arrayListC3.get(i4)), MiscUtils.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new ShapeData(pointF, zP, arrayList);
    }
}
