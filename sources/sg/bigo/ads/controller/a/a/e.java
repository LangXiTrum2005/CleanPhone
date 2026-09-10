package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.webkit.URLUtil;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f47777a = r.d.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f47778b = r.f47536b.a(30);
    private long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47780h;
    private List<a> f = c();
    private long d = f47777a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47779e = f47778b;

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final k a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                if (sg.bigo.ads.common.utils.k.a((Collection) this.f) || ((aVarA = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 == null || !aVar2.d || aVar2.f47873b) ? 0 : 1;
                    }
                }))) == null && (aVarA = g.a((List<a>) sg.bigo.ads.common.utils.k.a(this.f, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.e.2
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
                        a aVar2 = aVar;
                        return (aVar2 != null && aVar2.d && aVar2.f47873b) ? 1 : 0;
                    }
                }))) == null)) {
                    return null;
                }
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        this.g = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.f)) {
                    Iterator<a> it = this.f.iterator();
                    while (it.hasNext()) {
                        it.next().d = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.d);
            parcel.writeLong(this.f47779e);
            n.a(parcel, this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(this.f47780h);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        synchronized (this) {
            try {
                this.d = n.a(parcel, f47777a);
                this.f47779e = n.a(parcel, f47778b);
                List<a> listA = n.a(parcel, a.f47756c);
                this.f = listA;
                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                    this.f = c();
                }
                this.g = n.a(parcel, 0L);
                this.f47780h = n.a(parcel, 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            try {
                long jOptLong = jSONObject.optLong("suc_interval", f47777a / 1000) * 1000;
                long j = g.f47793c;
                long jMax = Math.max(jOptLong, j);
                long jMax2 = Math.max(jSONObject.optLong("fail_interval", f47778b / 1000) * 1000, j);
                List<a> listC = c();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        String strOptString = jSONObjectOptJSONObject.optString("name", "");
                        String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                        if (URLUtil.isNetworkUrl(strOptString2)) {
                            listC.add(new a(strOptString, strOptString2, false));
                        }
                    }
                }
                this.d = jMax;
                this.f47779e = jMax2;
                this.f = listC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f47780h = System.currentTimeMillis();
        }
    }

    public final boolean a() {
        long j = this.g;
        long j2 = this.f47780h;
        if (j == j2) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > j2) {
            return Math.abs(jCurrentTimeMillis - this.g) > this.f47779e;
        }
        return Math.abs(jCurrentTimeMillis - this.f47780h) > this.d;
    }
}
