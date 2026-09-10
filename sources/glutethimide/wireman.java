package glutethimide;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman implements kowloon<File, ByteBuffer> {

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class saneness implements arytenoidectomy<File, ByteBuffer> {
        @Override // glutethimide.arytenoidectomy
        public kowloon<File, ByteBuffer> wireman(molybdenite molybdeniteVar) {
            return new wireman();
        }
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<ByteBuffer> saneness(File file, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(file), new attabal(file));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(File file) {
        return true;
    }

    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static final class attabal implements com.bumptech.glide.load.data.wireman<ByteBuffer> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final File f27302kowloon;

        public attabal(File file) {
            this.f27302kowloon = file;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<ByteBuffer> attabal() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super ByteBuffer> attabalVar) {
            try {
                attabalVar.beachfront(com.bumptech.glide.util.attabal.attabal(this.f27302kowloon));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                attabalVar.dern(e);
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public DataSource wireman() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
        }
    }
}
