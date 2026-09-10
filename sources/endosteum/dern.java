package endosteum;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: compiled from: DiskCacheStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f25714attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f25717saneness = new saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f25715dern = new C0599dern();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final dern f25718wireman = new wireman();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final dern f25716marial = new marial();

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class attabal extends dern {
        @Override // endosteum.dern
        public boolean attabal() {
            return true;
        }

        @Override // endosteum.dern
        public boolean dern(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // endosteum.dern
        public boolean saneness() {
            return true;
        }

        @Override // endosteum.dern
        public boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: endosteum.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class C0599dern extends dern {
        @Override // endosteum.dern
        public boolean attabal() {
            return true;
        }

        @Override // endosteum.dern
        public boolean dern(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // endosteum.dern
        public boolean saneness() {
            return false;
        }

        @Override // endosteum.dern
        public boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class marial extends dern {
        @Override // endosteum.dern
        public boolean attabal() {
            return true;
        }

        @Override // endosteum.dern
        public boolean dern(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // endosteum.dern
        public boolean saneness() {
            return true;
        }

        @Override // endosteum.dern
        public boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class saneness extends dern {
        @Override // endosteum.dern
        public boolean attabal() {
            return false;
        }

        @Override // endosteum.dern
        public boolean dern(DataSource dataSource) {
            return false;
        }

        @Override // endosteum.dern
        public boolean saneness() {
            return false;
        }

        @Override // endosteum.dern
        public boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class wireman extends dern {
        @Override // endosteum.dern
        public boolean attabal() {
            return false;
        }

        @Override // endosteum.dern
        public boolean dern(DataSource dataSource) {
            return false;
        }

        @Override // endosteum.dern
        public boolean saneness() {
            return true;
        }

        @Override // endosteum.dern
        public boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public abstract boolean attabal();

    public abstract boolean dern(DataSource dataSource);

    public abstract boolean saneness();

    public abstract boolean wireman(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
