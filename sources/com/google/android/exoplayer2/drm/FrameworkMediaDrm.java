package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.q;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    public static final f d = new f(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f17490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f17491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17492c;

    public static class Api31 {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, PlayerId playerId) {
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            q.e(playbackComponent).setLogSessionId(logSessionIdA);
        }
    }

    public FrameworkMediaDrm(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C.f16998b;
        Assertions.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f17490a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util.f18979a >= 27 || !C.f16999c.equals(uuid)) ? uuid : uuid2);
        this.f17491b = mediaDrm;
        this.f17492c = 1;
        if (C.d.equals(uuid) && "ASUS_Z00AD".equals(Util.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final int a() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final CryptoConfig b(byte[] bArr) {
        int i2 = Util.f18979a;
        UUID uuid = this.f17490a;
        boolean z2 = i2 < 21 && C.d.equals(uuid) && "L3".equals(this.f17491b.getPropertyString("securityLevel"));
        if (i2 < 27 && C.f16999c.equals(uuid)) {
            uuid = C.f16998b;
        }
        return new FrameworkCryptoConfig(uuid, bArr, z2);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest c(byte[] bArr, List list, int i2, HashMap map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        int i3;
        int i4;
        byte[] bArrB;
        UUID uuid = this.f17490a;
        if (list != null) {
            if (!C.d.equals(uuid)) {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else if (Util.f18979a < 28 || list.size() <= 1) {
                i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        schemeData = (DrmInitData.SchemeData) list.get(0);
                        break;
                    }
                    DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i3);
                    byte[] bArr3 = schemeData2.f0;
                    bArr3.getClass();
                    int iC = PsshAtomUtil.c(bArr3);
                    i4 = Util.f18979a;
                    if ((i4 >= 23 && iC == 0) || (i4 >= 23 && iC == 1)) {
                        schemeData = schemeData2;
                        break;
                    }
                }
            } else {
                DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(i5);
                        byte[] bArr4 = schemeData4.f0;
                        bArr4.getClass();
                        if (!Util.a(schemeData4.e0, schemeData3.e0) || !Util.a(schemeData4.Z, schemeData3.Z) || PsshAtomUtil.a(bArr4) == null) {
                            i3 = 0;
                            while (true) {
                                if (i3 < list.size()) {
                                    schemeData = (DrmInitData.SchemeData) list.get(0);
                                    break;
                                }
                                DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i3);
                                byte[] bArr5 = schemeData5.f0;
                                bArr5.getClass();
                                int iC2 = PsshAtomUtil.c(bArr5);
                                i4 = Util.f18979a;
                                i3 = i4 >= 23 ? i3 + 1 : i3 + 1;
                                schemeData = schemeData5;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((DrmInitData.SchemeData) list.get(i7)).f0;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        schemeData = new DrmInitData.SchemeData(schemeData3.f17475Y, schemeData3.Z, schemeData3.e0, bArr6);
                    }
                }
            }
            byte[] bArrArray = schemeData.f0;
            bArrArray.getClass();
            UUID uuid2 = C.f17000e;
            if (uuid2.equals(uuid)) {
                byte[] bArrB2 = PsshAtomUtil.b(bArrArray, uuid);
                if (bArrB2 != null) {
                    bArrArray = bArrB2;
                }
                ParsableByteArray parsableByteArray = new ParsableByteArray(bArrArray);
                int i8 = parsableByteArray.i();
                short sK = parsableByteArray.k();
                short sK2 = parsableByteArray.k();
                if (sK == 1 && sK2 == 1) {
                    short sK3 = parsableByteArray.k();
                    Charset charset = Charsets.f19706e;
                    String strS = parsableByteArray.s(sK3, charset);
                    if (!strS.contains("<LA_URL>")) {
                        int iIndexOf = strS.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            Log.g("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strS.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strS.substring(iIndexOf);
                        int i9 = i8 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i9);
                        byteBufferAllocate.putShort(sK);
                        byteBufferAllocate.putShort(sK2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrArray = byteBufferAllocate.array();
                    }
                } else {
                    Log.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                int length3 = (bArrArray != null ? bArrArray.length : 0) + 32;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length3);
                byteBufferAllocate2.putInt(length3);
                byteBufferAllocate2.putInt(1886614376);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArrArray != null && bArrArray.length != 0) {
                    byteBufferAllocate2.putInt(bArrArray.length);
                    byteBufferAllocate2.put(bArrArray);
                }
                bArrArray = byteBufferAllocate2.array();
            }
            int i10 = Util.f18979a;
            if (i10 < 23 && C.d.equals(uuid)) {
                bArrB = PsshAtomUtil.b(bArrArray, uuid);
                if (bArrB != null) {
                    bArrArray = bArrB;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Util.f18981c)) {
                String str3 = Util.d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrB = PsshAtomUtil.b(bArrArray, uuid);
                    if (bArrB != null) {
                        bArrArray = bArrB;
                    }
                }
            }
            str = schemeData.e0;
            if (i10 < 26 && C.f16999c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
                str = "cenc";
            }
            bArr2 = bArrArray;
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f17491b.getKeyRequest(bArr, bArr2, str, i2, map);
        byte[] data = keyRequest.getData();
        if (C.f16999c.equals(uuid) && Util.f18979a < 27) {
            Charset charset2 = Charsets.f19705c;
            data = new String(data, charset2).replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_').getBytes(charset2);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (Util.f18979a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null) {
            String str4 = schemeData.Z;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Util.f18979a >= 23) {
            keyRequest.getRequestType();
        }
        return new ExoMediaDrm.KeyRequest(data, defaultUrl);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        this.f17491b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final boolean d(String str, byte[] bArr) {
        if (Util.f18979a >= 31) {
            return Api31.a(this.f17491b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f17490a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void e(byte[] bArr, PlayerId playerId) {
        if (Util.f18979a >= 31) {
            try {
                Api31.b(this.f17491b, bArr, playerId);
            } catch (UnsupportedOperationException unused) {
                Log.g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void f(final ExoMediaDrm.OnEventListener onEventListener) {
        this.f17491b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.c
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                this.f17499a.getClass();
                DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler = ((DefaultDrmSessionManager.MediaDrmEventListener) onEventListener).f17468a.f17467i;
                mediaDrmHandler.getClass();
                mediaDrmHandler.obtainMessage(i2, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f17491b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] openSession() {
        return this.f17491b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (C.f16999c.equals(this.f17490a) && Util.f18979a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, Charsets.f19705c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (i2 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(Charsets.f19705c);
            } catch (JSONException e2) {
                Log.d("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, Charsets.f19705c)), e2);
            }
        }
        return this.f17491b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f17491b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final Map queryKeyStatus(byte[] bArr) {
        return this.f17491b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final synchronized void release() {
        int i2 = this.f17492c - 1;
        this.f17492c = i2;
        if (i2 == 0) {
            this.f17491b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f17491b.restoreKeys(bArr, bArr2);
    }
}
