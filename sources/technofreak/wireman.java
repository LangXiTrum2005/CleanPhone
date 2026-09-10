package technofreak;

import android.util.LongSparseArray;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.collections.supplicat;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/util/LongSparseArray;", "Lkotlin/collections/supplicat;", "attabal", "(Landroid/util/LongSparseArray;)Lkotlin/collections/supplicat;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"technofreak/wireman$attabal", "Lkotlin/collections/supplicat;", "", "hasNext", "()Z", "", "nextLong", "()J", "", "kowloon", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f38676arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int index;

        public attabal(LongSparseArray<T> longSparseArray) {
            this.f38676arytenoidectomy = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f38676arytenoidectomy.size();
        }

        @Override // p002kotlin.collections.supplicat
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f38676arytenoidectomy;
            int i = this.index;
            this.index = i + 1;
            return longSparseArray.keyAt(i);
        }
    }

    public static final <T> supplicat attabal(LongSparseArray<T> longSparseArray) {
        return new attabal(longSparseArray);
    }
}
