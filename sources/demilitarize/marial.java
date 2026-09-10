package demilitarize;

import androidx.p001lifecycle.starveling;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmViewModelProviders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldemilitarize/marial;", "", "<init>", "()V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "modelClass", "attabal", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f25181attabal = new marial();

    public final <T extends starveling> T attabal(Class<T> modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                Intrinsics.beachfront(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        }
    }
}
