package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes5.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Method, cord<?>> f36553attabal = new ConcurrentHashMap();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Nullable
    public final Executor f36554beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f36555competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final okhttp3.graveside f36556dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<dern.attabal> f36557marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final okhttp3.marial.attabal f36558saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<beachfront.attabal> f36559wireman;

    /* JADX INFO: compiled from: Retrofit.java */
    public class attabal implements InvocationHandler {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Class f36561dern;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final adultoid f36560attabal = adultoid.beachfront();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Object[] f36562saneness = new Object[0];

        public attabal(Class cls) {
            this.f36561dern = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f36562saneness;
            }
            return this.f36560attabal.impromptu(method) ? this.f36560attabal.competently(method, this.f36561dern, obj, objArr) : preprohormone.this.dern(method).attabal(objArr);
        }
    }

    public preprohormone(okhttp3.marial.attabal attabalVar, okhttp3.graveside gravesideVar, List<beachfront.attabal> list, List<dern.attabal> list2, @Nullable Executor executor, boolean z) {
        this.f36558saneness = attabalVar;
        this.f36556dern = gravesideVar;
        this.f36559wireman = list;
        this.f36557marial = list2;
        this.f36554beachfront = executor;
        this.f36555competently = z;
    }

    public dern<?, ?> attabal(Type type, Annotation[] annotationArr) {
        return wireman(null, type, annotationArr);
    }

    public <T> beachfront<okhttp3.stratoscope, T> beachfront(@Nullable beachfront.attabal attabalVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f36559wireman.indexOf(attabalVar) + 1;
        int size = this.f36559wireman.size();
        for (int i = iIndexOf; i < size; i++) {
            beachfront<okhttp3.stratoscope, T> beachfrontVar = (beachfront<okhttp3.stratoscope, T>) this.f36559wireman.get(i).wireman(type, annotationArr, this);
            if (beachfrontVar != null) {
                return beachfrontVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (attabalVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f36559wireman.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36559wireman.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f36559wireman.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> beachfront<T, okhttp3.cord> competently(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return marial(null, type, annotationArr, annotationArr2);
    }

    public final void cutely(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f36555competently) {
            adultoid adultoidVarBeachfront = adultoid.beachfront();
            for (Method method : cls.getDeclaredMethods()) {
                if (!adultoidVarBeachfront.impromptu(method) && !Modifier.isStatic(method.getModifiers())) {
                    dern(method);
                }
            }
        }
    }

    public cord<?> dern(Method method) {
        cord<?> cordVarSaneness;
        cord<?> cordVar = this.f36553attabal.get(method);
        if (cordVar != null) {
            return cordVar;
        }
        synchronized (this.f36553attabal) {
            try {
                cordVarSaneness = this.f36553attabal.get(method);
                if (cordVarSaneness == null) {
                    cordVarSaneness = cord.saneness(this, method);
                    this.f36553attabal.put(method, cordVarSaneness);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cordVarSaneness;
    }

    public <T> beachfront<okhttp3.stratoscope, T> impromptu(Type type, Annotation[] annotationArr) {
        return beachfront(null, type, annotationArr);
    }

    public <T> beachfront<T, okhttp3.cord> marial(@Nullable beachfront.attabal attabalVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f36559wireman.indexOf(attabalVar) + 1;
        int size = this.f36559wireman.size();
        for (int i = iIndexOf; i < size; i++) {
            beachfront<T, okhttp3.cord> beachfrontVar = (beachfront<T, okhttp3.cord>) this.f36559wireman.get(i).dern(type, annotationArr, annotationArr2, this);
            if (beachfrontVar != null) {
                return beachfrontVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (attabalVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f36559wireman.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36559wireman.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f36559wireman.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> T saneness(Class<T> cls) {
        cutely(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new attabal(cls));
    }

    public <T> beachfront<T, String> taiyuan(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f36559wireman.size();
        for (int i = 0; i < size; i++) {
            beachfront<T, String> beachfrontVar = (beachfront<T, String>) this.f36559wireman.get(i).marial(type, annotationArr, this);
            if (beachfrontVar != null) {
                return beachfrontVar;
            }
        }
        return retrofit2.attabal.wireman.f36457attabal;
    }

    public dern<?, ?> wireman(@Nullable dern.attabal attabalVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f36557marial.indexOf(attabalVar) + 1;
        int size = this.f36557marial.size();
        for (int i = iIndexOf; i < size; i++) {
            dern<?, ?> dernVarAttabal = this.f36557marial.get(i).attabal(type, annotationArr, this);
            if (dernVarAttabal != null) {
                return dernVarAttabal;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (attabalVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f36557marial.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f36557marial.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f36557marial.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: compiled from: Retrofit.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final adultoid f36564attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        @Nullable
        public Executor f36565beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public boolean f36566competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public okhttp3.graveside f36567dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final List<dern.attabal> f36568marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public okhttp3.marial.attabal f36569saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<beachfront.attabal> f36570wireman;

        public saneness(adultoid adultoidVar) {
            this.f36570wireman = new ArrayList();
            this.f36568marial = new ArrayList();
            this.f36564attabal = adultoidVar;
        }

        public saneness attabal(dern.attabal attabalVar) {
            List<dern.attabal> list = this.f36568marial;
            Objects.requireNonNull(attabalVar, "factory == null");
            list.add(attabalVar);
            return this;
        }

        public saneness beachfront(okhttp3.marial.attabal attabalVar) {
            Objects.requireNonNull(attabalVar, "factory == null");
            this.f36569saneness = attabalVar;
            return this;
        }

        public saneness competently(okhttp3.rotuma rotumaVar) {
            Objects.requireNonNull(rotumaVar, "client == null");
            return beachfront(rotumaVar);
        }

        public saneness dern(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return wireman(okhttp3.graveside.impromptu(str));
        }

        public preprohormone marial() {
            if (this.f36567dern == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.marial.attabal rotumaVar = this.f36569saneness;
            if (rotumaVar == null) {
                rotumaVar = new okhttp3.rotuma();
            }
            okhttp3.marial.attabal attabalVar = rotumaVar;
            Executor executorSaneness = this.f36565beachfront;
            if (executorSaneness == null) {
                executorSaneness = this.f36564attabal.saneness();
            }
            Executor executor = executorSaneness;
            ArrayList arrayList = new ArrayList(this.f36568marial);
            arrayList.addAll(this.f36564attabal.attabal(executor));
            ArrayList arrayList2 = new ArrayList(this.f36570wireman.size() + 1 + this.f36564attabal.wireman());
            arrayList2.add(new retrofit2.attabal());
            arrayList2.addAll(this.f36570wireman);
            arrayList2.addAll(this.f36564attabal.dern());
            return new preprohormone(attabalVar, this.f36567dern, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f36566competently);
        }

        public saneness saneness(beachfront.attabal attabalVar) {
            List<beachfront.attabal> list = this.f36570wireman;
            Objects.requireNonNull(attabalVar, "factory == null");
            list.add(attabalVar);
            return this;
        }

        public saneness wireman(okhttp3.graveside gravesideVar) {
            Objects.requireNonNull(gravesideVar, "baseUrl == null");
            List<String> listTriweekly = gravesideVar.triweekly();
            if ("".equals(listTriweekly.get(listTriweekly.size() - 1))) {
                this.f36567dern = gravesideVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + gravesideVar);
        }

        public saneness() {
            this(adultoid.beachfront());
        }
    }
}
