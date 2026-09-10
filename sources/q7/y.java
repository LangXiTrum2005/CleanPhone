package q7;

import android.util.Log;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet f48796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48797b;

    public /* synthetic */ y(int i10) {
        this.f48797b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #1 {all -> 0x000f, blocks: (B:5:0x0004, B:7:0x0008, B:20:0x0029, B:22:0x002d, B:24:0x0033, B:25:0x0035, B:27:0x0039, B:29:0x0047, B:36:0x0057, B:35:0x0054, B:12:0x0011, B:19:0x0027, B:18:0x0023, B:15:0x001d), top: B:43:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX WARN: Code duplicated, block: B:41:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void a(boolean z10) {
        z zVar;
        TreeSet treeSetG;
        if (z10) {
            zVar = z.f48798a;
            if (v7.a.b(z.class)) {
                treeSetG = null;
                this.f48796a = treeSetG;
            } else {
                treeSetG = zVar.g(this);
                this.f48796a = treeSetG;
            }
        } else {
            try {
                TreeSet treeSet = this.f48796a;
                if (treeSet == null || treeSet.isEmpty()) {
                    zVar = z.f48798a;
                    if (v7.a.b(z.class)) {
                        treeSetG = null;
                        this.f48796a = treeSetG;
                    } else {
                        try {
                            treeSetG = zVar.g(this);
                        } catch (Throwable th2) {
                            v7.a.a(z.class, th2);
                            treeSetG = null;
                        }
                        this.f48796a = treeSetG;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        TreeSet treeSet2 = this.f48796a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            switch (this.f48797b) {
                case 2:
                    if (l7.s.b().getApplicationInfo().targetSdkVersion >= 30) {
                        Log.w(v7.a.b(z.class) ? null : "q7.z", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    }
                    break;
                default:
                    break;
            }
            throw th3;
        }
    }

    public final String b() {
        switch (this.f48797b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return RemoteServiceWrapper.RECEIVER_SERVICE_PACKAGE;
            case 3:
                return "com.facebook.orca";
            default:
                return RemoteServiceWrapper.RECEIVER_SERVICE_PACKAGE_WAKIZASHI;
        }
    }

    public final void c() {
    }
}
