package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class LocusIdCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f4255b;

    public static class Api29Impl {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public LocusIdCompat(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f4254a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4255b = Api29Impl.a(str);
        } else {
            this.f4255b = null;
        }
    }

    public static LocusIdCompat a(LocusId locusId) {
        String strB = Api29Impl.b(locusId);
        if (TextUtils.isEmpty(strB)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new LocusIdCompat(strB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        String str = ((LocusIdCompat) obj).f4254a;
        String str2 = this.f4254a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f4254a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f4254a.length() + "_chars");
        sb.append(d9.i.f24752e);
        return sb.toString();
    }
}
