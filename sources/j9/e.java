package j9;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f43728a;

    public e(Status status) {
        int i10 = status.f11654a;
        String str = status.f11655b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + String.valueOf(str).length());
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f43728a = status;
    }
}
