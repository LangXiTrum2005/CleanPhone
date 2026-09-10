package sg.bigo.ads.core.player.a;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes7.dex */
final class b {
    private static final Pattern d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f48742e = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48745c;

    private b(String str) {
        m.a(str);
        Matcher matcher = d.matcher(str);
        long j = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
        this.f48744b = Math.max(0L, j);
        this.f48745c = j >= 0;
        Matcher matcher2 = f48742e.matcher(str);
        this.f48743a = matcher2.find() ? matcher2.group(1) : new String();
    }

    public static b a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "GetRequest stringRequest=" + sb.toString());
                    return new b(sb.toString());
                }
                sb.append(line);
                sb.append('\n');
            }
        } catch (IOException e2) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "GetRequest#read, error message is : " + e2.toString());
            return null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetRequest{rangeOffset=");
        sb.append(this.f48744b);
        sb.append(", partial=");
        sb.append(this.f48745c);
        sb.append(", uri='");
        return android.support.v4.media.a.r(sb, this.f48743a, "'}");
    }
}
