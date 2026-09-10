package lehua;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: EventInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class taiyuan {

    /* JADX INFO: compiled from: EventInternal.java */
    public static abstract class attabal {
        public abstract attabal apical(byte[] bArr);

        public final attabal attabal(String str, int i) {
            marial().put(str, String.valueOf(i));
            return this;
        }

        public abstract attabal beachfront(Map<String, String> map);

        public abstract attabal competently(Integer num);

        public abstract attabal cutely(byte[] bArr);

        public final attabal dern(String str, String str2) {
            marial().put(str, str2);
            return this;
        }

        public abstract attabal formularize(Integer num);

        public abstract attabal impassible(String str);

        public abstract attabal impromptu(impromptu impromptuVar);

        public abstract attabal kowloon(long j);

        public abstract Map<String, String> marial();

        public final attabal saneness(String str, long j) {
            marial().put(str, String.valueOf(j));
            return this;
        }

        public abstract attabal taiyuan(long j);

        public abstract attabal triweekly(String str);

        public abstract taiyuan wireman();
    }

    public static attabal attabal() {
        return new saneness.C0717saneness().beachfront(new HashMap());
    }

    public final Map<String, String> apical() {
        return Collections.unmodifiableMap(dern());
    }

    public attabal arytenoidectomy() {
        return new saneness.C0717saneness().triweekly(triweekly()).competently(wireman()).formularize(formularize()).impassible(impassible()).cutely(competently()).apical(impromptu()).impromptu(marial()).taiyuan(beachfront()).kowloon(kowloon()).beachfront(new HashMap(dern()));
    }

    public abstract long beachfront();

    public abstract byte[] competently();

    public final long cutely(String str) {
        String str2 = dern().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public abstract Map<String, String> dern();

    public abstract Integer formularize();

    public abstract String impassible();

    public abstract byte[] impromptu();

    public abstract long kowloon();

    public abstract impromptu marial();

    public final String saneness(String str) {
        String str2 = dern().get(str);
        return str2 == null ? "" : str2;
    }

    public final int taiyuan(String str) {
        String str2 = dern().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String triweekly();

    public abstract Integer wireman();
}
