package shent;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lshent/formularize;", "Lshent/beachfront;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "impromptu", "Ljava/lang/Class;", "taiyuan", "cutely", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class formularize extends beachfront {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final Class<?> paramClass;

    /* JADX INFO: renamed from: shent.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lshent/formularize$attabal;", "", "<init>", "()V", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "Lshent/apical;", "attabal", "(Ljava/lang/String;)Lshent/apical;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ apical saneness(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.attabal(str);
        }

        public final apical attabal(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(Intrinsics.arytenoidectomy(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.arytenoidectomy(packageName, ".OpenSSLSocketFactoryImpl"));
                Class<?> paramsClass = Class.forName(Intrinsics.arytenoidectomy(packageName, ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new formularize(cls, cls2, paramsClass);
            } catch (Exception e) {
                elusion.impromptu.INSTANCE.competently().apical("unable to load android socket classes", 5, e);
                return null;
            }
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public formularize(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.sslSocketFactoryClass = sslSocketFactoryClass;
        this.paramClass = paramClass;
    }
}
