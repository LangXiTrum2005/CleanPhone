package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.analytics.q;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.base.Charsets;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    public static final I.a d = new I.a(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f6238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f6239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6240c;

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
        UUID uuid2 = C.f5379b;
        Assertions.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f6238a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util.f5683a >= 27 || !C.f5380c.equals(uuid)) ? uuid : uuid2);
        this.f6239b = mediaDrm;
        this.f6240c = 1;
        if (C.d.equals(uuid) && "ASUS_Z00AD".equals(Util.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int a() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final CryptoConfig b(byte[] bArr) {
        g();
        int i2 = Util.f5683a;
        UUID uuid = this.f6238a;
        if (i2 < 27 && C.f5380c.equals(uuid)) {
            uuid = C.f5379b;
        }
        return new FrameworkCryptoConfig(uuid, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x023e  */
    /* JADX WARN: Code duplicated, block: B:136:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest c(byte[] bArr, List list, int i2, HashMap map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        int i3;
        PsshAtomUtil.PsshAtom psshAtomA;
        int i4;
        int i5;
        byte[] bArrB;
        UUID uuid = this.f6238a;
        if (list != null) {
            if (!C.d.equals(uuid)) {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else if (Util.f5683a < 28 || list.size() <= 1) {
                i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        schemeData = (DrmInitData.SchemeData) list.get(0);
                        break;
                    }
                    DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i3);
                    byte[] bArr3 = schemeData2.f0;
                    bArr3.getClass();
                    psshAtomA = PsshAtomUtil.a(bArr3);
                    if (psshAtomA == null) {
                        i4 = -1;
                    } else {
                        i4 = psshAtomA.f7130b;
                    }
                    i5 = Util.f5683a;
                    if ((i5 >= 23 && i4 == 0) || (i5 >= 23 && i4 == 1)) {
                        schemeData = schemeData2;
                        break;
                    }
                }
            } else {
                DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(0);
                int i6 = 0;
                int length = 0;
                while (true) {
                    if (i6 < list.size()) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(i6);
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
                                psshAtomA = PsshAtomUtil.a(bArr5);
                                if (psshAtomA == null) {
                                    i4 = -1;
                                } else {
                                    i4 = psshAtomA.f7130b;
                                }
                                i5 = Util.f5683a;
                                i3 = i5 >= 23 ? i3 + 1 : i3 + 1;
                                schemeData = schemeData5;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i6++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i7 = 0;
                        for (int i8 = 0; i8 < list.size(); i8++) {
                            byte[] bArr7 = ((DrmInitData.SchemeData) list.get(i8)).f0;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i7, length2);
                            i7 += length2;
                        }
                        schemeData = new DrmInitData.SchemeData(schemeData3.f5396Y, schemeData3.Z, schemeData3.e0, bArr6);
                    }
                }
            }
            byte[] bArrArray = schemeData.f0;
            bArrArray.getClass();
            UUID uuid2 = C.f5381e;
            if (uuid2.equals(uuid)) {
                byte[] bArrB2 = PsshAtomUtil.b(bArrArray, uuid);
                if (bArrB2 != null) {
                    bArrArray = bArrB2;
                }
                ParsableByteArray parsableByteArray = new ParsableByteArray(bArrArray);
                int i9 = parsableByteArray.i();
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
                        int i10 = i9 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i10);
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
                if (bArrArray == null || bArrArray.length == 0) {
                    byteBufferAllocate2.putInt(0);
                } else {
                    byteBufferAllocate2.putInt(bArrArray.length);
                    byteBufferAllocate2.put(bArrArray);
                }
                bArrArray = byteBufferAllocate2.array();
            }
            int i11 = Util.f5683a;
            if (i11 < 23 && C.d.equals(uuid)) {
                bArrB = PsshAtomUtil.b(bArrArray, uuid);
                if (bArrB != null) {
                    bArrArray = bArrB;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Util.f5685c)) {
                String str3 = Util.d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrB = PsshAtomUtil.b(bArrArray, uuid);
                    if (bArrB != null) {
                        bArrArray = bArrB;
                    }
                }
            }
            str = schemeData.e0;
            if (i11 < 26 && C.f5380c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
                str = "cenc";
            }
            bArr2 = bArrArray;
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f6239b.getKeyRequest(bArr, bArr2, str, i2, map);
        byte[] data = keyRequest.getData();
        if (C.f5380c.equals(uuid) && Util.f5683a < 27) {
            data = Util.n(data).replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_').getBytes(Charsets.f19705c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Util.f5683a >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f6239b.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null) {
            String str4 = schemeData.Z;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Util.f5683a >= 23) {
            keyRequest.getRequestType();
        }
        return new ExoMediaDrm.KeyRequest(data, defaultUrl);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        this.f6239b.closeSession(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean d(String str, byte[] bArr) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i2 = Util.f5683a;
        UUID uuid = this.f6238a;
        if (i2 >= 31) {
            boolean zEquals2 = uuid.equals(C.d);
            MediaDrm mediaDrm = this.f6239b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C.f5380c);
            }
            if (zEquals) {
                zRequiresSecureDecoderComponent = Api31.a(mediaDrm, str);
            } else {
                MediaCrypto mediaCrypto2 = null;
                try {
                    mediaCrypto = new MediaCrypto(uuid, bArr);
                    try {
                        zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                        mediaCrypto.release();
                    } catch (MediaCryptoException unused) {
                        mediaCrypto2 = mediaCrypto;
                        if (mediaCrypto2 != null) {
                            mediaCrypto2.release();
                        }
                        zRequiresSecureDecoderComponent = true;
                    } catch (Throwable th) {
                        th = th;
                        mediaCrypto2 = mediaCrypto;
                        if (mediaCrypto2 != null) {
                            mediaCrypto2.release();
                        }
                        throw th;
                    }
                } catch (MediaCryptoException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } else {
            MediaCrypto mediaCrypto3 = null;
            mediaCrypto = new MediaCrypto(uuid, bArr);
            zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
        }
        return zRequiresSecureDecoderComponent && !g();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void e(final ExoMediaDrm.OnEventListener onEventListener) {
        this.f6239b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.c
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                this.f6247a.getClass();
                DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler = ((DefaultDrmSessionManager.MediaDrmEventListener) onEventListener).f6218a.f6217i;
                mediaDrmHandler.getClass();
                mediaDrmHandler.obtainMessage(i2, bArr).sendToTarget();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void f(byte[] bArr, PlayerId playerId) {
        if (Util.f5683a >= 31) {
            try {
                Api31.b(this.f6239b, bArr, playerId);
            } catch (UnsupportedOperationException unused) {
                Log.g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public final boolean g() {
        return Util.f5683a < 21 && C.d.equals(this.f6238a) && "L3".equals(this.f6239b.getPropertyString("securityLevel"));
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6239b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] openSession() {
        return this.f6239b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (C.f5380c.equals(this.f6238a) && Util.f5683a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Util.n(bArr2));
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
                Log.d("ClearKeyUtil", "Failed to adjust response data: ".concat(Util.n(bArr2)), e2);
            }
        }
        return this.f6239b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f6239b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map queryKeyStatus(byte[] bArr) {
        return this.f6239b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final synchronized void release() {
        int i2 = this.f6240c - 1;
        this.f6240c = i2;
        if (i2 == 0) {
            this.f6239b.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f6239b.restoreKeys(bArr, bArr2);
    }
}
