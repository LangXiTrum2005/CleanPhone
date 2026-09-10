package glutethimide;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class graveside<Data> implements kowloon<Integer, Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon<Uri, Data> f27238attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Resources f27239saneness;

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class attabal implements arytenoidectomy<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Resources f27240attabal;

        public attabal(Resources resources) {
            this.f27240attabal = resources;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, AssetFileDescriptor> wireman(molybdenite molybdeniteVar) {
            return new graveside(this.f27240attabal, molybdeniteVar.wireman(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class dern implements arytenoidectomy<Integer, Uri> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Resources f27241attabal;

        public dern(Resources resources) {
            this.f27241attabal = resources;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, Uri> wireman(molybdenite molybdeniteVar) {
            return new graveside(this.f27241attabal, rotuma.dern());
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class saneness implements arytenoidectomy<Integer, InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Resources f27242attabal;

        public saneness(Resources resources) {
            this.f27242attabal = resources;
        }

        @Override // glutethimide.arytenoidectomy
        public kowloon<Integer, InputStream> wireman(molybdenite molybdeniteVar) {
            return new graveside(this.f27242attabal, molybdeniteVar.wireman(Uri.class, InputStream.class));
        }
    }

    public graveside(Resources resources, kowloon<Uri, Data> kowloonVar) {
        this.f27239saneness = resources;
        this.f27238attabal = kowloonVar;
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kowloon.attabal<Data> saneness(Integer num, int i, int i2, maggot.wireman wiremanVar) {
        Uri uriWireman = wireman(num);
        if (uriWireman == null) {
            return null;
        }
        return this.f27238attabal.saneness(uriWireman, i, i2, wiremanVar);
    }

    @Override // glutethimide.kowloon
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public boolean attabal(Integer num) {
        return true;
    }

    public final Uri wireman(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f27239saneness.getResourcePackageName(num.intValue()) + '/' + this.f27239saneness.getResourceTypeName(num.intValue()) + '/' + this.f27239saneness.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            return null;
        }
    }
}
