package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cutely<ResponseT, ReturnT> extends cord<ReturnT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final gintrap f36466attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront<okhttp3.stratoscope, ResponseT> f36467dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final okhttp3.marial.attabal f36468saneness;

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class attabal<ResponseT, ReturnT> extends cutely<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final retrofit2.dern<ResponseT, ReturnT> f36469wireman;

        public attabal(gintrap gintrapVar, okhttp3.marial.attabal attabalVar, beachfront<okhttp3.stratoscope, ResponseT> beachfrontVar, retrofit2.dern<ResponseT, ReturnT> dernVar) {
            super(gintrapVar, attabalVar, beachfrontVar);
            this.f36469wireman = dernVar;
        }

        @Override // retrofit2.cutely
        public ReturnT dern(retrofit2.saneness<ResponseT> sanenessVar, Object[] objArr) {
            return this.f36469wireman.saneness(sanenessVar);
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class dern<ResponseT> extends cutely<ResponseT, Object> {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final retrofit2.dern<ResponseT, retrofit2.saneness<ResponseT>> f36470wireman;

        public dern(gintrap gintrapVar, okhttp3.marial.attabal attabalVar, beachfront<okhttp3.stratoscope, ResponseT> beachfrontVar, retrofit2.dern<ResponseT, retrofit2.saneness<ResponseT>> dernVar) {
            super(gintrapVar, attabalVar, beachfrontVar);
            this.f36470wireman = dernVar;
        }

        @Override // retrofit2.cutely
        public Object dern(retrofit2.saneness<ResponseT> sanenessVar, Object[] objArr) {
            retrofit2.saneness<ResponseT> sanenessVarSaneness = this.f36470wireman.saneness(sanenessVar);
            wretchedly.dern dernVar = (wretchedly.dern) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.dern(sanenessVarSaneness, dernVar);
            } catch (Exception e) {
                return KotlinExtensions.wireman(e, dernVar);
            }
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class saneness<ResponseT> extends cutely<ResponseT, Object> {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f36471marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final retrofit2.dern<ResponseT, retrofit2.saneness<ResponseT>> f36472wireman;

        public saneness(gintrap gintrapVar, okhttp3.marial.attabal attabalVar, beachfront<okhttp3.stratoscope, ResponseT> beachfrontVar, retrofit2.dern<ResponseT, retrofit2.saneness<ResponseT>> dernVar, boolean z) {
            super(gintrapVar, attabalVar, beachfrontVar);
            this.f36472wireman = dernVar;
            this.f36471marial = z;
        }

        @Override // retrofit2.cutely
        public Object dern(retrofit2.saneness<ResponseT> sanenessVar, Object[] objArr) {
            retrofit2.saneness<ResponseT> sanenessVarSaneness = this.f36472wireman.saneness(sanenessVar);
            wretchedly.dern dernVar = (wretchedly.dern) objArr[objArr.length - 1];
            try {
                return this.f36471marial ? KotlinExtensions.saneness(sanenessVarSaneness, dernVar) : KotlinExtensions.attabal(sanenessVarSaneness, dernVar);
            } catch (Exception e) {
                return KotlinExtensions.wireman(e, dernVar);
            }
        }
    }

    public cutely(gintrap gintrapVar, okhttp3.marial.attabal attabalVar, beachfront<okhttp3.stratoscope, ResponseT> beachfrontVar) {
        this.f36466attabal = gintrapVar;
        this.f36468saneness = attabalVar;
        this.f36467dern = beachfrontVar;
    }

    public static <ResponseT, ReturnT> cutely<ResponseT, ReturnT> beachfront(preprohormone preprohormoneVar, Method method, gintrap gintrapVar) {
        Type genericReturnType;
        boolean z;
        boolean z2 = gintrapVar.f36504apical;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeBeachfront = trm.beachfront(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (trm.impromptu(typeBeachfront) == rotuma.class && (typeBeachfront instanceof ParameterizedType)) {
                typeBeachfront = trm.competently(0, (ParameterizedType) typeBeachfront);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new trm.saneness(null, retrofit2.saneness.class, typeBeachfront);
            annotations = stratoscope.attabal(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        retrofit2.dern dernVarWireman = wireman(preprohormoneVar, method, genericReturnType, annotations);
        Type responseType = dernVarWireman.getResponseType();
        if (responseType == okhttp3.cuirassed.class) {
            throw trm.impassible(method, "'" + trm.impromptu(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (responseType == rotuma.class) {
            throw trm.impassible(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (gintrapVar.f36509dern.equals("HEAD") && !Void.class.equals(responseType)) {
            throw trm.impassible(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        beachfront beachfrontVarMarial = marial(preprohormoneVar, method, responseType);
        okhttp3.marial.attabal attabalVar = preprohormoneVar.f36558saneness;
        if (z2) {
            return z ? new dern(gintrapVar, attabalVar, beachfrontVarMarial, dernVarWireman) : new saneness(gintrapVar, attabalVar, beachfrontVarMarial, dernVarWireman, false);
        }
        return new attabal(gintrapVar, attabalVar, beachfrontVarMarial, dernVarWireman);
    }

    public static <ResponseT> beachfront<okhttp3.stratoscope, ResponseT> marial(preprohormone preprohormoneVar, Method method, Type type) {
        try {
            return preprohormoneVar.impromptu(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw trm.triweekly(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> retrofit2.dern<ResponseT, ReturnT> wireman(preprohormone preprohormoneVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.dern<ResponseT, ReturnT>) preprohormoneVar.attabal(type, annotationArr);
        } catch (RuntimeException e) {
            throw trm.triweekly(method, e, "Unable to create call adapter for %s", type);
        }
    }

    @Override // retrofit2.cord
    @Nullable
    public final ReturnT attabal(Object[] objArr) {
        return dern(new formularize(this.f36466attabal, objArr, this.f36468saneness, this.f36467dern), objArr);
    }

    @Nullable
    public abstract ReturnT dern(retrofit2.saneness<ResponseT> sanenessVar, Object[] objArr);
}
