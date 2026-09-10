package patty;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal<DataType> implements maggot.marial<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final maggot.marial<DataType, Bitmap> f35104attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Resources f35105saneness;

    public attabal(Resources resources, maggot.marial<DataType, Bitmap> marialVar) {
        this.f35105saneness = (Resources) com.bumptech.glide.util.apical.wireman(resources);
        this.f35104attabal = (maggot.marial) com.bumptech.glide.util.apical.wireman(marialVar);
    }

    @Override // maggot.marial
    public endosteum.cutely<BitmapDrawable> attabal(DataType datatype, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        return dovishness.wireman(this.f35105saneness, this.f35104attabal.attabal(datatype, i, i2, wiremanVar));
    }

    @Override // maggot.marial
    public boolean saneness(DataType datatype, maggot.wireman wiremanVar) throws IOException {
        return this.f35104attabal.saneness(datatype, wiremanVar);
    }
}
