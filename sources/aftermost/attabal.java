package aftermost;

import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: DefaultLimiter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Laftermost/attabal;", "", "<init>", "()V", "", "", "", "attabal", "Ljava/util/Map;", "lastRequestTimeMap", "saneness", "lastShowTimeMap", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Long> lastRequestTimeMap = new LinkedHashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Long> lastShowTimeMap = new LinkedHashMap();
}
