package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20715a;

    public /* synthetic */ a(int i2) {
        this.f20715a = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object a(JsonReader jsonReader) throws IOException {
        switch (this.f20715a) {
            case 0:
                DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f20714a;
                CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builderA = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            builderA.d(jsonReader.nextString());
                            break;
                        case "arch":
                            builderA.b(jsonReader.nextString());
                            break;
                        case "buildId":
                            builderA.c(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return builderA.a();
            case 1:
                DataEncoder dataEncoder2 = CrashlyticsReportJsonTransform.f20714a;
                CrashlyticsReport.FilesPayload.File.Builder builderA2 = CrashlyticsReport.FilesPayload.File.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        builderA2.c(jsonReader.nextString());
                    } else if (strNextName2.equals("contents")) {
                        builderA2.b(Base64.decode(jsonReader.nextString(), 2));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return builderA2.a();
            case 2:
                DataEncoder dataEncoder3 = CrashlyticsReportJsonTransform.f20714a;
                CrashlyticsReport.Session.Event.RolloutAssignment.Builder builderA3 = CrashlyticsReport.Session.Event.RolloutAssignment.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            builderA3.b(jsonReader.nextString());
                            break;
                        case "templateVersion":
                            builderA3.e(jsonReader.nextLong());
                            break;
                        case "rolloutVariant":
                            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builderA4 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    builderA4.c(jsonReader.nextString());
                                } else if (strNextName4.equals("rolloutId")) {
                                    builderA4.b(jsonReader.nextString());
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            builderA3.d(builderA4.a());
                            break;
                        case "parameterValue":
                            builderA3.c(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return builderA3.a();
            case 3:
                DataEncoder dataEncoder4 = CrashlyticsReportJsonTransform.f20714a;
                CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builderA5 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "frames":
                            builderA5.b(CrashlyticsReportJsonTransform.d(jsonReader, new a(5)));
                            break;
                        case "name":
                            builderA5.d(jsonReader.nextString());
                            break;
                        case "importance":
                            builderA5.c(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return builderA5.a();
            case 4:
                DataEncoder dataEncoder5 = CrashlyticsReportJsonTransform.f20714a;
                CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "name":
                            builderA6.c(jsonReader.nextString());
                            break;
                        case "size":
                            builderA6.d(jsonReader.nextLong());
                            break;
                        case "uuid":
                            builderA6.e(new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f20713a));
                            break;
                        case "baseAddress":
                            builderA6.b(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return builderA6.a();
            default:
                return CrashlyticsReportJsonTransform.a(jsonReader);
        }
    }
}
