package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SurfaceHolderCallbackC1186Yo implements InterfaceC1655h8, InterfaceC1015Rp, InterfaceC1388cm, InterfaceC1202Ze, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"Z7fFktboAp3k7BlwFx9kKXTgtEqM2", "6t6gPLmMpHTpKPKBFICdS", "Od3oRQxfgGNDNTHMX59YmGVoYglNL2ad", "rr7fBKqADkKZ9sFApFVHjpSFw9Gi3490", "C1v2DgMzcHJoE8RMETWj1", "iL95WQpciADgGkLhpjhDtTNobAHZTPwc", "pr8ytYZQc9t0YNLVJYsHtVxRqGH04BbT", "HzmcmBYNRR6wTRrU4WrkpZWtLSSmNSo0"};
    public final /* synthetic */ C0676Dy A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final /* synthetic */ void ACM(ZM zm, OD od) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final /* synthetic */ void ACN(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final /* synthetic */ void ACO(Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final /* synthetic */ void ACk(int i, long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final /* synthetic */ void AF7(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final /* synthetic */ void AFd(ZM zm, OD od) {
    }

    public SurfaceHolderCallbackC1186Yo(C0676Dy c0676Dy) {
        this.A00 = c0676Dy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final void ACI(String str, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC1015Rp) it.next()).ACI(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final void ACJ(OA oa) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC1015Rp) it.next()).ACJ(oa);
        }
        this.A00.A09 = null;
        this.A00.A07 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final void ACK(OA oa) {
        this.A00.A07 = oa;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC1015Rp) it.next()).ACK(oa);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final void ACL(ZM zm) {
        this.A00.A09 = zm;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC1015Rp) it.next()).ACL(zm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1015Rp
    public final void ACR(int i, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC1015Rp) it.next()).ACR(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1388cm
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACo(C0980Qf c0980Qf) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((QJ) it.next()).ACo(c0980Qf);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1388cm
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACp(List<C0982Qh> list) {
        Iterator it = this.A00.A0I.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[6].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            A01[0] = "rLu";
            if (zHasNext) {
                ((QJ) it.next()).ACp(list);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AD0(int i, long j) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC1655h8) it.next()).AD0(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1202Ze
    public final void AE8(Metadata metadata, long j) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((InterfaceC1202Ze) it.next()).AE8(metadata, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AEp(Object obj, long j) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655h8) it2.next()).AEp(obj, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AFV(String str, long j, long j2) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC1655h8) it.next()).AFV(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AFW(OA oa) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC1655h8) it.next()).AFW(oa);
        }
        this.A00.A0A = null;
        this.A00.A08 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AFX(OA oa) {
        this.A00.A08 = oa;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC1655h8) it.next()).AFX(oa);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AFc(ZM zm) {
        this.A00.A0A = zm;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC1655h8) it.next()).AFc(zm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655h8
    public final void AFj(Y2 y2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC1639gs) it.next()).AFi(y2.A03, y2.A01, y2.A02, y2.A00);
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            if (A01[0].length() == 21) {
                throw new RuntimeException();
            }
            A01[0] = "uNNKsXHCcGODr1Xhe75sSycP";
            if (zHasNext) {
                ((InterfaceC1655h8) it2.next()).AFj(y2);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
