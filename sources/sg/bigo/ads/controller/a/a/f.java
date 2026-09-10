package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.a.i;
import sg.bigo.ads.controller.a.k;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends g implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f47783a = r.f47537c.a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47785e;
    private List<a> d = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47784b = f47783a;

    public static class a extends sg.bigo.ads.controller.a.a.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<a> f47792e = new sg.bigo.ads.common.f.a<a>() { // from class: sg.bigo.ads.controller.a.a.f.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        };
        private String f;

        public a() {
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            super.b(parcel);
            this.f = n.a(parcel, "");
        }

        public a(String str, String str2, boolean z2, String str3) {
            super(str, str2, z2);
            this.f = str3;
        }

        @Override // sg.bigo.ads.controller.a.k, sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            super.a(parcel);
            parcel.writeString(this.f);
        }
    }

    private k b(final String str) {
        k kVarA;
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
                    a aVar = (a) g.a(sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.1
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 == null || !aVar3.d || aVar3.f47873b || !TextUtils.equals(aVar3.f, str)) ? 0 : 1;
                        }
                    }));
                    if (aVar != null) {
                        return aVar;
                    }
                    List listA = sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.2
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 != null && aVar3.d && aVar3.f47873b && TextUtils.equals(aVar3.f, str)) ? 1 : 0;
                        }
                    });
                    if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                        List listA2 = sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.3
                            @Override // java.lang.Comparable
                            public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                a aVar3 = aVar2;
                                return (aVar3 == null || !aVar3.d || aVar3.f47873b) ? 0 : 1;
                            }
                        });
                        if (sg.bigo.ads.common.utils.k.a((Collection) listA2)) {
                            kVarA = (a) g.a(sg.bigo.ads.common.utils.k.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.controller.a.a.f.4
                                @Override // java.lang.Comparable
                                public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                    a aVar3 = aVar2;
                                    return (aVar3 != null && aVar3.d && aVar3.f47873b) ? 1 : 0;
                                }
                            }));
                            if (kVarA != null) {
                            }
                        } else {
                            kVarA = g.a((List<k>) listA2);
                        }
                    } else {
                        kVarA = g.a((List<k>) listA);
                    }
                    return kVarA;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("AWS", "https://ad-host-backup-asia.oss-ap-southeast-1.aliyuncs.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new a("AWS", "https://ad-host-backup-europe.oss-eu-central-1.aliyuncs.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new a("AWS", "https://ad-host-backup-america.oss-us-west-1.aliyuncs.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.a.a.g
    public final k a(String str) {
        if (sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
            return null;
        }
        return b(i.a(str));
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f47784b);
            n.a(parcel, this.d);
            parcel.writeLong(this.f47785e);
        }
    }

    public final void b() {
        this.f47785e = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (!sg.bigo.ads.common.utils.k.a((Collection) this.d)) {
                    Iterator<a> it = this.d.iterator();
                    while (it.hasNext()) {
                        it.next().d = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            try {
                long jMax = Math.max(jSONObject.optLong("interval", f47783a / 1000) * 1000, g.f47793c);
                List<a> listC = c();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        String strOptString = jSONObjectOptJSONObject.optString("name", "");
                        String strOptString2 = jSONObjectOptJSONObject.optString("url", "");
                        String strOptString3 = jSONObjectOptJSONObject.optString(TtmlNode.TAG_REGION, "");
                        if (URLUtil.isNetworkUrl(strOptString2)) {
                            listC.add(new a(strOptString, strOptString2, false, strOptString3));
                        }
                    }
                }
                this.f47784b = jMax;
                this.d = listC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        synchronized (this) {
            try {
                this.f47784b = n.a(parcel, f47783a);
                List<a> listA = n.a(parcel, a.f47792e);
                this.d = listA;
                if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                    this.d = c();
                }
                this.f47785e = n.a(parcel, 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        return Math.abs(System.currentTimeMillis() - this.f47785e) > this.f47784b;
    }
}
