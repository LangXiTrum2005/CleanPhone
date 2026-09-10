package nb;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f46653g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f46654h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f46658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46660f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f46655a = str;
        this.f46656b = str2;
        this.f46657c = str3;
        this.f46658d = date;
        this.f46659e = j10;
        this.f46660f = j11;
    }

    public final qb.a a() {
        qb.a aVar = new qb.a();
        aVar.f48915a = "frc";
        aVar.f48926m = this.f46658d.getTime();
        aVar.f48916b = this.f46655a;
        aVar.f48917c = this.f46656b;
        String str = this.f46657c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f48918d = str;
        aVar.f48919e = this.f46659e;
        aVar.f48924j = this.f46660f;
        return aVar;
    }
}
