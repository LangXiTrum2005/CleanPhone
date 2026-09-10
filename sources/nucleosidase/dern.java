package nucleosidase;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: LogSourceMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f33973dern = new attabal().attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f33974attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<LogEventDropped> f33975saneness;

    /* JADX INFO: compiled from: LogSourceMetrics.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f33976attabal = "";

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<LogEventDropped> f33977saneness = new ArrayList();

        public dern attabal() {
            return new dern(this.f33976attabal, Collections.unmodifiableList(this.f33977saneness));
        }

        public attabal dern(String str) {
            this.f33976attabal = str;
            return this;
        }

        public attabal saneness(List<LogEventDropped> list) {
            this.f33977saneness = list;
            return this;
        }
    }

    public dern(String str, List<LogEventDropped> list) {
        this.f33974attabal = str;
        this.f33975saneness = list;
    }

    public static attabal dern() {
        return new attabal();
    }

    public List<LogEventDropped> attabal() {
        return this.f33975saneness;
    }

    public String saneness() {
        return this.f33974attabal;
    }
}
