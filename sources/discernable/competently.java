package discernable;

import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: JsonKeysetReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently implements triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Charset f25287dern = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InputStream f25288attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f25289saneness = false;

    public competently(InputStream inputStream) {
        this.f25288attabal = inputStream;
    }

    public static int attabal(JsonElement jsonElement) throws IOException {
        if (!jsonElement.isJsonPrimitive()) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jAttabal = JsonParser.attabal(jsonElement.getAsJsonPrimitive().getAsNumber());
            if (jAttabal > 4294967295L || jAttabal < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jAttabal;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static OutputPrefixType dern(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return OutputPrefixType.LEGACY;
            case "RAW":
                return OutputPrefixType.RAW;
            case "TINK":
                return OutputPrefixType.TINK;
            case "CRUNCHY":
                return OutputPrefixType.CRUNCHY;
            default:
                throw new JsonParseException("unknown output prefix type: " + str);
        }
    }

    public static competently impromptu(String str) {
        return new competently(new ByteArrayInputStream(str.getBytes(f25287dern)));
    }

    public static KeyData.KeyMaterialType saneness(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return KeyData.KeyMaterialType.REMOTE;
            case "SYMMETRIC":
                return KeyData.KeyMaterialType.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
            default:
                throw new JsonParseException("unknown key material type: " + str);
        }
    }

    public static KeyStatusType wireman(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return KeyStatusType.ENABLED;
            case "DESTROYED":
                return KeyStatusType.DESTROYED;
            case "DISABLED":
                return KeyStatusType.DISABLED;
            default:
                throw new JsonParseException("unknown status: " + str);
        }
    }

    public final com.google.crypto.tink.proto.attabal.dern beachfront(JsonObject jsonObject) throws IOException {
        if (!jsonObject.has("keyData") || !jsonObject.has("status") || !jsonObject.has("keyId") || !jsonObject.has("outputPrefixType")) {
            throw new JsonParseException("invalid key");
        }
        JsonElement jsonElement = jsonObject.get("keyData");
        if (jsonElement.isJsonObject()) {
            return com.google.crypto.tink.proto.attabal.dern.cultivated().gintrap(wireman(jsonObject.get("status").getAsString())).adultoid(attabal(jsonObject.get("keyId"))).dovishness(dern(jsonObject.get("outputPrefixType").getAsString())).graveside(marial(jsonElement.getAsJsonObject())).build();
        }
        throw new JsonParseException("invalid key: keyData must be an object");
    }

    public final com.google.crypto.tink.proto.attabal competently(JsonObject jsonObject) throws IOException {
        if (!jsonObject.has(X3.i.W)) {
            throw new JsonParseException("invalid keyset: no key");
        }
        JsonElement jsonElement = jsonObject.get(X3.i.W);
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("invalid keyset: key must be an array");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() == 0) {
            throw new JsonParseException("invalid keyset: key is empty");
        }
        com.google.crypto.tink.proto.attabal.saneness sanenessVarPermissivist = com.google.crypto.tink.proto.attabal.permissivist();
        if (jsonObject.has("primaryKeyId")) {
            sanenessVarPermissivist.graveside(attabal(jsonObject.get("primaryKeyId")));
        }
        for (int i = 0; i < asJsonArray.size(); i++) {
            sanenessVarPermissivist.molybdenite(beachfront(asJsonArray.get(i).getAsJsonObject()));
        }
        return sanenessVarPermissivist.build();
    }

    public final KeyData marial(JsonObject jsonObject) {
        if (jsonObject.has("typeUrl") && jsonObject.has("value") && jsonObject.has("keyMaterialType")) {
            return KeyData.dent().graveside(jsonObject.get("typeUrl").getAsString()).adultoid(ByteString.copyFrom(this.f25289saneness ? affiche.wireman.marial(jsonObject.get("value").getAsString()) : affiche.wireman.attabal(jsonObject.get("value").getAsString()))).molybdenite(saneness(jsonObject.get("keyMaterialType").getAsString())).build();
        }
        throw new JsonParseException("invalid keyData");
    }

    @Override // discernable.triweekly
    public com.google.crypto.tink.proto.attabal read() throws IOException {
        try {
            try {
                com.google.crypto.tink.proto.attabal attabalVarCompetently = competently(JsonParser.dern(new String(stratoscope.dern(this.f25288attabal), f25287dern)).getAsJsonObject());
                InputStream inputStream = this.f25288attabal;
                if (inputStream != null) {
                    inputStream.close();
                }
                return attabalVarCompetently;
            } catch (JsonParseException | IllegalStateException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            InputStream inputStream2 = this.f25288attabal;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }
}
