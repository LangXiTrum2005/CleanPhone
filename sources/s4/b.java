package s4;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f50100d = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50103c;

    public b(String str, String str2, int i10) {
        this.f50103c = i10;
        this.f50101a = str;
        this.f50102b = str2;
        f50100d.add(this);
    }

    public boolean a() {
        HashSet hashSet = a.f50099a;
        String str = this.f50102b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
