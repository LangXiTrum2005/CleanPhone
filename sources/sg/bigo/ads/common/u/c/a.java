package sg.bigo.ads.common.u.c;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.common.utils.h;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f47478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<List<String>> f47479c;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Closeable f47480e;

    public a(int i2, int i3, InputStream inputStream, h<List<String>> hVar, Closeable closeable) {
        this.d = i2;
        this.f47477a = i3;
        this.f47478b = inputStream;
        this.f47479c = hVar;
        this.f47480e = closeable;
    }

    public final long a() {
        String strA = a("Content-Length");
        if (!q.b((CharSequence) strA)) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String a(String str) {
        List<String> listA;
        if (!TextUtils.isEmpty(str) && (listA = this.f47479c.a(str)) != null && !listA.isEmpty()) {
            for (String str2 : listA) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }
}
