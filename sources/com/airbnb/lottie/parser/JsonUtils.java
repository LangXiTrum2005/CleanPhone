package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class JsonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9905a = JsonReader.Options.a("x", "y");

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.JsonUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9906a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f9906a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9906a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9906a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(JsonReader jsonReader) {
        jsonReader.d();
        int iQ = (int) (jsonReader.q() * 255.0d);
        int iQ2 = (int) (jsonReader.q() * 255.0d);
        int iQ3 = (int) (jsonReader.q() * 255.0d);
        while (jsonReader.m()) {
            jsonReader.P();
        }
        jsonReader.k();
        return Color.argb(255, iQ, iQ2, iQ3);
    }

    public static PointF b(JsonReader jsonReader, float f) {
        int iOrdinal = jsonReader.H().ordinal();
        if (iOrdinal == 0) {
            jsonReader.d();
            float fQ = (float) jsonReader.q();
            float fQ2 = (float) jsonReader.q();
            while (jsonReader.H() != JsonReader.Token.f9937Y) {
                jsonReader.P();
            }
            jsonReader.k();
            return new PointF(fQ * f, fQ2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.H());
            }
            float fQ3 = (float) jsonReader.q();
            float fQ4 = (float) jsonReader.q();
            while (jsonReader.m()) {
                jsonReader.P();
            }
            return new PointF(fQ3 * f, fQ4 * f);
        }
        jsonReader.h();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (jsonReader.m()) {
            int iJ = jsonReader.J(f9905a);
            if (iJ == 0) {
                fD = d(jsonReader);
            } else if (iJ != 1) {
                jsonReader.K();
                jsonReader.P();
            } else {
                fD2 = d(jsonReader);
            }
        }
        jsonReader.l();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        while (jsonReader.H() == JsonReader.Token.X) {
            jsonReader.d();
            arrayList.add(b(jsonReader, f));
            jsonReader.k();
        }
        jsonReader.k();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) {
        JsonReader.Token tokenH = jsonReader.H();
        int iOrdinal = tokenH.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.q();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenH);
        }
        jsonReader.d();
        float fQ = (float) jsonReader.q();
        while (jsonReader.m()) {
            jsonReader.P();
        }
        jsonReader.k();
        return fQ;
    }
}
