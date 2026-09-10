package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.o1.b;

/* JADX INFO: loaded from: classes.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DocumentDataParser f9884a = new DocumentDataParser();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f9885b = JsonReader.Options.a("t", f.j, "s", "j", "tr", "lh", "ls", "fc", b.I1, "sw", "of");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        DocumentData.Justification justification = DocumentData.Justification.X;
        jsonReader.h();
        String strT = null;
        DocumentData.Justification justification2 = justification;
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        int iR = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zP = true;
        String strT2 = null;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        while (jsonReader.m()) {
            switch (jsonReader.J(f9885b)) {
                case 0:
                    strT = jsonReader.t();
                    break;
                case 1:
                    strT2 = jsonReader.t();
                    break;
                case 2:
                    fQ3 = (float) jsonReader.q();
                    break;
                case 3:
                    int iR2 = jsonReader.r();
                    justification2 = (iR2 <= 2 && iR2 >= 0) ? DocumentData.Justification.values()[iR2] : justification;
                    break;
                case 4:
                    iR = jsonReader.r();
                    break;
                case 5:
                    fQ4 = (float) jsonReader.q();
                    break;
                case 6:
                    fQ = (float) jsonReader.q();
                    break;
                case 7:
                    iA = JsonUtils.a(jsonReader);
                    break;
                case 8:
                    iA2 = JsonUtils.a(jsonReader);
                    break;
                case 9:
                    fQ2 = (float) jsonReader.q();
                    break;
                case 10:
                    zP = jsonReader.p();
                    break;
                default:
                    jsonReader.K();
                    jsonReader.P();
                    break;
            }
        }
        jsonReader.l();
        DocumentData documentData = new DocumentData();
        documentData.f9714a = strT;
        documentData.f9715b = strT2;
        documentData.f9716c = fQ3;
        documentData.d = justification2;
        documentData.f9717e = iR;
        documentData.f = fQ4;
        documentData.g = fQ;
        documentData.f9718h = iA;
        documentData.f9719i = iA2;
        documentData.j = fQ2;
        documentData.k = zP;
        return documentData;
    }
}
