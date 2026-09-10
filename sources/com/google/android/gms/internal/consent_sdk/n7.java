package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.ads.q12;
import com.google.android.gms.internal.ads.z40;
import com.ironsource.B5;
import com.ironsource.C0375hc;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f23119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f23120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f23121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t4 f23122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.g f23123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f23124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c0 f23125i;

    public n7(Application application, Handler handler, Executor executor, h hVar, q qVar, t4 t4Var, k5.g gVar, t0 t0Var, c0 c0Var) {
        this.f23117a = application;
        this.f23118b = handler;
        this.f23119c = executor;
        this.f23120d = hVar;
        this.f23121e = qVar;
        this.f23122f = t4Var;
        this.f23123g = gVar;
        this.f23124h = t0Var;
        this.f23125i = c0Var;
    }

    public final q12 a(z40 z40Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(this.f23117a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(C0375hc.f28789b);
            httpURLConnection.setRequestProperty("Content-Type", B5.M);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) z40Var.f22491a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = (String) z40Var.f22492b;
                    if (str2 != null) {
                        jsonWriter.name("consent_syncing_id");
                        jsonWriter.value(str2);
                    }
                    b2.p pVar = (b2.p) z40Var.f22493c;
                    if (pVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i10 = pVar.f5363b;
                        if (i10 != 1) {
                            jsonWriter.name("os_type");
                            int i11 = i10 - 1;
                            if (i11 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i11 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = (String) pVar.f5364c;
                        if (str3 != null) {
                            jsonWriter.name(O6.B);
                            jsonWriter.value(str3);
                        }
                        Integer num = (Integer) pVar.f5365d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = (String) z40Var.f22494d;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = (Boolean) z40Var.f22495e;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) z40Var.f22496f;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    k5.g gVar = (k5.g) z40Var.f22497g;
                    if (gVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) gVar.f44325a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) gVar.f44326b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = (Double) gVar.f44327c;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<z> list = (List) gVar.f44328d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (z zVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zVar.f23283a;
                                if (num4 != null) {
                                    jsonWriter.name(ViewHierarchyConstants.DIMENSION_TOP_KEY);
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zVar.f23284b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zVar.f23285c;
                                if (num6 != null) {
                                    jsonWriter.name(TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zVar.f23286d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    v9.e eVar = (v9.e) z40Var.f22498h;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = (String) eVar.f52503b;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f52504c;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = (String) eVar.f52505d;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    if (((o4) z40Var.f22499i) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) z40Var.f22500j;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((y) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        q12 q12VarA = q12.a(new JsonReader(new StringReader(headerField)));
                        q12VarA.f18882c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return q12VarA;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            q12 q12VarA2 = q12.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return q12VarA2;
                        } catch (Throwable th2) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        } catch (SocketTimeoutException e10) {
            throw new p1(4, e10, "The server timed out.");
        } catch (IOException e11) {
            throw new p1(2, e11, "Error making request.");
        }
    }
}
