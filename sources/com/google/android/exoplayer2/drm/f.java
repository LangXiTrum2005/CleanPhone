package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2333Ce;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2559Kw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4038mJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4147nc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2295As;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2297Au;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2507Iw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5231zs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2287Ak;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WU;
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

/* JADX INFO: loaded from: classes2.dex */
public final class f implements e {
    public static final C2297Au d = new C2297Au();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f803a;
    public final MediaDrm b;
    public int c;

    public f(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC4147nc.b;
        FW.i(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f803a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Ug0.f3833a >= 27 || !AbstractC4147nc.c.equals(uuid)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (AbstractC4147nc.d.equals(uuid) && "ASUS_Z00AD".equals(Ug0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final int a() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void b(final NN nn) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jw
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                com.google.android.exoplayer2.drm.f fVar = this.f3290a;
                NN nn2 = nn;
                fVar.getClass();
                HandlerC2730Rm handlerC2730Rm = ((com.google.android.exoplayer2.drm.b) nn2.b).x;
                handlerC2730Rm.getClass();
                handlerC2730Rm.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void c(byte[] bArr, WU wu) {
        if (Ug0.f3833a >= 31) {
            try {
                AbstractC2559Kw.b(this.b, bArr, wu);
            } catch (UnsupportedOperationException unused) {
                AbstractC4038mJ.f();
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void closeSession(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final InterfaceC2287Ak d(byte[] bArr) {
        int i = Ug0.f3833a;
        UUID uuid = this.f803a;
        boolean z = i < 21 && AbstractC4147nc.d.equals(uuid) && "L3".equals(this.b.getPropertyString("securityLevel"));
        if (i < 27 && AbstractC4147nc.c.equals(uuid)) {
            uuid = AbstractC4147nc.b;
        }
        return new C2507Iw(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final boolean e(byte[] bArr, String str) {
        if (Ug0.f3833a >= 31) {
            return AbstractC2559Kw.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f803a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    @Override // com.google.android.exoplayer2.drm.e
    public final C5231zs f(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        DrmInitData.SchemeData schemeData;
        A70 a70R;
        int i3;
        int i4;
        byte[] bArrS;
        UUID uuid = this.f803a;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (!AbstractC4147nc.d.equals(uuid)) {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else if (Ug0.f3833a < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        schemeData = (DrmInitData.SchemeData) list.get(0);
                        break;
                    }
                    DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i2);
                    byte[] bArr3 = schemeData3.data;
                    bArr3.getClass();
                    a70R = FW.R(bArr3);
                    if (a70R == null) {
                        i3 = -1;
                    } else {
                        i3 = a70R.b;
                    }
                    i4 = Ug0.f3833a;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        schemeData = schemeData3;
                        break;
                    }
                }
            } else {
                DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i5);
                        byte[] bArr4 = schemeData5.data;
                        bArr4.getClass();
                        if (!Ug0.a(schemeData5.mimeType, schemeData4.mimeType) || !Ug0.a(schemeData5.licenseServerUrl, schemeData4.licenseServerUrl) || FW.R(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    schemeData = (DrmInitData.SchemeData) list.get(0);
                                    break;
                                }
                                DrmInitData.SchemeData schemeData6 = (DrmInitData.SchemeData) list.get(i2);
                                byte[] bArr5 = schemeData6.data;
                                bArr5.getClass();
                                a70R = FW.R(bArr5);
                                if (a70R == null) {
                                    i3 = -1;
                                } else {
                                    i3 = a70R.b;
                                }
                                i4 = Ug0.f3833a;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                schemeData = schemeData6;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((DrmInitData.SchemeData) list.get(i7)).data;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        schemeData = new DrmInitData.SchemeData(schemeData4.uuid, schemeData4.licenseServerUrl, schemeData4.mimeType, bArr6);
                    }
                }
            }
            byte[] bArrF = schemeData.data;
            bArrF.getClass();
            UUID uuid2 = AbstractC4147nc.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrS2 = FW.S(bArrF, uuid);
                if (bArrS2 != null) {
                    bArrF = bArrS2;
                }
                JT jt = new JT(bArrF);
                int iH = jt.h();
                short sJ = jt.j();
                short sJ2 = jt.j();
                if (sJ == 1 && sJ2 == 1) {
                    short sJ3 = jt.j();
                    Charset charset = AbstractC2333Ce.e;
                    String strR = jt.r(sJ3, charset);
                    if (!strR.contains("<LA_URL>")) {
                        int iIndexOf = strR.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            AbstractC4038mJ.f();
                        }
                        String str2 = strR.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strR.substring(iIndexOf);
                        int i8 = iH + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sJ);
                        byteBufferAllocate.putShort(sJ2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrF = byteBufferAllocate.array();
                    }
                } else {
                    AbstractC4038mJ.e();
                }
                bArrF = FW.f(uuid2, null, bArrF);
            }
            int i9 = Ug0.f3833a;
            if (i9 < 23 && AbstractC4147nc.d.equals(uuid)) {
                bArrS = FW.S(bArrF, uuid);
                if (bArrS != null) {
                    bArrF = bArrS;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Ug0.c)) {
                String str3 = Ug0.d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrS = FW.S(bArrF, uuid);
                    if (bArrS != null) {
                        bArrF = bArrS;
                    }
                }
            }
            String str4 = schemeData.mimeType;
            str = (i9 < 26 && AbstractC4147nc.c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str4) || MimeTypes.AUDIO_MP4.equals(str4))) ? C.CENC_TYPE_cenc : str4;
            bArr2 = bArrF;
            schemeData2 = schemeData;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (AbstractC4147nc.c.equals(uuid) && Ug0.f3833a < 27) {
            data = Ug0.o(data).replace('+', '-').replace('/', '_').getBytes(AbstractC2333Ce.c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (Ug0.f3833a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null && !TextUtils.isEmpty(schemeData2.licenseServerUrl)) {
            defaultUrl = schemeData2.licenseServerUrl;
        }
        if (Ug0.f3833a >= 23) {
            keyRequest.getRequestType();
        }
        return new C5231zs(defaultUrl, data);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final C2295As getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new C2295As(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] openSession() {
        return this.b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (AbstractC4147nc.c.equals(this.f803a) && Ug0.f3833a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Ug0.o(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(AbstractC2333Ce.c);
            } catch (JSONException e) {
                AbstractC4038mJ.d("Failed to adjust response data: ".concat(Ug0.o(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final Map queryKeyStatus(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }
}
