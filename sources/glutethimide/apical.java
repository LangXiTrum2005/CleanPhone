package glutethimide;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LazyHeaders.java */
/* JADX INFO: loaded from: classes2.dex */
public final class apical implements taiyuan {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, List<cutely>> f27202dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile Map<String, String> f27203wireman;

    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class attabal {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final Map<String, List<cutely>> f27204marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final String f27205wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f27206attabal = true;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Map<String, List<cutely>> f27208saneness = f27204marial;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f27207dern = true;

        static {
            String strSaneness = saneness();
            f27205wireman = strSaneness;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strSaneness)) {
                map.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new saneness(strSaneness)));
            }
            f27204marial = Collections.unmodifiableMap(map);
        }

        public static String saneness() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public apical attabal() {
            this.f27206attabal = true;
            return new apical(this.f27208saneness);
        }
    }

    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class saneness implements cutely {
        private final String value;

        public saneness(String str) {
            this.value = str;
        }

        @Override // glutethimide.cutely
        public String attabal() {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (obj instanceof saneness) {
                return this.value.equals(((saneness) obj).value);
            }
            return false;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.value + "'}";
        }
    }

    public apical(Map<String, List<cutely>> map) {
        this.f27202dern = Collections.unmodifiableMap(map);
    }

    @Override // glutethimide.taiyuan
    public Map<String, String> attabal() {
        if (this.f27203wireman == null) {
            synchronized (this) {
                try {
                    if (this.f27203wireman == null) {
                        this.f27203wireman = Collections.unmodifiableMap(dern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f27203wireman;
    }

    public final Map<String, String> dern() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<cutely>> entry : this.f27202dern.entrySet()) {
            String strSaneness = saneness(entry.getValue());
            if (!TextUtils.isEmpty(strSaneness)) {
                map.put(entry.getKey(), strSaneness);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof apical) {
            return this.f27202dern.equals(((apical) obj).f27202dern);
        }
        return false;
    }

    public int hashCode() {
        return this.f27202dern.hashCode();
    }

    public final String saneness(List<cutely> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strAttabal = list.get(i).attabal();
            if (!TextUtils.isEmpty(strAttabal)) {
                sb.append(strAttabal);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f27202dern + '}';
    }
}
