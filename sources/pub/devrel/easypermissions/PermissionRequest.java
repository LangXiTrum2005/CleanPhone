package pub.devrel.easypermissions;

import android.support.v4.media.a;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class PermissionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionHelper f45300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f45301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45302c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45303e;
    public final String f;
    public final int g = -1;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PermissionHelper f45304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f45306c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f45307e;
        public String f;

        public Builder(BaseAct baseAct, int i2, String... strArr) {
            this.f45304a = PermissionHelper.c(baseAct);
            this.f45305b = i2;
            this.f45306c = strArr;
        }
    }

    public PermissionRequest(PermissionHelper permissionHelper, String[] strArr, int i2, String str, String str2, String str3) {
        this.f45300a = permissionHelper;
        this.f45301b = (String[]) strArr.clone();
        this.f45302c = i2;
        this.d = str;
        this.f45303e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PermissionRequest.class != obj.getClass()) {
            return false;
        }
        PermissionRequest permissionRequest = (PermissionRequest) obj;
        return Arrays.equals(this.f45301b, permissionRequest.f45301b) && this.f45302c == permissionRequest.f45302c;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f45301b) * 31) + this.f45302c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequest{mHelper=");
        sb.append(this.f45300a);
        sb.append(", mPerms=");
        sb.append(Arrays.toString(this.f45301b));
        sb.append(", mRequestCode=");
        sb.append(this.f45302c);
        sb.append(", mRationale='");
        sb.append(this.d);
        sb.append("', mPositiveButtonText='");
        sb.append(this.f45303e);
        sb.append("', mNegativeButtonText='");
        sb.append(this.f);
        sb.append("', mTheme=");
        return a.p(sb, this.g, AbstractJsonLexerKt.END_OBJ);
    }
}
