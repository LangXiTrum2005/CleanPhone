package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PluginHelperInterfaces.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvinyl/grimness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "", "childSerializers", "()[Lasosan/wireman;", "typeParametersSerializers", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface grimness<T> extends asosan.wireman<T> {

    /* JADX INFO: compiled from: PluginHelperInterfaces.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {
        public static <T> asosan.wireman<?>[] attabal(grimness<T> grimnessVar) {
            return mastfed.f39434attabal;
        }
    }

    asosan.wireman<?>[] childSerializers();

    asosan.wireman<?>[] typeParametersSerializers();
}
