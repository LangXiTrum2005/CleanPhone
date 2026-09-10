package fc;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import java.io.File;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40767a;

    public /* synthetic */ b(int i10) {
        this.f40767a = i10;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40767a) {
            case 0:
                return ((File) obj).exists();
            case 1:
                return ((io.flutter.view.f) obj).g(19);
            case 2:
                return ((Integer) obj).intValue() != 0;
            case 3:
                return ((ApplicationExitInfo) obj).getReason() == 6;
            default:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
        }
    }
}
