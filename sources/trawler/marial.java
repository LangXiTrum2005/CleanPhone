package trawler;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial implements wireman {
    @Override // trawler.wireman
    public void dern(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // trawler.wireman
    public Bitmap marial(int i, int i2, Bitmap.Config config) {
        return wireman(i, i2, config);
    }

    @Override // trawler.wireman
    public Bitmap wireman(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // trawler.wireman
    public void saneness() {
    }

    @Override // trawler.wireman
    public void attabal(int i) {
    }
}
