package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsReportJsonTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataEncoder f20714a;

    public interface ObjectParser<T> {
        Object a(JsonReader jsonReader);
    }

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoCrashlyticsReportEncoder.f20423a.a(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        f20714a = jsonDataEncoderBuilder.a();
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    builderA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    builderA.f(jsonReader.nextString());
                    break;
                case "pc":
                    builderA.e(jsonReader.nextLong());
                    break;
                case "file":
                    builderA.b(jsonReader.nextString());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.CustomAttribute b(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder builderA = CrashlyticsReport.CustomAttribute.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                builderA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builderA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.ApplicationExitInfo c(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.Builder builderA = CrashlyticsReport.ApplicationExitInfo.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    builderA.b(d(jsonReader, new a(0)));
                    break;
                case "pid":
                    builderA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    builderA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    builderA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    builderA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    builderA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    builderA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    builderA.j(jsonReader.nextString());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static List d(JsonReader jsonReader, ObjectParser objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static CrashlyticsReport.Session.Event e(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Builder builderA = CrashlyticsReport.Session.Event.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    CrashlyticsReport.Session.Event.Device.Builder builderA2 = CrashlyticsReport.Session.Event.Device.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                builderA2.b(Double.valueOf(jsonReader.nextDouble()));
                                break;
                            case "batteryVelocity":
                                builderA2.c(jsonReader.nextInt());
                                break;
                            case "orientation":
                                builderA2.e(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                builderA2.d(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                builderA2.g(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                builderA2.f(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builderA.c(builderA2.a());
                    break;
                case "rollouts":
                    CrashlyticsReport.Session.Event.RolloutsState.Builder builderA3 = CrashlyticsReport.Session.Event.RolloutsState.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            builderA3.b(d(jsonReader, new a(2)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builderA.e(builderA3.a());
                    break;
                case "app":
                    CrashlyticsReport.Session.Event.Application.Builder builderA4 = CrashlyticsReport.Session.Event.Application.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                builderA4.b(Collections.unmodifiableList(arrayList));
                                break;
                            case "background":
                                builderA4.c(Boolean.valueOf(jsonReader.nextBoolean()));
                                break;
                            case "execution":
                                CrashlyticsReport.Session.Event.Application.Execution.Builder builderA5 = CrashlyticsReport.Session.Event.Application.Execution.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            builderA5.b(c(jsonReader));
                                            break;
                                        case "threads":
                                            builderA5.f(d(jsonReader, new a(3)));
                                            break;
                                        case "signal":
                                            CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        builderA6.b(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        builderA6.c(jsonReader.nextString());
                                                        break;
                                                    case "name":
                                                        builderA6.d(jsonReader.nextString());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            builderA5.e(builderA6.a());
                                            break;
                                        case "binaries":
                                            builderA5.c(d(jsonReader, new a(4)));
                                            break;
                                        case "exception":
                                            builderA5.d(f(jsonReader));
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builderA4.f(builderA5.a());
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                builderA4.g(Collections.unmodifiableList(arrayList2));
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                builderA4.e(Collections.unmodifiableList(arrayList3));
                                break;
                            case "uiOrientation":
                                builderA4.h(jsonReader.nextInt());
                                break;
                            case "currentProcessDetails":
                                builderA4.d(g(jsonReader));
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builderA.b(builderA4.a());
                    break;
                case "log":
                    CrashlyticsReport.Session.Event.Log.Builder builderA7 = CrashlyticsReport.Session.Event.Log.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            builderA7.b(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builderA.d(builderA7.a());
                    break;
                case "type":
                    builderA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    builderA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception f(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    builderA.c(d(jsonReader, new a(5)));
                    break;
                case "reason":
                    builderA.e(jsonReader.nextString());
                    break;
                case "type":
                    builderA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    builderA.b(f(jsonReader));
                    break;
                case "overflowCount":
                    builderA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.Session.Event.Application.ProcessDetails g(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    builderA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    builderA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    builderA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport h(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Builder builderA = CrashlyticsReport.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    CrashlyticsReport.FilesPayload.Builder builderA2 = CrashlyticsReport.FilesPayload.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            builderA2.b(d(jsonReader, new a(1)));
                        } else if (strNextName2.equals("orgId")) {
                            builderA2.c(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builderA.j(builderA2.a());
                    continue;
                    break;
                case "sdkVersion":
                    builderA.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    builderA.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    builderA.b(c(jsonReader));
                    break;
                case "buildVersion":
                    builderA.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    builderA.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    builderA.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    builderA.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    builderA.g(jsonReader.nextString());
                    break;
                case "platform":
                    builderA.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    builderA.e(jsonReader.nextString());
                    break;
                case "session":
                    CrashlyticsReport.Session.Builder builderA3 = CrashlyticsReport.Session.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                builderA3.l(jsonReader.nextLong());
                                break;
                            case "appQualitySessionId":
                                builderA3.c(jsonReader.nextString());
                                break;
                            case "identifier":
                                builderA3.j(new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f20713a));
                                break;
                            case "endedAt":
                                builderA3.f(Long.valueOf(jsonReader.nextLong()));
                                break;
                            case "device":
                                CrashlyticsReport.Session.Device.Builder builderA4 = CrashlyticsReport.Session.Device.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            builderA4.i(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            builderA4.e(jsonReader.nextString());
                                            break;
                                        case "ram":
                                            builderA4.h(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            builderA4.b(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            builderA4.d(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            builderA4.c(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            builderA4.f(jsonReader.nextString());
                                            break;
                                        case "state":
                                            builderA4.j(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            builderA4.g(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builderA3.e(builderA4.a());
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                builderA3.g(Collections.unmodifiableList(arrayList));
                                break;
                            case "os":
                                CrashlyticsReport.Session.OperatingSystem.Builder builderA5 = CrashlyticsReport.Session.OperatingSystem.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            builderA5.b(jsonReader.nextString());
                                            break;
                                        case "jailbroken":
                                            builderA5.c(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            builderA5.e(jsonReader.nextString());
                                            break;
                                        case "platform":
                                            builderA5.d(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builderA3.k(builderA5.a());
                                break;
                            case "app":
                                CrashlyticsReport.Session.Application.Builder builderA6 = CrashlyticsReport.Session.Application.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            builderA6.e(jsonReader.nextString());
                                            break;
                                        case "developmentPlatform":
                                            builderA6.b(jsonReader.nextString());
                                            break;
                                        case "developmentPlatformVersion":
                                            builderA6.c(jsonReader.nextString());
                                            break;
                                        case "version":
                                            builderA6.g(jsonReader.nextString());
                                            break;
                                        case "installationUuid":
                                            builderA6.f(jsonReader.nextString());
                                            break;
                                        case "displayVersion":
                                            builderA6.d(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                builderA3.b(builderA6.a());
                                break;
                            case "user":
                                CrashlyticsReport.Session.User.Builder builderA7 = CrashlyticsReport.Session.User.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        builderA7.b(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                builderA3.m(builderA7.a());
                                break;
                            case "generator":
                                builderA3.h(jsonReader.nextString());
                                break;
                            case "crashed":
                                builderA3.d(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                builderA3.i(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    builderA.m(builderA3.a());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportH = h(jsonReader);
                jsonReader.close();
                return crashlyticsReportH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }
}
