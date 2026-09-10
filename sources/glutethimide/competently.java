package glutethimide;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently<Data> implements kowloon<File, Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman<Data> f27224attabal;

    /* JADX INFO: compiled from: FileLoader.java */
    public static class attabal<Data> implements arytenoidectomy<File, Data> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman<Data> f27225attabal;

        public attabal(wireman<Data> wiremanVar) {
            this.f27225attabal = wiremanVar;
        }

        @Override // glutethimide.arytenoidectomy
        public final kowloon<File, Data> wireman(molybdenite molybdeniteVar) {
            return new competently(this.f27225attabal);
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class marial extends attabal<InputStream> {

        /* JADX INFO: compiled from: FileLoader.java */
        public class attabal implements wireman<InputStream> {
            @Override // glutethimide.competently.wireman
            public Class<InputStream> attabal() {
                return InputStream.class;
            }

            @Override // glutethimide.competently.wireman
            /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
            public InputStream dern(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // glutethimide.competently.wireman
            /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
            public void saneness(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public marial() {
            super(new attabal());
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static class saneness extends attabal<ParcelFileDescriptor> {

        /* JADX INFO: compiled from: FileLoader.java */
        public class attabal implements wireman<ParcelFileDescriptor> {
            @Override // glutethimide.competently.wireman
            public Class<ParcelFileDescriptor> attabal() {
                return ParcelFileDescriptor.class;
            }

            @Override // glutethimide.competently.wireman
            /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor dern(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // glutethimide.competently.wireman
            /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
            public void saneness(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public saneness() {
            super(new attabal());
        }
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public interface wireman<Data> {
        Class<Data> attabal();

        Data dern(File file) throws FileNotFoundException;

        void saneness(Data data) throws IOException;
    }

    public competently(wireman<Data> wiremanVar) {
        this.f27224attabal = wiremanVar;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(File file, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(file), new dern(file, this.f27224attabal));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(File file) {
        return true;
    }

    /* JADX INFO: compiled from: FileLoader.java */
    public static final class dern<Data> implements com.bumptech.glide.load.data.wireman<Data> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final wireman<Data> f27226arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final File f27227kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Data f27228monoploid;

        public dern(File file, wireman<Data> wiremanVar) {
            this.f27227kowloon = file;
            this.f27226arytenoidectomy = wiremanVar;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<Data> attabal() {
            return this.f27226arytenoidectomy.attabal();
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super Data> attabalVar) {
            try {
                Data dataDern = this.f27226arytenoidectomy.dern(this.f27227kowloon);
                this.f27228monoploid = dataDern;
                attabalVar.beachfront(dataDern);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                attabalVar.dern(e);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
            Data data = this.f27228monoploid;
            if (data != null) {
                try {
                    this.f27226arytenoidectomy.saneness(data);
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
}
