package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C0274c1 implements Parcelable {
    public static final Parcelable.Creator<C0274c1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f28328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f28329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f28330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f28331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f28332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f28333k;
    private Map<String, String> l;

    /* JADX INFO: renamed from: com.ironsource.c1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Parcelable.Creator<C0274c1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0274c1 createFromParcel(Parcel parcel) {
            return new C0274c1(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0274c1[] newArray(int i10) {
            return new C0274c1[i10];
        }
    }

    public /* synthetic */ C0274c1(Parcel parcel, int i10) {
        this(parcel);
    }

    private void i() {
        this.f28326d = false;
        this.f28327e = -1;
        this.f28328f = new ArrayList<>();
        this.f28329g = new ArrayList<>();
        this.f28330h = new ArrayList<>();
        this.f28331i = new ArrayList<>();
        this.f28333k = "";
        this.f28332j = "";
        this.l = new HashMap();
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f28329g.remove(str);
        } else if (this.f28329g.indexOf(str) == -1) {
            this.f28329g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f28329g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f28331i.indexOf(str) > -1;
    }

    public String d() {
        return this.f28332j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.l;
    }

    public String f() {
        return this.f28333k;
    }

    public void g(String str) {
        this.f28332j = str;
    }

    public void h(String str) {
        this.f28333k = str;
    }

    public boolean j() {
        return this.f28326d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f28326d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f28327e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f28328f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f28329g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f28332j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f28333k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f28326d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f28327e);
            parcel.writeString(this.f28323a);
            parcel.writeString(this.f28324b);
            parcel.writeString(this.f28325c);
            parcel.writeString(this.f28332j);
            parcel.writeString(this.f28333k);
            parcel.writeString(new JSONObject(this.l).toString());
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
        }
    }

    public C0274c1() {
        i();
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f28328f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f28330h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f28325c = str;
    }

    public String g() {
        return this.f28323a;
    }

    public String h() {
        return this.f28324b;
    }

    public void j(String str) {
        this.f28324b = str;
    }

    public String b() {
        return this.f28325c;
    }

    public int c() {
        return this.f28327e;
    }

    private C0274c1(Parcel parcel) {
        i();
        try {
            this.f28326d = parcel.readByte() != 0;
            this.f28327e = parcel.readInt();
            this.f28323a = parcel.readString();
            this.f28324b = parcel.readString();
            this.f28325c = parcel.readString();
            this.f28332j = parcel.readString();
            this.f28333k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            i();
        }
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28331i.indexOf(str) == -1) {
                this.f28331i.add(str);
                return;
            }
            return;
        }
        this.f28331i.remove(str);
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28328f.indexOf(str) == -1) {
                this.f28328f.add(str);
                return;
            }
            return;
        }
        this.f28328f.remove(str);
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f28330h.indexOf(str) == -1) {
                this.f28330h.add(str);
                return;
            }
            return;
        }
        this.f28330h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(boolean z10) {
        this.f28326d = z10;
    }

    public void a(int i10) {
        this.f28327e = i10;
    }

    public void a() {
        this.f28327e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    public void i(String str) {
        this.f28323a = str;
    }
}
