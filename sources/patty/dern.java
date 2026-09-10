package patty;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements maggot.beachfront<Bitmap> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.saneness f35118attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final maggot.dern<Integer> f35117saneness = maggot.dern.beachfront("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final maggot.dern<Bitmap.CompressFormat> f35116dern = maggot.dern.marial("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public dern(trawler.saneness sanenessVar) {
        this.f35118attabal = sanenessVar;
    }

    @Override // maggot.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public boolean attabal(endosteum.cutely<Bitmap> cutelyVar, File file, maggot.wireman wiremanVar) {
        boolean z;
        Bitmap bitmap = cutelyVar.get();
        Bitmap.CompressFormat compressFormatWireman = wireman(bitmap, wiremanVar);
        naming.saneness.wireman("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatWireman);
        try {
            long jSaneness = com.bumptech.glide.util.competently.saneness();
            int iIntValue = ((Integer) wiremanVar.dern(f35117saneness)).intValue();
            OutputStream dernVar = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        dernVar = this.f35118attabal != null ? new com.bumptech.glide.load.data.dern(fileOutputStream, this.f35118attabal) : fileOutputStream;
                        bitmap.compress(compressFormatWireman, iIntValue, dernVar);
                        dernVar.close();
                        try {
                            dernVar.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException unused2) {
                        dernVar = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
                        if (dernVar != null) {
                            try {
                                dernVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        dernVar = fileOutputStream;
                        if (dernVar != null) {
                            try {
                                dernVar.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused5) {
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormatWireman);
                com.bumptech.glide.util.formularize.taiyuan(bitmap);
                com.bumptech.glide.util.competently.attabal(jSaneness);
                Objects.toString(wiremanVar.dern(f35116dern));
                bitmap.hasAlpha();
            }
            naming.saneness.marial();
            return z;
        } catch (Throwable th3) {
            naming.saneness.marial();
            throw th3;
        }
    }

    @Override // maggot.beachfront
    public EncodeStrategy saneness(maggot.wireman wiremanVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    public final Bitmap.CompressFormat wireman(Bitmap bitmap, maggot.wireman wiremanVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) wiremanVar.dern(f35116dern);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
