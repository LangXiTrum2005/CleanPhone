package zc;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f54887d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54890c;

    public w(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f54887d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(defpackage.e.o("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f54888a = strSubstring;
        this.f54889b = str;
        this.f54890c = wi.d.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f54888a.equals(wVar.f54888a) && this.f54889b.equals(wVar.f54889b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54889b, this.f54888a});
    }
}
