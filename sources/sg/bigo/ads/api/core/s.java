package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements sg.bigo.ads.api.a.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47065a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47066b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47067c = com.smartdigimkt.o1.b.D0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f47065a + "," + this.f47066b + "," + this.f47067c);
    }

    @Override // sg.bigo.ads.api.a.n
    public final long b() {
        return this.f47066b;
    }

    @Override // sg.bigo.ads.api.a.n
    public final long c() {
        return this.f47067c;
    }

    @Override // sg.bigo.ads.api.a.n
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f47065a = jSONObject.optInt("duration_on", 0);
            this.f47066b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.f47067c = jSONObject.optLong("suspend_limit", com.smartdigimkt.o1.b.D0);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 3) {
                this.f47065a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
                this.f47066b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 5000L);
                this.f47067c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], com.smartdigimkt.o1.b.D0);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final boolean a() {
        return this.f47065a == 1;
    }
}
