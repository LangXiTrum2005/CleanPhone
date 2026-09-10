package trawler;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes2.dex */
public class apical implements wireman {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Bitmap.Config f38940apical = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f38941attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f38942beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f38943competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f38944cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f38945dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f38946impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f38947marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<Bitmap.Config> f38948saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f38949taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f38950wireman;

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public interface attabal {
        void attabal(Bitmap bitmap);

        void saneness(Bitmap bitmap);
    }

    public apical(long j, formularize formularizeVar, Set<Bitmap.Config> set) {
        this.f38945dern = j;
        this.f38947marial = j;
        this.f38941attabal = formularizeVar;
        this.f38948saneness = set;
        this.f38950wireman = new saneness();
    }

    public static Set<Bitmap.Config> apical() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static void arytenoidectomy(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        kowloon(bitmap);
    }

    public static void beachfront(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    public static Bitmap competently(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f38940apical;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public static formularize formularize() {
        return new kowloon();
    }

    public static void kowloon(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    @Override // trawler.wireman
    public void attabal(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            saneness();
        } else if (i >= 20 || i == 15) {
            monoploid(triweekly() / 2);
        }
    }

    public final void cutely() {
        monoploid(this.f38947marial);
    }

    @Override // trawler.wireman
    public synchronized void dern(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f38941attabal.marial(bitmap) <= this.f38947marial && this.f38948saneness.contains(bitmap.getConfig())) {
                int iMarial = this.f38941attabal.marial(bitmap);
                this.f38941attabal.dern(bitmap);
                this.f38950wireman.saneness(bitmap);
                this.f38949taiyuan++;
                this.f38942beachfront += (long) iMarial;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f38941attabal.attabal(bitmap);
                }
                impromptu();
                cutely();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f38941attabal.attabal(bitmap);
                bitmap.isMutable();
                this.f38948saneness.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap impassible(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapWireman;
        try {
            beachfront(config);
            bitmapWireman = this.f38941attabal.wireman(i, i2, config != null ? config : f38940apical);
            if (bitmapWireman == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f38941attabal.saneness(i, i2, config);
                }
                this.f38946impromptu++;
            } else {
                this.f38943competently++;
                this.f38942beachfront -= (long) this.f38941attabal.marial(bitmapWireman);
                this.f38950wireman.attabal(bitmapWireman);
                arytenoidectomy(bitmapWireman);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f38941attabal.saneness(i, i2, config);
            }
            impromptu();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapWireman;
    }

    public final void impromptu() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            taiyuan();
        }
    }

    @Override // trawler.wireman
    public Bitmap marial(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapImpassible = impassible(i, i2, config);
        return bitmapImpassible == null ? competently(i, i2, config) : bitmapImpassible;
    }

    public final synchronized void monoploid(long j) {
        while (this.f38942beachfront > j) {
            try {
                Bitmap bitmapRemoveLast = this.f38941attabal.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        taiyuan();
                    }
                    this.f38942beachfront = 0L;
                    return;
                } else {
                    this.f38950wireman.attabal(bitmapRemoveLast);
                    this.f38942beachfront -= (long) this.f38941attabal.marial(bitmapRemoveLast);
                    this.f38944cutely++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.f38941attabal.attabal(bitmapRemoveLast);
                    }
                    impromptu();
                    bitmapRemoveLast.recycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // trawler.wireman
    public void saneness() {
        Log.isLoggable("LruBitmapPool", 3);
        monoploid(0L);
    }

    public final void taiyuan() {
        Objects.toString(this.f38941attabal);
    }

    public long triweekly() {
        return this.f38947marial;
    }

    @Override // trawler.wireman
    public Bitmap wireman(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapImpassible = impassible(i, i2, config);
        if (bitmapImpassible == null) {
            return competently(i, i2, config);
        }
        bitmapImpassible.eraseColor(0);
        return bitmapImpassible;
    }

    public apical(long j) {
        this(j, formularize(), apical());
    }

    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static final class saneness implements attabal {
        @Override // trawler.apical.attabal
        public void attabal(Bitmap bitmap) {
        }

        @Override // trawler.apical.attabal
        public void saneness(Bitmap bitmap) {
        }
    }
}
