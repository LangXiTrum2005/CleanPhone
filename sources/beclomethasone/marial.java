package beclomethasone;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final attabal f15040beachfront = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f15041attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final trawler.saneness f15042dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<ImageHeaderParser> f15043marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f15044saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ContentResolver f15045wireman;

    public marial(List<ImageHeaderParser> list, wireman wiremanVar, trawler.saneness sanenessVar, ContentResolver contentResolver) {
        this(list, f15040beachfront, wiremanVar, sanenessVar, contentResolver);
    }

    public int attabal(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f15045wireman.openInputStream(uri);
            return com.bumptech.glide.load.attabal.saneness(this.f15043marial, inputStreamOpenInputStream, this.f15042dern);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Objects.toString(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public final boolean dern(File file) {
        return this.f15041attabal.attabal(file) && 0 < this.f15041attabal.dern(file);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    public final String saneness(Uri uri) throws Throwable {
        Cursor cursorAttabal;
        Cursor cursor = null;
        try {
            cursorAttabal = this.f15044saneness.attabal(uri);
            if (cursorAttabal != null) {
                try {
                    try {
                        if (cursorAttabal.moveToFirst()) {
                            String string = cursorAttabal.getString(0);
                            cursorAttabal.close();
                            return string;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorAttabal;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SecurityException unused) {
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                        Objects.toString(uri);
                    }
                    if (cursorAttabal != null) {
                        cursorAttabal.close();
                    }
                    return null;
                }
            }
            if (cursorAttabal != null) {
                cursorAttabal.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorAttabal = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public InputStream wireman(Uri uri) throws Throwable {
        String strSaneness = saneness(uri);
        if (TextUtils.isEmpty(strSaneness)) {
            return null;
        }
        File fileSaneness = this.f15041attabal.saneness(strSaneness);
        if (!dern(fileSaneness)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileSaneness);
        try {
            return this.f15045wireman.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public marial(List<ImageHeaderParser> list, attabal attabalVar, wireman wiremanVar, trawler.saneness sanenessVar, ContentResolver contentResolver) {
        this.f15041attabal = attabalVar;
        this.f15044saneness = wiremanVar;
        this.f15042dern = sanenessVar;
        this.f15045wireman = contentResolver;
        this.f15043marial = list;
    }
}
