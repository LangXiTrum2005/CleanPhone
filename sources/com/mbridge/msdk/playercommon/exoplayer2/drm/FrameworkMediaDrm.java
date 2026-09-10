package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(23)
public final class FrameworkMediaDrm implements ExoMediaDrm<FrameworkMediaCrypto> {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    private final MediaDrm mediaDrm;
    private final UUID uuid;

    @SuppressLint({"WrongConstant"})
    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        UUID uuid2 = C.COMMON_PSSH_UUID;
        Assertions.checkArgument(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (Util.SDK_INT < 27 && C.CLEARKEY_UUID.equals(uuid)) {
            uuid = uuid2;
        }
        this.uuid = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.mediaDrm = mediaDrm;
        if (C.WIDEVINE_UUID.equals(uuid) && needsForceL3Workaround()) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    private static boolean needsForceL3Workaround() {
        return "ASUS_Z00AD".equals(Util.MODEL);
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr3;
        byte[] schemeSpecificData;
        int i11 = Util.SDK_INT;
        if (i11 >= 21 || !C.WIDEVINE_UUID.equals(this.uuid)) {
            if (C.PLAYREADY_UUID.equals(this.uuid) && "Amazon".equals(Util.MANUFACTURER)) {
                String str2 = Util.MODEL;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2)) {
                    schemeSpecificData = PsshAtomUtil.parseSchemeSpecificData(bArr2, this.uuid);
                    if (schemeSpecificData != null) {
                        bArr3 = schemeSpecificData;
                    }
                }
            }
            bArr3 = bArr2;
        } else {
            schemeSpecificData = PsshAtomUtil.parseSchemeSpecificData(bArr2, this.uuid);
            if (schemeSpecificData != null) {
                bArr3 = bArr2;
            } else {
                bArr3 = schemeSpecificData;
            }
        }
        if (i11 < 26 && C.CLEARKEY_UUID.equals(this.uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) {
            str = "cenc";
        }
        MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArr3, str, i10, map);
        byte[] data = keyRequest.getData();
        if (C.CLEARKEY_UUID.equals(this.uuid)) {
            data = ClearKeyUtil.adjustRequestData(data);
        }
        return new ExoMediaDrm.DefaultKeyRequest(data, keyRequest.getDefaultUrl());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new ExoMediaDrm.DefaultProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void release() {
        this.mediaDrm.release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(final ExoMediaDrm.OnEventListener<? super FrameworkMediaCrypto> onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new MediaDrm.OnEventListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaDrm.1
            @Override // android.media.MediaDrm.OnEventListener
            public void onEvent(@NonNull MediaDrm mediaDrm, @Nullable byte[] bArr, int i10, int i11, byte[] bArr2) {
                onEventListener.onEvent(FrameworkMediaDrm.this, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(final ExoMediaDrm.OnKeyStatusChangeListener<? super FrameworkMediaCrypto> onKeyStatusChangeListener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaDrm.2
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(@NonNull MediaDrm mediaDrm, @NonNull byte[] bArr, @NonNull List<MediaDrm.KeyStatus> list, boolean z10) {
                ArrayList arrayList = new ArrayList();
                for (MediaDrm.KeyStatus keyStatus : list) {
                    arrayList.add(new ExoMediaDrm.DefaultKeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                }
                onKeyStatusChangeListener.onKeyStatusChange(FrameworkMediaDrm.this, bArr, arrayList, z10);
            }
        }, (Handler) null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public FrameworkMediaCrypto createMediaCrypto(byte[] bArr) throws MediaCryptoException {
        return new FrameworkMediaCrypto(new MediaCrypto(this.uuid, bArr), Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel")));
    }
}
