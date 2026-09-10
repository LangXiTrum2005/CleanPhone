package nidicolous;

import amount.sealless;
import android.util.Base64;
import android.util.JsonReader;
import com.ironsource.X3;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
/* JADX INFO: loaded from: classes3.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final derbyshire.attabal f33930attabal = new groundwood.wireman().cutely(amount.attabal.f4029attabal).apical(true).taiyuan();

    /* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
    public interface attabal<T> {
        T attabal(JsonReader jsonReader) throws IOException;
    }

    public static sealless.marial.wireman.dern adultoid(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.dern.attabal attabalVarAttabal = sealless.marial.wireman.dern.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    attabalVarAttabal.saneness(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    attabalVarAttabal.dern(jsonReader.nextInt());
                    break;
                case "orientation":
                    attabalVarAttabal.marial(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    attabalVarAttabal.wireman(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    attabalVarAttabal.competently(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    attabalVarAttabal.beachfront(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.dern arytenoidectomy(JsonReader jsonReader) throws IOException {
        sealless.dern.attabal attabalVarAttabal = sealless.dern.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(X3.i.W)) {
                attabalVarAttabal.saneness(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                attabalVarAttabal.dern(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.AbstractC0023marial cord(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.AbstractC0023marial.attabal attabalVarAttabal = sealless.marial.wireman.AbstractC0023marial.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    attabalVarAttabal.saneness(jsonReader.nextString());
                    break;
                case "templateVersion":
                    attabalVarAttabal.marial(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    attabalVarAttabal.wireman(restrictive(jsonReader));
                    break;
                case "parameterValue":
                    attabalVarAttabal.dern(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.beachfront cuirassed(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.beachfront.attabal attabalVarAttabal = sealless.marial.wireman.beachfront.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                attabalVarAttabal.saneness(triweekly(jsonReader, new attabal() { // from class: nidicolous.beachfront
                    @Override // nidicolous.cutely.attabal
                    public final Object attabal(JsonReader jsonReader2) {
                        return cutely.cord(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.saneness dovishness(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.AbstractC0020saneness abstractC0020sanenessAttabal = sealless.marial.wireman.attabal.saneness.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0020sanenessAttabal.saneness(impassible(jsonReader));
                    break;
                case "threads":
                    abstractC0020sanenessAttabal.beachfront(triweekly(jsonReader, new attabal() { // from class: nidicolous.competently
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.trm(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0020sanenessAttabal.marial(stratoscope(jsonReader));
                    break;
                case "binaries":
                    abstractC0020sanenessAttabal.dern(triweekly(jsonReader, new attabal() { // from class: nidicolous.impromptu
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.graveside(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0020sanenessAttabal.wireman(gintrap(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0020sanenessAttabal.attabal();
    }

    public static sealless.marial.attabal formularize(JsonReader jsonReader) throws IOException {
        sealless.marial.attabal.AbstractC0009attabal abstractC0009attabalAttabal = sealless.marial.attabal.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC0009attabalAttabal.marial(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0009attabalAttabal.saneness(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0009attabalAttabal.dern(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0009attabalAttabal.competently(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0009attabalAttabal.beachfront(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0009attabalAttabal.wireman(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0009attabalAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.saneness.dern gintrap(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal abstractC0015attabalAttabal = sealless.marial.wireman.attabal.saneness.dern.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0015attabalAttabal.dern(triweekly(jsonReader, new taiyuan()));
                    break;
                case "reason":
                    abstractC0015attabalAttabal.marial(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0015attabalAttabal.beachfront(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0015attabalAttabal.saneness(gintrap(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0015attabalAttabal.wireman(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0015attabalAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.saneness.AbstractC0013attabal graveside(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal abstractC0014attabalAttabal = sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC0014attabalAttabal.dern(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0014attabalAttabal.wireman(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0014attabalAttabal.beachfront(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0014attabalAttabal.saneness(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0014attabalAttabal.attabal();
    }

    public static sealless.attabal impassible(JsonReader jsonReader) throws IOException {
        sealless.attabal.saneness sanenessVarAttabal = sealless.attabal.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    sanenessVarAttabal.saneness(triweekly(jsonReader, new attabal() { // from class: nidicolous.attabal
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.kowloon(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    sanenessVarAttabal.wireman(jsonReader.nextInt());
                    break;
                case "pss":
                    sanenessVarAttabal.beachfront(jsonReader.nextLong());
                    break;
                case "rss":
                    sanenessVarAttabal.impromptu(jsonReader.nextLong());
                    break;
                case "timestamp":
                    sanenessVarAttabal.taiyuan(jsonReader.nextLong());
                    break;
                case "processName":
                    sanenessVarAttabal.marial(jsonReader.nextString());
                    break;
                case "reasonCode":
                    sanenessVarAttabal.competently(jsonReader.nextInt());
                    break;
                case "traceFile":
                    sanenessVarAttabal.cutely(jsonReader.nextString());
                    break;
                case "importance":
                    sanenessVarAttabal.dern(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sanenessVarAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.dern kattegat(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.dern.AbstractC0012attabal abstractC0012attabalAttabal = sealless.marial.wireman.attabal.dern.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC0012attabalAttabal.wireman(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0012attabalAttabal.marial(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0012attabalAttabal.saneness(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0012attabalAttabal.dern(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0012attabalAttabal.attabal();
    }

    public static sealless.attabal.AbstractC0007attabal kowloon(JsonReader jsonReader) throws IOException {
        sealless.attabal.AbstractC0007attabal.AbstractC0008attabal abstractC0008attabalAttabal = sealless.attabal.AbstractC0007attabal.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC0008attabalAttabal.wireman(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0008attabalAttabal.saneness(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0008attabalAttabal.dern(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0008attabalAttabal.attabal();
    }

    public static sealless.marial merc(JsonReader jsonReader) throws IOException {
        sealless.marial.saneness sanenessVarAttabal = sealless.marial.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    sanenessVarAttabal.impassible(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    sanenessVarAttabal.dern(jsonReader.nextString());
                    break;
                case "identifier":
                    sanenessVarAttabal.apical(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    sanenessVarAttabal.beachfront(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    sanenessVarAttabal.marial(monoploid(jsonReader));
                    break;
                case "events":
                    sanenessVarAttabal.competently(triweekly(jsonReader, new attabal() { // from class: nidicolous.wireman
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.polloi(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    sanenessVarAttabal.formularize(sealless(jsonReader));
                    break;
                case "app":
                    sanenessVarAttabal.saneness(formularize(jsonReader));
                    break;
                case "user":
                    sanenessVarAttabal.triweekly(polder(jsonReader));
                    break;
                case "generator":
                    sanenessVarAttabal.impromptu(jsonReader.nextString());
                    break;
                case "crashed":
                    sanenessVarAttabal.wireman(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    sanenessVarAttabal.taiyuan(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sanenessVarAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal molybdenite(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.AbstractC0011attabal abstractC0011attabalAttabal = sealless.marial.wireman.attabal.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0011attabalAttabal.saneness(triweekly(jsonReader, new attabal() { // from class: nidicolous.dern
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.kattegat(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0011attabalAttabal.dern(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0011attabalAttabal.beachfront(dovishness(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0011attabalAttabal.competently(triweekly(jsonReader, new attabal() { // from class: nidicolous.saneness
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.arytenoidectomy(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0011attabalAttabal.marial(triweekly(jsonReader, new attabal() { // from class: nidicolous.saneness
                        @Override // nidicolous.cutely.attabal
                        public final Object attabal(JsonReader jsonReader2) {
                            return cutely.arytenoidectomy(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0011attabalAttabal.impromptu(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0011attabalAttabal.wireman(kattegat(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0011attabalAttabal.attabal();
    }

    public static sealless.marial.dern monoploid(JsonReader jsonReader) throws IOException {
        sealless.marial.dern.attabal attabalVarAttabal = sealless.marial.dern.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    attabalVarAttabal.taiyuan(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    attabalVarAttabal.marial(jsonReader.nextString());
                    break;
                case "ram":
                    attabalVarAttabal.impromptu(jsonReader.nextLong());
                    break;
                case "arch":
                    attabalVarAttabal.saneness(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    attabalVarAttabal.wireman(jsonReader.nextLong());
                    break;
                case "cores":
                    attabalVarAttabal.dern(jsonReader.nextInt());
                    break;
                case "model":
                    attabalVarAttabal.beachfront(jsonReader.nextString());
                    break;
                case "state":
                    attabalVarAttabal.cutely(jsonReader.nextInt());
                    break;
                case "modelClass":
                    attabalVarAttabal.competently(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.wireman.saneness oilcan(JsonReader jsonReader) throws IOException {
        sealless.wireman.saneness.attabal attabalVarAttabal = sealless.wireman.saneness.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                attabalVarAttabal.dern(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                attabalVarAttabal.saneness(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.beachfront polder(JsonReader jsonReader) throws IOException {
        sealless.marial.beachfront.attabal attabalVarAttabal = sealless.marial.beachfront.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                attabalVarAttabal.saneness(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman polloi(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.saneness sanenessVarAttabal = sealless.marial.wireman.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    sanenessVarAttabal.dern(adultoid(jsonReader));
                    break;
                case "rollouts":
                    sanenessVarAttabal.marial(cuirassed(jsonReader));
                    break;
                case "app":
                    sanenessVarAttabal.saneness(molybdenite(jsonReader));
                    break;
                case "log":
                    sanenessVarAttabal.wireman(preprohormone(jsonReader));
                    break;
                case "type":
                    sanenessVarAttabal.competently(jsonReader.nextString());
                    break;
                case "timestamp":
                    sanenessVarAttabal.beachfront(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sanenessVarAttabal.attabal();
    }

    public static sealless.marial.wireman.AbstractC0024wireman preprohormone(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.AbstractC0024wireman.attabal attabalVarAttabal = sealless.marial.wireman.AbstractC0024wireman.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                attabalVarAttabal.saneness(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.AbstractC0023marial.saneness restrictive(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.AbstractC0023marial.saneness.attabal attabalVarAttabal = sealless.marial.wireman.AbstractC0023marial.saneness.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                attabalVarAttabal.dern(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                attabalVarAttabal.saneness(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness rotuma(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal abstractC0019attabalAttabal = sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0019attabalAttabal.wireman(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0019attabalAttabal.beachfront(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0019attabalAttabal.marial(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0019attabalAttabal.saneness(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0019attabalAttabal.dern(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0019attabalAttabal.attabal();
    }

    public static sealless.marial.AbstractC0010marial sealless(JsonReader jsonReader) throws IOException {
        sealless.marial.AbstractC0010marial.attabal attabalVarAttabal = sealless.marial.AbstractC0010marial.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    attabalVarAttabal.saneness(jsonReader.nextString());
                    break;
                case "jailbroken":
                    attabalVarAttabal.dern(jsonReader.nextBoolean());
                    break;
                case "version":
                    attabalVarAttabal.marial(jsonReader.nextString());
                    break;
                case "platform":
                    attabalVarAttabal.wireman(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public static sealless.marial.wireman.attabal.saneness.AbstractC0021wireman stratoscope(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal abstractC0022attabalAttabal = sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC0022attabalAttabal.saneness(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0022attabalAttabal.dern(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0022attabalAttabal.wireman(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0022attabalAttabal.attabal();
    }

    public static sealless supplicat(JsonReader jsonReader) throws IOException {
        sealless.saneness sanenessVarSaneness = sealless.saneness();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    sanenessVarSaneness.cutely(yemenite(jsonReader));
                    break;
                case "sdkVersion":
                    sanenessVarSaneness.formularize(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    sanenessVarSaneness.dern(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    sanenessVarSaneness.saneness(impassible(jsonReader));
                    break;
                case "buildVersion":
                    sanenessVarSaneness.wireman(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    sanenessVarSaneness.beachfront(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    sanenessVarSaneness.impromptu(jsonReader.nextString());
                    break;
                case "installationUuid":
                    sanenessVarSaneness.taiyuan(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    sanenessVarSaneness.competently(jsonReader.nextString());
                    break;
                case "platform":
                    sanenessVarSaneness.apical(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    sanenessVarSaneness.marial(jsonReader.nextString());
                    break;
                case "session":
                    sanenessVarSaneness.impassible(merc(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sanenessVarSaneness.attabal();
    }

    public static <T> List<T> triweekly(JsonReader jsonReader, attabal<T> attabalVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(attabalVar.attabal(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static sealless.marial.wireman.attabal.saneness.AbstractC0016marial trm(JsonReader jsonReader) throws IOException {
        sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal abstractC0017attabalAttabal = sealless.marial.wireman.attabal.saneness.AbstractC0016marial.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0017attabalAttabal.saneness(triweekly(jsonReader, new taiyuan()));
                    break;
                case "name":
                    abstractC0017attabalAttabal.wireman(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0017attabalAttabal.dern(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0017attabalAttabal.attabal();
    }

    public static sealless.wireman yemenite(JsonReader jsonReader) throws IOException {
        sealless.wireman.attabal attabalVarAttabal = sealless.wireman.attabal();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                attabalVarAttabal.saneness(triweekly(jsonReader, new attabal() { // from class: nidicolous.marial
                    @Override // nidicolous.cutely.attabal
                    public final Object attabal(JsonReader jsonReader2) {
                        return cutely.oilcan(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                attabalVarAttabal.dern(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return attabalVarAttabal.attabal();
    }

    public String apical(sealless.marial.wireman wiremanVar) {
        return f33930attabal.saneness(wiremanVar);
    }

    public sealless.marial.wireman cutely(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                sealless.marial.wireman wiremanVarPolloi = polloi(jsonReader);
                jsonReader.close();
                return wiremanVarPolloi;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String grimness(sealless seallessVar) {
        return f33930attabal.saneness(seallessVar);
    }

    public sealless seminary(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                sealless seallessVarSupplicat = supplicat(jsonReader);
                jsonReader.close();
                return seallessVarSupplicat;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
