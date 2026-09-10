package ads_mobile_sdk;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class w02 {
    public final String a;
    public final String b;

    public w02(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static w02 a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new w02(str, str2);
    }
}
