package warder;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Lwarder/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", X3.i.W, "Lokhttp3/rotuma;", "okHttpClient", "baseUrl", "Ljava/lang/Class;", "cls", "<init>", "(Ljava/lang/String;Lokhttp3/rotuma;Ljava/lang/String;Ljava/lang/Class;)V", "saneness", "()Ljava/lang/Object;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "dern", "()Lwarder/saneness;", "marial", "()Lokhttp3/rotuma;", "Ljava/lang/reflect/InvocationHandler;", "beachfront", "()Ljava/lang/reflect/InvocationHandler;", "attabal", "Ljava/lang/String;", "Lokhttp3/rotuma;", "wireman", "()Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/Object;", "api", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String baseUrl;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public T api;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public rotuma okHttpClient;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Class<T> cls;

    public saneness(String key, rotuma rotumaVar, String baseUrl, Class<T> cls) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(cls, "cls");
        this.key = key;
        this.okHttpClient = rotumaVar;
        this.baseUrl = baseUrl;
        this.cls = cls;
    }

    public static final Object competently(saneness this$0, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(method, "method");
        Object objSaneness = beachfront.f39597attabal.attabal(this$0.baseUrl, this$0.marial(), this$0.key).saneness(this$0.cls);
        Object objSaneness2 = dern.INSTANCE.saneness(this$0.key, objSaneness, method, objArr, this$0.dern());
        if (objSaneness2 != null) {
            return objSaneness2;
        }
        return objArr != null ? method.invoke(objSaneness, Arrays.copyOf(objArr, objArr.length)) : method.invoke(objSaneness, null);
    }

    public final InvocationHandler beachfront() {
        return new InvocationHandler() { // from class: warder.attabal
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return saneness.competently(this.f39596attabal, obj, method, objArr);
            }
        };
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.wireman(saneness.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.competently(other, "null cannot be cast to non-null type com.yolo.networklibrary.http.base.api.ApiModel<*>");
        saneness sanenessVar = (saneness) other;
        return Intrinsics.wireman(this.okHttpClient, sanenessVar.okHttpClient) && Intrinsics.wireman(this.baseUrl, sanenessVar.baseUrl) && Intrinsics.wireman(this.cls, sanenessVar.cls);
    }

    public int hashCode() {
        rotuma rotumaVar = this.okHttpClient;
        return ((((rotumaVar != null ? rotumaVar.hashCode() : 0) * 31) + this.baseUrl.hashCode()) * 31) + this.cls.hashCode();
    }

    public final rotuma marial() {
        if (this.okHttpClient == null) {
            this.okHttpClient = beachfront.dern(beachfront.f39597attabal, null, 1, null);
        }
        rotuma rotumaVar = this.okHttpClient;
        Intrinsics.beachfront(rotumaVar);
        return rotumaVar;
    }

    public final T saneness() {
        if (this.api == null) {
            this.api = (T) Proxy.newProxyInstance(this.cls.getClassLoader(), new Class[]{this.cls}, beachfront());
        }
        T t = this.api;
        Intrinsics.beachfront(t);
        return t;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final saneness<T> dern() {
        return this;
    }
}
