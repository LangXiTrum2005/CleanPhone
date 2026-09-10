package sevenfold;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: GifBitmapProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness implements terni.attabal.InterfaceC0809attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.wireman f37585attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trawler.saneness f37586saneness;

    public saneness(trawler.wireman wiremanVar, trawler.saneness sanenessVar) {
        this.f37585attabal = wiremanVar;
        this.f37586saneness = sanenessVar;
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public void attabal(Bitmap bitmap) {
        this.f37585attabal.dern(bitmap);
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public void beachfront(int[] iArr) {
        trawler.saneness sanenessVar = this.f37586saneness;
        if (sanenessVar == null) {
            return;
        }
        sanenessVar.put(iArr);
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public Bitmap dern(int i, int i2, Bitmap.Config config) {
        return this.f37585attabal.marial(i, i2, config);
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public void marial(byte[] bArr) {
        trawler.saneness sanenessVar = this.f37586saneness;
        if (sanenessVar == null) {
            return;
        }
        sanenessVar.put(bArr);
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public byte[] saneness(int i) {
        trawler.saneness sanenessVar = this.f37586saneness;
        return sanenessVar == null ? new byte[i] : (byte[]) sanenessVar.dern(i, byte[].class);
    }

    @Override // terni.attabal.InterfaceC0809attabal
    public int[] wireman(int i) {
        trawler.saneness sanenessVar = this.f37586saneness;
        return sanenessVar == null ? new int[i] : (int[]) sanenessVar.dern(i, int[].class);
    }
}
