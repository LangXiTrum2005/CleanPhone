package glutethimide;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness<Data> implements kowloon<byte[], Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InterfaceC0622saneness<Data> f27289attabal;

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class attabal implements arytenoidectomy<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: glutethimide.saneness$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class C0621attabal implements InterfaceC0622saneness<ByteBuffer> {
            public C0621attabal() {
            }

            @Override // glutethimide.saneness.InterfaceC0622saneness
            public Class<ByteBuffer> attabal() {
                return ByteBuffer.class;
            }

            @Override // glutethimide.saneness.InterfaceC0622saneness
            /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
            public ByteBuffer saneness(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<byte[], ByteBuffer> wireman(molybdenite molybdeniteVar) {
            return new saneness(new C0621attabal());
        }
    }

    /* JADX INFO: renamed from: glutethimide.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface InterfaceC0622saneness<Data> {
        Class<Data> attabal();

        Data saneness(byte[] bArr);
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class wireman implements arytenoidectomy<byte[], InputStream> {

        /* JADX INFO: compiled from: ByteArrayLoader.java */
        public class attabal implements InterfaceC0622saneness<InputStream> {
            public attabal() {
            }

            @Override // glutethimide.saneness.InterfaceC0622saneness
            public Class<InputStream> attabal() {
                return InputStream.class;
            }

            @Override // glutethimide.saneness.InterfaceC0622saneness
            /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
            public InputStream saneness(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<byte[], InputStream> wireman(molybdenite molybdeniteVar) {
            return new saneness(new attabal());
        }
    }

    public saneness(InterfaceC0622saneness<Data> interfaceC0622saneness) {
        this.f27289attabal = interfaceC0622saneness;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(byte[] bArr, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(bArr), new dern(bArr, this.f27289attabal));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class dern<Data> implements com.bumptech.glide.load.data.wireman<Data> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final InterfaceC0622saneness<Data> f27291arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final byte[] f27292kowloon;

        public dern(byte[] bArr, InterfaceC0622saneness<Data> interfaceC0622saneness) {
            this.f27292kowloon = bArr;
            this.f27291arytenoidectomy = interfaceC0622saneness;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<Data> attabal() {
            return this.f27291arytenoidectomy.attabal();
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super Data> attabalVar) {
            attabalVar.beachfront(this.f27291arytenoidectomy.saneness(this.f27292kowloon));
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
