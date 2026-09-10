package shapoo;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpUtilFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lshapoo/attabal;", "", "<init>", "()V", "Lshapoo/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "cls", "attabal", "(Ljava/lang/Class;)Lshapoo/saneness;", "", "saneness", "()Ljava/util/Map;", "Ljava/util/Map;", "HTTP_MAP", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f37589attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static Map<Class<?>, saneness> HTTP_MAP;

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends saneness> T attabal(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "cls");
        T t = (T) saneness().get(cls);
        if (t == null) {
            try {
                saneness sanenessVar = (saneness) cls.newInstance();
                try {
                    Map<Class<?>, saneness> mapSaneness = saneness();
                    Intrinsics.beachfront(sanenessVar);
                    mapSaneness.put(cls, sanenessVar);
                    t = (T) sanenessVar;
                } catch (Throwable th) {
                    th = th;
                    t = (T) sanenessVar;
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Intrinsics.beachfront(t);
        return t;
    }

    public final Map<Class<?>, saneness> saneness() {
        if (HTTP_MAP == null) {
            HTTP_MAP = Collections.synchronizedMap(new HashMap(16));
        }
        Map<Class<?>, saneness> map = HTTP_MAP;
        Intrinsics.beachfront(map);
        return map;
    }
}
