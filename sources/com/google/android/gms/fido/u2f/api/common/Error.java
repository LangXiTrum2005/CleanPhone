package com.google.android.gms.fido.u2f.api.common;

import androidx.datastore.preferences.protobuf.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class Error {
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            String str = this.zzb;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("errorMessage", str);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String toString() {
        if (this.zzb == null) {
            Locale locale = Locale.ENGLISH;
            return a.k("{errorCode: ", this.zza.getCode(), "}");
        }
        Locale locale2 = Locale.ENGLISH;
        return "{errorCode: " + this.zza.getCode() + ", errorMessage: " + this.zzb + "}";
    }

    public Error(ErrorCode errorCode, String str) {
        this.zza = errorCode;
        this.zzb = str;
    }
}
