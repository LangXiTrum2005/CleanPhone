package poleward;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.cord;
import okhttp3.stratoscope;
import retrofit2.beachfront;
import retrofit2.preprohormone;

/* JADX INFO: compiled from: GsonConverterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends beachfront.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Gson f35411attabal;

    public attabal(Gson gson) {
        this.f35411attabal = gson;
    }

    public static attabal beachfront(Gson gson) {
        if (gson != null) {
            return new attabal(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.beachfront.attabal
    public beachfront<?, cord> dern(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, preprohormone preprohormoneVar) {
        return new saneness(this.f35411attabal, this.f35411attabal.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.beachfront.attabal
    public beachfront<stratoscope, ?> wireman(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
        return new dern(this.f35411attabal, this.f35411attabal.getAdapter(TypeToken.get(type)));
    }
}
