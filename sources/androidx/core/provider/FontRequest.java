package androidx.core.provider;

import android.util.Base64;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4366c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4367e;

    public FontRequest(String str, String str2, String str3, List list) {
        str.getClass();
        this.f4364a = str;
        str2.getClass();
        this.f4365b = str2;
        this.f4366c = str3;
        list.getClass();
        this.d = list;
        this.f4367e = str + TokenBuilder.TOKEN_DELIMITER + str2 + TokenBuilder.TOKEN_DELIMITER + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4364a + ", mProviderPackage: " + this.f4365b + ", mQuery: " + this.f4366c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
