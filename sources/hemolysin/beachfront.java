package hemolysin;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront extends wireman {

    /* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
    public class attabal implements wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f27638attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f27639saneness;

        public attabal(Context context, String str) {
            this.f27638attabal = context;
            this.f27639saneness = str;
        }

        @Override // hemolysin.wireman.attabal
        public File attabal() {
            File cacheDir = this.f27638attabal.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f27639saneness != null ? new File(cacheDir, this.f27639saneness) : cacheDir;
        }
    }

    public beachfront(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public beachfront(Context context, String str, long j) {
        super(new attabal(context, str), j);
    }
}
