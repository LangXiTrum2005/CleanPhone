package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class triweekly<T> {

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class apical<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36578attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36579dern;
        private final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36580saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f36581wireman;

        public apical(Method method, int i, String str, retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            this.f36578attabal = method;
            this.f36580saneness = i;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.f36579dern = beachfrontVar;
            this.f36581wireman = z;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException {
            if (t != null) {
                dovishnessVar.beachfront(this.name, this.f36579dern.convert(t), this.f36581wireman);
                return;
            }
            throw trm.kowloon(this.f36578attabal, this.f36580saneness, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class arytenoidectomy extends triweekly<Object> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36582attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36583saneness;

        public arytenoidectomy(Method method, int i) {
            this.f36582attabal = method;
            this.f36583saneness = i;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable Object obj) {
            if (obj == null) {
                throw trm.kowloon(this.f36582attabal, this.f36583saneness, "@Url parameter is null.", new Object[0]);
            }
            dovishnessVar.impassible(obj);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public class attabal extends triweekly<Iterable<T>> {
        public attabal() {
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                triweekly.this.attabal(dovishnessVar, it.next());
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class beachfront<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36585attabal;
        private final String name;

        public beachfront(String str, retrofit2.beachfront<T, String> beachfrontVar) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.f36585attabal = beachfrontVar;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f36585attabal.convert(t)) == null) {
                return;
            }
            dovishnessVar.saneness(this.name, strConvert);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class competently<T> extends triweekly<Map<String, T>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36586attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36587dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36588saneness;

        public competently(Method method, int i, retrofit2.beachfront<T, String> beachfrontVar) {
            this.f36586attabal = method;
            this.f36588saneness = i;
            this.f36587dern = beachfrontVar;
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw trm.kowloon(this.f36586attabal, this.f36588saneness, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw trm.kowloon(this.f36586attabal, this.f36588saneness, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw trm.kowloon(this.f36586attabal, this.f36588saneness, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                dovishnessVar.saneness(key, this.f36587dern.convert(value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class cutely<T> extends triweekly<Map<String, T>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36589attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, okhttp3.cord> f36590dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36591saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final String f36592wireman;

        public cutely(Method method, int i, retrofit2.beachfront<T, okhttp3.cord> beachfrontVar, String str) {
            this.f36589attabal = method;
            this.f36591saneness = i;
            this.f36590dern = beachfrontVar;
            this.f36592wireman = str;
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw trm.kowloon(this.f36589attabal, this.f36591saneness, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw trm.kowloon(this.f36589attabal, this.f36591saneness, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw trm.kowloon(this.f36589attabal, this.f36591saneness, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                dovishnessVar.wireman(okhttp3.molybdenite.beachfront("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f36592wireman), this.f36590dern.convert(value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class dern<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36593attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, okhttp3.cord> f36594dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36595saneness;

        public dern(Method method, int i, retrofit2.beachfront<T, okhttp3.cord> beachfrontVar) {
            this.f36593attabal = method;
            this.f36595saneness = i;
            this.f36594dern = beachfrontVar;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) {
            if (t == null) {
                throw trm.kowloon(this.f36593attabal, this.f36595saneness, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                dovishnessVar.formularize(this.f36594dern.convert(t));
            } catch (IOException e) {
                throw trm.arytenoidectomy(this.f36593attabal, e, this.f36595saneness, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class formularize<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36596attabal;
        private final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f36597saneness;

        public formularize(String str, retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.f36596attabal = beachfrontVar;
            this.f36597saneness = z;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f36596attabal.convert(t)) == null) {
                return;
            }
            dovishnessVar.competently(this.name, strConvert, this.f36597saneness);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class impassible<T> extends triweekly<Map<String, T>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36598attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36599dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36600saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f36601wireman;

        public impassible(Method method, int i, retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            this.f36598attabal = method;
            this.f36600saneness = i;
            this.f36599dern = beachfrontVar;
            this.f36601wireman = z;
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw trm.kowloon(this.f36598attabal, this.f36600saneness, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw trm.kowloon(this.f36598attabal, this.f36600saneness, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw trm.kowloon(this.f36598attabal, this.f36600saneness, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f36599dern.convert(value);
                if (strConvert == null) {
                    throw trm.kowloon(this.f36598attabal, this.f36600saneness, "Query map value '" + value + "' converted to null by " + this.f36599dern.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                dovishnessVar.competently(key, strConvert, this.f36601wireman);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class impromptu extends triweekly<okhttp3.molybdenite> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36602attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36603saneness;

        public impromptu(Method method, int i) {
            this.f36602attabal = method;
            this.f36603saneness = i;
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable okhttp3.molybdenite molybdeniteVar) {
            if (molybdeniteVar == null) {
                throw trm.kowloon(this.f36602attabal, this.f36603saneness, "Headers parameter must not be null.", new Object[0]);
            }
            dovishnessVar.dern(molybdeniteVar);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class kowloon extends triweekly<okhttp3.gintrap.dern> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final kowloon f36604attabal = new kowloon();

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable okhttp3.gintrap.dern dernVar) {
            if (dernVar != null) {
                dovishnessVar.marial(dernVar);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class marial<T> extends triweekly<Map<String, T>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36605attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36606dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36607saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f36608wireman;

        public marial(Method method, int i, retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            this.f36605attabal = method;
            this.f36607saneness = i;
            this.f36606dern = beachfrontVar;
            this.f36608wireman = z;
        }

        @Override // retrofit2.triweekly
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void attabal(dovishness dovishnessVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw trm.kowloon(this.f36605attabal, this.f36607saneness, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw trm.kowloon(this.f36605attabal, this.f36607saneness, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw trm.kowloon(this.f36605attabal, this.f36607saneness, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f36606dern.convert(value);
                if (strConvert == null) {
                    throw trm.kowloon(this.f36605attabal, this.f36607saneness, "Field map value '" + value + "' converted to null by " + this.f36606dern.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                dovishnessVar.attabal(key, strConvert, this.f36608wireman);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class monoploid<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<T> f36609attabal;

        public monoploid(Class<T> cls) {
            this.f36609attabal = cls;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) {
            dovishnessVar.impromptu(this.f36609attabal, t);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public class saneness extends triweekly<Object> {
        public saneness() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                triweekly.this.attabal(dovishnessVar, Array.get(obj, i));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class taiyuan<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f36611attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final okhttp3.molybdenite f36612dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36613saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final retrofit2.beachfront<T, okhttp3.cord> f36614wireman;

        public taiyuan(Method method, int i, okhttp3.molybdenite molybdeniteVar, retrofit2.beachfront<T, okhttp3.cord> beachfrontVar) {
            this.f36611attabal = method;
            this.f36613saneness = i;
            this.f36612dern = molybdeniteVar;
            this.f36614wireman = beachfrontVar;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                dovishnessVar.wireman(this.f36612dern, this.f36614wireman.convert(t));
            } catch (IOException e) {
                throw trm.kowloon(this.f36611attabal, this.f36613saneness, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.triweekly$triweekly, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class C0787triweekly<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36615attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f36616saneness;

        public C0787triweekly(retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            this.f36615attabal = beachfrontVar;
            this.f36616saneness = z;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            dovishnessVar.competently(this.f36615attabal.convert(t), null, this.f36616saneness);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class wireman<T> extends triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final retrofit2.beachfront<T, String> f36617attabal;
        private final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f36618saneness;

        public wireman(String str, retrofit2.beachfront<T, String> beachfrontVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.f36617attabal = beachfrontVar;
            this.f36618saneness = z;
        }

        @Override // retrofit2.triweekly
        public void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f36617attabal.convert(t)) == null) {
                return;
            }
            dovishnessVar.attabal(this.name, strConvert, this.f36618saneness);
        }
    }

    public abstract void attabal(dovishness dovishnessVar, @Nullable T t) throws IOException;

    public final triweekly<Iterable<T>> dern() {
        return new attabal();
    }

    public final triweekly<Object> saneness() {
        return new saneness();
    }
}
