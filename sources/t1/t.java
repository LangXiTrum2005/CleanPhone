package t1;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f50411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f50412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f50413c;

    public String a(String str, long j10, int i10, long j11) {
        ArrayList arrayList = this.f50411a;
        ArrayList arrayList2 = this.f50413c;
        ArrayList arrayList3 = this.f50412b;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }
}
