package com.kochava.tracker.payload.internal;

import android.content.Context;
import android.net.Uri;
import com.inmobi.commons.core.configs.AdConfig;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.network.internal.NetworkRequest;
import com.kochava.core.network.internal.NetworkResponse;
import com.kochava.core.network.internal.NetworkResponseApi;
import com.kochava.core.network.internal.NetworkValidateListener;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.DataPointManager;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.q0.b;
import com.thinkup.core.common.n.mo;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class Payload implements PayloadApi, NetworkValidateListener {
    public static final ClassLoggerApi k0 = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "Payload");
    public final PayloadMetadata X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final JsonObjectApi f28255Y;
    public final JsonObjectApi Z;
    public final Uri e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28256a;

        static {
            int[] iArr = new int[PayloadMethod.values().length];
            f28256a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28256a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Payload(PayloadMetadata payloadMetadata, JsonObjectApi jsonObjectApi, JsonObjectApi jsonObjectApi2, Uri uri, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.X = payloadMetadata;
        this.f28255Y = jsonObjectApi;
        this.Z = jsonObjectApi2;
        this.e0 = uri;
        this.f0 = i2;
        this.g0 = z2;
        this.h0 = z3;
        this.i0 = z4;
        this.j0 = z5;
    }

    public static String e(byte[] bArr) {
        return new String(bArr, TextUtil.a());
    }

    public static void f(Object obj, StringBuilder sb) {
        if (obj == null) {
            return;
        }
        sb.append(obj);
    }

    public static Payload g(PayloadType payloadType, long j, long j2, long j3, long j4, boolean z2, int i2) {
        return new Payload(new PayloadMetadata(payloadType, PayloadMethod.Post, j, j2, j3, j4, z2, i2), JsonObject.w(), JsonObject.w(), Uri.EMPTY, 0, true, true, true, false);
    }

    public static Payload h(PayloadType payloadType, long j, long j2, long j3, long j4, boolean z2, int i2, JsonObjectApi jsonObjectApi) {
        return new Payload(new PayloadMetadata(payloadType, PayloadMethod.Post, j, j2, j3, j4, z2, i2), JsonObject.w(), jsonObjectApi, Uri.EMPTY, 0, true, true, true, false);
    }

    public static Payload i(JsonObjectApi jsonObjectApi) {
        PayloadType payloadType;
        PayloadMethod payloadMethod;
        JsonObjectApi jsonObjectApiK = jsonObjectApi.k(TtmlNode.TAG_METADATA, true);
        String string = jsonObjectApiK.getString("payload_type", "");
        PayloadType[] payloadTypeArrValues = PayloadType.values();
        int length = payloadTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                payloadType = null;
                break;
            }
            payloadType = payloadTypeArrValues[i2];
            if (payloadType.X.equals(string)) {
                break;
            }
            i2++;
        }
        if (payloadType == null) {
            payloadType = PayloadType.t0;
        }
        PayloadType payloadType2 = payloadType;
        String string2 = jsonObjectApiK.getString("payload_method", "");
        PayloadMethod[] payloadMethodArrValues = PayloadMethod.values();
        int length2 = payloadMethodArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                payloadMethod = PayloadMethod.Post;
                break;
            }
            payloadMethod = payloadMethodArrValues[i3];
            if (payloadMethod.X.equals(string2)) {
                break;
            }
            i3++;
        }
        PayloadMethod payloadMethod2 = payloadMethod;
        long jLongValue = jsonObjectApiK.n("creation_start_time_millis", 0L).longValue();
        long jLongValue2 = jsonObjectApiK.n("creation_start_count", 0L).longValue();
        long jLongValue3 = jsonObjectApiK.n("creation_time_millis", 0L).longValue();
        long jLongValue4 = jsonObjectApiK.n("uptime_millis", 0L).longValue();
        Boolean bool = Boolean.FALSE;
        PayloadMetadata payloadMetadata = new PayloadMetadata(payloadType2, payloadMethod2, jLongValue, jLongValue2, jLongValue3, jLongValue4, jsonObjectApiK.j("state_active", bool).booleanValue(), jsonObjectApiK.s(0, "state_active_count").intValue());
        JsonObjectApi jsonObjectApiK2 = jsonObjectApi.k("envelope", true);
        JsonObjectApi jsonObjectApiK3 = jsonObjectApi.k("data", true);
        String string3 = jsonObjectApi.getString("url", "");
        Uri uri = Uri.EMPTY;
        Uri uriO = ObjectUtil.o(string3);
        Uri uri2 = uriO != null ? uriO : uri;
        int iIntValue = jsonObjectApi.s(0, "lifetime_attempt_count").intValue();
        Boolean bool2 = Boolean.TRUE;
        return new Payload(payloadMetadata, jsonObjectApiK2, jsonObjectApiK3, uri2, iIntValue, jsonObjectApi.j("send_date_allowed", bool2).booleanValue(), jsonObjectApi.j("attempt_count_allowed", bool2).booleanValue(), jsonObjectApi.j("user_agent_allowed", bool2).booleanValue(), jsonObjectApi.j("filled", bool).booleanValue());
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final NetworkResponseApi a(Context context, int i2, long[] jArr) {
        NetworkRequest networkRequest;
        NetworkResponse networkResponseI;
        this.f0++;
        int[] iArr = a.f28256a;
        PayloadMetadata payloadMetadata = this.X;
        int i3 = iArr[payloadMetadata.f28258b.ordinal()];
        if (i3 == 1) {
            JsonObject jsonObjectC = this.f28255Y.c();
            JsonObject jsonObjectC2 = this.Z.c();
            jsonObjectC.r("data", jsonObjectC2);
            if (this.h0 && payloadMetadata.f28257a == PayloadType.n0) {
                jsonObjectC2.z(i2, "attempt_count");
            }
            if (this.g0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                StringBuilder sb = new StringBuilder();
                f(jsonObjectC.getString(e(new byte[]{110, 116, 95, 105, 100}), null), sb);
                f(jsonObjectC.getString(e(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 97, 112, 112, 95, 105, 100}), null), sb);
                f(jsonObjectC.getString(e(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 100, 101, 118, 105, 99, 101, 95, 105, 100}), null), sb);
                f(jsonObjectC.getString(e(new byte[]{115, 100, 107, 95, 118, 101, 114, 115, 105, 111, 110}), null), sb);
                f(jsonObjectC.getString(e(new byte[]{105, 110, 105, 116, 95, 116, 111, 107, 101, 110}), null), sb);
                f(str, sb);
                f(jsonObjectC2.getString(e(new byte[]{97, 100, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{97, 110, 100, 114, 111, 105, 100, 95, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{102, 105, 114, 101, 95, 97, 100, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{111, 97, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{97, 115, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{102, 98, 95, 97, 116, 116, 114, 105, 98, 117, 116, 105, 111, 110, 95, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{99, 117, 115, 116, 111, 109}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{99, 117, 115, 116, 111, 109, 95, 105, 100}), null), sb);
                f(jsonObjectC2.getString(e(new byte[]{99, 111, 110, 118, 101, 114, 115, 105, 111, 110, 95, 100, 97, 116, 97}), null), sb);
                f(jsonObjectC2.s(null, e(new byte[]{117, 115, 101, 114, 116, 105, 109, 101})), sb);
                JsonObjectApi jsonObjectApiK = jsonObjectC2.k(e(new byte[]{105, 100, 115}), false);
                if (jsonObjectApiK != null) {
                    f(jsonObjectApiK.getString(e(new byte[]{101, 109, 97, 105, 108}), null), sb);
                }
                JsonObjectApi jsonObjectApiK2 = jsonObjectC2.k(e(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (jsonObjectApiK2 != null) {
                    f(jsonObjectApiK2.getString(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb);
                    f(jsonObjectApiK2.getString(e(new byte[]{115, 116, 97, 116, 117, 115}), null), sb);
                    f(jsonObjectApiK2.n(e(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb);
                    f(jsonObjectApiK2.n(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb);
                }
                JsonObjectApi jsonObjectApiK3 = jsonObjectC2.k(e(new byte[]{104, 117, 97, 119, 101, 105, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (jsonObjectApiK3 != null) {
                    f(jsonObjectApiK3.getString(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb);
                    f(jsonObjectApiK3.getString(e(new byte[]{115, 116, 97, 116, 117, 115}), null), sb);
                    f(jsonObjectApiK3.n(e(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb);
                    f(jsonObjectApiK3.n(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb);
                }
                JsonObjectApi jsonObjectApiK4 = jsonObjectC2.k(e(new byte[]{115, 97, 109, 115, 117, 110, 103, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (jsonObjectApiK4 != null) {
                    f(jsonObjectApiK4.getString(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb);
                    f(jsonObjectApiK4.getString(e(new byte[]{115, 116, 97, 116, 117, 115}), null), sb);
                    f(jsonObjectApiK4.n(e(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb);
                    f(jsonObjectApiK4.n(e(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb);
                }
                long j = 0;
                for (byte b2 : sb.toString().getBytes(TextUtil.a())) {
                    j += (long) (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                }
                jsonObjectC.g("send_date", androidx.media3.extractor.text.ttml.a.n(str, mo.ono, String.format(Locale.US, "%03d", Long.valueOf(j % 1000)), "Z"));
            }
            networkRequest = new NetworkRequest(context, j(), new JsonElement(jsonObjectC));
        } else {
            if (i3 != 2) {
                throw new RuntimeException("Invalid method type");
            }
            networkRequest = new NetworkRequest(context, j(), null);
        }
        synchronized (networkRequest) {
            networkRequest.f28043e = jArr;
        }
        if (!this.i0) {
            synchronized (networkRequest) {
                try {
                    if (networkRequest.d == null) {
                        networkRequest.d = new HashMap();
                    }
                    networkRequest.d.put(Command.HTTP_HEADER_USER_AGENT, "");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (networkRequest) {
            networkResponseI = networkRequest.i(i2, this);
        }
        k0.a(networkResponseI.f28047e);
        return networkResponseI;
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final JsonObjectApi b() {
        return this.f28255Y.c();
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final synchronized boolean c(DataPointManager dataPointManager) {
        boolean z2;
        PayloadType payloadType = this.X.f28257a;
        synchronized (dataPointManager) {
            z2 = (dataPointManager.f28153h.contains(payloadType) || dataPointManager.f28155l.contains(payloadType)) ? false : true;
        }
        if (!z2) {
            return false;
        }
        if (this.X.f28257a == PayloadType.t0 && !dataPointManager.d(this.Z.getString(b.S0, ""))) {
            return false;
        }
        if (this.X.f28257a == PayloadType.o0) {
            JsonObjectApi jsonObjectApiK = this.Z.k("identity_link", true);
            if (jsonObjectApiK.length() == 0) {
                return false;
            }
            if (!dataPointManager.e((String) jsonObjectApiK.h().get(0))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final synchronized void d(Context context, DataPointManager dataPointManager) {
        try {
            this.g0 = dataPointManager.f(this.X.f28257a, "send_date");
            this.h0 = dataPointManager.f(this.X.f28257a, "attempt_count");
            this.i0 = dataPointManager.f(this.X.f28257a, Command.HTTP_HEADER_USER_AGENT);
            PayloadMetadata payloadMetadata = this.X;
            if (payloadMetadata.f28258b == PayloadMethod.Post) {
                dataPointManager.a(context, payloadMetadata, this.j0, this.f28255Y, this.Z);
            }
            this.j0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final JsonObjectApi getData() {
        return this.Z.c();
    }

    public final Uri j() {
        Uri uriB;
        Uri uri = this.e0;
        if (ObjectUtil.d(uri)) {
            return uri;
        }
        PayloadType payloadType = this.X.f28257a;
        if (payloadType == PayloadType.t0) {
            return payloadType.b(this.Z.getString(b.S0, ""));
        }
        synchronized (payloadType) {
            uriB = payloadType.b("");
        }
        return uriB;
    }

    @Override // com.kochava.tracker.payload.internal.PayloadApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        PayloadMetadata payloadMetadata = this.X;
        JsonObject jsonObjectW2 = JsonObject.w();
        jsonObjectW2.g("payload_type", payloadMetadata.f28257a.X);
        jsonObjectW2.g("payload_method", payloadMetadata.f28258b.X);
        jsonObjectW2.B(payloadMetadata.f28259c, "creation_start_time_millis");
        jsonObjectW2.B(payloadMetadata.d, "creation_start_count");
        jsonObjectW2.B(payloadMetadata.f28260e, "creation_time_millis");
        jsonObjectW2.B(payloadMetadata.f, "uptime_millis");
        jsonObjectW2.o("state_active", payloadMetadata.g);
        jsonObjectW2.z(payloadMetadata.f28261h, "state_active_count");
        jsonObjectW.r(TtmlNode.TAG_METADATA, jsonObjectW2);
        jsonObjectW.r("envelope", this.f28255Y);
        jsonObjectW.r("data", this.Z);
        jsonObjectW.g("url", this.e0.toString());
        jsonObjectW.z(this.f0, "lifetime_attempt_count");
        jsonObjectW.o("send_date_allowed", this.g0);
        jsonObjectW.o("attempt_count_allowed", this.h0);
        jsonObjectW.o("user_agent_allowed", this.i0);
        jsonObjectW.o("filled", this.j0);
        return jsonObjectW;
    }
}
