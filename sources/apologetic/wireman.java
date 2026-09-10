package apologetic;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import glutethimide.arytenoidectomy;
import glutethimide.kowloon;
import glutethimide.molybdenite;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman<DataT> implements kowloon<Uri, DataT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f14314attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final kowloon<Uri, DataT> f14315dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon<File, DataT> f14316saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Class<DataT> f14317wireman;

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static abstract class attabal<DataT> implements arytenoidectomy<Uri, DataT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f14318attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<DataT> f14319saneness;

        public attabal(Context context, Class<DataT> cls) {
            this.f14318attabal = context;
            this.f14319saneness = cls;
        }

        @Override // glutethimide.arytenoidectomy
        public final kowloon<Uri, DataT> wireman(molybdenite molybdeniteVar) {
            return new wireman(this.f14318attabal, molybdeniteVar.wireman(File.class, this.f14319saneness), molybdeniteVar.wireman(Uri.class, this.f14319saneness), this.f14319saneness);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class dern extends attabal<InputStream> {
        public dern(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class saneness extends attabal<ParcelFileDescriptor> {
        public saneness(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: apologetic.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class C0116wireman<DataT> implements com.bumptech.glide.load.data.wireman<DataT> {

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public static final String[] f14320preprohormone = {"_data"};

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final maggot.wireman f14321adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final kowloon<File, DataT> f14322arytenoidectomy;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final Class<DataT> f14323dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public volatile boolean f14324gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final int f14325graveside;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Context f14326kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int f14327molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final kowloon<Uri, DataT> f14328monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final Uri f14329polloi;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.wireman<DataT> f14330rotuma;

        public C0116wireman(Context context, kowloon<File, DataT> kowloonVar, kowloon<Uri, DataT> kowloonVar2, Uri uri, int i, int i2, maggot.wireman wiremanVar, Class<DataT> cls) {
            this.f14326kowloon = context.getApplicationContext();
            this.f14322arytenoidectomy = kowloonVar;
            this.f14328monoploid = kowloonVar2;
            this.f14329polloi = uri;
            this.f14327molybdenite = i;
            this.f14325graveside = i2;
            this.f14321adultoid = wiremanVar;
            this.f14323dovishness = cls;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<DataT> attabal() {
            return this.f14323dovishness;
        }

        public final com.bumptech.glide.load.data.wireman<DataT> beachfront() throws FileNotFoundException {
            kowloon.attabal<DataT> attabalVarDern = dern();
            if (attabalVarDern != null) {
                return attabalVarDern.f27251dern;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void cancel() {
            this.f14324gintrap = true;
            com.bumptech.glide.load.data.wireman<DataT> wiremanVar = this.f14330rotuma;
            if (wiremanVar != null) {
                wiremanVar.cancel();
            }
        }

        public final boolean competently() {
            return this.f14326kowloon.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public final kowloon.attabal<DataT> dern() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f14322arytenoidectomy.saneness(impromptu(this.f14329polloi), this.f14327molybdenite, this.f14325graveside, this.f14321adultoid);
            }
            if (beclomethasone.saneness.attabal(this.f14329polloi)) {
                return this.f14328monoploid.saneness(this.f14329polloi, this.f14327molybdenite, this.f14325graveside, this.f14321adultoid);
            }
            return this.f14328monoploid.saneness(competently() ? MediaStore.setRequireOriginal(this.f14329polloi) : this.f14329polloi, this.f14327molybdenite, this.f14325graveside, this.f14321adultoid);
        }

        public final File impromptu(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f14326kowloon.getContentResolver().query(uri, f14320preprohormone, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super DataT> attabalVar) {
            try {
                com.bumptech.glide.load.data.wireman<DataT> wiremanVarBeachfront = beachfront();
                if (wiremanVarBeachfront == null) {
                    attabalVar.dern(new IllegalArgumentException("Failed to build fetcher for: " + this.f14329polloi));
                    return;
                }
                this.f14330rotuma = wiremanVarBeachfront;
                if (this.f14324gintrap) {
                    cancel();
                } else {
                    wiremanVarBeachfront.marial(priority, attabalVar);
                }
            } catch (FileNotFoundException e) {
                attabalVar.dern(e);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
            com.bumptech.glide.load.data.wireman<DataT> wiremanVar = this.f14330rotuma;
            if (wiremanVar != null) {
                wiremanVar.saneness();
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public DataSource wireman() {
            return DataSource.LOCAL;
        }
    }

    public wireman(Context context, kowloon<File, DataT> kowloonVar, kowloon<Uri, DataT> kowloonVar2, Class<DataT> cls) {
        this.f14314attabal = context.getApplicationContext();
        this.f14316saneness = kowloonVar;
        this.f14315dern = kowloonVar2;
        this.f14317wireman = cls;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<DataT> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(uri), new C0116wireman(this.f14314attabal, this.f14316saneness, this.f14315dern, uri, i, i2, wiremanVar, this.f14317wireman));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && beclomethasone.saneness.dern(uri);
    }
}
