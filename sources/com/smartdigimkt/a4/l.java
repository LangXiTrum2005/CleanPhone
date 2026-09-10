package com.smartdigimkt.a4;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import com.smartdigimkt.p4.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements j<k> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33659i = "cenc";
    private final UUID g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaDrm f33660h;

    public class a implements MediaDrm.OnEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.f f33661a;

        public a(j.f fVar) {
            this.f33661a = fVar;
        }

        @Override // android.media.MediaDrm.OnEventListener
        public void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
            this.f33661a.a(l.this, bArr, i2, i3, bArr2);
        }
    }

    public class b implements MediaDrm.OnKeyStatusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.g f33663a;

        public b(j.g gVar) {
            this.f33663a = gVar;
        }

        @Override // android.media.MediaDrm.OnKeyStatusChangeListener
        public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z2) {
            ArrayList arrayList = new ArrayList();
            for (MediaDrm.KeyStatus keyStatus : list) {
                arrayList.add(new j.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
            }
            this.f33663a.a(l.this, bArr, arrayList, z2);
        }
    }

    private l(UUID uuid) throws UnsupportedSchemeException {
        com.smartdigimkt.p4.a.a(uuid);
        UUID uuid2 = com.smartdigimkt.w3.b.i1;
        com.smartdigimkt.p4.a.a(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (f0.f37540a < 27 && com.smartdigimkt.w3.b.j1.equals(uuid)) {
            uuid = uuid2;
        }
        this.g = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.f33660h = mediaDrm;
        if (com.smartdigimkt.w3.b.k1.equals(uuid) && c()) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static l a(UUID uuid) throws o {
        try {
            return new l(uuid);
        } catch (Exception e2) {
            throw new o(2, e2);
        }
    }

    @Override // com.smartdigimkt.a4.j
    public byte[] b() throws MediaDrmException {
        return this.f33660h.openSession();
    }

    @Override // com.smartdigimkt.a4.j
    public void d(byte[] bArr) throws DeniedByServerException {
        this.f33660h.provideProvisionResponse(bArr);
    }

    @Override // com.smartdigimkt.a4.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k c(byte[] bArr) throws MediaCryptoException {
        return new k(new MediaCrypto(this.g, bArr), f0.f37540a < 21 && com.smartdigimkt.w3.b.k1.equals(this.g) && "L3".equals(b("securityLevel")));
    }

    @Override // com.smartdigimkt.a4.j
    public void release() {
        this.f33660h.release();
    }

    private static boolean c() {
        return "ASUS_Z00AD".equals(f0.d);
    }

    @Override // com.smartdigimkt.a4.j
    public void b(byte[] bArr) {
        this.f33660h.closeSession(bArr);
    }

    @Override // com.smartdigimkt.a4.j
    public void a(j.f<? super k> fVar) {
        this.f33660h.setOnEventListener(fVar == null ? null : new a(fVar));
    }

    @Override // com.smartdigimkt.a4.j
    public byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (com.smartdigimkt.w3.b.j1.equals(this.g)) {
            bArr2 = com.smartdigimkt.a4.a.b(bArr2);
        }
        return this.f33660h.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.smartdigimkt.a4.j
    public void a(j.g<? super k> gVar) {
        if (f0.f37540a >= 23) {
            this.f33660h.setOnKeyStatusChangeListener(gVar == null ? null : new b(gVar), (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.smartdigimkt.a4.j
    public String b(String str) {
        return this.f33660h.getPropertyString(str);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    @Override // com.smartdigimkt.a4.j
    public j.d a(byte[] bArr, byte[] bArr2, String str, int i2, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr3;
        byte[] bArrA;
        int i3 = f0.f37540a;
        if (i3 >= 21 || !com.smartdigimkt.w3.b.k1.equals(this.g)) {
            if (com.smartdigimkt.w3.b.l1.equals(this.g) && "Amazon".equals(f0.f37542c)) {
                String str2 = f0.d;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2)) {
                    bArrA = com.smartdigimkt.c4.h.a(bArr2, this.g);
                    if (bArrA != null) {
                        bArr3 = bArrA;
                    }
                }
            }
            bArr3 = bArr2;
        } else {
            bArrA = com.smartdigimkt.c4.h.a(bArr2, this.g);
            if (bArrA != null) {
                bArr3 = bArr2;
            } else {
                bArr3 = bArrA;
            }
        }
        if (i3 < 26 && com.smartdigimkt.w3.b.j1.equals(this.g) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
            str = "cenc";
        }
        MediaDrm.KeyRequest keyRequest = this.f33660h.getKeyRequest(bArr, bArr3, str, i2, map);
        byte[] data = keyRequest.getData();
        if (com.smartdigimkt.w3.b.j1.equals(this.g)) {
            data = com.smartdigimkt.a4.a.a(data);
        }
        return new j.a(data, keyRequest.getDefaultUrl());
    }

    @Override // com.smartdigimkt.a4.j
    public j.h a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f33660h.getProvisionRequest();
        return new j.c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.smartdigimkt.a4.j
    public Map<String, String> a(byte[] bArr) {
        return this.f33660h.queryKeyStatus(bArr);
    }

    @Override // com.smartdigimkt.a4.j
    public void a(byte[] bArr, byte[] bArr2) {
        this.f33660h.restoreKeys(bArr, bArr2);
    }

    @Override // com.smartdigimkt.a4.j
    public byte[] a(String str) {
        return this.f33660h.getPropertyByteArray(str);
    }

    @Override // com.smartdigimkt.a4.j
    public void a(String str, String str2) {
        this.f33660h.setPropertyString(str, str2);
    }

    @Override // com.smartdigimkt.a4.j
    public void a(String str, byte[] bArr) {
        this.f33660h.setPropertyByteArray(str, bArr);
    }
}
