package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p002kotlin.Unit;

/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends retrofit2.beachfront.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f36451attabal = true;

    /* JADX INFO: renamed from: retrofit2.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class C0785attabal implements retrofit2.beachfront<okhttp3.stratoscope, okhttp3.stratoscope> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0785attabal f36452attabal = new C0785attabal();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public okhttp3.stratoscope convert(okhttp3.stratoscope stratoscopeVar) throws IOException {
            try {
                return trm.attabal(stratoscopeVar);
            } finally {
                stratoscopeVar.close();
            }
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class beachfront implements retrofit2.beachfront<okhttp3.stratoscope, Void> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final beachfront f36453attabal = new beachfront();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Void convert(okhttp3.stratoscope stratoscopeVar) {
            stratoscopeVar.close();
            return null;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class marial implements retrofit2.beachfront<okhttp3.stratoscope, Unit> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final marial f36455attabal = new marial();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Unit convert(okhttp3.stratoscope stratoscopeVar) {
            stratoscopeVar.close();
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class wireman implements retrofit2.beachfront<Object, String> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f36457attabal = new wireman();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    @Override // retrofit2.beachfront.attabal
    @Nullable
    public retrofit2.beachfront<?, okhttp3.cord> dern(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, preprohormone preprohormoneVar) {
        if (okhttp3.cord.class.isAssignableFrom(trm.impromptu(type))) {
            return saneness.f36456attabal;
        }
        return null;
    }

    @Override // retrofit2.beachfront.attabal
    @Nullable
    public retrofit2.beachfront<okhttp3.stratoscope, ?> wireman(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
        if (type == okhttp3.stratoscope.class) {
            return trm.formularize(annotationArr, observability.gintrap.class) ? dern.f36454attabal : C0785attabal.f36452attabal;
        }
        if (type == Void.class) {
            return beachfront.f36453attabal;
        }
        if (!this.f36451attabal || type != Unit.class) {
            return null;
        }
        try {
            return marial.f36455attabal;
        } catch (NoClassDefFoundError unused) {
            this.f36451attabal = false;
            return null;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class dern implements retrofit2.beachfront<okhttp3.stratoscope, okhttp3.stratoscope> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f36454attabal = new dern();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public okhttp3.stratoscope convert(okhttp3.stratoscope stratoscopeVar) {
            return stratoscopeVar;
        }
    }

    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class saneness implements retrofit2.beachfront<okhttp3.cord, okhttp3.cord> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f36456attabal = new saneness();

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public okhttp3.cord convert(okhttp3.cord cordVar) {
            return cordVar;
        }
    }
}
