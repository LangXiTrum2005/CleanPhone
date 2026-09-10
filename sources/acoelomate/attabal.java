package acoelomate;

import com.codejoy.boom.clap.network.BodyCallAdapter;
import com.codejoy.boom.clap.network.ResponseCallAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.dern;
import retrofit2.preprohormone;
import retrofit2.rotuma;

/* JADX INFO: compiled from: FlowCallAdapterFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lacoelomate/attabal;", "Lretrofit2/dern$attabal;", "<init>", "()V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/preprohormone;", "retrofit", "Lretrofit2/dern;", "attabal", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/preprohormone;)Lretrofit2/dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal extends dern.attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f3276saneness = 8;

    @Override // retrofit2.dern.attabal
    public dern<?, ?> attabal(Type returnType, Annotation[] annotations, preprohormone retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.wireman(dern.attabal.dern(returnType), kotlinx.coroutines.flow.dern.class)) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("Flow return type must be parameterized as Flow<Foo> or Flow<out Foo>");
        }
        Type typeSaneness = dern.attabal.saneness(0, (ParameterizedType) returnType);
        if (!Intrinsics.wireman(dern.attabal.dern(typeSaneness), rotuma.class)) {
            Intrinsics.beachfront(typeSaneness);
            return new BodyCallAdapter(typeSaneness);
        }
        if (!(typeSaneness instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<out Foo>");
        }
        Type typeSaneness2 = dern.attabal.saneness(0, (ParameterizedType) typeSaneness);
        Intrinsics.checkNotNullExpressionValue(typeSaneness2, "getParameterUpperBound(...)");
        return new ResponseCallAdapter(typeSaneness2);
    }
}
