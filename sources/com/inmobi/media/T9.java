package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class T9 implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f23231a;

    static {
        LinkedHashMap linkedHashMap = O2.f23027a;
        f23231a = ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getSkipNetworkValidationFeatureEnabled();
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof AdConfig) {
            f23231a = ((AdConfig) config).getSkipNetworkValidationFeatureEnabled();
        }
    }

    public static EnumC3157o4 a(ConnectivityManager connectivityManager, boolean z2) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            networkCapabilities.toString();
            if (!networkCapabilities.hasCapability(12)) {
                return EnumC3157o4.f23860p;
            }
            if ((f23231a && !z2) || networkCapabilities.hasCapability(16)) {
                return null;
            }
            AdConfig.CustomNetworkValidation customNetworkValidation = C3203r3.f23948a;
            if (!(customNetworkValidation != null ? customNetworkValidation.getEnabled() : false)) {
                return EnumC3157o4.f23860p;
            }
            C3203r3.a(activeNetwork);
            if (C3203r3.f23950c) {
                return null;
            }
            return EnumC3157o4.t;
        }
        return EnumC3157o4.f23860p;
    }

    public static EnumC3157o4 a(boolean z2) {
        EnumC3157o4 enumC3157o4A;
        Context contextD = Uc.d();
        if (contextD != null) {
            try {
                Object systemService = contextD.getSystemService("connectivity");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC3157o4A = a((ConnectivityManager) systemService, z2);
            } catch (Exception unused) {
                enumC3157o4A = EnumC3157o4.r;
            }
            if (enumC3157o4A != null) {
                return enumC3157o4A;
            }
            Context contextD2 = Uc.d();
            boolean zIsDeviceIdleMode = false;
            if (contextD2 != null) {
                try {
                    Object systemService2 = contextD2.getSystemService("power");
                    PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                    if (powerManager != null) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                } catch (Exception unused2) {
                }
            }
            if (zIsDeviceIdleMode) {
                return EnumC3157o4.o;
            }
            return null;
        }
        return EnumC3157o4.f23859n;
    }

    public static String a(String delimiter, Map map) {
        String strEncode;
        String strEncode2;
        Intrinsics.f(delimiter, "delimiter");
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (sb.length() > 0) {
                    sb.append(delimiter);
                }
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    Intrinsics.e(strEncode, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(str2, "UTF-8");
                    Intrinsics.e(strEncode2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                sb.append(String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2)));
            }
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static void a(Map map) {
        if (map != null) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getValue();
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
                        if (z2) {
                            if (!z3) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z3) {
                            i2++;
                        } else {
                            z2 = true;
                        }
                    }
                    if (str.subSequence(i2, length + 1).toString().length() > 0 && entry.getKey() != null) {
                        String str2 = (String) entry.getKey();
                        int length2 = str2.length() - 1;
                        int i3 = 0;
                        boolean z4 = false;
                        while (i3 <= length2) {
                            boolean z5 = Intrinsics.h(str2.charAt(!z4 ? i3 : length2), 32) <= 0;
                            if (z4) {
                                if (!z5) {
                                    break;
                                } else {
                                    length2--;
                                }
                            } else if (z5) {
                                i3++;
                            } else {
                                z4 = true;
                            }
                        }
                        if (str2.subSequence(i3, length2 + 1).toString().length() > 0) {
                            String str3 = (String) entry.getKey();
                            int length3 = str3.length() - 1;
                            int i4 = 0;
                            boolean z6 = false;
                            while (i4 <= length3) {
                                boolean z7 = Intrinsics.h(str3.charAt(!z6 ? i4 : length3), 32) <= 0;
                                if (z6) {
                                    if (!z7) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                } else if (z7) {
                                    i4++;
                                } else {
                                    z6 = true;
                                }
                            }
                            String strA = I7.a(length3, 1, str3, i4);
                            String str4 = (String) entry.getValue();
                            int length4 = str4.length() - 1;
                            int i5 = 0;
                            boolean z8 = false;
                            while (i5 <= length4) {
                                boolean z9 = Intrinsics.h(str4.charAt(!z8 ? i5 : length4), 32) <= 0;
                                if (z8) {
                                    if (!z9) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                } else if (z9) {
                                    i5++;
                                } else {
                                    z8 = true;
                                }
                            }
                            map2.put(strA, I7.a(length4, 1, str4, i5));
                        }
                    }
                }
            }
            map.clear();
            map.putAll(map2);
        }
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.c(next);
                    String string = jSONObject.getString(next);
                    Intrinsics.e(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static String a(String url, HashMap map) {
        Intrinsics.f(url, "url");
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                url = StringsKt.I(url, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        return url;
    }

    public static byte[] a(byte[] compressedData) {
        GZIPInputStream gZIPInputStream;
        Intrinsics.f(compressedData, "compressedData");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    compressedData = a((InputStream) gZIPInputStream);
                } catch (IOException e2) {
                    e = e2;
                    gZIPInputStream2 = gZIPInputStream;
                    AbstractC3048h7.a((byte) 2, "T9", "Failed to decompress response", e);
                    gZIPInputStream = gZIPInputStream2;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream2 = gZIPInputStream;
                    a((Closeable) byteArrayInputStream);
                    a((Closeable) gZIPInputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
        a((Closeable) byteArrayInputStream);
        a((Closeable) gZIPInputStream);
        return compressedData;
    }

    public static byte[] a(InputStream input) {
        Intrinsics.f(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i2 = input.read(bArr);
                if (-1 != i2) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.c(byteArray);
                    a(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (Throwable th) {
                a(byteArrayOutputStream);
                throw th;
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Error | Exception unused) {
                return;
            }
        } else {
            inputStream = null;
        }
        a((Closeable) inputStream);
        a((Closeable) (httpURLConnection != null ? httpURLConnection.getErrorStream() : null));
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException | Error | Exception unused) {
            }
        }
    }
}
