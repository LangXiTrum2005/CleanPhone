package warder;

import com.ironsource.X3;
import java.lang.reflect.Method;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.preprohormone;

/* JADX INFO: compiled from: HttpConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwarder/dern;", "", "attabal", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Map<String, marial> f39601saneness;

    /* JADX INFO: renamed from: warder.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: HttpConfig.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJC\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwarder/dern$attabal;", "", "<init>", "()V", "", X3.i.W, "Lretrofit2/preprohormone$saneness;", "builder", "", "attabal", "(Ljava/lang/String;Lretrofit2/preprohormone$saneness;)V", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "Lwarder/saneness;", "apiModel", "saneness", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;Lwarder/saneness;)Ljava/lang/Object;", "", "Lwarder/marial;", "iServiceInvokeList", "Ljava/util/Map;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(String key, preprohormone.saneness builder) {
            Intrinsics.checkNotNullParameter(key, "key");
            beachfront.f39597attabal.marial(key, builder);
        }

        public final Object saneness(String key, Object proxy, Method method, Object[] args, saneness<?> apiModel) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(apiModel, "apiModel");
            if (dern.f39601saneness != null) {
                try {
                    Map map = dern.f39601saneness;
                    marial marialVar = map != null ? (marial) map.get(key) : null;
                    if (marialVar != null) {
                        return marialVar.attabal(proxy, method, args, apiModel);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return null;
        }

        public Companion() {
        }
    }
}
