package com.adcolony.sdk;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9144e = new a(null);
    private static final Map<String, String> f = MapsKt.l(new Pair("default", "truefalse"), new Pair("la-req-01", "\"iphoneos\"ipados\"cell\"tablet\"{\"carrier_name\":\",\"data_path\":\",\"device_api\":,\"screen_width\":,\"screen_height\":,\"display_dpi\":,\"device_type\":\"phone\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"mac_address\":\"\",\"manufacturer\":\",\"device_brand\":\",\"media_path\":\",\"temp_storage_path\":\",\"memory_class\":,\"memory_used_mb\":,\"model\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"wifi\",\"os_version\":\",\"os_name\":\"android\",\"platform\":\"android\",\"arch\":\",\"user_id\":\"\",\"app_id\":\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":1,\"cell_service_country_code\":\",\"timezone_ietf\":\",\"timezone_gmt_m\":,\"timezone_dst_m\":,\"controller_version\":\"3.\",\"current_orientation\":0,\"cleartext_permitted\":true,\"density\":,\"dark_mode\":false,\"available_stores\":[],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\"}"), new Pair("la-res-01", "{\"controller\":{\"url\":\"https://adc-ad-assets.adtilt.com/launch/__controllers__/4.0.0/controller.js\",\"sha1\":,\"version\":\"3.\"},\"libraries\":[],\"item\":0,\"logging\":{\"log_private\":false,\"send_level\":1,\"enable_crash_reporting\":false,\"print_level\":3,\"report_interval_ms\":5000},\"metadata\":{\"controller_heartbeat_interval\":300000,\"controller_heartbeat_timeout\":15000,\"ad_request_timeout\":20000,\"iab_url\":\"https://adc-ad-assets.adtilt.com/launch/__libs__/omsdk/omsdk-v1.js\",\"odt_config\":{\"version\":,\"streams\":[{\"stream\":\"events\",\"request_types\":[\"start\",\"html5_interaction\",\"in_video_engagement\",\"download\",\"info\",\"viewable_impression\",\"complete\",\"skip\",\"continue\",\"midpoint\",\"first_quartile\",\"third_quartile\",\"reward_v4vc\"configure\"session_start\",\"session_end\",\"session_resume\",\"session_pause\"]\"table_name\"max_rows\": GROUP BY ]},\"calculate_odt_timeout\":500,\"async_odt_query\":false},\"status\":\"success\",\"pie\":\"}"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9147c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, String> a() {
            return g.f;
        }

        private a() {
        }

        @JvmStatic
        public final void a(Map<String, String> map) {
            synchronized (a()) {
                g.f9144e.a().putAll(map);
            }
        }

        @JvmStatic
        public final g a(String str, String str2) {
            g gVar;
            if (str == null || str2 == null) {
                return null;
            }
            synchronized (a()) {
                a aVar = g.f9144e;
                if (!aVar.a().containsKey(str)) {
                    str = "default";
                }
                if (!aVar.a().containsKey(str2)) {
                    str2 = "default";
                }
                gVar = new g(str, str2, aVar.a().get(str), aVar.a().get(str2));
            }
            return gVar;
        }
    }

    public g(String str, String str2, String str3, String str4) {
        this.f9145a = str;
        this.f9146b = str2;
        this.f9147c = str3;
        this.d = str4;
    }

    @JvmStatic
    public static final g a(String str, String str2) {
        return f9144e.a(str, str2);
    }

    public final String b() {
        return this.f9145a;
    }

    public final String c() {
        return this.f9146b;
    }

    @JvmStatic
    public static final void a(Map<String, String> map) {
        f9144e.a(map);
    }

    public final String b(byte[] bArr) throws DataFormatException, IllegalArgumentException, UnsupportedEncodingException {
        return b(bArr, this.d);
    }

    private final String b(byte[] bArr, String str) throws DataFormatException, IllegalArgumentException, UnsupportedEncodingException {
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr2 = new byte[512];
                while (!inflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                    if (inflater.needsDictionary()) {
                        Charset charset = h.f9168a;
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        inflater.setDictionary(str.getBytes(charset));
                    }
                }
                String str2 = new String(byteArrayOutputStream.toByteArray(), h.f9168a);
                byteArrayOutputStream.close();
                inflater.end();
                return str2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(byteArrayOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            inflater.end();
            throw th3;
        }
    }

    public final byte[] a(String str) throws UnsupportedEncodingException {
        return a(str.getBytes(h.f9168a));
    }

    public final byte[] a(byte[] bArr) throws UnsupportedEncodingException {
        return a(bArr, this.f9147c);
    }

    private final byte[] a(byte[] bArr, String str) throws UnsupportedEncodingException {
        Deflater deflater = new Deflater();
        try {
            Charset charset = h.f9168a;
            if (str != null) {
                deflater.setDictionary(str.getBytes(charset));
                deflater.setInput(bArr);
                deflater.finish();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr2 = new byte[512];
                    while (!deflater.finished()) {
                        byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    deflater.end();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }
}
