package glutethimide;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.X3;
import java.io.InputStream;

/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal<Data> implements kowloon<Uri, Data> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f27209dern = 22;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AssetManager f27210attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final InterfaceC0619attabal<Data> f27211saneness;

    /* JADX INFO: renamed from: glutethimide.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface InterfaceC0619attabal<Data> {
        com.bumptech.glide.load.data.wireman<Data> attabal(AssetManager assetManager, String str);
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class dern implements arytenoidectomy<Uri, InputStream>, InterfaceC0619attabal<InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AssetManager f27212attabal;

        public dern(AssetManager assetManager) {
            this.f27212attabal = assetManager;
        }

        @Override // glutethimide.attabal.InterfaceC0619attabal
        public com.bumptech.glide.load.data.wireman<InputStream> attabal(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.impassible(assetManager, str);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, InputStream> wireman(molybdenite molybdeniteVar) {
            return new attabal(this.f27212attabal, this);
        }
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class saneness implements arytenoidectomy<Uri, AssetFileDescriptor>, InterfaceC0619attabal<AssetFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AssetManager f27213attabal;

        public saneness(AssetManager assetManager) {
            this.f27213attabal = assetManager;
        }

        @Override // glutethimide.attabal.InterfaceC0619attabal
        public com.bumptech.glide.load.data.wireman<AssetFileDescriptor> attabal(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.impromptu(assetManager, str);
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Uri, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new attabal(this.f27213attabal, this);
        }
    }

    public attabal(AssetManager assetManager, InterfaceC0619attabal<Data> interfaceC0619attabal) {
        this.f27210attabal = assetManager;
        this.f27211saneness = interfaceC0619attabal;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(Uri uri, int i, int i2, maggot.wireman wiremanVar) {
        return new kowloon.attabal<>(new leafed.saneness(uri), this.f27211saneness.attabal(this.f27210attabal, uri.toString().substring(f27209dern)));
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Uri uri) {
        return X3.i.b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
