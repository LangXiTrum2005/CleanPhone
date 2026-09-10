package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes5.dex */
public class adultoid {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final adultoid f36445dern = marial();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f36446attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f36447saneness;

    /* JADX INFO: compiled from: Platform.java */
    public static final class attabal extends adultoid {

        /* JADX INFO: renamed from: retrofit2.adultoid$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Platform.java */
        public static final class ExecutorC0784attabal implements Executor {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final Handler f36448kowloon = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f36448kowloon.post(runnable);
            }
        }

        public attabal() {
            super(true);
        }

        @Override // retrofit2.adultoid
        @Nullable
        public Object competently(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.competently(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // retrofit2.adultoid
        public Executor saneness() {
            return new ExecutorC0784attabal();
        }
    }

    public adultoid(boolean z) {
        this.f36446attabal = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = kowloon.attabal().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f36447saneness = declaredConstructor;
    }

    public static adultoid beachfront() {
        return f36445dern;
    }

    public static adultoid marial() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new attabal() : new adultoid(true);
    }

    public List<? extends dern.attabal> attabal(@Nullable Executor executor) {
        competently competentlyVar = new competently(executor);
        return this.f36446attabal ? Arrays.asList(marial.f36545attabal, competentlyVar) : Collections.singletonList(competentlyVar);
    }

    @Nullable
    public Object competently(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f36447saneness;
        return (constructor != null ? arytenoidectomy.attabal(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public List<? extends beachfront.attabal> dern() {
        return this.f36446attabal ? Collections.singletonList(impassible.f36540attabal) : Collections.EMPTY_LIST;
    }

    public boolean impromptu(Method method) {
        return this.f36446attabal && method.isDefault();
    }

    @Nullable
    public Executor saneness() {
        return null;
    }

    public int wireman() {
        return this.f36446attabal ? 1 : 0;
    }
}
