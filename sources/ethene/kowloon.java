package ethene;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final AtomicLong f26034impromptu = new AtomicLong();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f26035attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f26036beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long f26037competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Uri f26038dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f26039marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final vir.competently f26040saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<String, List<String>> f26041wireman;

    public kowloon(long j, vir.competently competentlyVar, long j2) {
        this(j, competentlyVar, competentlyVar.f39544attabal, Collections.EMPTY_MAP, j2, 0L, 0L);
    }

    public static long attabal() {
        return f26034impromptu.getAndIncrement();
    }

    public kowloon(long j, vir.competently competentlyVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f26035attabal = j;
        this.f26040saneness = competentlyVar;
        this.f26038dern = uri;
        this.f26041wireman = map;
        this.f26039marial = j2;
        this.f26036beachfront = j3;
        this.f26037competently = j4;
    }
}
