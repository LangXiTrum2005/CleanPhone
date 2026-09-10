package glutethimide;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial<Model, Data> implements kowloon<Model, Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal<Data> f27253attabal;

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public interface attabal<Data> {
        Class<Data> attabal();

        Data dern(String str) throws IllegalArgumentException;

        void saneness(Data data) throws IOException;
    }

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class dern<Model> implements arytenoidectomy<Model, InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final attabal<InputStream> f27254attabal = new attabal();

        /* JADX INFO: compiled from: DataUrlLoader.java */
        public class attabal implements attabal<InputStream> {
            public attabal() {
            }

            @Override // glutethimide.marial.attabal
            public Class<InputStream> attabal() {
                return InputStream.class;
            }

            @Override // glutethimide.marial.attabal
            /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
            public InputStream dern(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // glutethimide.marial.attabal
            /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
            public void saneness(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Model, InputStream> wireman(molybdenite molybdeniteVar) {
            return new marial(this.f27254attabal);
        }
    }

    public marial(attabal<Data> attabalVar) {
        this.f27253attabal = attabalVar;
    }

    @Override // glutethimide.kowloon
    public boolean attabal(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // glutethimide.kowloon
    public kowloon.attabal<Data> saneness(Model model, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(model), new saneness(model.toString(), this.f27253attabal));
    }

    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class saneness<Data> implements com.bumptech.glide.load.data.wireman<Data> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final attabal<Data> f27256arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final String f27257kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Data f27258monoploid;

        public saneness(String str, attabal<Data> attabalVar) {
            this.f27257kowloon = str;
            this.f27256arytenoidectomy = attabalVar;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<Data> attabal() {
            return this.f27256arytenoidectomy.attabal();
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super Data> attabalVar) {
            try {
                Data dataDern = this.f27256arytenoidectomy.dern(this.f27257kowloon);
                this.f27258monoploid = dataDern;
                attabalVar.beachfront(dataDern);
            } catch (IllegalArgumentException e) {
                attabalVar.dern(e);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
            try {
                this.f27256arytenoidectomy.saneness(this.f27258monoploid);
            } catch (IOException unused) {
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
