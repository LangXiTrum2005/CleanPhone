package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.p004ironsource.ko;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47471i;
    public final T j;
    public Executor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47472l = MBInterstitialActivity.WEB_LOAD_TIME;
    public final Map<String, Set<String>> m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f47473n;

    public c(int i2, T t, boolean z2, Context context) {
        this.f47471i = i2;
        this.j = t;
        this.f47473n = z2;
        a("BIGO-Ad-Request-Id", String.valueOf(i2));
        a(Command.HTTP_HEADER_USER_AGENT, sg.bigo.ads.common.aa.c.c(context));
    }

    private Set<String> b(String str) {
        Set<String> set = this.m.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.m.put(str, hashSet);
        return hashSet;
    }

    public String a() {
        return ko.f25534a;
    }

    public byte[] c() {
        return null;
    }

    public String d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public boolean f() {
        return false;
    }

    public final String g() {
        return this.j.a();
    }

    public void h() {
    }

    public final void a(String str) {
        b(str).clear();
    }

    public f b() {
        return null;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b(str).add(str2);
    }
}
