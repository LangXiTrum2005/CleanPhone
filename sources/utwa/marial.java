package utwa;

import com.airbnb.lottie.saran;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: LogcatLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements saran {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Set<String> f39265attabal = new HashSet();

    @Override // com.airbnb.lottie.saran
    public void attabal(String str) {
        saneness(str, null);
    }

    @Override // com.airbnb.lottie.saran
    public void debug(String str) {
        dern(str, null);
    }

    public void dern(String str, Throwable th) {
        boolean z = com.airbnb.lottie.wireman.f16278attabal;
    }

    @Override // com.airbnb.lottie.saran
    public void error(String str, Throwable th) {
        boolean z = com.airbnb.lottie.wireman.f16278attabal;
    }

    @Override // com.airbnb.lottie.saran
    public void saneness(String str, Throwable th) {
        Set<String> set = f39265attabal;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }
}
