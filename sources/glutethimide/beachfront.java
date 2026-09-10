package glutethimide;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DirectResourceLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront<DataT> implements kowloon<Integer, DataT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f27214attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial<DataT> f27215saneness;

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class attabal implements arytenoidectomy<Integer, AssetFileDescriptor>, marial<AssetFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27216attabal;

        public attabal(Context context) {
            this.f27216attabal = context;
        }

        @Override // glutethimide.beachfront.marial
        public Class<AssetFileDescriptor> attabal() {
            return AssetFileDescriptor.class;
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor dern(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public void saneness(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new beachfront(this.f27216attabal, this);
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class dern implements arytenoidectomy<Integer, InputStream>, marial<InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27217attabal;

        public dern(Context context) {
            this.f27217attabal = context;
        }

        @Override // glutethimide.beachfront.marial
        public Class<InputStream> attabal() {
            return InputStream.class;
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public InputStream dern(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public void saneness(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, InputStream> wireman(molybdenite molybdeniteVar) {
            return new beachfront(this.f27217attabal, this);
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public interface marial<DataT> {
        Class<DataT> attabal();

        DataT dern(Resources.Theme theme, Resources resources, int i);

        void saneness(DataT datat) throws IOException;
    }

    public beachfront(Context context, marial<DataT> marialVar) {
        this.f27214attabal = context.getApplicationContext();
        this.f27215saneness = marialVar;
    }

    public static arytenoidectomy<Integer, InputStream> competently(Context context) {
        return new dern(context);
    }

    public static arytenoidectomy<Integer, AssetFileDescriptor> dern(Context context) {
        return new attabal(context);
    }

    public static arytenoidectomy<Integer, Drawable> marial(Context context) {
        return new saneness(context);
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Integer num) {
        return true;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<DataT> saneness(Integer num, int i, int i2, maggot.wireman wiremanVar) {
        Resources.Theme theme = (Resources.Theme) wiremanVar.dern(dumb.formularize.f25376saneness);
        return new kowloon.attabal<>(new leafed.saneness(num), new wireman(theme, theme != null ? theme.getResources() : this.f27214attabal.getResources(), this.f27215saneness, num.intValue()));
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class wireman<DataT> implements com.bumptech.glide.load.data.wireman<DataT> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Resources f27219arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Resources.Theme f27220kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public DataT f27221molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final marial<DataT> f27222monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final int f27223polloi;

        public wireman(Resources.Theme theme, Resources resources, marial<DataT> marialVar, int i) {
            this.f27220kowloon = theme;
            this.f27219arytenoidectomy = resources;
            this.f27222monoploid = marialVar;
            this.f27223polloi = i;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<DataT> attabal() {
            return this.f27222monoploid.attabal();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super DataT> attabalVar) {
            try {
                DataT datatDern = this.f27222monoploid.dern(this.f27220kowloon, this.f27219arytenoidectomy, this.f27223polloi);
                this.f27221molybdenite = datatDern;
                attabalVar.beachfront(datatDern);
            } catch (Resources.NotFoundException e) {
                attabalVar.dern(e);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
            DataT datat = this.f27221molybdenite;
            if (datat != null) {
                try {
                    this.f27222monoploid.saneness(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public DataSource wireman() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void cancel() {
        }
    }

    /* JADX INFO: compiled from: DirectResourceLoader.java */
    public static final class saneness implements arytenoidectomy<Integer, Drawable>, marial<Drawable> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27218attabal;

        public saneness(Context context) {
            this.f27218attabal = context;
        }

        @Override // glutethimide.beachfront.marial
        public Class<Drawable> attabal() {
            return Drawable.class;
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public Drawable dern(Resources.Theme theme, Resources resources, int i) {
            return dumb.taiyuan.attabal(this.f27218attabal, i, theme);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, Drawable> wireman(molybdenite molybdeniteVar) {
            return new beachfront(this.f27218attabal, this);
        }

        @Override // glutethimide.beachfront.marial
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public void saneness(Drawable drawable) throws IOException {
        }
    }
}
