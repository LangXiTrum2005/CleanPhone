package patty;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gintrap implements maggot.marial<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.attabal f35121attabal;

    public gintrap(com.bumptech.glide.load.resource.bitmap.attabal attabalVar) {
        this.f35121attabal = attabalVar;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public endosteum.cutely<Bitmap> attabal(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        return this.f35121attabal.wireman(parcelFileDescriptor, i, i2, wiremanVar);
    }

    public final boolean marial(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean saneness(ParcelFileDescriptor parcelFileDescriptor, maggot.wireman wiremanVar) {
        return marial(parcelFileDescriptor) && this.f35121attabal.kowloon(parcelFileDescriptor);
    }
}
