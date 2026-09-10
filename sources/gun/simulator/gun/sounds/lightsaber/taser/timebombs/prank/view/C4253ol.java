package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4253ol extends AbstractC3763j9 {
    public C4868vl e;
    public byte[] f;
    public int g;
    public int h;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        if (this.f != null) {
            this.f = null;
            h();
        }
        this.e = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) throws C4604sl, KT {
        i();
        this.e = c4868vl;
        Uri uri = c4868vl.f5150a;
        String scheme = uri.getScheme();
        FW.i("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = Ug0.f3833a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new KT("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new KT(AbstractC3888ke0.i("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str, AbstractC2333Ce.f2932a.name()).getBytes(AbstractC2333Ce.c);
        }
        byte[] bArr = this.f;
        long length = bArr.length;
        long j = c4868vl.f;
        if (j > length) {
            this.f = null;
            throw new C4604sl(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int length2 = bArr.length - i2;
        this.h = length2;
        long j2 = c4868vl.g;
        if (j2 != -1) {
            this.h = (int) Math.min(length2, j2);
        }
        j(c4868vl);
        return j2 != -1 ? j2 : this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        C4868vl c4868vl = this.e;
        if (c4868vl != null) {
            return c4868vl.f5150a;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = Ug0.f3833a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        g(iMin);
        return iMin;
    }
}
