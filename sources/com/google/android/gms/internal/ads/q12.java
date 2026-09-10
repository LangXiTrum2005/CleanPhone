package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f18886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f18887h;

    public q12(g22 g22Var, g22 g22Var2, int i10, int i11, w02 w02Var, q20 q20Var, ci ciVar, Object obj) {
        this.f18882c = g22Var;
        this.f18883d = g22Var2;
        this.f18880a = i10;
        this.f18881b = i11;
        this.f18884e = w02Var;
        this.f18885f = q20Var;
        this.f18886g = ciVar;
        this.f18887h = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q12 a(JsonReader jsonReader) throws IOException {
        int i10;
        q12 q12Var = new q12();
        q12Var.f18880a = 1;
        List list = Collections.EMPTY_LIST;
        q12Var.f18885f = list;
        q12Var.f18886g = list;
        q12Var.f18881b = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i11 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 5;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 7;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 1;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                q12Var.f18880a = i11;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 8;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 4;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 2;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 6;
                                q12Var.f18880a = i11;
                                break;
                                break;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        q12Var.f18884e = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        q12Var.f18883d = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1734348803:
                    if (strNextName.equals("client_side_pingback_url")) {
                        q12Var.f18887h = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            q12Var.f18881b = i11;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i11 = 1;
                            q12Var.f18881b = i11;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i11 = 2;
                            q12Var.f18881b = i11;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals("actions")) {
                        q12Var.f18886g = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.google.android.gms.internal.consent_sdk.a0 a0Var = new com.google.android.gms.internal.consent_sdk.a0();
                            a0Var.f22936b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i10 = 1;
                                                a0Var.f22936b = i10;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i10 = 2;
                                                a0Var.f22936b = i10;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            }
                                            i10 = 3;
                                            a0Var.f22936b = i10;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    a0Var.f22935a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            ((List) q12Var.f18886g).add(a0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        q12Var.f18885f = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ((List) q12Var.f18885f).add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        q12Var.f18882c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return q12Var;
    }

    public /* synthetic */ q12 b(w02 w02Var) {
        return new q12((g22) this.f18882c, (g22) this.f18883d, this.f18880a, this.f18881b, w02Var, (q20) this.f18885f, (ci) this.f18886g, this.f18887h);
    }

    public /* synthetic */ boolean c() {
        return Objects.equals(((g22) this.f18882c).f14678o, MimeTypes.AUDIO_RAW);
    }
}
