package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import incorrectly.ctenidium;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import nattier.kowloon;
import puffin.dovishness;
import puffin.polloi;

/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements competently {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final competently.dern f11865wireman = new competently.dern() { // from class: puffin.molybdenite
        @Override // androidx.media3.exoplayer.drm.competently.dern
        public final androidx.media3.exoplayer.drm.competently attabal(UUID uuid) {
            return androidx.media3.exoplayer.drm.impromptu.competently(uuid);
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final UUID f11866attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f11867dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MediaDrm f11868saneness;

    /* JADX INFO: compiled from: FrameworkMediaDrm.java */
    public static class attabal {
        public static boolean attabal(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void saneness(MediaDrm mediaDrm, byte[] bArr, ctenidium ctenidiumVar) {
            LogSessionId logSessionIdAttabal = ctenidiumVar.attabal();
            if (logSessionIdAttabal.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            dovishness.attabal(decarock.attabal.marial(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdAttabal);
        }
    }

    public impromptu(UUID uuid) throws UnsupportedSchemeException {
        decarock.attabal.marial(uuid);
        decarock.attabal.saneness(!androidx.media3.common.competently.f10815saneness.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11866attabal = uuid;
        MediaDrm mediaDrm = new MediaDrm(triweekly(uuid));
        this.f11868saneness = mediaDrm;
        this.f11867dern = 1;
        if (androidx.media3.common.competently.f10816wireman.equals(uuid) && graveside()) {
            arytenoidectomy(mediaDrm);
        }
    }

    public static impromptu adultoid(UUID uuid) throws UnsupportedDrmException {
        try {
            return new impromptu(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    public static byte[] apical(UUID uuid, byte[] bArr) {
        return androidx.media3.common.competently.f10813dern.equals(uuid) ? puffin.attabal.attabal(bArr) : bArr;
    }

    public static void arytenoidectomy(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static /* synthetic */ competently competently(UUID uuid) {
        try {
            return adultoid(uuid);
        } catch (UnsupportedDrmException unused) {
            triweekly.dern("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new marial();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    public static byte[] formularize(UUID uuid, byte[] bArr) {
        byte[] bArrMarial;
        UUID uuid2 = androidx.media3.common.competently.f10814marial;
        if (uuid2.equals(uuid)) {
            byte[] bArrMarial2 = kowloon.marial(bArr, uuid);
            if (bArrMarial2 != null) {
                bArr = bArrMarial2;
            }
            bArr = kowloon.attabal(uuid2, taiyuan(bArr));
        }
        if (grimness.f25080attabal < 23 && androidx.media3.common.competently.f10816wireman.equals(uuid)) {
            bArrMarial = kowloon.marial(bArr, uuid);
            if (bArrMarial != null) {
                return bArrMarial;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(grimness.f25084dern)) {
            String str = grimness.f25094wireman;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrMarial = kowloon.marial(bArr, uuid);
                if (bArrMarial != null) {
                    return bArrMarial;
                }
            }
        }
        return bArr;
    }

    public static boolean graveside() {
        return "ASUS_Z00AD".equals(grimness.f25094wireman);
    }

    public static String impassible(UUID uuid, String str) {
        return (grimness.f25080attabal < 26 && androidx.media3.common.competently.f10813dern.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    public static /* synthetic */ void impromptu(impromptu impromptuVar, competently.saneness sanenessVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        impromptuVar.getClass();
        sanenessVar.attabal(impromptuVar, bArr, i, i2, bArr2);
    }

    public static DrmInitData.SchemeData polloi(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!androidx.media3.common.competently.f10816wireman.equals(uuid)) {
            return list.get(0);
        }
        if (grimness.f25080attabal >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        byte[] bArr2 = (byte[]) decarock.attabal.marial(list.get(i3).f10586molybdenite);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i2, length2);
                        i2 += length2;
                    }
                    return schemeData.attabal(bArr);
                }
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr3 = (byte[]) decarock.attabal.marial(schemeData2.f10586molybdenite);
                if (!grimness.dern(schemeData2.f10588polloi, schemeData.f10588polloi) || !grimness.dern(schemeData2.f10587monoploid, schemeData.f10587monoploid) || !kowloon.dern(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i++;
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            int iCompetently = kowloon.competently((byte[]) decarock.attabal.marial(schemeData3.f10586molybdenite));
            int i5 = grimness.f25080attabal;
            if ((i5 < 23 && iCompetently == 0) || (i5 >= 23 && iCompetently == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static byte[] taiyuan(byte[] bArr) {
        stratoscope stratoscopeVar = new stratoscope(bArr);
        int iAdultoid = stratoscopeVar.adultoid();
        short sGintrap = stratoscopeVar.gintrap();
        short sGintrap2 = stratoscopeVar.gintrap();
        if (sGintrap != 1 || sGintrap2 != 1) {
            triweekly.beachfront("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sGintrap3 = stratoscopeVar.gintrap();
        Charset charset = com.google.common.base.dern.f21535marial;
        String strSealless = stratoscopeVar.sealless(sGintrap3, charset);
        if (strSealless.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strSealless.indexOf("</DATA>");
        if (iIndexOf == -1) {
            triweekly.impromptu("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strSealless.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strSealless.substring(iIndexOf);
        int i = iAdultoid + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sGintrap);
        byteBufferAllocate.putShort(sGintrap2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static UUID triweekly(UUID uuid) {
        return (grimness.f25080attabal >= 27 || !androidx.media3.common.competently.f10813dern.equals(uuid)) ? uuid : androidx.media3.common.competently.f10815saneness;
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void attabal(byte[] bArr, ctenidium ctenidiumVar) {
        if (grimness.f25080attabal >= 31) {
            try {
                attabal.saneness(this.f11868saneness, bArr, ctenidiumVar);
            } catch (UnsupportedOperationException unused) {
                triweekly.impromptu("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public competently.attabal beachfront(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataPolloi;
        byte[] bArrFormularize;
        String strImpassible;
        if (list != null) {
            schemeDataPolloi = polloi(this.f11866attabal, list);
            bArrFormularize = formularize(this.f11866attabal, (byte[]) decarock.attabal.marial(schemeDataPolloi.f10586molybdenite));
            strImpassible = impassible(this.f11866attabal, schemeDataPolloi.f10588polloi);
        } else {
            schemeDataPolloi = null;
            bArrFormularize = null;
            strImpassible = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f11868saneness.getKeyRequest(bArr, bArrFormularize, strImpassible, i, map);
        byte[] bArrApical = apical(this.f11866attabal, keyRequest.getData());
        String strCutely = cutely(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strCutely) && schemeDataPolloi != null && !TextUtils.isEmpty(schemeDataPolloi.f10587monoploid)) {
            strCutely = schemeDataPolloi.f10587monoploid;
        }
        return new competently.attabal(bArrApical, strCutely, grimness.f25080attabal >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void closeSession(byte[] bArr) {
        this.f11868saneness.closeSession(bArr);
    }

    public final String cutely(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (grimness.f25080attabal >= 33 && "https://default.url".equals(str)) {
            String strMonoploid = monoploid("version");
            if (Objects.equals(strMonoploid, "1.2") || Objects.equals(strMonoploid, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    public final boolean dovishness() {
        return grimness.f25080attabal < 21 && androidx.media3.common.competently.f10816wireman.equals(this.f11866attabal) && "L3".equals(monoploid("securityLevel"));
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public competently.wireman getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f11868saneness.getProvisionRequest();
        return new competently.wireman(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.competently
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public polloi dern(byte[] bArr) throws MediaCryptoException {
        return new polloi(triweekly(this.f11866attabal), bArr, dovishness());
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void marial(final competently.saneness sanenessVar) {
        this.f11868saneness.setOnEventListener(sanenessVar == null ? null : new MediaDrm.OnEventListener() { // from class: puffin.graveside
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                androidx.media3.exoplayer.drm.impromptu.impromptu(this.f36018attabal, sanenessVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    public final boolean molybdenite() {
        if (!this.f11866attabal.equals(androidx.media3.common.competently.f10816wireman)) {
            return this.f11866attabal.equals(androidx.media3.common.competently.f10813dern);
        }
        String strMonoploid = monoploid("version");
        return (strMonoploid.startsWith("v5.") || strMonoploid.startsWith("14.") || strMonoploid.startsWith("15.") || strMonoploid.startsWith("16.0")) ? false : true;
    }

    public String monoploid(String str) {
        return this.f11868saneness.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public byte[] openSession() throws MediaDrmException {
        return this.f11868saneness.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (androidx.media3.common.competently.f10813dern.equals(this.f11866attabal)) {
            bArr2 = puffin.attabal.saneness(bArr2);
        }
        return this.f11868saneness.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f11868saneness.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f11868saneness.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public synchronized void release() {
        int i = this.f11867dern - 1;
        this.f11867dern = i;
        if (i == 0) {
            this.f11868saneness.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f11868saneness.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public int saneness() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.competently
    public boolean wireman(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (grimness.f25080attabal < 31 || !molybdenite()) {
            MediaCrypto mediaCrypto = null;
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(this.f11866attabal, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    zRequiresSecureDecoderComponent = true;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            zRequiresSecureDecoderComponent = attabal.attabal(this.f11868saneness, str);
        }
        return zRequiresSecureDecoderComponent && !dovishness();
    }
}
